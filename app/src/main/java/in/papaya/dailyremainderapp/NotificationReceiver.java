package in.papaya.dailyremainderapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class NotificationReceiver  extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        NotificationHelper notificationHelper = new NotificationHelper(context);
        notificationHelper.createNotification();

    }
}