package com.bytedance.retrofit2;

import com.bytedance.retrofit2.C12725c.C12726a;
import com.bytedance.retrofit2.p830a.C12686c;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/* renamed from: com.bytedance.retrofit2.j */
final class C12751j extends C12726a {

    /* renamed from: a */
    final Executor f33389a;

    /* renamed from: com.bytedance.retrofit2.j$a */
    static final class C12753a<T> implements C12690b<T>, C12758l {

        /* renamed from: a */
        final Executor f33392a;

        /* renamed from: b */
        final C12690b<T> f33393b;

        public final void cancel() {
            this.f33393b.cancel();
        }

        public final C12799u execute() throws Exception {
            return this.f33393b.execute();
        }

        public final boolean isCanceled() {
            return this.f33393b.isCanceled();
        }

        public final C12686c request() {
            return this.f33393b.request();
        }

        public final C12690b<T> clone() {
            return new C12753a(this.f33392a, this.f33393b.clone());
        }

        public final void doCollect() {
            if (this.f33393b instanceof C12758l) {
                ((C12758l) this.f33393b).doCollect();
            }
        }

        public final void enqueue(final C12743e<T> eVar) {
            if (eVar != null) {
                this.f33393b.enqueue(new C12757k<T>() {
                    /* renamed from: a */
                    public final void mo19942a(C12690b<T> bVar, final C12799u<T> uVar) {
                        C12753a.this.f33392a.execute(new Runnable() {
                            public final void run() {
                                if (C12753a.this.f33393b.isCanceled()) {
                                    eVar.mo19943a((C12690b<T>) C12753a.this, (Throwable) new IOException("Canceled"));
                                } else {
                                    eVar.mo19942a((C12690b<T>) C12753a.this, uVar);
                                }
                            }
                        });
                    }

                    /* renamed from: b */
                    public final void mo23905b(C12690b<T> bVar, C12799u<T> uVar) {
                        if (eVar instanceof C12757k) {
                            ((C12757k) eVar).mo23905b(bVar, uVar);
                        }
                    }

                    /* renamed from: a */
                    public final void mo19943a(C12690b<T> bVar, final Throwable th) {
                        C12753a.this.f33392a.execute(new Runnable() {
                            public final void run() {
                                eVar.mo19943a((C12690b<T>) C12753a.this, th);
                            }
                        });
                    }
                });
                return;
            }
            throw new NullPointerException("callback == null");
        }

        C12753a(Executor executor, C12690b<T> bVar) {
            this.f33392a = executor;
            this.f33393b = bVar;
        }
    }

    C12751j(Executor executor) {
        this.f33389a = executor;
    }

    /* renamed from: a */
    public final C12725c<C12690b<?>> mo23898a(Type type, Annotation[] annotationArr, C12792q qVar) {
        if (m25559a(type) != C12690b.class) {
            return null;
        }
        final Type e = C12801w.m25707e(type);
        return new C12725c<C12690b<?>>() {
            /* renamed from: a */
            public final Type mo23897a() {
                return e;
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo23896a(C12690b bVar) {
                return new C12753a(C12751j.this.f33389a, bVar);
            }
        };
    }
}
