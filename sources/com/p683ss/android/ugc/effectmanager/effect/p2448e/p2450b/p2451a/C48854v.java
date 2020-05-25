package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a;

import android.os.Handler;
import android.util.Log;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2438e.C48641b;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48650e;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48653h;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a.C48726f.C48727a;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.HashMap;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.v */
public final class C48854v extends C48653h<String> {

    /* renamed from: d */
    private final C48620c f122751d;

    /* renamed from: e */
    private final C48641b f122752e;

    /* renamed from: f */
    private final HashMap<String, String> f122753f = new HashMap<>();

    /* renamed from: g */
    private final String f122754g;

    /* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.a.v$a */
    static final class C48855a extends C52712l implements C52670a<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C48854v f122755a;

        C48855a(C48854v vVar) {
            this.f122755a = vVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            if (this.f122755a.f122286b instanceof C48727a) {
                C48650e<T> eVar = this.f122755a.f122286b;
                if (eVar != null) {
                    ((C48727a) eVar).mo8638a("");
                } else {
                    throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.effectmanager.effect.repository.newrepo.NewUpdateTagRepository.WrapWriteUpdateTagListener");
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
        String str;
        try {
            C48641b bVar = this.f122752e;
            if (bVar != null) {
                str = bVar.mo59190a(this.f122753f);
            } else {
                str = null;
            }
            if (str != null) {
                C48620c cVar = this.f122751d;
                if (cVar != null) {
                    cVar.mo96148a("updatetime", str);
                }
            }
            mo96235a((C52670a<C52860x>) new C48855a<C52860x>(this));
        } catch (Exception e) {
            Log.getStackTraceString(e);
        }
    }

    public C48854v(Handler handler, C48565a aVar, String str, HashMap<String, String> hashMap) {
        C52711k.m112240b(aVar, "mEffectContext");
        C52711k.m112240b(str, "mTaskId");
        super(handler, str);
        this.f122754g = str;
        C48890g gVar = aVar.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        this.f122751d = gVar.f122972r;
        C48890g gVar2 = aVar.f122047a;
        C52711k.m112236a((Object) gVar2, "mEffectContext.effectConfiguration");
        this.f122752e = gVar2.f122976v;
        if (hashMap != null) {
            this.f122753f.putAll(hashMap);
        }
    }
}
