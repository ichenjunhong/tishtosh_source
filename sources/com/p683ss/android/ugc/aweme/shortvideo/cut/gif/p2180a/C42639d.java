package com.p683ss.android.ugc.aweme.shortvideo.cut.gif.p2180a;

import com.p683ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.C50720o;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.a.d */
public final /* synthetic */ class C42639d implements C50711k {

    /* renamed from: a */
    private final ConvertListener f107875a;

    /* renamed from: b */
    private final C50720o f107876b;

    public C42639d(ConvertListener convertListener, C50720o oVar) {
        this.f107875a = convertListener;
        this.f107876b = oVar;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        C0013i.m18a((Callable<TResult>) new C42640e<TResult>(this.f107875a, this.f107876b), C0013i.f25b);
    }
}
