package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: kotlinx.coroutines.internal.k */
public final class C53320k<E> {

    /* renamed from: b */
    public static final /* synthetic */ AtomicLongFieldUpdater f131944b = AtomicLongFieldUpdater.newUpdater(C53320k.class, "_state$internal");

    /* renamed from: e */
    public static final C53332u f131945e = new C53332u("REMOVE_FROZEN");

    /* renamed from: f */
    public static final C53321a f131946f = new C53321a(null);

    /* renamed from: g */
    private static final AtomicReferenceFieldUpdater f131947g = AtomicReferenceFieldUpdater.newUpdater(C53320k.class, Object.class, "_next");
    private volatile Object _next;
    public volatile /* synthetic */ long _state$internal;

    /* renamed from: a */
    public final int f131948a = (this.f131951h - 1);

    /* renamed from: c */
    public final AtomicReferenceArray<Object> f131949c = new AtomicReferenceArray<>(this.f131951h);

    /* renamed from: d */
    public final boolean f131950d;

    /* renamed from: h */
    private final int f131951h;

    /* renamed from: kotlinx.coroutines.internal.k$a */
    public static final class C53321a {
        private C53321a() {
        }

        /* renamed from: a */
        public static int m113335a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: a */
        public static long m113336a(long j, long j2) {
            return j & (j2 ^ -1);
        }

        public /* synthetic */ C53321a(C52707g gVar) {
            this();
        }

        /* renamed from: b */
        public final long mo110922b(long j, int i) {
            return m113336a(j, 1152921503533105152L) | (((long) i) << 30);
        }

        /* renamed from: a */
        public final long mo110921a(long j, int i) {
            return m113336a(j, 1073741823) | (((long) i) << 0);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.k$b */
    public static final class C53322b {

        /* renamed from: a */
        public final int f131952a;

        public C53322b(int i) {
            this.f131952a = i;
        }
    }

    /* renamed from: c */
    public final C53320k<E> mo110920c() {
        return m113327a(m113329d());
    }

    /* renamed from: d */
    private final long m113329d() {
        long j;
        long j2;
        do {
            j = this._state$internal;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f131944b.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: b */
    public final boolean mo110919b() {
        long j;
        do {
            j = this._state$internal;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f131944b.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: a */
    public final boolean mo110918a() {
        long j = this._state$internal;
        if (((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final C53320k<E> m113327a(long j) {
        while (true) {
            C53320k<E> kVar = (C53320k) this._next;
            if (kVar != null) {
                return kVar;
            }
            f131947g.compareAndSet(this, null, m113328b(j));
        }
    }

    /* renamed from: b */
    private final C53320k<E> m113328b(long j) {
        C53320k<E> kVar = new C53320k<>(this.f131951h * 2, this.f131950d);
        int i = (int) ((1152921503533105152L & j) >> 30);
        for (int i2 = (int) ((1073741823 & j) >> 0); (this.f131948a & i2) != (this.f131948a & i); i2++) {
            AtomicReferenceArray<Object> atomicReferenceArray = kVar.f131949c;
            int i3 = kVar.f131948a & i2;
            Object obj = this.f131949c.get(this.f131948a & i2);
            if (obj == null) {
                obj = new C53322b(i2);
            }
            atomicReferenceArray.set(i3, obj);
        }
        kVar._state$internal = C53321a.m113336a(j, 1152921504606846976L);
        return kVar;
    }

    /* renamed from: a */
    public final int mo110916a(E e) {
        C52711k.m112240b(e, "element");
        while (true) {
            long j = this._state$internal;
            if ((3458764513820540928L & j) != 0) {
                return C53321a.m113335a(j);
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f131948a;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (this.f131950d || this.f131949c.get(i2 & i3) == null) {
                int i4 = (i2 + 1) & 1073741823;
                if (f131944b.compareAndSet(this, j, f131946f.mo110922b(j, i4))) {
                    this.f131949c.set(i2 & i3, e);
                    C53320k kVar = this;
                    while ((kVar._state$internal & 1152921504606846976L) != 0) {
                        kVar = kVar.mo110920c().m113326a(i2, e);
                        if (kVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else if (this.f131951h < 1024 || ((i2 - i) & 1073741823) > (this.f131951h >> 1)) {
                return 1;
            }
        }
        return 1;
    }

    /* renamed from: a */
    private final C53320k<E> m113326a(int i, E e) {
        Object obj = this.f131949c.get(this.f131948a & i);
        if (!(obj instanceof C53322b) || ((C53322b) obj).f131952a != i) {
            return null;
        }
        this.f131949c.set(i & this.f131948a, e);
        return this;
    }

    public C53320k(int i, boolean z) {
        boolean z2;
        this.f131951h = i;
        this.f131950d = z;
        boolean z3 = true;
        if (this.f131948a <= 1073741823) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if ((this.f131951h & this.f131948a) != 0) {
                z3 = false;
            }
            if (!z3) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    public final C53320k<E> mo110917a(int i, int i2) {
        long j;
        int i3;
        do {
            j = this._state$internal;
            boolean z = false;
            i3 = (int) ((1073741823 & j) >> 0);
            if (i3 == i) {
                z = true;
            }
            if (!z) {
                throw new IllegalStateException("This queue can have only one consumer".toString());
            } else if ((1152921504606846976L & j) != 0) {
                return mo110920c();
            }
        } while (!f131944b.compareAndSet(this, j, f131946f.mo110921a(j, i2)));
        this.f131949c.set(this.f131948a & i3, null);
        return null;
    }
}
