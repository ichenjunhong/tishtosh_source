package com.p683ss.android.ugc.aweme.feed.p1729l;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.l.d */
public final class C30469d {

    /* renamed from: a */
    public static ConcurrentHashMap<String, C30467b> f79618a = new ConcurrentHashMap<>();

    /* renamed from: b */
    public static ArrayList<String> f79619b = new ArrayList<>();

    /* renamed from: c */
    public static ReentrantReadWriteLock f79620c = new ReentrantReadWriteLock();

    /* renamed from: d */
    public static final C30469d f79621d = new C30469d();

    private C30469d() {
    }

    /* renamed from: e */
    private static void m71399e(String str) {
        if (str != null && !f79618a.containsKey(str)) {
            f79618a.putIfAbsent(str, new C30467b());
        }
    }

    /* renamed from: a */
    public final void mo60884a(String str) {
        m71399e(str);
        C30467b bVar = (C30467b) f79618a.get(str);
        if (bVar != null) {
            AtomicInteger atomicInteger = bVar.f79608a;
            if (atomicInteger != null) {
                atomicInteger.getAndIncrement();
            }
        }
    }

    /* renamed from: b */
    public final void mo60886b(String str) {
        m71399e(str);
        C30467b bVar = (C30467b) f79618a.get(str);
        if (bVar != null) {
            AtomicInteger atomicInteger = bVar.f79609b;
            if (atomicInteger != null) {
                atomicInteger.getAndIncrement();
            }
        }
    }

    /* renamed from: c */
    public final void mo60887c(String str) {
        m71399e(str);
        C30467b bVar = (C30467b) f79618a.get(str);
        if (bVar != null) {
            AtomicInteger atomicInteger = bVar.f79611d;
            if (atomicInteger != null) {
                atomicInteger.getAndIncrement();
            }
        }
    }

    /* renamed from: d */
    public final void mo60888d(String str) {
        m71399e(str);
        C30467b bVar = (C30467b) f79618a.get(str);
        if (bVar != null) {
            AtomicInteger atomicInteger = bVar.f79610c;
            if (atomicInteger != null) {
                atomicInteger.getAndIncrement();
            }
        }
    }

    /* renamed from: a */
    public final void mo60885a(String str, long j) {
        m71399e(str);
        C30467b bVar = (C30467b) f79618a.get(str);
        if (bVar != null) {
            AtomicLong atomicLong = bVar.f79612e;
            if (atomicLong != null) {
                atomicLong.addAndGet(j);
            }
        }
    }

    /* renamed from: a */
    public static C30468c m71398a(String str, int i) {
        C30468c cVar;
        f79620c.readLock().lock();
        if (str != null && i > 0) {
            try {
                if (f79618a.containsKey(str) && f79619b.contains(str)) {
                    int indexOf = f79619b.indexOf(str);
                    cVar = new C30468c();
                    int i2 = indexOf;
                    for (int i3 = 0; i3 <= i && i2 >= 0; i3++) {
                        Object obj = f79619b.get(i2);
                        C52711k.m112236a(obj, "historyAidList.get(index)");
                        C30467b bVar = (C30467b) f79618a.get((String) obj);
                        if (bVar != null) {
                            cVar.f79613a += bVar.f79608a.get();
                            cVar.f79614b += bVar.f79609b.get();
                            cVar.f79615c += bVar.f79610c.get();
                            cVar.f79616d += bVar.f79611d.get();
                            cVar.f79617e.add(0, Long.valueOf(bVar.f79612e.get()));
                        }
                        i2--;
                    }
                    f79620c.readLock().unlock();
                    return cVar;
                }
            } catch (Throwable th) {
                f79620c.readLock().unlock();
                throw th;
            }
        }
        cVar = null;
        f79620c.readLock().unlock();
        return cVar;
    }
}
