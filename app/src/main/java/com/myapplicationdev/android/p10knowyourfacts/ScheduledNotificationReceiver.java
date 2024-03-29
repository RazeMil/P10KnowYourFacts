package com.myapplicationdev.android.p10knowyourfacts;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;


import androidx.core.app.NotificationCompat;

public class ScheduledNotificationReceiver extends BroadcastReceiver {
    int reqCode = 12345;
    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel channel = new
                    NotificationChannel("default", "Default Channel",
                    NotificationManager.IMPORTANCE_DEFAULT);

            channel.setDescription("This is for default notification");
            notificationManager.createNotificationChannel(channel);
        }


        Intent i = new Intent(context, MainActivity.class);
        PendingIntent pIntent = PendingIntent.getActivity(context, reqCode,
                        i, PendingIntent.FLAG_CANCEL_CURRENT);
        NotificationCompat.Builder builder = new
                NotificationCompat.Builder(context, "default");
        builder.setContentTitle("Reminder");
        builder.setContentText("Open the app");
        builder.setSmallIcon(android.R.drawable.btn_star_big_off);
        builder.setContentIntent(pIntent);
        builder.setAutoCancel(true);

        Notification n = builder.build();

        // This replaces the existing notification with the same ID
        notificationManager.notify(123, n);
      //  throw new UnsupportedOperationException("Not yet implemented");
    }
}
