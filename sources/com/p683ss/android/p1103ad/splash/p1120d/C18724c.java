package com.p683ss.android.p1103ad.splash.p1120d;

import com.p683ss.android.p1103ad.splash.core.C18642g;
import com.p683ss.android.p1103ad.splash.core.C18655l;
import com.p683ss.android.p1103ad.splash.p1110b.C18550a;
import com.p683ss.android.p1103ad.splash.p1123g.C18742h;
import com.p683ss.android.p1103ad.splash.p1123g.C18744j;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.d.c */
public class C18724c {

    /* renamed from: a */
    private static volatile C18724c f51800a;

    /* renamed from: b */
    private volatile boolean f51801b;

    private C18724c() {
    }

    /* renamed from: a */
    public static C18724c m45629a() {
        if (f51800a == null) {
            synchronized (C18724c.class) {
                if (f51800a == null) {
                    f51800a = new C18724c();
                }
            }
        }
        return f51800a;
    }

    /* renamed from: b */
    public final void mo38336b() {
        if (C18642g.m45213ac() && C18642g.m45186N() && C18642g.m45187O() != null && C18742h.m45697b(C18642g.m45184L()) && !this.f51801b) {
            this.f51801b = true;
            C18744j.m45732d();
            C18744j.m45729c();
            new C18655l() {
                /* renamed from: a */
                public final void mo37849a(int i, Object obj) {
                }

                /* renamed from: b */
                public final void mo37850b(int i, Object obj) {
                    C18550a.m44899a().mo37843a("service_real_time_request_result", 0, (JSONObject) null);
                }
            };
            this.f51801b = false;
        }
    }
}
