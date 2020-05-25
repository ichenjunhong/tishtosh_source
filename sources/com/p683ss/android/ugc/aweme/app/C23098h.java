package com.p683ss.android.ugc.aweme.app;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.p1371b.C23043a;
import com.p683ss.android.ugc.aweme.app.p1371b.C23044b;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import p064c.p065a.C1674ab;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p069b.C1690c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.app.h */
public final class C23098h {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f61507a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23098h.class), "springApiLimitConfig", "getSpringApiLimitConfig()Lcom/ss/android/ugc/aweme/global/config/settings/pojo/SpringApiLimitConfig;"))};
    /* access modifiers changed from: 0000 */

    /* renamed from: b */
    public static long f61508b = 60000;

    /* renamed from: c */
    static boolean f61509c;

    /* renamed from: d */
    static volatile boolean f61510d;

    /* renamed from: e */
    static boolean f61511e;

    /* renamed from: f */
    public static final C23098h f61512f = new C23098h();

    /* renamed from: g */
    private static boolean f61513g = true;

    /* renamed from: h */
    private static final C52668f f61514h = C52732g.m112285a(C23102c.f61517a);

    /* renamed from: com.ss.android.ugc.aweme.app.h$a */
    public static final class C23099a<T> implements C2205y<T> {

        /* renamed from: a */
        public static final C23099a f61515a = new C23099a();

        C23099a() {
        }

        public final void subscribe(C2204x<Long> xVar) {
            C52711k.m112240b(xVar, "it");
            C23098h hVar = C23098h.f61512f;
            if (!C23098h.f61511e) {
                long c = C23098h.m56664c();
                if (c != 60000) {
                    xVar.mo6282a(Long.valueOf(c));
                } else {
                    C35857a.m80998a(60000);
                }
            } else if (C23098h.f61508b != 60000) {
                xVar.mo6282a(Long.valueOf(C23098h.f61508b));
            } else {
                C35857a.m80998a(60000);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.h$b */
    public static final class C23100b implements C1674ab<Long> {

        /* renamed from: com.ss.android.ugc.aweme.app.h$b$a */
        static final class C23101a implements Runnable {

            /* renamed from: a */
            public static final C23101a f61516a = new C23101a();

            C23101a() {
            }

            public final void run() {
                C23098h hVar = C23098h.f61512f;
                C23098h.f61509c = true;
            }
        }

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final /* synthetic */ void onNext(Object obj) {
            long longValue = ((Number) obj).longValue();
            C23098h hVar = C23098h.f61512f;
            C23098h.f61508b = longValue;
            C23098h hVar2 = C23098h.f61512f;
            C23098h.f61510d = true;
            C23098h hVar3 = C23098h.f61512f;
            C23098h.f61511e = true;
            C35857a.m80998a(C23098h.f61508b);
            new Handler(Looper.getMainLooper()).postDelayed(C23101a.f61516a, C23098h.f61508b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.h$c */
    static final class C23102c extends C52712l implements C52670a<SpringApiLimitConfig> {

        /* renamed from: a */
        public static final C23102c f61517a = new C23102c();

        C23102c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m56668a();
        }

        /* renamed from: a */
        private static SpringApiLimitConfig m56668a() {
            try {
                IESSettingsProxy b = C32816h.m75716b();
                C52711k.m112236a((Object) b, "SettingsReader.get()");
                return b.getSpringApiLimitConfig();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private C23098h() {
    }

    /* renamed from: a */
    public final boolean mo47841a() {
        return m56662a(this, null, 1, null);
    }

    /* renamed from: b */
    public final long mo47842b() {
        if (!f61511e) {
            f61508b = m56664c();
            f61511e = true;
        }
        return f61508b;
    }

    /* renamed from: c */
    public static long m56664c() {
        SpringApiLimitConfig springApiLimitConfig = (SpringApiLimitConfig) f61514h.getValue();
        if (springApiLimitConfig != null && m56663a(springApiLimitConfig)) {
            try {
                double random = Math.random();
                long longValue = springApiLimitConfig.getLimitEndTime().longValue();
                Long limitStartTime = springApiLimitConfig.getLimitStartTime();
                C52711k.m112236a((Object) limitStartTime, "limitStartTime");
                double longValue2 = (double) (longValue - limitStartTime.longValue());
                Double.isNaN(longValue2);
                double d = random * longValue2;
                Long limitStartTime2 = springApiLimitConfig.getLimitStartTime();
                C52711k.m112236a((Object) limitStartTime2, "limitStartTime");
                double longValue3 = (double) limitStartTime2.longValue();
                Double.isNaN(longValue3);
                return (long) (d + longValue3);
            } catch (Exception unused) {
            }
        }
        return 60000;
    }

    /* renamed from: a */
    private static boolean m56663a(SpringApiLimitConfig springApiLimitConfig) {
        if (springApiLimitConfig != null) {
            try {
                long longValue = springApiLimitConfig.getEndTime().longValue();
                Long startTime = springApiLimitConfig.getStartTime();
                C52711k.m112236a((Object) startTime, "it.startTime");
                long longValue2 = longValue - startTime.longValue();
                long currentTimeMillis = System.currentTimeMillis();
                if (longValue2 < 0) {
                    return false;
                }
                Long startTime2 = springApiLimitConfig.getStartTime();
                C52711k.m112236a((Object) startTime2, "it.startTime");
                if (currentTimeMillis - startTime2.longValue() >= 0) {
                    Long endTime = springApiLimitConfig.getEndTime();
                    C52711k.m112236a((Object) endTime, "it.endTime");
                    if (currentTimeMillis - endTime.longValue() <= 0) {
                        return true;
                    }
                }
                return false;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final long mo47840a(String str) {
        C52711k.m112240b(str, "apiName");
        long b = mo47842b();
        if (b == 60000) {
            return b;
        }
        C23043a a = C23044b.m56560a(str);
        if (a == null) {
            return b;
        }
        if (a.f61396a) {
            return 2147483647L;
        }
        return a.f61397b;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m56662a(C23098h hVar, String str, int i, Object obj) {
        String str2 = "";
        C52711k.m112240b(str2, "apiName");
        if (f61510d && !f61509c) {
            if (TextUtils.isEmpty(str2)) {
                return true;
            }
            C23043a a = C23044b.m56560a(str2);
            if (a != null && a.f61396a) {
                return true;
            }
        }
        return false;
    }
}
