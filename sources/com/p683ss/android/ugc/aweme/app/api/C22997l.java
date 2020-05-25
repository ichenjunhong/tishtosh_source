package com.p683ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12725c;
import com.bytedance.retrofit2.C12725c.C12726a;
import com.bytedance.retrofit2.C12743e;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.C12799u;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import p001a.C0013i;
import p001a.C0027j;

/* renamed from: com.ss.android.ugc.aweme.app.api.l */
public final class C22997l extends C12726a {

    /* renamed from: com.ss.android.ugc.aweme.app.api.l$a */
    static final class C22998a implements C12725c<C0013i> {

        /* renamed from: a */
        private final Type f61339a;

        /* renamed from: a */
        public final Type mo23897a() {
            return this.f61339a;
        }

        C22998a(Type type) {
            this.f61339a = type;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23896a(C12690b bVar) {
            final C0027j jVar = new C0027j();
            bVar.enqueue(new C12743e<R>() {
                /* renamed from: a */
                public final void mo19942a(C12690b<R> bVar, C12799u<R> uVar) {
                    if (uVar.mo23960c()) {
                        jVar.mo47b(uVar.f33552b);
                    } else {
                        jVar.mo46b((Exception) new RuntimeException("HttpException"));
                    }
                }

                /* renamed from: a */
                public final void mo19943a(C12690b<R> bVar, Throwable th) {
                    if (th instanceof Exception) {
                        jVar.mo46b((Exception) th);
                    } else {
                        jVar.mo46b((Exception) new RuntimeException(th));
                    }
                }
            });
            return jVar.f77a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.l$b */
    static final class C23000b implements C12725c<C0013i<C12799u>> {

        /* renamed from: a */
        private final Type f61342a;

        /* renamed from: a */
        public final Type mo23897a() {
            return this.f61342a;
        }

        C23000b(Type type) {
            this.f61342a = type;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23896a(C12690b bVar) {
            final C0027j jVar = new C0027j();
            bVar.enqueue(new C12743e<R>() {
                /* renamed from: a */
                public final void mo19942a(C12690b<R> bVar, C12799u<R> uVar) {
                    if (uVar.mo23960c()) {
                        jVar.mo47b(uVar);
                    } else {
                        jVar.mo46b((Exception) new RuntimeException("HttpException"));
                    }
                }

                /* renamed from: a */
                public final void mo19943a(C12690b<R> bVar, Throwable th) {
                    if (th instanceof Exception) {
                        jVar.mo46b((Exception) th);
                    } else {
                        jVar.mo46b((Exception) new RuntimeException(th));
                    }
                }
            });
            return jVar.f77a;
        }
    }

    C22997l() {
    }

    /* renamed from: a */
    public final C12725c<?> mo23898a(Type type, Annotation[] annotationArr, C12792q qVar) {
        if (m25559a(type) != C0013i.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = m25560a(0, (ParameterizedType) type);
            if (m25559a(a) != C12799u.class) {
                return new C22998a(a);
            }
            if (a instanceof ParameterizedType) {
                return new C23000b(m25560a(0, (ParameterizedType) a));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("Task return type must be parameterized as Task<Foo> or Task<? extends Foo>");
    }
}
