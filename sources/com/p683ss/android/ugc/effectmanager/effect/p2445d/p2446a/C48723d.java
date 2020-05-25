package com.p683ss.android.ugc.effectmanager.effect.p2445d.p2446a;

import android.os.Handler;
import android.os.Message;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.C48681i;
import com.p683ss.android.ugc.effectmanager.common.C48685j;
import com.p683ss.android.ugc.effectmanager.common.C48685j.C48686a;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48679o;
import com.p683ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48697b;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48703h;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48709n;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48714s;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.C48732b;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48771b;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48774c;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48780d;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48788e;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48804i;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48817l;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48821m;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48839r;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2451a.C48845t;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.List;
import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.effectmanager.effect.d.a.d */
public final class C48723d implements C48686a, C48732b {

    /* renamed from: a */
    private final C48890g f122369a;

    /* renamed from: b */
    private final Handler f122370b = new C48685j(this);

    /* renamed from: c */
    private final C48565a f122371c;

    /* renamed from: a */
    public final void mo96274a(Message message) {
        C52711k.m112240b(message, "msg");
    }

    public C48723d(C48565a aVar) {
        C52711k.m112240b(aVar, "mEffectContext");
        this.f122371c = aVar;
        C48890g gVar = this.f122371c.f122047a;
        C52711k.m112236a((Object) gVar, "mEffectContext.effectConfiguration");
        this.f122369a = gVar;
    }

    /* renamed from: a */
    public final String mo96303a(Effect effect, C48705j jVar) {
        C52711k.m112240b(effect, "effect");
        String a = C48679o.m105350a();
        C48780d dVar = new C48780d(effect, this.f122371c, this.f122370b, a);
        C48681i iVar = this.f122369a.f122971q;
        if (iVar != null) {
            iVar.mo96270a(dVar, jVar);
        }
        return a;
    }

    /* renamed from: b */
    public final String mo96310b(Effect effect, C48705j jVar) {
        C52711k.m112240b(effect, "effect");
        String a = C48679o.m105350a();
        C48804i iVar = new C48804i(this.f122371c, effect, this.f122370b, a);
        C48681i iVar2 = this.f122369a.f122971q;
        if (iVar2 != null) {
            iVar2.mo96270a(iVar, null);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo96304a(ProviderEffect providerEffect, C48697b bVar) {
        C52711k.m112240b(providerEffect, "effect");
        String a = C48679o.m105350a();
        C48788e eVar = new C48788e(this.f122371c, providerEffect, a, this.f122370b);
        C48681i iVar = this.f122369a.f122971q;
        if (iVar != null) {
            iVar.mo96270a(eVar, bVar);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo96309a(Map<String, String> map, C48709n nVar) {
        String a = C48679o.m105350a();
        C48681i iVar = this.f122369a.f122971q;
        if (iVar != null) {
            iVar.mo96270a(new C48839r(this.f122371c, this.f122370b, a, map), nVar);
        }
        return a;
    }

    /* renamed from: b */
    public final String mo96311b(List<String> list, Map<String, String> map, C48703h hVar) {
        String a = C48679o.m105350a();
        C48681i iVar = this.f122369a.f122971q;
        if (iVar != null) {
            C48817l lVar = new C48817l(this.f122371c, list, this.f122370b, a, map);
            iVar.mo96270a(lVar, hVar);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo96306a(List<? extends Effect> list, DownloadEffectExtra downloadEffectExtra, C48704i iVar) {
        C52711k.m112240b(list, "effectList");
        String a = C48679o.m105350a();
        C48681i iVar2 = this.f122369a.f122971q;
        if (iVar2 != null) {
            C48774c cVar = new C48774c(this.f122371c, list, a, this.f122370b, downloadEffectExtra);
            iVar2.mo96270a(cVar, iVar);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo96307a(List<String> list, Map<String, String> map, C48703h hVar) {
        String a = C48679o.m105350a();
        C48681i iVar = this.f122369a.f122971q;
        if (iVar != null) {
            C48821m mVar = new C48821m(this.f122371c, list, this.f122370b, a, map);
            iVar.mo96270a(mVar, hVar);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo96308a(List<String> list, Map<String, String> map, C48704i iVar) {
        String a = C48679o.m105350a();
        C48681i iVar2 = this.f122369a.f122971q;
        if (iVar2 != null) {
            C48771b bVar = new C48771b(this.f122371c, list, this.f122370b, a, map);
            iVar2.mo96270a(bVar, iVar);
        }
        return a;
    }

    /* renamed from: a */
    public final String mo96305a(String str, String str2, int i, int i2, Map<String, String> map, C48714s sVar) {
        String str3 = str;
        C52711k.m112240b(str, "panel");
        String str4 = str2;
        C52711k.m112240b(str2, "keyword");
        String a = C48679o.m105350a();
        C48681i iVar = this.f122369a.f122971q;
        if (iVar != null) {
            C48845t tVar = new C48845t(this.f122371c, str, str2, i, i2, map, this.f122370b, a);
            iVar.mo96270a(tVar, sVar);
        }
        return a;
    }
}
