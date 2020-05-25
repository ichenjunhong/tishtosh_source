package com.p683ss.android.ugc.aweme.movie.presenter;

import android.os.Handler;
import com.bytedance.common.utility.p522b.C9381g;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.common.C26832a;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.location.p1930a.C36254a;
import com.p683ss.android.ugc.aweme.movie.api.MovieDetailAPi;
import com.p683ss.android.ugc.aweme.movie.api.MovieDetailAPi.C37175a;
import com.p683ss.android.ugc.aweme.movie.api.MovieDetailAPi.MvDetail;
import com.p683ss.android.ugc.aweme.movie.p1968b.C37179c;
import com.p683ss.android.ugc.aweme.movie.view.C37192a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.movie.presenter.a */
public final class C37184a extends C26851b<C26832a<C37179c>, C37192a> {

    /* renamed from: a */
    public static final C37186a f94921a = new C37186a(null);

    /* renamed from: com.ss.android.ugc.aweme.movie.presenter.a$a */
    public static final class C37186a {
        private C37186a() {
        }

        public /* synthetic */ C37186a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.presenter.a$b */
    static final class C37187b extends C52712l implements C52670a<C37179c> {

        /* renamed from: a */
        final /* synthetic */ String f94923a;

        /* renamed from: b */
        final /* synthetic */ C36254a f94924b;

        /* renamed from: c */
        final /* synthetic */ String f94925c;

        /* renamed from: d */
        final /* synthetic */ String f94926d;

        C37187b(String str, C36254a aVar, String str2, String str3) {
            this.f94923a = str;
            this.f94924b = aVar;
            this.f94925c = str2;
            this.f94926d = str3;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Double d;
            C37175a aVar = MovieDetailAPi.f94896f;
            String str = this.f94923a;
            C36254a aVar2 = this.f94924b;
            String str2 = this.f94925c;
            String str3 = this.f94926d;
            C52711k.m112240b(str, "templateId");
            Double d2 = null;
            MvDetail mvDetail = (MvDetail) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C37175a.m83418b(), null).create(MvDetail.class);
            if (aVar2 != null) {
                d = Double.valueOf(aVar2.getLongitude());
            } else {
                d = null;
            }
            if (aVar2 != null) {
                d2 = Double.valueOf(aVar2.getLatitude());
            }
            C37179c cVar = (C37179c) mvDetail.getNewMvDetail(str, d, d2, str2, str3).get();
            C52711k.m112236a((Object) cVar, "response");
            return cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.presenter.a$c */
    static final class C37188c extends C52712l implements C52670a<C37179c> {

        /* renamed from: a */
        final /* synthetic */ String f94927a;

        C37188c(String str) {
            this.f94927a = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C37175a aVar = MovieDetailAPi.f94896f;
            String str = this.f94927a;
            C52711k.m112240b(str, "mvId");
            C37179c cVar = (C37179c) ((MvDetail) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C37175a.m83418b(), null).create(MvDetail.class)).getMvDetail(str).get();
            C52711k.m112236a((Object) cVar, "response");
            return cVar;
        }
    }

    public C37184a() {
        mo54799a(new C26832a<C37179c>(this) {

            /* renamed from: a */
            final /* synthetic */ C37184a f94922a;

            public final boolean checkParams(Object... objArr) {
                C52711k.m112240b(objArr, "params");
                return true;
            }

            {
                this.f94922a = r1;
            }

            public final boolean sendRequest(Object... objArr) {
                C52711k.m112240b(objArr, "params");
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                if (objArr.length >= 6) {
                    C9381g gVar = this.mHandler;
                    C52711k.m112236a((Object) gVar, "mHandler");
                    Handler handler = gVar;
                    Object obj = objArr[1];
                    if (obj != null) {
                        String str = (String) obj;
                        Integer num = objArr[2];
                        if (num != null) {
                            C37184a.m83422a(handler, str, num.intValue(), (C36254a) objArr[3], (String) objArr[4], (String) objArr[5]);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.String");
                    }
                } else {
                    C37184a aVar = this.f94922a;
                    C9381g gVar2 = this.mHandler;
                    C52711k.m112236a((Object) gVar2, "mHandler");
                    Handler handler2 = gVar2;
                    Object obj2 = objArr[1];
                    if (obj2 != null) {
                        String str2 = (String) obj2;
                        Integer num2 = objArr[2];
                        if (num2 != null) {
                            C37184a.m83422a(handler2, str2, num2.intValue(), null, null, null);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.String");
                    }
                }
                return true;
            }
        });
    }

    /* renamed from: b */
    public final void mo44838b() {
        if (this.f70701g != null && this.f70700f != null) {
            C37192a aVar = (C37192a) this.f70701g;
            C26832a aVar2 = this.f70700f;
            C52711k.m112236a((Object) aVar2, "mModel");
            Object data = aVar2.getData();
            C52711k.m112236a(data, "mModel.data");
            aVar.mo76521a((C37179c) data);
        }
    }

    /* renamed from: c_ */
    public final void mo44840c_(Exception exc) {
        C52711k.m112240b(exc, "e");
        if (this.f70701g != null) {
            ((C37192a) this.f70701g).mo76522a(exc);
        }
    }

    /* renamed from: a */
    public static void m83422a(Handler handler, String str, int i, C36254a aVar, String str2, String str3) {
        C52670a aVar2;
        if (i == C37175a.m83417a()) {
            aVar2 = new C37187b(str, aVar, str2, str3);
        } else {
            aVar2 = new C37188c(str);
        }
        C23566n.f62684b.mo48750a(handler, new C37189b(aVar2), 0);
    }
}
