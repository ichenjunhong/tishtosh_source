package com.p683ss.ugc.aweme.performance.mainlooper.monitor.work;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.p1397az.p1400c.p1401a.C23339a;
import com.p683ss.android.ugc.aweme.p1397az.p1400c.p1401a.C23339a.C23340a;
import com.p683ss.ugc.aweme.performance.core.monitor.C51526a.C51527a;
import com.p683ss.ugc.aweme.performance.core.monitor.C51531b;
import com.p683ss.ugc.aweme.performance.core.monitor.p2587a.C51530b;
import com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51532a;
import com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51533b;
import com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51534c;
import com.p683ss.ugc.aweme.performance.core.monitor.p2589c.C51536a;
import com.p683ss.ugc.aweme.performance.core.monitor.p2590d.C51537a;
import com.p683ss.ugc.aweme.performance.core.monitor.p2591e.C51545b;
import com.p683ss.ugc.aweme.performance.core.monitor.p2592f.C51548b;
import com.p683ss.ugc.aweme.performance.core.monitor.printer.C51549a;
import com.p683ss.ugc.aweme.performance.mainlooper.monitor.p2594a.C51551a;
import com.p683ss.ugc.aweme.performance.mainlooper.p2593a.C51550a;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.ugc.aweme.performance.mainlooper.monitor.work.a */
public final class C51552a extends C51537a {

    /* renamed from: l */
    public static final C52668f f128770l = C52732g.m112285a(C51554b.f128781a);

    /* renamed from: m */
    static final double f128771m = f128771m;

    /* renamed from: n */
    public static final C51553a f128772n = new C51553a(null);

    /* renamed from: p */
    private static int f128773p = 50;

    /* renamed from: q */
    private static int f128774q = 200;

    /* renamed from: h */
    public long f128775h;

    /* renamed from: i */
    final Handler f128776i;

    /* renamed from: j */
    long f128777j;

    /* renamed from: k */
    final C51555c f128778k;

    /* renamed from: o */
    private final HandlerThread f128779o;

    /* renamed from: com.ss.ugc.aweme.performance.mainlooper.monitor.work.a$a */
    public static final class C51553a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f128780a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C51553a.class), "INSTANCE", "getINSTANCE()Lcom/ss/ugc/aweme/performance/mainlooper/monitor/work/LogWorker;"))};

        private C51553a() {
        }

        /* renamed from: a */
        public static C51552a m110681a() {
            return (C51552a) C51552a.f128770l.getValue();
        }

        public /* synthetic */ C51553a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.aweme.performance.mainlooper.monitor.work.a$b */
    static final class C51554b extends C52712l implements C52670a<C51552a> {

        /* renamed from: a */
        public static final C51554b f128781a = new C51554b();

        C51554b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C51552a(null);
        }
    }

    /* renamed from: com.ss.ugc.aweme.performance.mainlooper.monitor.work.a$c */
    static final class C51555c implements Runnable {

        /* renamed from: a */
        public String f128782a = "";

        /* renamed from: b */
        public long f128783b;

        public final void run() {
            C51534c cVar = new C51534c();
            cVar.f128734c = this.f128783b;
            cVar.f128737f = C51536a.f128746b;
            cVar.f128736e = this.f128782a;
            synchronized (C51553a.m110681a().f128752a) {
                C51553a.m110681a().f128752a.put(this.f128782a, cVar);
            }
            if (C51553a.m110681a().f128753b) {
                synchronized (cVar) {
                    Looper mainLooper = Looper.getMainLooper();
                    C52711k.m112236a((Object) mainLooper, "Looper.getMainLooper()");
                    Thread thread = mainLooper.getThread();
                    C52711k.m112236a((Object) thread, "Looper.getMainLooper().thread");
                    StackTraceElement[] stackTrace = thread.getStackTrace();
                    if (stackTrace != null && stackTrace.length > 0) {
                        String stackTraceElement = stackTrace[0].toString();
                        C52711k.m112236a((Object) stackTraceElement, "stackTrace[0].toString()");
                        cVar.f128739h = stackTraceElement;
                    }
                    cVar.f128733b = C51548b.m110675a(stackTrace);
                }
                C51551a a = C51550a.f128765a.mo103731a();
                String str = cVar.f128736e;
                C52711k.m112240b(str, "<set-?>");
                a.f128769b = str;
                C51545b.f128762b.mo39173a(a);
            }
        }
    }

    /* renamed from: com.ss.ugc.aweme.performance.mainlooper.monitor.work.a$d */
    static final class C51556d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C51552a f128784a;

        /* renamed from: b */
        final /* synthetic */ C51534c f128785b;

        C51556d(C51552a aVar, C51534c cVar) {
            this.f128784a = aVar;
            this.f128785b = cVar;
        }

        public final void run() {
            Map map;
            if (this.f128784a.f128755d) {
                C51530b bVar = C51527a.m110658a().f128716f;
                if (bVar != null) {
                    map = bVar.mo103707a();
                } else {
                    map = null;
                }
                synchronized (this.f128785b) {
                    if (map != null) {
                        Set<String> keySet = map.keySet();
                        if (keySet != null) {
                            for (String b : keySet) {
                                if (C52830p.m112456b((CharSequence) this.f128785b.f128733b, (CharSequence) b, false, 2, (Object) null)) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
            C51532a aVar = new C51532a(null, 0, 3, null);
            aVar.f128724b = 1;
            if (this.f128785b.f128735d == -1) {
                aVar.f128725c = this.f128784a.f128775h * 50;
                aVar.mo103708a("errorJank");
                Looper mainLooper = Looper.getMainLooper();
                C52711k.m112236a((Object) mainLooper, "Looper.getMainLooper()");
                Thread thread = mainLooper.getThread();
                C52711k.m112236a((Object) thread, "Looper.getMainLooper().thread");
                aVar.mo103712e(C51548b.m110675a(thread.getStackTrace()));
                String date = new Date(System.currentTimeMillis() / 1000000).toString();
                C52711k.m112236a((Object) date, "Date(System.currentTimeM… NONO_TO_MIIL).toString()");
                aVar.mo103710c(date);
            } else {
                aVar.f128725c = (this.f128785b.f128735d - this.f128785b.f128734c) / 1000000;
                aVar.mo103708a("applicaiton");
                String date2 = new Date(this.f128785b.f128734c / 1000000).toString();
                C52711k.m112236a((Object) date2, "Date(entity.mJankStart / NONO_TO_MIIL).toString()");
                aVar.mo103710c(date2);
                synchronized (this.f128785b) {
                    aVar.mo103712e(this.f128785b.f128733b);
                }
            }
            aVar.mo103709b(this.f128785b.f128737f);
            StringBuilder sb = new StringBuilder();
            sb.append(C51548b.m110675a(C51548b.f128764a.mo103729b(this.f128785b.f128740i)));
            sb.append("\n");
            sb.append(this.f128785b.f128738g);
            aVar.mo103711d(sb.toString());
            String str = this.f128785b.f128739h;
            C52711k.m112240b(str, "<set-?>");
            aVar.f128723a = str;
            C51549a<C51533b> aVar2 = C51527a.m110658a().f128714d;
            if (aVar2 != null) {
                aVar2.mo39171a(aVar);
            }
        }
    }

    private C51552a() {
        this.f128777j = 16;
        this.f128778k = new C51555c();
        this.f128779o = new HandlerThread("LogWorker");
        this.f128779o.start();
        this.f128776i = new Handler(this.f128779o.getLooper());
        if (this.f128755d) {
            C23339a aVar = C23339a.f62346a;
            C52711k.m112240b(C23340a.INSTANCE, "filter");
        }
    }

    public /* synthetic */ C51552a(C52707g gVar) {
        this();
    }

    /* renamed from: a */
    public final void mo103736a(String str, long j) {
        C52711k.m112240b(str, "messageName");
        C51534c cVar = (C51534c) this.f128752a.get(str);
        C51527a.m110658a();
        if (cVar != null) {
            cVar.f128735d = j;
            if (this.f128754c) {
                C51545b.f128762b.mo39173a(new C51556d(this, cVar));
            }
            if (this.f128752a.size() > f128773p && C51531b.f128719a.size() == 0) {
                this.f128752a.clear();
            }
        }
    }
}
