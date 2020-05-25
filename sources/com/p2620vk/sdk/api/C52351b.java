package com.p2620vk.sdk.api;

import android.net.Uri;
import com.C2240a;
import com.p2620vk.sdk.C52420c;
import com.p2620vk.sdk.p2621a.C52323a;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.vk.sdk.api.b */
public final class C52351b extends C52420c {

    /* renamed from: c */
    public Exception f130347c;

    /* renamed from: d */
    public C52351b f130348d;

    /* renamed from: e */
    public C52354e f130349e;

    /* renamed from: f */
    public int f130350f;

    /* renamed from: g */
    public String f130351g;

    /* renamed from: h */
    public String f130352h;

    /* renamed from: i */
    public ArrayList<Map<String, String>> f130353i;

    /* renamed from: j */
    public String f130354j;

    /* renamed from: k */
    public String f130355k;

    /* renamed from: l */
    public String f130356l;

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKError (");
        switch (this.f130350f) {
            case -105:
                sb.append("HTTP failed");
                break;
            case -104:
                sb.append("JSON failed");
                break;
            case -103:
                sb.append("Request wasn't prepared");
                break;
            case -102:
                sb.append("Canceled");
                break;
            case -101:
                sb.append("API error");
                if (this.f130348d != null) {
                    sb.append(this.f130348d.toString());
                    break;
                }
                break;
            default:
                sb.append(C2240a.m6772a("code: %d; ", new Object[]{Integer.valueOf(this.f130350f)}));
                break;
        }
        if (this.f130352h != null) {
            sb.append(C2240a.m6772a("; %s", new Object[]{this.f130352h}));
        }
        if (this.f130351g != null) {
            sb.append(C2240a.m6772a("; %s", new Object[]{this.f130351g}));
        }
        sb.append(")");
        return sb.toString();
    }

    public C52351b(int i) {
        this.f130350f = i;
    }

    public C52351b(Map<String, String> map) {
        this.f130350f = -101;
        this.f130352h = (String) map.get("error_reason");
        this.f130351g = Uri.decode((String) map.get("error_description"));
        if (map.containsKey("fail")) {
            this.f130352h = "Action failed";
        }
        if (map.containsKey("cancel")) {
            this.f130350f = -102;
            this.f130352h = "User canceled request";
        }
    }

    public C52351b(JSONObject jSONObject) throws JSONException {
        C52351b bVar = new C52351b(jSONObject.getInt("error_code"));
        bVar.f130351g = jSONObject.getString("error_msg");
        bVar.f130353i = (ArrayList) C52323a.m111787a(jSONObject.getJSONArray("request_params"));
        if (bVar.f130350f == 14) {
            bVar.f130355k = jSONObject.getString("captcha_img");
            bVar.f130354j = jSONObject.getString("captcha_sid");
        }
        if (bVar.f130350f == 17) {
            bVar.f130356l = jSONObject.getString("redirect_uri");
        }
        this.f130350f = -101;
        this.f130348d = bVar;
    }
}
