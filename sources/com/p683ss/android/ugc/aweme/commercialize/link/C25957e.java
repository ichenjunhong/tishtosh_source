package com.p683ss.android.ugc.aweme.commercialize.link;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.e */
public final class C25957e {

    /* renamed from: a */
    static C25958a f68538a;

    /* renamed from: b */
    public static final C25957e f68539b = new C25957e();

    /* renamed from: com.ss.android.ugc.aweme.commercialize.link.e$a */
    public interface C25958a {
        String getLinkData();

        void setLinkData(String str);
    }

    private C25957e() {
    }

    /* renamed from: a */
    public static void m62954a(C25958a aVar) {
        f68538a = aVar;
    }

    /* renamed from: a */
    public static final int m62953a(String str) {
        C52711k.m112240b(str, "linkData");
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.optBoolean("link_exit", false)) {
                    return 1;
                }
                if (jSONObject.optBoolean("commerce_ad_link", false)) {
                    return 3;
                }
            } catch (JSONException unused) {
            }
        }
        return 2;
    }

    /* renamed from: b */
    public static final String m62955b(String str) {
        boolean z;
        C52711k.m112240b(str, "linkData");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                return new JSONObject(str).optString("commerce_ad_link_tags", null);
            } catch (JSONException unused) {
            }
        }
        return null;
    }
}
