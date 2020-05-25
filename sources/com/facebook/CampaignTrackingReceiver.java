package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import com.p683ss.android.ugc.aweme.keva.C35807d;

public final class CampaignTrackingReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        if (stringExtra != null && stringExtra.startsWith("fb")) {
            String stringExtra2 = intent.getStringExtra("referrer");
            SharedPreferences a = C35807d.m80935a(C14533n.m29773g(), "com.facebook.sdk.appEventPreferences", 0);
            if (stringExtra2 != null) {
                a.edit().putString("install_referrer", stringExtra2).apply();
            }
        }
    }
}
