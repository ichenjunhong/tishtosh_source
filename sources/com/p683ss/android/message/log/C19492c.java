package com.p683ss.android.message.log;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.p523c.C9393e;
import org.json.JSONObject;

/* renamed from: com.ss.android.message.log.c */
public final class C19492c {
    /* renamed from: a */
    public static void m47726a(String str, Bundle bundle) {
        if (!C9431p.m18664a(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                for (String str2 : bundle.keySet()) {
                    jSONObject.put(str2, bundle.get(str2));
                }
            } catch (Throwable unused) {
            }
            m47724a(null, "event_v3", str, null, 0, 0, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m47725a(Context context, String str, String str2, JSONObject... jSONObjectArr) {
        JSONObject[] jSONObjectArr2 = jSONObjectArr;
        if (jSONObjectArr2.length > 0) {
            m47724a(context, "umeng", str, str2, 0, 0, jSONObjectArr2[0]);
            return;
        }
        m47724a(context, "umeng", str, str2, 0, 0, null);
    }

    /* renamed from: a */
    public static void m47723a(Context context, String str, String str2, String str3, long j, long j2) {
        m47724a(context, str, str2, str3, j, j2, null);
    }

    /* renamed from: a */
    public static void m47724a(Context context, String str, String str2, String str3, long j, long j2, JSONObject jSONObject) {
        if (!C9431p.m18664a(str) && !C9431p.m18664a(str2)) {
            final String str4 = str;
            final String str5 = str2;
            final String str6 = str3;
            final long j3 = j;
            final long j4 = j2;
            final JSONObject jSONObject2 = jSONObject;
            final Context context2 = context;
            C194931 r1 = new C9393e() {
                public final void run() {
                    try {
                        C19491b bVar = new C19491b();
                        bVar.f53825a = str4;
                        bVar.f53826b = str5;
                        bVar.f53827c = str6;
                        bVar.f53828d = j3;
                        bVar.f53829e = j4;
                        if (jSONObject2 != null) {
                            bVar.f53830f = jSONObject2.toString();
                        }
                        C19489a a = C19489a.m47716a(context2);
                        if (a != null) {
                            a.mo40635a(bVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
            };
            r1.start();
        }
    }
}
