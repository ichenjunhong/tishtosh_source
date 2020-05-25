package com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed;

import android.util.Log;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23727n;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.experiment.DetectorNoticeTimeGapExperiment;
import com.p683ss.android.ugc.aweme.feed.netdetector.C30550b;
import com.p683ss.android.ugc.aweme.feed.netdetector.p1734a.C30549e;
import com.p683ss.android.ugc.network.observer.C50088b;
import com.p683ss.android.ugc.network.observer.bean.C50095d;
import com.p683ss.android.ugc.network.observer.p2491b.C50090b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p2628d.C52775l;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.b */
public final class C30553b implements C30552a {

    /* renamed from: a */
    public static final C30554a f79824a = new C30554a(null);

    /* renamed from: b */
    private final List<C30549e> f79825b = new ArrayList();

    /* renamed from: c */
    private C30549e f79826c;

    /* renamed from: d */
    private C50088b f79827d;

    /* renamed from: e */
    private HashMap<String, HashMap<String, Object>> f79828e;

    /* renamed from: f */
    private C50090b f79829f;

    /* renamed from: g */
    private final C30555b f79830g = new C30555b();

    /* renamed from: h */
    private final List<C52671b<Boolean, C52860x>> f79831h = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.b$a */
    public static final class C30554a {
        private C30554a() {
        }

        /* renamed from: a */
        public static boolean m71544a() {
            if (!C30569g.m71557a().booleanValue()) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public static boolean m71545b() {
            Boolean b = C30569g.m71559b();
            new StringBuilder("isInFirstOrLastFeed : ").append(b);
            C52711k.m112236a((Object) b, "NoNetDetectHelper.isInFi…is}\".logD()\n            }");
            return b.booleanValue();
        }

        public /* synthetic */ C30554a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.b$b */
    static final class C30555b {

        /* renamed from: b */
        public static final C30557b f79832b = new C30557b(null);

        /* renamed from: a */
        public final AtomicBoolean f79833a = new AtomicBoolean(false);

        /* renamed from: c */
        private final AtomicLong f79834c = new AtomicLong(-1);

        /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.b$b$a */
        public enum C30556a {
            SHOW_TOAST,
            SHOW_BAR,
            SHOW_NO_NET_SCREEN
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.b$b$b */
        public static final class C30557b {
            private C30557b() {
            }

            public /* synthetic */ C30557b(C52707g gVar) {
                this();
            }

            /* renamed from: a */
            public static void m71552a(C30556a aVar, C50088b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
                Object obj;
                C52860x xVar;
                String str;
                int i;
                C52711k.m112240b(aVar, "actionType");
                if (bVar != null && hashMap != null) {
                    try {
                        HashMap hashMap2 = (HashMap) hashMap.get("extra_info");
                        if (hashMap2 != null) {
                            Object obj2 = hashMap2.get("start_time");
                            if (obj2 != null && (obj2 instanceof Long)) {
                                long currentTimeMillis = System.currentTimeMillis();
                                long longValue = currentTimeMillis - ((Number) obj2).longValue();
                                switch (C30563c.f79843a[aVar.ordinal()]) {
                                    case 1:
                                        str = "T";
                                        break;
                                    case 2:
                                        str = "B";
                                        break;
                                    case 3:
                                        str = "S";
                                        break;
                                    default:
                                        throw new C52775l();
                                }
                                Map linkedHashMap = new LinkedHashMap();
                                linkedHashMap.put("start_time", obj2);
                                linkedHashMap.put("show_notice_time", Long.valueOf(currentTimeMillis));
                                linkedHashMap.put("notice_time", Long.valueOf(longValue));
                                switch (C30563c.f79844b[bVar.ordinal()]) {
                                    case 1:
                                        i = 0;
                                        break;
                                    case 2:
                                        i = 1;
                                        break;
                                    case 3:
                                        i = 2;
                                        break;
                                    default:
                                        i = -1;
                                        break;
                                }
                                linkedHashMap.put("detect_res", Integer.valueOf(i));
                                HashMap hashMap3 = new HashMap();
                                hashMap3.put("extra_info", linkedHashMap);
                                C26890h.m65011a(C50095d.m108048a(), new C23089d().mo47829a(C50095d.m108049b(), str).mo47828a(C50095d.m108050c(), (Object) hashMap3).f61491a);
                            }
                            xVar = C52860x.f131107a;
                        } else {
                            xVar = null;
                        }
                        obj = C52848o.m114620constructorimpl(xVar);
                    } catch (Throwable th) {
                        obj = C52848o.m114620constructorimpl(C52851p.m112464a(th));
                    }
                    C52848o.m114619boximpl(obj);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.b$b$c */
        static final class C30558c implements Runnable {

            /* renamed from: a */
            final /* synthetic */ List f79836a;

            C30558c(List list) {
                this.f79836a = list;
            }

            public final void run() {
                for (C52671b invoke : this.f79836a) {
                    invoke.invoke(Boolean.valueOf(false));
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.b$b$d */
        static final class C30559d implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C30555b f79837a;

            /* renamed from: b */
            final /* synthetic */ List f79838b;

            C30559d(C30555b bVar, List list) {
                this.f79837a = bVar;
                this.f79838b = list;
            }

            public final void run() {
                this.f79837a.f79833a.set(true);
                for (C52671b invoke : this.f79838b) {
                    invoke.invoke(Boolean.valueOf(true));
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.b$b$e */
        static final class C30560e implements Runnable {

            /* renamed from: a */
            public static final C30560e f79839a = new C30560e();

            C30560e() {
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|(2:13|14)|15|16) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r4 = this;
                    boolean r0 = com.p683ss.android.ugc.aweme.feed.netdetector.C30550b.m71531b()
                    if (r0 == 0) goto L_0x003b
                    com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.g$a r0 = com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30569g.f79854d
                    if (r0 == 0) goto L_0x003a
                    com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.g$a r0 = com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30569g.f79854d
                    android.os.Handler r0 = r0.f79858a
                    if (r0 != 0) goto L_0x0011
                    goto L_0x003a
                L_0x0011:
                    java.lang.Object r0 = com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30569g.f79855e
                    monitor-enter(r0)
                    android.os.Message r1 = android.os.Message.obtain()     // Catch:{ all -> 0x0037 }
                    r2 = 0
                    r1.what = r2     // Catch:{ all -> 0x0037 }
                    com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.g$b r2 = new com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.g$b     // Catch:{ all -> 0x0037 }
                    java.lang.String r3 = "Detector can't find net"
                    r2.<init>(r3)     // Catch:{ all -> 0x0037 }
                    r1.obj = r2     // Catch:{ all -> 0x0037 }
                    com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.g$a r2 = com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30569g.f79854d     // Catch:{ all -> 0x0037 }
                    if (r2 == 0) goto L_0x0035
                    com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.g$a r2 = com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30569g.f79854d     // Catch:{ all -> 0x0037 }
                    android.os.Handler r2 = r2.f79858a     // Catch:{ all -> 0x0037 }
                    if (r2 == 0) goto L_0x0035
                    com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.g$a r2 = com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30569g.f79854d     // Catch:{ Exception -> 0x0035 }
                    android.os.Handler r2 = r2.f79858a     // Catch:{ Exception -> 0x0035 }
                    r2.sendMessage(r1)     // Catch:{ Exception -> 0x0035 }
                L_0x0035:
                    monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                    return
                L_0x0037:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0037 }
                    throw r1
                L_0x003a:
                    return
                L_0x003b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30553b.C30555b.C30560e.run():void");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.b$b$f */
        static final class C30561f implements Runnable {

            /* renamed from: a */
            public static final C30561f f79840a = new C30561f();

            C30561f() {
            }

            public final void run() {
                C10691a.m21542b(C11010c.m22280a(), (int) R.string.htz).mo19066a();
            }
        }

        /* renamed from: a */
        private final boolean m71547a() {
            boolean z;
            if (System.currentTimeMillis() - this.f79834c.get() < 60000) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                m71546a("this action show has been limited because time is too short!");
            }
            return z;
        }

        /* renamed from: b */
        private final void m71549b() {
            this.f79834c.set(System.currentTimeMillis());
            StringBuilder sb = new StringBuilder("updateShowTime ");
            sb.append(this.f79834c.get());
            m71546a(sb.toString());
        }

        /* renamed from: a */
        static int m71546a(String str) {
            return Log.d("FetchFeedNetDetect", str);
        }

        /* renamed from: a */
        public final boolean mo62752a(boolean z) {
            boolean z2;
            boolean b = C30550b.m71531b() & C30564d.m71553a(C11010c.m22280a());
            if (!z || !m71547a()) {
                z2 = true;
            } else {
                z2 = false;
            }
            return z2 & b;
        }

        /* renamed from: a */
        public final boolean mo62751a(C50088b bVar, HashMap<String, HashMap<String, Object>> hashMap) {
            if (!mo62752a(true)) {
                return false;
            }
            if ((!C30554a.m71545b() && !C30554a.m71544a()) || this.f79833a.get()) {
                return false;
            }
            m71546a("tryToShowToast");
            m71549b();
            C23727n.m58238a(C30561f.f79840a);
            C30557b.m71552a(C30556a.SHOW_TOAST, bVar, hashMap);
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.b$c */
    static final class C30562c extends C52712l implements C52671b<Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C30553b f79841a;

        /* renamed from: b */
        final /* synthetic */ Integer f79842b;

        C30562c(C30553b bVar, Integer num) {
            this.f79841a = bVar;
            this.f79842b = num;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).longValue();
            this.f79841a.mo62748a(this.f79842b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: a */
    public final synchronized void mo62744a() {
        m71536d();
    }

    /* renamed from: c */
    private final synchronized void m71535c() {
        Integer num;
        if (C30550b.m71531b()) {
            if (this.f79829f == null) {
                if (this.f79827d != null) {
                    C30549e eVar = this.f79826c;
                    if (eVar != null) {
                        num = Integer.valueOf(eVar.hashCode());
                    } else {
                        num = null;
                    }
                    C50090b bVar = new C50090b();
                    bVar.mo97855a(DetectorNoticeTimeGapExperiment.timeGap, new C30562c(this, num));
                    this.f79829f = bVar;
                }
            }
        }
    }

    /* renamed from: b */
    public final synchronized void mo62749b() {
        try {
            if (C30550b.m71531b()) {
                C52860x xVar = null;
                if (this.f79830g.mo62752a(true)) {
                    if (C30554a.m71545b() || C30554a.m71544a()) {
                        C50088b bVar = this.f79827d;
                        if (bVar != null) {
                            StringBuilder sb = new StringBuilder("tryShowNoticeIfFetchFeedNoNet for net state `");
                            sb.append(bVar);
                            sb.append('`');
                            switch (C30565e.f79845a[bVar.ordinal()]) {
                                case 1:
                                case 2:
                                    this.f79830g.mo62751a(this.f79827d, this.f79828e);
                                    break;
                                case 3:
                                    if (this.f79830g.mo62751a(this.f79827d, this.f79828e)) {
                                        m71535c();
                                        break;
                                    }
                                    break;
                            }
                            xVar = C52860x.f131107a;
                        }
                        C52848o.m114620constructorimpl(xVar);
                    }
                }
            }
        } catch (Throwable th) {
            C52848o.m114620constructorimpl(C52851p.m112464a(th));
        }
    }

    /* renamed from: d */
    private synchronized void m71536d() {
        new StringBuilder("release all FetchFeedRequestDetectInterceptor size:").append(this.f79825b.size());
        try {
            C30553b bVar = this;
            C30555b bVar2 = bVar.f79830g;
            List<C52671b<Boolean, C52860x>> list = bVar.f79831h;
            C52711k.m112240b(list, "showTopNoticeBarUnits");
            bVar2.f79833a.set(false);
            C23727n.m58238a(new C30558c(list));
            C52848o.m114620constructorimpl(C52860x.f131107a);
        } catch (Throwable th) {
            C52848o.m114620constructorimpl(C52851p.m112464a(th));
        }
        C52848o.m114620constructorimpl(C52860x.f131107a);
        try {
            C30553b bVar3 = this;
            bVar3.f79826c = null;
            bVar3.f79828e = null;
            bVar3.f79827d = null;
            C50090b bVar4 = bVar3.f79829f;
            if (bVar4 != null) {
                bVar4.mo97854a();
            }
            bVar3.f79829f = null;
            for (C30549e d : bVar3.f79825b) {
                d.mo62742d();
            }
            bVar3.f79825b.clear();
            C52848o.m114620constructorimpl(C52860x.f131107a);
        } catch (Throwable th2) {
            C52848o.m114620constructorimpl(C52851p.m112464a(th2));
            return;
        }
        return;
    }

    /* renamed from: b */
    public final synchronized void mo62750b(C52671b<? super Boolean, C52860x> bVar) {
        C52711k.m112240b(bVar, "unit");
        this.f79831h.remove(bVar);
    }

    /* renamed from: a */
    public final synchronized void mo62746a(C30549e eVar) {
        C52711k.m112240b(eVar, "t");
        if (this.f79826c == null) {
            this.f79826c = eVar;
        }
        this.f79825b.add(eVar);
    }

    /* renamed from: a */
    public final synchronized void mo62747a(C52671b<? super Boolean, C52860x> bVar) {
        C52711k.m112240b(bVar, "unit");
        if (C30550b.m71531b()) {
            if (this.f79830g.f79833a.get()) {
                bVar.invoke(Boolean.valueOf(true));
            }
            this.f79831h.add(bVar);
        }
    }

    /* renamed from: a */
    public final synchronized void mo62748a(Integer num) {
        Object obj;
        if (C30550b.m71531b()) {
            if (C30554a.m71545b() || C30554a.m71544a()) {
                if (this.f79826c != null) {
                    C30549e eVar = this.f79826c;
                    if (eVar != null) {
                        obj = Integer.valueOf(eVar.hashCode());
                    } else {
                        obj = null;
                    }
                    if (C52711k.m112239a(obj, (Object) num)) {
                        C50088b bVar = this.f79827d;
                        if (bVar != null) {
                            if (C30554a.m71544a()) {
                                new StringBuilder("isNoFeed timerToCheckFeedNull timeout and feed request is null. detectNetworkState:").append(bVar);
                                C30555b bVar2 = this.f79830g;
                                C50088b bVar3 = this.f79827d;
                                HashMap<String, HashMap<String, Object>> hashMap = this.f79828e;
                                if (bVar2.mo62752a(false) && C30554a.m71544a() && C30554a.m71545b()) {
                                    C30555b.m71546a("tryToShowNotNetScreenFeed");
                                    C23727n.m58238a(C30560e.f79839a);
                                    C30557b.m71552a(C30556a.SHOW_NO_NET_SCREEN, bVar3, hashMap);
                                }
                            } else if (C30554a.m71545b()) {
                                new StringBuilder("isInFirstOrLastRecommendFeed timerToCheckFeedNull timeout and feed request is null. detectNetworkState:").append(bVar);
                                C30555b bVar4 = this.f79830g;
                                List<C52671b<Boolean, C52860x>> list = this.f79831h;
                                C50088b bVar5 = this.f79827d;
                                HashMap<String, HashMap<String, Object>> hashMap2 = this.f79828e;
                                C52711k.m112240b(list, "showTopNoticeBarUnits");
                                if (bVar4.mo62752a(false) && C30554a.m71545b()) {
                                    C30555b.m71546a("toToShowNotifyBar");
                                    C23727n.m58238a(new C30559d(bVar4, list));
                                    C30557b.m71552a(C30556a.SHOW_BAR, bVar5, hashMap2);
                                }
                            } else {
                                new StringBuilder("nothing timerToCheckFeedNull timeout and feed request is null. detectNetworkState:").append(bVar);
                            }
                        }
                    }
                }
                this.f79829f = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo62745a(com.p683ss.android.ugc.aweme.feed.netdetector.p1734a.C30549e r3, com.p683ss.android.ugc.network.observer.C50088b r4, java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Object>> r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "requestDetectInterceptor"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "networkState"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "detailMap"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)     // Catch:{ all -> 0x0068 }
            boolean r0 = com.p683ss.android.ugc.aweme.feed.netdetector.C30550b.m71531b()     // Catch:{ all -> 0x0068 }
            if (r0 != 0) goto L_0x0018
            monitor-exit(r2)
            return
        L_0x0018:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            java.lang.String r1 = "netDetectCallBack. detectNetworkState:"
            r0.<init>(r1)     // Catch:{ all -> 0x0068 }
            r0.append(r4)     // Catch:{ all -> 0x0068 }
            r1 = 46
            r0.append(r1)     // Catch:{ all -> 0x0068 }
            com.ss.android.ugc.aweme.feed.netdetector.a.e r0 = r2.f79826c     // Catch:{ all -> 0x0068 }
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x0066
            com.ss.android.ugc.network.observer.b r3 = r2.f79827d     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x0066
            r2.f79827d = r4     // Catch:{ all -> 0x0068 }
            r2.f79828e = r5     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = "netDetectCallBack. record detectNetworkState:"
            r3.<init>(r4)     // Catch:{ all -> 0x0068 }
            com.ss.android.ugc.network.observer.b r4 = r2.f79827d     // Catch:{ all -> 0x0068 }
            r3.append(r4)     // Catch:{ all -> 0x0068 }
            r3.append(r1)     // Catch:{ all -> 0x0068 }
            boolean r3 = com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30553b.C30554a.m71544a()     // Catch:{ all -> 0x0068 }
            if (r3 != 0) goto L_0x0052
            boolean r3 = com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30553b.C30554a.m71545b()     // Catch:{ all -> 0x0068 }
            if (r3 == 0) goto L_0x0066
        L_0x0052:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0068 }
            java.lang.String r4 = "netDetectCallBack. isInFirstOrLastFeed , show notify now. detectNetworkState:"
            r3.<init>(r4)     // Catch:{ all -> 0x0068 }
            com.ss.android.ugc.network.observer.b r4 = r2.f79827d     // Catch:{ all -> 0x0068 }
            r3.append(r4)     // Catch:{ all -> 0x0068 }
            r3.append(r1)     // Catch:{ all -> 0x0068 }
            r2.mo62749b()     // Catch:{ all -> 0x0068 }
            monitor-exit(r2)
            return
        L_0x0066:
            monitor-exit(r2)
            return
        L_0x0068:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30553b.mo62745a(com.ss.android.ugc.aweme.feed.netdetector.a.e, com.ss.android.ugc.network.observer.b, java.util.HashMap):void");
    }
}
