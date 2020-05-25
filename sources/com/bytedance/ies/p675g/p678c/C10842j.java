package com.bytedance.ies.p675g.p678c;

import com.bytedance.ies.p675g.p677b.C10779d;
import com.bytedance.ies.p675g.p677b.C10783f;
import com.bytedance.ies.p675g.p678c.C10830e.C10832b;
import com.bytedance.ies.p675g.p678c.C10843k.C10845b;
import com.bytedance.ies.p675g.p678c.C10853m.C10854a;
import java.util.Map.Entry;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52808d;

/* renamed from: com.bytedance.ies.g.c.j */
public final class C10842j extends C10779d<JSONObject, JSONObject> implements C10845b {

    /* renamed from: a */
    private C10843k f29107a;

    /* renamed from: b */
    private final C10836h f29108b;

    public final void onTerminate() {
        C10843k kVar = this.f29107a;
        if (kVar != null) {
            C10845b bVar = this;
            C52711k.m112240b(bVar, "processListener");
            kVar.f29111b.remove(bVar);
        }
    }

    public C10842j(C10836h hVar) {
        C52711k.m112240b(hVar, "handler");
        this.f29108b = hVar;
    }

    /* renamed from: a */
    public final void mo19624a(Throwable th) {
        C52711k.m112240b(th, "throwable");
        finishWithFailure();
    }

    /* renamed from: a */
    public final void mo19623a(C10832b bVar) {
        int i;
        C52711k.m112240b(bVar, "response");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("raw", new JSONObject(new String(bVar.mo19617b(), C52808d.f131043a)));
        JSONObject jSONObject2 = new JSONObject();
        for (Entry entry : bVar.mo19614a().entrySet()) {
            jSONObject2.put((String) entry.getKey(), entry.getValue());
        }
        jSONObject.put("headers", jSONObject2);
        String str = "cached";
        C10843k kVar = this.f29107a;
        if (kVar != null) {
            i = kVar.f29114e;
        } else {
            i = 0;
        }
        jSONObject.put(str, i);
        finishWithResult(jSONObject);
    }

    public final /* synthetic */ void invoke(Object obj, C10783f fVar) {
        JSONObject jSONObject = (JSONObject) obj;
        C52711k.m112240b(jSONObject, "params");
        C52711k.m112240b(fVar, "context");
        this.f29107a = this.f29108b.mo19621a(C10854a.m22015a(jSONObject));
        C10843k kVar = this.f29107a;
        if (kVar != null) {
            C10845b bVar = this;
            C52711k.m112240b(bVar, "processListener");
            kVar.f29111b.add(bVar);
            C10832b bVar2 = kVar.f29112c;
            if (bVar2 != null) {
                bVar.mo19623a(bVar2);
            }
            Throwable th = kVar.f29113d;
            if (th != null) {
                bVar.mo19624a(th);
            }
        }
    }
}
