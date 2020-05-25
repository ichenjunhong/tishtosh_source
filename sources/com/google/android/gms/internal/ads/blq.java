package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

final class blq implements ThreadFactory {

    /* renamed from: a */
    private final /* synthetic */ String f42857a;

    blq(String str) {
        this.f42857a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f42857a);
    }
}
