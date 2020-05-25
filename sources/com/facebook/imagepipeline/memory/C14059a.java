package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p923g.C13703b;
import com.facebook.common.p923g.C13705d;
import com.facebook.common.p923g.C13707f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.memory.a */
public abstract class C14059a<V> implements C13707f<V> {

    /* renamed from: a */
    final C13705d f36731a;

    /* renamed from: b */
    final C14068ad f36732b;

    /* renamed from: c */
    final SparseArray<C14075f<V>> f36733c;

    /* renamed from: d */
    final Set<V> f36734d;

    /* renamed from: e */
    final C14060a f36735e;

    /* renamed from: f */
    final C14060a f36736f;

    /* renamed from: g */
    private final Class<?> f36737g = getClass();

    /* renamed from: h */
    private boolean f36738h;

    /* renamed from: i */
    private final C14069ae f36739i;

    /* renamed from: com.facebook.imagepipeline.memory.a$a */
    static class C14060a {

        /* renamed from: a */
        int f36740a;

        /* renamed from: b */
        int f36741b;

        C14060a() {
        }

        /* renamed from: a */
        public final void mo26312a(int i) {
            this.f36740a++;
            this.f36741b += i;
        }

        /* renamed from: b */
        public final void mo26313b(int i) {
            if (this.f36741b < i || this.f36740a <= 0) {
                C13697a.m27698d("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f36741b), Integer.valueOf(this.f36740a));
                return;
            }
            this.f36740a--;
            this.f36741b -= i;
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.a$b */
    public static class C14061b extends RuntimeException {
        public C14061b(Object obj) {
            StringBuilder sb = new StringBuilder("Invalid size: ");
            sb.append(obj.toString());
            super(sb.toString());
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.a$c */
    public static class C14062c extends RuntimeException {
        public C14062c(int i, int i2, int i3, int i4) {
            StringBuilder sb = new StringBuilder("Pool hard cap violation? Hard cap = ");
            sb.append(i);
            sb.append(" Used size = ");
            sb.append(i2);
            sb.append(" Free size = ");
            sb.append(i3);
            sb.append(" Request size = ");
            sb.append(i4);
            super(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract V mo26305b(int i);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo26306b(V v);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo26307c(int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo26308c(V v);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo26309d(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26304a() {
        this.f36731a.mo23182a(this);
    }

    /* renamed from: b */
    private synchronized void m28743b() {
        boolean z;
        if (m28746e()) {
            if (this.f36736f.f36741b != 0) {
                z = false;
                C13689i.m27657b(z);
            }
        }
        z = true;
        C13689i.m27657b(z);
    }

    /* renamed from: d */
    private synchronized void m28745d() {
        if (m28746e()) {
            mo26340f(this.f36732b.f36773b);
        }
    }

    /* renamed from: e */
    private synchronized boolean m28746e() {
        boolean z;
        if (this.f36735e.f36741b + this.f36736f.f36741b > this.f36732b.f36773b) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    private synchronized void m28744c() {
        SparseIntArray sparseIntArray = this.f36732b.f36774c;
        if (sparseIntArray != null) {
            this.f36733c.clear();
            for (int i = 0; i < sparseIntArray.size(); i++) {
                int keyAt = sparseIntArray.keyAt(i);
                this.f36733c.put(keyAt, new C14075f(mo26309d(keyAt), sparseIntArray.valueAt(i), 0, this.f36732b.f36777f));
            }
            this.f36738h = false;
            return;
        }
        this.f36738h = true;
    }

    /* renamed from: f */
    private void m28747f() {
        if (C13697a.m27683a(2)) {
            C13697a.m27676a(this.f36737g, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f36735e.f36740a), Integer.valueOf(this.f36735e.f36741b), Integer.valueOf(this.f36736f.f36740a), Integer.valueOf(this.f36736f.f36741b));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo26310d(V v) {
        C13689i.m27652a(v);
        return true;
    }

    /* renamed from: g */
    private synchronized C14075f<V> m28749g(int i) {
        return (C14075f) this.f36733c.get(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public synchronized V mo26303a(C14075f<V> fVar) {
        V b;
        b = fVar.mo26334b();
        if (b != null) {
            fVar.f36793e++;
        }
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return r0;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.facebook.imagepipeline.memory.C14075f<V> m28750h(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.SparseArray<com.facebook.imagepipeline.memory.f<V>> r0 = r3.f36733c     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002f }
            com.facebook.imagepipeline.memory.f r0 = (com.facebook.imagepipeline.memory.C14075f) r0     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x002d
            boolean r1 = r3.f36738h     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x0010
            goto L_0x002d
        L_0x0010:
            r0 = 2
            boolean r0 = com.facebook.common.p921e.C13697a.m27683a(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0022
            java.lang.Class<?> r0 = r3.f36737g     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "creating new bucket %s"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x002f }
            com.facebook.common.p921e.C13697a.m27673a(r0, r1, r2)     // Catch:{ all -> 0x002f }
        L_0x0022:
            com.facebook.imagepipeline.memory.f r0 = r3.mo26311e(r4)     // Catch:{ all -> 0x002f }
            android.util.SparseArray<com.facebook.imagepipeline.memory.f<V>> r1 = r3.f36733c     // Catch:{ all -> 0x002f }
            r1.put(r4, r0)     // Catch:{ all -> 0x002f }
            monitor-exit(r3)
            return r0
        L_0x002d:
            monitor-exit(r3)
            return r0
        L_0x002f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.C14059a.m28750h(int):com.facebook.imagepipeline.memory.f");
    }

    /* renamed from: i */
    private synchronized boolean m28751i(int i) {
        int i2 = this.f36732b.f36772a;
        if (i > i2 - this.f36735e.f36741b) {
            return false;
        }
        int i3 = this.f36732b.f36773b;
        if (i > i3 - (this.f36735e.f36741b + this.f36736f.f36741b)) {
            mo26340f(i3 - i);
        }
        if (i > i2 - (this.f36735e.f36741b + this.f36736f.f36741b)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C14075f<V> mo26311e(int i) {
        return new C14075f<>(mo26309d(i), Integer.MAX_VALUE, 0, this.f36732b.f36777f);
    }

    /* renamed from: a */
    private synchronized void m28742a(SparseIntArray sparseIntArray) {
        C13689i.m27652a(sparseIntArray);
        this.f36733c.clear();
        SparseIntArray sparseIntArray2 = this.f36732b.f36774c;
        if (sparseIntArray2 != null) {
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                this.f36733c.put(keyAt, new C14075f(mo26309d(keyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0), this.f36732b.f36777f));
            }
            this.f36738h = false;
            return;
        }
        this.f36738h = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void mo26340f(int r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.a$a r0 = r7.f36735e     // Catch:{ all -> 0x008c }
            int r0 = r0.f36741b     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.a$a r1 = r7.f36736f     // Catch:{ all -> 0x008c }
            int r1 = r1.f36741b     // Catch:{ all -> 0x008c }
            int r0 = r0 + r1
            int r0 = r0 - r8
            com.facebook.imagepipeline.memory.a$a r1 = r7.f36736f     // Catch:{ all -> 0x008c }
            int r1 = r1.f36741b     // Catch:{ all -> 0x008c }
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x008c }
            if (r0 > 0) goto L_0x0017
            monitor-exit(r7)
            return
        L_0x0017:
            r1 = 2
            boolean r2 = com.facebook.common.p921e.C13697a.m27683a(r1)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x003a
            java.lang.Class<?> r2 = r7.f36737g     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.a$a r5 = r7.f36735e     // Catch:{ all -> 0x008c }
            int r5 = r5.f36741b     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.a$a r6 = r7.f36736f     // Catch:{ all -> 0x008c }
            int r6 = r6.f36741b     // Catch:{ all -> 0x008c }
            int r5 = r5 + r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x008c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x008c }
            com.facebook.common.p921e.C13697a.m27675a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x008c }
        L_0x003a:
            r7.m28747f()     // Catch:{ all -> 0x008c }
            r2 = 0
        L_0x003e:
            android.util.SparseArray<com.facebook.imagepipeline.memory.f<V>> r3 = r7.f36733c     // Catch:{ all -> 0x008c }
            int r3 = r3.size()     // Catch:{ all -> 0x008c }
            if (r2 >= r3) goto L_0x0069
            if (r0 <= 0) goto L_0x0069
            android.util.SparseArray<com.facebook.imagepipeline.memory.f<V>> r3 = r7.f36733c     // Catch:{ all -> 0x008c }
            java.lang.Object r3 = r3.valueAt(r2)     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.f r3 = (com.facebook.imagepipeline.memory.C14075f) r3     // Catch:{ all -> 0x008c }
        L_0x0050:
            if (r0 <= 0) goto L_0x0066
            java.lang.Object r4 = r3.mo26334b()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0066
            r7.mo26306b((V) r4)     // Catch:{ all -> 0x008c }
            int r4 = r3.f36789a     // Catch:{ all -> 0x008c }
            int r0 = r0 - r4
            com.facebook.imagepipeline.memory.a$a r4 = r7.f36736f     // Catch:{ all -> 0x008c }
            int r5 = r3.f36789a     // Catch:{ all -> 0x008c }
            r4.mo26313b(r5)     // Catch:{ all -> 0x008c }
            goto L_0x0050
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x0069:
            r7.m28747f()     // Catch:{ all -> 0x008c }
            boolean r0 = com.facebook.common.p921e.C13697a.m27683a(r1)     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x008a
            java.lang.Class<?> r0 = r7.f36737g     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "trimToSize: TargetSize = %d; Final Size = %d"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.a$a r2 = r7.f36735e     // Catch:{ all -> 0x008c }
            int r2 = r2.f36741b     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.a$a r3 = r7.f36736f     // Catch:{ all -> 0x008c }
            int r3 = r3.f36741b     // Catch:{ all -> 0x008c }
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x008c }
            com.facebook.common.p921e.C13697a.m27674a(r0, r1, r8, r2)     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r7)
            return
        L_0x008c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.C14059a.mo26340f(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006b, code lost:
        r0 = mo26305b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r5.f36735e.mo26313b(r2);
        r2 = m28750h(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        if (r2 != null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007a, code lost:
        r2.mo26335c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007e, code lost:
        com.facebook.common.p920d.C13696m.m27665a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.facebook.common.p920d.C13689i.m27657b(r5.f36734d.add(r0));
        m28745d();
        m28747f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0095, code lost:
        if (com.facebook.common.p921e.C13697a.m27683a(2) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        com.facebook.common.p921e.C13697a.m27674a(r5.f36737g, "get (alloc) (object, size) = (%x, %s)", (java.lang.Object) java.lang.Integer.valueOf(java.lang.System.identityHashCode(r0)), (java.lang.Object) java.lang.Integer.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ab, code lost:
        return r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo25599a(int r6) {
        /*
            r5 = this;
            r5.m28743b()
            int r6 = r5.mo26307c(r6)
            monitor-enter(r5)
            com.facebook.imagepipeline.memory.f r0 = r5.m28750h(r6)     // Catch:{ all -> 0x00c4 }
            r1 = 2
            if (r0 == 0) goto L_0x004e
            java.lang.Object r2 = r5.mo26303a(r0)     // Catch:{ all -> 0x00c4 }
            if (r2 == 0) goto L_0x004e
            java.util.Set<V> r6 = r5.f36734d     // Catch:{ all -> 0x00c4 }
            boolean r6 = r6.add(r2)     // Catch:{ all -> 0x00c4 }
            com.facebook.common.p920d.C13689i.m27657b(r6)     // Catch:{ all -> 0x00c4 }
            int r6 = r5.mo26308c((V) r2)     // Catch:{ all -> 0x00c4 }
            int r0 = r5.mo26309d(r6)     // Catch:{ all -> 0x00c4 }
            com.facebook.imagepipeline.memory.a$a r3 = r5.f36735e     // Catch:{ all -> 0x00c4 }
            r3.mo26312a(r0)     // Catch:{ all -> 0x00c4 }
            com.facebook.imagepipeline.memory.a$a r3 = r5.f36736f     // Catch:{ all -> 0x00c4 }
            r3.mo26313b(r0)     // Catch:{ all -> 0x00c4 }
            r5.m28747f()     // Catch:{ all -> 0x00c4 }
            boolean r0 = com.facebook.common.p921e.C13697a.m27683a(r1)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x004c
            java.lang.Class<?> r0 = r5.f36737g     // Catch:{ all -> 0x00c4 }
            java.lang.String r1 = "get (reuse) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r2)     // Catch:{ all -> 0x00c4 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00c4 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00c4 }
            com.facebook.common.p921e.C13697a.m27674a(r0, r1, r3, r6)     // Catch:{ all -> 0x00c4 }
        L_0x004c:
            monitor-exit(r5)     // Catch:{ all -> 0x00c4 }
            return r2
        L_0x004e:
            int r2 = r5.mo26309d(r6)     // Catch:{ all -> 0x00c4 }
            boolean r3 = r5.m28751i(r2)     // Catch:{ all -> 0x00c4 }
            if (r3 == 0) goto L_0x00b2
            com.facebook.imagepipeline.memory.a$a r3 = r5.f36735e     // Catch:{ all -> 0x00c4 }
            r3.mo26312a(r2)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x0065
            int r3 = r0.f36793e     // Catch:{ all -> 0x00c4 }
            int r3 = r3 + 1
            r0.f36793e = r3     // Catch:{ all -> 0x00c4 }
        L_0x0065:
            monitor-exit(r5)     // Catch:{ all -> 0x00c4 }
            r0 = 0
            java.lang.Object r3 = r5.mo26305b(r6)     // Catch:{ Throwable -> 0x006d }
            r0 = r3
            goto L_0x0081
        L_0x006d:
            r3 = move-exception
            monitor-enter(r5)
            com.facebook.imagepipeline.memory.a$a r4 = r5.f36735e     // Catch:{ all -> 0x00af }
            r4.mo26313b(r2)     // Catch:{ all -> 0x00af }
            com.facebook.imagepipeline.memory.f r2 = r5.m28750h(r6)     // Catch:{ all -> 0x00af }
            if (r2 == 0) goto L_0x007d
            r2.mo26335c()     // Catch:{ all -> 0x00af }
        L_0x007d:
            monitor-exit(r5)     // Catch:{ all -> 0x00af }
            com.facebook.common.p920d.C13696m.m27665a(r3)
        L_0x0081:
            monitor-enter(r5)
            java.util.Set<V> r2 = r5.f36734d     // Catch:{ all -> 0x00ac }
            boolean r2 = r2.add(r0)     // Catch:{ all -> 0x00ac }
            com.facebook.common.p920d.C13689i.m27657b(r2)     // Catch:{ all -> 0x00ac }
            r5.m28745d()     // Catch:{ all -> 0x00ac }
            r5.m28747f()     // Catch:{ all -> 0x00ac }
            boolean r1 = com.facebook.common.p921e.C13697a.m27683a(r1)     // Catch:{ all -> 0x00ac }
            if (r1 == 0) goto L_0x00aa
            java.lang.Class<?> r1 = r5.f36737g     // Catch:{ all -> 0x00ac }
            java.lang.String r2 = "get (alloc) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x00ac }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00ac }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00ac }
            com.facebook.common.p921e.C13697a.m27674a(r1, r2, r3, r6)     // Catch:{ all -> 0x00ac }
        L_0x00aa:
            monitor-exit(r5)     // Catch:{ all -> 0x00ac }
            return r0
        L_0x00ac:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ac }
            throw r6
        L_0x00af:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00af }
            throw r6
        L_0x00b2:
            com.facebook.imagepipeline.memory.a$c r6 = new com.facebook.imagepipeline.memory.a$c     // Catch:{ all -> 0x00c4 }
            com.facebook.imagepipeline.memory.ad r0 = r5.f36732b     // Catch:{ all -> 0x00c4 }
            int r0 = r0.f36772a     // Catch:{ all -> 0x00c4 }
            com.facebook.imagepipeline.memory.a$a r1 = r5.f36735e     // Catch:{ all -> 0x00c4 }
            int r1 = r1.f36741b     // Catch:{ all -> 0x00c4 }
            com.facebook.imagepipeline.memory.a$a r3 = r5.f36736f     // Catch:{ all -> 0x00c4 }
            int r3 = r3.f36741b     // Catch:{ all -> 0x00c4 }
            r6.<init>(r0, r1, r3, r2)     // Catch:{ all -> 0x00c4 }
            throw r6     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00c4 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.C14059a.mo25599a(int):java.lang.Object");
    }

    /* renamed from: a */
    public final void mo25598a(C13703b bVar) {
        int i;
        ArrayList arrayList;
        synchronized (this) {
            if (this.f36732b.f36777f) {
                arrayList = new ArrayList(this.f36733c.size());
                int size = this.f36733c.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C14075f fVar = (C14075f) this.f36733c.valueAt(i2);
                    int i3 = fVar.f36789a;
                    int i4 = fVar.f36790b;
                    int i5 = fVar.f36793e;
                    if (fVar.mo26332a() > 0) {
                        arrayList.add(fVar);
                    }
                    this.f36733c.setValueAt(i2, new C14075f(mo26309d(i3), i4, i5, this.f36732b.f36777f));
                }
            } else {
                arrayList = new ArrayList(this.f36733c.size());
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (int i6 = 0; i6 < this.f36733c.size(); i6++) {
                    C14075f fVar2 = (C14075f) this.f36733c.valueAt(i6);
                    if (fVar2.mo26332a() > 0) {
                        arrayList.add(fVar2);
                    }
                    sparseIntArray.put(this.f36733c.keyAt(i6), fVar2.f36793e);
                }
                m28742a(sparseIntArray);
            }
            C14060a aVar = this.f36736f;
            aVar.f36740a = 0;
            aVar.f36741b = 0;
            m28747f();
        }
        for (i = 0; i < arrayList.size(); i++) {
            C14075f fVar3 = (C14075f) arrayList.get(i);
            while (true) {
                Object b = fVar3.mo26334b();
                if (b == null) {
                    break;
                }
                mo26306b((V) b);
            }
        }
    }

    /* renamed from: a */
    public final void mo25600a(V v) {
        boolean z;
        C13689i.m27652a(v);
        int c = mo26308c(v);
        int d = mo26309d(c);
        synchronized (this) {
            C14075f g = m28749g(c);
            boolean z2 = false;
            if (!this.f36734d.remove(v)) {
                C13697a.m27694c(this.f36737g, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(c));
                mo26306b(v);
            } else {
                if (g != null) {
                    if (g.f36793e + g.mo26332a() > g.f36790b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && !m28746e()) {
                        if (mo26310d(v)) {
                            C13689i.m27652a(v);
                            if (g.f36792d) {
                                if (g.f36793e > 0) {
                                    z2 = true;
                                }
                                C13689i.m27657b(z2);
                                g.f36793e--;
                                g.mo26333a(v);
                            } else if (g.f36793e > 0) {
                                g.f36793e--;
                                g.mo26333a(v);
                            } else {
                                C13697a.m27697c("BUCKET", "Tried to release value %s from an empty bucket!", v);
                            }
                            this.f36736f.mo26312a(d);
                            this.f36735e.mo26313b(d);
                            if (C13697a.m27683a(2)) {
                                C13697a.m27674a(this.f36737g, "release (reuse) (object, size) = (%x, %s)", (Object) Integer.valueOf(System.identityHashCode(v)), (Object) Integer.valueOf(c));
                            }
                        }
                    }
                }
                if (g != null) {
                    g.mo26335c();
                }
                if (C13697a.m27683a(2)) {
                    C13697a.m27674a(this.f36737g, "release (free) (object, size) = (%x, %s)", (Object) Integer.valueOf(System.identityHashCode(v)), (Object) Integer.valueOf(c));
                }
                mo26306b(v);
                this.f36735e.mo26313b(d);
            }
            m28747f();
        }
    }

    public C14059a(C13705d dVar, C14068ad adVar, C14069ae aeVar) {
        this.f36731a = (C13705d) C13689i.m27652a(dVar);
        this.f36732b = (C14068ad) C13689i.m27652a(adVar);
        this.f36739i = (C14069ae) C13689i.m27652a(aeVar);
        this.f36733c = new SparseArray<>();
        if (this.f36732b.f36777f) {
            m28744c();
        } else {
            m28742a(new SparseIntArray(0));
        }
        this.f36734d = Collections.newSetFromMap(new IdentityHashMap());
        this.f36736f = new C14060a();
        this.f36735e = new C14060a();
    }
}
