package com.p683ss.android.ugc.aweme.app.api;

import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12725c;
import com.bytedance.retrofit2.C12725c.C12726a;
import com.bytedance.retrofit2.C12792q;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.google.p1057b.p1065h.p1066a.C17833n;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.utils.C47769cj;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.concurrent.CancellationException;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.app.api.b */
public final class C22966b extends C12726a {

    /* renamed from: com.ss.android.ugc.aweme.app.api.b$a */
    static class C22967a implements C12725c {

        /* renamed from: a */
        C12725c<?> f61300a;

        /* renamed from: a */
        public final Type mo23897a() {
            return this.f61300a.mo23897a();
        }

        C22967a(C12725c<?> cVar) {
            this.f61300a = cVar;
        }

        /* renamed from: a */
        public final Object mo23896a(final C12690b bVar) {
            return ((C0013i) this.f61300a.mo23896a(bVar)).mo19a((C0011g<TResult, TContinuationResult>) new C0011g() {
                public final Object then(C0013i iVar) throws Exception {
                    if (iVar.mo33d()) {
                        Exception f = iVar.mo35f();
                        C47769cj.m103400a((Throwable) f, bVar.request().f33321b, "");
                        if (f instanceof C23459a) {
                            bVar.request();
                        }
                        throw f;
                    } else if (!iVar.mo31c()) {
                        return iVar.mo34e();
                    } else {
                        throw new CancellationException();
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.api.b$b */
    static class C22969b implements C12725c {

        /* renamed from: a */
        C12725c<?> f61303a;

        /* renamed from: a */
        public final Type mo23897a() {
            return this.f61303a.mo23897a();
        }

        C22969b(C12725c<?> cVar) {
            this.f61303a = cVar;
        }

        /* renamed from: a */
        public final Object mo23896a(final C12690b bVar) {
            C17832m mVar = (C17832m) this.f61303a.mo23896a(bVar);
            C17825i.m43740a(mVar, new C17824h() {
                public final void onSuccess(Object obj) {
                }

                public final void onFailure(Throwable th) {
                    C47769cj.m103400a(th, bVar.request().f33321b, "");
                    if (th instanceof C23459a) {
                        bVar.request();
                    }
                }
            }, C17833n.m43743a());
            return mVar;
        }
    }

    /* renamed from: a */
    public final C12725c<?> mo23898a(Type type, Annotation[] annotationArr, C12792q qVar) {
        Class<C0013i> a = m25559a(type);
        if (a != C17832m.class && a != C0013i.class) {
            return null;
        }
        C12725c a2 = qVar.mo23933a((C12726a) this, type, annotationArr);
        if (a == C17832m.class) {
            return new C22969b(a2);
        }
        if (a == C0013i.class) {
            return new C22967a(a2);
        }
        throw new AssertionError();
    }
}
