package com.p683ss.android.ugc.aweme.shortvideo.cut.gif.p2180a;

import com.p683ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener;
import com.p683ss.android.vesdk.C50720o;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.a.e */
final /* synthetic */ class C42640e implements Callable {

    /* renamed from: a */
    private final ConvertListener f107877a;

    /* renamed from: b */
    private final C50720o f107878b;

    C42640e(ConvertListener convertListener, C50720o oVar) {
        this.f107877a = convertListener;
        this.f107878b = oVar;
    }

    public final Object call() {
        return C42637b.m93551a(this.f107877a, this.f107878b);
    }
}
