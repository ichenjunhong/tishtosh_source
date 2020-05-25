package com.p683ss.caijing.globaliap.p2556a;

import android.text.TextUtils;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import com.p683ss.caijing.globaliap.p2561e.C51271a;
import com.p683ss.caijing.globaliap.p2561e.C51271a.C51272a;
import com.p683ss.caijing.globaliap.pay.C51292c;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.caijing.globaliap.a.c */
public final class C51220c extends C51271a<C51221a> {

    /* renamed from: a */
    public String f127918a;

    /* renamed from: b */
    public String f127919b;

    /* renamed from: c */
    public String f127920c;

    /* renamed from: d */
    public long f127921d;

    /* renamed from: e */
    public String f127922e;

    /* renamed from: f */
    public String f127923f;

    /* renamed from: g */
    public String f127924g;

    /* renamed from: h */
    public String f127925h;

    /* renamed from: i */
    public long f127926i;

    /* renamed from: com.ss.caijing.globaliap.a.c$a */
    public static class C51221a extends C51272a {

        /* renamed from: a */
        public String f127927a;

        /* renamed from: b */
        String f127928b;

        /* renamed from: a */
        public final boolean mo101747a() {
            return TextUtils.equals(this.f127928b, "1");
        }

        /* renamed from: b */
        public final boolean mo101748b() {
            return TextUtils.equals(this.f128038g, "CD0408");
        }
    }

    /* renamed from: a */
    public static C51221a m110130a(JSONObject jSONObject) {
        C51221a aVar = new C51221a();
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        aVar.f128038g = jSONObject2.getString("code");
        aVar.f128039h = jSONObject2.optString("msg");
        aVar.f127927a = jSONObject2.optString("trade_no");
        aVar.f127928b = jSONObject2.optString("delete_fe_cache");
        return aVar;
    }

    /* renamed from: a */
    public final Map<String, String> mo101743a(Map<String, String> map) {
        map.put("app_id", this.f127922e);
        map.put("method", "tp.cashdesk.trade_confirm");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", "cashdesk.sdk.googlepay_iap.confirm");
            jSONObject.put("merchant_id", this.f127918a);
            jSONObject.put("uid", this.f127919b);
            jSONObject.put("trade_no", this.f127920c);
            jSONObject.put("trade_amount", this.f127921d);
            jSONObject.put("pay_amount", this.f127921d);
            jSONObject.put("pay_type", "googlepay_iap");
            jSONObject.put("fe_iap_status", "SUCCESS");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("channel_out_order_no", this.f127924g);
            jSONObject2.put("package_name", C51292c.m110280b().getPackageName());
            jSONObject2.put("product_id", this.f127925h);
            jSONObject2.put("environment", "ONLINE");
            jSONObject2.put("token", this.f127923f);
            jSONObject2.put("transaction_date", this.f127926i);
            jSONObject.put("iap_info", jSONObject2);
            map.put("biz_content", URLEncoder.encode(jSONObject.toString(), "UTF-8"));
        } catch (JSONException e) {
            C17840a.m43754b(e);
        } catch (UnsupportedEncodingException e2) {
            C17840a.m43754b(e2);
        }
        return map;
    }
}
