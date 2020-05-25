package com.bytedance.android.livesdk.feed;

import android.os.SystemClock;
import com.bytedance.android.live.core.p225d.C3833a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.p180b.p181a.C2944a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.feed.t */
public final class C7106t extends C3833a {

    /* renamed from: a */
    public long f19317a;

    /* renamed from: b */
    private long f19318b;

    /* renamed from: a */
    public final void mo13233a() {
        this.f19318b = SystemClock.uptimeMillis();
    }

    /* renamed from: c */
    private long m14778c() {
        long j;
        if (this.f19318b > 0) {
            j = SystemClock.uptimeMillis() - this.f19318b;
        } else {
            j = 0;
        }
        this.f19318b = 0;
        return j;
    }

    /* renamed from: b */
    public final long mo13236b() {
        long j;
        if (this.f19317a > 0) {
            j = SystemClock.uptimeMillis() - this.f19317a;
        } else {
            j = 0;
        }
        this.f19317a = 0;
        return j;
    }

    /* renamed from: a */
    public static void m14777a(float f) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("feed_fps", (double) f);
        } catch (JSONException unused) {
        }
        C3837e.m9749b("ttlive_feed_list_fps_all", 0, jSONObject);
    }

    /* renamed from: a */
    public final void mo13234a(String str) {
        long c = m14778c();
        JSONObject jSONObject = new JSONObject();
        m9731a(jSONObject, "request_type", str);
        C3837e.m9742a("ttlive_request_feed_api_all", 0, c, jSONObject);
    }

    /* renamed from: a */
    public final void mo13235a(String str, Throwable th) {
        int i;
        String str2;
        m14778c();
        JSONObject jSONObject = new JSONObject();
        if (th instanceof C2944a) {
            i = ((C2944a) th).getErrorCode();
        } else {
            i = 0;
        }
        if (th != null) {
            str2 = th.getMessage();
        } else {
            str2 = "";
        }
        m9730a(jSONObject, "error_code", (long) i);
        m9731a(jSONObject, "error_msg", str2);
        m9731a(jSONObject, "request_type", str);
        C3837e.m9749b("ttlive_request_feed_api_all", 1, jSONObject);
        C3837e.m9744a("ttlive_request_feed_api_error", 1, jSONObject);
    }
}
