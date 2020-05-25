package com.p683ss.android.common.p1146d;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.common.applog.AppLog;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.d.c */
public final class C18898c {

    /* renamed from: a */
    private static C18899a f52107a;

    /* renamed from: com.ss.android.common.d.c$a */
    public interface C18899a {
    }

    /* renamed from: a */
    public static void m46009a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str) && context != null) {
            AppLog.onEvent(context, str, str2);
            if (f52107a != null) {
                TextUtils.isEmpty(str2);
            }
        }
    }

    /* renamed from: a */
    public static void m46010a(Context context, String str, String str2, long j, long j2) {
        m46012a(context, "umeng", str, str2, j, j2, null);
    }

    /* renamed from: a */
    public static void m46011a(Context context, String str, String str2, long j, long j2, JSONObject jSONObject) {
        m46012a(context, "umeng", str, str2, j, j2, jSONObject);
    }

    /* renamed from: a */
    public static void m46012a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        String str4;
        if (!TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str)) {
                str4 = "umeng";
            } else {
                str4 = str;
            }
            if (context != null) {
                AppLog.onEvent(context, str4, str2, str3, j, j2, jSONObject);
                if ("umeng".equals(str4) && f52107a != null && "umeng".equals(str4)) {
                    TextUtils.isEmpty(str3);
                }
            }
        }
    }
}
