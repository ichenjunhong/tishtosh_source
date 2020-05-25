package com.bytedance.ies.p675g.p677b;

import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.g.b.m */
final class C10798m extends C10778c {

    /* renamed from: b */
    private C10762d f29013b;

    C10798m(C10762d dVar) {
        this.f29013b = dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19518a(C10802q qVar, C10810v vVar) throws Exception {
        C10766h hVar = new C10766h();
        hVar.f28946c = qVar.f29017d;
        hVar.f28947d = new JSONObject(qVar.f29018e);
        hVar.f28945b = qVar.f29019f;
        hVar.f28944a = qVar.f29016c;
        hVar.f28948e = 0;
        hVar.f28949f = qVar.f29020g;
        hVar.f28950g = qVar.f29021h;
        hVar.f28951h = true;
        JSONObject jSONObject = new JSONObject();
        new StringBuilder("Invoking legacy method with: ").append(hVar.toString());
        try {
            this.f29013b.call(hVar, jSONObject);
        } catch (Exception unused) {
        }
        if (!hVar.f28951h) {
            new StringBuilder("No need for callback: ").append(hVar.toString());
            return;
        }
        String jSONObject2 = jSONObject.toString();
        if (!vVar.f29046c) {
            StringBuilder sb = new StringBuilder("Jsb async call already finished: ");
            sb.append(vVar.f29044a);
            sb.append(", stub: ");
            sb.append(vVar.hashCode());
            C10789i.m21876a(new IllegalStateException(sb.toString()));
        }
        StringBuilder sb2 = new StringBuilder("Jsb async call about to finish with response: ");
        sb2.append(vVar.f29044a);
        sb2.append(", stub: ");
        sb2.append(vVar.hashCode());
        vVar.f29045b.mo19536a(jSONObject2);
        vVar.f29046c = false;
        if (C10789i.f28993a) {
            if (jSONObject.optInt("code", 0) == 1) {
                new StringBuilder("Method succeed with: ").append(hVar.toString());
                return;
            }
            new StringBuilder("No need for callback, but error occurred: ").append(hVar.toString());
        }
    }
}
