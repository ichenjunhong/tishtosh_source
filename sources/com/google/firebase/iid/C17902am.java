package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.firebase.iid.am */
final /* synthetic */ class C17902am implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f49746a = new C17902am();

    private C17902am() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
