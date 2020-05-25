package com.facebook.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p030v4.content.C0732g;
import com.facebook.p909a.C13589l;

public class BoltsMeasurementEventListener extends BroadcastReceiver {

    /* renamed from: a */
    public static BoltsMeasurementEventListener f37169a;

    /* renamed from: b */
    public Context f37170b;

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        try {
            C0732g.m2130a(this.f37170b).mo2402a((BroadcastReceiver) this);
        } finally {
            super.finalize();
        }
    }

    public BoltsMeasurementEventListener(Context context) {
        this.f37170b = context.getApplicationContext();
    }

    public void onReceive(Context context, Intent intent) {
        C13589l lVar = new C13589l(context);
        StringBuilder sb = new StringBuilder("bf_");
        sb.append(intent.getStringExtra("event_name"));
        String sb2 = sb.toString();
        Bundle bundleExtra = intent.getBundleExtra("event_args");
        Bundle bundle = new Bundle();
        for (String str : bundleExtra.keySet()) {
            bundle.putString(str.replaceAll("[^0-9a-zA-Z _-]", "-").replaceAll("^[ -]*", "").replaceAll("[ -]*$", ""), (String) bundleExtra.get(str));
        }
        lVar.mo25408a(sb2, bundle);
    }
}
