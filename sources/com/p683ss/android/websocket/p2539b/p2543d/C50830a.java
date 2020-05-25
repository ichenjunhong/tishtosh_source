package com.p683ss.android.websocket.p2539b.p2543d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.p683ss.android.websocket.p2539b.p2541b.C50825e;

/* renamed from: com.ss.android.websocket.b.d.a */
public class C50830a implements C50834e {

    /* renamed from: a */
    private long f127712a = -1;

    /* renamed from: b */
    private final Context f127713b;

    /* renamed from: a */
    public void mo99525a() {
        this.f127712a = -1;
    }

    public C50830a(Context context) {
        this.f127713b = context.getApplicationContext();
    }

    /* renamed from: a */
    private static boolean m109970a(Context context) {
        try {
            NetworkInfo a = C50831b.m109973a((ConnectivityManager) context.getSystemService("connectivity"));
            if (a == null || !a.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public long mo99524a(C50825e eVar) {
        if (!m109970a(this.f127713b)) {
            return -1;
        }
        if (this.f127712a == -1) {
            this.f127712a = (long) ((Math.random() * 4500.0d) + 500.0d);
        } else {
            this.f127712a *= 2;
            if (this.f127712a > 120000) {
                this.f127712a = 120000;
            }
        }
        return this.f127712a;
    }
}
