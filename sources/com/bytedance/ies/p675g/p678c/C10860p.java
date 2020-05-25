package com.bytedance.ies.p675g.p678c;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.bytedance.ies.g.c.p */
public final class C10860p<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f29153a;

    /* renamed from: b */
    private int f29154b;

    /* renamed from: c */
    private int f29155c;

    /* renamed from: d */
    private int f29156d;

    /* renamed from: e */
    private int f29157e;

    /* renamed from: f */
    private int f29158f;

    /* renamed from: g */
    private int f29159g;

    /* renamed from: h */
    private final C52682m<K, V, Boolean> f29160h;

    /* renamed from: i */
    private final C52682m<K, V, C52860x> f29161i;

    /* renamed from: c */
    private final int m22017c(K k, V v) {
        return 1;
    }

    /* renamed from: a */
    public final synchronized void mo19634a() {
        StringBuilder sb = new StringBuilder("Start trimming, entry count: ");
        sb.append(this.f29153a.size());
        sb.append('.');
        C10833f.m21990a(sb.toString());
        Iterator it = this.f29153a.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (((Boolean) this.f29160h.invoke(entry.getKey(), entry.getValue())).booleanValue()) {
                this.f29161i.invoke(entry.getKey(), entry.getValue());
                it.remove();
                StringBuilder sb2 = new StringBuilder("Entry removed: ");
                sb2.append(entry.getKey());
                sb2.append('.');
                C10833f.m21990a(sb2.toString());
            }
        }
    }

    public final synchronized String toString() {
        int i;
        StringBuilder sb;
        int i2 = this.f29157e + this.f29158f;
        if (i2 != 0) {
            i = (this.f29157e * 100) / i2;
        } else {
            i = 0;
        }
        sb = new StringBuilder("LruCache[maxSize=");
        sb.append(this.f29159g);
        sb.append(",hits=");
        sb.append(this.f29157e);
        sb.append(",misses=");
        sb.append(this.f29158f);
        sb.append(",hitRate=");
        sb.append(i);
        sb.append("%%]");
        return sb.toString();
    }

    /* renamed from: a */
    public final V mo19633a(K k) {
        C52727e eVar = new C52727e();
        synchronized (this) {
            eVar.element = this.f29153a.get(k);
            if (eVar.element != null) {
                this.f29157e++;
                Object obj = eVar.element;
                return obj;
            }
            this.f29158f++;
            return null;
        }
    }

    /* renamed from: a */
    public final void mo19635a(K k, V v) {
        m22016b(k, v);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r0 = new java.lang.StringBuilder();
        r0.append(r6.getClass().getName());
        r0.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bf, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private V m22016b(K r5, V r6) {
        /*
            r4 = this;
            d.f.b.v$e r0 = new d.f.b.v$e
            r0.<init>()
            monitor-enter(r4)
            int r1 = r4.f29155c     // Catch:{ all -> 0x00c3 }
            int r1 = r1 + 1
            r4.f29155c = r1     // Catch:{ all -> 0x00c3 }
            int r1 = r4.f29154b     // Catch:{ all -> 0x00c3 }
            int r2 = r4.m22017c(r5, r6)     // Catch:{ all -> 0x00c3 }
            int r1 = r1 + r2
            r4.f29154b = r1     // Catch:{ all -> 0x00c3 }
            java.util.LinkedHashMap<K, V> r1 = r4.f29153a     // Catch:{ all -> 0x00c3 }
            java.lang.Object r6 = r1.put(r5, r6)     // Catch:{ all -> 0x00c3 }
            r0.element = r6     // Catch:{ all -> 0x00c3 }
            T r6 = r0.element     // Catch:{ all -> 0x00c3 }
            if (r6 == 0) goto L_0x0031
            int r6 = r4.f29154b     // Catch:{ all -> 0x00c3 }
            T r1 = r0.element     // Catch:{ all -> 0x00c3 }
            if (r1 != 0) goto L_0x002a
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ all -> 0x00c3 }
        L_0x002a:
            int r5 = r4.m22017c(r5, r1)     // Catch:{ all -> 0x00c3 }
            int r6 = r6 - r5
            r4.f29154b = r6     // Catch:{ all -> 0x00c3 }
        L_0x0031:
            monitor-exit(r4)
            T r5 = r0.element
            if (r5 == 0) goto L_0x003d
            T r5 = r0.element
            if (r5 != 0) goto L_0x003d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x003d:
            int r5 = r4.f29159g
        L_0x003f:
            r6 = r4
            com.bytedance.ies.g.c.p r6 = (com.bytedance.ies.p675g.p678c.C10860p) r6
            monitor-enter(r6)
            int r1 = r6.f29154b     // Catch:{ all -> 0x00c0 }
            if (r1 < 0) goto L_0x009f
            java.util.LinkedHashMap<K, V> r1 = r6.f29153a     // Catch:{ all -> 0x00c0 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00c0 }
            if (r1 == 0) goto L_0x0053
            int r1 = r6.f29154b     // Catch:{ all -> 0x00c0 }
            if (r1 != 0) goto L_0x009f
        L_0x0053:
            int r1 = r6.f29154b     // Catch:{ all -> 0x00c0 }
            if (r1 > r5) goto L_0x0059
            monitor-exit(r6)
            goto L_0x0074
        L_0x0059:
            r1 = 0
            java.util.LinkedHashMap<K, V> r2 = r6.f29153a     // Catch:{ all -> 0x00c0 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00c0 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00c0 }
        L_0x0064:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00c0 }
            if (r3 == 0) goto L_0x0071
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x00c0 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x00c0 }
            goto L_0x0064
        L_0x0071:
            if (r1 != 0) goto L_0x0077
            monitor-exit(r6)
        L_0x0074:
            T r5 = r0.element
            return r5
        L_0x0077:
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x00c0 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x00c0 }
            java.util.LinkedHashMap<K, V> r3 = r6.f29153a     // Catch:{ all -> 0x00c0 }
            if (r2 != 0) goto L_0x0086
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ all -> 0x00c0 }
        L_0x0086:
            r3.remove(r2)     // Catch:{ all -> 0x00c0 }
            int r3 = r6.f29154b     // Catch:{ all -> 0x00c0 }
            if (r1 != 0) goto L_0x0090
            p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ all -> 0x00c0 }
        L_0x0090:
            int r1 = r6.m22017c(r2, r1)     // Catch:{ all -> 0x00c0 }
            int r3 = r3 - r1
            r6.f29154b = r3     // Catch:{ all -> 0x00c0 }
            int r1 = r6.f29156d     // Catch:{ all -> 0x00c0 }
            int r1 = r1 + 1
            r6.f29156d = r1     // Catch:{ all -> 0x00c0 }
            monitor-exit(r6)
            goto L_0x003f
        L_0x009f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00c0 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r0.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.Class r1 = r6.getClass()     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x00c0 }
            r0.append(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00c0 }
            r5.<init>(r0)     // Catch:{ all -> 0x00c0 }
            java.lang.Throwable r5 = (java.lang.Throwable) r5     // Catch:{ all -> 0x00c0 }
            throw r5     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r5 = move-exception
            monitor-exit(r6)
            throw r5
        L_0x00c3:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.p675g.p678c.C10860p.m22016b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public C10860p(int i, C52682m<? super K, ? super V, Boolean> mVar, C52682m<? super K, ? super V, C52860x> mVar2) {
        C52711k.m112240b(mVar, "expireRule");
        C52711k.m112240b(mVar2, "onValueRemoved");
        this.f29159g = i;
        this.f29160h = mVar;
        this.f29161i = mVar2;
        if (this.f29159g > 0) {
            this.f29153a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
