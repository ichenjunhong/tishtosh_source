package com.p683ss.android.medialib.jni;

import android.graphics.Bitmap;
import com.p683ss.android.ttve.nativePort.C20129b;

/* renamed from: com.ss.android.medialib.jni.BitmapJni */
public class BitmapJni {
    static {
        C20129b.m49687d();
    }

    private static native int nativeCompressBitmap(Bitmap bitmap, String str, int i);

    public static int compressBitmap(Bitmap bitmap, String str, int i) {
        return nativeCompressBitmap(bitmap, str, i);
    }
}
