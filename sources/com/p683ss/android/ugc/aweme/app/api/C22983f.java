package com.p683ss.android.ugc.aweme.app.api;

import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12725c;
import com.bytedance.retrofit2.C12725c.C12726a;
import com.bytedance.retrofit2.C12792q;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12685b;
import com.bytedance.retrofit2.p830a.C12688d;
import com.google.gson.internal.C17986b;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.utils.C47790cv;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.concurrent.CancellationException;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.app.api.f */
public final class C22983f extends C12726a {

    /* renamed from: a */
    C22997l f61316a = new C22997l();

    /* renamed from: com.ss.android.ugc.aweme.app.api.f$a */
    static class C22984a implements C12725c<C0013i> {

        /* renamed from: a */
        private final C12725c<C0013i<C12799u>> f61317a;

        /* renamed from: a */
        public final Type mo23897a() {
            return this.f61317a.mo23897a();
        }

        C22984a(C12725c<C0013i<C12799u>> cVar) {
            this.f61317a = cVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23896a(C12690b bVar) {
            return ((C0013i) this.f61317a.mo23896a(bVar)).mo19a((C0011g<TResult, TContinuationResult>) new C0011g<C12799u, R>() {
                public final R then(C0013i<C12799u> iVar) throws Exception {
                    if (iVar.mo31c()) {
                        throw new CancellationException();
                    } else if (!iVar.mo33d()) {
                        C12799u uVar = (C12799u) iVar.mo34e();
                        C22982e eVar = ((C12799u) iVar.mo34e()).f33552b;
                        if (eVar instanceof BaseResponse) {
                            BaseResponse baseResponse = (BaseResponse) eVar;
                            if (uVar.f33551a != null) {
                                C47790cv.m103420a(baseResponse.status_code, uVar.f33551a.f33346a, baseResponse.toString());
                            }
                        }
                        if (eVar instanceof C22990h) {
                            C12688d dVar = uVar.f33551a;
                            if (dVar != null) {
                                Object obj = dVar.f33351f;
                                if (obj instanceof C9831a) {
                                    ((C22990h) eVar).setRequestInfo((C9831a) obj);
                                }
                            }
                        }
                        if (eVar instanceof C22982e) {
                            eVar.setRequestId(C22984a.m56504a(uVar.mo23959b()));
                        }
                        return eVar;
                    } else {
                        throw iVar.mo35f();
                    }
                }
            });
        }

        /* renamed from: a */
        static String m56504a(List<C12685b> list) {
            if (list == null) {
                return null;
            }
            for (C12685b bVar : list) {
                if ("X-TT-LOGID".equalsIgnoreCase(bVar.f33318a)) {
                    return bVar.f33319b;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public final C12725c<?> mo23898a(Type type, Annotation[] annotationArr, C12792q qVar) {
        if (m25559a(type) != C0013i.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = m25560a(0, (ParameterizedType) type);
            Class<C12799u> a2 = m25559a(a);
            if (C22982e.class.isAssignableFrom(a2)) {
                C12725c a3 = this.f61316a.mo23898a(C17986b.m44142a((Type) null, (Type) C0013i.class, C17986b.m44142a((Type) null, (Type) C12799u.class, a)), annotationArr, qVar);
                if (a3 != null) {
                    return new C22984a(a3);
                }
            }
            if (a2 != C12799u.class) {
                return this.f61316a.mo23898a(type, annotationArr, qVar);
            }
            throw new IllegalStateException("Response return type is not supported because TikTok can not resolve Response type.");
        }
        StringBuilder sb = new StringBuilder("Task return type must be parameterized as Task<Foo> or Task<? extends Foo> but returnType is ");
        sb.append(type.getTypeName());
        throw new IllegalStateException(sb.toString());
    }
}
