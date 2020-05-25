package com.p683ss.android.common.applog.p1142a;

import android.text.TextUtils;
import com.p683ss.android.common.applog.TaskSessionDao;
import com.p683ss.android.common.applog.TeaUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.applog.a.d */
public final class C18880d {

    /* renamed from: a */
    public long f52079a;

    /* renamed from: b */
    public String f52080b;

    /* renamed from: c */
    public boolean f52081c;

    /* renamed from: d */
    public String f52082d;

    /* renamed from: e */
    public boolean f52083e;

    /* renamed from: f */
    public String f52084f;

    /* renamed from: g */
    public long f52085g;

    /* renamed from: h */
    public long f52086h;

    /* renamed from: i */
    public long f52087i;

    public C18880d() {
    }

    public final String toString() {
        return mo38688a();
    }

    /* renamed from: a */
    public final String mo38688a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("start_time", this.f52079a);
            jSONObject.put("session_id", this.f52080b);
            jSONObject.put("is_front_continuous", this.f52081c);
            jSONObject.put("front_session_id", this.f52082d);
            jSONObject.put("is_end_continuous", this.f52083e);
            jSONObject.put("end_session_id", this.f52084f);
            jSONObject.put("latest_end_time", this.f52085g);
            jSONObject.put("non_task_time", this.f52086h);
            jSONObject.put("tea_event_index", this.f52087i);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public C18880d(long j) {
        this.f52079a = j;
        this.f52080b = TaskSessionDao.genSessionId();
        this.f52087i = TaskSessionDao.genTeaEventIndex();
    }

    /* renamed from: a */
    public static C18880d m45970a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("session_id", "");
            C18880d dVar = new C18880d();
            dVar.f52080b = optString;
            dVar.f52079a = TeaUtils.optLong(jSONObject, "start_time");
            dVar.f52081c = jSONObject.optBoolean("is_front_continuous", false);
            dVar.f52082d = jSONObject.optString("front_session_id", "");
            dVar.f52083e = jSONObject.optBoolean("is_end_continuous", false);
            dVar.f52084f = jSONObject.optString("end_session_id", "");
            dVar.f52085g = TeaUtils.optLong(jSONObject, "latest_end_time");
            dVar.f52086h = TeaUtils.optLong(jSONObject, "non_task_time");
            dVar.f52087i = TeaUtils.optLong(jSONObject, "tea_event_index");
            return dVar;
        } catch (JSONException unused) {
            return null;
        }
    }
}
