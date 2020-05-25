package com.p683ss.android.ugc.aweme.shortvideo.cut.gif.p2180a;

import com.p683ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener;
import com.p683ss.android.vesdk.C50720o;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.a.f */
final /* synthetic */ class C42641f implements Callable {

    /* renamed from: a */
    private final int f107879a;

    /* renamed from: b */
    private final ConvertListener f107880b;

    /* renamed from: c */
    private final float f107881c;

    /* renamed from: d */
    private final C50720o f107882d;

    C42641f(int i, ConvertListener convertListener, float f, C50720o oVar) {
        this.f107879a = i;
        this.f107880b = convertListener;
        this.f107881c = f;
        this.f107882d = oVar;
    }

    public final Object call() {
        return C42637b.m93550a(this.f107879a, this.f107880b, this.f107881c, this.f107882d);
    }
}
