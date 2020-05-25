package com.facebook.internal;

import android.content.Intent;
import java.util.UUID;

/* renamed from: com.facebook.internal.a */
public final class C14262a {

    /* renamed from: d */
    private static C14262a f37172d;

    /* renamed from: a */
    public UUID f37173a;

    /* renamed from: b */
    public Intent f37174b;

    /* renamed from: c */
    public int f37175c;

    /* renamed from: b */
    private static C14262a m29227b() {
        return f37172d;
    }

    /* renamed from: a */
    public final boolean mo26472a() {
        return m29226a(this);
    }

    public C14262a(int i) {
        this(i, UUID.randomUUID());
    }

    /* renamed from: a */
    private static synchronized boolean m29226a(C14262a aVar) {
        boolean z;
        synchronized (C14262a.class) {
            C14262a b = m29227b();
            f37172d = aVar;
            if (b != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private C14262a(int i, UUID uuid) {
        this.f37173a = uuid;
        this.f37175c = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.facebook.internal.C14262a m29225a(java.util.UUID r4, int r5) {
        /*
            java.lang.Class<com.facebook.internal.a> r0 = com.facebook.internal.C14262a.class
            monitor-enter(r0)
            com.facebook.internal.a r1 = m29227b()     // Catch:{ all -> 0x001e }
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.util.UUID r3 = r1.f37173a     // Catch:{ all -> 0x001e }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x001e }
            if (r4 == 0) goto L_0x001c
            int r4 = r1.f37175c     // Catch:{ all -> 0x001e }
            if (r4 == r5) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            m29226a(r2)     // Catch:{ all -> 0x001e }
            monitor-exit(r0)
            return r1
        L_0x001c:
            monitor-exit(r0)
            return r2
        L_0x001e:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C14262a.m29225a(java.util.UUID, int):com.facebook.internal.a");
    }
}
