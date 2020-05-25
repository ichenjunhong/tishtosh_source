package com.facebook.animated.webp;

import com.facebook.common.p920d.C13689i;
import com.facebook.imagepipeline.nativecode.C14225d;
import com.facebook.imagepipeline.p956a.p957a.C13906b;
import com.facebook.imagepipeline.p956a.p957a.C13906b.C13907a;
import com.facebook.imagepipeline.p956a.p957a.C13906b.C13908b;
import com.facebook.imagepipeline.p956a.p957a.C13911e;
import com.facebook.imagepipeline.p956a.p958b.C13917c;
import java.nio.ByteBuffer;

public class WebPImage implements C13911e, C13917c {
    private long mNativeContext;

    public WebPImage() {
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    public void dispose() {
        nativeDispose();
    }

    public boolean doesRenderSupportScaling() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        nativeFinalize();
    }

    public int getDuration() {
        return nativeGetDuration();
    }

    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    WebPImage(long j) {
        this.mNativeContext = j;
    }

    public WebPFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    public static WebPImage create(ByteBuffer byteBuffer) {
        C14225d.m29166a();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer);
    }

    public C13911e decode(ByteBuffer byteBuffer) {
        return create(byteBuffer);
    }

    public static WebPImage create(byte[] bArr) {
        C14225d.m29166a();
        C13689i.m27652a(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    public C13906b getFrameInfo(int i) {
        C13907a aVar;
        C13908b bVar;
        WebPFrame frame = getFrame(i);
        try {
            int d = frame.mo25433d();
            int e = frame.mo25434e();
            int b = frame.mo25431b();
            int c = frame.mo25432c();
            if (frame.nativeIsBlendWithPreviousFrame()) {
                aVar = C13907a.BLEND_WITH_PREVIOUS;
            } else {
                aVar = C13907a.NO_BLEND;
            }
            C13907a aVar2 = aVar;
            if (frame.nativeShouldDisposeToBackgroundColor()) {
                bVar = C13908b.DISPOSE_TO_BACKGROUND;
            } else {
                bVar = C13908b.DISPOSE_DO_NOT;
            }
            C13906b bVar2 = new C13906b(i, d, e, b, c, aVar2, bVar);
            return bVar2;
        } finally {
            frame.mo25429a();
        }
    }

    public C13911e decode(long j, int i) {
        return create(j, i);
    }

    public static WebPImage create(long j, int i) {
        boolean z;
        C14225d.m29166a();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        return nativeCreateFromNativeMemory(j, i);
    }
}
