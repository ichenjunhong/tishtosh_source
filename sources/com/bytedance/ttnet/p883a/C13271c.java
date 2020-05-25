package com.bytedance.ttnet.p883a;

import android.text.TextUtils;
import com.bytedance.common.utility.p526f.C9409b;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9874c;
import com.bytedance.ttnet.C13303d;

/* renamed from: com.bytedance.ttnet.a.c */
public class C13271c {

    /* renamed from: a */
    public static String f34599a = "";

    /* renamed from: b */
    private static volatile C13271c f34600b;

    /* renamed from: a */
    public static C13271c m26708a() {
        if (f34600b == null) {
            synchronized (C13271c.class) {
                if (f34600b == null) {
                    f34600b = new C13271c();
                }
            }
        }
        return f34600b;
    }

    private C13271c() {
        try {
            C9874c.m19754a(C13303d.m26799b().mo24896a());
            C9874c.m19760a();
            String str = (String) C9409b.m18609a((Object) C9874c.f26872b).mo17054b("getCronetVersion").f25654a;
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(" ");
                if (split.length == 4) {
                    String str2 = split[0];
                    String str3 = split[1];
                    String[] split2 = str2.split(":");
                    if (split2.length == 2) {
                        String str4 = split2[1];
                        StringBuilder sb = new StringBuilder();
                        sb.append(str4);
                        sb.append("_");
                        sb.append(str3);
                        f34599a = sb.toString();
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }
}
