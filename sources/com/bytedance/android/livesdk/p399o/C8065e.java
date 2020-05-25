package com.bytedance.android.livesdk.p399o;

import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.o.e */
public interface C8065e {

    /* renamed from: com.bytedance.android.livesdk.o.e$a */
    public static class C8066a {

        /* renamed from: a */
        public Map<String, String> f22045a = new HashMap();

        /* renamed from: a */
        public static C8066a m16007a() {
            return new C8066a();
        }

        /* renamed from: a */
        public final C8066a mo14222a(Map<String, String> map) {
            if (map == null || map.isEmpty()) {
                return this;
            }
            this.f22045a.putAll(map);
            return this;
        }

        /* renamed from: a */
        public final C8066a mo14223a(JSONObject jSONObject) {
            this.f22045a.put("ad_extra_data", jSONObject.toString());
            return this;
        }

        /* renamed from: a */
        private C8066a m16008a(String str, C8038g gVar) {
            this.f22045a.put(str, C8067f.m16013a(str, gVar));
            return this;
        }

        /* renamed from: a */
        public final C8066a mo14220a(C8038g gVar, String... strArr) {
            if (strArr.length <= 0) {
                return this;
            }
            for (String a : strArr) {
                m16008a(a, gVar);
            }
            return this;
        }

        /* renamed from: a */
        public final C8066a mo14221a(String str, String str2) {
            this.f22045a.put(str, str2);
            return this;
        }
    }
}
