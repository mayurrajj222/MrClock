package com.example.mrclock

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class DismissReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        // Logic to dismiss the alarm
        Toast.makeText(context, "Alarm dismissed", Toast.LENGTH_SHORT).show()

        // You can stop the alarm and cancel the notification here
    }
}
