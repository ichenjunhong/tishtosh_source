package dagger.p2651a;

import dagger.C52863a;
import javax.p2677a.C53188a;

/* renamed from: dagger.a.c */
public final class C52866c<T> implements C52863a<T>, C53188a<T> {

    /* renamed from: a */
    static final /* synthetic */ boolean f131113a = (!C52866c.class.desiredAssertionStatus());

    /* renamed from: b */
    private static final Object f131114b = new Object();

    /* renamed from: c */
    private volatile C53188a<T> f131115c;

    /* renamed from: d */
    private volatile Object f131116d = f131114b;

    public final T get() {
        boolean z;
        T t = this.f131116d;
        if (t == f131114b) {
            synchronized (this) {
                t = this.f131116d;
                if (t == f131114b) {
                    t = this.f131115c.get();
                    T t2 = this.f131116d;
                    if (t2 == f131114b || (t2 instanceof C52868e)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        if (t2 != t) {
                            StringBuilder sb = new StringBuilder("Scoped provider was invoked recursively returning different results: ");
                            sb.append(t2);
                            sb.append(" & ");
                            sb.append(t);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f131116d = t;
                    this.f131115c = null;
                }
            }
        }
        return t;
    }

    /* renamed from: a */
    public static <P extends C53188a<T>, T> C53188a<T> m112468a(P p) {
        C52869f.m112470a(p);
        if (p instanceof C52866c) {
            return p;
        }
        return new C52866c(p);
    }

    private C52866c(C53188a<T> aVar) {
        if (f131113a || aVar != null) {
            this.f131115c = aVar;
            return;
        }
        throw new AssertionError();
    }

    /* renamed from: b */
    public static <P extends C53188a<T>, T> C52863a<T> m112469b(P p) {
        if (p instanceof C52863a) {
            return (C52863a) p;
        }
        return new C52866c((C53188a) C52869f.m112470a(p));
    }
}
