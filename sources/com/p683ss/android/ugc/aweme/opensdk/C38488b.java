package com.p683ss.android.ugc.aweme.opensdk;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.common.C26855c;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a;
import com.p683ss.android.ugc.aweme.opensdk.share.C38520b;
import com.p683ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse;
import com.p683ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse.DataBean;
import com.p683ss.android.ugc.aweme.opensdk.share.data.ClientKeyScopesResponse.DataBean.ScopesBean;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23209ao;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b;
import com.p683ss.android.ugc.aweme.p1403ba.C23361b.C23364b;
import com.p683ss.android.ugc.aweme.port.p2082in.C39597bg.C39598a;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p683ss.android.ugc.aweme.services.IExternalService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.EditConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.EditConfig.Builder;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.IEditService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.ShareConfig;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieService;
import com.p683ss.android.ugc.aweme.services.photomovie.IPhotoMovieServiceProvider;
import com.p683ss.android.ugc.aweme.services.photomovie.PhotoMovieServiceLoadCallback;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p064c.p065a.C1683ag;
import p064c.p065a.p069b.C1690c;
import p2628d.C52848o;
import p2628d.C52851p;
import p2628d.C52857u;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52635g;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52614b;
import p2628d.p2631c.p2633b.p2634a.C52620h;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52723a;
import p2628d.p2639f.p2641b.C52722v.C52727e;

/* renamed from: com.ss.android.ugc.aweme.opensdk.b */
public final class C38488b {

    /* renamed from: a */
    private final String f97916a = "hashtag";

    /* renamed from: com.ss.android.ugc.aweme.opensdk.b$a */
    public static final class C38489a implements C38520b {

        /* renamed from: a */
        final /* synthetic */ C52625c f97917a;

        C38489a(C52625c cVar) {
            this.f97917a = cVar;
        }

        /* renamed from: a */
        public final void mo78405a(boolean z) {
            if (z) {
                C38483a aVar = new C38483a();
                aVar.f97902a = true;
                this.f97917a.resumeWith(C52848o.m114620constructorimpl(aVar));
            }
        }

        /* renamed from: a */
        public final void mo78404a(int i, String str) {
            C52711k.m112240b(str, "errorMsg");
            C38483a aVar = new C38483a();
            aVar.f97902a = false;
            aVar.f97903b = i;
            aVar.mo78389a(str);
            this.f97917a.resumeWith(C52848o.m114620constructorimpl(aVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.opensdk.b$b */
    public static final class C38490b implements C23505g {

        /* renamed from: a */
        final /* synthetic */ C52625c f97918a;

        /* renamed from: b */
        final /* synthetic */ C52723a f97919b;

        /* renamed from: a */
        public final void mo46279a() {
            this.f97918a.resumeWith(C52848o.m114620constructorimpl(Boolean.valueOf(true)));
        }

        /* renamed from: a */
        public final void mo46280a(Bundle bundle) {
            if (!this.f97919b.element) {
                this.f97918a.resumeWith(C52848o.m114620constructorimpl(Boolean.valueOf(false)));
                this.f97919b.element = true;
            }
        }

        C38490b(C52625c cVar, C52723a aVar) {
            this.f97918a = cVar;
            this.f97919b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.opensdk.b$c */
    public static final class C38491c implements C1683ag<ClientKeyScopesResponse> {

        /* renamed from: a */
        final /* synthetic */ C52625c f97920a;

        public final void onSubscribe(C1690c cVar) {
            C52711k.m112240b(cVar, "d");
        }

        public C38491c(C52625c cVar) {
            this.f97920a = cVar;
        }

        public final void onError(Throwable th) {
            C52711k.m112240b(th, "e");
            this.f97920a.resumeWith(C52848o.m114620constructorimpl(C52851p.m112464a(th)));
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            ClientKeyScopesResponse clientKeyScopesResponse = (ClientKeyScopesResponse) obj;
            C52711k.m112240b(clientKeyScopesResponse, "t");
            this.f97920a.resumeWith(C52848o.m114620constructorimpl(clientKeyScopesResponse));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.opensdk.b$d */
    public static final class C38492d implements C38520b {

        /* renamed from: a */
        final /* synthetic */ C52723a f97921a;

        /* renamed from: b */
        final /* synthetic */ C52625c f97922b;

        /* renamed from: c */
        final /* synthetic */ C38488b f97923c;

        /* renamed from: d */
        final /* synthetic */ C38505d f97924d;

        /* renamed from: a */
        public final void mo78405a(boolean z) {
            if (z) {
                C38483a aVar = new C38483a();
                aVar.f97902a = true;
                if (!this.f97921a.element) {
                    this.f97922b.resumeWith(C52848o.m114620constructorimpl(aVar));
                    this.f97921a.element = true;
                }
            }
        }

        /* renamed from: a */
        public final void mo78404a(int i, String str) {
            C52711k.m112240b(str, "errorMsg");
            C38483a aVar = new C38483a();
            if (i == 20001) {
                aVar.f97903b = 20001;
                aVar.mo78389a("Unknown");
            } else if (i == -1 || i == -6) {
                aVar.f97903b = 20007;
                aVar.mo78389a("Video length doesn't meet requirements");
            } else if (i == -2) {
                aVar.f97903b = 20012;
                aVar.mo78389a("Video format is not supported");
            } else if (i == -4) {
                aVar.f97903b = 20010;
                aVar.mo78389a("Processing photo resources faild");
            } else if (i == -5) {
                aVar.f97903b = 20011;
                aVar.mo78389a("Video resolution doesn't meet requirements");
            } else {
                aVar.f97903b = 22001;
                aVar.mo78389a("Unsupported resolution");
            }
            aVar.f97902a = false;
            if (!this.f97921a.element) {
                this.f97922b.resumeWith(C52848o.m114620constructorimpl(aVar));
                this.f97921a.element = true;
            }
        }

        C38492d(C52723a aVar, C52625c cVar, C38488b bVar, C38505d dVar) {
            this.f97921a = aVar;
            this.f97922b = cVar;
            this.f97923c = bVar;
            this.f97924d = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.opensdk.b$e */
    public static final class C38493e implements C39598a {

        /* renamed from: a */
        final /* synthetic */ C52625c f97925a;

        public final void onSuccess() {
            this.f97925a.resumeWith(C52848o.m114620constructorimpl(Boolean.valueOf(true)));
        }

        C38493e(C52625c cVar) {
            this.f97925a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.opensdk.b$f */
    public static final class C38494f implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ C52625c f97926a;

        /* renamed from: b */
        final /* synthetic */ C38488b f97927b;

        /* renamed from: c */
        final /* synthetic */ C38513g f97928c;

        /* renamed from: d */
        final /* synthetic */ ClientKeyScopesResponse f97929d;

        /* renamed from: e */
        final /* synthetic */ C26855c f97930e;

        /* renamed from: f */
        final /* synthetic */ Activity f97931f;

        public final void onLoad(final AsyncAVService asyncAVService, long j) {
            Context context;
            C52711k.m112240b(asyncAVService, "service");
            String uuid = UUID.randomUUID().toString();
            C52711k.m112236a((Object) uuid, "UUID.randomUUID().toString()");
            final C52727e eVar = new C52727e();
            eVar.element = null;
            final C52727e eVar2 = new C52727e();
            eVar2.element = null;
            if (this.f97928c.f97992a == C38514a.m85847b()) {
                eVar.element = new Builder().shootWay("system_upload").creationId(uuid);
                if (this.f97929d.getData() != null) {
                    C38488b bVar = this.f97927b;
                    ClientKeyScopesResponse clientKeyScopesResponse = this.f97929d;
                    C26855c cVar = this.f97930e;
                    T t = eVar.element;
                    if (t == null) {
                        C52711k.m112237a("builder");
                    }
                    bVar.mo78403a(clientKeyScopesResponse, cVar, (Builder) t);
                }
                new C23209ao().mo47993a("system_upload").mo47994b("video").mo47992a(1).mo47996d(uuid).mo47994b("video").mo47995c("upload").mo48076e();
                C26855c cVar2 = this.f97930e;
                if (cVar2 != null) {
                    eVar2.element = new ShareConfig((C26916m) cVar2, 2);
                    T t2 = eVar2.element;
                    if (t2 == null) {
                        C52711k.m112237a("shareConfig");
                    }
                    ((ShareConfig) t2).setFile((String) this.f97928c.f97993b.get(0));
                    T t3 = eVar2.element;
                    if (t3 == null) {
                        C52711k.m112237a("shareConfig");
                    }
                    ((ShareConfig) t3).setAppName(this.f97930e.mAppName);
                    IEditService editService = asyncAVService.uiService().editService();
                    Context context2 = this.f97931f;
                    T t4 = eVar.element;
                    if (t4 == null) {
                        C52711k.m112237a("builder");
                    }
                    EditConfig build = ((Builder) t4).build();
                    T t5 = eVar2.element;
                    if (t5 == null) {
                        C52711k.m112237a("shareConfig");
                    }
                    editService.startEdit(context2, build, (ShareConfig) t5);
                    this.f97926a.resumeWith(C52848o.m114620constructorimpl(Boolean.valueOf(true)));
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.common.ShareContext");
            } else if (this.f97928c.f97992a == C38514a.m85849d()) {
                eVar.element = new Builder().shootWay("system_upload").creationId(uuid);
                if (this.f97929d.getData() != null) {
                    C38488b bVar2 = this.f97927b;
                    ClientKeyScopesResponse clientKeyScopesResponse2 = this.f97929d;
                    C26855c cVar3 = this.f97930e;
                    T t6 = eVar.element;
                    if (t6 == null) {
                        C52711k.m112237a("builder");
                    }
                    bVar2.mo78403a(clientKeyScopesResponse2, cVar3, (Builder) t6);
                }
                new C23209ao().mo47993a("system_upload").mo47994b("video").mo47992a(1).mo47996d(uuid).mo47994b("video").mo47995c("upload").mo48076e();
                C26855c cVar4 = this.f97930e;
                if (cVar4 != null) {
                    eVar2.element = new ShareConfig((C26916m) cVar4, 4);
                    T t7 = eVar2.element;
                    if (t7 == null) {
                        C52711k.m112237a("shareConfig");
                    }
                    ((ShareConfig) t7).setVideoList(this.f97928c.f97993b);
                    T t8 = eVar2.element;
                    if (t8 == null) {
                        C52711k.m112237a("shareConfig");
                    }
                    ((ShareConfig) t8).setAppName(this.f97930e.mAppName);
                    IEditService editService2 = asyncAVService.uiService().editService();
                    Context context3 = this.f97931f;
                    T t9 = eVar.element;
                    if (t9 == null) {
                        C52711k.m112237a("builder");
                    }
                    EditConfig build2 = ((Builder) t9).build();
                    T t10 = eVar2.element;
                    if (t10 == null) {
                        C52711k.m112237a("shareConfig");
                    }
                    editService2.startEdit(context3, build2, (ShareConfig) t10);
                    this.f97926a.resumeWith(C52848o.m114620constructorimpl(Boolean.valueOf(true)));
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.common.ShareContext");
            } else if (this.f97928c.f97992a == C38514a.m85846a()) {
                eVar.element = new Builder().shootWay("system_upload");
                if (this.f97929d.getData() != null) {
                    C38488b bVar3 = this.f97927b;
                    ClientKeyScopesResponse clientKeyScopesResponse3 = this.f97929d;
                    C26855c cVar5 = this.f97930e;
                    T t11 = eVar.element;
                    if (t11 == null) {
                        C52711k.m112237a("builder");
                    }
                    bVar3.mo78403a(clientKeyScopesResponse3, cVar5, (Builder) t11);
                }
                C26855c cVar6 = this.f97930e;
                if (cVar6 != null) {
                    eVar2.element = new ShareConfig((C26916m) cVar6, 1);
                    T t12 = eVar2.element;
                    if (t12 == null) {
                        C52711k.m112237a("shareConfig");
                    }
                    ((ShareConfig) t12).setFile((String) this.f97928c.f97993b.get(0));
                    T t13 = eVar2.element;
                    if (t13 == null) {
                        C52711k.m112237a("shareConfig");
                    }
                    ((ShareConfig) t13).setAppName(this.f97930e.mAppName);
                    IEditService editService3 = asyncAVService.uiService().editService();
                    Context context4 = this.f97931f;
                    T t14 = eVar.element;
                    if (t14 == null) {
                        C52711k.m112237a("builder");
                    }
                    EditConfig build3 = ((Builder) t14).build();
                    T t15 = eVar2.element;
                    if (t15 == null) {
                        C52711k.m112237a("shareConfig");
                    }
                    editService3.startEdit(context4, build3, (ShareConfig) t15);
                    this.f97926a.resumeWith(C52848o.m114620constructorimpl(Boolean.valueOf(true)));
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.common.ShareContext");
            } else {
                if (this.f97928c.f97992a == C38514a.m85848c()) {
                    eVar.element = new Builder().shootWay("system_upload");
                    if (this.f97929d.getData() != null) {
                        C38488b bVar4 = this.f97927b;
                        ClientKeyScopesResponse clientKeyScopesResponse4 = this.f97929d;
                        C26855c cVar7 = this.f97930e;
                        T t16 = eVar.element;
                        if (t16 == null) {
                            C52711k.m112237a("builder");
                        }
                        bVar4.mo78403a(clientKeyScopesResponse4, cVar7, (Builder) t16);
                    }
                    C26855c cVar8 = this.f97930e;
                    if (cVar8 != null) {
                        eVar2.element = new ShareConfig((C26916m) cVar8, 3);
                        T t17 = eVar2.element;
                        if (t17 == null) {
                            C52711k.m112237a("shareConfig");
                        }
                        ((ShareConfig) t17).setImageList(this.f97928c.f97993b);
                        T t18 = eVar2.element;
                        if (t18 == null) {
                            C52711k.m112237a("shareConfig");
                        }
                        ((ShareConfig) t18).setAppName(this.f97930e.mAppName);
                        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
                        C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
                        IPhotoMovieServiceProvider photoMovieServiceProvider = createIAVServiceProxybyMonsterPlugin.getPhotoMovieServiceProvider();
                        Activity g = C11016e.m22312g();
                        if (g != null) {
                            context = g;
                        } else {
                            context = C11010c.m22280a();
                        }
                        photoMovieServiceProvider.get(context, "from_sys_share", new PhotoMovieServiceLoadCallback(this) {

                            /* renamed from: a */
                            final /* synthetic */ C38494f f97932a;

                            public final void onPhotoMovieServiceLoadFailed(int i, String str) {
                                C52711k.m112240b(str, "errorMessage");
                            }

                            public final void onPhotoMovieServiceLoadSuccess(IPhotoMovieService iPhotoMovieService) {
                                C52711k.m112240b(iPhotoMovieService, "photoMovieService");
                                IEditService editService = asyncAVService.uiService().editService();
                                Context context = this.f97932a.f97931f;
                                T t = eVar.element;
                                if (t == null) {
                                    C52711k.m112237a("builder");
                                }
                                EditConfig build = ((Builder) t).build();
                                T t2 = eVar2.element;
                                if (t2 == null) {
                                    C52711k.m112237a("shareConfig");
                                }
                                editService.startEdit(context, build, (ShareConfig) t2);
                                this.f97932a.f97926a.resumeWith(C52848o.m114620constructorimpl(Boolean.valueOf(true)));
                            }

                            {
                                this.f97932a = r1;
                            }
                        });
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.common.ShareContext");
                    }
                }
            }
        }

        C38494f(C52625c cVar, C38488b bVar, C38513g gVar, ClientKeyScopesResponse clientKeyScopesResponse, C26855c cVar2, Activity activity) {
            this.f97926a = cVar;
            this.f97927b = bVar;
            this.f97928c = gVar;
            this.f97929d = clientKeyScopesResponse;
            this.f97930e = cVar2;
            this.f97931f = activity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.opensdk.b$g */
    static final class C38496g implements C23364b {

        /* renamed from: a */
        final /* synthetic */ C52723a f97936a;

        /* renamed from: b */
        final /* synthetic */ C52625c f97937b;

        C38496g(C52723a aVar, C52625c cVar) {
            this.f97936a = aVar;
            this.f97937b = cVar;
        }

        /* renamed from: a */
        public final void mo40906a(String[] strArr, int[] iArr) {
            boolean z;
            if (!this.f97936a.element) {
                if (!(strArr == null || iArr == null)) {
                    if (iArr.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if ((!z) && iArr[0] == 0) {
                        this.f97937b.resumeWith(C52848o.m114620constructorimpl(Boolean.valueOf(true)));
                        this.f97936a.element = true;
                    }
                }
                this.f97937b.resumeWith(C52848o.m114620constructorimpl(Boolean.valueOf(false)));
                this.f97936a.element = true;
            }
        }
    }

    /* renamed from: a */
    public static boolean m85820a(Activity activity) {
        C52711k.m112240b(activity, "activity");
        IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
        if (!aVServiceImpl_Monster.publishService().isPublishing() || !aVServiceImpl_Monster.publishService().isPublishServiceRunning(activity)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static Object m85821b(Activity activity, C52625c<? super Boolean> cVar) {
        C52635g gVar = new C52635g(C52601b.m112154a(cVar));
        C52625c cVar2 = gVar;
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin();
        C52711k.m112236a((Object) createIAVServiceProxybyMonsterPlugin, "ServiceManager.get().get…ServiceProxy::class.java)");
        createIAVServiceProxybyMonsterPlugin.getShortVideoPluginService().mo80676a(activity, true, new C38493e(cVar2));
        Object a = gVar.mo110263a();
        if (a == C52601b.m112157a()) {
            C52620h.m112171b(cVar);
        }
        return a;
    }

    /* renamed from: a */
    public static Object m85818a(Activity activity, C52625c<? super Boolean> cVar) {
        C52635g gVar = new C52635g(C52601b.m112154a(cVar));
        C52625c cVar2 = gVar;
        if (C0726c.m2090a((Context) activity, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            cVar2.resumeWith(C52848o.m114620constructorimpl(C52614b.m112161a(true)));
        } else {
            C52723a aVar = new C52723a();
            aVar.element = false;
            C23361b.m57419a(activity, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, new C38496g(aVar, cVar2));
        }
        Object a = gVar.mo110263a();
        if (a == C52601b.m112157a()) {
            C52620h.m112171b(cVar);
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bf A[LOOP:0: B:9:0x0057->B:31:0x00bf, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c2 A[EDGE_INSN: B:38:0x00c2->B:32:0x00c2 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m85822b(com.p683ss.android.ugc.aweme.opensdk.C38505d r13, p2628d.p2631c.C52625c<? super com.p683ss.android.ugc.aweme.opensdk.C38483a> r14) {
        /*
            d.c.g r0 = new d.c.g
            d.c.c r1 = p2628d.p2631c.p2632a.C52601b.m112154a(r14)
            r0.<init>(r1)
            r1 = r0
            d.c.c r1 = (p2628d.p2631c.C52625c) r1
            com.ss.android.ugc.aweme.opensdk.b$a r2 = new com.ss.android.ugc.aweme.opensdk.b$a
            r2.<init>(r1)
            com.ss.android.ugc.aweme.opensdk.share.b r2 = (com.p683ss.android.ugc.aweme.opensdk.share.C38520b) r2
            java.lang.String r1 = "checkListener"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r1)
            com.ss.android.ugc.aweme.opensdk.g r1 = r13.f97977a
            int r1 = r1.f97992a
            int r3 = com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85846a()
            r4 = 20008(0x4e28, float:2.8037E-41)
            r5 = 20010(0x4e2a, float:2.804E-41)
            if (r1 != r3) goto L_0x0040
            com.ss.android.ugc.aweme.opensdk.g r13 = r13.f97977a
            java.util.List<java.lang.String> r13 = r13.f97993b
            java.util.Collection r13 = (java.util.Collection) r13
            boolean r13 = com.bytedance.common.utility.p522b.C9376b.m18558a(r13)
            if (r13 == 0) goto L_0x0039
            java.lang.String r13 = "Processing photo resources faild"
            r2.mo78404a(r5, r13)
            goto L_0x00c2
        L_0x0039:
            java.lang.String r13 = "Photo doesn't meet requirements"
            r2.mo78404a(r4, r13)
            goto L_0x00c2
        L_0x0040:
            com.ss.android.ugc.aweme.opensdk.g r1 = r13.f97977a
            int r1 = r1.f97992a
            int r3 = com.p683ss.android.ugc.aweme.opensdk.C38513g.C38514a.m85848c()
            if (r1 != r3) goto L_0x00c2
            com.ss.android.ugc.aweme.opensdk.g r1 = r13.f97977a
            java.util.List<java.lang.String> r1 = r1.f97993b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
            r6 = 0
            r7 = 0
        L_0x0057:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x00c2
            java.lang.Object r8 = r1.next()
            java.lang.String r8 = (java.lang.String) r8
            boolean r9 = com.p683ss.android.ugc.aweme.utils.C47723bk.m103311a(r8)
            if (r9 != 0) goto L_0x006f
            java.lang.String r13 = "Processing photo resources faild"
            r2.mo78404a(r5, r13)
            goto L_0x00c2
        L_0x006f:
            boolean r9 = com.p683ss.android.ugc.aweme.utils.C47723bk.m103311a(r8)
            r10 = 1
            if (r9 == 0) goto L_0x00a3
            com.ss.android.ugc.aweme.services.IExternalService r9 = com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl.getAVServiceImpl_Monster()
            com.ss.android.ugc.aweme.services.IExternalService r9 = (com.p683ss.android.ugc.aweme.services.IExternalService) r9
            com.ss.android.ugc.aweme.services.external.ability.IAbilityService r9 = r9.abilityService()
            com.ss.android.ugc.aweme.services.external.ability.IAVInfoService r9 = r9.infoService()
            int[] r8 = r9.photoInfo(r8)
            r9 = r8[r3]
            r8 = r8[r10]
            int r11 = r9 * r8
            if (r11 == 0) goto L_0x00a3
            float r8 = (float) r8
            float r9 = (float) r9
            r11 = 1075419546(0x4019999a, float:2.4)
            float r12 = r9 * r11
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 > 0) goto L_0x00a3
            float r8 = r8 * r11
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 > 0) goto L_0x00a3
            r8 = 1
            goto L_0x00a4
        L_0x00a3:
            r8 = 0
        L_0x00a4:
            if (r8 == 0) goto L_0x00b7
            com.ss.android.ugc.aweme.opensdk.g r8 = r13.f97977a
            java.util.List<java.lang.String> r8 = r8.f97993b
            int r8 = r8.size()
            int r8 = r8 - r10
            if (r6 != r8) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r10 = 0
        L_0x00b3:
            r2.mo78405a(r10)
            goto L_0x00bd
        L_0x00b7:
            java.lang.String r7 = "Photo doesn't meet requirements"
            r2.mo78404a(r4, r7)
            r7 = 1
        L_0x00bd:
            if (r7 != 0) goto L_0x00c2
            int r6 = r6 + 1
            goto L_0x0057
        L_0x00c2:
            java.lang.Object r13 = r0.mo110263a()
            java.lang.Object r0 = p2628d.p2631c.p2632a.C52601b.m112157a()
            if (r13 != r0) goto L_0x00cf
            p2628d.p2631c.p2633b.p2634a.C52620h.m112171b(r14)
        L_0x00cf:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.opensdk.C38488b.m85822b(com.ss.android.ugc.aweme.opensdk.d, d.c.c):java.lang.Object");
    }

    /* renamed from: a */
    public final Object mo78402a(C38505d dVar, C52625c<? super C38483a> cVar) {
        C38505d dVar2 = dVar;
        C52635g gVar = new C52635g(C52601b.m112154a(cVar));
        C52625c cVar2 = gVar;
        C52723a aVar = new C52723a();
        int i = 0;
        aVar.element = false;
        C38520b dVar3 = new C38492d(aVar, cVar2, this, dVar2);
        C52711k.m112240b(dVar3, "checkListener");
        IAVInfoService infoService = AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().infoService();
        if (dVar2.f97977a.f97992a == C38514a.m85847b()) {
            if (C9376b.m18558a((Collection<T>) dVar2.f97977a.f97993b)) {
                dVar3.mo78404a(20010, "");
            } else if (C47723bk.m103311a((String) dVar2.f97977a.f97993b.get(0))) {
                infoService.importLegal(dVar2.f97978b, (String) dVar2.f97977a.f97993b.get(0), true, 3600000, 1000, new C38507b(dVar3), new C38508c(dVar3));
            } else {
                dVar3.mo78404a(20010, "");
            }
        } else if (dVar2.f97977a.f97992a == C38514a.m85849d()) {
            C52723a aVar2 = new C52723a();
            aVar2.element = false;
            Iterator it = dVar2.f97977a.f97993b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                if (C47723bk.m103311a(str)) {
                    infoService.importLegal(dVar2.f97978b, str, true, 3600000, 1000, new C38509d(dVar2, dVar3, i), new C38510e(aVar2, dVar3));
                    if (aVar2.element) {
                        break;
                    }
                    i++;
                } else {
                    dVar3.mo78404a(20010, "");
                    break;
                }
            }
        }
        Object a = gVar.mo110263a();
        if (a == C52601b.m112157a()) {
            C52620h.m112171b(cVar);
        }
        return a;
    }

    /* renamed from: a */
    public static Object m85819a(String str, Activity activity, C52625c<? super Boolean> cVar) {
        C52635g gVar = new C52635g(C52601b.m112154a(cVar));
        C52625c cVar2 = gVar;
        C52723a aVar = new C52723a();
        aVar.element = false;
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (!g.isLogin()) {
            C27965f.m66721a(activity, str, "video_edit_page", (Bundle) null, (C23505g) new C38490b(cVar2, aVar));
        } else {
            cVar2.resumeWith(C52848o.m114620constructorimpl(C52614b.m112161a(true)));
        }
        Object a = gVar.mo110263a();
        if (a == C52601b.m112157a()) {
            C52620h.m112171b(cVar);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo78403a(ClientKeyScopesResponse clientKeyScopesResponse, C26855c cVar, Builder builder) {
        boolean z;
        DataBean data = clientKeyScopesResponse.getData();
        if (data != null) {
            List scopes = data.getScopes();
            if (scopes != null) {
                Iterator it = scopes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ScopesBean scopesBean = (ScopesBean) it.next();
                    C52711k.m112236a((Object) scopesBean, "item");
                    if (TextUtils.equals(scopesBean.getName(), this.f97916a)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        if (!z || C9376b.m18558a((Collection<T>) cVar.mHashTags)) {
            IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
            DataBean data2 = clientKeyScopesResponse.getData();
            C52711k.m112236a((Object) data2, "response.data");
            bridgeService_Monster.shareChallenge(builder, data2.getAppName());
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = cVar.mHashTags;
        C52711k.m112236a((Object) arrayList2, "context.mHashTags");
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            AVChallenge aVChallenge = new AVChallenge();
            aVChallenge.challengeName = (String) cVar.mHashTags.get(i);
            arrayList.add(aVChallenge);
        }
        builder.challenges(arrayList);
    }

    /* renamed from: a */
    public final Object mo78401a(Activity activity, boolean z, C38513g gVar, C26855c cVar, ClientKeyScopesResponse clientKeyScopesResponse, C52625c<? super Boolean> cVar2) {
        C52635g gVar2 = new C52635g(C52601b.m112154a(cVar2));
        C52625c cVar3 = gVar2;
        IExternalService aVServiceImpl_Monster = AVExternalServiceImpl.getAVServiceImpl_Monster();
        C38494f fVar = new C38494f(cVar3, this, gVar, clientKeyScopesResponse, cVar, activity);
        aVServiceImpl_Monster.asyncService(fVar);
        Object a = gVar2.mo110263a();
        if (a == C52601b.m112157a()) {
            C52620h.m112171b(cVar2);
        }
        return a;
    }
}
