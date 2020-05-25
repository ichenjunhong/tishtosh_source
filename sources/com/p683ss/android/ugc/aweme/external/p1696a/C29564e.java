package com.p683ss.android.ugc.aweme.external.p1696a;

import android.content.Context;
import android.util.Log;
import android.view.SurfaceHolder;
import com.p683ss.android.ugc.aweme.C22314ad;
import com.p683ss.android.ugc.aweme.C24517cc;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVCameraService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVCameraService.IAVCameraReadyCallback;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVLoaderService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVLoaderService.ILoaderCallback;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVProcessService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAbilityService;
import com.p683ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45407ay;
import dmt.p2652av.video.p2654b.C52938f;
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

/* renamed from: com.ss.android.ugc.aweme.external.a.e */
public final class C29564e implements IAbilityService {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f77385a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29564e.class), "effectService", "getEffectService()Lcom/ss/android/ugc/aweme/external/ability/AVEffectServiceImpl;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29564e.class), "infoService", "getInfoService()Lcom/ss/android/ugc/aweme/external/ability/AVInfoServiceImpl;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29564e.class), "transformService", "getTransformService()Lcom/ss/android/ugc/aweme/external/ability/AVTransformServiceImpl;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C29564e.class), "processService", "getProcessService()Lcom/ss/android/ugc/aweme/external/ability/AVProcessServiceImpl;"))};

    /* renamed from: b */
    private final C52668f f77386b = C52732g.m112285a(C29570c.f77400a);

    /* renamed from: c */
    private final C52668f f77387c = C52732g.m112285a(C29571d.f77401a);

    /* renamed from: d */
    private final C52668f f77388d = C52732g.m112285a(C29576g.f77405a);

    /* renamed from: e */
    private final C52668f f77389e = C52732g.m112285a(C29575f.f77404a);

    /* renamed from: com.ss.android.ugc.aweme.external.a.e$a */
    public static final class C29565a {

        /* renamed from: a */
        public C52670a<C52860x> f77390a;

        /* renamed from: b */
        public C52670a<C52860x> f77391b;

        /* renamed from: c */
        public final String f77392c = "So decompress: AbilityServiceImpl";

        /* renamed from: d */
        private boolean f77393d;

        /* renamed from: com.ss.android.ugc.aweme.external.a.e$a$a */
        static final class C29566a extends C52712l implements C52682m<Boolean, Long, C52860x> {

            /* renamed from: a */
            final /* synthetic */ C29565a f77394a;

            C29566a(C29565a aVar) {
                this.f77394a = aVar;
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((Number) obj2).longValue();
                if (booleanValue) {
                    C52670a<C52860x> aVar = this.f77394a.f77391b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    RuntimeException runtimeException = new RuntimeException("AbilityService, decompress success");
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f77394a.f77392c);
                    sb.append(", ");
                    sb.append(runtimeException.getMessage());
                    sb.append(", ");
                    sb.append(Log.getStackTraceString(runtimeException));
                    C45407ay.m98968a(sb.toString());
                } else {
                    C52670a<C52860x> aVar2 = this.f77394a.f77390a;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    RuntimeException runtimeException2 = new RuntimeException("AbilityService, decompress fail");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f77394a.f77392c);
                    sb2.append(", ");
                    sb2.append(runtimeException2.getMessage());
                    sb2.append(", ");
                    sb2.append(Log.getStackTraceString(runtimeException2));
                    C45407ay.m98968a(sb2.toString());
                }
                return C52860x.f131107a;
            }
        }

        /* renamed from: a */
        public final void mo59666a() {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
            C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
            createIAVServiceProxybyMonsterPlugin.getDecompressService().mo74198a(this.f77393d, new C29566a(this));
        }

        /* renamed from: a */
        public final C29565a mo59665a(boolean z) {
            this.f77393d = z;
            return this;
        }

        /* renamed from: b */
        public final C29565a mo59667b(C52670a<C52860x> aVar) {
            this.f77390a = aVar;
            return this;
        }

        /* renamed from: a */
        public final C29565a mo59664a(C52670a<C52860x> aVar) {
            C52711k.m112240b(aVar, "onSuccess");
            this.f77391b = aVar;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.e$b */
    public static final class C29567b implements IAVCameraService {

        /* renamed from: com.ss.android.ugc.aweme.external.a.e$b$a */
        static final class C29568a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ boolean f77395a;

            /* renamed from: b */
            final /* synthetic */ Context f77396b;

            /* renamed from: c */
            final /* synthetic */ SurfaceHolder f77397c;

            /* renamed from: d */
            final /* synthetic */ IAVCameraReadyCallback f77398d;

            C29568a(boolean z, Context context, SurfaceHolder surfaceHolder, IAVCameraReadyCallback iAVCameraReadyCallback) {
                this.f77395a = z;
                this.f77396b = context;
                this.f77397c = surfaceHolder;
                this.f77398d = iAVCameraReadyCallback;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                IQRCodeScanner iQRCodeScanner;
                C52938f.f131308b.mo110536b();
                if (this.f77395a) {
                    iQRCodeScanner = new C24517cc(this.f77396b, this.f77397c);
                } else {
                    iQRCodeScanner = new C22314ad();
                }
                this.f77398d.finish(iQRCodeScanner);
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.external.a.e$b$b */
        static final class C29569b extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ IAVCameraReadyCallback f77399a;

            C29569b(IAVCameraReadyCallback iAVCameraReadyCallback) {
                this.f77399a = iAVCameraReadyCallback;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.f77399a.finish(null);
                return C52860x.f131107a;
            }
        }

        C29567b() {
        }

        public final void getScanner(boolean z, Context context, SurfaceHolder surfaceHolder, IAVCameraReadyCallback<IQRCodeScanner> iAVCameraReadyCallback) {
            C52711k.m112240b(context, "context");
            C52711k.m112240b(surfaceHolder, "surfaceHolder");
            C52711k.m112240b(iAVCameraReadyCallback, "callback");
            new C29565a().mo59665a(true).mo59664a((C52670a<C52860x>) new C29568a<C52860x>(z, context, surfaceHolder, iAVCameraReadyCallback)).mo59667b(new C29569b(iAVCameraReadyCallback)).mo59666a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.e$c */
    static final class C29570c extends C52712l implements C52670a<C29513a> {

        /* renamed from: a */
        public static final C29570c f77400a = new C29570c();

        C29570c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29513a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.e$d */
    static final class C29571d extends C52712l implements C52670a<C29522b> {

        /* renamed from: a */
        public static final C29571d f77401a = new C29571d();

        C29571d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29522b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.e$e */
    public static final class C29572e implements IAVLoaderService {

        /* renamed from: com.ss.android.ugc.aweme.external.a.e$e$a */
        static final class C29573a extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ ILoaderCallback f77402a;

            C29573a(ILoaderCallback iLoaderCallback) {
                this.f77402a = iLoaderCallback;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                C52938f.f131308b.mo110536b();
                this.f77402a.finish(Boolean.valueOf(true));
                return C52860x.f131107a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.external.a.e$e$b */
        static final class C29574b extends C52712l implements C52670a<C52860x> {

            /* renamed from: a */
            final /* synthetic */ ILoaderCallback f77403a;

            C29574b(ILoaderCallback iLoaderCallback) {
                this.f77403a = iLoaderCallback;
                super(0);
            }

            public final /* synthetic */ Object invoke() {
                this.f77403a.finish(Boolean.valueOf(false));
                return C52860x.f131107a;
            }
        }

        C29572e() {
        }

        public final void setLoaderOnly() {
            C52938f.f131308b.mo110536b();
        }

        public final void setLoader(ILoaderCallback<Boolean> iLoaderCallback) {
            C52711k.m112240b(iLoaderCallback, "callback");
            new C29565a().mo59665a(false).mo59664a((C52670a<C52860x>) new C29573a<C52860x>(iLoaderCallback)).mo59667b(new C29574b(iLoaderCallback)).mo59666a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.e$f */
    static final class C29575f extends C52712l implements C52670a<C29542c> {

        /* renamed from: a */
        public static final C29575f f77404a = new C29575f();

        C29575f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29542c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.e$g */
    static final class C29576g extends C52712l implements C52670a<C29555d> {

        /* renamed from: a */
        public static final C29576g f77405a = new C29576g();

        C29576g() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C29555d();
        }
    }

    public final IAVCameraService cameraService() {
        return new C29567b();
    }

    public final IAVLoaderService libraryLoaderService() {
        return new C29572e();
    }

    public final IAVEffectService effectService() {
        return (C29513a) this.f77386b.getValue();
    }

    public final IAVInfoService infoService() {
        return (C29522b) this.f77387c.getValue();
    }

    public final IAVProcessService processService() {
        return (C29542c) this.f77389e.getValue();
    }

    public final IAVTransformService transformService() {
        return (C29555d) this.f77388d.getValue();
    }
}
