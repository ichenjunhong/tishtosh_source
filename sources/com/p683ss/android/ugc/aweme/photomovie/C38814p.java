package com.p683ss.android.ugc.aweme.photomovie;

import android.graphics.Bitmap;

/* renamed from: com.ss.android.ugc.aweme.photomovie.p */
final /* synthetic */ class C38814p implements Runnable {

    /* renamed from: a */
    private final C38805m f98779a;

    /* renamed from: b */
    private final Bitmap f98780b;

    C38814p(C38805m mVar, Bitmap bitmap) {
        this.f98779a = mVar;
        this.f98780b = bitmap;
    }

    public final void run() {
        C38805m mVar = this.f98779a;
        mVar.f98752h.setImageBitmap(this.f98780b);
    }
}
