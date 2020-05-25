package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

final class btx implements ThreadFactory {

    /* renamed from: a */
    private final /* synthetic */ String f43887a;

    btx(String str) {
        this.f43887a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f43887a);
    }
}
