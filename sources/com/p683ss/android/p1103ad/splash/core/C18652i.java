package com.p683ss.android.p1103ad.splash.core;

import android.content.Context;
import com.p683ss.android.p1103ad.splash.C18764m;
import com.p683ss.android.p1103ad.splash.core.p1116e.C18627a;
import com.p683ss.android.p1103ad.splash.p1110b.C18550a;
import com.p683ss.android.p1103ad.splash.p1110b.C18557b;
import com.p683ss.android.p1103ad.splash.p1120d.C18724c;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.i */
public final class C18652i {

    /* renamed from: a */
    private static volatile boolean f51552a;

    private C18652i() {
    }

    /* renamed from: a */
    private static void m45255a(long j) {
        String str;
        new StringBuilder("SDK init duration: ").append(j);
        JSONObject jSONObject = new JSONObject();
        try {
            if (C18642g.m45214ad()) {
                str = "dur_use_file";
            } else {
                str = "dur_use_sp";
            }
            jSONObject.put(str, j);
        } catch (Exception unused) {
        }
        C18550a.m44899a().mo37844a("service_sdk_init_duration", 0, jSONObject, null);
    }

    /* renamed from: a */
    public static void m45256a(Context context, C18764m mVar) {
        if (!f51552a) {
            synchronized (C18652i.class) {
                if (!f51552a) {
                    long currentTimeMillis = System.currentTimeMillis();
                    m45257b(context.getApplicationContext(), mVar);
                    f51552a = true;
                    m45255a(System.currentTimeMillis() - currentTimeMillis);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m45257b(Context context, C18764m mVar) {
        ExecutorService executorService;
        ExecutorService executorService2;
        ExecutorService executorService3;
        C18642g.m45202a(context);
        if (mVar != null) {
            C18642g.m45206a(mVar.f51886n);
            C18642g.m45207a(mVar.f51879g);
            if (mVar.f51873a != null) {
                executorService = mVar.f51873a;
            } else {
                executorService = C18653j.m45258a();
            }
            C18642g.m45208a(executorService);
            if (mVar.f51874b != null) {
                executorService2 = mVar.f51874b;
            } else {
                executorService2 = C18653j.m45258a();
            }
            C18642g.m45219b(executorService2);
            if (mVar.f51875c != null) {
                executorService3 = mVar.f51875c;
            } else {
                executorService3 = C18653j.m45258a();
            }
            C18642g.m45223c(executorService3);
            C18627a.m45126a().mo38030a(mVar.f51876d);
            C18642g.m45224c(mVar.f51877e);
            C18642g.m45205a(mVar.f51878f);
            C18642g.m45203a(mVar.f51880h);
            C18642g.m45228e(mVar.f51881i);
            C18642g.m45230f(mVar.f51882j);
            C18642g.m45232g(mVar.f51883k);
            C18642g.m45234h(mVar.f51884l);
            C18642g.m45235i(mVar.f51885m);
            if (mVar.f51887o) {
                C18642g.m45199a(8);
            }
            C18642g.m45209a(mVar.f51888p);
            C18642g.m45220b(mVar.f51889q);
        } else {
            C18642g.m45208a(C18653j.m45258a());
            C18642g.m45219b(C18653j.m45258a());
            C18642g.m45223c(C18653j.m45258a());
        }
        if (C18642g.m45213ac()) {
            C18563a.m44939a();
            C18563a.m44941c();
            C18724c.m45629a().mo38336b();
            C18557b.m44917a().mo37851b();
        }
    }
}
