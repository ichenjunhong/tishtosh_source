package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.p920d.C13689i;

public class Bitmaps {
    static {
        C14222a.m29163a();
    }

    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (bitmap2.getConfig() == bitmap.getConfig()) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        C13689i.m27655a(bitmap.isMutable());
        if (bitmap.getWidth() == bitmap2.getWidth()) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13689i.m27655a(z2);
        if (bitmap.getHeight() == bitmap2.getHeight()) {
            z3 = true;
        }
        C13689i.m27655a(z3);
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }
}
