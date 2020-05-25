package com.p683ss.android.ugc.aweme.video.local;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.video.local.d */
final /* synthetic */ class C48060d implements Callable {

    /* renamed from: a */
    private final String f120774a;

    /* renamed from: b */
    private final String f120775b;

    C48060d(String str, String str2) {
        this.f120774a = str;
        this.f120775b = str2;
    }

    public final Object call() {
        return LocalVideoPlayerManager.m104049a(this.f120774a, this.f120775b);
    }
}
