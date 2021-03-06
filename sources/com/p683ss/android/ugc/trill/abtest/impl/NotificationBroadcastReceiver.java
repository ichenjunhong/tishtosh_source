package com.p683ss.android.ugc.trill.abtest.impl;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.main.MainActivity;

/* renamed from: com.ss.android.ugc.trill.abtest.impl.NotificationBroadcastReceiver */
public class NotificationBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        int intExtra = intent.getIntExtra("type", -1);
        if (intExtra != -1) {
            ((NotificationManager) context.getSystemService("notification")).cancel(intExtra);
        }
        if (action.equals("notification_clicked")) {
            context.startActivity(MainActivity.getMainActivityIntent(context));
            C26890h.onEvent(MobClick.obtain().setLabelName("click").setEventName("recall_push"));
        }
        action.equals("notification_cancelled");
    }
}
