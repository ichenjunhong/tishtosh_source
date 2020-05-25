package com.p683ss.android.common.p1146d;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.C9431p;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.applog.TeaThread;
import java.util.Iterator;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.d.a */
public final class C18894a {
    /* renamed from: a */
    public static void m46006a(String str, JSONObject jSONObject) {
        C18897b.m46008a(str, jSONObject);
    }

    /* renamed from: a */
    private static JSONObject m46004a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        Iterator keys = jSONObject.keys();
        if (keys == null) {
            return null;
        }
        while (keys.hasNext()) {
            linkedList.add(keys.next());
        }
        try {
            return new JSONObject(jSONObject, (String[]) linkedList.toArray(new String[0]));
        } catch (Exception unused) {
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static void m46005a(final String str, final Bundle bundle) {
        final long currentTimeMillis = System.currentTimeMillis();
        TeaThread.getInst().ensureTeaThreadLite(new Runnable() {
            public final void run() {
                if (!C9431p.m18664a(str)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("_event_v3", 1);
                        jSONObject.put("event_v3_reserved_field_time_stamp", currentTimeMillis);
                        if (bundle != null) {
                            for (String str : bundle.keySet()) {
                                jSONObject.put(str, bundle.get(str));
                            }
                        }
                        String abSDKVersion = AppLog.getAbSDKVersion();
                        if (!TextUtils.isEmpty(abSDKVersion)) {
                            jSONObject.put("ab_sdk_version", abSDKVersion);
                        }
                    } catch (Throwable unused) {
                    }
                    AppLog.onEvent((Context) null, "event_v3", str, (String) null, 0, 0, jSONObject);
                }
            }
        });
    }

    /* renamed from: b */
    public static void m46007b(final String str, JSONObject jSONObject) {
        final JSONObject a = m46004a(jSONObject);
        final long currentTimeMillis = System.currentTimeMillis();
        TeaThread.getInst().ensureTeaThreadLite(new Runnable() {
            public final void run() {
                if (!C9431p.m18664a(str)) {
                    JSONObject jSONObject = a;
                    if (jSONObject == null) {
                        jSONObject = new JSONObject();
                    }
                    JSONObject jSONObject2 = jSONObject;
                    try {
                        jSONObject2.put("_event_v3", 1);
                        jSONObject2.put("event_v3_reserved_field_time_stamp", currentTimeMillis);
                        String abSDKVersion = AppLog.getAbSDKVersion();
                        if (!TextUtils.isEmpty(abSDKVersion)) {
                            jSONObject2.put("ab_sdk_version", abSDKVersion);
                        }
                    } catch (JSONException unused) {
                    }
                    AppLog.onEvent((Context) null, "event_v3", str, (String) null, 0, 0, jSONObject2);
                }
            }
        });
    }
}
