package com.google.p1057b.p1060c;

import com.google.p1057b.p1058a.C17417i;
import com.google.p1057b.p1058a.C17421k;
import com.google.p1057b.p1060c.C17624aw.C17625a;
import java.util.Arrays;

/* renamed from: com.google.b.c.ba */
final class C17636ba<K> {

    /* renamed from: a */
    transient Object[] f49311a;

    /* renamed from: b */
    transient int[] f49312b;

    /* renamed from: c */
    public transient int f49313c;

    /* renamed from: d */
    transient int f49314d;

    /* renamed from: e */
    transient int[] f49315e;

    /* renamed from: f */
    transient long[] f49316f;

    /* renamed from: g */
    private transient float f49317g;

    /* renamed from: h */
    private transient int f49318h;

    /* renamed from: com.google.b.c.ba$a */
    class C17637a extends C17627a<K> {

        /* renamed from: a */
        final K f49319a;

        /* renamed from: b */
        int f49320b;

        /* renamed from: a */
        public final K mo34201a() {
            return this.f49319a;
        }

        /* renamed from: b */
        public final int mo34202b() {
            if (this.f49320b == -1 || this.f49320b >= C17636ba.this.f49313c || !C17417i.m42646a(this.f49319a, C17636ba.this.f49311a[this.f49320b])) {
                this.f49320b = C17636ba.this.mo34225a((Object) this.f49319a);
            }
            if (this.f49320b == -1) {
                return 0;
            }
            return C17636ba.this.f49312b[this.f49320b];
        }

        C17637a(int i) {
            this.f49319a = C17636ba.this.f49311a[i];
            this.f49320b = i;
        }
    }

    /* renamed from: a */
    private static int m43336a(long j) {
        return (int) (j >>> 32);
    }

    /* renamed from: a */
    private static long m43337a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    /* renamed from: b */
    private static int m43341b(long j) {
        return (int) j;
    }

    /* renamed from: b */
    private int m43340b() {
        return this.f49315e.length - 1;
    }

    C17636ba() {
        m43338a(3, 1.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo34223a() {
        if (this.f49313c == 0) {
            return -1;
        }
        return 0;
    }

    C17636ba(int i) {
        this(i, 1.0f);
    }

    /* renamed from: f */
    private static int[] m43342f(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    /* renamed from: g */
    private static long[] m43343g(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    /* renamed from: b */
    public final int mo34227b(Object obj) {
        int a = mo34225a(obj);
        if (a == -1) {
            return 0;
        }
        return this.f49312b[a];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo34229c(int i) {
        C17421k.m42652a(i, this.f49313c);
        return this.f49312b[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final C17625a<K> mo34230d(int i) {
        C17421k.m42652a(i, this.f49313c);
        return new C17637a(i);
    }

    /* renamed from: h */
    private void m43344h(int i) {
        int length = this.f49316f.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                m43345i(max);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final K mo34228b(int i) {
        C17421k.m42652a(i, this.f49313c);
        return this.f49311a[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo34231e(int i) {
        if (i > this.f49316f.length) {
            m43345i(i);
        }
        if (i >= this.f49318h) {
            m43346j(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    C17636ba(C17636ba<? extends K> baVar) {
        m43338a(baVar.f49313c, 1.0f);
        int a = baVar.mo34223a();
        while (a != -1) {
            mo34226a((K) baVar.mo34228b(a), baVar.mo34229c(a));
            a = baVar.mo34224a(a);
        }
    }

    /* renamed from: i */
    private void m43345i(int i) {
        this.f49311a = Arrays.copyOf(this.f49311a, i);
        this.f49312b = Arrays.copyOf(this.f49312b, i);
        long[] jArr = this.f49316f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f49316f = copyOf;
    }

    /* renamed from: j */
    private void m43346j(int i) {
        if (this.f49315e.length >= 1073741824) {
            this.f49318h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.f49317g)) + 1;
        int[] f = m43342f(i);
        long[] jArr = this.f49316f;
        int length = f.length - 1;
        for (int i3 = 0; i3 < this.f49313c; i3++) {
            int a = m43336a(jArr[i3]);
            int i4 = a & length;
            int i5 = f[i4];
            f[i4] = i3;
            jArr[i3] = (((long) a) << 32) | (4294967295L & ((long) i5));
        }
        this.f49318h = i2;
        this.f49315e = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo34224a(int i) {
        int i2 = i + 1;
        if (i2 < this.f49313c) {
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo34225a(Object obj) {
        int a = C17724y.m43537a(obj);
        int i = this.f49315e[m43340b() & a];
        while (i != -1) {
            long j = this.f49316f[i];
            if (m43336a(j) == a && C17417i.m42646a(obj, this.f49311a[i])) {
                return i;
            }
            i = m43341b(j);
        }
        return -1;
    }

    private C17636ba(int i, float f) {
        m43338a(i, 1.0f);
    }

    /* renamed from: a */
    private void m43338a(int i, float f) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17421k.m42660a(z, (Object) "Initial capacity must be non-negative");
        if (f > 0.0f) {
            z2 = true;
        }
        C17421k.m42660a(z2, (Object) "Illegal load factor");
        int a = C17724y.m43536a(i, (double) f);
        this.f49315e = m43342f(a);
        this.f49317g = f;
        this.f49311a = new Object[i];
        this.f49312b = new int[i];
        this.f49316f = m43343g(i);
        this.f49318h = Math.max(1, (int) (((float) a) * f));
    }

    /* renamed from: a */
    public final int mo34226a(K k, int i) {
        C17698k.m43480b(i, "count");
        long[] jArr = this.f49316f;
        Object[] objArr = this.f49311a;
        int[] iArr = this.f49312b;
        int a = C17724y.m43537a((Object) k);
        int b = m43340b() & a;
        int i2 = this.f49313c;
        int i3 = this.f49315e[b];
        if (i3 == -1) {
            this.f49315e[b] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (m43336a(j) != a || !C17417i.m42646a(k, objArr[i3])) {
                    int b2 = m43341b(j);
                    if (b2 == -1) {
                        jArr[i3] = m43337a(j, i2);
                        break;
                    }
                    i3 = b2;
                } else {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            int i5 = i2 + 1;
            m43344h(i5);
            m43339a(i2, k, i, a);
            this.f49313c = i5;
            if (i2 >= this.f49318h) {
                m43346j(this.f49315e.length * 2);
            }
            this.f49314d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* renamed from: a */
    private void m43339a(int i, K k, int i2, int i3) {
        this.f49316f[i] = (((long) i3) << 32) | 4294967295L;
        this.f49311a[i] = k;
        this.f49312b[i] = i2;
    }
}
