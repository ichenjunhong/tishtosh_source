package com.bytedance.sdk.account.p877l;

import android.text.TextUtils;
import com.p683ss.android.account.p1102b.C18494a;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.l.b */
public class C13207b {

    /* renamed from: a */
    public long f34473a;

    /* renamed from: b */
    public String f34474b;

    /* renamed from: c */
    public final Map<String, C18494a> f34475c = new HashMap();

    /* renamed from: d */
    public int f34476d;

    /* renamed from: e */
    public boolean f34477e;

    /* renamed from: f */
    public String f34478f;

    /* renamed from: g */
    public String f34479g;

    /* renamed from: h */
    public boolean f34480h;

    /* renamed from: i */
    public JSONObject f34481i;

    /* renamed from: j */
    public JSONObject f34482j;

    /* renamed from: k */
    public JSONObject f34483k;

    /* renamed from: a */
    public void mo24803a() throws Exception {
        boolean z;
        JSONObject jSONObject = this.f34482j;
        JSONObject jSONObject2 = this.f34483k;
        this.f34473a = jSONObject2.optLong("user_id", 0);
        this.f34474b = jSONObject2.optString("sec_user_id", "");
        this.f34478f = jSONObject2.optString("session_key", "");
        if (jSONObject2.optInt("new_user") != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f34477e = z;
        String optString = jSONObject2.optString("mobile");
        this.f34479g = jSONObject2.optString("sec_user_id", "");
        this.f34480h = jSONObject2.optBoolean("is_visitor_account", false);
        String optString2 = jSONObject2.optString("email");
        C18494a a = C18494a.m44739a("mobile");
        C18494a a2 = C18494a.m44739a("email");
        a2.f50951e = optString2;
        if (!TextUtils.isEmpty(optString2)) {
            this.f34475c.put(a2.f50948b, a2);
        }
        a.f50951e = optString;
        if (!TextUtils.isEmpty(optString)) {
            this.f34475c.put(a.f50948b, a);
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("connects");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            long currentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = optJSONArray.getJSONObject(i);
                String string = jSONObject3.getString("platform");
                if (!(string == null || string.length() == 0)) {
                    C18494a a3 = C18494a.m44739a(string);
                    if (jSONObject3.has("screen_name")) {
                        a3.f50951e = jSONObject3.optString("screen_name");
                    } else if (jSONObject3.has("platform_screen_name")) {
                        a3.f50951e = jSONObject3.optString("platform_screen_name");
                    }
                    a3.f50952f = jSONObject3.optString("profile_image_url");
                    a3.f50953g = jSONObject3.optString("platform_uid");
                    a3.f50954h = jSONObject3.optString("create_time");
                    a3.f50955i = jSONObject3.optLong("modify_time");
                    long optLong = jSONObject3.optLong("expires_in");
                    if (optLong > 0) {
                        a3.f50956j = (1000 * optLong) + currentTimeMillis;
                    }
                    a3.f50957k = optLong;
                    C18494a aVar = (C18494a) this.f34475c.get(string);
                    if (aVar == null || aVar.f50955i <= 0 || aVar.f50955i <= a3.f50955i) {
                        this.f34475c.put(string, a3);
                    }
                }
            }
        }
        this.f34476d = jSONObject2.optInt("country_code", -1);
    }

    public C13207b(JSONObject jSONObject) {
        this.f34482j = jSONObject;
        this.f34481i = jSONObject.optJSONObject("data");
        this.f34483k = this.f34481i;
    }

    public C13207b(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f34482j = jSONObject;
        this.f34481i = jSONObject.optJSONObject("data");
        this.f34483k = jSONObject2;
    }
}
