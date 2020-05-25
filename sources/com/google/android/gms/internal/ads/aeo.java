package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

@C16299uq
public final class aeo {

    /* renamed from: a */
    private final BroadcastReceiver f40361a = new aep(this);

    /* renamed from: b */
    private final Map<BroadcastReceiver, IntentFilter> f40362b = new WeakHashMap();

    /* renamed from: c */
    private boolean f40363c;

    /* renamed from: d */
    private boolean f40364d;

    /* renamed from: e */
    private Context f40365e;

    /* renamed from: a */
    public final synchronized void mo28752a(Context context) {
        if (!this.f40363c) {
            this.f40365e = context.getApplicationContext();
            if (this.f40365e == null) {
                this.f40365e = context;
            }
            C15740bx.m36941a(this.f40365e);
            this.f40364d = ((Boolean) caf.m37099d().mo30717a(C15740bx.f44285bS)).booleanValue();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f40365e.registerReceiver(this.f40361a, intentFilter);
            this.f40363c = true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo28754a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (this.f40364d) {
            this.f40362b.put(broadcastReceiver, intentFilter);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

    /* renamed from: a */
    public final synchronized void mo28753a(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.f40364d) {
            this.f40362b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo28755a(Context context, Intent intent) {
        for (Entry entry : this.f40362b.entrySet()) {
            if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                ((BroadcastReceiver) entry.getKey()).onReceive(context, intent);
            }
        }
    }
}
