package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C16550au;
import com.google.android.gms.internal.measurement.C16568bl;
import com.google.android.gms.internal.measurement.C16862t;

public class CampaignTrackingReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static Boolean f38939a;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo27818a(Context context, String str) {
    }

    public void onReceive(Context context, Intent intent) {
        C16862t a = C16862t.m40963a(context);
        C16568bl a2 = a.mo32518a();
        if (intent == null) {
            a2.mo32503e("CampaignTrackingReceiver received null intent");
            return;
        }
        String stringExtra = intent.getStringExtra("referrer");
        String action = intent.getAction();
        a2.mo32490a("CampaignTrackingReceiver received", action);
        if (!"com.android.vending.INSTALL_REFERRER".equals(action) || TextUtils.isEmpty(stringExtra)) {
            a2.mo32503e("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        mo27818a(context, stringExtra);
        int c = C16550au.m39481c();
        if (stringExtra.length() > c) {
            a2.mo32499c("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(stringExtra.length()), Integer.valueOf(c));
            stringExtra = stringExtra.substring(0, c);
        }
        a.mo32520c().mo32473a(stringExtra, new C15091e(this, goAsync()));
    }
}
