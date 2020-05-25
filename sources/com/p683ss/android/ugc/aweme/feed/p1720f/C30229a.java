package com.p683ss.android.ugc.aweme.feed.p1720f;

import com.C2240a;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.feed.f.a */
public final class C30229a<K, V> {

    /* renamed from: a */
    final LinkedHashMap<K, V> f78954a = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: b */
    private int f78955b;

    /* renamed from: c */
    private int f78956c = 31;

    /* renamed from: d */
    private int f78957d;

    /* renamed from: e */
    private int f78958e;

    /* renamed from: f */
    private int f78959f;

    /* renamed from: g */
    private int f78960g;

    /* renamed from: b */
    private int m70989b(K k, V v) {
        return 1;
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f78959f + this.f78960g;
        if (i2 != 0) {
            i = (this.f78959f * 100) / i2;
        } else {
            i = 0;
        }
        return C2240a.m6773a(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f78956c), Integer.valueOf(this.f78959f), Integer.valueOf(this.f78960g), Integer.valueOf(i)});
    }

    public C30229a(int i) {
    }

    /* renamed from: a */
    public final V mo60571a(K k) {
        if (k != null) {
            synchronized (this) {
                V v = this.f78954a.get(k);
                if (v != null) {
                    this.f78959f++;
                    return v;
                }
                this.f78960g++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m70988a(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.f78955b     // Catch:{ all -> 0x006d }
            if (r0 < 0) goto L_0x004e
            java.util.LinkedHashMap<K, V> r0 = r3.f78954a     // Catch:{ all -> 0x006d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0011
            int r0 = r3.f78955b     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x004e
        L_0x0011:
            int r0 = r3.f78955b     // Catch:{ all -> 0x006d }
            if (r0 <= r4) goto L_0x004c
            java.util.LinkedHashMap<K, V> r0 = r3.f78954a     // Catch:{ all -> 0x006d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x001e
            goto L_0x004c
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r3.f78954a     // Catch:{ all -> 0x006d }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x006d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x006d }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x006d }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x006d }
            java.util.LinkedHashMap<K, V> r2 = r3.f78954a     // Catch:{ all -> 0x006d }
            r2.remove(r1)     // Catch:{ all -> 0x006d }
            int r2 = r3.f78955b     // Catch:{ all -> 0x006d }
            int r0 = r3.m70989b(r1, r0)     // Catch:{ all -> 0x006d }
            int r2 = r2 - r0
            r3.f78955b = r2     // Catch:{ all -> 0x006d }
            int r0 = r3.f78958e     // Catch:{ all -> 0x006d }
            int r0 = r0 + 1
            r3.f78958e = r0     // Catch:{ all -> 0x006d }
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            goto L_0x0000
        L_0x004c:
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            return
        L_0x004e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r0.<init>()     // Catch:{ all -> 0x006d }
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x006d }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x006d }
            r0.append(r1)     // Catch:{ all -> 0x006d }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x006d }
            r4.<init>(r0)     // Catch:{ all -> 0x006d }
            throw r4     // Catch:{ all -> 0x006d }
        L_0x006d:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1720f.C30229a.m70988a(int):void");
    }

    /* renamed from: a */
    public final V mo60572a(K k, V v) {
        V put;
        if (k != null) {
            synchronized (this) {
                this.f78957d++;
                this.f78955b += m70989b(k, v);
                put = this.f78954a.put(k, v);
                if (put != null) {
                    this.f78955b -= m70989b(k, put);
                }
            }
            m70988a(this.f78956c);
            return put;
        }
        throw new NullPointerException("key == null || value == null");
    }
}
