package com.facebook.share.internal;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.b */
public final class C14587b {

    /* renamed from: a */
    static final Map<Class<?>, C14591a> f37892a;

    /* renamed from: com.facebook.share.internal.b$a */
    public interface C14591a {
        /* renamed from: a */
        void mo26829a(JSONObject jSONObject, String str, Object obj) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        f37892a = hashMap;
        hashMap.put(String.class, new C14591a() {
            /* renamed from: a */
            public final void mo26829a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                jSONObject.put(str, obj);
            }
        });
        f37892a.put(String[].class, new C14591a() {
            /* renamed from: a */
            public final void mo26829a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                JSONArray jSONArray = new JSONArray();
                for (String put : (String[]) obj) {
                    jSONArray.put(put);
                }
                jSONObject.put(str, jSONArray);
            }
        });
        f37892a.put(JSONArray.class, new C14591a() {
            /* renamed from: a */
            public final void mo26829a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
            }
        });
    }
}
