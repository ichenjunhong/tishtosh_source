package com.p683ss.android.ugc.aweme.lancet.p1151a;

import androidx.work.C1532b.C1533a;
import androidx.work.C1658j;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;

/* renamed from: com.ss.android.ugc.aweme.lancet.a.c */
public class C18971c {

    /* renamed from: a */
    private static boolean f52272a;

    /* renamed from: a */
    public static void m46140a() {
        synchronized (C18971c.class) {
            if (!f52272a) {
                try {
                    C1658j.m5774a(AwemeApplication.m56199a(), new C1533a().mo5911a());
                    f52272a = true;
                } catch (Exception e) {
                    C9220a.m18311a((Throwable) e);
                }
            }
        }
    }
}
