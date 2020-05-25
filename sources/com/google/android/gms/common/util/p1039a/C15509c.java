package com.google.android.gms.common.util.p1039a;

import com.google.android.gms.common.internal.C15464q;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.util.a.c */
public final class C15509c implements ThreadFactory {

    /* renamed from: a */
    private final String f39978a;

    /* renamed from: b */
    private final int f39979b;

    /* renamed from: c */
    private final AtomicInteger f39980c;

    /* renamed from: d */
    private final ThreadFactory f39981d;

    public C15509c(String str) {
        this(str, 0);
    }

    private C15509c(String str, int i) {
        this.f39980c = new AtomicInteger();
        this.f39981d = Executors.defaultThreadFactory();
        this.f39978a = (String) C15464q.m32124a(str, (Object) "Name must not be null");
        this.f39979b = 0;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f39981d.newThread(new C15510d(runnable, 0));
        String str = this.f39978a;
        int andIncrement = this.f39980c.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 13);
        sb.append(str);
        sb.append("[");
        sb.append(andIncrement);
        sb.append("]");
        newThread.setName(sb.toString());
        return newThread;
    }
}
