package com.toutiao.proxyserver;

import com.toutiao.proxyserver.p2609a.C51798c;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.toutiao.proxyserver.k */
public final class C51861k {

    /* renamed from: a */
    ConcurrentHashMap<String, C51798c> f129390a;

    /* renamed from: b */
    private ConcurrentLinkedQueue<String> f129391b;

    /* renamed from: com.toutiao.proxyserver.k$a */
    public static class C51863a {

        /* renamed from: a */
        public static final C51861k f129392a = new C51861k();
    }

    /* renamed from: a */
    public static C51861k m111227a() {
        return C51863a.f129392a;
    }

    private C51861k() {
        this.f129391b = new ConcurrentLinkedQueue<>();
        this.f129390a = new ConcurrentHashMap<>();
    }

    /* renamed from: a */
    public final void mo107367a(String str, C51798c cVar) {
        if (str != null && cVar != null && !this.f129390a.containsKey(str)) {
            this.f129390a.put(str, cVar);
            this.f129391b.offer(str);
            int i = 0;
            while (this.f129391b.size() > 30) {
                String str2 = (String) this.f129391b.poll();
                if (str2 != null) {
                    this.f129390a.remove(str2);
                }
                i++;
                if (i <= 30) {
                    if (str2 == null) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }
}
