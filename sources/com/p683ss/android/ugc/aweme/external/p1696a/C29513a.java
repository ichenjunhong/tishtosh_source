package com.p683ss.android.ugc.aweme.external.p1696a;

import android.content.Context;
import com.bef.effectsdk.C2592c;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.external.p1696a.C29564e.C29565a;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.services.effect.EffectService;
import com.p683ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.p683ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback;
import com.p683ss.android.ugc.effectmanager.C48580c;
import com.p683ss.android.ugc.effectmanager.C48902j;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import dmt.p2652av.video.p2654b.C52938f;
import java.util.List;
import java.util.Map;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.external.a.a */
public final class C29513a implements IAVEffectService {

    /* renamed from: com.ss.android.ugc.aweme.external.a.a$a */
    static final class C29514a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IAVEffectReadyCallback f77298a;

        /* renamed from: b */
        final /* synthetic */ Context f77299b;

        /* renamed from: c */
        final /* synthetic */ C52671b f77300c;

        C29514a(IAVEffectReadyCallback iAVEffectReadyCallback, Context context, C52671b bVar) {
            this.f77298a = iAVEffectReadyCallback;
            this.f77299b = context;
            this.f77300c = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C52938f.f131308b.mo110536b();
            this.f77298a.finish(C29242c.m68869a(this.f77299b, new C52671b<EffectPlatformBuilder, C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C29514a f77301a;

                {
                    this.f77301a = r1;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    EffectPlatformBuilder effectPlatformBuilder = (EffectPlatformBuilder) obj;
                    C52711k.m112240b(effectPlatformBuilder, "$receiver");
                    C52671b bVar = this.f77301a.f77300c;
                    if (bVar != null) {
                        bVar.invoke(effectPlatformBuilder);
                    }
                    return C52860x.f131107a;
                }
            }));
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.a$b */
    static final class C29516b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IAVEffectReadyCallback f77302a;

        C29516b(IAVEffectReadyCallback iAVEffectReadyCallback) {
            this.f77302a = iAVEffectReadyCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f77302a.finish(null);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.a$c */
    static final class C29517c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ String[] f77303a;

        /* renamed from: b */
        final /* synthetic */ IAVEffectReadyCallback f77304b;

        C29517c(String[] strArr, IAVEffectReadyCallback iAVEffectReadyCallback) {
            this.f77303a = strArr;
            this.f77304b = iAVEffectReadyCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C52938f.f131308b.mo110536b();
            C39618d.m88216e();
            C48580c.m105110b().mo96133a(this.f77303a, (C48902j) new C48902j(this) {

                /* renamed from: a */
                final /* synthetic */ C29517c f77305a;

                {
                    this.f77305a = r1;
                }

                /* renamed from: a */
                public final void mo59199a(String[] strArr) {
                    C52711k.m112240b(strArr, "requirements");
                    IAVEffectReadyCallback iAVEffectReadyCallback = this.f77305a.f77304b;
                    if (iAVEffectReadyCallback != null) {
                        iAVEffectReadyCallback.finish(strArr);
                    }
                }

                /* renamed from: a */
                public final void mo59198a(Exception exc) {
                    C52711k.m112240b(exc, "e");
                    IAVEffectReadyCallback iAVEffectReadyCallback = this.f77305a.f77304b;
                    if (iAVEffectReadyCallback != null) {
                        iAVEffectReadyCallback.finish(null);
                    }
                }
            });
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.a$d */
    static final class C29519d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IAVEffectReadyCallback f77306a;

        C29519d(IAVEffectReadyCallback iAVEffectReadyCallback) {
            this.f77306a = iAVEffectReadyCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            IAVEffectReadyCallback iAVEffectReadyCallback = this.f77306a;
            if (iAVEffectReadyCallback != null) {
                iAVEffectReadyCallback.finish(new String[0]);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.a$e */
    static final class C29520e extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IAVEffectReadyCallback f77307a;

        C29520e(IAVEffectReadyCallback iAVEffectReadyCallback) {
            this.f77307a = iAVEffectReadyCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C39618d.m88216e();
            IAVEffectReadyCallback iAVEffectReadyCallback = this.f77307a;
            C48580c b = C48580c.m105110b();
            C52711k.m112236a((Object) b, "DownloadableModelSupport.getInstance()");
            iAVEffectReadyCallback.finish(b.mo96136e());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.external.a.a$f */
    static final class C29521f extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ IAVEffectReadyCallback f77308a;

        C29521f(IAVEffectReadyCallback iAVEffectReadyCallback) {
            this.f77308a = iAVEffectReadyCallback;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            this.f77308a.finish(null);
            return C52860x.f131107a;
        }
    }

    public final void provideResourceFinder(IAVEffectReadyCallback<C2592c> iAVEffectReadyCallback) {
        C52711k.m112240b(iAVEffectReadyCallback, "callback");
        new C29565a().mo59665a(false).mo59664a((C52670a<C52860x>) new C29520e<C52860x>(iAVEffectReadyCallback)).mo59667b(new C29521f(iAVEffectReadyCallback)).mo59666a();
    }

    public final void fetchEffectModel(String[] strArr, IAVEffectReadyCallback<String[]> iAVEffectReadyCallback) {
        C52711k.m112240b(strArr, "requirements");
        new C29565a().mo59665a(false).mo59664a((C52670a<C52860x>) new C29517c<C52860x>(strArr, iAVEffectReadyCallback)).mo59667b(new C29519d(iAVEffectReadyCallback)).mo59666a();
    }

    public final void buildEffectPlatform(Context context, IAVEffectReadyCallback<C29252f> iAVEffectReadyCallback, C52671b<? super EffectPlatformBuilder, C52860x> bVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(iAVEffectReadyCallback, "callback");
        new C29565a().mo59665a(false).mo59664a((C52670a<C52860x>) new C29514a<C52860x>(iAVEffectReadyCallback, context, bVar)).mo59667b(new C29516b(iAVEffectReadyCallback)).mo59666a();
    }

    public final void fetchEffectListResource(List<String> list, Map<String, String> map, boolean z, C29252f fVar, C48704i iVar) {
        C52711k.m112240b(list, "effectIds");
        C52711k.m112240b(fVar, "effectPlatform");
        fVar.mo59141a(list, map, true, iVar);
    }

    public final void fetchEffectResource(String str, boolean z, String str2, Map<String, String> map, C29252f fVar, C48705j jVar) {
        C52711k.m112240b(str, "effectId");
        C52711k.m112240b(fVar, "effectPlatform");
        if (z) {
            EffectService.getInstance().fetchEffectWithMusicBind(fVar, str, str2, jVar);
        } else {
            fVar.mo59132a(str, str2, jVar);
        }
    }
}
