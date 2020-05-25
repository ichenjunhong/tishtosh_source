package com.p683ss.android.ugc.trill.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p683ss.android.ugc.trill.abtest.C50295b;

/* renamed from: com.ss.android.ugc.trill.receiver.HomeWatcherReceiver */
public class HomeWatcherReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (TextUtils.equals(intent.getAction(), "android.intent.action.CLOSE_SYSTEM_DIALOGS")) {
            if ("homekey".equals(intent.getStringExtra("reason"))) {
                C50295b.m108561a().mo98203a("attract_user_without_login_home");
            }
        }
    }
}
