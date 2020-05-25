package com.bytedance.apm.p465a.p467b;

import com.bytedance.apm.C8936b;
import com.bytedance.apm.net.C9147b;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.a.b.a */
public final class C8914a {

    /* renamed from: a */
    public static String f24285a = "https://i.isnssdk.com/monitor/collect/c/logcollect";

    /* renamed from: a */
    public static void m17637a(String str) {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(str);
        sb.append("/monitor/collect/c/logcollect");
        f24285a = sb.toString();
    }

    /* renamed from: a */
    public static boolean m17638a(String str, String str2, String str3, List<String> list, String str4, JSONObject jSONObject) {
        try {
            C9147b bVar = new C9147b(f24285a, "UTF-8", false);
            bVar.mo16521a("aid", str);
            bVar.mo16521a("device_id", str2);
            bVar.mo16521a("os", "Android");
            bVar.mo16521a("process_name", str3);
            for (String file : list) {
                File file2 = new File(file);
                if (file2.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", str4);
                    hashMap.put("env", "params.txt");
                    bVar.mo16520a(file2.getName(), file2, hashMap);
                }
            }
            bVar.mo16522a(jSONObject);
            try {
                JSONObject jSONObject2 = new JSONObject(bVar.mo16519a());
                if (jSONObject2.optInt("errno", -1) == 200) {
                    return true;
                }
                C8936b.m17651a("apm_event_stats_alog_fail", 6, jSONObject2);
                return false;
            } catch (JSONException e) {
                C8936b.m17651a("apm_event_stats_alog_fail", 7, (JSONObject) null);
                C9220a.m18312a((Throwable) e, "apm_alog");
            }
        } catch (IOException e2) {
            C8936b.m17651a("apm_event_stats_alog_fail", 8, (JSONObject) null);
            C9220a.m18312a((Throwable) e2, "apm_alog");
            return false;
        }
    }
}
