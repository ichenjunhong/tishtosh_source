package com.p683ss.android.ugc.aweme.poi.utils;

import com.C2240a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.poi.model.C39126j;
import com.p683ss.android.ugc.aweme.poi.model.PoiDetail;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p001a.C0001a;
import p001a.C0011g;
import p001a.C0013i;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.o */
public final class C39456o {

    /* renamed from: com.ss.android.ugc.aweme.poi.utils.o$a */
    public static class C39459a {

        /* renamed from: a */
        public String f100881a;

        /* renamed from: b */
        public long f100882b;

        /* renamed from: c */
        public String f100883c;
    }

    /* renamed from: b */
    public static void m87757b() {
        C23131p.m56692a("poi_log", "select_city", null);
    }

    /* renamed from: a */
    public static void m87754a() {
        C23088c a = C23088c.m56631a();
        a.mo47822a("status", Integer.valueOf(0));
        C23131p.m56692a("poi_log", "get_poi_detail", a.mo47825b());
    }

    /* renamed from: a */
    public static C0013i<Void> m87753a(Collection<? extends C0013i<?>> collection) {
        if (collection.size() == 0) {
            return C0013i.m14a(null);
        }
        C0027j jVar = new C0027j();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        long currentTimeMillis = System.currentTimeMillis();
        for (C0013i iVar : collection) {
            final long j = currentTimeMillis;
            final Object obj2 = obj;
            final ArrayList arrayList2 = arrayList;
            final AtomicBoolean atomicBoolean2 = atomicBoolean;
            ArrayList arrayList3 = arrayList;
            C394582 r9 = r1;
            final AtomicInteger atomicInteger2 = atomicInteger;
            Object obj3 = obj;
            final C0027j jVar2 = jVar;
            C394582 r1 = new C0011g<Object, Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void then(C0013i<Object> iVar) {
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    Object e = iVar.mo34e();
                    if (e != null) {
                        if (e instanceof PoiDetail) {
                            ((PoiDetail) e).setDuration(currentTimeMillis);
                        } else if (e instanceof C39126j) {
                            ((C39126j) e).f99823e = currentTimeMillis;
                        }
                    }
                    if (iVar.mo33d()) {
                        synchronized (obj2) {
                            arrayList2.add(iVar.mo35f());
                        }
                    }
                    if (iVar.mo31c()) {
                        atomicBoolean2.set(true);
                    }
                    if (atomicInteger2.decrementAndGet() == 0) {
                        if (arrayList2.size() != 0) {
                            if (arrayList2.size() == 1) {
                                jVar2.mo46b((Exception) arrayList2.get(0));
                            } else {
                                jVar2.mo46b((Exception) new C0001a(C2240a.m6773a(Locale.US, "There were %d exceptions.", new Object[]{Integer.valueOf(arrayList2.size())}), (List<? extends Throwable>) arrayList2));
                            }
                        } else if (atomicBoolean2.get()) {
                            jVar2.mo45b();
                        } else {
                            jVar2.mo47b(null);
                        }
                    }
                    return null;
                }
            };
            iVar.mo19a((C0011g<TResult, TContinuationResult>) r9);
            arrayList = arrayList3;
            obj = obj3;
        }
        return jVar.f77a;
    }

    /* renamed from: a */
    public static void m87756a(List<C39459a> list) {
        if (list.size() == 2) {
            C23088c a = C23088c.m56631a();
            long j = 0;
            for (C39459a aVar : list) {
                if (j <= aVar.f100882b) {
                    j = aVar.f100882b;
                }
                if ("poi_aweme".equalsIgnoreCase(aVar.f100881a)) {
                    a.mo47824a("ame_request_id", aVar.f100883c);
                    a.mo47823a("api_aweme", Long.valueOf(aVar.f100882b));
                } else {
                    a.mo47824a("poi_request_id", aVar.f100883c);
                    a.mo47823a("api_detail", Long.valueOf(aVar.f100882b));
                }
            }
            a.mo47823a("api_join", Long.valueOf(j));
            a.mo47822a("status", Integer.valueOf(1));
            C23131p.m56692a("poi_log", "get_poi_detail", a.mo47825b());
        }
    }

    /* renamed from: a */
    public static void m87755a(PoiDetail poiDetail, long j) {
        int i;
        C23088c a = C23088c.m56631a();
        a.mo47823a("api_detail", Long.valueOf(poiDetail.getDuration()));
        a.mo47823a("api_join", Long.valueOf(j));
        if (poiDetail != null) {
            i = 1;
            a.mo47824a("request_id", poiDetail.getRequestId());
        } else {
            i = 0;
        }
        a.mo47822a("status", Integer.valueOf(i));
        C23131p.m56692a("poi_log", "get_poi_detail", a.mo47825b());
    }
}
