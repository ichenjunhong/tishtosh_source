package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.p921e.C13697a;
import com.facebook.imageutils.C14250a;

/* renamed from: com.facebook.imagepipeline.memory.e */
public final class C14074e extends C14090q<Bitmap> {
    /* renamed from: b */
    public final /* synthetic */ int mo26317b(Object obj) {
        return C14250a.m29204a((Bitmap) obj);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo26316a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (m28790a(bitmap)) {
            super.mo26316a(bitmap);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo26315a(int i) {
        Bitmap bitmap = (Bitmap) super.mo26315a(i);
        if (bitmap == null || !m28790a(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    /* renamed from: a */
    private static boolean m28790a(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            C13697a.m27698d("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            C13697a.m27698d("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }
}
