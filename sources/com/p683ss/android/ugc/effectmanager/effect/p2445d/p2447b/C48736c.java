package com.p683ss.android.ugc.effectmanager.effect.p2445d.p2447b;

import android.os.Handler;
import android.os.Message;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.C48903k;
import com.p683ss.android.ugc.effectmanager.common.C48681i;
import com.p683ss.android.ugc.effectmanager.common.C48685j;
import com.p683ss.android.ugc.effectmanager.common.C48685j.C48686a;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48651f;
import com.p683ss.android.ugc.effectmanager.common.p2441h.C48679o;
import com.p683ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48697b;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48698c;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48699d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48700e;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48703h;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48704i;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48705j;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48709n;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48714s;
import com.p683ss.android.ugc.effectmanager.effect.p2445d.C48732b;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48745a;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48748d;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48749e;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48752h;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48755k;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48757m;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48760p;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48857b;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48858c;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48860d;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48863e;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48868i;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48871l;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48872m;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48877r;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b.C48879t;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.effect.d.b.c */
public final class C48736c implements C48686a, C48732b {

    /* renamed from: a */
    public C48737a f122397a;

    /* renamed from: b */
    private C48890g f122398b;

    /* renamed from: c */
    private C48565a f122399c;

    /* renamed from: d */
    private Handler f122400d;

    /* renamed from: e */
    private HashMap<Effect, C48651f> f122401e = new HashMap<>();

    /* renamed from: com.ss.android.ugc.effectmanager.effect.d.b.c$a */
    public interface C48737a {
        /* renamed from: a */
        void mo96319a(String str, Effect effect, int i, C48649d dVar);

        /* renamed from: a */
        void mo96320a(String str, List<Effect> list, C48649d dVar);
    }

    public C48736c(C48565a aVar) {
        this.f122399c = aVar;
        this.f122398b = this.f122399c.f122047a;
        this.f122400d = new C48685j(this);
    }

    /* renamed from: a */
    public final void mo96274a(Message message) {
        if (this.f122397a != null) {
            if (message.what == 15 && (message.obj instanceof C48749e)) {
                C48749e eVar = (C48749e) message.obj;
                Effect effect = eVar.f122430b;
                C48649d dVar = eVar.f122431c;
                if (dVar == null) {
                    this.f122397a.mo96319a(eVar.f122278a, effect, 20, null);
                } else {
                    this.f122397a.mo96319a(eVar.f122278a, effect, 26, dVar);
                }
                this.f122401e.remove(effect);
            }
            if (message.what == 17 && (message.obj instanceof C48748d)) {
                C48748d dVar2 = (C48748d) message.obj;
                C48649d dVar3 = dVar2.f122429c;
                if (dVar3 == null) {
                    this.f122397a.mo96320a(dVar2.f122278a, dVar2.f122428b, null);
                } else {
                    this.f122397a.mo96320a(dVar2.f122278a, dVar2.f122428b, dVar3);
                }
            }
            if (message.what == 23 && (message.obj instanceof C48752h)) {
                C48752h hVar = (C48752h) message.obj;
                C48649d dVar4 = hVar.f122440c;
                C48903k kVar = this.f122398b.f122948A;
                String str = hVar.f122278a;
                if (kVar.f123040d == null) {
                    kVar.f123040d = new HashMap();
                }
                C48703h hVar2 = (C48703h) kVar.f123040d.get(str);
                if (hVar2 != null) {
                    if (dVar4 == null) {
                        hVar2.mo8638a(hVar.f122439b);
                    } else {
                        hVar2.mo89462a(dVar4);
                    }
                    C48903k kVar2 = this.f122398b.f122948A;
                    String str2 = hVar.f122278a;
                    if (kVar2.f123040d != null) {
                        kVar2.f123040d.remove(str2);
                    }
                }
            }
            if (message.what == 24 && (message.obj instanceof C48755k)) {
                C48755k kVar3 = (C48755k) message.obj;
                C48649d dVar5 = kVar3.f122445b;
                C48709n nVar = (C48709n) this.f122398b.f122948A.mo96705d(kVar3.f122278a);
                if (dVar5 == null) {
                    nVar.mo8638a(kVar3.f122446c);
                } else {
                    nVar.mo92994a(dVar5);
                }
                this.f122398b.f122948A.mo96706e(kVar3.f122278a);
            }
            if (message.what == 60 && (message.obj instanceof C48760p)) {
                C48760p pVar = (C48760p) message.obj;
                C48649d dVar6 = pVar.f122458c;
                C48714s sVar = (C48714s) this.f122398b.f122948A.mo96705d(pVar.f122278a);
                if (dVar6 == null) {
                    sVar.mo8638a(pVar.f122457b);
                } else {
                    sVar.mo59196a(dVar6);
                }
                this.f122398b.f122948A.mo96706e(pVar.f122278a);
            }
            if (message.what == 19 && (message.obj instanceof C48745a)) {
                C48745a aVar = (C48745a) message.obj;
                C48649d dVar7 = aVar.f122421c;
                C48697b f = this.f122398b.f122948A.mo96707f(aVar.f122278a);
                if (f != null) {
                    if (dVar7 == null) {
                        f.mo8638a(aVar.f122420b);
                    } else {
                        f.mo73922a(aVar.f122420b, aVar.f122421c);
                    }
                }
                C48903k kVar4 = this.f122398b.f122948A;
                String str3 = aVar.f122278a;
                if (kVar4.f123046j != null) {
                    kVar4.f123046j.remove(str3);
                }
            }
            if (message.what == 54 && (message.obj instanceof C48745a)) {
                C48745a aVar2 = (C48745a) message.obj;
                C48697b f2 = this.f122398b.f122948A.mo96707f(aVar2.f122278a);
                if (f2 instanceof C48698c) {
                    ((C48698c) f2).mo73921a(aVar2.f122420b, aVar2.f122423e, aVar2.f122422d);
                }
            }
            if (message.what == 42 && (message.obj instanceof C48749e)) {
                C48749e eVar2 = (C48749e) message.obj;
                C48705j a = this.f122398b.f122948A.mo96695a(eVar2.f122278a);
                if (a != null) {
                    a.mo8643a(eVar2.f122430b);
                }
            }
            if (message.what == 53 && (message.obj instanceof C48749e)) {
                C48749e eVar3 = (C48749e) message.obj;
                C48705j a2 = this.f122398b.f122948A.mo96695a(eVar3.f122278a);
                if (a2 instanceof C48699d) {
                    ((C48699d) a2).mo59191a(eVar3.f122430b, eVar3.f122432d, eVar3.f122433e);
                }
            }
            if (message.what == 61 && (message.obj instanceof C48757m)) {
                C48757m mVar = (C48757m) message.obj;
                C48649d dVar8 = mVar.f122450c;
                C48700e eVar4 = (C48700e) this.f122398b.f122948A.mo96705d(mVar.f122278a);
                if (eVar4 != null && dVar8 == null) {
                    eVar4.mo8638a(mVar.f122449b);
                }
            }
        }
    }

    /* renamed from: a */
    public final String mo96309a(Map<String, String> map, C48709n nVar) {
        String a = C48679o.m105350a();
        this.f122399c.f122047a.f122948A.mo96696a(a, (Object) nVar);
        this.f122398b.f122971q.mo96269a(new C48877r(this.f122399c, this.f122400d, a, map));
        return a;
    }

    /* renamed from: b */
    public final String mo96310b(Effect effect, C48705j jVar) {
        String a = C48679o.m105350a();
        this.f122399c.f122047a.f122948A.mo96700a(a, (C48705j) null);
        this.f122398b.f122971q.mo96269a(new C48868i(this.f122399c, effect, this.f122400d, a));
        return a;
    }

    /* renamed from: a */
    public final String mo96303a(Effect effect, C48705j jVar) {
        String a = C48679o.m105350a();
        this.f122399c.f122047a.f122948A.mo96700a(a, jVar);
        C48860d dVar = new C48860d(effect, this.f122399c, a, this.f122400d);
        this.f122397a.mo96319a("", effect, 21, null);
        this.f122401e.put(effect, dVar);
        this.f122398b.f122971q.mo96269a(dVar);
        return a;
    }

    /* renamed from: a */
    public final String mo96304a(ProviderEffect providerEffect, C48697b bVar) {
        String a = C48679o.m105350a();
        C48903k kVar = this.f122399c.f122047a.f122948A;
        if (kVar.f123046j == null) {
            kVar.f123046j = new HashMap();
        }
        kVar.f123046j.put(a, bVar);
        this.f122398b.f122971q.mo96269a(new C48863e(this.f122399c, a, providerEffect, this.f122400d));
        return a;
    }

    /* renamed from: b */
    public final String mo96311b(List<String> list, Map<String, String> map, C48703h hVar) {
        String a = C48679o.m105350a();
        this.f122399c.f122047a.f122948A.mo96698a(a, hVar);
        C48681i iVar = this.f122398b.f122971q;
        C48871l lVar = new C48871l(this.f122399c, list, this.f122400d, a, map);
        iVar.mo96269a(lVar);
        return a;
    }

    /* renamed from: a */
    public final String mo96306a(List<? extends Effect> list, DownloadEffectExtra downloadEffectExtra, C48704i iVar) {
        String a = C48679o.m105350a();
        this.f122399c.f122047a.f122948A.mo96699a(a, iVar);
        C48681i iVar2 = this.f122398b.f122971q;
        C48858c cVar = new C48858c(this.f122399c, list, a, this.f122400d, downloadEffectExtra);
        iVar2.mo96269a(cVar);
        return a;
    }

    /* renamed from: a */
    public final String mo96307a(List<String> list, Map<String, String> map, C48703h hVar) {
        String a = C48679o.m105350a();
        this.f122399c.f122047a.f122948A.mo96698a(a, hVar);
        C48681i iVar = this.f122398b.f122971q;
        C48872m mVar = new C48872m(this.f122399c, list, this.f122400d, a, map);
        iVar.mo96269a(mVar);
        return a;
    }

    /* renamed from: a */
    public final String mo96308a(List<String> list, Map<String, String> map, C48704i iVar) {
        String a = C48679o.m105350a();
        this.f122399c.f122047a.f122948A.mo96699a(a, iVar);
        C48681i iVar2 = this.f122398b.f122971q;
        C48857b bVar = new C48857b(this.f122399c, list, this.f122400d, a, map);
        iVar2.mo96269a(bVar);
        return a;
    }

    /* renamed from: a */
    public final String mo96305a(String str, String str2, int i, int i2, Map<String, String> map, C48714s sVar) {
        String a = C48679o.m105350a();
        this.f122399c.f122047a.f122948A.mo96696a(a, (Object) sVar);
        C48681i iVar = this.f122398b.f122971q;
        C48879t tVar = new C48879t(this.f122399c, str, str2, i, i2, map, this.f122400d, a);
        iVar.mo96269a(tVar);
        return a;
    }
}
