package com.p683ss.ugc.aweme.performance.core.monitor.p2590d;

import com.p683ss.ugc.aweme.performance.core.monitor.C51526a.C51527a;
import com.p683ss.ugc.aweme.performance.core.monitor.C51531b;
import com.p683ss.ugc.aweme.performance.core.monitor.p2587a.C51529a;
import com.p683ss.ugc.aweme.performance.core.monitor.p2587a.C51530b;
import com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51532a;
import com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51533b;
import com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51534c;
import com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51535d;
import com.p683ss.ugc.aweme.performance.core.monitor.p2591e.C51545b;
import com.p683ss.ugc.aweme.performance.core.monitor.p2592f.C51548b;
import com.p683ss.ugc.aweme.performance.core.monitor.printer.C51549a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.ugc.aweme.performance.core.monitor.d.a */
public abstract class C51537a {

    /* renamed from: e */
    public static final int f128749e = 50;

    /* renamed from: f */
    public static final int f128750f = 200;

    /* renamed from: g */
    public static final C51538a f128751g = new C51538a(null);

    /* renamed from: a */
    public final ConcurrentHashMap<String, C51534c> f128752a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public boolean f128753b;

    /* renamed from: c */
    public boolean f128754c;

    /* renamed from: d */
    public boolean f128755d;

    /* renamed from: com.ss.ugc.aweme.performance.core.monitor.d.a$a */
    public static final class C51538a {
        private C51538a() {
        }

        public /* synthetic */ C51538a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.aweme.performance.core.monitor.d.a$b */
    static final class C51539b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C51537a f128756a;

        /* renamed from: com.ss.ugc.aweme.performance.core.monitor.d.a$b$a */
        static final class C51540a<T> implements Comparator<Entry<String, C51535d>> {

            /* renamed from: a */
            public static final C51540a f128757a = new C51540a();

            C51540a() {
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0024  */
            /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
            /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ int compare(java.lang.Object r5, java.lang.Object r6) {
                /*
                    r4 = this;
                    java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                    java.util.Map$Entry r6 = (java.util.Map.Entry) r6
                    r0 = 0
                    if (r5 == 0) goto L_0x0013
                    java.lang.Object r5 = r5.getValue()
                    com.ss.ugc.aweme.performance.core.monitor.b.d r5 = (com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51535d) r5
                    if (r5 == 0) goto L_0x0013
                    long r2 = r5.f128741a
                    goto L_0x0014
                L_0x0013:
                    r2 = r0
                L_0x0014:
                    if (r6 == 0) goto L_0x0020
                    java.lang.Object r5 = r6.getValue()
                    com.ss.ugc.aweme.performance.core.monitor.b.d r5 = (com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51535d) r5
                    if (r5 == 0) goto L_0x0020
                    long r0 = r5.f128741a
                L_0x0020:
                    int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                    if (r5 <= 0) goto L_0x0026
                    r5 = 1
                    return r5
                L_0x0026:
                    r5 = -1
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.ugc.aweme.performance.core.monitor.p2590d.C51537a.C51539b.C51540a.compare(java.lang.Object, java.lang.Object):int");
            }
        }

        C51539b(C51537a aVar) {
            this.f128756a = aVar;
        }

        public final void run() {
            synchronized (C51531b.f128722d) {
                Set entrySet = C51531b.f128719a.entrySet();
                C52711k.m112236a((Object) entrySet, "mPointMap.entries");
                ArrayList arrayList = new ArrayList(entrySet);
                C52575l.m112105a(arrayList, C51540a.f128757a);
                if (arrayList.size() > 0) {
                    for (Entry entry : this.f128756a.f128752a.entrySet()) {
                        if (((C51534c) entry.getValue()).f128734c < ((C51535d) ((Entry) arrayList.get(0)).getValue()).f128741a) {
                            this.f128756a.f128752a.remove(entry.getKey());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.ugc.aweme.performance.core.monitor.d.a$c */
    public static final class C51541c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C51537a f128758a;

        /* renamed from: b */
        final /* synthetic */ C51535d f128759b;

        public C51541c(C51537a aVar, C51535d dVar) {
            this.f128758a = aVar;
            this.f128759b = dVar;
        }

        public final void run() {
            ArrayList arrayList;
            C51534c cVar;
            synchronized (this.f128758a.f128752a) {
                arrayList = new ArrayList(this.f128758a.f128752a.entrySet());
                if (this.f128759b == null) {
                    this.f128758a.f128752a.clear();
                }
            }
            C52575l.m112105a(arrayList, C515421.f128760a);
            Iterator it = arrayList.iterator();
            long j = 0;
            int i = 0;
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (entry != null) {
                    cVar = (C51534c) entry.getValue();
                } else {
                    cVar = null;
                }
                if (cVar != null && cVar.f128735d != 0) {
                    if (this.f128758a.f128753b) {
                        if (this.f128758a.f128755d) {
                            C51530b bVar = C51527a.m110658a().f128716f;
                            if (bVar != null) {
                                Map a = bVar.mo103707a();
                                if (a != null) {
                                    Set keySet = a.keySet();
                                    if (keySet != null) {
                                        Iterator it2 = keySet.iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                break;
                                            }
                                            if (C52830p.m112456b((CharSequence) cVar.f128733b, (CharSequence) (String) it2.next(), false, 2, (Object) null)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        C51532a aVar = new C51532a(cVar.f128733b, 0, 2, null);
                        aVar.f128724b = 1;
                        aVar.f128725c = cVar.f128732a;
                        StringBuilder sb = new StringBuilder();
                        sb.append(C51548b.m110675a(C51548b.f128764a.mo103729b(cVar.f128740i)));
                        sb.append("\n");
                        sb.append(cVar.f128738g);
                        aVar.mo103711d(sb.toString());
                        aVar.mo103709b(cVar.f128737f);
                        if (this.f128759b == null) {
                            aVar.mo103708a("applicaiton");
                        } else if (this.f128759b.f128741a < cVar.f128734c && this.f128759b.f128742b > cVar.f128735d) {
                            aVar.mo103708a(this.f128759b.f128744d);
                            C51535d dVar = this.f128759b;
                            C52711k.m112240b(cVar, "jankEntity");
                            C52711k.m112240b(dVar, "point");
                        }
                        C51549a<C51533b> aVar2 = C51527a.m110658a().f128714d;
                        if (aVar2 != null) {
                            aVar2.mo39171a(aVar);
                        }
                    } else if (this.f128759b == null) {
                        i++;
                        cVar.f128732a = (cVar.f128735d - cVar.f128734c) / 1000000;
                        j += cVar.f128732a;
                    } else if (this.f128759b.f128741a < cVar.f128734c && this.f128759b.f128742b > cVar.f128735d) {
                        i++;
                        cVar.f128732a = (cVar.f128735d - cVar.f128734c) / 1000000;
                        j += cVar.f128732a;
                    }
                }
            }
            C51532a aVar3 = new C51532a("phase", 1);
            aVar3.f128724b = i;
            aVar3.f128725c = j;
            C51535d dVar2 = this.f128759b;
            if (dVar2 != null) {
                aVar3.mo103708a(dVar2.f128744d);
            }
            C51549a<C51533b> aVar4 = C51527a.m110658a().f128714d;
            if (aVar4 != null) {
                aVar4.mo39171a(aVar3);
            }
            if (this.f128758a.f128752a.size() > C51537a.f128750f) {
                C51545b.f128762b.mo39173a(new C51539b(this.f128758a));
            }
        }
    }

    public C51537a() {
        boolean z;
        C51529a aVar = C51527a.m110658a().f128713c;
        boolean z2 = false;
        if (aVar != null) {
            z = aVar.mo39168c();
        } else {
            z = false;
        }
        this.f128753b = z;
        C51529a aVar2 = C51527a.m110658a().f128713c;
        if (aVar2 != null) {
            z2 = aVar2.mo39167b();
        }
        this.f128754c = z2;
        this.f128755d = C51527a.m110658a().f128712b;
    }
}
