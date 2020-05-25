package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

final /* synthetic */ class aft implements Runnable {

    /* renamed from: a */
    private final agl f40409a;

    aft(agl agl) {
        this.f40409a = agl;
    }

    public final void run() {
        this.f40409a.mo28822a(new TimeoutException());
    }
}
