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
import com.google.p1057b.p1065h.p1066a.C17803b;
import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.utils.C47790cv;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.app.api.g */
public final class C22986g extends C12726a {

    /* renamed from: a */
    C23002m f61319a = new C23002m();

    /* renamed from: com.ss.android.ugc.aweme.app.api.g$a */
    static class C22987a implements C12725c<C17832m> {

        /* renamed from: a */
        private final C12725c<C17832m<C12799u>> f61320a;

        /* renamed from: a */
        public final Type mo23897a() {
            return this.f61320a.mo23897a();
        }

        C22987a(C12725c<C17832m<C12799u>> cVar) {
            this.f61320a = cVar;
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo23896a(C12690b bVar) {
            final C17832m mVar = (C17832m) this.f61320a.mo23896a(bVar);
            return new C17803b<R>() {
                {
                    C17825i.m43739a(mVar, new C17824h<C12799u>() {
                        public final void onFailure(Throwable th) {
                            C229881.this.mo34623a(th);
                        }

                        public final /* synthetic */ void onSuccess(Object obj) {
                            String str;
                            C12799u uVar = (C12799u) obj;
                            if (uVar.mo23960c()) {
                                T t = uVar.f33552b;
                                if (t instanceof C22982e) {
                                    C22982e eVar = (C22982e) t;
                                    List b = uVar.mo23959b();
                                    if (b != null) {
                                        Iterator it = b.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            C12685b bVar = (C12685b) it.next();
                                            if ("X-TT-LOGID".equalsIgnoreCase(bVar.f33318a)) {
                                                str = bVar.f33319b;
                                                break;
                                            }
                                        }
                                    }
                                    str = null;
                                    eVar.setRequestId(str);
                                }
                                if (t instanceof C22990h) {
                                    C12688d dVar = uVar.f33551a;
                                    if (dVar != null) {
                                        Object obj2 = dVar.f33351f;
                                        if (obj2 instanceof C9831a) {
                                            ((C22990h) t).setRequestInfo((C9831a) obj2);
                                        }
                                    }
                                }
                                if (t instanceof BaseResponse) {
                                    BaseResponse baseResponse = (BaseResponse) t;
                                    if (uVar.f33551a != null) {
                                        C47790cv.m103420a(baseResponse.status_code, uVar.f33551a.f33346a, baseResponse.toString());
                                    }
                                }
                                C229881.this.mo34624b(t);
                                return;
                            }
                            C229881.this.mo34623a((Throwable) new RuntimeException("HttpException"));
                        }
                    });
                }
            };
        }
    }

    /* renamed from: a */
    public final C12725c<?> mo23898a(Type type, Annotation[] annotationArr, C12792q qVar) {
        if (m25559a(type) != C17832m.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = m25560a(0, (ParameterizedType) type);
            Class<C12799u> a2 = m25559a(a);
            if (C22982e.class.isAssignableFrom(a2)) {
                C12725c a3 = this.f61319a.mo23898a(C17986b.m44142a((Type) null, (Type) C17832m.class, C17986b.m44142a((Type) null, (Type) C12799u.class, a)), annotationArr, qVar);
                if (a3 != null) {
                    return new C22987a(a3);
                }
            }
            if (a2 != C12799u.class) {
                return this.f61319a.mo23898a(type, annotationArr, qVar);
            }
            throw new IllegalStateException("Response return type is not supported because TikTok can not resolve Response type.");
        }
        throw new IllegalStateException("ListenableFuture return type must be parameterized as ListenableFuture<Foo> or ListenableFuture<? extends Foo>");
    }
}
