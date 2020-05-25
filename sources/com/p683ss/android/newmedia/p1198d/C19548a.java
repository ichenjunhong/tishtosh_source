package com.p683ss.android.newmedia.p1198d;

import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.p661d.p662a.C10627a;
import com.bytedance.ies.p661d.p662a.C10627a.C10628a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.newmedia.d.a */
public abstract class C19548a extends C10627a {
    protected C19548a() {
        this((String) null, C10628a.NORMAL);
    }

    protected C19548a(C10628a aVar) {
        this((String) null, aVar);
    }

    protected C19548a(String str) {
        this(str, C10628a.NORMAL);
    }

    public static boolean isApiSuccess(String str) {
        if (C9431p.m18664a(str)) {
            return false;
        }
        try {
            return isApiSuccess(new JSONObject(str));
        } catch (JSONException unused) {
            return false;
        }
    }

    public static boolean isApiSuccess(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null || !"success".equals(jSONObject.optString("message"))) {
            return false;
        }
        return true;
    }

    protected C19548a(boolean z) {
        C10628a aVar;
        if (z) {
            aVar = C10628a.LOW;
        } else {
            aVar = C10628a.NORMAL;
        }
        this((String) null, aVar);
    }

    protected C19548a(String str, C10628a aVar) {
        super(str, aVar);
    }

    public static boolean getHasMore(JSONObject jSONObject, boolean z) {
        return optBoolean(jSONObject, "has_more", z);
    }

    protected C19548a(String str, boolean z) {
        C10628a aVar;
        if (z) {
            aVar = C10628a.LOW;
        } else {
            aVar = C10628a.NORMAL;
        }
        this(str, aVar);
    }

    public static boolean optBoolean(JSONObject jSONObject, String str, boolean z) {
        if (jSONObject == null || jSONObject.isNull(str)) {
            return z;
        }
        int optInt = jSONObject.optInt(str, -1);
        if (optInt > 0) {
            return true;
        }
        if (optInt == 0) {
            return false;
        }
        return jSONObject.optBoolean(str, z);
    }
}
