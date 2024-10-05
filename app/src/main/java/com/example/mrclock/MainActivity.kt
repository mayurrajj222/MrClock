package com.example.mrclock

import android.app.AlarmManager
import android.app.PendingIntent
import android.app.TimePickerDialog
import android.content.Context
import android.content.Intent
import android.media.RingtoneManager
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var currentTime: TextView
    private lateinit var btnSetAlarm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views by their IDs
        currentTime = findViewById(R.id.currentTime)
        btnSetAlarm = findViewById(R.id.btnSetAlarm)

        // Display real-time clock on the screen
        updateCurrentTime()

        // Set Alarm Button Click Listener
        btnSetAlarm.setOnClickListener {
            openTimePicker()
        }
    }

    // Function to update current time every second
    private fun updateCurrentTime() {
        val handler = android.os.Handler()
        handler.post(object : Runnable {
            override fun run() {
                // Get the current time
                val sdf = SimpleDateFormat("hh:mm:ss a", Locale.getDefault())
                val time = sdf.format(Date())
                currentTime.text = time
                handler.postDelayed(this, 1000)  // Update every second
            }
        })
    }

    // Function to open TimePickerDialog for setting alarm
    private fun openTimePicker() {
        // Get current time
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)

        // Show TimePickerDialog
        TimePickerDialog(this, { _, selectedHour, selectedMinute ->
            setAlarm(selectedHour, selectedMinute)  // Set the alarm
        }, hour, minute, false).show()
    }

    // Function to set alarm using AlarmManager
    private fun setAlarm(hour: Int, minute: Int) {
        // Create an Intent for the AlarmReceiver
        val intent = Intent(this, AlarmReceiver::class.java)

        // Create a PendingIntent that will trigger the broadcast receiver
        val pendingIntent = PendingIntent.getBroadcast(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT)

        // Get the AlarmManager service
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        // Set the time for the alarm
        val calendar = Calendar.getInstance()
        calendar.set(Calendar.HOUR_OF_DAY, hour)
        calendar.set(Calendar.MINUTE, minute)
        calendar.set(Calendar.SECOND, 0)

        // Set the alarm with the exact time
        alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, pendingIntent)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            alarmManager.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, pendingIntent)
        } else {
            alarmManager.setExact(AlarmManager.RTC_WAKEUP, calendar.timeInMillis, pendingIntent)
        }

        // Show a message that the alarm has been set
        Toast.makeText(this, "Alarm set for $hour:$minute", Toast.LENGTH_SHORT).show()
    }

    // Handle result of alarm tone selection
    private fun pickAlarmTone() {
        val intent = Intent(RingtoneManager.ACTION_RINGTONE_PICKER).also {
            it.putExtra(RingtoneManager.EXTRA_RINGTONE_TYPE, RingtoneManager.TYPE_ALARM)
            it.putExtra(RingtoneManager.EXTRA_RINGTONE_TITLE, "Select Alarm Tone")
            it.putExtra(RingtoneManager.EXTRA_RINGTONE_SHOW_SILENT, false)
            startActivityForResult(it, 1)
        }
    }
    }

