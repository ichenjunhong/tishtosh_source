package com.bytedance.crash.p551k.p552a;

import android.content.Context;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9616k;
import com.bytedance.crash.p546f.C9584a;
import com.bytedance.crash.p546f.C9586c;
import com.bytedance.crash.p550j.C9613a;
import com.bytedance.crash.p555n.C9710q;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.k.a.k */
final class C9634k extends C9622c {
    /* renamed from: a */
    public final C9584a mo17464a(int i, C9584a aVar) {
        JSONObject jSONObject;
        C9584a a = super.mo17464a(i, aVar);
        if (a.f26141a.length() > 0) {
            JSONObject jSONObject2 = a.f26141a;
            C9584a aVar2 = new C9584a();
            jSONObject = jSONObject2;
            a = aVar2;
        } else {
            jSONObject = new JSONObject();
        }
        if (i != 5) {
            switch (i) {
                case 0:
                    C9586c a2 = C9586c.m19047a(this.f26271b);
                    a2.mo17410a(C9616k.m19147a().mo17446a());
                    a.mo17387a(a2);
                    C9710q.m19417a(jSONObject, a2, this.f26270a);
                    break;
                case 1:
                    C9586c e = a.mo17406e();
                    e.mo17409a(C9616k.m19151c().mo17507a());
                    e.mo17408a(C9616k.m19147a().mo17451f());
                    break;
                case 2:
                    C9586c.m19049a(a.mo17406e());
                    try {
                        a.mo17406e().f26149a.put("launch_did", C9613a.m19141a(this.f26271b));
                        break;
                    } catch (Throwable unused) {
                        break;
                    }
            }
        } else {
            C9586c.m19052b(a.mo17406e());
        }
        a.mo17395a("data", (Object) new JSONArray().put(jSONObject));
        return a;
    }

    C9634k(Context context, C9619b bVar, C9624d dVar) {
        super(C9571d.LAUNCH, context, bVar, dVar);
    }
}
