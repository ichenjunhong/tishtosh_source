package com.p683ss.android.ugc.aweme.p1402b;

import android.view.View;
import com.p683ss.android.ugc.aweme.p1402b.C23347e.C23348a;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import p2628d.C52847n;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.b.g */
public final class C23350g implements Runnable {

    /* renamed from: a */
    private WeakReference<C23348a> f62356a;

    /* renamed from: b */
    private WeakReference<ConcurrentHashMap<Integer, LinkedList<View>>> f62357b;

    public final void run() {
        C23348a aVar;
        WeakReference<C23348a> weakReference = this.f62356a;
        ConcurrentHashMap concurrentHashMap = null;
        if (weakReference != null) {
            aVar = (C23348a) weakReference.get();
        } else {
            aVar = null;
        }
        WeakReference<ConcurrentHashMap<Integer, LinkedList<View>>> weakReference2 = this.f62357b;
        if (weakReference2 != null) {
            concurrentHashMap = (ConcurrentHashMap) weakReference2.get();
        }
        if (aVar != null && concurrentHashMap != null) {
            for (C52847n nVar : aVar.f62353a) {
                Object first = nVar.getFirst();
                int intValue = ((Number) nVar.getSecond()).intValue();
                int intValue2 = ((Number) first).intValue();
                LinkedList linkedList = (LinkedList) concurrentHashMap.get(Integer.valueOf(intValue2));
                if (linkedList != null) {
                    if (linkedList.size() > intValue) {
                        synchronized (linkedList) {
                            int i = 0;
                            while (true) {
                                if (i >= intValue) {
                                    break;
                                } else if (((View) linkedList.poll()) == null) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        concurrentHashMap.remove(Integer.valueOf(intValue2));
                    }
                }
            }
        }
    }

    public C23350g(C23348a aVar, ConcurrentHashMap<Integer, LinkedList<View>> concurrentHashMap) {
        C52711k.m112240b(aVar, "target");
        C52711k.m112240b(concurrentHashMap, "viewCaches");
        this.f62356a = new WeakReference<>(aVar);
        this.f62357b = new WeakReference<>(concurrentHashMap);
    }
}
