package com.p683ss.android.ugc.aweme.feed.monitor;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Printer;
import com.bytedance.crash.p546f.C9585b;
import com.bytedance.crash.p554m.C9672d;
import com.bytedance.crash.p555n.C9713t;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.utils.C47667ah;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52757k;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.feed.monitor.a */
public final class C30514a {

    /* renamed from: f */
    public static final String f79739f = f79739f;

    /* renamed from: g */
    public static final String f79740g = ">>>>> Dispatching";

    /* renamed from: h */
    public static final String f79741h = "<<<<< Finished";

    /* renamed from: i */
    public static final String f79742i = f79742i;

    /* renamed from: j */
    public static final boolean f79743j = C10181b.m20511a().mo18172a(JankOpenAB.class, true, "fps_jank_open", 31744, true);

    /* renamed from: k */
    public static final int f79744k;

    /* renamed from: l */
    public static final long f79745l;

    /* renamed from: m */
    public static Printer f79746m = null;

    /* renamed from: n */
    public static final int f79747n = f79747n;

    /* renamed from: o */
    public static long f79748o;

    /* renamed from: p */
    public static long f79749p;

    /* renamed from: q */
    public static final C30517c f79750q = new C30517c();

    /* renamed from: r */
    public static final C52668f f79751r = C52732g.m112286a(C52757k.SYNCHRONIZED, C30516b.f79760a);

    /* renamed from: s */
    public static final C30515a f79752s = new C30515a(null);

    /* renamed from: a */
    public boolean f79753a;

    /* renamed from: b */
    public boolean f79754b;

    /* renamed from: c */
    public ConcurrentLinkedQueue<Long> f79755c;

    /* renamed from: d */
    public boolean f79756d;

    /* renamed from: e */
    public boolean f79757e;

    /* renamed from: t */
    private boolean f79758t;

    /* renamed from: com.ss.android.ugc.aweme.feed.monitor.a$a */
    public static final class C30515a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f79759a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C30515a.class), "INSTANCE", "getINSTANCE()Lcom/ss/android/ugc/aweme/feed/monitor/JankDataManager;"))};

        private C30515a() {
        }

        /* renamed from: a */
        public static long m71482a() {
            return C30514a.f79745l;
        }

        /* renamed from: b */
        public static C30514a m71483b() {
            return (C30514a) C30514a.f79751r.getValue();
        }

        public /* synthetic */ C30515a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.monitor.a$b */
    static final class C30516b extends C52712l implements C52670a<C30514a> {

        /* renamed from: a */
        public static final C30516b f79760a = new C30516b();

        C30516b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C30514a(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.monitor.a$c */
    public static final class C30517c implements Printer {

        /* renamed from: a */
        private long f79761a;

        C30517c() {
        }

        public final void println(String str) {
            if (!TextUtils.isEmpty(str) && C30515a.m71483b().f79753a) {
                if (str == null) {
                    C52711k.m112234a();
                }
                if (C52830p.m112411b(str, C30514a.f79740g, false, 2, null)) {
                    this.f79761a = System.nanoTime();
                    C30519b.m71484a().mo62716a(C30514a.f79748o);
                }
                if (C52830p.m112411b(str, C30514a.f79741h, false, 2, null)) {
                    long nanoTime = (System.nanoTime() - this.f79761a) / ((long) C30514a.f79747n);
                    if (nanoTime > C30515a.m71482a()) {
                        C30514a.f79749p += nanoTime;
                        C30514a.f79748o++;
                        C30515a.m71483b().f79755c.add(Long.valueOf(nanoTime));
                    } else {
                        C30519b.m71484a().mo62717b(C30514a.f79748o);
                    }
                }
                if (C30514a.f79746m != null && (!C52711k.m112239a((Object) C30514a.f79746m, (Object) this))) {
                    Printer printer = C30514a.f79746m;
                    if (printer == null) {
                        C52711k.m112234a();
                    }
                    printer.println(str);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.monitor.a$d */
    static final class C30518d<V> implements Callable<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C30514a f79762a;

        /* renamed from: b */
        final /* synthetic */ String f79763b;

        /* renamed from: c */
        final /* synthetic */ String f79764c;

        C30518d(C30514a aVar, String str, String str2) {
            this.f79762a = aVar;
            this.f79763b = str;
            this.f79764c = str2;
        }

        public final /* synthetic */ Object call() {
            String str;
            C9585b bVar;
            this.f79762a.f79757e = C23337c.m57398a();
            C30519b a = C30519b.m71484a();
            C52711k.m112236a((Object) a, "LogMonitor.getInstance()");
            Map<Long, StackTraceElement[]> map = a.f79766a;
            if (map != null) {
                Collection<StackTraceElement[]> values = map.values();
                if (values != null) {
                    int i = 0;
                    for (StackTraceElement[] stackTraceElementArr : values) {
                        i++;
                        if (stackTraceElementArr.length > 0) {
                            String a2 = C9713t.m19433a(stackTraceElementArr[0]);
                            C52711k.m112236a((Object) stackTraceElementArr, "it");
                            String str2 = a2;
                            for (StackTraceElement a3 : stackTraceElementArr) {
                                String a4 = C9713t.m19433a(a3);
                                C52711k.m112236a((Object) a4, "temp");
                                CharSequence charSequence = a4;
                                if (C52830p.m112456b(charSequence, (CharSequence) "com.ss", false, 2, (Object) null) || C52830p.m112456b(charSequence, (CharSequence) "com.bytedance", false, 2, (Object) null)) {
                                    str2 = a4;
                                }
                            }
                            bVar = C9585b.m19046b(str2);
                        } else {
                            bVar = C9585b.m19046b("empty stack");
                        }
                        bVar.mo17390a("keyReason", "true");
                        bVar.mo17395a("log_type", (Object) "jankData");
                        bVar.mo17397b("totalJankCount", this.f79763b);
                        bVar.mo17397b("totalJankTime", this.f79764c);
                        bVar.mo17397b("jankRank", String.valueOf(i));
                        bVar.mo17397b("isAd", String.valueOf(this.f79762a.f79756d));
                        bVar.mo17397b("isPoor", String.valueOf(this.f79762a.f79757e));
                        Long l = (Long) this.f79762a.f79755c.poll();
                        if (l != null) {
                            bVar.mo17395a("block_duration", (Object) l);
                        }
                        C9672d.m19295a(bVar);
                    }
                }
            }
            if (C47667ah.m103178a(C11010c.m22280a())) {
                str = "1";
            } else {
                str = "2";
            }
            C26890h.m65012a("ui_sample_report_first", new C26898j().mo54849a("ui_block_times", this.f79763b).mo54849a("ui_block_duration", this.f79764c).mo54849a("is_new_user", str).mo54850a());
            return C52860x.f131107a;
        }
    }

    /* renamed from: b */
    public final void mo62712b() {
        this.f79758t = false;
    }

    private C30514a() {
        this.f79755c = new ConcurrentLinkedQueue<>();
        this.f79758t = true;
    }

    /* renamed from: a */
    public static Printer m71479a() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            C52711k.m112236a((Object) declaredField, "printerField");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(Looper.getMainLooper());
            if (obj != null) {
                return (Printer) obj;
            }
            throw new C52857u("null cannot be cast to non-null type android.util.Printer");
        } catch (Exception unused) {
            return null;
        }
    }

    static {
        int i;
        int a = C10181b.m20511a().mo18168a(JankSampleAB.class, true, "fps_jank_interval", 31744, 0);
        f79744k = a;
        if (a > 0) {
            i = f79744k * 20;
        } else {
            i = 100;
        }
        f79745l = (long) i;
    }

    /* renamed from: c */
    public final void mo62713c() {
        if (f79743j && this.f79753a) {
            this.f79754b = true;
            this.f79753a = false;
            String valueOf = String.valueOf(f79748o);
            String valueOf2 = String.valueOf(f79749p);
            if (this.f79758t) {
                C0013i.m18a((Callable<TResult>) new C30518d<TResult>(this, valueOf, valueOf2), (Executor) C26890h.m65003a());
            }
            f79749p = 0;
            f79748o = 0;
            if (m71479a() == f79750q) {
                Looper.getMainLooper().setMessageLogging(f79746m);
            }
        }
    }

    public /* synthetic */ C30514a(C52707g gVar) {
        this();
    }
}
