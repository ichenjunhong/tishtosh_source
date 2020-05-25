package com.p683ss.android.ugc.aweme.shortvideo.cut.gif.p2180a;

import com.p683ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener;
import com.p683ss.android.vesdk.C50711k;
import com.p683ss.android.vesdk.C50720o;
import java.util.concurrent.Callable;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.a.c */
public final /* synthetic */ class C42638c implements C50711k {

    /* renamed from: a */
    private final ConvertListener f107873a;

    /* renamed from: b */
    private final C50720o f107874b;

    public C42638c(ConvertListener convertListener, C50720o oVar) {
        this.f107873a = convertListener;
        this.f107874b = oVar;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        C0013i.m18a((Callable<TResult>) new C42641f<TResult>(i, this.f107873a, f, this.f107874b), C0013i.f25b);
    }
}
