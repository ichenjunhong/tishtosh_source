package com.appsflyer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p683ss.android.ugc.aweme.keva.C35807d;

public class SingleInstallBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            try {
                str = intent.getStringExtra("referrer");
            } catch (Throwable th) {
                AFLogger.afErrorLog("error in BroadcastReceiver ", th);
                str = null;
            }
            if (str != null) {
                if (str.contains("AppsFlyer_Test") && intent.getStringExtra("TestIntegrationMode") != null) {
                    AppsFlyerLib.getInstance().mo6949(context, intent);
                    return;
                } else if (C35807d.m80935a(context, "appsflyer-data", 0).getString("referrer", null) != null) {
                    AppsFlyerLib.getInstance();
                    AppsFlyerLib.m7277(context, str);
                    return;
                }
            }
            String string = AppsFlyerProperties.getInstance().getString("referrer_timestamp");
            long currentTimeMillis = System.currentTimeMillis();
            if (string == null || currentTimeMillis - Long.valueOf(string).longValue() >= 2000) {
                AFLogger.afInfoLog("SingleInstallBroadcastReceiver called");
                AppsFlyerLib.getInstance().mo6949(context, intent);
                AppsFlyerProperties.getInstance().set("referrer_timestamp", String.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
