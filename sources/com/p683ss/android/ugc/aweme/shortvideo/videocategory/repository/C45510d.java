package com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.language.I18nManagerService;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.api.C45506a;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.api.C45506a.C45507a;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.api.LongVideoCategoryApi;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.api.LongVideoCategoryApi.Api;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.p2257a.C45496a;
import com.p683ss.android.ugc.aweme.shortvideo.videocategory.repository.p2257a.p2259b.C45501a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.repository.d */
public final class C45510d implements C45495a {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f114972a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45510d.class), "mApi", "getMApi()Lcom/ss/android/ugc/aweme/shortvideo/videocategory/repository/api/LongVideoCategoryApi;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45510d.class), "mCache", "getMCache()Lcom/ss/android/ugc/aweme/shortvideo/videocategory/repository/cache/network/INetworkCache;"))};

    /* renamed from: b */
    private final C52668f f114973b = C52732g.m112306a(new LongVideoCategoryApi());

    /* renamed from: c */
    private final C52668f f114974c = C52732g.m112306a(new C45496a());

    /* renamed from: b */
    private final C45501a<List<VideoCategoryParam>> m99150b() {
        return (C45501a) this.f114974c.getValue();
    }

    /* renamed from: a */
    public final List<VideoCategoryParam> mo91769a() {
        if (m99150b().mo91771a()) {
            return m99151c();
        }
        return m99152d();
    }

    /* renamed from: d */
    private final List<VideoCategoryParam> m99152d() {
        List<VideoCategoryParam> list = (List) m99150b().mo91779c();
        if (list == null) {
            list = C52575l.m112097a();
        }
        if (!list.isEmpty()) {
            return list;
        }
        return (List) m99150b().mo91772b();
    }

    /* renamed from: c */
    private final List<VideoCategoryParam> m99151c() {
        try {
            I18nManagerService createI18nManagerServicebyMonsterPlugin = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin();
            C52711k.m112236a((Object) createI18nManagerServicebyMonsterPlugin, "ServiceManager.get().get…nagerService::class.java)");
            String appLanguage = createI18nManagerServicebyMonsterPlugin.getAppLanguage();
            LongVideoCategoryApi longVideoCategoryApi = (LongVideoCategoryApi) this.f114973b.getValue();
            Object a = RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder(C39629l.m88232a().mo58595z().getApiHost()).mo19925a().mo19930a(Api.class);
            C52711k.m112236a(a, "ServiceManager.get().get… .create(Api::class.java)");
            Api api = (Api) a;
            C52711k.m112236a((Object) appLanguage, "appLanguage");
            List<C45507a> list = ((C45506a) api.getLongVideoCategory(appLanguage).get()).f114969c;
            if (list == null) {
                return m99152d();
            }
            Iterable<C45507a> iterable = list;
            Collection arrayList = new ArrayList(C52575l.m112104a(iterable, 10));
            for (C45507a aVar : iterable) {
                arrayList.add(new VideoCategoryParam(aVar.f114971b, aVar.f114970a));
            }
            List<VideoCategoryParam> list2 = (List) arrayList;
            m99150b().mo91770a(list2);
            return list2;
        } catch (Exception unused) {
            return m99152d();
        }
    }
}
