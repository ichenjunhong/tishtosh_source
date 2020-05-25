package com.bytedance.android.p161c;

import android.os.SystemClock;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p723j.C11511a;
import com.p683ss.android.ugc.aweme.lancet.p1152b.C18973a;
import com.p683ss.android.ugc.aweme.p2391v.C47964c;
import java.io.File;

/* renamed from: com.bytedance.android.c.b */
final class C2844b {
    /* renamed from: a */
    static void m8132a(String str) {
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            if (C18973a.m46144a(str)) {
                C2835a.m8098a(C11010c.m22280a(), String.valueOf(C11010c.m22286g()));
                StringBuilder sb = new StringBuilder();
                C47964c.m103778e();
                sb.append(C47964c.m103775a());
                sb.append("/lib");
                sb.append(str);
                sb.append(".so");
                String sb2 = sb.toString();
                if (new File(sb2).exists()) {
                    C18973a.m46142a(str, 2);
                    System.load(sb2);
                    C18973a.m46141a(uptimeMillis, str);
                    return;
                }
                C18973a.m46142a(str, 3);
            }
        } catch (Throwable unused) {
        }
        C11511a.m23578a(str);
        C18973a.m46141a(uptimeMillis, str);
    }
}
