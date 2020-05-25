package com.p683ss.android.ugc.aweme.feed.cache;

import java.util.concurrent.locks.Lock;

/* renamed from: com.ss.android.ugc.aweme.feed.cache.a */
public final class C30162a {
    /* renamed from: a */
    public static boolean m70768a(Lock lock) {
        if (lock != null) {
            return lock.tryLock();
        }
        return false;
    }
}
