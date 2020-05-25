package com.p683ss.android.ugc.aweme.photomovie;

import android.graphics.Bitmap;
import com.p683ss.android.ugc.aweme.photomovie.PhotoMovieContext.C38719a;

/* renamed from: com.ss.android.ugc.aweme.photomovie.w */
final /* synthetic */ class C38821w implements C38719a {

    /* renamed from: a */
    private final C38805m f98787a;

    C38821w(C38805m mVar) {
        this.f98787a = mVar;
    }

    /* renamed from: a */
    public final void mo58818a(Bitmap bitmap, int i, int i2) {
        C38805m mVar = this.f98787a;
        if (bitmap != null) {
            mVar.f98757m.post(new C38814p(mVar, bitmap));
        }
    }
}
