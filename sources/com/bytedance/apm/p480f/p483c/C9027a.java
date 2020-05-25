package com.bytedance.apm.p480f.p483c;

import com.bytedance.apm.p496n.C9145a;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.f.c.a */
public class C9027a {

    /* renamed from: b */
    private static volatile C9027a f24626b;

    /* renamed from: a */
    public C9145a<JSONObject> f24627a = new C9145a<>(20);

    private C9027a() {
    }

    /* renamed from: a */
    public static C9027a m17890a() {
        if (f24626b == null) {
            synchronized (C9027a.class) {
                if (f24626b == null) {
                    f24626b = new C9027a();
                }
            }
        }
        return f24626b;
    }
}
