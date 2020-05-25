package com.bytedance.android.live.core.p230g.p231a;

import android.net.Uri;
import com.bytedance.android.live.core.p225d.C3835c;
import com.bytedance.android.live.core.p225d.C3837e;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.core.g.a.e */
final /* synthetic */ class C3855e implements Runnable {

    /* renamed from: a */
    private final Uri f10880a;

    /* renamed from: b */
    private final long f10881b;

    C3855e(Uri uri, long j) {
        this.f10880a = uri;
        this.f10881b = j;
    }

    public final void run() {
        Uri uri = this.f10880a;
        long j = this.f10881b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", uri);
        } catch (JSONException unused) {
        }
        C3837e.m9750c("hotsoon_image_load_error_rate", 0, jSONObject);
        if (j > 0) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("duration", j);
                jSONObject2.put("url", uri);
            } catch (JSONException unused2) {
            }
            C3837e.m9747a("hotsoon_image_load_duration", "hotsoon_image_load", jSONObject2);
            String str = "hotsoon_image_load";
            String str2 = "load_time";
            float f = (float) j;
            if (C3837e.m9736a() != null) {
                C3837e.m9736a().mo7592a(str, str2, f);
            }
        }
        String uri2 = uri.toString();
        HashMap hashMap = new HashMap();
        hashMap.put("url", uri2);
        C3837e.m9741a(C3835c.m9733a("ttlive_image_load_status"), 0, j, (Map<String, Object>) hashMap);
    }
}
