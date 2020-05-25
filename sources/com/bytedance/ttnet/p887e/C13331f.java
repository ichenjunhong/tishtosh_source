package com.bytedance.ttnet.p887e;

import com.bytedance.frameworks.baselib.network.http.p574e.C9915j;
import com.bytedance.ttnet.C13257a;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.e.f */
public final class C13331f {

    /* renamed from: a */
    public static C13332a f34790a = null;

    /* renamed from: b */
    public static volatile boolean f34791b = true;

    /* renamed from: com.bytedance.ttnet.e.f$a */
    public interface C13332a {
        /* renamed from: a */
        void mo19933a(String str, String str2, int i, boolean z, JSONObject jSONObject);
    }

    /* renamed from: a */
    public static void m26854a(C13332a aVar) {
        f34790a = aVar;
    }

    /* renamed from: a */
    public static String m26853a(String str) {
        if (!f34791b) {
            return null;
        }
        try {
            if (C9915j.m19868a(str).getHost().endsWith(C13257a.m26659b())) {
                return String.valueOf(System.currentTimeMillis());
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
