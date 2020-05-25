package com.p683ss.android.medialib.NativePort;

import com.p683ss.android.ttve.nativePort.C20129b;

/* renamed from: com.ss.android.medialib.NativePort.NTextureDrawer */
public class NTextureDrawer {

    /* renamed from: a */
    private static final String f52968a = "NTextureDrawer";

    static {
        C20129b.m49687d();
    }

    private native long nativeCreateHandler();

    private native void nativeDrawTexture(long j, int i);

    private native void nativeRelease(long j);

    private native void nativeSetDebug(long j, boolean z);

    private native void nativeSetFlipScale(long j, float f, float f2);

    private native void nativeSetRotation(long j, float f);

    private native void nativeSetWidthHeight(long j, int i, int i2);
}
