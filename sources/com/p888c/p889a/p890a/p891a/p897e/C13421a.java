package com.p888c.p889a.p890a.p891a.p897e;

import android.os.Build;
import android.os.Build.VERSION;
import org.json.JSONObject;

/* renamed from: com.c.a.a.a.e.a */
public final class C13421a {
    /* renamed from: a */
    public static JSONObject m27056a() {
        JSONObject jSONObject = new JSONObject();
        StringBuilder sb = new StringBuilder();
        sb.append(Build.MANUFACTURER);
        sb.append("; ");
        sb.append(Build.MODEL);
        C13422b.m27062a(jSONObject, "deviceType", sb.toString());
        C13422b.m27062a(jSONObject, "osVersion", Integer.toString(VERSION.SDK_INT));
        C13422b.m27062a(jSONObject, "os", "Android");
        return jSONObject;
    }
}
