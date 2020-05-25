package androidx.work.impl.p053a.p055b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.support.p030v4.p034c.C0704a;
import androidx.work.impl.p053a.C1558b;
import com.C2240a;

/* renamed from: androidx.work.impl.a.b.e */
public final class C1564e extends C1563d<C1558b> {

    /* renamed from: b */
    private final ConnectivityManager f5564b = ((ConnectivityManager) this.f5560a.getSystemService("connectivity"));

    /* renamed from: c */
    private C1566b f5565c;

    /* renamed from: d */
    private C1565a f5566d;

    /* renamed from: androidx.work.impl.a.b.e$a */
    class C1565a extends BroadcastReceiver {
        C1565a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (!(intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))) {
                C1564e.this.mo5957a(C1564e.this.mo5952b());
            }
        }
    }

    /* renamed from: androidx.work.impl.a.b.e$b */
    class C1566b extends NetworkCallback {
        C1566b() {
        }

        public final void onLost(Network network) {
            C1564e.this.mo5957a(C1564e.this.mo5952b());
        }

        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            C2240a.m6772a("Network capabilities changed: %s", new Object[]{networkCapabilities});
            C1564e.this.mo5957a(C1564e.this.mo5952b());
        }
    }

    /* renamed from: e */
    private static boolean m5556e() {
        if (VERSION.SDK_INT >= 24) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo5953c() {
        if (m5556e()) {
            this.f5564b.registerDefaultNetworkCallback(this.f5565c);
        } else {
            this.f5560a.registerReceiver(this.f5566d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    /* renamed from: d */
    public final void mo5954d() {
        if (m5556e()) {
            this.f5564b.unregisterNetworkCallback(this.f5565c);
        } else {
            this.f5560a.unregisterReceiver(this.f5566d);
        }
    }

    /* renamed from: f */
    private boolean m5557f() {
        if (VERSION.SDK_INT < 23) {
            return false;
        }
        NetworkCapabilities networkCapabilities = this.f5564b.getNetworkCapabilities(this.f5564b.getActiveNetwork());
        if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C1558b mo5952b() {
        boolean z;
        NetworkInfo a = C1567f.m5562a(this.f5564b);
        boolean z2 = true;
        if (a == null || !a.isConnected()) {
            z = false;
        } else {
            z = true;
        }
        boolean f = m5557f();
        boolean a2 = C0704a.m2035a(this.f5564b);
        if (a == null || a.isRoaming()) {
            z2 = false;
        }
        return new C1558b(z, f, a2, z2);
    }

    public C1564e(Context context) {
        super(context);
        if (m5556e()) {
            this.f5565c = new C1566b();
        } else {
            this.f5566d = new C1565a();
        }
    }
}
