package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.gson.C17971f;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.draft.model.DraftUpdateService;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45627c;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl */
public final class DraftUpdateServiceImpl implements DraftUpdateService {
    public static final C42369a Companion = new C42369a(null);
    public static final C52668f gson$delegate = C52732g.m112285a(C42370b.f106994a);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl$a */
    public static final class C42369a {

        /* renamed from: a */
        static final /* synthetic */ C52767h[] f106993a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42369a.class), "gson", "getGson()Lcom/google/gson/Gson;"))};

        private C42369a() {
        }

        public /* synthetic */ C42369a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl$b */
    static final class C42370b extends C52712l implements C52670a<C17971f> {

        /* renamed from: a */
        public static final C42370b f106994a = new C42370b();

        C42370b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
            C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
            return createIAVServiceProxybyMonsterPlugin.getNetworkService().getRetrofitFactoryGson();
        }
    }

    public static DraftUpdateService createDraftUpdateServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(DraftUpdateService.class);
        if (a != null) {
            return (DraftUpdateService) a;
        }
        if (C27991b.f73487ar == null) {
            synchronized (DraftUpdateService.class) {
                if (C27991b.f73487ar == null) {
                    C27991b.f73487ar = new DraftUpdateServiceImpl();
                }
            }
        }
        return (DraftUpdateServiceImpl) C27991b.f73487ar;
    }

    public final C42482c transformNewAVMusic(String str) {
        boolean z;
        C52711k.m112240b(str, "musicString");
        Object a = ((C17971f) gson$delegate.getValue()).mo34884a(str, MusicModel.class);
        C52711k.m112236a(a, "gson\n                .fr…, MusicModel::class.java)");
        MusicModel musicModel = (MusicModel) a;
        if (musicModel.getName() == null && musicModel.getMusicType() == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Object a2 = C47759cc.m103382a().getGson().mo34884a(str, C42482c.class);
            C52711k.m112236a(a2, "GsonProvider.get().getGs…ing, AVMusic::class.java)");
            return (C42482c) a2;
        }
        new C45627c();
        C42482c a3 = C45627c.m99362a(musicModel);
        C52711k.m112236a((Object) a3, "AVMusicTransformation().apply(oldMusicModel)!!");
        return a3;
    }
}
