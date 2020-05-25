package com.facebook.animated.gif;

import com.facebook.common.p920d.C13689i;
import com.facebook.imagepipeline.p956a.p957a.C13906b;
import com.facebook.imagepipeline.p956a.p957a.C13906b.C13907a;
import com.facebook.imagepipeline.p956a.p957a.C13906b.C13908b;
import com.facebook.imagepipeline.p956a.p957a.C13911e;
import com.facebook.imagepipeline.p956a.p958b.C13917c;
import com.facebook.imageutils.C14252b;
import java.nio.ByteBuffer;

public class GifImage implements C13911e, C13917c {
    private static volatile boolean sInitialized;
    private long mNativeContext;

    public GifImage() {
    }

    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native GifImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native GifFrame nativeGetFrame(int i);

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
        return false;
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

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    private static synchronized void ensure() {
        synchronized (GifImage.class) {
            if (!sInitialized) {
                sInitialized = true;
                C14252b.m29209a("gifimage");
            }
        }
    }

    public int getLoopCount() {
        int nativeGetLoopCount = nativeGetLoopCount();
        switch (nativeGetLoopCount) {
            case -1:
                return 1;
            case 0:
                return 0;
            default:
                return nativeGetLoopCount + 1;
        }
    }

    GifImage(long j) {
        this.mNativeContext = j;
    }

    public GifFrame getFrame(int i) {
        return nativeGetFrame(i);
    }

    public static GifImage create(ByteBuffer byteBuffer) {
        ensure();
        byteBuffer.rewind();
        return nativeCreateFromDirectByteBuffer(byteBuffer);
    }

    public C13911e decode(ByteBuffer byteBuffer) {
        return create(byteBuffer);
    }

    private static C13908b fromGifDisposalMethod(int i) {
        if (i == 0) {
            return C13908b.DISPOSE_DO_NOT;
        }
        if (i == 1) {
            return C13908b.DISPOSE_DO_NOT;
        }
        if (i == 2) {
            return C13908b.DISPOSE_TO_BACKGROUND;
        }
        if (i == 3) {
            return C13908b.DISPOSE_TO_PREVIOUS;
        }
        return C13908b.DISPOSE_DO_NOT;
    }

    public static GifImage create(byte[] bArr) {
        ensure();
        C13689i.m27652a(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    public C13906b getFrameInfo(int i) {
        GifFrame frame = getFrame(i);
        try {
            C13906b bVar = new C13906b(i, frame.mo25433d(), frame.mo25434e(), frame.mo25431b(), frame.mo25432c(), C13907a.BLEND_WITH_PREVIOUS, fromGifDisposalMethod(frame.nativeGetDisposalMode()));
            return bVar;
        } finally {
            frame.mo25429a();
        }
    }

    public C13911e decode(long j, int i) {
        return create(j, i);
    }

    public static GifImage create(long j, int i) {
        boolean z;
        ensure();
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        return nativeCreateFromNativeMemory(j, i);
    }
}
