package com.bytedance.ttnet.hostmonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.ttnet.hostmonitor.C13351f.C13353a;

public class HostMonitorBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    public final void mo24948a(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(new C13350e(context).mo24966c());
            context.registerReceiver(this, intentFilter);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo24864a(HostStatus hostStatus) {
        StringBuilder sb = new StringBuilder("host status changed: ");
        sb.append(hostStatus);
        sb.toString();
        C13355c.f34838a.f34835a.compareTo(C13353a.INFO);
    }

    public void onReceive(Context context, Intent intent) {
        try {
            String c = new C13350e(context).mo24966c();
            if (!(intent == null || c == null)) {
                if (intent.getAction().equals(c)) {
                    mo24864a((HostStatus) intent.getParcelableExtra("HostStatus"));
                }
            }
        } catch (Throwable unused) {
        }
    }
}
