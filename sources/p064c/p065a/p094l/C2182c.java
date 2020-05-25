package p064c.p065a.p094l;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p064c.p065a.C1674ab;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p087j.C2134j;
import p064c.p065a.p090h.C2150a;

/* renamed from: c.a.l.c */
public final class C2182c<T> extends C2189f<T> {

    /* renamed from: c */
    static final C2184b[] f6999c = new C2184b[0];

    /* renamed from: d */
    static final C2184b[] f7000d = new C2184b[0];

    /* renamed from: f */
    private static final Object[] f7001f = new Object[0];

    /* renamed from: a */
    final C2183a<T> f7002a;

    /* renamed from: b */
    public final AtomicReference<C2184b<T>[]> f7003b = new AtomicReference<>(f6999c);

    /* renamed from: e */
    boolean f7004e;

    /* renamed from: c.a.l.c$a */
    interface C2183a<T> {
        /* renamed from: a */
        void mo6474a(C2184b<T> bVar);

        /* renamed from: a */
        void mo6475a(T t);

        /* renamed from: b */
        void mo6476b(Object obj);

        boolean compareAndSet(Object obj, Object obj2);
    }

    /* renamed from: c.a.l.c$b */
    public static final class C2184b<T> extends AtomicInteger implements C1690c {
        private static final long serialVersionUID = 466549804534799122L;

        /* renamed from: a */
        final C1674ab<? super T> f7005a;

        /* renamed from: b */
        final C2182c<T> f7006b;

        /* renamed from: c */
        Object f7007c;

        /* renamed from: d */
        volatile boolean f7008d;

        public final boolean isDisposed() {
            return this.f7008d;
        }

        public final void dispose() {
            if (!this.f7008d) {
                this.f7008d = true;
                this.f7006b.mo6473a(this);
            }
        }

        C2184b(C1674ab<? super T> abVar, C2182c<T> cVar) {
            this.f7005a = abVar;
            this.f7006b = cVar;
        }
    }

    /* renamed from: c.a.l.c$c */
    static final class C2185c<T> extends AtomicReference<Object> implements C2183a<T> {
        private static final long serialVersionUID = -733876083048047795L;

        /* renamed from: a */
        final List<Object> f7009a = new ArrayList(C1745b.m6048a(16, "capacityHint"));

        /* renamed from: b */
        volatile boolean f7010b;

        /* renamed from: c */
        volatile int f7011c;

        /* renamed from: a */
        public final void mo6475a(T t) {
            this.f7009a.add(t);
            this.f7011c++;
        }

        /* renamed from: b */
        public final void mo6476b(Object obj) {
            this.f7009a.add(obj);
            this.f7011c++;
            this.f7010b = true;
        }

        C2185c(int i) {
        }

        /* renamed from: a */
        public final void mo6474a(C2184b<T> bVar) {
            if (bVar.getAndIncrement() == 0) {
                List<Object> list = this.f7009a;
                C1674ab<? super T> abVar = bVar.f7005a;
                Integer num = (Integer) bVar.f7007c;
                int i = 0;
                if (num != null) {
                    i = num.intValue();
                } else {
                    bVar.f7007c = Integer.valueOf(0);
                }
                int i2 = 1;
                while (!bVar.f7008d) {
                    int i3 = this.f7011c;
                    while (i3 != i) {
                        if (bVar.f7008d) {
                            bVar.f7007c = null;
                            return;
                        }
                        Object obj = list.get(i);
                        if (this.f7010b) {
                            int i4 = i + 1;
                            if (i4 == i3) {
                                i3 = this.f7011c;
                                if (i4 == i3) {
                                    if (C2134j.isComplete(obj)) {
                                        abVar.onComplete();
                                    } else {
                                        abVar.onError(C2134j.getError(obj));
                                    }
                                    bVar.f7007c = null;
                                    bVar.f7008d = true;
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                        abVar.onNext(obj);
                        i++;
                    }
                    if (i == this.f7011c) {
                        bVar.f7007c = Integer.valueOf(i);
                        i2 = bVar.addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                }
                bVar.f7007c = null;
            }
        }
    }

    /* renamed from: l */
    public static <T> C2182c<T> m6538l() {
        return new C2182c<>(new C2185c(16));
    }

    public final void onComplete() {
        if (!this.f7004e) {
            this.f7004e = true;
            Object complete = C2134j.complete();
            C2183a<T> aVar = this.f7002a;
            aVar.mo6476b(complete);
            for (C2184b a : m6537a(complete)) {
                aVar.mo6474a(a);
            }
        }
    }

    public final void onSubscribe(C1690c cVar) {
        if (this.f7004e) {
            cVar.dispose();
        }
    }

    private C2182c(C2183a<T> aVar) {
        this.f7002a = aVar;
    }

    /* renamed from: a */
    private C2184b<T>[] m6537a(Object obj) {
        if (this.f7002a.compareAndSet(null, obj)) {
            return (C2184b[]) this.f7003b.getAndSet(f7000d);
        }
        return f7000d;
    }

    /* renamed from: a_ */
    public final void mo6311a_(C1674ab<? super T> abVar) {
        boolean z;
        C2184b bVar = new C2184b(abVar, this);
        abVar.onSubscribe(bVar);
        if (!bVar.f7008d) {
            while (true) {
                C2184b[] bVarArr = (C2184b[]) this.f7003b.get();
                z = false;
                if (bVarArr != f7000d) {
                    int length = bVarArr.length;
                    C2184b[] bVarArr2 = new C2184b[(length + 1)];
                    System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
                    bVarArr2[length] = bVar;
                    if (this.f7003b.compareAndSet(bVarArr, bVarArr2)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z || !bVar.f7008d) {
                this.f7002a.mo6474a(bVar);
            } else {
                mo6473a(bVar);
            }
        }
    }

    public final void onError(Throwable th) {
        C1745b.m6050a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f7004e) {
            C2150a.m6492a(th);
            return;
        }
        this.f7004e = true;
        Object error = C2134j.error(th);
        C2183a<T> aVar = this.f7002a;
        aVar.mo6476b(error);
        for (C2184b a : m6537a(error)) {
            aVar.mo6474a(a);
        }
    }

    public final void onNext(T t) {
        C1745b.m6050a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f7004e) {
            C2183a<T> aVar = this.f7002a;
            aVar.mo6475a(t);
            for (C2184b a : (C2184b[]) this.f7003b.get()) {
                aVar.mo6474a(a);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6473a(C2184b<T> bVar) {
        C2184b<T>[] bVarArr;
        C2184b[] bVarArr2;
        do {
            bVarArr = (C2184b[]) this.f7003b.get();
            if (bVarArr != f7000d && bVarArr != f6999c) {
                int length = bVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (bVarArr[i2] == bVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        bVarArr2 = f6999c;
                    } else {
                        C2184b[] bVarArr3 = new C2184b[(length - 1)];
                        System.arraycopy(bVarArr, 0, bVarArr3, 0, i);
                        System.arraycopy(bVarArr, i + 1, bVarArr3, i, (length - i) - 1);
                        bVarArr2 = bVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f7003b.compareAndSet(bVarArr, bVarArr2));
    }
}
