package com.p683ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12725c;
import com.bytedance.retrofit2.C12725c.C12726a;
import com.bytedance.retrofit2.C12743e;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.C12799u;
import com.google.p1057b.p1065h.p1066a.C17803b;
import com.google.p1057b.p1065h.p1066a.C17832m;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.aweme.app.api.m */
public final class C23002m extends C12726a {

    /* renamed from: com.ss.android.ugc.aweme.app.api.m$a */
    static final class C23003a implements C12725c<C17832m> {

        /* renamed from: a */
        private final Type f61345a;

        /* renamed from: a */
        public final Type mo23897a() {
            return this.f61345a;
        }

        C23003a(Type type) {
            this.f61345a = type;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23896a(final C12690b bVar) {
            return new C17803b<R>() {
                /* renamed from: c */
                public final void mo34625c() {
                    bVar.cancel();
                }

                {
                    bVar.enqueue(new C12743e<R>() {
                        /* renamed from: a */
                        public final void mo19943a(C12690b<R> bVar, Throwable th) {
                            C230041.this.mo34623a(th);
                        }

                        /* renamed from: a */
                        public final void mo19942a(C12690b<R> bVar, C12799u<R> uVar) {
                            if (uVar.mo23960c()) {
                                C230041.this.mo34624b(uVar.f33552b);
                            } else {
                                C230041.this.mo34623a((Throwable) new RuntimeException("HttpException"));
                            }
                        }
                    });
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.m$b */
    static final class C23006b implements C12725c<C17832m<C12799u>> {

        /* renamed from: a */
        private final Type f61349a;

        /* renamed from: a */
        public final Type mo23897a() {
            return this.f61349a;
        }

        C23006b(Type type) {
            this.f61349a = type;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23896a(final C12690b bVar) {
            return new C17803b<C12799u>() {
                /* renamed from: c */
                public final void mo34625c() {
                    bVar.cancel();
                }

                {
                    bVar.enqueue(new C12743e<R>() {
                        /* renamed from: a */
                        public final void mo19942a(C12690b<R> bVar, C12799u<R> uVar) {
                            C230071.this.mo34624b(uVar);
                        }

                        /* renamed from: a */
                        public final void mo19943a(C12690b<R> bVar, Throwable th) {
                            C230071.this.mo34623a(th);
                        }
                    });
                }
            };
        }
    }

    C23002m() {
    }

    /* renamed from: a */
    public final C12725c<?> mo23898a(Type type, Annotation[] annotationArr, C12792q qVar) {
        if (m25559a(type) != C17832m.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = m25560a(0, (ParameterizedType) type);
            if (m25559a(a) != C12799u.class) {
                return new C23003a(a);
            }
            if (a instanceof ParameterizedType) {
                return new C23006b(m25560a(0, (ParameterizedType) a));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("ListenableFuture return type must be parameterized as ListenableFuture<Foo> or ListenableFuture<? extends Foo>");
    }
}
