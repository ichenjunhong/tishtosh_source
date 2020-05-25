package com.p683ss.android.ugc.aweme.shortvideo.duet;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutListViewModel */
public final class DuetLayoutListViewModel extends C0209x {

    /* renamed from: a */
    public C0198r<C37721a<EffectChannelResponse>> f109328a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutListViewModel$a */
    public static final class C43232a implements C48702g {

        /* renamed from: a */
        final /* synthetic */ DuetLayoutListViewModel f109329a;

        C43232a(DuetLayoutListViewModel duetLayoutListViewModel) {
            this.f109329a = duetLayoutListViewModel;
        }

        /* renamed from: a */
        public final void mo8637a(C48649d dVar) {
            Throwable th;
            C0198r<C37721a<EffectChannelResponse>> rVar = this.f109329a.f109328a;
            if (rVar != null) {
                if (dVar != null) {
                    th = dVar.f122281c;
                } else {
                    th = null;
                }
                rVar.setValue(C37721a.m84222a(th));
            }
            this.f109329a.f109328a = null;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo8638a(Object obj) {
            EffectChannelResponse effectChannelResponse = (EffectChannelResponse) obj;
            C52711k.m112240b(effectChannelResponse, "response");
            C0198r<C37721a<EffectChannelResponse>> rVar = this.f109329a.f109328a;
            if (rVar != null) {
                rVar.setValue(C37721a.m84221a(effectChannelResponse));
            }
        }
    }

    /* renamed from: a */
    public final C0198r<C37721a<EffectChannelResponse>> mo87898a(C29252f fVar, String str) {
        C52711k.m112240b(fVar, "effectPlatform");
        C52711k.m112240b(str, "panel");
        if (this.f109328a != null) {
            C0198r<C37721a<EffectChannelResponse>> rVar = this.f109328a;
            if (rVar == null) {
                C52711k.m112234a();
            }
            return rVar;
        }
        this.f109328a = new C0198r<>();
        C0198r<C37721a<EffectChannelResponse>> rVar2 = this.f109328a;
        if (rVar2 != null) {
            rVar2.setValue(C37721a.m84217a());
        }
        fVar.mo59143b(str, false, (C48702g) new C43232a(this));
        C0198r<C37721a<EffectChannelResponse>> rVar3 = this.f109328a;
        if (rVar3 == null) {
            C52711k.m112234a();
        }
        return rVar3;
    }
}
