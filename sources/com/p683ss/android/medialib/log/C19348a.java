package com.p683ss.android.medialib.log;

import android.text.TextUtils;
import com.p683ss.android.medialib.p1180b.C19226c;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.medialib.log.a */
public class C19348a {

    /* renamed from: a */
    public static IMonitor f53483a = null;

    /* renamed from: b */
    private static final String f53484b = "a";

    /* renamed from: a */
    public static boolean m47248a(IMonitor iMonitor, String str, String str2, Map map) {
        if (iMonitor == null) {
            C19226c.m46860b(f53484b, "No monitor callback, return");
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str3 : map.keySet()) {
                jSONObject.put(str3, map.get(str3));
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("service", str2);
                }
            }
            if (iMonitor != null) {
                iMonitor.monitorLog(str, jSONObject);
            }
            return true;
        } catch (JSONException unused) {
            C19226c.m46860b(f53484b, "No monitor callback, skip");
            return false;
        }
    }
}
