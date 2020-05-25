package com.p683ss.android.ugc.aweme.poi.p2074ui;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.keva.Keva;
import com.p683ss.android.ugc.aweme.util.C47625i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.p */
public class C39394p {

    /* renamed from: b */
    private static volatile C39394p f100770b;

    /* renamed from: a */
    public Keva f100771a;

    /* renamed from: b */
    public final boolean mo80364b() {
        if (this.f100771a != null) {
            return this.f100771a.getBoolean("enable_fake_gps", false);
        }
        return false;
    }

    /* renamed from: a */
    public static C39394p m87622a() {
        if (f100770b == null) {
            synchronized (C39394p.class) {
                if (f100770b == null) {
                    f100770b = new C39394p();
                }
            }
        }
        return f100770b;
    }

    private C39394p() {
        try {
            this.f100771a = Keva.getRepoFromSp(C11010c.m22280a(), "PoiPreferences", 0);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("SharedPreferencesAnnotatedManager getSP failed ");
            sb.append(th.getMessage());
            C47625i.m103103a(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo80363a(double[] dArr) {
        if (this.f100771a != null) {
            this.f100771a.storeString("fake_lat", String.valueOf(dArr[0]));
            this.f100771a.storeString("fake_lng", String.valueOf(dArr[1]));
        }
    }
}
