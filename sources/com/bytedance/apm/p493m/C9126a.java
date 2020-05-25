package com.bytedance.apm.p493m;

import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.net.C9147b;
import com.bytedance.services.apm.api.C13222e;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.m.a */
public final class C9126a {

    /* renamed from: a */
    public static String f24988a = "https://i.isnssdk.com/monitor/collect/c/logcollect";

    /* renamed from: a */
    public static void m18106a(String str) {
        StringBuilder sb = new StringBuilder("https://");
        sb.append(str);
        sb.append("/monitor/collect/c/logcollect");
        f24988a = sb.toString();
    }

    /* renamed from: a */
    public final void mo16491a(String str, String str2, String str3, List<String> list, String str4, JSONObject jSONObject, C13222e eVar) {
        ApmDelegate a = ApmDelegate.m17947a();
        final String str5 = str;
        final String str6 = str2;
        final String str7 = str3;
        final List<String> list2 = list;
        final String str8 = str4;
        final JSONObject jSONObject2 = jSONObject;
        final C13222e eVar2 = eVar;
        C91271 r1 = new Runnable() {
            public final void run() {
                String str = str5;
                String str2 = str6;
                String str3 = str7;
                List<String> list = list2;
                String str4 = str8;
                JSONObject jSONObject = jSONObject2;
                C13222e eVar = eVar2;
                try {
                    C9147b bVar = new C9147b(C9126a.f24988a, "UTF-8", false);
                    bVar.mo16521a("aid", str);
                    bVar.mo16521a("device_id", str2);
                    bVar.mo16521a("os", "Android");
                    bVar.mo16521a("process_name", "main");
                    for (String file : list) {
                        File file2 = new File(file);
                        if (file2.exists()) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("logtype", str3);
                            hashMap.put("scene", str4);
                            hashMap.put("env", "params.txt");
                            bVar.mo16520a(file2.getName(), file2, hashMap);
                        }
                    }
                    bVar.mo16522a(jSONObject);
                    String a = bVar.mo16519a();
                    int i = -1;
                    try {
                        i = new JSONObject(a).optInt("errno", -1);
                    } catch (JSONException unused) {
                    }
                    if (eVar != null) {
                        if (i == 200) {
                            eVar.mo24809a();
                            return;
                        }
                        eVar.mo24810a(a);
                    }
                } catch (IOException e) {
                    if (eVar != null) {
                        eVar.mo24810a(e.getMessage());
                    }
                }
            }
        };
        a.mo16430a((Runnable) r1);
    }
}
