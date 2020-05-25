package com.p683ss.android.ugc.aweme.profile.api;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.api.b */
final /* synthetic */ class C39789b implements Callable {

    /* renamed from: a */
    private final String f101559a;

    /* renamed from: b */
    private final String f101560b;

    /* renamed from: c */
    private final int f101561c;

    /* renamed from: d */
    private final int f101562d;

    C39789b(String str, String str2, int i, int i2) {
        this.f101559a = str;
        this.f101560b = str2;
        this.f101561c = i;
        this.f101562d = i2;
    }

    public final Object call() {
        return BlockApi.m88496a(this.f101559a, this.f101560b, this.f101561c, this.f101562d);
    }
}
