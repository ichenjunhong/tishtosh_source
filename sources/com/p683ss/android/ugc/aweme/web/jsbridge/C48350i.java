package com.p683ss.android.ugc.aweme.web.jsbridge;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.i */
final /* synthetic */ class C48350i implements Callable {

    /* renamed from: a */
    private final C48348h f121640a;

    /* renamed from: b */
    private final int f121641b;

    /* renamed from: c */
    private final int f121642c;

    /* renamed from: d */
    private final int f121643d;

    /* renamed from: e */
    private final int f121644e;

    C48350i(C48348h hVar, int i, int i2, int i3, int i4) {
        this.f121640a = hVar;
        this.f121641b = i;
        this.f121642c = i2;
        this.f121643d = i3;
        this.f121644e = i4;
    }

    public final Object call() {
        C48348h hVar = this.f121640a;
        int i = this.f121641b;
        int i2 = this.f121642c;
        int i3 = this.f121643d;
        int i4 = this.f121644e;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        canvas.translate((float) (-i3), (float) (-i4));
        hVar.f121636a.f28930d.draw(canvas);
        return createBitmap;
    }
}
