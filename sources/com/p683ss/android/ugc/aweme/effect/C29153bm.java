package com.p683ss.android.ugc.aweme.effect;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.effect.bm */
final /* synthetic */ class C29153bm implements Callable {

    /* renamed from: a */
    private final C29152bl f76404a;

    C29153bm(C29152bl blVar) {
        this.f76404a = blVar;
    }

    public final Object call() {
        C29152bl blVar = this.f76404a;
        blVar.f76402b = blVar.f76401a.mo43083q() == 0;
        return Boolean.valueOf(blVar.f76402b);
    }
}
