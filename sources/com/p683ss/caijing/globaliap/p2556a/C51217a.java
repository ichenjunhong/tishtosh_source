package com.p683ss.caijing.globaliap.p2556a;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.caijing.globaliap.p2561e.C51271a;
import com.p683ss.caijing.globaliap.p2561e.C51271a.C51272a;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.a.a */
public final class C51217a extends C51271a<C51218a> {

    /* renamed from: a */
    public String f127910a;

    /* renamed from: com.ss.caijing.globaliap.a.a$a */
    public static class C51218a extends C51272a {

        /* renamed from: a */
        public String f127911a;

        /* renamed from: b */
        public String f127912b;

        /* renamed from: c */
        public String f127913c;

        /* renamed from: d */
        public long f127914d;

        /* renamed from: e */
        public String f127915e;

        /* renamed from: f */
        public String f127916f;
    }

    /* renamed from: a */
    public final Map<String, String> mo101743a(Map<String, String> map) {
        map.put("method", "tp.cashdesk.trade_create");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", "cashdesk.sdk.googlepay_iap.create");
            jSONObject.put("params", new JSONObject(this.f127910a));
            map.put("biz_content", URLEncoder.encode(jSONObject.toString(), "UTF-8"));
        } catch (JSONException e) {
            C17840a.m43754b(e);
        } catch (UnsupportedEncodingException e2) {
            C17840a.m43754b(e2);
        }
        return map;
    }
}
