package com.p683ss.android.ugc.aweme.dmt_integration;

import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.p1437bj.C23851i;
import com.p683ss.android.ugc.aweme.port.p2082in.C39529ab;
import com.p683ss.android.ugc.aweme.port.p2082in.C39541ac;
import com.p683ss.android.ugc.aweme.port.p2082in.C39543ad;
import com.p683ss.android.ugc.aweme.port.p2082in.C39544ae;
import com.p683ss.android.ugc.aweme.port.p2082in.C39545af;
import com.p683ss.android.ugc.aweme.port.p2082in.C39548ah;
import com.p683ss.android.ugc.aweme.port.p2082in.C39550ai;
import com.p683ss.android.ugc.aweme.port.p2082in.C39553ak;
import com.p683ss.android.ugc.aweme.port.p2082in.C39554al;
import com.p683ss.android.ugc.aweme.port.p2082in.C39560am;
import com.p683ss.android.ugc.aweme.port.p2082in.C39562ao;
import com.p683ss.android.ugc.aweme.port.p2082in.C39564aq;
import com.p683ss.android.ugc.aweme.port.p2082in.C39566ar;
import com.p683ss.android.ugc.aweme.port.p2082in.C39573av;
import com.p683ss.android.ugc.aweme.port.p2082in.C39575aw;
import com.p683ss.android.ugc.aweme.port.p2082in.C39577ay;
import com.p683ss.android.ugc.aweme.port.p2082in.C39578az;
import com.p683ss.android.ugc.aweme.port.p2082in.C39588bb;
import com.p683ss.android.ugc.aweme.port.p2082in.C39591bc;
import com.p683ss.android.ugc.aweme.port.p2082in.C39593bd;
import com.p683ss.android.ugc.aweme.port.p2082in.C39594be;
import com.p683ss.android.ugc.aweme.port.p2082in.C39596bf;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg;
import com.p683ss.android.ugc.aweme.port.p2082in.C39600bi;
import com.p683ss.android.ugc.aweme.port.p2082in.C39603bj;
import com.p683ss.android.ugc.aweme.port.p2082in.C39604bk;
import com.p683ss.android.ugc.aweme.port.p2082in.C39605bl;
import com.p683ss.android.ugc.aweme.port.p2082in.C39608bm;
import com.p683ss.android.ugc.aweme.port.p2082in.C39613br;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.port.p2082in.C39631n;
import com.p683ss.android.ugc.aweme.port.p2082in.C39633p;
import com.p683ss.android.ugc.aweme.port.p2082in.C39638t;
import com.p683ss.android.ugc.aweme.port.p2082in.C39645w;
import com.p683ss.android.ugc.aweme.port.p2082in.C39647x;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieServiceProvider;
import com.p683ss.android.ugc.aweme.tools.mvtemplate.p2368b.C47247c;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.i */
public final class C29012i implements C39553ak {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f75925a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29012i.class), "proxy", "getProxy()Lcom/ss/android/ugc/aweme/services/IAVServiceProxy;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29012i.class), "privacySettingService", "getPrivacySettingService()Lcom/ss/android/ugc/aweme/port/in/IAVPrivacySettingService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29012i.class), "musicService", "getMusicService()Lcom/ss/android/ugc/aweme/port/in/IAnotherMusicService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29012i.class), "permissionService", "getPermissionService()Lcom/ss/android/ugc/aweme/port/in/IPermissionService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29012i.class), "mvTemplateService", "getMvTemplateService()Lcom/ss/android/ugc/aweme/port/in/IMvTemplateService;"))};

    /* renamed from: b */
    private final C52668f f75926b = C52732g.m112285a(C29017e.f75935a);

    /* renamed from: c */
    private final C52668f f75927c = C52732g.m112285a(C29016d.f75934a);

    /* renamed from: d */
    private final C52668f f75928d = C52732g.m112285a(C29013a.f75931a);

    /* renamed from: e */
    private final C52668f f75929e = C52732g.m112285a(C29015c.f75933a);

    /* renamed from: f */
    private final C52668f f75930f = C52732g.m112285a(C29014b.f75932a);

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.i$a */
    static final class C29013a extends C52712l implements C52670a<C39529ab> {

        /* renamed from: a */
        public static final C29013a f75931a = new C29013a();

        C29013a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C39633p p = C39629l.m88232a().mo58585p();
            if (p != null) {
                return (C39529ab) p;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.port.`in`.IAnotherMusicService");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.i$b */
    static final class C29014b extends C52712l implements C52670a<C47247c> {

        /* renamed from: a */
        public static final C29014b f75932a = new C29014b();

        C29014b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C47247c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.i$c */
    static final class C29015c extends C52712l implements C52670a<C39578az> {

        /* renamed from: a */
        public static final C29015c f75933a = new C29015c();

        C29015c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C39645w c = C39629l.m88232a().mo58572c();
            if (c != null) {
                return (C39578az) c;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.port.`in`.IPermissionService");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.i$d */
    static final class C29016d extends C52712l implements C52670a<C23851i> {

        /* renamed from: a */
        public static final C29016d f75934a = new C29016d();

        C29016d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23851i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.i$e */
    static final class C29017e extends C52712l implements C52670a<IAVServiceProxy> {

        /* renamed from: a */
        public static final C29017e f75935a = new C29017e();

        C29017e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
            if (createIAVServiceProxybyMonsterPlugin != null) {
                return createIAVServiceProxybyMonsterPlugin;
            }
            throw new RuntimeException("IAVServiceProxy should be set, before use AVEnv.");
        }
    }

    /* renamed from: G */
    private final IAVServiceProxy m68332G() {
        return (IAVServiceProxy) this.f75926b.getValue();
    }

    /* renamed from: a */
    public final C39647x mo58603a() {
        return (C39647x) this.f75927c.getValue();
    }

    /* renamed from: b */
    public final C39529ab mo58604b() {
        return (C39529ab) this.f75928d.getValue();
    }

    /* renamed from: c */
    public final C39578az mo58605c() {
        return (C39578az) this.f75929e.getValue();
    }

    /* renamed from: d */
    public final C39573av mo58606d() {
        return (C39573av) this.f75930f.getValue();
    }

    /* renamed from: A */
    public final C39548ah mo58597A() {
        C39548ah commerceService = m68332G().getCommerceService();
        C52711k.m112236a((Object) commerceService, "proxy.commerceService");
        return commerceService;
    }

    /* renamed from: B */
    public final C39566ar mo58598B() {
        C39566ar locationService = m68332G().getLocationService();
        C52711k.m112236a((Object) locationService, "proxy.locationService");
        return locationService;
    }

    /* renamed from: C */
    public final IPhotoMovieServiceProvider mo58599C() {
        IPhotoMovieServiceProvider photoMovieServiceProvider = m68332G().getPhotoMovieServiceProvider();
        C52711k.m112236a((Object) photoMovieServiceProvider, "proxy.photoMovieServiceProvider");
        return photoMovieServiceProvider;
    }

    /* renamed from: D */
    public final C39550ai mo58600D() {
        return m68332G().getConnectionService();
    }

    /* renamed from: E */
    public final C39596bf mo58601E() {
        return m68332G().getShareService();
    }

    /* renamed from: F */
    public final C39613br mo58602F() {
        C39613br wikiService = m68332G().getWikiService();
        C52711k.m112236a((Object) wikiService, "proxy.wikiService");
        return wikiService;
    }

    /* renamed from: e */
    public final C39631n mo58607e() {
        C39631n aBService = m68332G().getABService();
        C52711k.m112236a((Object) aBService, "proxy.abService");
        return aBService;
    }

    /* renamed from: f */
    public final C39541ac mo58608f() {
        C39541ac applicationService = m68332G().getApplicationService();
        C52711k.m112236a((Object) applicationService, "proxy.applicationService");
        return applicationService;
    }

    /* renamed from: g */
    public final C39603bj mo58609g() {
        C39603bj storyPublishService = m68332G().getStoryPublishService();
        C52711k.m112236a((Object) storyPublishService, "proxy.storyPublishService");
        return storyPublishService;
    }

    /* renamed from: h */
    public final C39543ad mo58610h() {
        C39543ad bridgeService = m68332G().getBridgeService();
        C52711k.m112236a((Object) bridgeService, "proxy.bridgeService");
        return bridgeService;
    }

    /* renamed from: i */
    public final C39554al mo58611i() {
        return m68332G().getDmtChallengeService();
    }

    /* renamed from: j */
    public final C39564aq mo58612j() {
        return m68332G().getLiveService();
    }

    /* renamed from: k */
    public final C39591bc mo58613k() {
        C39591bc publishService = m68332G().getPublishService();
        C52711k.m112236a((Object) publishService, "proxy.publishService");
        return publishService;
    }

    /* renamed from: l */
    public final C39638t mo58614l() {
        C39638t aVConverter = m68332G().getAVConverter();
        C52711k.m112236a((Object) aVConverter, "proxy.avConverter");
        return aVConverter;
    }

    /* renamed from: m */
    public final C39544ae mo58615m() {
        C39544ae businessGoodsService = m68332G().getBusinessGoodsService();
        C52711k.m112236a((Object) businessGoodsService, "proxy.businessGoodsService");
        return businessGoodsService;
    }

    /* renamed from: n */
    public final C39545af mo58616n() {
        C39545af captureService = m68332G().getCaptureService();
        C52711k.m112236a((Object) captureService, "proxy.captureService");
        return captureService;
    }

    /* renamed from: o */
    public final C39560am mo58617o() {
        C39560am duoShanService = m68332G().getDuoShanService();
        C52711k.m112236a((Object) duoShanService, "proxy.duoShanService");
        return duoShanService;
    }

    /* renamed from: p */
    public final C39562ao mo58618p() {
        C39562ao hashTagService = m68332G().getHashTagService();
        C52711k.m112236a((Object) hashTagService, "proxy.hashTagService");
        return hashTagService;
    }

    /* renamed from: q */
    public final C39575aw mo58619q() {
        return m68332G().getNationalTaskService();
    }

    /* renamed from: r */
    public final C39577ay mo58620r() {
        C39577ay openSDKService = m68332G().openSDKService();
        C52711k.m112236a((Object) openSDKService, "proxy.openSDKService()");
        return openSDKService;
    }

    /* renamed from: s */
    public final C39588bb mo58621s() {
        C39588bb poiService = m68332G().getPoiService();
        C52711k.m112236a((Object) poiService, "proxy.poiService");
        return poiService;
    }

    /* renamed from: t */
    public final C39593bd mo58622t() {
        C39593bd settingService = m68332G().getSettingService();
        C52711k.m112236a((Object) settingService, "proxy.settingService");
        return settingService;
    }

    /* renamed from: v */
    public final C39600bi mo58624v() {
        C39600bi stickerShareService = m68332G().getStickerShareService();
        C52711k.m112236a((Object) stickerShareService, "proxy.stickerShareService");
        return stickerShareService;
    }

    /* renamed from: w */
    public final C39604bk mo58625w() {
        return m68332G().getSummonFriendService();
    }

    /* renamed from: x */
    public final C39605bl mo58626x() {
        C39605bl syncShareService = m68332G().getSyncShareService();
        C52711k.m112236a((Object) syncShareService, "proxy.syncShareService");
        return syncShareService;
    }

    /* renamed from: y */
    public final C39608bm mo58627y() {
        C39608bm toolsComponentService = m68332G().getToolsComponentService();
        C52711k.m112236a((Object) toolsComponentService, "proxy.toolsComponentService");
        return toolsComponentService;
    }

    /* renamed from: z */
    public final C39597bg mo58628z() {
        C39597bg shortVideoPluginService = m68332G().getShortVideoPluginService();
        C52711k.m112236a((Object) shortVideoPluginService, "proxy.shortVideoPluginService");
        return shortVideoPluginService;
    }

    /* renamed from: u */
    public final C39594be mo58623u() {
        C39594be spService = m68332G().getSpService();
        if (spService != null) {
            return spService;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.port.`in`.ISharePrefService");
    }
}
