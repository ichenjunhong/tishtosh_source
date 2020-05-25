package com.bytedance.android.live.broadcast.p202d;

import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.livesdk.p399o.C8069h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.broadcast.d.a */
public final class C3161a {

    /* renamed from: a */
    public static long f9195a;

    /* renamed from: b */
    private static boolean f9196b;

    /* renamed from: com.bytedance.android.live.broadcast.d.a$a */
    public enum C3162a {
        API("api"),
        LIVE_SDK("livesdk"),
        AGORA("agora");
        
        public final String value;

        private C3162a(String str) {
            this.value = str;
        }
    }

    /* renamed from: a */
    private static long m8754a() {
        long j;
        if (f9195a > 0) {
            j = System.currentTimeMillis() - f9195a;
        } else {
            j = 0;
        }
        f9195a = 0;
        return j;
    }

    /* renamed from: b */
    public static void m8759b(boolean z) {
        f9196b = z;
    }

    /* renamed from: a */
    public static void m8757a(boolean z) {
        String str;
        String str2;
        long a = m8754a();
        C8069h a2 = new C8069h().mo14224a("duration", (float) a).mo14225a("errorDomain", (Object) C3162a.API.value);
        String str3 = "mediaType";
        if (z) {
            str = "audio";
        } else {
            str = "video";
        }
        a2.mo14225a(str3, (Object) str).mo14228a("hotsoon_live_start_live_failure_rate", 0);
        JSONObject jSONObject = new JSONObject();
        String str4 = "media_type";
        if (z) {
            str2 = "audio";
        } else {
            str2 = "video";
        }
        C3163b.m9731a(jSONObject, str4, str2);
        C3837e.m9742a("ttlive_create_room_all", 0, a, jSONObject);
    }

    /* renamed from: a */
    public static void m8755a(Exception exc, boolean z) {
        m8754a();
        if (exc instanceof C2949a) {
            C2949a aVar = (C2949a) exc;
            m8756a(C3162a.API.value, aVar.getErrorCode(), aVar.getErrorMsg(), z);
            return;
        }
        m8756a(C3162a.API.value, -1, exc.toString(), z);
    }

    /* renamed from: a */
    public static void m8758a(boolean z, int i, String str) {
        new C8069h().mo14225a("errorCode", (Object) Integer.valueOf(i)).mo14225a("errorDesc", (Object) str).mo14228a("hotsoon_live_anchor_close_room", z ^ true ? 1 : 0);
    }

    /* renamed from: a */
    private static void m8756a(String str, int i, String str2, boolean z) {
        String str3;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errorDomain", str);
            jSONObject.put("errorCode", i);
            jSONObject.put("errorDesc", str2);
            String str4 = "mediaType";
            if (z) {
                str3 = "audio";
            } else {
                str3 = "video";
            }
            jSONObject.put(str4, str3);
            new C8069h().mo14226a(jSONObject).mo14228a("hotsoon_live_start_live_failure_rate", 1);
            C3163b.m8760a(i, str2, z);
        } catch (JSONException unused) {
        }
    }
}
