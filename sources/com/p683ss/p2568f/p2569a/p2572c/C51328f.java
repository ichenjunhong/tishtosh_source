package com.p683ss.p2568f.p2569a.p2572c;

import com.p683ss.p2568f.p2569a.C51311c;
import com.p683ss.p2568f.p2569a.C51311c.C51313a;
import com.p683ss.p2568f.p2569a.p2570a.C51301a;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.f.a.c.f */
final class C51328f {

    /* renamed from: com.ss.f.a.c.f$a */
    interface C51329a {
        /* renamed from: a */
        void mo101867a(C51301a aVar);

        /* renamed from: a */
        void mo101868a(JSONObject jSONObject);
    }

    /* renamed from: a */
    static void m110388a(C51311c cVar, String str, String str2, C51329a aVar) {
        C51301a aVar2;
        if (str2 != null) {
            C51313a a = cVar.mo14312a(str, str2);
            if (a == null) {
                aVar.mo101867a(new C51301a(-111, "result is null", null));
                return;
            }
            Exception exc = a.f128232d;
            if (exc != null || a.f128229a == null) {
                HashMap hashMap = new HashMap();
                if (a.f128229a != null) {
                    hashMap.put("rawResp", a.f128229a);
                }
                if (exc instanceof IOException) {
                    hashMap.put("description", "network IO exception");
                    aVar2 = new C51301a(-108, exc.toString(), hashMap);
                } else if (exc instanceof JSONException) {
                    hashMap.put("description", "parse JSON failure");
                    if (a.f128230b != null) {
                        hashMap.put("rowBody", a.f128230b);
                    }
                    if (a.f128231c != null) {
                        hashMap.put("responseHeader", a.f128231c);
                    }
                    aVar2 = new C51301a(-100, exc.getMessage(), hashMap);
                } else {
                    hashMap.put("description", "response not successful");
                    aVar2 = new C51301a(-104, exc.getMessage(), hashMap);
                }
                aVar.mo101867a(aVar2);
                return;
            }
            aVar.mo101868a(a.f128229a);
        }
    }
}
