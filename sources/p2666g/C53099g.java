package p2666g;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import p2666g.C53068c.C53069a;

/* renamed from: g.g */
final class C53099g extends C53069a {

    /* renamed from: a */
    final Executor f131567a;

    /* renamed from: g.g$a */
    static final class C53101a<T> implements C53061b<T> {

        /* renamed from: a */
        final Executor f131570a;

        /* renamed from: b */
        final C53061b<T> f131571b;

        /* renamed from: a */
        public final C53133m<T> mo110594a() throws IOException {
            return this.f131571b.mo110594a();
        }

        /* renamed from: b */
        public final void mo110596b() {
            this.f131571b.mo110596b();
        }

        /* renamed from: c */
        public final boolean mo110597c() {
            return this.f131571b.mo110597c();
        }

        /* renamed from: d */
        public final C53061b<T> clone() {
            return new C53101a(this.f131570a, this.f131571b.mo110598d());
        }

        /* renamed from: a */
        public final void mo110595a(final C53094d<T> dVar) {
            C53139p.m112957a(dVar, "callback == null");
            this.f131571b.mo110595a(new C53094d<T>() {
                /* renamed from: a */
                public final void mo36428a(C53061b<T> bVar, final C53133m<T> mVar) {
                    C53101a.this.f131570a.execute(new Runnable() {
                        public final void run() {
                            if (C53101a.this.f131571b.mo110597c()) {
                                dVar.mo36429a((C53061b<T>) C53101a.this, (Throwable) new IOException("Canceled"));
                            } else {
                                dVar.mo36428a((C53061b<T>) C53101a.this, mVar);
                            }
                        }
                    });
                }

                /* renamed from: a */
                public final void mo36429a(C53061b<T> bVar, final Throwable th) {
                    C53101a.this.f131570a.execute(new Runnable() {
                        public final void run() {
                            dVar.mo36429a((C53061b<T>) C53101a.this, th);
                        }
                    });
                }
            });
        }

        C53101a(Executor executor, C53061b<T> bVar) {
            this.f131570a = executor;
            this.f131571b = bVar;
        }
    }

    C53099g(Executor executor) {
        this.f131567a = executor;
    }

    /* renamed from: a */
    public final C53068c<?, ?> mo110593a(Type type, Annotation[] annotationArr, C53134n nVar) {
        if (m112841a(type) != C53061b.class) {
            return null;
        }
        final Type e = C53139p.m112968e(type);
        return new C53068c<Object, C53061b<?>>() {
            /* renamed from: a */
            public final Type mo110592a() {
                return e;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo110591a(C53061b bVar) {
                return new C53101a(C53099g.this.f131567a, bVar);
            }
        };
    }
}
