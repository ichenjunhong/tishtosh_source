package com.p683ss.android.ugc.aweme.livewallpaper.egl;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.m */
public final class C36227m implements C36220g {

    /* renamed from: a */
    private AtomicInteger f92738a;

    public C36227m() {
        this(0);
    }

    /* renamed from: a */
    public final int mo74989a() {
        return this.f92738a.getAndIncrement();
    }

    /* renamed from: b */
    public final int mo74990b() {
        return this.f92738a.getAndDecrement();
    }

    public C36227m(int i) {
        this.f92738a = new AtomicInteger(0);
    }
}
