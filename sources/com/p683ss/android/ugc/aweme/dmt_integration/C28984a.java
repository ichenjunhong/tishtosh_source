package com.p683ss.android.ugc.aweme.dmt_integration;

import android.app.Application;
import com.google.gson.C17971f;
import com.google.gson.C17978g;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.common.p1590b.C26853b;
import com.p683ss.android.ugc.aweme.common.p1591c.C26857b;
import com.p683ss.android.ugc.aweme.dmt_integration.p1668a.C29003a;
import com.p683ss.android.ugc.aweme.effect.C29204i;
import com.p683ss.android.ugc.aweme.effect.p1679f.C29199b;
import com.p683ss.android.ugc.aweme.filter.p1744c.C31429a;
import com.p683ss.android.ugc.aweme.filter.p1744c.p1745a.C31430a;
import com.p683ss.android.ugc.aweme.p1437bj.C23838e;
import com.p683ss.android.ugc.aweme.p1437bj.C23839f;
import com.p683ss.android.ugc.aweme.p1437bj.C23850h;
import com.p683ss.android.ugc.aweme.p1445bp.C23880b;
import com.p683ss.android.ugc.aweme.p1445bp.p1457h.C23938e;
import com.p683ss.android.ugc.aweme.port.internal.C39653c;
import com.p683ss.android.ugc.aweme.port.internal.C39654d;
import com.p683ss.android.ugc.aweme.port.internal.C39658g;
import com.p683ss.android.ugc.aweme.port.internal.C39664m;
import com.p683ss.android.ugc.aweme.port.internal.C39665n;
import com.p683ss.android.ugc.aweme.port.p2082in.C39527aa;
import com.p683ss.android.ugc.aweme.port.p2082in.C39547ag;
import com.p683ss.android.ugc.aweme.port.p2082in.C39552aj;
import com.p683ss.android.ugc.aweme.port.p2082in.C39567as;
import com.p683ss.android.ugc.aweme.port.p2082in.C39576ax;
import com.p683ss.android.ugc.aweme.port.p2082in.C39587ba;
import com.p683ss.android.ugc.aweme.port.p2082in.C39599bh;
import com.p683ss.android.ugc.aweme.port.p2082in.C39609bn;
import com.p683ss.android.ugc.aweme.port.p2082in.C39610bo;
import com.p683ss.android.ugc.aweme.port.p2082in.C39611bp;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.port.p2082in.C39633p;
import com.p683ss.android.ugc.aweme.port.p2082in.C39635q;
import com.p683ss.android.ugc.aweme.port.p2082in.C39636r;
import com.p683ss.android.ugc.aweme.port.p2082in.C39637s;
import com.p683ss.android.ugc.aweme.port.p2082in.C39639u;
import com.p683ss.android.ugc.aweme.port.p2082in.C39640v;
import com.p683ss.android.ugc.aweme.port.p2082in.C39645w;
import com.p683ss.android.ugc.aweme.port.p2082in.C39648y;
import com.p683ss.android.ugc.aweme.property.C40789h;
import com.p683ss.android.ugc.aweme.property.C40795l;
import com.p683ss.android.ugc.aweme.services.AndroidAssetServiceImpl;
import com.p683ss.android.ugc.aweme.services.IFoundationAVServiceProxy;
import com.p683ss.android.ugc.aweme.services.download.AVDownloadServiceImpl;
import com.p683ss.android.ugc.aweme.services.video.IVideoConfigService;
import com.p683ss.android.ugc.aweme.shortvideo.C43854fw;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45457u;
import com.p683ss.android.ugc.aweme.tools.draft.p2359e.C46993a;
import com.p683ss.android.ugc.aweme.tools.music.C47094a;
import com.p683ss.android.ugc.p1235a.C20302a;
import com.p683ss.android.ugc.p1235a.C20310d;
import java.lang.reflect.Type;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.dmt_integration.a */
public final class C28984a implements C39639u {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f75879a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "proxy", "getProxy()Lcom/ss/android/ugc/aweme/services/IFoundationAVServiceProxy;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "permissionService", "getPermissionService()Lcom/ss/android/ugc/aweme/port/in/IAVPermissionService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "draftService", "getDraftService()Lcom/ss/android/ugc/aweme/port/internal/IDraftInternalService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "avSettings", "getAvSettings()Lcom/ss/android/ugc/aweme/property/AVSettings;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "effectConfigService", "getEffectConfigService()Lcom/ss/android/ugc/aweme/port/internal/IEffectConfigService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "effectComponentService", "getEffectComponentService()Lcom/ss/android/ugc/aweme/effect/services/IEffectComponentService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "storageService", "getStorageService()Lcom/ss/android/ugc/aweme/storage/services/IStorageService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "recordVideoConfigService", "getRecordVideoConfigService()Lcom/ss/android/ugc/aweme/services/video/IVideoConfigService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "importVideoConfigService", "getImportVideoConfigService()Lcom/ss/android/ugc/aweme/services/video/IVideoConfigService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "veMonitorService", "getVeMonitorService()Lcom/ss/android/ugc/aweme/port/in/IVEMonitorService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "downloadService", "getDownloadService()Lcom/ss/android/ugc/aweme/common/download/IDownloadService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "androidAssetService", "getAndroidAssetService()Lcom/ss/android/ugc/aweme/common/android_asset/IAndroidAssetService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "avab", "getAvab()Lcom/ss/android/ugc/aweme/property/AVAB;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "filterComponentService", "getFilterComponentService()Lcom/ss/android/ugc/aweme/filter/services/IFilterComponentService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "avAnotherMusicService", "getAvAnotherMusicService()Lcom/ss/android/ugc/aweme/port/in/IAVAnotherMusicService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "customGson", "getCustomGson()Lcom/google/gson/Gson;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "monitorService", "getMonitorService()Lcom/ss/android/ugc/aweme/port/in/IMonitorService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28984a.class), "pixaloopStickerGuideService", "getPixaloopStickerGuideService()Lcom/ss/android/ugc/aweme/port/in/IPixaloopStickerGuideService;"))};

    /* renamed from: b */
    public final Application f75880b;

    /* renamed from: c */
    private final C52668f f75881c = C52732g.m112285a(C28999o.f75913a);

    /* renamed from: d */
    private final C52668f f75882d = C52732g.m112285a(C28997m.f75911a);

    /* renamed from: e */
    private final C52668f f75883e = C52732g.m112285a(C28991g.f75905a);

    /* renamed from: f */
    private final C52668f f75884f = C52732g.m112285a(new C28987c(this));

    /* renamed from: g */
    private final C52668f f75885g = C52732g.m112285a(C28993i.f75907a);

    /* renamed from: h */
    private final C52668f f75886h = C52732g.m112285a(C28992h.f75906a);

    /* renamed from: i */
    private final C52668f f75887i = C52732g.m112285a(C29001q.f75915a);

    /* renamed from: j */
    private final C52668f f75888j = C52732g.m112285a(C29000p.f75914a);

    /* renamed from: k */
    private final C52668f f75889k = C52732g.m112285a(C28995k.f75909a);

    /* renamed from: l */
    private final C52668f f75890l = C52732g.m112285a(C29002r.f75916a);

    /* renamed from: m */
    private final C52668f f75891m = C52732g.m112285a(C28990f.f75904a);

    /* renamed from: n */
    private final C52668f f75892n = C52732g.m112285a(C28985a.f75899a);

    /* renamed from: o */
    private final C52668f f75893o = C52732g.m112285a(new C28988d(this));

    /* renamed from: p */
    private final C52668f f75894p = C52732g.m112285a(C28994j.f75908a);

    /* renamed from: q */
    private final C52668f f75895q = C52732g.m112285a(C28986b.f75900a);

    /* renamed from: r */
    private final C52668f f75896r = C52732g.m112285a(C28989e.f75903a);

    /* renamed from: s */
    private final C52668f f75897s = C52732g.m112285a(C28996l.f75910a);

    /* renamed from: t */
    private final C52668f f75898t = C52732g.m112285a(C28998n.f75912a);

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$a */
    static final class C28985a extends C52712l implements C52670a<AndroidAssetServiceImpl> {

        /* renamed from: a */
        public static final C28985a f75899a = new C28985a();

        C28985a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new AndroidAssetServiceImpl();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$b */
    static final class C28986b extends C52712l implements C52670a<C47094a> {

        /* renamed from: a */
        public static final C28986b f75900a = new C28986b();

        C28986b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C47094a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$c */
    static final class C28987c extends C52712l implements C52670a<C40795l> {

        /* renamed from: a */
        final /* synthetic */ C28984a f75901a;

        C28987c(C28984a aVar) {
            this.f75901a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C40795l(this.f75901a.f75880b, 7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$d */
    static final class C28988d extends C52712l implements C52670a<C40789h> {

        /* renamed from: a */
        final /* synthetic */ C28984a f75902a;

        C28988d(C28984a aVar) {
            this.f75902a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C40789h(this.f75902a.f75880b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$e */
    static final class C28989e extends C52712l implements C52670a<C17971f> {

        /* renamed from: a */
        public static final C28989e f75903a = new C28989e();

        C28989e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C17978g gVar = new C17978g();
            gVar.f49903b = true;
            return gVar.mo34896a((Type) Integer.TYPE, (Object) new C29003a()).mo34900d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$f */
    static final class C28990f extends C52712l implements C52670a<AVDownloadServiceImpl> {

        /* renamed from: a */
        public static final C28990f f75904a = new C28990f();

        C28990f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new AVDownloadServiceImpl();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$g */
    static final class C28991g extends C52712l implements C52670a<C46993a> {

        /* renamed from: a */
        public static final C28991g f75905a = new C28991g();

        C28991g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C46993a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$h */
    static final class C28992h extends C52712l implements C52670a<C29204i> {

        /* renamed from: a */
        public static final C28992h f75906a = new C28992h();

        C28992h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29204i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$i */
    static final class C28993i extends C52712l implements C52670a<C29018j> {

        /* renamed from: a */
        public static final C28993i f75907a = new C28993i();

        C28993i() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29018j();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$j */
    static final class C28994j extends C52712l implements C52670a<C31430a> {

        /* renamed from: a */
        public static final C28994j f75908a = new C28994j();

        C28994j() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C31430a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$k */
    static final class C28995k extends C52712l implements C52670a<C39658g> {

        /* renamed from: a */
        public static final C28995k f75909a = new C28995k();

        C28995k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C39658g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$l */
    static final class C28996l extends C52712l implements C52670a<C23838e> {

        /* renamed from: a */
        public static final C28996l f75910a = new C28996l();

        C28996l() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23838e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$m */
    static final class C28997m extends C52712l implements C52670a<C23839f> {

        /* renamed from: a */
        public static final C28997m f75911a = new C28997m();

        C28997m() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23839f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$n */
    static final class C28998n extends C52712l implements C52670a<C23850h> {

        /* renamed from: a */
        public static final C28998n f75912a = new C28998n();

        C28998n() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23850h();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$o */
    static final class C28999o extends C52712l implements C52670a<IFoundationAVServiceProxy> {

        /* renamed from: a */
        public static final C28999o f75913a = new C28999o();

        C28999o() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IFoundationAVServiceProxy iFoundationAVServiceProxy;
            Object a = C27991b.m66756a(IFoundationAVServiceProxy.class);
            if (a != null) {
                iFoundationAVServiceProxy = (IFoundationAVServiceProxy) a;
            } else {
                iFoundationAVServiceProxy = (IFoundationAVServiceProxy) C20302a.m50070a(IFoundationAVServiceProxy.class).mo42947a(new C20310d()).mo42946a().mo42948b();
            }
            IFoundationAVServiceProxy iFoundationAVServiceProxy2 = iFoundationAVServiceProxy;
            if (iFoundationAVServiceProxy2 != null) {
                return iFoundationAVServiceProxy2;
            }
            throw new RuntimeException("IAVServiceProxy should be set, before use AVEnv.");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$p */
    static final class C29000p extends C52712l implements C52670a<C39664m> {

        /* renamed from: a */
        public static final C29000p f75914a = new C29000p();

        C29000p() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C39664m();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$q */
    static final class C29001q extends C52712l implements C52670a<C23880b> {

        /* renamed from: a */
        public static final C29001q f75915a = new C29001q();

        C29001q() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23880b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.dmt_integration.a$r */
    static final class C29002r extends C52712l implements C52670a<C39665n> {

        /* renamed from: a */
        public static final C29002r f75916a = new C29002r();

        C29002r() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C39665n();
        }
    }

    /* renamed from: H */
    private final IFoundationAVServiceProxy m68296H() {
        return (IFoundationAVServiceProxy) this.f75881c.getValue();
    }

    /* renamed from: E */
    public final C39567as mo58567E() {
        return (C39567as) this.f75897s.getValue();
    }

    /* renamed from: F */
    public final C39587ba mo58568F() {
        return (C39587ba) this.f75898t.getValue();
    }

    /* renamed from: b */
    public final void mo58571b() {
        C39618d.m88217f();
    }

    /* renamed from: c */
    public final C39645w mo58572c() {
        return (C39645w) this.f75882d.getValue();
    }

    /* renamed from: d */
    public final C39653c mo58573d() {
        return (C39653c) this.f75883e.getValue();
    }

    /* renamed from: e */
    public final C40795l mo58574e() {
        return (C40795l) this.f75884f.getValue();
    }

    /* renamed from: f */
    public final C39654d mo58575f() {
        return (C39654d) this.f75885g.getValue();
    }

    /* renamed from: g */
    public final C29199b mo58576g() {
        return (C29199b) this.f75886h.getValue();
    }

    /* renamed from: h */
    public final C23938e mo58577h() {
        return (C23938e) this.f75887i.getValue();
    }

    /* renamed from: i */
    public final IVideoConfigService mo58578i() {
        return (IVideoConfigService) this.f75888j.getValue();
    }

    /* renamed from: j */
    public final IVideoConfigService mo58579j() {
        return (IVideoConfigService) this.f75889k.getValue();
    }

    /* renamed from: k */
    public final C39611bp mo58580k() {
        return (C39611bp) this.f75890l.getValue();
    }

    /* renamed from: l */
    public final C26857b mo58581l() {
        return (C26857b) this.f75891m.getValue();
    }

    /* renamed from: m */
    public final C26853b mo58582m() {
        return (C26853b) this.f75892n.getValue();
    }

    /* renamed from: n */
    public final C40789h mo58583n() {
        return (C40789h) this.f75893o.getValue();
    }

    /* renamed from: o */
    public final C31429a mo58584o() {
        return (C31429a) this.f75894p.getValue();
    }

    /* renamed from: p */
    public final C39633p mo58585p() {
        return (C39633p) this.f75895q.getValue();
    }

    /* renamed from: r */
    public final void mo58587r() {
        C39618d.m88216e();
    }

    /* renamed from: A */
    public final C39599bh mo58563A() {
        C39599bh iStickerPropService = m68296H().getIStickerPropService();
        C52711k.m112236a((Object) iStickerPropService, "proxy.iStickerPropService");
        return iStickerPropService;
    }

    /* renamed from: B */
    public final C39609bn mo58564B() {
        C39609bn uiService = m68296H().getUiService();
        C52711k.m112236a((Object) uiService, "proxy.uiService");
        return uiService;
    }

    /* renamed from: C */
    public final C39610bo mo58565C() {
        C39610bo unlockStickerService = m68296H().unlockStickerService();
        C52711k.m112236a((Object) unlockStickerService, "proxy.unlockStickerService()");
        return unlockStickerService;
    }

    /* renamed from: D */
    public final C17971f mo58566D() {
        return (C17971f) this.f75896r.getValue();
    }

    /* renamed from: G */
    public final String mo58569G() {
        String a = C45457u.m99056a();
        C52711k.m112236a((Object) a, "CameraInitEntrance.getCameraTypeString()");
        return a;
    }

    /* renamed from: a */
    public final C39648y mo58570a() {
        C39648y publishService = m68296H().getPublishService();
        C52711k.m112236a((Object) publishService, "proxy.publishService");
        return publishService;
    }

    /* renamed from: q */
    public final void mo58586q() {
        new C43854fw();
        C39618d.m88210a(C43854fw.m96287a());
    }

    /* renamed from: s */
    public final C39635q mo58588s() {
        C39635q applicationService = m68296H().getApplicationService();
        C52711k.m112236a((Object) applicationService, "proxy.applicationService");
        return applicationService;
    }

    /* renamed from: t */
    public final C39547ag mo58589t() {
        C39547ag challengeService = m68296H().getChallengeService();
        C52711k.m112236a((Object) challengeService, "proxy.challengeService");
        return challengeService;
    }

    /* renamed from: u */
    public final C39640v mo58590u() {
        C39640v locationService = m68296H().getLocationService();
        C52711k.m112236a((Object) locationService, "proxy.locationService");
        return locationService;
    }

    /* renamed from: v */
    public final C39637s mo58591v() {
        C39637s commerceService = m68296H().getCommerceService();
        C52711k.m112236a((Object) commerceService, "proxy.commerceService");
        return commerceService;
    }

    /* renamed from: w */
    public final C39552aj mo58592w() {
        C39552aj decompressService = m68296H().getDecompressService();
        C52711k.m112236a((Object) decompressService, "proxy.decompressService");
        return decompressService;
    }

    /* renamed from: x */
    public final C39527aa mo58593x() {
        C39527aa accountService = m68296H().getAccountService();
        C52711k.m112236a((Object) accountService, "proxy.accountService");
        return accountService;
    }

    /* renamed from: y */
    public final C39636r mo58594y() {
        C39636r bridgeService = m68296H().getBridgeService();
        C52711k.m112236a((Object) bridgeService, "proxy.bridgeService");
        return bridgeService;
    }

    /* renamed from: z */
    public final C39576ax mo58595z() {
        C39576ax networkService = m68296H().getNetworkService();
        C52711k.m112236a((Object) networkService, "proxy.networkService");
        return networkService;
    }

    public C28984a(Application application) {
        C52711k.m112240b(application, "application");
        this.f75880b = application;
    }
}
