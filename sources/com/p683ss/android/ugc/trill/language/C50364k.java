package com.p683ss.android.ugc.trill.language;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.p1485by.C24463c;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41684a;
import com.p683ss.android.ugc.trill.language.api.LanguageApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.trill.language.k */
public final class C50364k {

    /* renamed from: a */
    public C1689b f126286a = new C1689b();

    /* renamed from: b */
    public C50366a f126287b;

    /* renamed from: c */
    private LanguageApi f126288c = ((LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(LanguageApi.class));

    /* renamed from: com.ss.android.ugc.trill.language.k$a */
    public interface C50366a {
        /* renamed from: a */
        void mo98241a();

        /* renamed from: a */
        void mo98242a(Throwable th);
    }

    /* renamed from: a */
    public final void mo98265a(C41684a aVar, int i) {
        if (!C20854a.m53167g().isLogin()) {
            m108636b(aVar, i);
        } else {
            this.f126288c.setContentLanguage("content_language", aVar.getLanguageCode(), i).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C1674ab<BaseResponse>() {
                public final void onComplete() {
                }

                public final void onSubscribe(C1690c cVar) {
                }

                public final void onError(Throwable th) {
                    if (C50364k.this.f126287b != null) {
                        C50364k.this.f126287b.mo98242a(th);
                    }
                }

                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    if (baseResponse != null && baseResponse.status_code == 0 && C50364k.this.f126287b != null) {
                        C50364k.this.f126287b.mo98241a();
                    }
                }
            });
        }
    }

    /* renamed from: b */
    private void m108636b(C41684a aVar, int i) {
        if (i == 0) {
            String languageCode = aVar.getLanguageCode();
            C52711k.m112240b(languageCode, "code");
            C24463c cVar = C24463c.f64842b;
            C52711k.m112240b(languageCode, "code");
            List e = C52575l.m112139e((Collection<? extends T>) C52830p.m112452b(cVar.mo50237a().mo75727c(), new String[]{","}, false, 0, 6, (Object) null));
            if (C24463c.m59860a(e, languageCode, true)) {
                cVar.mo50237a().mo75723a(C52575l.m112120a(e, ",", null, null, 0, null, null, 62, null));
            }
        } else {
            C52711k.m112240b(aVar, "language");
            C24463c cVar2 = C24463c.f64842b;
            C52711k.m112240b(aVar, "contentLanguage");
            Iterable b = C52830p.m112452b(cVar2.mo50237a().mo75727c(), new String[]{","}, false, 0, 6, (Object) null);
            Collection arrayList = new ArrayList();
            for (Object next : b) {
                if (!TextUtils.isEmpty((String) next)) {
                    arrayList.add(next);
                }
            }
            List e2 = C52575l.m112139e((Collection<? extends T>) (List) arrayList);
            String languageCode2 = aVar.getLanguageCode();
            C52711k.m112236a((Object) languageCode2, "contentLanguage.languageCode");
            if (!C24463c.m59860a(e2, languageCode2, false)) {
                String languageCode3 = aVar.getLanguageCode();
                C52711k.m112236a((Object) languageCode3, "contentLanguage.languageCode");
                e2.add(languageCode3);
                cVar2.mo50237a().mo75723a(C52575l.m112120a(e2, ",", null, null, 0, null, null, 62, null));
            }
        }
        this.f126287b.mo98241a();
    }
}
