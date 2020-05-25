package com.p683ss.android.ugc.aweme.net.cache;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12688d;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.aweme.net.cache.e */
public final class C37756e {

    /* renamed from: a */
    private static Map<String, LruCache<String, C37754c>> f96206a = new HashMap();

    /* renamed from: a */
    static C37755d m84279a(C12686c cVar) {
        Object obj = cVar.f33329j;
        if (obj == null || !(obj instanceof C37755d)) {
            return null;
        }
        return (C37755d) obj;
    }

    /* renamed from: a */
    static C12799u m84278a(C12686c cVar, C12728a aVar, C37755d dVar) throws Exception {
        String str;
        LruCache lruCache;
        C37754c cVar2;
        ReentrantLock reentrantLock;
        C12799u uVar;
        C12686c cVar3 = cVar;
        C37755d dVar2 = dVar;
        if (dVar2 == null || dVar2.f96204s == null) {
            return null;
        }
        C37753b bVar = dVar2.f96204s;
        StringBuilder sb = new StringBuilder();
        sb.append(bVar.f96198a);
        sb.append(" ");
        sb.append(bVar.f96200c);
        sb.append(" ");
        sb.append(bVar.f96199b);
        String str2 = cVar3.f33321b;
        if (TextUtils.isEmpty(bVar.f96198a)) {
            str = cVar.mo23860c();
        } else {
            str = bVar.f96198a;
        }
        synchronized (f96206a) {
            lruCache = (LruCache) f96206a.get(str);
            if (lruCache == null) {
                new StringBuilder("add new map ").append(str);
                lruCache = new LruCache(bVar.f96199b);
                f96206a.put(str, lruCache);
            }
        }
        synchronized (lruCache) {
            cVar2 = (C37754c) lruCache.get(str2);
            if (cVar2 != null) {
                new StringBuilder("has lock ").append(Thread.currentThread().getId());
                reentrantLock = cVar2.f96203c;
            } else {
                new StringBuilder("new lock ").append(Thread.currentThread().getId());
                reentrantLock = new ReentrantLock(true);
                cVar2 = new C37754c();
                cVar2.f96203c = reentrantLock;
                lruCache.put(str2, cVar2);
            }
        }
        try {
            StringBuilder sb2 = new StringBuilder("before lock ");
            sb2.append(str2);
            sb2.append(Thread.currentThread().getId());
            reentrantLock.lock();
            if (cVar2.f96201a != null) {
                if (System.currentTimeMillis() - cVar2.f96202b <= ((long) bVar.f96200c)) {
                    StringBuilder sb3 = new StringBuilder("use cache ");
                    sb3.append(str2);
                    sb3.append(" ");
                    sb3.append(Thread.currentThread().getId());
                    C12688d dVar3 = new C12688d("", 200, "", Collections.emptyList(), null);
                    uVar = C12799u.m25687a(cVar2.f96201a, dVar3);
                    dVar2.f96205t = true;
                    return uVar;
                }
            }
            uVar = aVar.mo23900a(cVar3);
            cVar2.f96201a = uVar.f33552b;
            cVar2.f96202b = System.currentTimeMillis();
            StringBuilder sb4 = new StringBuilder("new cache ");
            sb4.append(str2);
            sb4.append(" ");
            sb4.append(lruCache.size());
            sb4.append(" ");
            sb4.append(Thread.currentThread().getId());
            dVar2.f96205t = false;
            return uVar;
        } finally {
            reentrantLock.unlock();
            StringBuilder sb5 = new StringBuilder("end lock ");
            sb5.append(str2);
            sb5.append(" ");
            sb5.append(Thread.currentThread().getId());
        }
    }
}
