package com.bytedance.android.p140a.p141a.p144c;

import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.android.a.a.c.a */
public final class C2779a {

    /* renamed from: a */
    public static ExecutorService f8345a;

    /* renamed from: a */
    private static ExecutorService m7904a() {
        if (f8345a == null) {
            synchronized (C2779a.class) {
                if (f8345a == null) {
                    f8345a = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49847a());
                }
            }
        }
        return f8345a;
    }

    /* renamed from: a */
    public static void m7905a(C2781c cVar) {
        m7904a().execute(cVar);
    }
}
