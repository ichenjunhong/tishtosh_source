package com.p683ss.android.ugc.aweme.feed.p1729l;

import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.l.a */
public final class C30466a {

    /* renamed from: a */
    public static final C30466a f79605a = new C30466a();

    /* renamed from: b */
    private static ExecutorService f79606b;

    /* renamed from: c */
    private static ReentrantLock f79607c = new ReentrantLock();

    private C30466a() {
    }

    /* renamed from: a */
    public static ExecutorService m71397a() {
        if (f79606b == null) {
            f79607c.lock();
            try {
                if (f79606b == null) {
                    f79606b = C24076h.m58898a(C24085m.m58928a(C24093p.SERIAL).mo49847a());
                }
            } finally {
                f79607c.unlock();
            }
        }
        ExecutorService executorService = f79606b;
        if (executorService == null) {
            C52711k.m112234a();
        }
        return executorService;
    }
}
