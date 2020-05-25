package com.p683ss.android.ugc.aweme.out;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.C24048bt;
import com.p683ss.android.ugc.aweme.external.C29511a;
import com.p683ss.android.ugc.aweme.external.C29577b;
import com.p683ss.android.ugc.aweme.external.C29606c;
import com.p683ss.android.ugc.aweme.external.C29607d;
import com.p683ss.android.ugc.aweme.external.C29610e;
import com.p683ss.android.ugc.aweme.external.C29626g;
import com.p683ss.android.ugc.aweme.external.C29629h;
import com.p683ss.android.ugc.aweme.external.p1696a.C29564e;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.p1437bj.C23830a;
import com.p683ss.android.ugc.aweme.p1441bn.C23863a.C23864a;
import com.p683ss.android.ugc.aweme.p1632di.C27613b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.AVPublishServiceImpl;
import com.p683ss.android.ugc.aweme.services.IAVFilterService;
import com.p683ss.android.ugc.aweme.services.IAVMobService;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.ITakeInSameOptimize;
import com.p683ss.android.ugc.aweme.services.cutvideo.CutVideoService;
import com.p683ss.android.ugc.aweme.services.cutvideo.ICutVideoService;
import com.p683ss.android.ugc.aweme.services.external.IAVDraftService;
import com.p683ss.android.ugc.aweme.services.external.IAVScreenAdaptService;
import com.p683ss.android.ugc.aweme.services.external.IAVTypeFaceService;
import com.p683ss.android.ugc.aweme.services.external.IConfigService;
import com.p683ss.android.ugc.aweme.services.external.IInfoService;
import com.p683ss.android.ugc.aweme.services.external.IInitTaskService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.p683ss.android.ugc.aweme.services.performance.IAVPerformance;
import com.p683ss.android.ugc.aweme.services.performance.ICrashReportService;
import com.p683ss.android.ugc.aweme.services.specialplus.ISpecialPlusService;
import com.p683ss.android.ugc.aweme.services.superentrance.ISuperEntranceService;
import com.p683ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p683ss.android.ugc.aweme.services.video.IActivityNameService;
import com.p683ss.android.ugc.aweme.shortvideo.C43854fw;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45412b;
import com.p683ss.android.ugc.aweme.story.shootvideo.textfont.C46679c;
import com.p683ss.android.ugc.aweme.utils.C47919gk;
import com.ss.android.ugc.trill.R;
import dmt.p2652av.video.p2654b.C52938f;
import dmt.p2652av.video.superentrance.C53020f.C53021a;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl */
public final class AVExternalServiceImpl implements IExternalService {
    static final /* synthetic */ C52767h[] $$delegatedProperties = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVExternalServiceImpl.class), "draftService", "getDraftService()Lcom/ss/android/ugc/aweme/external/AVDraftServiceImpl;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVExternalServiceImpl.class), "abilityService", "getAbilityService()Lcom/ss/android/ugc/aweme/external/ability/AbilityServiceImpl;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVExternalServiceImpl.class), "configService", "getConfigService()Lcom/ss/android/ugc/aweme/external/ConfigServiceImpl;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVExternalServiceImpl.class), "infoService", "getInfoService()Lcom/ss/android/ugc/aweme/external/InfoServiceImpl;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVExternalServiceImpl.class), "asyncService", "getAsyncService()Lcom/ss/android/ugc/aweme/out/ExternalAsyncServiceImpl;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVExternalServiceImpl.class), "cutVideoService", "getCutVideoService()Lcom/ss/android/ugc/aweme/services/cutvideo/CutVideoService;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVExternalServiceImpl.class), "avPerformance", "getAvPerformance()Lcom/ss/android/ugc/aweme/shortvideo/util/AVPerformance;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVExternalServiceImpl.class), "crashReportService", "getCrashReportService()Lcom/ss/android/ugc/aweme/external/AVCrashReportServiceImpl;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVExternalServiceImpl.class), "avMobService", "getAvMobService()Lcom/ss/android/ugc/aweme/servicimpl/AVMobServiceImpl;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVExternalServiceImpl.class), "takeInSameOptimize", "getTakeInSameOptimize()Lcom/ss/android/ugc/aweme/services/ITakeInSameOptimize;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVExternalServiceImpl.class), "filterService", "getFilterService()Lcom/ss/android/ugc/aweme/out/AVExternalServiceImpl$filterService$2$1;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AVExternalServiceImpl.class), "screenAdaptService", "getScreenAdaptService()Lcom/ss/android/ugc/aweme/external/AVScreenAdaptServiceImpl;"))};
    public final String TAG = "So decompress: asyncService";
    private final C52668f abilityService$delegate = C52732g.m112285a(C38544a.f98048a);
    private final C52668f asyncService$delegate = C52732g.m112285a(C38545b.f98049a);
    private final C52668f avMobService$delegate = C52732g.m112285a(C38547d.f98052a);
    private final C52668f avPerformance$delegate = C52732g.m112285a(C38548e.f98053a);
    private final C52668f configService$delegate = C52732g.m112285a(C38549f.f98054a);
    private final C52668f crashReportService$delegate = C52732g.m112285a(C38550g.f98055a);
    private final C52668f cutVideoService$delegate = C52732g.m112285a(C38551h.f98056a);
    private final C52668f draftService$delegate = C52732g.m112285a(C38552i.f98057a);
    private final C52668f filterService$delegate = C52732g.m112285a(C38553j.f98058a);
    private final C52668f infoService$delegate = C52732g.m112285a(C38555k.f98059a);
    private final C52668f screenAdaptService$delegate = C52732g.m112285a(C38556l.f98060a);
    private final C52668f takeInSameOptimize$delegate = C52732g.m112285a(C38557m.f98061a);

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$a */
    static final class C38544a extends C52712l implements C52670a<C29564e> {

        /* renamed from: a */
        public static final C38544a f98048a = new C38544a();

        C38544a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29564e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$b */
    static final class C38545b extends C52712l implements C52670a<C38561a> {

        /* renamed from: a */
        public static final C38545b f98049a = new C38545b();

        C38545b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C38561a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$c */
    static final class C38546c extends C52712l implements C52682m<Boolean, Long, C52860x> {

        /* renamed from: a */
        final /* synthetic */ AVExternalServiceImpl f98050a;

        /* renamed from: b */
        final /* synthetic */ AsyncServiceLoader f98051b;

        C38546c(AVExternalServiceImpl aVExternalServiceImpl, AsyncServiceLoader asyncServiceLoader) {
            this.f98050a = aVExternalServiceImpl;
            this.f98051b = asyncServiceLoader;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            long longValue = ((Number) obj2).longValue();
            if (booleanValue) {
                C52938f.f131308b.mo110536b();
                this.f98051b.onLoad(this.f98050a.getAsyncService(), longValue);
            } else {
                Activity g = C11016e.m22312g();
                if (g != null && g.hasWindowFocus()) {
                    C10691a.m21549c((Context) C11016e.m22312g(), (int) R.string.ar9, 1).mo19066a();
                }
                RuntimeException runtimeException = new RuntimeException("AsyncServiceLoader, decompress failed");
                StringBuilder sb = new StringBuilder();
                sb.append(this.f98050a.TAG);
                sb.append(", ");
                sb.append(runtimeException.getMessage());
                sb.append(", ");
                sb.append(Log.getStackTraceString(runtimeException));
                C45407ay.m98968a(sb.toString());
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$d */
    static final class C38547d extends C52712l implements C52670a<C23830a> {

        /* renamed from: a */
        public static final C38547d f98052a = new C38547d();

        C38547d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C23830a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$e */
    static final class C38548e extends C52712l implements C52670a<C45412b> {

        /* renamed from: a */
        public static final C38548e f98053a = new C38548e();

        C38548e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C45412b.m98979a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$f */
    static final class C38549f extends C52712l implements C52670a<C29610e> {

        /* renamed from: a */
        public static final C38549f f98054a = new C38549f();

        C38549f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29610e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$g */
    static final class C38550g extends C52712l implements C52670a<C29511a> {

        /* renamed from: a */
        public static final C38550g f98055a = new C38550g();

        C38550g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29511a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$h */
    static final class C38551h extends C52712l implements C52670a<CutVideoService> {

        /* renamed from: a */
        public static final C38551h f98056a = new C38551h();

        C38551h() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new CutVideoService();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$i */
    static final class C38552i extends C52712l implements C52670a<C29577b> {

        /* renamed from: a */
        public static final C38552i f98057a = new C38552i();

        C38552i() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29577b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$j */
    static final class C38553j extends C52712l implements C52670a<C385541> {

        /* renamed from: a */
        public static final C38553j f98058a = new C38553j();

        C38553j() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new IAVFilterService() {
                public final String getFilterFolder(C31459g gVar) {
                    C52711k.m112240b(gVar, "filterBean");
                    String str = gVar.f82332i;
                    C52711k.m112236a((Object) str, "filterBean.filterFolder");
                    return str;
                }

                public final void setFilterFolder(C31459g gVar, String str) {
                    C52711k.m112240b(gVar, "filterBean");
                    C52711k.m112240b(str, "string");
                    gVar.f82332i = str;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$k */
    static final class C38555k extends C52712l implements C52670a<C29626g> {

        /* renamed from: a */
        public static final C38555k f98059a = new C38555k();

        C38555k() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29626g();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$l */
    static final class C38556l extends C52712l implements C52670a<C29606c> {

        /* renamed from: a */
        public static final C38556l f98060a = new C38556l();

        C38556l() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29606c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$m */
    static final class C38557m extends C52712l implements C52670a<C24048bt> {

        /* renamed from: a */
        public static final C38557m f98061a = new C38557m();

        C38557m() {
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C24048bt.f63834b;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$n */
    public static final class C38558n implements IAVTypeFaceService {

        /* renamed from: a */
        final /* synthetic */ AVExternalServiceImpl f98062a;

        /* renamed from: com.ss.android.ugc.aweme.out.AVExternalServiceImpl$n$a */
        static final class C38559a extends C52712l implements C52682m<Boolean, Long, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C38558n f98063a;

            /* renamed from: b */
            final /* synthetic */ Context f98064b;

            C38559a(C38558n nVar, Context context) {
                this.f98063a = nVar;
                this.f98064b = context;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((Number) obj2).longValue();
                if (booleanValue) {
                    C46679c.m101291a().mo93624a(this.f98064b);
                } else {
                    RuntimeException runtimeException = new RuntimeException("IAVTypeFaceService, decompress fail");
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f98063a.f98062a.TAG);
                    sb.append(", ");
                    sb.append(runtimeException.getMessage());
                    sb.append(", ");
                    sb.append(Log.getStackTraceString(runtimeException));
                    C45407ay.m98968a(sb.toString());
                }
                return C52860x.f131107a;
            }
        }

        C38558n(AVExternalServiceImpl aVExternalServiceImpl) {
            this.f98062a = aVExternalServiceImpl;
        }

        public final Typeface getTypefaceByFontName(String str) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
            return C46679c.m101291a().mo93635d(str);
        }

        public final void prefetch(Context context) {
            C52711k.m112240b(context, "context");
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
            C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
            createIAVServiceProxybyMonsterPlugin.getDecompressService().mo74198a(false, new C38559a(this, context));
        }
    }

    public static IExternalService getAVServiceImpl_Monster() {
        if (C27991b.f73524t == null) {
            synchronized (IExternalService.class) {
                if (C27991b.f73524t == null) {
                    C27991b.f73524t = C27613b.m66289b();
                }
            }
        }
        return (IExternalService) C27991b.f73524t;
    }

    private final C29564e getAbilityService() {
        return (C29564e) this.abilityService$delegate.getValue();
    }

    private final C23830a getAvMobService() {
        return (C23830a) this.avMobService$delegate.getValue();
    }

    private final C45412b getAvPerformance() {
        return (C45412b) this.avPerformance$delegate.getValue();
    }

    private final C29610e getConfigService() {
        return (C29610e) this.configService$delegate.getValue();
    }

    private final C29511a getCrashReportService() {
        return (C29511a) this.crashReportService$delegate.getValue();
    }

    private final CutVideoService getCutVideoService() {
        return (CutVideoService) this.cutVideoService$delegate.getValue();
    }

    private final C29577b getDraftService() {
        return (C29577b) this.draftService$delegate.getValue();
    }

    private final C385541 getFilterService() {
        return (C385541) this.filterService$delegate.getValue();
    }

    private final C29626g getInfoService() {
        return (C29626g) this.infoService$delegate.getValue();
    }

    private final C29606c getScreenAdaptService() {
        return (C29606c) this.screenAdaptService$delegate.getValue();
    }

    private final ITakeInSameOptimize getTakeInSameOptimize() {
        return (ITakeInSameOptimize) this.takeInSameOptimize$delegate.getValue();
    }

    public final C38561a getAsyncService() {
        return (C38561a) this.asyncService$delegate.getValue();
    }

    public final IAbilityService abilityService() {
        return getAbilityService();
    }

    public final IConfigService configService() {
        return getConfigService();
    }

    public final IAVDraftService draftService() {
        return getDraftService();
    }

    public final IAVFilterService filterService() {
        return getFilterService();
    }

    public final IAVMobService getAVMobService() {
        return getAvMobService();
    }

    /* renamed from: getCutVideoService reason: collision with other method in class */
    public final ICutVideoService m114617getCutVideoService() {
        return getCutVideoService();
    }

    public final IInfoService infoService() {
        return getInfoService();
    }

    public final IInitTaskService initService() {
        return new C29629h();
    }

    public final ICrashReportService provideErrorReporter() {
        return getCrashReportService();
    }

    public final ITakeInSameOptimize provideTakeInSameOptimize() {
        return getTakeInSameOptimize();
    }

    public final IAVScreenAdaptService screenAdaptService() {
        return getScreenAdaptService();
    }

    public final ISpecialPlusService specialPlusService() {
        return C23864a.m58580a();
    }

    public final ISuperEntranceService superEntranceService() {
        return C53021a.m112748a();
    }

    public final IAVTypeFaceService typeFaceService() {
        return new C38558n(this);
    }

    public final IActivityNameService classnameService() {
        return (C29607d) C29607d.f77459a.getValue();
    }

    public final void initASVE() {
        new C43854fw();
        C39618d.m88210a(C43854fw.m96287a());
    }

    public final IAVPerformance provideAVPerformance() {
        C45412b avPerformance = getAvPerformance();
        C52711k.m112236a((Object) avPerformance, "avPerformance");
        return avPerformance;
    }

    public final IAVPublishService publishService() {
        AVPublishServiceImpl instance = AVPublishServiceImpl.getInstance();
        C52711k.m112236a((Object) instance, "AVPublishServiceImpl.getInstance()");
        return instance;
    }

    public static IExternalService createIExternalServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IExternalService.class);
        if (a != null) {
            return (IExternalService) a;
        }
        if (C27991b.f73495az == null) {
            synchronized (IExternalService.class) {
                if (C27991b.f73495az == null) {
                    C27991b.f73495az = new AVExternalServiceImpl();
                }
            }
        }
        return (AVExternalServiceImpl) C27991b.f73495az;
    }

    public AVExternalServiceImpl() {
        C47919gk.m103684b();
    }

    public final void asyncService(AsyncServiceLoader asyncServiceLoader) {
        C52711k.m112240b(asyncServiceLoader, "callback");
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
        C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
        createIAVServiceProxybyMonsterPlugin.getDecompressService().mo74198a(true, new C38546c(this, asyncServiceLoader));
    }
}
