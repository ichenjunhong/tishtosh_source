package com.bytedance.p558e;

import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.e.k */
public final class C9750k {

    /* renamed from: a */
    public static ScheduledExecutorService f26542a = ((ScheduledExecutorService) C24076h.m58898a(C24085m.m58928a(C24093p.SCHEDULED).mo49844a(1).mo49847a()));

    /* renamed from: a */
    public static Future m19524a(Runnable runnable, long j, long j2) {
        return f26542a.scheduleWithFixedDelay(runnable, j, 3600000, TimeUnit.MILLISECONDS);
    }
}
