package com.p683ss.android.ugc.aweme.commercialize.log;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import org.json.JSONException;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.aq */
public final class C26050aq {

    /* renamed from: a */
    public static final C26050aq f68802a = new C26050aq();

    private C26050aq() {
    }

    /* renamed from: a */
    public static final long m63096a(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        if (!aweme.isAd()) {
            return 0;
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null) {
            return C25945k.m62911b().mo53113a(awemeRawAd);
        }
        return 0;
    }

    /* renamed from: a */
    public static final String m63097a(AwemeRawAd awemeRawAd) {
        C52711k.m112240b(awemeRawAd, "awemeRawAd");
        Long creativeId = awemeRawAd.getCreativeId();
        if (creativeId != null) {
            String valueOf = String.valueOf(creativeId.longValue());
            if (valueOf != null) {
                return valueOf;
            }
        }
        return "0";
    }

    /* renamed from: b */
    public static final JSONObject m63103b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = (JSONObject) jSONObject.opt("ad_extra_data");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        try {
            jSONObject2.put("poll_click_area", str);
            jSONObject.put("ad_extra_data", jSONObject2);
        } catch (JSONException e) {
            C32458a.m75143a((Exception) e);
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027 A[Catch:{ JSONException -> 0x0032 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final org.json.JSONObject m63099a(org.json.JSONObject r2, java.lang.String r3) {
        /*
            if (r2 != 0) goto L_0x0007
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
        L_0x0007:
            java.lang.String r0 = "ad_extra_data"
            java.lang.Object r0 = r2.opt(r0)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            if (r0 != 0) goto L_0x0016
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
        L_0x0016:
            r1 = r3
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ JSONException -> 0x0032 }
            if (r1 == 0) goto L_0x0024
            int r1 = r1.length()     // Catch:{ JSONException -> 0x0032 }
            if (r1 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r1 = 0
            goto L_0x0025
        L_0x0024:
            r1 = 1
        L_0x0025:
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = "poi_ad_list"
            r0.put(r1, r3)     // Catch:{ JSONException -> 0x0032 }
        L_0x002c:
            java.lang.String r3 = "ad_extra_data"
            r2.put(r3, r0)     // Catch:{ JSONException -> 0x0032 }
            goto L_0x0038
        L_0x0032:
            r3 = move-exception
            java.lang.Exception r3 = (java.lang.Exception) r3
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75143a(r3)
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.log.C26050aq.m63099a(org.json.JSONObject, java.lang.String):org.json.JSONObject");
    }

    /* renamed from: a */
    public static final JSONObject m63098a(Context context, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            C25945k.m62911b().mo53114a(context, jSONObject, str);
        } catch (JSONException e) {
            C32458a.m75143a((Exception) e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static final void m63100a(Context context, String str, String str2, String str3, long j) {
        boolean z;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str3, "cid");
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m63102a(context, "draw_ad", "poll_sticker_show", m63098a(context, str, "ad vote show event"), str2, str3, j);
        }
    }

    /* renamed from: a */
    public static final void m63101a(Context context, String str, String str2, String str3, String str4, long j) {
        boolean z;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str4, "cid");
        CharSequence charSequence = str2;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m63102a(context, "draw_ad", "poi_sticker_show", m63099a(m63098a(context, str2, "ad poi show event"), str), str3, str4, j);
        }
    }

    /* renamed from: a */
    public static final void m63102a(Context context, String str, String str2, JSONObject jSONObject, String str3, String str4, long j) {
        CharSequence charSequence = str3;
        if (TextUtils.equals(charSequence, "challenge") || TextUtils.equals(charSequence, "challenge_fresh")) {
            if (TextUtils.equals(str, "background_ad")) {
                str = "background_ads";
            } else {
                str = "topic_ads";
            }
        }
        C25945k.m62911b().mo53127a(context, str, str2, jSONObject, str4, j);
    }
}
