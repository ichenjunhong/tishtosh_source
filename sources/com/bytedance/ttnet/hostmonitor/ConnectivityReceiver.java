package com.bytedance.ttnet.hostmonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ConnectivityReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str;
        try {
            C13351f.m26926b("HostMonitor", "onReceive");
            C13346a a = HostMonitor.m26904a(context);
            String str2 = "HostMonitor";
            if (a == C13346a.NONE) {
                str = "connection unavailable";
            } else {
                StringBuilder sb = new StringBuilder("connection available via ");
                sb.append(a);
                str = sb.toString();
            }
            C13351f.m26926b(str2, str);
        } catch (Throwable unused) {
        }
    }
}
