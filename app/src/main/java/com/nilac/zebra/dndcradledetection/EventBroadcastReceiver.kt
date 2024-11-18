package com.nilac.zebra.dndcradledetection

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class EventBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if (Intent.ACTION_BOOT_COMPLETED == intent.action ||
            Intent.ACTION_LOCKED_BOOT_COMPLETED == intent.action
        ) {
            Log.d(TAG, "Starting EventBroadcastReceiver")

            context.startForegroundService(Intent(context, DNDToggleService::class.java))
        }
    }

    companion object {
        const val TAG = "EventBroadcastReceiver"
    }
}