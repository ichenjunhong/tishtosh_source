package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.util.p1039a.C15509c;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.common.api.internal.ay */
public final class C15268ay {

    /* renamed from: a */
    private static final ExecutorService f39427a = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(2).mo49846a((ThreadFactory) new C15509c("GAC_Executor")).mo49847a());

    /* renamed from: a */
    public static ExecutorService m31650a() {
        return f39427a;
    }
}
