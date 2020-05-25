package com.p683ss.android.ugc.aweme.shortvideo.cover;

import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.property.C40795l.C40796a;
import com.p683ss.android.ugc.aweme.shortvideo.cover.C42542c.C42543a;
import com.p683ss.android.vesdk.C50720o.C50740a;
import com.p683ss.android.vesdk.VEListener.C50553q;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.k */
final /* synthetic */ class C42555k implements Callable {

    /* renamed from: a */
    private final VEVideoCoverGeneratorImpl f107620a;

    /* renamed from: b */
    private final int[] f107621b;

    /* renamed from: c */
    private final int f107622c;

    /* renamed from: d */
    private final int f107623d;

    /* renamed from: e */
    private final C42543a f107624e;

    /* renamed from: f */
    private final AtomicInteger f107625f;

    /* renamed from: g */
    private final long f107626g;

    C42555k(VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl, int[] iArr, int i, int i2, C42543a aVar, AtomicInteger atomicInteger, long j) {
        this.f107620a = vEVideoCoverGeneratorImpl;
        this.f107621b = iArr;
        this.f107622c = i;
        this.f107623d = i2;
        this.f107624e = aVar;
        this.f107625f = atomicInteger;
        this.f107626g = j;
    }

    public final Object call() {
        VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = this.f107620a;
        int[] iArr = this.f107621b;
        int i = this.f107622c;
        int i2 = this.f107623d;
        C42543a aVar = this.f107624e;
        AtomicInteger atomicInteger = this.f107625f;
        long j = this.f107626g;
        C20347c cVar = vEVideoCoverGeneratorImpl.f107584d;
        C50740a aVar2 = C39629l.m88232a().mo58574e().mo83117a(C40796a.EnableVeCoverEffect) ? C50740a.GET_FRAMES_MODE_NORMAL : C50740a.GET_FRAMES_MODE_NOEFFECT;
        C42556l lVar = new C42556l(vEVideoCoverGeneratorImpl, aVar, atomicInteger, j);
        cVar.mo43009a(iArr, i, i2, aVar2, (C50553q) lVar);
        return null;
    }
}
