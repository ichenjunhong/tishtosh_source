package p064c.p065a.p072e.p083f;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p064c.p065a.p072e.p075c.C1754h;
import p064c.p065a.p072e.p087j.C2140m;

/* renamed from: c.a.e.f.b */
public final class C2071b<E> extends AtomicReferenceArray<E> implements C1754h<E> {

    /* renamed from: f */
    private static final Integer f6728f = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;

    /* renamed from: a */
    final int f6729a = (length() - 1);

    /* renamed from: b */
    final AtomicLong f6730b = new AtomicLong();

    /* renamed from: c */
    long f6731c;

    /* renamed from: d */
    final AtomicLong f6732d = new AtomicLong();

    /* renamed from: e */
    final int f6733e;

    /* renamed from: a */
    private static int m6345a(long j, int i) {
        return ((int) j) & i;
    }

    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public final boolean isEmpty() {
        if (this.f6730b.get() == this.f6732d.get()) {
            return true;
        }
        return false;
    }

    public final E poll() {
        long j = this.f6732d.get();
        int i = ((int) j) & this.f6729a;
        E a = m6346a(i);
        if (a == null) {
            return null;
        }
        this.f6732d.lazySet(j + 1);
        m6347a(i, (E) null);
        return a;
    }

    /* renamed from: a */
    private E m6346a(int i) {
        return get(i);
    }

    public C2071b(int i) {
        super(C2140m.m6437a(i));
        this.f6733e = Math.min(i / 4, f6728f.intValue());
    }

    public final boolean offer(E e) {
        if (e != null) {
            int i = this.f6729a;
            long j = this.f6730b.get();
            int a = m6345a(j, i);
            if (j >= this.f6731c) {
                long j2 = ((long) this.f6733e) + j;
                if (m6346a(m6345a(j2, i)) == null) {
                    this.f6731c = j2;
                } else if (m6346a(a) != null) {
                    return false;
                }
            }
            m6347a(a, e);
            this.f6730b.lazySet(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    /* renamed from: a */
    private void m6347a(int i, E e) {
        lazySet(i, e);
    }

    public final boolean offer(E e, E e2) {
        if (!offer(e) || !offer(e2)) {
            return false;
        }
        return true;
    }
}
