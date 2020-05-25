package com.p683ss.android.ugc.aweme.base;

import android.net.Uri;
import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.base.h */
final /* synthetic */ class C23535h implements Runnable {

    /* renamed from: a */
    private final Uri f62656a;

    /* renamed from: b */
    private final long f62657b;

    /* renamed from: c */
    private final boolean f62658c;

    C23535h(Uri uri, long j, boolean z) {
        this.f62656a = uri;
        this.f62657b = j;
        this.f62658c = z;
    }

    public final void run() {
        String str;
        Uri uri = this.f62656a;
        long j = this.f62657b;
        boolean z = this.f62658c;
        if (uri != null) {
            str = uri.toString();
        } else {
            str = null;
        }
        String str2 = "";
        if (!TextUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("url", str);
                jSONObject.put("fromNetwork", z);
                jSONObject.put("url_convert", false);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("caller_id", str2);
                }
                jSONObject.put("duration", j);
            } catch (Exception unused) {
            }
            C23569o.m57776a("aweme_image_load_error_rate", 0, jSONObject);
            if (j > 0) {
                C23569o.m57778a("aweme_image_load", "load_time", (float) j);
            }
        }
    }
}
