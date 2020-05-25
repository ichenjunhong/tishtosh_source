package com.facebook.animated.webp;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.p956a.p957a.C13912f;

public class WebPFrame implements C13912f {
    private long mNativeContext;

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    /* renamed from: a */
    public final void mo25429a() {
        nativeDispose();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        nativeFinalize();
    }

    /* access modifiers changed from: 0000 */
    public native boolean nativeIsBlendWithPreviousFrame();

    /* access modifiers changed from: 0000 */
    public native boolean nativeShouldDisposeToBackgroundColor();

    /* renamed from: b */
    public final int mo25431b() {
        return nativeGetWidth();
    }

    /* renamed from: c */
    public final int mo25432c() {
        return nativeGetHeight();
    }

    /* renamed from: d */
    public final int mo25433d() {
        return nativeGetXOffset();
    }

    /* renamed from: e */
    public final int mo25434e() {
        return nativeGetYOffset();
    }

    WebPFrame(long j) {
        this.mNativeContext = j;
    }

    /* renamed from: a */
    public final void mo25430a(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}
