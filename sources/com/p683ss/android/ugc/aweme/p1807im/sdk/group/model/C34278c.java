package com.p683ss.android.ugc.aweme.p1807im.sdk.group.model;

import com.bytedance.ies.ugc.p694a.C11010c;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.group.model.c */
public final class C34278c {

    /* renamed from: a */
    public static final C34278c f88504a = new C34278c();

    private C34278c() {
    }

    /* renamed from: a */
    public static HashMap<String, String> m78179a(int i, int i2) {
        HashMap<String, String> hashMap = new HashMap<>();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("source_app_id", C11010c.m22289j());
        jSONObject.put("source_type", i);
        Map map = hashMap;
        String jSONObject2 = jSONObject.toString();
        C52711k.m112236a((Object) jSONObject2, "params.toString()");
        map.put("create", jSONObject2);
        map.put("group_create_type", String.valueOf(i2));
        return hashMap;
    }

    /* renamed from: a */
    public static HashMap<String, String> m78180a(long j, int i, String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("source_app_id", C11010c.m22289j());
        jSONObject3.put("im_user_id", j);
        jSONObject.put("invitee", jSONObject2);
        jSONObject.put("invitor", jSONObject3);
        jSONObject.put("source_type", i);
        Map map = hashMap;
        String jSONObject4 = jSONObject.toString();
        C52711k.m112236a((Object) jSONObject4, "params.toString()");
        map.put("invitation", jSONObject4);
        if (str != null) {
            map.put("ticket", str);
        }
        return hashMap;
    }
}
