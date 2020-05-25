package com.bytedance.android.livesdk.message;

import android.text.TextUtils;
import com.bytedance.android.live.core.p225d.C3836d;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.message.d */
public final class C7790d {

    /* renamed from: a */
    private static final Map<String, Object> f21413a = new HashMap();

    /* renamed from: a */
    private static void m15850a(String str, Map<String, Object> map) {
        map.put("event_name", str.toUpperCase());
        C8064d.m16005b().mo9201c("ttlive_msg", map);
    }

    /* renamed from: a */
    public static void m15848a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("error_code", "0");
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("stack_trace", str2);
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("error_msg", str);
        }
        C3837e.m9743a(C3836d.m9735b("ttlive_fetch_message"), 1, (Map<String, Object>) hashMap);
        m15850a(C3836d.m9735b("ttlive_fetch_message"), (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m15851a(Throwable th, String str) {
        HashMap hashMap = new HashMap();
        StringWriter stringWriter = new StringWriter();
        C17840a.m43751a(th, new PrintWriter(stringWriter));
        hashMap.put("error_code", "1");
        hashMap.put("method_name", str);
        hashMap.put("error_msg", th.getMessage());
        hashMap.put("stack_trace", stringWriter.toString());
        C3837e.m9743a(C3836d.m9735b("ttlive_fetch_message"), 1, (Map<String, Object>) hashMap);
        m15850a(C3836d.m9735b("ttlive_fetch_message"), (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    public static void m15849a(String str, String str2, long j) {
        f21413a.put("event_name", str);
        f21413a.put("method", str2);
        f21413a.put("msg_id", Long.valueOf(j));
        C8064d.m16005b().mo9199b("ttlive_msg", f21413a);
    }
}
