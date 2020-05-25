package com.p683ss.android.ugc.aweme.shortvideo.cover;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42542c.C42543a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.p683ss.android.vesdk.VEListener.C50553q;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.l */
final /* synthetic */ class C42556l implements C50553q {

    /* renamed from: a */
    private final VEVideoCoverGeneratorImpl f107627a;

    /* renamed from: b */
    private final C42543a f107628b;

    /* renamed from: c */
    private final AtomicInteger f107629c;

    /* renamed from: d */
    private final long f107630d;

    C42556l(VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl, C42543a aVar, AtomicInteger atomicInteger, long j) {
        this.f107627a = vEVideoCoverGeneratorImpl;
        this.f107628b = aVar;
        this.f107629c = atomicInteger;
        this.f107630d = j;
    }

    /* renamed from: a */
    public final int mo86779a(byte[] bArr, int i, int i2, int i3, float f) {
        VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.f107627a;
        C42543a aVar = this.f107628b;
        AtomicInteger atomicInteger = this.f107629c;
        long j = this.f107630d;
        if (bArr != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
            C42557m mVar = new C42557m(vEVideoCoverGeneratorImpl, aVar, atomicInteger, createBitmap, j);
            C0013i.m18a((Callable<TResult>) mVar, C0013i.f25b);
        } else {
            vEVideoCoverGeneratorImpl.f107584d.mo43092v();
            if (atomicInteger.get() != vEVideoCoverGeneratorImpl.f107582b) {
                StringBuilder sb = new StringBuilder("VEVideoCoverGeneratorImpl:取到的封面张数不符合预期，预期");
                sb.append(vEVideoCoverGeneratorImpl.f107582b);
                sb.append("张，实际");
                sb.append(atomicInteger.get());
                sb.append("张");
                C50203g.m108361b(sb.toString());
            }
        }
        return 0;
    }
}
