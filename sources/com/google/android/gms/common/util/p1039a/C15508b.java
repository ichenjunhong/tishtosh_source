package com.google.android.gms.common.util.p1039a;

import com.google.android.gms.common.internal.C15464q;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.common.util.a.b */
public final class C15508b implements ThreadFactory {

    /* renamed from: a */
    private final String f39975a;

    /* renamed from: b */
    private final int f39976b;

    /* renamed from: c */
    private final ThreadFactory f39977c;

    public C15508b(String str) {
        this(str, 0);
    }

    private C15508b(String str, int i) {
        this.f39977c = Executors.defaultThreadFactory();
        this.f39975a = (String) C15464q.m32124a(str, (Object) "Name must not be null");
        this.f39976b = 0;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f39977c.newThread(new C15510d(runnable, 0));
        newThread.setName(this.f39975a);
        return newThread;
    }
}
