package com.p683ss.android.ugc.aweme.p1807im;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.aweme.im.q */
public final class C33211q {

    /* renamed from: a */
    private static ReentrantLock f86207a = new ReentrantLock();

    /* renamed from: a */
    public static void m76311a() {
        f86207a.lock();
    }

    /* renamed from: b */
    public static void m76312b() {
        f86207a.unlock();
    }
}
