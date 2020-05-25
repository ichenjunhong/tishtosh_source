package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.measurement.internal.ad */
class C16984ad extends BroadcastReceiver {

    /* renamed from: b */
    private static final String f47866b = "com.google.android.gms.measurement.internal.ad";

    /* renamed from: a */
    final C17092ed f47867a;

    /* renamed from: c */
    private boolean f47868c;

    /* renamed from: d */
    private boolean f47869d;

    C16984ad(C17092ed edVar) {
        C15464q.m32123a(edVar);
        this.f47867a = edVar;
    }

    public void onReceive(Context context, Intent intent) {
        this.f47867a.mo33113j();
        String action = intent.getAction();
        this.f47867a.mo32854q().f48453j.mo33377a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean e = this.f47867a.mo33105c().mo33380e();
            if (this.f47869d != e) {
                this.f47869d = e;
                this.f47867a.mo32853p().mo32912a((Runnable) new C16985ae(this, e));
            }
            return;
        }
        this.f47867a.mo32854q().f48448e.mo33377a("NetworkBroadcastReceiver received unknown action", action);
    }

    /* renamed from: a */
    public final void mo32859a() {
        this.f47867a.mo33113j();
        this.f47867a.mo32853p().mo32840c();
        if (!this.f47868c) {
            this.f47867a.mo32850m().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.f47869d = this.f47867a.mo33105c().mo33380e();
            this.f47867a.mo32854q().f48453j.mo33377a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f47869d));
            this.f47868c = true;
        }
    }

    /* renamed from: b */
    public final void mo32860b() {
        this.f47867a.mo33113j();
        this.f47867a.mo32853p().mo32840c();
        this.f47867a.mo32853p().mo32840c();
        if (this.f47868c) {
            this.f47867a.mo32854q().f48453j.mo33376a("Unregistering connectivity change receiver");
            this.f47868c = false;
            this.f47869d = false;
            try {
                this.f47867a.mo32850m().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f47867a.mo32854q().f48445b.mo33377a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }
}
