package com.p888c.p889a.p890a.p891a.p893b;

import com.p888c.p889a.p890a.p891a.p893b.p894a.C13393c;
import com.p888c.p889a.p890a.p891a.p895c.C13412e;
import com.p888c.p889a.p890a.p891a.p897e.C13426e;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.b.a */
public final class C13390a {

    /* renamed from: a */
    private final C13404l f34900a;

    private C13390a(C13404l lVar) {
        this.f34900a = lVar;
    }

    /* renamed from: a */
    public static C13390a m26988a(C13394b bVar) {
        C13404l lVar = (C13404l) bVar;
        C13426e.m27071a((Object) bVar, "AdSession is null");
        if (lVar.mo25100c().f34982a == null) {
            C13426e.m27070a(lVar);
            C13390a aVar = new C13390a(lVar);
            lVar.mo25100c().f34982a = aVar;
            return aVar;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    /* renamed from: a */
    public final void mo25080a() {
        C13426e.m27070a(this.f34900a);
        C13426e.m27074c(this.f34900a);
        if (!this.f34900a.mo25103f()) {
            try {
                this.f34900a.mo25089a();
            } catch (Exception unused) {
            }
        }
        if (this.f34900a.mo25103f()) {
            C13404l lVar = this.f34900a;
            if (!lVar.f34940e) {
                C13412e.m27034a().mo25116a(lVar.mo25100c().mo25132c(), "publishImpressionEvent", new Object[0]);
                lVar.f34940e = true;
                return;
            }
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    /* renamed from: a */
    public final void mo25081a(C13393c cVar) {
        C13426e.m27073b(this.f34900a);
        C13426e.m27074c(this.f34900a);
        C13404l lVar = this.f34900a;
        JSONObject a = cVar.mo25088a();
        if (!lVar.f34941f) {
            Object[] objArr = {a};
            C13412e.m27034a().mo25116a(lVar.mo25100c().mo25132c(), "publishLoadedEvent", objArr);
            lVar.f34941f = true;
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }
}
