package com.p683ss.android.ugc.aweme.feedback.runtime.behavior.strategy;

import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c.C31301a;
import com.p683ss.android.ugc.aweme.runtime.behavior.C41319c;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.e */
public final class C31310e extends C31304a {

    /* renamed from: a */
    public static final C31311a f82066a = new C31311a(null);

    /* renamed from: com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.e$a */
    public static final class C31311a {
        private C31311a() {
        }

        public /* synthetic */ C31311a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final String mo64209a() {
        return "abnor_player";
    }

    /* renamed from: b */
    public final long mo64211b() {
        return TimeUnit.HOURS.toMillis(2);
    }

    /* renamed from: c */
    public final String mo64212c() {
        long currentTimeMillis = System.currentTimeMillis() - mo64211b();
        List a = C31301a.m73024a().mo64184a("block", currentTimeMillis);
        List<C41319c> a2 = C31301a.m73024a().mo64184a("error", currentTimeMillis);
        JSONObject jSONObject = new JSONObject();
        if (!a.isEmpty()) {
            jSONObject.put("block_count", a.size());
        }
        if (!a2.isEmpty()) {
            jSONObject.put("error_count", a2.size());
            JSONArray jSONArray = new JSONArray();
            for (C41319c cVar : a2) {
                if (cVar != null) {
                    jSONArray.put(new JSONObject(cVar.f104782d));
                }
            }
            jSONObject.put("error_code_msg", jSONArray);
        }
        String jSONObject2 = jSONObject.toString();
        C52711k.m112236a((Object) jSONObject2, "result.toString()");
        return jSONObject2;
    }

    /* renamed from: a */
    public final boolean mo64210a(String str) {
        C52711k.m112240b(str, "type");
        int hashCode = str.hashCode();
        if (hashCode == 93832333 ? !str.equals("block") : hashCode != 96784904 || !str.equals("error")) {
            return false;
        }
        return true;
    }
}
