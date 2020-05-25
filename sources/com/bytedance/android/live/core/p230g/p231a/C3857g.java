package com.bytedance.android.live.core.p230g.p231a;

import android.content.Context;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.bytedance.android.live.core.g.a.g */
final class C3857g {
    /* renamed from: a */
    static ExecutorService m9783a(int i, ThreadFactory threadFactory) {
        return C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(1).mo49846a(threadFactory).mo49847a());
    }

    /* renamed from: a */
    static boolean m9784a(Context context) {
        try {
            return C23718g.m58207b().mo49153d();
        } catch (Exception unused) {
            return false;
        }
    }
}
