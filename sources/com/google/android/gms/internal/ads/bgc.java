package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

final class bgc implements btz {

    /* renamed from: a */
    private final Map<String, List<brw<?>>> f42296a = new HashMap();

    /* renamed from: b */
    private final beb f42297b;

    bgc(beb beb) {
        this.f42297b = beb;
    }

    /* renamed from: a */
    public final void mo30126a(brw<?> brw, bxw<?> bxw) {
        List<brw> list;
        if (bxw.f44529b == null || bxw.f44529b.mo29558a()) {
            mo30125a(brw);
            return;
        }
        String c = brw.mo30631c();
        synchronized (this) {
            list = (List) this.f42296a.remove(c);
        }
        if (list != null) {
            if (C15840dr.f44899a) {
                Object[] objArr = {Integer.valueOf(list.size()), c};
            }
            for (brw a : list) {
                this.f42297b.f42153a.mo29909a(a, bxw);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo30125a(brw<?> brw) {
        String c = brw.mo30631c();
        List list = (List) this.f42296a.remove(c);
        if (list != null && !list.isEmpty()) {
            if (C15840dr.f44899a) {
                Object[] objArr = {Integer.valueOf(list.size()), c};
            }
            brw brw2 = (brw) list.remove(0);
            this.f42296a.put(c, list);
            brw2.mo30628a((btz) this);
            try {
                this.f42297b.f42155d.put(brw2);
            } catch (InterruptedException e) {
                new Object[1][0] = e.toString();
                Thread.currentThread().interrupt();
                this.f42297b.mo30070a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        return false;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean m35576b(com.google.android.gms.internal.ads.brw<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = r6.mo30631c()     // Catch:{ all -> 0x0048 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.brw<?>>> r1 = r5.f42296a     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.containsKey(r0)     // Catch:{ all -> 0x0048 }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0035
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.brw<?>>> r1 = r5.f42296a     // Catch:{ all -> 0x0048 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0048 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x001e
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0048 }
            r1.<init>()     // Catch:{ all -> 0x0048 }
        L_0x001e:
            java.lang.String r4 = "waiting-for-response"
            r6.mo30630b(r4)     // Catch:{ all -> 0x0048 }
            r1.add(r6)     // Catch:{ all -> 0x0048 }
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.brw<?>>> r6 = r5.f42296a     // Catch:{ all -> 0x0048 }
            r6.put(r0, r1)     // Catch:{ all -> 0x0048 }
            boolean r6 = com.google.android.gms.internal.ads.C15840dr.f44899a     // Catch:{ all -> 0x0048 }
            if (r6 == 0) goto L_0x0033
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0048 }
            r6[r2] = r0     // Catch:{ all -> 0x0048 }
        L_0x0033:
            monitor-exit(r5)
            return r3
        L_0x0035:
            java.util.Map<java.lang.String, java.util.List<com.google.android.gms.internal.ads.brw<?>>> r1 = r5.f42296a     // Catch:{ all -> 0x0048 }
            r4 = 0
            r1.put(r0, r4)     // Catch:{ all -> 0x0048 }
            r6.mo30628a(r5)     // Catch:{ all -> 0x0048 }
            boolean r6 = com.google.android.gms.internal.ads.C15840dr.f44899a     // Catch:{ all -> 0x0048 }
            if (r6 == 0) goto L_0x0046
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0048 }
            r6[r2] = r0     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r5)
            return r2
        L_0x0048:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bgc.m35576b(com.google.android.gms.internal.ads.brw):boolean");
    }
}
