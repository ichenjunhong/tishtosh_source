package com.p683ss.android.ugc.aweme.p1386ar;

import android.os.SystemClock;
import com.p683ss.android.ugc.aweme.base.C23569o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ar.f */
public final class C23265f {

    /* renamed from: a */
    public static long f62212a;

    /* renamed from: b */
    public static final C23265f f62213b = new C23265f();

    private C23265f() {
    }

    /* renamed from: a */
    public static void m57212a() {
        f62212a = SystemClock.uptimeMillis();
    }

    /* renamed from: a */
    public static void m57213a(long j, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("first_feed_duration", j);
            jSONObject.put("is_ab_test", str);
        } catch (JSONException unused) {
        }
        C23569o.m57783b("first_feed_duration", "", jSONObject);
    }
}
