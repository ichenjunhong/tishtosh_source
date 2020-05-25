package com.p683ss.android.ugc.aweme.tools;

import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.ExecutorService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.a */
public final class C46797a {

    /* renamed from: a */
    public static final C46797a f118260a = new C46797a();

    /* renamed from: b */
    private static final ExecutorService f118261b;

    private C46797a() {
    }

    /* renamed from: a */
    public static ExecutorService m101642a() {
        return f118261b;
    }

    static {
        ExecutorService a = C24076h.m58898a(C24085m.m58928a(C24093p.SERIAL).mo49845a("draft-executor").mo49847a());
        C52711k.m112236a((Object) a, "ThreadPoolHelper.createE…                .build())");
        f118261b = a;
    }
}
