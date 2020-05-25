package com.p683ss.android.ugc.trill.language.viewmodel;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.content.Context;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.feed.cache.C30163b;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai.C30756a;
import com.p683ss.android.ugc.aweme.i18n.language.C33123c;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33097a;
import com.p683ss.android.ugc.aweme.p1485by.C24461a;
import com.p683ss.android.ugc.aweme.p1485by.C24463c;
import com.p683ss.android.ugc.aweme.p1485by.C24469e;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.protection.api.ComplianceApi;
import com.p683ss.android.ugc.aweme.protection.api.ComplianceApi.C40854a;
import com.p683ss.android.ugc.aweme.protection.p2093a.C40837a;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.setting.serverpush.C41683a;
import com.p683ss.android.ugc.aweme.setting.serverpush.C41687b;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41684a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41686c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.trill.language.C50364k;
import com.p683ss.android.ugc.trill.language.C50364k.C50366a;
import com.p683ss.android.ugc.trill.language.api.LanguageApi;
import com.p683ss.android.ugc.trill.language.model.ConfigListResponse;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel */
public final class ContentPreferenceViewModel extends C0209x implements C50366a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f126304a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ContentPreferenceViewModel.class), "keva", "getKeva()Lcom/ss/android/ugc/aweme/protection/keva/ComplianceSettingKeva;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ContentPreferenceViewModel.class), "mPresenter", "getMPresenter()Lcom/ss/android/ugc/trill/language/ContentLanguagePresenter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ContentPreferenceViewModel.class), "mComplianceApi", "getMComplianceApi()Lcom/ss/android/ugc/aweme/protection/api/ComplianceApi;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ContentPreferenceViewModel.class), "vpaContentChoice", "getVpaContentChoice()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ContentPreferenceViewModel.class), "addedContentLanguageListData", "getAddedContentLanguageListData()Landroid/arch/lifecycle/MutableLiveData;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(ContentPreferenceViewModel.class), "unAddedContentLanguageListData", "getUnAddedContentLanguageListData()Landroid/arch/lifecycle/MutableLiveData;"))};

    /* renamed from: b */
    public int f126305b = -1;

    /* renamed from: c */
    public boolean f126306c;

    /* renamed from: d */
    private final C52668f f126307d = C52732g.m112285a(C50374d.f126317a);

    /* renamed from: e */
    private final C52668f f126308e = C52732g.m112285a(new C50376f(this));

    /* renamed from: f */
    private final C52668f f126309f = C52732g.m112285a(C50375e.f126318a);

    /* renamed from: g */
    private final C52668f f126310g = C52732g.m112285a(new C50379i(this));

    /* renamed from: h */
    private final C52668f f126311h = C52732g.m112285a(C50371a.f126313a);

    /* renamed from: i */
    private final C52668f f126312i = C52732g.m112285a(C50378h.f126322a);

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$a */
    static final class C50371a extends C52712l implements C52670a<C0198r<ArrayList<C41684a>>> {

        /* renamed from: a */
        public static final C50371a f126313a = new C50371a();

        C50371a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$b */
    public static final class C50372b implements C1674ab<ConfigListResponse> {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceViewModel f126314a;

        /* renamed from: b */
        final /* synthetic */ List f126315b;

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final /* synthetic */ void onNext(Object obj) {
            C24461a aVar;
            boolean z;
            ConfigListResponse configListResponse = (ConfigListResponse) obj;
            C52711k.m112240b(configListResponse, "response");
            List list = this.f126315b;
            List contentLanguage = configListResponse.getContentLanguage();
            if (C9376b.m18558a((Collection<T>) list) || C9376b.m18558a((Collection<T>) contentLanguage)) {
                aVar = new C24461a(null, contentLanguage);
            } else {
                ArrayList arrayList = new ArrayList();
                if (contentLanguage == null) {
                    C52711k.m112234a();
                }
                Iterable iterable = contentLanguage;
                Collection arrayList2 = new ArrayList();
                for (Object next : iterable) {
                    C41684a aVar2 = (C41684a) next;
                    if (list == null) {
                        C52711k.m112234a();
                    }
                    Iterator it = list.iterator();
                    while (true) {
                        z = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        if (C52830p.m112406a(aVar2.getLanguageCode(), (String) it.next(), true)) {
                            C41684a aVar3 = new C41684a();
                            aVar3.setLanguageCode(aVar2.getLanguageCode());
                            aVar3.setLocalName(aVar2.getLocalName());
                            aVar3.setEnglishName(aVar2.getEnglishName());
                            arrayList.add(aVar3);
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        arrayList2.add(next);
                    }
                }
                aVar = new C24461a(arrayList, (List) arrayList2);
            }
            this.f126314a.mo98271a(aVar.f64839a, aVar.f64840b);
        }

        C50372b(ContentPreferenceViewModel contentPreferenceViewModel, List list) {
            this.f126314a = contentPreferenceViewModel;
            this.f126315b = list;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$c */
    public static final class C50373c implements C41683a {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceViewModel f126316a;

        /* renamed from: a */
        public final void mo47083a(Exception exc) {
            C52711k.m112240b(exc, "e");
        }

        /* renamed from: a */
        public final boolean mo47084a() {
            return false;
        }

        C50373c(ContentPreferenceViewModel contentPreferenceViewModel) {
            this.f126316a = contentPreferenceViewModel;
        }

        /* renamed from: a */
        public final void mo47082a(C41686c cVar) {
            Integer num;
            C52711k.m112240b(cVar, "settings");
            this.f126316a.mo98271a(cVar.f105477T, cVar.f105476S);
            ContentPreferenceViewModel contentPreferenceViewModel = this.f126316a;
            int i = cVar.f105478U;
            if (C40869c.m90382l()) {
                if (i == 0) {
                    num = C40869c.m90390u();
                } else {
                    num = Integer.valueOf(i);
                }
                contentPreferenceViewModel.mo98274c().setValue(num);
                C40837a b = contentPreferenceViewModel.mo98272b();
                if (num == null) {
                    C52711k.m112234a();
                }
                b.mo83166b(num.intValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$d */
    static final class C50374d extends C52712l implements C52670a<C40837a> {

        /* renamed from: a */
        public static final C50374d f126317a = new C50374d();

        C50374d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C40869c.m90371a();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$e */
    static final class C50375e extends C52712l implements C52670a<ComplianceApi> {

        /* renamed from: a */
        public static final C50375e f126318a = new C50375e();

        C50375e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C40854a.m90347a();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$f */
    static final class C50376f extends C52712l implements C52670a<C50364k> {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceViewModel f126319a;

        C50376f(ContentPreferenceViewModel contentPreferenceViewModel) {
            this.f126319a = contentPreferenceViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C50364k kVar = new C50364k();
            kVar.f126287b = this.f126319a;
            return kVar;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$g */
    public static final class C50377g implements C1674ab<BaseResponse> {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceViewModel f126320a;

        /* renamed from: b */
        final /* synthetic */ int f126321b;

        public final void onComplete() {
        }

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f126320a.mo98273b(this.f126321b);
        }

        public final /* synthetic */ void onNext(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            C52711k.m112240b(baseResponse, "t");
            if (baseResponse.error_code == 0) {
                Integer num = (Integer) this.f126320a.mo98274c().getValue();
                if (num != null && num.intValue() == 3) {
                    C47718bf.m103288a(new C30756a(false));
                    C30163b.m70784k();
                }
            } else {
                this.f126320a.mo98273b(this.f126321b);
            }
        }

        C50377g(ContentPreferenceViewModel contentPreferenceViewModel, int i) {
            this.f126320a = contentPreferenceViewModel;
            this.f126321b = i;
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$h */
    static final class C50378h extends C52712l implements C52670a<C0198r<ArrayList<C33123c>>> {

        /* renamed from: a */
        public static final C50378h f126322a = new C50378h();

        C50378h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C0198r();
        }
    }

    /* renamed from: com.ss.android.ugc.trill.language.viewmodel.ContentPreferenceViewModel$i */
    static final class C50379i extends C52712l implements C52670a<C0198r<Integer>> {

        /* renamed from: a */
        final /* synthetic */ ContentPreferenceViewModel f126323a;

        C50379i(ContentPreferenceViewModel contentPreferenceViewModel) {
            this.f126323a = contentPreferenceViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Integer num;
            C0198r rVar = new C0198r();
            if (this.f126323a.mo98272b().mo83165b() == 0) {
                num = C40869c.m90390u();
            } else {
                num = Integer.valueOf(this.f126323a.mo98272b().mo83165b());
            }
            rVar.setValue(num);
            return rVar;
        }
    }

    /* renamed from: b */
    public final C40837a mo98272b() {
        return (C40837a) this.f126307d.getValue();
    }

    /* renamed from: c */
    public final C0198r<Integer> mo98274c() {
        return (C0198r) this.f126310g.getValue();
    }

    /* renamed from: d */
    public final C0198r<ArrayList<C41684a>> mo98275d() {
        return (C0198r) this.f126311h.getValue();
    }

    /* renamed from: e */
    public final C0198r<ArrayList<C33123c>> mo98276e() {
        return (C0198r) this.f126312i.getValue();
    }

    /* renamed from: g */
    private final void m108649g() {
        ((LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(LanguageApi.class)).getUnloginContentLanguage("content_language_region", C24463c.f64842b.mo50238b()).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C50372b<Object>(this, C24469e.m59870a()));
    }

    /* renamed from: f */
    public final void mo98277f() {
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (!g.isLogin()) {
            m108649g();
        } else {
            C41687b.f105513b.mo85532a(new C50373c(this), false);
        }
    }

    /* renamed from: a */
    public final void mo98241a() {
        Integer num;
        String str;
        String str2 = "";
        ArrayList arrayList = (ArrayList) mo98275d().getValue();
        if (arrayList != null) {
            num = Integer.valueOf(arrayList.size());
        } else {
            num = null;
        }
        if (num == null) {
            C52711k.m112234a();
        }
        int intValue = num.intValue();
        for (int i = 0; i < intValue; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            ArrayList arrayList2 = (ArrayList) mo98275d().getValue();
            if (arrayList2 != null) {
                C41684a aVar = (C41684a) arrayList2.get(i);
                if (aVar != null) {
                    str = aVar.getLanguageCode();
                    sb.append(str);
                    sb.append(",");
                    str2 = sb.toString();
                }
            }
            str = null;
            sb.append(str);
            sb.append(",");
            str2 = sb.toString();
        }
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf userAddLanguages = inst.getUserAddLanguages();
        C52711k.m112236a((Object) userAddLanguages, "SharePrefCache.inst().userAddLanguages");
        userAddLanguages.mo47776a(str2);
    }

    /* renamed from: b */
    public final void mo98273b(int i) {
        mo98272b().mo83166b(i);
        C10691a.m21548c((Context) C11016e.m22312g(), (int) R.string.dn5).mo19066a();
        C23131p.m56692a("opt_out_failed_settings", "", null);
    }

    /* renamed from: a */
    public final void mo98269a(int i) {
        int b = mo98272b().mo83165b();
        mo98274c().setValue(Integer.valueOf(i));
        C40869c.m90371a().mo83166b(i);
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (g.isLogin()) {
            ((ComplianceApi) this.f126309f.getValue()).setVPAContentChoice("vpa_content_choice", i).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C50377g<Object>(this, b));
            return;
        }
        Integer num = (Integer) mo98274c().getValue();
        if (num != null && num.intValue() == 3) {
            C47718bf.m103288a(new C30756a(false));
        }
    }

    /* renamed from: a */
    public final void mo98270a(C41684a aVar) {
        if (aVar != null) {
            ArrayList arrayList = (ArrayList) mo98275d().getValue();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(aVar);
            mo98275d().setValue(arrayList);
            this.f126306c = false;
            ((C50364k) this.f126308e.getValue()).mo98265a(aVar, 1);
            ArrayList arrayList2 = (ArrayList) mo98276e().getValue();
            if (arrayList2 != null) {
                C52711k.m112236a((Object) arrayList2, "unAddedContentLanguageListData.value ?: return");
                Iterator it = arrayList2.iterator();
                C52711k.m112236a((Object) it, "mUnAdded.iterator()");
                while (it.hasNext()) {
                    Object next = it.next();
                    C52711k.m112236a(next, "ite.next()");
                    if (C52711k.m112239a((Object) ((C33123c) next).mo70148a(), (Object) aVar.getLocalName())) {
                        it.remove();
                    }
                }
                mo98276e().setValue(arrayList2);
            }
        }
    }

    /* renamed from: a */
    public final void mo98242a(Throwable th) {
        C52711k.m112240b(th, "t");
        Throwable a = C22971a.m56490a(th);
        if (a instanceof C23459a) {
            C23459a aVar = (C23459a) a;
            int errorCode = aVar.getErrorCode();
            aVar.getResponse();
            if (errorCode == 2090) {
                C52711k.m112236a((Object) AwemeApplication.m56199a(), "AwemeApplication.getApplication()");
                if (AwemeApplication.m56200b() != null) {
                    C52711k.m112236a((Object) AwemeApplication.m56199a(), "AwemeApplication.getApplication()");
                    C10691a.m21545b((Context) AwemeApplication.m56200b(), aVar.getErrorMsg()).mo19066a();
                }
                ArrayList arrayList = (ArrayList) mo98275d().getValue();
                if (!C9376b.m18558a((Collection<T>) arrayList)) {
                    if (arrayList != null) {
                        arrayList.remove(arrayList.size() - 1);
                    }
                    mo98275d().setValue(arrayList);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo98271a(List<? extends C41684a> list, List<? extends C41684a> list2) {
        if (!C9376b.m18558a((Collection<T>) list)) {
            mo98275d().setValue((ArrayList) list);
        }
        if (!C9376b.m18558a((Collection<T>) list2)) {
            ArrayList arrayList = new ArrayList();
            if (list2 == null) {
                C52711k.m112234a();
            }
            for (C41684a aVar : list2) {
                arrayList.add(new C33123c(new C33097a("", aVar.getEnglishName(), aVar.getLanguageCode(), aVar.getLocalName()), false));
            }
            mo98276e().setValue(arrayList);
        }
    }
}
