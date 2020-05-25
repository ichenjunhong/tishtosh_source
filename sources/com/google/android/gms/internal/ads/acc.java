package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class acc implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f40243a = new AtomicInteger(1);

    /* renamed from: b */
    private final /* synthetic */ String f40244b;

    acc(String str) {
        this.f40244b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f40244b;
        int andIncrement = this.f40243a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
