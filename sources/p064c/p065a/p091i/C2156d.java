package p064c.p065a.p091i;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.p2692b.C53695c;
import org.p2692b.C53696d;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p083f.C2072c;
import p064c.p065a.p072e.p086i.C2117a;
import p064c.p065a.p072e.p086i.C2119c;
import p064c.p065a.p072e.p086i.C2122f;
import p064c.p065a.p072e.p087j.C2127d;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.i.d */
public final class C2156d<T> extends C2152a<T> {

    /* renamed from: a */
    final C2072c<T> f6945a;

    /* renamed from: c */
    final AtomicReference<Runnable> f6946c;

    /* renamed from: d */
    final boolean f6947d;

    /* renamed from: e */
    volatile boolean f6948e;

    /* renamed from: f */
    Throwable f6949f;

    /* renamed from: g */
    final AtomicReference<C53695c<? super T>> f6950g;

    /* renamed from: h */
    volatile boolean f6951h;

    /* renamed from: i */
    final AtomicBoolean f6952i;

    /* renamed from: j */
    final C2117a<T> f6953j;

    /* renamed from: k */
    final AtomicLong f6954k;

    /* renamed from: l */
    boolean f6955l;

    /* renamed from: c.a.i.d$a */
    final class C2157a extends C2117a<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public final void clear() {
            C2156d.this.f6945a.clear();
        }

        public final boolean isEmpty() {
            return C2156d.this.f6945a.isEmpty();
        }

        public final T poll() {
            return C2156d.this.f6945a.poll();
        }

        public final void cancel() {
            if (!C2156d.this.f6951h) {
                C2156d.this.f6951h = true;
                C2156d.this.mo6460g();
                if (!C2156d.this.f6955l && C2156d.this.f6953j.getAndIncrement() == 0) {
                    C2156d.this.f6945a.clear();
                    C2156d.this.f6950g.lazySet(null);
                }
            }
        }

        C2157a() {
        }

        public final int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            C2156d.this.f6955l = true;
            return 2;
        }

        public final void request(long j) {
            if (C2122f.validate(j)) {
                C2127d.m6415a(C2156d.this.f6954k, j);
                C2156d.this.mo6461h();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final void mo6460g() {
        Runnable runnable = (Runnable) this.f6946c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void onComplete() {
        if (!this.f6948e && !this.f6951h) {
            this.f6948e = true;
            mo6460g();
            mo6461h();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6461h() {
        /*
            r17 = this;
            r6 = r17
            c.a.e.i.a<T> r0 = r6.f6953j
            int r0 = r0.getAndIncrement()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReference<org.b.c<? super T>> r0 = r6.f6950g
            java.lang.Object r0 = r0.get()
            org.b.c r0 = (org.p2692b.C53695c) r0
            r7 = 1
            r8 = r0
            r0 = 1
        L_0x0016:
            if (r8 == 0) goto L_0x00dd
            boolean r0 = r6.f6955l
            if (r0 == 0) goto L_0x006b
            c.a.e.f.c<T> r0 = r6.f6945a
            boolean r1 = r6.f6947d
            r1 = r1 ^ r7
        L_0x0021:
            boolean r2 = r6.f6951h
            r3 = 0
            if (r2 == 0) goto L_0x0030
            r0.clear()
            java.util.concurrent.atomic.AtomicReference<org.b.c<? super T>> r0 = r6.f6950g
            r0.lazySet(r3)
            goto L_0x00dc
        L_0x0030:
            boolean r2 = r6.f6948e
            if (r1 == 0) goto L_0x0049
            if (r2 == 0) goto L_0x0049
            java.lang.Throwable r4 = r6.f6949f
            if (r4 == 0) goto L_0x0049
            r0.clear()
            java.util.concurrent.atomic.AtomicReference<org.b.c<? super T>> r0 = r6.f6950g
            r0.lazySet(r3)
            java.lang.Throwable r0 = r6.f6949f
            r8.onError(r0)
            goto L_0x00dc
        L_0x0049:
            r8.onNext(r3)
            if (r2 == 0) goto L_0x0060
            java.util.concurrent.atomic.AtomicReference<org.b.c<? super T>> r0 = r6.f6950g
            r0.lazySet(r3)
            java.lang.Throwable r0 = r6.f6949f
            if (r0 == 0) goto L_0x005b
            r8.onError(r0)
            goto L_0x006a
        L_0x005b:
            r8.onComplete()
            goto L_0x00dc
        L_0x0060:
            c.a.e.i.a<T> r2 = r6.f6953j
            int r3 = -r7
            int r7 = r2.addAndGet(r3)
            if (r7 == 0) goto L_0x006a
            goto L_0x0021
        L_0x006a:
            return
        L_0x006b:
            c.a.e.f.c<T> r9 = r6.f6945a
            boolean r0 = r6.f6947d
            r10 = r0 ^ 1
            r11 = 1
        L_0x0072:
            java.util.concurrent.atomic.AtomicLong r0 = r6.f6954k
            long r12 = r0.get()
            r4 = 0
        L_0x007a:
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x00a6
            boolean r2 = r6.f6948e
            java.lang.Object r3 = r9.poll()
            if (r3 != 0) goto L_0x0089
            r16 = 1
            goto L_0x008c
        L_0x0089:
            r0 = 0
            r16 = 0
        L_0x008c:
            r0 = r17
            r1 = r10
            r7 = r3
            r3 = r16
            r14 = r4
            r4 = r8
            r5 = r9
            boolean r0 = r0.m6508a(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x00dc
            if (r16 != 0) goto L_0x00a7
            r8.onNext(r7)
            r0 = 1
            long r4 = r14 + r0
            r7 = 1
            goto L_0x007a
        L_0x00a6:
            r14 = r4
        L_0x00a7:
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            boolean r2 = r6.f6948e
            boolean r3 = r9.isEmpty()
            r0 = r17
            r1 = r10
            r4 = r8
            r5 = r9
            boolean r0 = r0.m6508a(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x00dc
        L_0x00bc:
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00d1
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00d1
            java.util.concurrent.atomic.AtomicLong r0 = r6.f6954k
            long r1 = -r14
            r0.addAndGet(r1)
        L_0x00d1:
            c.a.e.i.a<T> r0 = r6.f6953j
            int r1 = -r11
            int r11 = r0.addAndGet(r1)
            if (r11 == 0) goto L_0x00dc
            r7 = 1
            goto L_0x0072
        L_0x00dc:
            return
        L_0x00dd:
            c.a.e.i.a<T> r1 = r6.f6953j
            int r0 = -r0
            int r0 = r1.addAndGet(r0)
            if (r0 == 0) goto L_0x00f2
            java.util.concurrent.atomic.AtomicReference<org.b.c<? super T>> r1 = r6.f6950g
            java.lang.Object r1 = r1.get()
            r8 = r1
            org.b.c r8 = (org.p2692b.C53695c) r8
            r7 = 1
            goto L_0x0016
        L_0x00f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p064c.p065a.p091i.C2156d.mo6461h():void");
    }

    private C2156d(int i) {
        this(i, null, true);
    }

    /* renamed from: a */
    public static <T> C2156d<T> m6507a(int i) {
        return new C2156d<>(8);
    }

    public final void onError(Throwable th) {
        C1745b.m6050a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f6948e || this.f6951h) {
            C2150a.m6492a(th);
            return;
        }
        this.f6949f = th;
        this.f6948e = true;
        mo6460g();
        mo6461h();
    }

    public final void onNext(T t) {
        C1745b.m6050a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f6948e && !this.f6951h) {
            this.f6945a.offer(t);
            mo6461h();
        }
    }

    public final void onSubscribe(C53696d dVar) {
        if (this.f6948e || this.f6951h) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    /* renamed from: b */
    public final void mo6264b(C53695c<? super T> cVar) {
        if (this.f6952i.get() || !this.f6952i.compareAndSet(false, true)) {
            C2119c.error(new IllegalStateException("This processor allows only a single Subscriber"), cVar);
            return;
        }
        cVar.onSubscribe(this.f6953j);
        this.f6950g.set(cVar);
        if (this.f6951h) {
            this.f6950g.lazySet(null);
        } else {
            mo6461h();
        }
    }

    private C2156d(int i, Runnable runnable, boolean z) {
        this.f6945a = new C2072c<>(C1745b.m6048a(i, "capacityHint"));
        this.f6946c = new AtomicReference<>(null);
        this.f6947d = true;
        this.f6950g = new AtomicReference<>();
        this.f6952i = new AtomicBoolean();
        this.f6953j = new C2157a();
        this.f6954k = new AtomicLong();
    }

    /* renamed from: a */
    private boolean m6508a(boolean z, boolean z2, boolean z3, C53695c<? super T> cVar, C2072c<T> cVar2) {
        if (this.f6951h) {
            cVar2.clear();
            this.f6950g.lazySet(null);
            return true;
        }
        if (z2) {
            if (z && this.f6949f != null) {
                cVar2.clear();
                this.f6950g.lazySet(null);
                cVar.onError(this.f6949f);
                return true;
            } else if (z3) {
                Throwable th = this.f6949f;
                this.f6950g.lazySet(null);
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
        }
        return false;
    }
}
