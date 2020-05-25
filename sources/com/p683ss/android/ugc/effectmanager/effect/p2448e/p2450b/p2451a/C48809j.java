package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import android.util.Log;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48653h;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48667e;
import com.p683ss.android.ugc.effectmanager.effect.model.BuildEffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelModel;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.File;
import java.io.InputStream;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.j */
public final class C48809j extends C48653h<EffectChannelResponse> {

    /* renamed from: d */
    private final C48620c f122606d;

    /* renamed from: e */
    private final C48641b f122607e;

    /* renamed from: f */
    private final C48565a f122608f;

    /* renamed from: g */
    private final String f122609g;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.j$a */
    static final class C48810a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48809j f122610a;

        C48810a(C48809j jVar) {
            this.f122610a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122610a.f122286b instanceof C48702g) {
                C48650e<T> eVar = this.f122610a.f122286b;
                if (eVar != null) {
                    ((C48702g) eVar).mo8637a(new C48649d(10004));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.j$b */
    static final class C48811b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48809j f122611a;

        C48811b(C48809j jVar) {
            this.f122611a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122611a.f122286b instanceof C48702g) {
                C48650e<T> eVar = this.f122611a.f122286b;
                if (eVar != null) {
                    ((C48702g) eVar).mo8637a(new C48649d(10004));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.j$c */
    static final class C48812c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48809j f122612a;

        /* renamed from: b */
        final /* synthetic */ EffectChannelResponse f122613b;

        C48812c(C48809j jVar, EffectChannelResponse effectChannelResponse) {
            this.f122612a = jVar;
            this.f122613b = effectChannelResponse;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122612a.f122286b;
            if (eVar != null) {
                EffectChannelResponse effectChannelResponse = this.f122613b;
                C52711k.m112236a((Object) effectChannelResponse, "channelResponse");
                eVar.mo8638a(effectChannelResponse);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
        if (this.f122286b instanceof C48702g) {
            C48650e<T> eVar = this.f122286b;
            if (eVar != null) {
                ((C48702g) eVar).mo8637a(new C48649d(10001));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectChannelListener");
        }
    }

    /* renamed from: e */
    public final void mo96229e() {
        InputStream inputStream;
        C48620c cVar = this.f122606d;
        EffectChannelModel effectChannelModel = null;
        if (cVar != null) {
            C48890g gVar = this.f122608f.f122047a;
            C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
            String a = C48667e.m105298a(gVar.f122960f, this.f122609g);
            C52711k.m112236a((Object) a, "EffectCacheKeyGenerator.…iguration.channel, panel)");
            inputStream = cVar.mo96152b(a);
        } else {
            inputStream = null;
        }
        if (inputStream == null) {
            mo96235a((C52670a<C52860x>) new C48810a<C52860x>(this));
            return;
        }
        try {
            C48641b bVar = this.f122607e;
            if (bVar != null) {
                effectChannelModel = (EffectChannelModel) bVar.mo59189a(inputStream, EffectChannelModel.class);
            }
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
        if (effectChannelModel == null || !effectChannelModel.checkValued()) {
            mo96235a((C52670a<C52860x>) new C48811b<C52860x>(this));
        } else {
            String str = this.f122609g;
            C48890g gVar2 = this.f122608f.f122047a;
            C52711k.m112236a((Object) gVar2, "mEffectContext.effectConfiguration");
            File file = gVar2.f122964j;
            C52711k.m112236a((Object) file, "mEffectContext.effectConfiguration.effectDir");
            mo96235a((C52670a<C52860x>) new C48812c<C52860x>(this, new BuildEffectChannelResponse(str, file.getAbsolutePath(), true).buildChannelResponse(effectChannelModel)));
        }
        C48660a.m105288a(inputStream);
    }

    public C48809j(C48565a aVar, String str, String str2, Handler handler) {
        C52711k.m112240b(aVar, "mEffectContext");
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(str2, "taskFlag");
        super(handler, str2);
        this.f122608f = aVar;
        this.f122609g = str;
        C48890g gVar = this.f122608f.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        this.f122606d = gVar.f122972r;
        C48890g gVar2 = this.f122608f.f122047a;
        C52711k.m112236a((Object) gVar2, "mEffectContext.effectConfiguration");
        this.f122607e = gVar2.f122976v;
    }
}
