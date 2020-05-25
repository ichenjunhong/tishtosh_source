package com.bytedance.ies.p675g.p677b;

import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.p675g.p676a.C10766h;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.g.b.u */
public final class C10809u implements C10762d {

    /* renamed from: a */
    private Set<String> f29042a;

    /* renamed from: b */
    private C10775ab f29043b;

    C10809u(C10775ab abVar, Set<String> set) {
        this.f29042a = set;
        this.f29043b = abVar;
    }

    public final void call(C10766h hVar, JSONObject jSONObject) throws Exception {
        if (this.f29042a.contains(hVar.f28946c)) {
            jSONObject.put("code", "-1");
            return;
        }
        hVar.f28951h = false;
        this.f29043b.mo19504a(C10802q.m21911a().mo19573c(hVar.f28946c).mo19572b(hVar.f28944a).mo19574d(hVar.f28947d.toString()).mo19575e(hVar.f28945b).mo19570a(String.valueOf(hVar.f28948e)).mo19576f(hVar.f28949f).mo19577g(hVar.f28950g).mo19571a());
        new StringBuilder("Legacy call forwarded to new bridge: ").append(hVar.toString());
    }
}
