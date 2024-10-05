package com.example.mrclock

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class SnoozeReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        // Logic to snooze the alarm
        Toast.makeText(context, "Alarm snoozed for 5 minutes", Toast.LENGTH_SHORT).show()

        // You can reschedule the alarm for 5 minutes later here
    }
}
