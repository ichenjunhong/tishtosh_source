package com.p683ss.android.ugc.aweme.feed.p1730m;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

/* renamed from: com.ss.android.ugc.aweme.feed.m.g */
final /* synthetic */ class C30484g implements Callable {

    /* renamed from: a */
    private final C30480d f79680a;

    /* renamed from: b */
    private final int f79681b;

    /* renamed from: c */
    private final Lock f79682c;

    C30484g(C30480d dVar, int i, Lock lock) {
        this.f79680a = dVar;
        this.f79681b = i;
        this.f79682c = lock;
    }

    public final Object call() {
        return this.f79680a.mo60903a(this.f79681b, this.f79682c);
    }
}
