package com.example.mrclock


import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        // Show a notification or toast when the alarm rings
        Toast.makeText(context, "Alarm ringing!", Toast.LENGTH_LONG).show()

        // Here you would trigger a notification with snooze/dismiss options
        NotificationHelper.showNotification(context)
    }
}
