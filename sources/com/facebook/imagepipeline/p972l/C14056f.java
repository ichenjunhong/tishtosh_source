package com.facebook.imagepipeline.p972l;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import com.facebook.common.p924h.C13715a;
import com.facebook.imagepipeline.p970j.C14044e;

/* renamed from: com.facebook.imagepipeline.l.f */
public interface C14056f {
    C13715a<Bitmap> decodeFromEncodedImageWithColorSpace(C14044e eVar, Config config, Rect rect, boolean z);

    C13715a<Bitmap> decodeJPEGFromEncodedImage(C14044e eVar, Config config, Rect rect, int i);

    C13715a<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(C14044e eVar, Config config, Rect rect, int i, boolean z);
}
