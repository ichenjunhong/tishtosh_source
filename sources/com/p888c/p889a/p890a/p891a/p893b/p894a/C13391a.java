package com.p888c.p889a.p890a.p891a.p893b.p894a;

import com.p888c.p889a.p890a.p891a.p893b.C13394b;
import com.p888c.p889a.p890a.p891a.p893b.C13401i;
import com.p888c.p889a.p890a.p891a.p893b.C13404l;
import com.p888c.p889a.p890a.p891a.p895c.C13412e;
import com.p888c.p889a.p890a.p891a.p895c.C13415g;
import com.p888c.p889a.p890a.p891a.p897e.C13422b;
import com.p888c.p889a.p890a.p891a.p897e.C13426e;
import com.p888c.p889a.p890a.p891a.p899g.C13430a;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.b.a.a */
public final class C13391a {

    /* renamed from: a */
    public final C13404l f34901a;

    private C13391a(C13404l lVar) {
        this.f34901a = lVar;
    }

    /* renamed from: a */
    public final void mo25082a() {
        C13426e.m27073b(this.f34901a);
        this.f34901a.mo25100c().mo25129a("firstQuartile");
    }

    /* renamed from: b */
    public final void mo25084b() {
        C13426e.m27073b(this.f34901a);
        this.f34901a.mo25100c().mo25129a("midpoint");
    }

    /* renamed from: c */
    public final void mo25085c() {
        C13426e.m27073b(this.f34901a);
        this.f34901a.mo25100c().mo25129a("thirdQuartile");
    }

    /* renamed from: d */
    public final void mo25086d() {
        C13426e.m27073b(this.f34901a);
        this.f34901a.mo25100c().mo25129a("complete");
    }

    /* renamed from: a */
    public static C13391a m26991a(C13394b bVar) {
        C13404l lVar = (C13404l) bVar;
        C13426e.m27071a((Object) bVar, "AdSession is null");
        if (!(C13401i.NATIVE == lVar.f34936a.f34909b)) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        } else if (!lVar.f34938c) {
            C13426e.m27070a(lVar);
            if (lVar.mo25100c().f34983b == null) {
                C13391a aVar = new C13391a(lVar);
                lVar.mo25100c().f34983b = aVar;
                return aVar;
            }
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        } else {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public final void mo25083a(float f, float f2) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Media duration");
        } else if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        } else {
            C13426e.m27073b(this.f34901a);
            JSONObject jSONObject = new JSONObject();
            C13422b.m27062a(jSONObject, "duration", Float.valueOf(f));
            C13422b.m27062a(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
            C13422b.m27062a(jSONObject, "deviceVolume", Float.valueOf(C13415g.m27045a().f34968a));
            C13430a c = this.f34901a.mo25100c();
            C13412e.m27034a().mo25114a(c.mo25132c(), "start", jSONObject);
        }
    }
}
