package com.p683ss.android.push.window.oppo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.ss.android.push.window.oppo.ScreenReceiver */
public class ScreenReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        try {
            if ("android.intent.action.USER_PRESENT".equals(intent.getAction()) && C19645c.m48006a(context).mo40967a() && C19645c.m48006a(context).f54126m) {
                C19645c.m48006a(context).mo40969c();
            }
        } catch (Exception unused) {
        }
    }
}
