package com.p683ss.android.ugc.aweme.shortvideo.cover;

import android.graphics.Bitmap;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42542c.C42543a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.m */
final /* synthetic */ class C42557m implements Callable {

    /* renamed from: a */
    private final VEVideoCoverGeneratorImpl f107631a;

    /* renamed from: b */
    private final C42543a f107632b;

    /* renamed from: c */
    private final AtomicInteger f107633c;

    /* renamed from: d */
    private final Bitmap f107634d;

    /* renamed from: e */
    private final long f107635e;

    C42557m(VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl, C42543a aVar, AtomicInteger atomicInteger, Bitmap bitmap, long j) {
        this.f107631a = vEVideoCoverGeneratorImpl;
        this.f107632b = aVar;
        this.f107633c = atomicInteger;
        this.f107634d = bitmap;
        this.f107635e = j;
    }

    public final Object call() {
        VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.f107631a;
        C42543a aVar = this.f107632b;
        AtomicInteger atomicInteger = this.f107633c;
        Bitmap bitmap = this.f107634d;
        long j = this.f107635e;
        aVar.mo86764a(atomicInteger.get(), bitmap);
        atomicInteger.incrementAndGet();
        vEVideoCoverGeneratorImpl.f107585e.add(Long.valueOf(System.currentTimeMillis() - j));
        return null;
    }
}
