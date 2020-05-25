package com.tencent.wcdb.support;

import com.C2240a;
import java.util.LinkedHashMap;

/* renamed from: com.tencent.wcdb.support.b */
public class C51789b<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f129190a;

    /* renamed from: b */
    public int f129191b;

    /* renamed from: c */
    private int f129192c;

    /* renamed from: d */
    private int f129193d;

    /* renamed from: e */
    private int f129194e;

    /* renamed from: f */
    private int f129195f;

    /* renamed from: g */
    private int f129196g;

    /* renamed from: b */
    private int m111083b(K k, V v) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo107175a(boolean z, K k, V v, V v2) {
    }

    /* renamed from: a */
    public final void mo107266a() {
        mo107267a(-1);
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f129195f + this.f129196g;
        if (i2 != 0) {
            i = (this.f129195f * 100) / i2;
        } else {
            i = 0;
        }
        return C2240a.m6772a("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f129191b), Integer.valueOf(this.f129195f), Integer.valueOf(this.f129196g), Integer.valueOf(i)});
    }

    public C51789b(int i) {
        if (i > 0) {
            this.f129191b = i;
            this.f129190a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public final V mo107264a(K k) {
        if (k != null) {
            synchronized (this) {
                V v = this.f129190a.get(k);
                if (v != null) {
                    this.f129195f++;
                    return v;
                }
                this.f129196g++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: b */
    public final V mo107268b(K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                remove = this.f129190a.remove(k);
                if (remove != null) {
                    this.f129192c -= m111083b(k, remove);
                }
            }
            if (remove != null) {
                mo107175a(false, k, remove, null);
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0086, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo107267a(int r6) {
        /*
            r5 = this;
        L_0x0000:
            monitor-enter(r5)
            int r0 = r5.f129192c     // Catch:{ all -> 0x0087 }
            if (r0 < 0) goto L_0x0068
            java.util.LinkedHashMap<K, V> r0 = r5.f129190a     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x0011
            int r0 = r5.f129192c     // Catch:{ all -> 0x0087 }
            if (r0 != 0) goto L_0x0068
        L_0x0011:
            int r0 = r5.f129192c     // Catch:{ all -> 0x0087 }
            if (r0 <= r6) goto L_0x0066
            java.util.LinkedHashMap<K, V> r0 = r5.f129190a     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0066
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r5.f129190a     // Catch:{ all -> 0x0087 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0087 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0087 }
            boolean r0 = r0.hasNext()     // Catch:{ all -> 0x0087 }
            r1 = 0
            if (r0 == 0) goto L_0x0040
            java.util.LinkedHashMap<K, V> r0 = r5.f129190a     // Catch:{ all -> 0x0087 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0087 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0087 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0087 }
            goto L_0x0041
        L_0x0040:
            r0 = r1
        L_0x0041:
            if (r0 != 0) goto L_0x0045
            monitor-exit(r5)     // Catch:{ all -> 0x0087 }
            return
        L_0x0045:
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0087 }
            java.util.LinkedHashMap<K, V> r3 = r5.f129190a     // Catch:{ all -> 0x0087 }
            r3.remove(r2)     // Catch:{ all -> 0x0087 }
            int r3 = r5.f129192c     // Catch:{ all -> 0x0087 }
            int r4 = r5.m111083b(r2, r0)     // Catch:{ all -> 0x0087 }
            int r3 = r3 - r4
            r5.f129192c = r3     // Catch:{ all -> 0x0087 }
            int r3 = r5.f129194e     // Catch:{ all -> 0x0087 }
            r4 = 1
            int r3 = r3 + r4
            r5.f129194e = r3     // Catch:{ all -> 0x0087 }
            monitor-exit(r5)     // Catch:{ all -> 0x0087 }
            r5.mo107175a(r4, r2, r0, r1)
            goto L_0x0000
        L_0x0066:
            monitor-exit(r5)     // Catch:{ all -> 0x0087 }
            return
        L_0x0068:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0087 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r0.<init>()     // Catch:{ all -> 0x0087 }
            java.lang.Class r1 = r5.getClass()     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0087 }
            r0.append(r1)     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0087 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0087 }
            r6.<init>(r0)     // Catch:{ all -> 0x0087 }
            throw r6     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0087 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wcdb.support.C51789b.mo107267a(int):void");
    }

    /* renamed from: a */
    public final V mo107265a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f129193d++;
            this.f129192c += m111083b(k, v);
            put = this.f129190a.put(k, v);
            if (put != null) {
                this.f129192c -= m111083b(k, put);
            }
        }
        if (put != null) {
            mo107175a(false, k, put, v);
        }
        mo107267a(this.f129191b);
        return put;
    }
}
