package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.al */
final class C17901al {

    /* renamed from: a */
    private static final Executor f49745a = C17903an.f49747a;

    /* renamed from: a */
    static Executor m43884a() {
        return f49745a;
    }

    /* renamed from: b */
    static Executor m43885b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), C17902am.f49746a);
        return threadPoolExecutor;
    }
}
