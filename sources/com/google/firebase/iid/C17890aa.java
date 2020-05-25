package com.google.firebase.iid;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.iid.aa */
public final class C17890aa {

    /* renamed from: b */
    private static final long f49714b = TimeUnit.DAYS.toMillis(7);

    /* renamed from: a */
    public final String f49715a;

    /* renamed from: c */
    private final String f49716c;

    /* renamed from: d */
    private final long f49717d;

    private C17890aa(String str, String str2, long j) {
        this.f49715a = str;
        this.f49716c = str2;
        this.f49717d = j;
    }

    /* renamed from: a */
    static C17890aa m43865a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new C17890aa(str, null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new C17890aa(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static String m43867a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static String m43866a(C17890aa aaVar) {
        if (aaVar == null) {
            return null;
        }
        return aaVar.f49715a;
    }

    /* renamed from: b */
    public final boolean mo34729b(String str) {
        return System.currentTimeMillis() > this.f49717d + f49714b || !str.equals(this.f49716c);
    }
}
