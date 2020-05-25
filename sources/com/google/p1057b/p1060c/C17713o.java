package com.google.p1057b.p1060c;

import java.util.Arrays;

/* renamed from: com.google.b.c.o */
final class C17713o<K, V> extends C17702m<K, V> {

    /* renamed from: g */
    transient long[] f49450g;

    /* renamed from: h */
    private transient int f49451h;

    /* renamed from: i */
    private transient int f49452i;

    /* renamed from: j */
    private final boolean f49453j;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo34423a() {
        return this.f49451h;
    }

    C17713o() {
        this(3);
    }

    public final void clear() {
        super.clear();
        this.f49451h = -2;
        this.f49452i = -2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int mo34435e(int i) {
        return (int) this.f49450g[i];
    }

    C17713o(int i) {
        this(i, 1.0f, false);
    }

    /* renamed from: f */
    private int m43519f(int i) {
        return (int) (this.f49450g[i] >>> 32);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo34429b(int i) {
        super.mo34429b(i);
        this.f49450g = Arrays.copyOf(this.f49450g, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo34426a(int i) {
        if (this.f49453j) {
            m43518b(m43519f(i), mo34435e(i));
            m43518b(this.f49452i, i);
            m43518b(i, -2);
            this.f49419e++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo34434d(int i) {
        int size = size() - 1;
        m43518b(m43519f(i), mo34435e(i));
        if (i < size) {
            m43518b(m43519f(size), i);
            m43518b(i, mo34435e(size));
        }
        super.mo34434d(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo34424a(int i, int i2) {
        if (i >= size()) {
            return i2;
        }
        return i;
    }

    /* renamed from: b */
    private void m43518b(int i, int i2) {
        if (i == -2) {
            this.f49451h = i2;
        } else {
            this.f49450g[i] = (this.f49450g[i] & -4294967296L) | (((long) i2) & 4294967295L);
        }
        if (i2 == -2) {
            this.f49452i = i;
        } else {
            this.f49450g[i2] = (4294967295L & this.f49450g[i2]) | (((long) i) << 32);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo34427a(int i, float f) {
        super.mo34427a(i, f);
        this.f49451h = -2;
        this.f49452i = -2;
        this.f49450g = new long[i];
        Arrays.fill(this.f49450g, -1);
    }

    private C17713o(int i, float f, boolean z) {
        super(i, 1.0f);
        this.f49453j = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo34428a(int i, K k, V v, int i2) {
        super.mo34428a(i, k, v, i2);
        m43518b(this.f49452i, i);
        m43518b(i, -2);
    }
}
