package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48653h;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.i */
public final class C48804i extends C48653h<Effect> {

    /* renamed from: d */
    public final Effect f122599d;

    /* renamed from: e */
    private final C48890g f122600e;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.i$a */
    static final class C48805a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48804i f122601a;

        C48805a(C48804i iVar) {
            this.f122601a = iVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122601a.f122286b instanceof C48705j) {
                C48650e<T> eVar = this.f122601a.f122286b;
                if (eVar != null) {
                    ((C48705j) eVar).mo8644a(this.f122601a.f122599d, new C48649d(10003));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.i$b */
    static final class C48806b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48804i f122602a;

        C48806b(C48804i iVar) {
            this.f122602a = iVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122602a.f122286b;
            if (eVar != null) {
                eVar.mo8638a(this.f122602a.f122599d);
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.i$c */
    static final class C48807c extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48804i f122603a;

        C48807c(C48804i iVar) {
            this.f122603a = iVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122603a.f122286b instanceof C48705j) {
                C48650e<T> eVar = this.f122603a.f122286b;
                if (eVar != null) {
                    ((C48705j) eVar).mo8644a(this.f122603a.f122599d, new C48649d(10003));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.i$d */
    static final class C48808d extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48804i f122604a;

        /* renamed from: b */
        final /* synthetic */ Exception f122605b;

        C48808d(C48804i iVar, Exception exc) {
            this.f122604a = iVar;
            this.f122605b = exc;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122604a.f122286b instanceof C48705j) {
                C48650e<T> eVar = this.f122604a.f122286b;
                if (eVar != null) {
                    ((C48705j) eVar).mo8644a(this.f122604a.f122599d, new C48649d(this.f122605b));
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
        if (this.f122286b instanceof C48705j) {
            C48650e<T> eVar = this.f122286b;
            if (eVar != null) {
                ((C48705j) eVar).mo8644a(this.f122599d, new C48649d(10001));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener");
        }
    }

    /* renamed from: e */
    public final void mo96229e() {
        C48620c cVar = this.f122600e.f122972r;
        if (this.f122599d == null || cVar == null) {
            mo96235a((C52670a<C52860x>) new C48805a<C52860x>(this));
            return;
        }
        try {
            String id = this.f122599d.getId();
            C52711k.m112236a((Object) id, "mEffect.id");
            if (cVar.mo96155d(id)) {
                mo96235a((C52670a<C52860x>) new C48806b<C52860x>(this));
            } else {
                mo96235a((C52670a<C52860x>) new C48807c<C52860x>(this));
            }
        } catch (Exception e) {
            mo96235a((C52670a<C52860x>) new C48808d<C52860x>(this, e));
        }
    }

    public C48804i(C48565a aVar, Effect effect, Handler handler, String str) {
        C52711k.m112240b(aVar, "effectContext");
        C52711k.m112240b(str, "taskId");
        super(handler, str);
        this.f122599d = effect;
        C48890g gVar = aVar.f122047a;
        C52711k.m112236a((Object) gVar, "effectContext.effectConfiguration");
        this.f122600e = gVar;
    }
}
