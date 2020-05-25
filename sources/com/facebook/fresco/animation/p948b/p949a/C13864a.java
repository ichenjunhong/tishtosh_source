package com.facebook.fresco.animation.p948b.p949a;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p924h.C13715a;
import com.facebook.fresco.animation.p948b.C13867b;
import com.facebook.imagepipeline.p956a.p959c.C13926c;
import com.facebook.imagepipeline.p970j.C14042c;
import com.facebook.imagepipeline.p970j.C14043d;
import com.facebook.imagepipeline.p970j.C14046g;
import com.facebook.p914c.p915a.C13619c;

/* renamed from: com.facebook.fresco.animation.b.a.a */
public class C13864a implements C13867b {

    /* renamed from: a */
    private static final Class<?> f36169a = C13864a.class;

    /* renamed from: b */
    private final C13926c f36170b;

    /* renamed from: c */
    private final boolean f36171c;

    /* renamed from: d */
    private final SparseArray<C13715a<C14042c>> f36172d;

    /* renamed from: e */
    private C13715a<C14042c> f36173e;

    /* renamed from: f */
    private int f36174f = -1;

    /* renamed from: a */
    public final synchronized void mo26012a() {
        C13715a.m27752c(this.f36173e);
        this.f36170b.mo26097b(this.f36174f);
        this.f36173e = null;
        this.f36174f = -1;
        for (int i = 0; i < this.f36172d.size(); i++) {
            C13715a aVar = (C13715a) this.f36172d.valueAt(i);
            if (aVar != null) {
                C13715a.m27752c(aVar);
                this.f36170b.mo26097b(this.f36172d.keyAt(i));
            }
        }
        this.f36172d.clear();
    }

    /* renamed from: b */
    private static C13715a<C14042c> m28221b(C13715a<Bitmap> aVar) {
        return C13715a.m27746a(new C14043d(aVar, C14046g.f36711a, 0));
    }

    /* renamed from: a */
    public final synchronized C13715a<Bitmap> mo26010a(int i) {
        C13926c cVar;
        cVar = this.f36170b;
        return m28220a(cVar.f36333b.mo26159a(cVar.mo26095a(i)));
    }

    /* renamed from: b */
    public final synchronized C13715a<Bitmap> mo26014b(int i) {
        return m28220a(C13715a.m27751b(this.f36173e));
    }

    /* renamed from: c */
    public final synchronized boolean mo26016c(int i) {
        C13926c cVar;
        cVar = this.f36170b;
        return cVar.f36333b.mo26167c(cVar.mo26095a(i));
    }

    /* renamed from: a */
    private static C13715a<Bitmap> m28220a(C13715a<C14042c> aVar) {
        try {
            if (C13715a.m27750a(aVar) && (aVar.mo25630a() instanceof C14043d)) {
                C14043d dVar = (C14043d) aVar.mo25630a();
                if (dVar != null) {
                    return dVar.mo26260f();
                }
            }
            C13715a.m27752c(aVar);
            return null;
        } finally {
            C13715a.m27752c(aVar);
        }
    }

    /* renamed from: d */
    private synchronized void m28222d(int i) {
        C13715a aVar = (C13715a) this.f36172d.get(i);
        if (aVar != null) {
            this.f36172d.delete(i);
            C13715a.m27752c(aVar);
            C13697a.m27674a(f36169a, "removePreparedReference(%d) removed. Pending frames: %s", (Object) Integer.valueOf(i), (Object) this.f36172d);
        }
    }

    public C13864a(C13926c cVar, boolean z) {
        this.f36170b = cVar;
        this.f36171c = z;
        this.f36172d = new SparseArray<>();
    }

    /* renamed from: a */
    public final synchronized C13715a<Bitmap> mo26011a(int i, int i2, int i3) {
        C13715a aVar = null;
        if (!this.f36171c) {
            return null;
        }
        C13926c cVar = this.f36170b;
        while (true) {
            C13619c a = cVar.mo26093a();
            if (a != null) {
                C13715a b = cVar.f36333b.mo26165b(a);
                if (b != null) {
                    aVar = b;
                    break;
                }
            } else {
                break;
            }
        }
        return m28220a(aVar);
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:22:0x0042=Splitter:B:22:0x0042, B:15:0x0039=Splitter:B:15:0x0039} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo26015b(int r3, com.facebook.common.p924h.C13715a<android.graphics.Bitmap> r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.facebook.common.p920d.C13689i.m27652a(r4)     // Catch:{ all -> 0x0046 }
            r5 = 0
            com.facebook.common.h.a r4 = m28221b(r4)     // Catch:{ all -> 0x0040 }
            if (r4 != 0) goto L_0x0010
            com.facebook.common.p924h.C13715a.m27752c(r4)     // Catch:{ all -> 0x0046 }
            monitor-exit(r2)
            return
        L_0x0010:
            com.facebook.imagepipeline.a.c.c r5 = r2.f36170b     // Catch:{ all -> 0x003e }
            com.facebook.common.h.a r5 = r5.mo26094a(r3, r4)     // Catch:{ all -> 0x003e }
            boolean r0 = com.facebook.common.p924h.C13715a.m27750a(r5)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0039
            android.util.SparseArray<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> r0 = r2.f36172d     // Catch:{ all -> 0x003e }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x003e }
            com.facebook.common.h.a r0 = (com.facebook.common.p924h.C13715a) r0     // Catch:{ all -> 0x003e }
            com.facebook.common.p924h.C13715a.m27752c(r0)     // Catch:{ all -> 0x003e }
            android.util.SparseArray<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> r0 = r2.f36172d     // Catch:{ all -> 0x003e }
            r0.put(r3, r5)     // Catch:{ all -> 0x003e }
            java.lang.Class<?> r5 = f36169a     // Catch:{ all -> 0x003e }
            java.lang.String r0 = "cachePreparedFrame(%d) cached. Pending frames: %s"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x003e }
            android.util.SparseArray<com.facebook.common.h.a<com.facebook.imagepipeline.j.c>> r1 = r2.f36172d     // Catch:{ all -> 0x003e }
            com.facebook.common.p921e.C13697a.m27674a(r5, r0, r3, r1)     // Catch:{ all -> 0x003e }
        L_0x0039:
            com.facebook.common.p924h.C13715a.m27752c(r4)     // Catch:{ all -> 0x0046 }
            monitor-exit(r2)
            return
        L_0x003e:
            r3 = move-exception
            goto L_0x0042
        L_0x0040:
            r3 = move-exception
            r4 = r5
        L_0x0042:
            com.facebook.common.p924h.C13715a.m27752c(r4)     // Catch:{ all -> 0x0046 }
            throw r3     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fresco.animation.p948b.p949a.C13864a.mo26015b(int, com.facebook.common.h.a, int):void");
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:10:0x0020=Splitter:B:10:0x0020, B:16:0x0027=Splitter:B:16:0x0027} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo26013a(int r1, com.facebook.common.p924h.C13715a<android.graphics.Bitmap> r2, int r3) {
        /*
            r0 = this;
            monitor-enter(r0)
            com.facebook.common.p920d.C13689i.m27652a(r2)     // Catch:{ all -> 0x002b }
            r0.m28222d(r1)     // Catch:{ all -> 0x002b }
            r3 = 0
            com.facebook.common.h.a r2 = m28221b(r2)     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0020
            com.facebook.common.h.a<com.facebook.imagepipeline.j.c> r3 = r0.f36173e     // Catch:{ all -> 0x001e }
            com.facebook.common.p924h.C13715a.m27752c(r3)     // Catch:{ all -> 0x001e }
            com.facebook.imagepipeline.a.c.c r3 = r0.f36170b     // Catch:{ all -> 0x001e }
            com.facebook.common.h.a r3 = r3.mo26094a(r1, r2)     // Catch:{ all -> 0x001e }
            r0.f36173e = r3     // Catch:{ all -> 0x001e }
            r0.f36174f = r1     // Catch:{ all -> 0x001e }
            goto L_0x0020
        L_0x001e:
            r1 = move-exception
            goto L_0x0027
        L_0x0020:
            com.facebook.common.p924h.C13715a.m27752c(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)
            return
        L_0x0025:
            r1 = move-exception
            r2 = r3
        L_0x0027:
            com.facebook.common.p924h.C13715a.m27752c(r2)     // Catch:{ all -> 0x002b }
            throw r1     // Catch:{ all -> 0x002b }
        L_0x002b:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.fresco.animation.p948b.p949a.C13864a.mo26013a(int, com.facebook.common.h.a, int):void");
    }
}
