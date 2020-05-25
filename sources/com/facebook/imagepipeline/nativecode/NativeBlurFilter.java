package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.p920d.C13689i;

public class NativeBlurFilter {
    static {
        C14223b.m29164a();
    }

    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    public static void iterativeBoxBlur(Bitmap bitmap, int i, int i2) {
        boolean z;
        C13689i.m27652a(bitmap);
        boolean z2 = false;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        if (i2 > 0) {
            z2 = true;
        }
        C13689i.m27655a(z2);
        nativeIterativeBoxBlur(bitmap, i, i2);
    }
}
