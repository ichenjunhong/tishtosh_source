package com.toutiao.proxyserver;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.toutiao.proxyserver.ac */
public final class C51802ac {

    /* renamed from: a */
    ConcurrentHashMap<String, C51804a> f129266a;

    /* renamed from: b */
    ConcurrentHashMap<String, String> f129267b;

    /* renamed from: c */
    private ConcurrentHashMap<String, String> f129268c;

    /* renamed from: d */
    private ConcurrentLinkedQueue<String> f129269d;

    /* renamed from: com.toutiao.proxyserver.ac$a */
    public static class C51804a {

        /* renamed from: a */
        public AtomicLong f129270a = new AtomicLong(0);
    }

    /* renamed from: com.toutiao.proxyserver.ac$b */
    public static class C51805b {

        /* renamed from: a */
        public static final C51802ac f129271a = new C51802ac();
    }

    /* renamed from: a */
    public static C51802ac m111110a() {
        return C51805b.f129271a;
    }

    private C51802ac() {
        this.f129266a = new ConcurrentHashMap<>();
        this.f129268c = new ConcurrentHashMap<>();
        this.f129267b = new ConcurrentHashMap<>();
        this.f129269d = new ConcurrentLinkedQueue<>();
    }

    /* renamed from: b */
    private void m111111b() {
        int i = 0;
        while (this.f129269d.size() > 100) {
            String str = (String) this.f129269d.poll();
            if (str != null) {
                String str2 = null;
                if (str != null) {
                    str2 = (String) this.f129268c.get(str);
                }
                this.f129266a.remove(str);
                this.f129268c.remove(str);
                this.f129267b.remove(str2);
            }
            i++;
            if (i > 100) {
                return;
            }
            if (str == null) {
                return;
            }
        }
    }

    /* renamed from: a */
    public final long mo107296a(String str) {
        if (str != null && this.f129266a.containsKey(str)) {
            C51804a aVar = (C51804a) this.f129266a.get(str);
            if (aVar != null) {
                return aVar.f129270a.get();
            }
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo107297a(String str, long j) {
        C51804a aVar;
        if (str != null) {
            if (this.f129266a.containsKey(str)) {
                aVar = (C51804a) this.f129266a.get(str);
            } else {
                C51804a aVar2 = new C51804a();
                this.f129266a.put(str, aVar2);
                aVar = aVar2;
            }
            if (aVar != null) {
                aVar.f129270a.set(j);
            }
        }
    }

    /* renamed from: a */
    public final void mo107298a(String str, String str2) {
        if (!this.f129268c.containsKey(str)) {
            this.f129269d.offer(str);
        }
        this.f129268c.put(str, str2);
        this.f129267b.put(str2, str);
        m111111b();
    }
}
