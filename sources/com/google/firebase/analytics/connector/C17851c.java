package com.google.firebase.analytics.connector;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.analytics.connector.c */
final /* synthetic */ class C17851c implements Executor {

    /* renamed from: a */
    static final Executor f49615a = new C17851c();

    private C17851c() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
