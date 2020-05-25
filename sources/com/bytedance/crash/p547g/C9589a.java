package com.bytedance.crash.p547g;

import android.os.Build;
import com.bytedance.crash.p555n.C9713t;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.g.a */
public final class C9589a implements Serializable {

    /* renamed from: a */
    String f26159a = "crash";
    public String aid;
    public String appVersion;

    /* renamed from: b */
    String f26160b;

    /* renamed from: c */
    String f26161c = "Android";
    public String crashSummary;
    public long crashTime;
    public String crashType;

    /* renamed from: d */
    String f26162d;
    public String deviceId;

    /* renamed from: e */
    String f26163e = Build.MODEL;
    public String event;
    public long eventTime;

    /* renamed from: f */
    String f26164f;

    /* renamed from: g */
    String f26165g;

    /* renamed from: h */
    String f26166h;
    public String sdkVersion;
    public int state;
    public String updateVersionCode;

    public final long getCrashTime() {
        return this.crashTime;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.crashType);
        sb.append("\t");
        sb.append(this.crashTime);
        sb.append("\t");
        sb.append(this.event);
        sb.append("\t");
        sb.append(this.state);
        sb.append("\t");
        sb.append(this.crashSummary);
        return sb.toString();
    }

    public final C9589a clone() {
        C9589a aVar = new C9589a();
        aVar.crashTime = this.crashTime;
        aVar.eventTime = this.eventTime;
        aVar.event = this.event;
        aVar.f26159a = this.f26159a;
        aVar.crashSummary = this.crashSummary;
        aVar.crashType = this.crashType;
        aVar.state = this.state;
        aVar.f26160b = this.f26160b;
        aVar.f26161c = this.f26161c;
        aVar.f26162d = this.f26162d;
        aVar.f26163e = this.f26163e;
        aVar.appVersion = this.appVersion;
        aVar.updateVersionCode = this.updateVersionCode;
        aVar.sdkVersion = this.sdkVersion;
        aVar.f26164f = this.f26164f;
        aVar.f26165g = this.f26165g;
        aVar.aid = this.aid;
        aVar.deviceId = this.deviceId;
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final JSONObject mo17416a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("crash_time", this.crashTime);
            jSONObject.put("event_time", this.eventTime);
            jSONObject.put("event", this.event);
            jSONObject.put("event_type", this.f26159a);
            jSONObject.put("crash_summary", this.crashSummary);
            jSONObject.put("crash_type", this.crashType);
            jSONObject.put("state", this.state);
            jSONObject.put("error_info", this.f26160b);
            jSONObject.put("os", this.f26161c);
            jSONObject.put("os_version", this.f26162d);
            jSONObject.put("device_model", this.f26163e);
            jSONObject.put("app_version", this.appVersion);
            jSONObject.put("update_version_code", this.updateVersionCode);
            jSONObject.put("sdk_version", this.sdkVersion);
            jSONObject.put("mcc_mnc", this.f26164f);
            jSONObject.put("access", this.f26165g);
            jSONObject.put("aid", this.aid);
            jSONObject.put("device_id", this.deviceId);
            jSONObject.put("uuid", this.f26166h);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public final C9589a crashTime(long j) {
        this.crashTime = j;
        return this;
    }

    public final C9589a errorInfo(String str) {
        this.f26160b = str;
        return this;
    }

    public final C9589a eventType(String str) {
        this.event = str;
        return this;
    }

    public final C9589a state(int i) {
        this.state = i;
        return this;
    }

    public final C9589a errorInfo(Throwable th) {
        if (th != null) {
            this.f26160b = C9713t.m19435a(th);
        }
        return this;
    }

    public final C9589a errorInfo(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f26160b = jSONObject.toString();
        }
        return this;
    }
}
