package com.bytedance.android.livesdk.p279af.p280a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.p279af.C4574am;

/* renamed from: com.bytedance.android.livesdk.af.a.e */
final class C4555e {

    /* renamed from: d */
    private static C4555e f12508d;

    /* renamed from: e */
    private static Context f12509e;

    /* renamed from: a */
    public boolean f12510a;

    /* renamed from: b */
    public long f12511b;

    /* renamed from: c */
    public long f12512c;

    /* renamed from: f */
    private final String f12513f;

    /* renamed from: g */
    private final long f12514g;

    /* renamed from: h */
    private ConnectivityManager f12515h;

    /* renamed from: i */
    private long f12516i;

    /* renamed from: c */
    private long m10941c() {
        if (this.f12510a) {
            return SystemClock.elapsedRealtime() - this.f12512c;
        }
        return Long.MAX_VALUE;
    }

    /* renamed from: b */
    public final long mo10372b() {
        if (!this.f12510a) {
            return C4574am.m10977a();
        }
        return this.f12511b + m10941c();
    }

    /* renamed from: a */
    public final boolean mo10371a() {
        NetworkInfo networkInfo;
        if (TextUtils.isEmpty(this.f12513f)) {
            return false;
        }
        synchronized (this) {
            if (this.f12515h == null) {
                this.f12515h = (ConnectivityManager) f12509e.getSystemService("connectivity");
            }
        }
        if (this.f12515h == null) {
            networkInfo = null;
        } else {
            networkInfo = C4556f.m10944a(this.f12515h);
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            return false;
        }
        C4557g gVar = new C4557g();
        if (!gVar.mo10373a(this.f12513f, (int) this.f12514g)) {
            return false;
        }
        this.f12510a = true;
        this.f12511b = gVar.f12517a;
        this.f12512c = gVar.f12518b;
        this.f12516i = gVar.f12519c / 2;
        return true;
    }

    private C4555e(String str, long j) {
        this.f12513f = str;
        this.f12514g = j;
    }

    /* renamed from: a */
    public static synchronized C4555e m10940a(Context context, String str, long j) {
        C4555e eVar;
        synchronized (C4555e.class) {
            if (f12508d == null) {
                f12508d = new C4555e(str, 500);
                f12509e = context.getApplicationContext();
            }
            eVar = f12508d;
        }
        return eVar;
    }
}
