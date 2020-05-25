package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48653h;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48660a;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48712q;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.io.InputStream;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.s */
public final class C48842s extends C48653h<HashMap<String, String>> {

    /* renamed from: d */
    private final C48620c f122715d;

    /* renamed from: e */
    private final C48641b f122716e;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.s$a */
    static final class C48843a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48842s f122717a;

        /* renamed from: b */
        final /* synthetic */ HashMap f122718b;

        C48843a(C48842s sVar, HashMap hashMap) {
            this.f122717a = sVar;
            this.f122718b = hashMap;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C48650e<T> eVar = this.f122717a.f122286b;
            if (eVar != null) {
                HashMap hashMap = this.f122718b;
                if (hashMap != null) {
                    eVar.mo8638a(hashMap);
                } else {
                    throw new C52857u("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.s$b */
    static final class C48844b extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48842s f122719a;

        /* renamed from: b */
        final /* synthetic */ C48649d f122720b;

        C48844b(C48842s sVar, C48649d dVar) {
            this.f122719a = sVar;
            this.f122720b = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122719a.f122286b instanceof C48712q) {
                C48650e<T> eVar = this.f122719a.f122286b;
                if (eVar != null) {
                    ((C48712q) eVar).mo96288a(this.f122720b);
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.listener.IReadUpdateTagListener");
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: h */
    public final void mo96236h() {
    }

    /* renamed from: e */
    public final void mo96229e() {
        InputStream inputStream;
        C48620c cVar = this.f122715d;
        HashMap hashMap = null;
        if (cVar != null) {
            inputStream = cVar.mo96152b("updatetime");
        } else {
            inputStream = null;
        }
        if (inputStream == null) {
            m105569a(new C48649d(10009));
            return;
        }
        try {
            C48641b bVar = this.f122716e;
            if (bVar != null) {
                hashMap = (HashMap) bVar.mo59189a(inputStream, HashMap.class);
            }
            if (hashMap != null) {
                mo96235a((C52670a<C52860x>) new C48843a<C52860x>(this, hashMap));
            } else {
                m105569a(new C48649d((Exception) new IllegalStateException("local file destroy")));
            }
        } catch (Exception e) {
            m105569a(new C48649d(e));
        } catch (Throwable th) {
            C48660a.m105288a(inputStream);
            throw th;
        }
        C48660a.m105288a(inputStream);
    }

    /* renamed from: a */
    private final void m105569a(C48649d dVar) {
        mo96235a((C52670a<C52860x>) new C48844b<C52860x>(this, dVar));
    }

    public C48842s(Handler handler, C48565a aVar, String str) {
        C52711k.m112240b(aVar, "mEffectContext");
        C52711k.m112240b(str, "taskId");
        super(handler, str);
        C48890g gVar = aVar.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        this.f122715d = gVar.f122972r;
        C48890g gVar2 = aVar.f122047a;
        C52711k.m112236a((Object) gVar2, "mEffectContext.effectConfiguration");
        this.f122716e = gVar2.f122976v;
    }
}
