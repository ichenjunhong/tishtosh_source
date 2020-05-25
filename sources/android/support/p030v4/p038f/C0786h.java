package android.support.p030v4.p038f;

import com.C2240a;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: android.support.v4.f.h */
public class C0786h<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f2689a;

    /* renamed from: b */
    private int f2690b;

    /* renamed from: c */
    private int f2691c;

    /* renamed from: d */
    private int f2692d;

    /* renamed from: e */
    private int f2693e;

    /* renamed from: f */
    private int f2694f;

    /* renamed from: g */
    private int f2695g;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo2506b(K k, V v) {
        return 1;
    }

    /* renamed from: a */
    public final void mo2503a() {
        mo2504a(-1);
    }

    /* renamed from: b */
    public final synchronized int mo2505b() {
        return this.f2690b;
    }

    /* renamed from: c */
    public final synchronized Map<K, V> mo2508c() {
        return new LinkedHashMap(this.f2689a);
    }

    public final synchronized String toString() {
        int i;
        int i2 = this.f2694f + this.f2695g;
        if (i2 != 0) {
            i = (this.f2694f * 100) / i2;
        } else {
            i = 0;
        }
        return C2240a.m6773a(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f2691c), Integer.valueOf(this.f2694f), Integer.valueOf(this.f2695g), Integer.valueOf(i)});
    }

    public C0786h(int i) {
        if (i > 0) {
            this.f2691c = i;
            this.f2689a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: a */
    public final V mo2501a(K k) {
        if (k != null) {
            synchronized (this) {
                V v = this.f2689a.get(k);
                if (v != null) {
                    this.f2694f++;
                    return v;
                }
                this.f2695g++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    /* renamed from: b */
    public final V mo2507b(K k) {
        V remove;
        if (k != null) {
            synchronized (this) {
                remove = this.f2689a.remove(k);
                if (remove != null) {
                    this.f2690b -= m2240c(k, remove);
                }
            }
            return remove;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        throw new java.lang.IllegalStateException(r0.toString());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2504a(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.f2690b     // Catch:{ all -> 0x006d }
            if (r0 < 0) goto L_0x004e
            java.util.LinkedHashMap<K, V> r0 = r3.f2689a     // Catch:{ all -> 0x006d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0011
            int r0 = r3.f2690b     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x004e
        L_0x0011:
            int r0 = r3.f2690b     // Catch:{ all -> 0x006d }
            if (r0 <= r4) goto L_0x004c
            java.util.LinkedHashMap<K, V> r0 = r3.f2689a     // Catch:{ all -> 0x006d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x001e
            goto L_0x004c
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r3.f2689a     // Catch:{ all -> 0x006d }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x006d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x006d }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x006d }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x006d }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x006d }
            java.util.LinkedHashMap<K, V> r2 = r3.f2689a     // Catch:{ all -> 0x006d }
            r2.remove(r1)     // Catch:{ all -> 0x006d }
            int r2 = r3.f2690b     // Catch:{ all -> 0x006d }
            int r0 = r3.m2240c(r1, r0)     // Catch:{ all -> 0x006d }
            int r2 = r2 - r0
            r3.f2690b = r2     // Catch:{ all -> 0x006d }
            int r0 = r3.f2693e     // Catch:{ all -> 0x006d }
            int r0 = r0 + 1
            r3.f2693e = r0     // Catch:{ all -> 0x006d }
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.p030v4.p038f.C0786h.mo2504a(int):void");
    }

    /* renamed from: c */
    private int m2240c(K k, V v) {
        int b = mo2506b(k, v);
        if (b >= 0) {
            return b;
        }
        StringBuilder sb = new StringBuilder("Negative size: ");
        sb.append(k);
        sb.append("=");
        sb.append(v);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final V mo2502a(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f2692d++;
            this.f2690b += m2240c(k, v);
            put = this.f2689a.put(k, v);
            if (put != null) {
                this.f2690b -= m2240c(k, put);
            }
        }
        mo2504a(this.f2691c);
        return put;
    }
}
