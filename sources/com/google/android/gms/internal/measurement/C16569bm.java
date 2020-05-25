package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.internal.measurement.bm */
class C16569bm extends BroadcastReceiver {

    /* renamed from: a */
    private static final String f46565a = "com.google.android.gms.internal.measurement.bm";

    /* renamed from: b */
    private final C16862t f46566b;

    /* renamed from: c */
    private boolean f46567c;

    /* renamed from: d */
    private boolean f46568d;

    C16569bm(C16862t tVar) {
        C15464q.m32123a(tVar);
        this.f46566b = tVar;
    }

    public void onReceive(Context context, Intent intent) {
        m39534e();
        String action = intent.getAction();
        this.f46566b.mo32518a().mo32490a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean f = m39535f();
            if (this.f46568d != f) {
                this.f46568d = f;
                C16849l c = this.f46566b.mo32520c();
                c.mo32490a("Network connectivity status changed", Boolean.valueOf(f));
                c.mo32509j().mo27845a((Runnable) new C16855m(c, f));
            }
        } else if ("com.google.analytics.RADIO_POWERED".equals(action)) {
            if (!intent.hasExtra(f46565a)) {
                C16849l c2 = this.f46566b.mo32520c();
                c2.mo32493b("Radio powered up");
                c2.mo32474b();
            }
        } else {
            this.f46566b.mo32518a().mo32498c("NetworkBroadcastReceiver received unknown action", action);
        }
    }

    /* renamed from: a */
    public final void mo31829a() {
        m39534e();
        if (!this.f46567c) {
            Context context = this.f46566b.f47334a;
            context.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
            intentFilter.addCategory(context.getPackageName());
            context.registerReceiver(this, intentFilter);
            this.f46568d = m39535f();
            this.f46566b.mo32518a().mo32490a("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f46568d));
            this.f46567c = true;
        }
    }

    /* renamed from: e */
    private final void m39534e() {
        this.f46566b.mo32518a();
        this.f46566b.mo32520c();
    }

    /* renamed from: b */
    public final void mo31830b() {
        if (this.f46567c) {
            this.f46566b.mo32518a().mo32493b("Unregistering connectivity change receiver");
            this.f46567c = false;
            this.f46568d = false;
            try {
                this.f46566b.f47334a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f46566b.mo32518a().mo32501d("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    /* renamed from: c */
    public final void mo31831c() {
        Context context = this.f46566b.f47334a;
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(context.getPackageName());
        intent.putExtra(f46565a, true);
        context.sendOrderedBroadcast(intent, null);
    }

    /* renamed from: d */
    public final boolean mo31832d() {
        if (!this.f46567c) {
            this.f46566b.mo32518a().mo32503e("Connectivity unknown. Receiver not registered");
        }
        return this.f46568d;
    }

    /* renamed from: f */
    private final boolean m39535f() {
        try {
            NetworkInfo a = C16570bn.m39540a((ConnectivityManager) this.f46566b.f47334a.getSystemService("connectivity"));
            if (a == null || !a.isConnected()) {
                return false;
            }
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
