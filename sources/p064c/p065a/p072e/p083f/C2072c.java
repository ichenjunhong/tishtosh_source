package p064c.p065a.p072e.p083f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p064c.p065a.p072e.p075c.C1754h;
import p064c.p065a.p072e.p087j.C2140m;

/* renamed from: c.a.e.f.c */
public final class C2072c<T> implements C1754h<T> {

    /* renamed from: a */
    static final int f6734a = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    private static final Object f6735j = new Object();

    /* renamed from: b */
    final AtomicLong f6736b = new AtomicLong();

    /* renamed from: c */
    int f6737c;

    /* renamed from: d */
    long f6738d;

    /* renamed from: e */
    final int f6739e;

    /* renamed from: f */
    AtomicReferenceArray<Object> f6740f;

    /* renamed from: g */
    final int f6741g;

    /* renamed from: h */
    AtomicReferenceArray<Object> f6742h;

    /* renamed from: i */
    final AtomicLong f6743i = new AtomicLong();

    /* renamed from: a */
    private static int m6348a(int i) {
        return i;
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        if (this.f6736b.get() == this.f6743i.get()) {
            return true;
        }
        return false;
    }

    public final T poll() {
        boolean z;
        AtomicReferenceArray<Object> atomicReferenceArray = this.f6742h;
        long j = this.f6743i.get();
        int i = this.f6741g;
        int a = m6349a(j, i);
        T a2 = m6350a(atomicReferenceArray, a);
        if (a2 == f6735j) {
            z = true;
        } else {
            z = false;
        }
        if (a2 != null && !z) {
            m6352a(atomicReferenceArray, a, null);
            m6354b(j + 1);
            return a2;
        } else if (!z) {
            return null;
        } else {
            int a3 = m6348a(i + 1);
            AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) m6350a(atomicReferenceArray, a3);
            m6352a(atomicReferenceArray, a3, null);
            this.f6742h = atomicReferenceArray2;
            int a4 = m6349a(j, i);
            T a5 = m6350a(atomicReferenceArray2, a4);
            if (a5 != null) {
                m6352a(atomicReferenceArray2, a4, null);
                m6354b(j + 1);
            }
            return a5;
        }
    }

    /* renamed from: b */
    private void m6354b(long j) {
        this.f6743i.lazySet(j);
    }

    /* renamed from: a */
    private void m6351a(long j) {
        this.f6736b.lazySet(j);
    }

    public C2072c(int i) {
        int a = C2140m.m6437a(Math.max(8, i));
        int i2 = a - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(a + 1);
        this.f6740f = atomicReferenceArray;
        this.f6739e = i2;
        this.f6737c = Math.min(a / 4, f6734a);
        this.f6742h = atomicReferenceArray;
        this.f6741g = i2;
        this.f6738d = (long) (i2 - 1);
        m6351a(0);
    }

    public final boolean offer(T t) {
        if (t != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.f6740f;
            long j = this.f6736b.get();
            int i = this.f6739e;
            int a = m6349a(j, i);
            if (j < this.f6738d) {
                return m6353a(atomicReferenceArray, t, j, a);
            }
            long j2 = ((long) this.f6737c) + j;
            if (m6350a(atomicReferenceArray, m6349a(j2, i)) == null) {
                this.f6738d = j2 - 1;
                return m6353a(atomicReferenceArray, t, j, a);
            }
            long j3 = j + 1;
            if (m6350a(atomicReferenceArray, m6349a(j3, i)) == null) {
                return m6353a(atomicReferenceArray, t, j, a);
            }
            long j4 = (long) i;
            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
            this.f6740f = atomicReferenceArray2;
            this.f6738d = (j + j4) - 1;
            m6352a(atomicReferenceArray2, a, t);
            m6352a(atomicReferenceArray, m6348a(atomicReferenceArray.length() - 1), atomicReferenceArray2);
            m6352a(atomicReferenceArray, a, f6735j);
            m6351a(j3);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    /* renamed from: a */
    private static int m6349a(long j, int i) {
        return m6348a(((int) j) & i);
    }

    /* renamed from: a */
    private static <E> Object m6350a(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    /* renamed from: a */
    private static void m6352a(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    /* renamed from: a */
    private boolean m6353a(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        m6352a(atomicReferenceArray, i, t);
        m6351a(j + 1);
        return true;
    }
}
