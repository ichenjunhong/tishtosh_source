package com.facebook.internal.p979a.p980a;

import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.internal.C14277aa;
import com.facebook.internal.p979a.C14270b;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.a.a.b */
public final class C14269b {

    /* renamed from: a */
    String f37181a;

    /* renamed from: b */
    Long f37182b;

    /* renamed from: c */
    private String f37183c;

    /* renamed from: d */
    private String f37184d;

    /* renamed from: e */
    private String f37185e;

    /* renamed from: a */
    public final boolean mo26475a() {
        if (this.f37185e == null || this.f37182b == null) {
            return false;
        }
        return true;
    }

    public final String toString() {
        JSONObject b = m29233b();
        if (b == null) {
            return null;
        }
        return b.toString();
    }

    /* renamed from: b */
    private JSONObject m29233b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            if (this.f37183c != null) {
                jSONObject.put("app_version", this.f37183c);
            }
            if (this.f37182b != null) {
                jSONObject.put("timestamp", this.f37182b);
            }
            if (this.f37184d != null) {
                jSONObject.put("reason", this.f37184d);
            }
            if (this.f37185e != null) {
                jSONObject.put("callstack", this.f37185e);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public C14269b(File file) {
        this.f37181a = file.getName();
        JSONObject a = C14270b.m29237a(this.f37181a, true);
        if (a != null) {
            this.f37183c = a.optString("app_version", null);
            this.f37184d = a.optString("reason", null);
            this.f37185e = a.optString("callstack", null);
            this.f37182b = Long.valueOf(a.optLong("timestamp", 0));
        }
    }

    public C14269b(Throwable th) {
        String str;
        this.f37183c = C14277aa.m29249a();
        if (th == null) {
            str = null;
        } else if (th.getCause() == null) {
            str = th.toString();
        } else {
            str = th.getCause().toString();
        }
        this.f37184d = str;
        this.f37185e = C14270b.m29236a(th);
        this.f37182b = Long.valueOf(System.currentTimeMillis() / 1000);
        StringBuffer stringBuffer = new StringBuffer("crash_log_");
        stringBuffer.append(this.f37182b.toString());
        stringBuffer.append(".json");
        this.f37181a = stringBuffer.toString();
    }
}
