package com.p683ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29978a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.s */
public final class C26252s implements C26246n {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f69306a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26252s.class), "appStartTime", "getAppStartTime()J"))};

    /* renamed from: b */
    public static long f69307b;

    /* renamed from: c */
    public static long f69308c;

    /* renamed from: d */
    public static final C26252s f69309d = new C26252s();

    /* renamed from: e */
    private static final C52668f f69310e = C52732g.m112285a(C26253a.f69317a);

    /* renamed from: f */
    private static boolean f69311f;

    /* renamed from: g */
    private static boolean f69312g = true;

    /* renamed from: h */
    private static int f69313h;

    /* renamed from: i */
    private static long f69314i;

    /* renamed from: j */
    private static int f69315j;

    /* renamed from: k */
    private static long f69316k;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.splash.s$a */
    static final class C26253a extends C52712l implements C52670a<Long> {

        /* renamed from: a */
        public static final C26253a f69317a = new C26253a();

        C26253a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(C29978a.f78232c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.splash.s$b */
    static final class C26254b<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ Context f69318a;

        /* renamed from: b */
        final /* synthetic */ Aweme f69319b;

        /* renamed from: c */
        final /* synthetic */ long f69320c;

        /* renamed from: d */
        final /* synthetic */ long f69321d;

        C26254b(Context context, Aweme aweme, long j, long j2) {
            this.f69318a = context;
            this.f69319b = aweme;
            this.f69320c = j;
            this.f69321d = j2;
        }

        public final /* synthetic */ Object call() {
            Context context = this.f69318a;
            Aweme aweme = this.f69319b;
            long j = this.f69320c;
            if (C26512f.m64070m(aweme) && C26252s.f69308c != 0) {
                int i = 1;
                if (!C26252s.m63617d()) {
                    i = 2;
                }
                C26252s.m63613a(0);
                HashMap hashMap = new HashMap();
                hashMap.put("splashduration", String.valueOf(j));
                hashMap.put("awemelaunch", String.valueOf(i));
                HashMap hashMap2 = new HashMap();
                hashMap2.put("ad_extra_data", new C17971f().mo34889b(hashMap));
                C26088l.m63322b(context, "splash_show", aweme, C26088l.m63264a(context, aweme, "awesome splash feed show", false, (Map<String, String>) hashMap2));
            }
            if (C26252s.m63617d()) {
                Context context2 = this.f69318a;
                Aweme aweme2 = this.f69319b;
                long j2 = this.f69321d;
                if (C26512f.m64070m(aweme2)) {
                    if (C26088l.m63307a() && C26088l.m63256C(context2, aweme2)) {
                        C26088l.m63322b(context2, "first_view", aweme2, C26088l.m63328c(context2, aweme2, C26088l.m63271a((JSONObject) null, j2)));
                    }
                } else if (C26088l.m63307a()) {
                    C26890h.m65006a(context2, "splash_ad", "first_view", "-1", 0, C26088l.m63271a((JSONObject) null, j2));
                }
            }
            return C52860x.f131107a;
        }
    }

    private C26252s() {
    }

    /* renamed from: b */
    public static long m63614b() {
        return f69307b;
    }

    /* renamed from: c */
    public static boolean m63616c() {
        return f69311f;
    }

    /* renamed from: d */
    public static boolean m63617d() {
        return f69312g;
    }

    /* renamed from: a */
    public final long mo53907a() {
        return ((Number) f69310e.getValue()).longValue();
    }

    /* renamed from: a */
    public static void m63613a(long j) {
        f69308c = j;
    }

    /* renamed from: b */
    public static void m63615b(boolean z) {
        f69311f = true;
    }

    /* renamed from: a */
    public final void mo53898a(boolean z) {
        f69312g = false;
    }

    /* renamed from: c */
    public final void mo53900c(Context context, Aweme aweme) {
        long currentTimeMillis = System.currentTimeMillis();
        f69307b = currentTimeMillis;
        C26254b bVar = new C26254b(context, aweme, currentTimeMillis - f69308c, f69307b - mo53907a());
        C0013i.m18a((Callable<TResult>) bVar, (Executor) C26890h.m65003a());
    }

    /* renamed from: a */
    public final void mo53897a(Context context, Aweme aweme) {
        if (!m63617d()) {
            if (!C26512f.m64061d(aweme)) {
                int i = f69313h;
                if (1 <= i && 9 >= i) {
                    f69313h++;
                    return;
                }
                f69313h = 0;
                f69314i = 0;
            } else if (C26512f.m64070m(aweme)) {
                f69313h = 1;
                f69314i = System.currentTimeMillis();
            } else {
                int i2 = f69313h;
                if (1 <= i2 && 9 >= i2) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("adsgap", String.valueOf(f69313h - 1));
                    hashMap.put("gaptime", String.valueOf(System.currentTimeMillis() - f69314i));
                    Map map = hashMap;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("ad_extra_data", new C17971f().mo34889b(map));
                    C26088l.m63322b(context, "feed_firstshow", aweme, C26088l.m63264a(context, aweme, "", false, (Map<String, String>) hashMap2));
                }
                f69313h = 0;
            }
        }
    }

    /* renamed from: b */
    public final void mo53899b(Context context, Aweme aweme) {
        if (!C26512f.m64061d(aweme) || C26512f.m64070m(aweme)) {
            if (C26512f.m64070m(aweme)) {
                int i = f69315j;
                if (1 <= i && 9 >= i) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("adsgap", String.valueOf(f69315j - 1));
                    hashMap.put("gaptime", String.valueOf(System.currentTimeMillis() - f69316k));
                    Map map = hashMap;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("ad_extra_data", new C17971f().mo34889b(map));
                    C26088l.m63322b(context, "feed_lastshow", aweme, C26088l.m63264a(context, aweme, "", false, (Map<String, String>) hashMap2));
                    f69315j = 0;
                    return;
                }
            } else {
                int i2 = f69315j;
                if (1 <= i2 && 9 >= i2) {
                    f69315j++;
                    return;
                } else {
                    f69315j = 0;
                    f69316k = 0;
                }
            }
            return;
        }
        f69315j = 1;
        f69316k = System.currentTimeMillis();
    }
}
