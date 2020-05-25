package com.p683ss.android.medialib.NativePort;

import android.view.Surface;
import com.p683ss.android.medialib.C19216a;
import com.p683ss.android.medialib.C19221b;
import com.p683ss.android.medialib.p1180b.C19226c;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.medialib.NativePort.HWAvcNativeBridge */
public class HWAvcNativeBridge implements C19221b {
    private static final String TAG = "HWAvcNativeBridge";
    private C19216a mAVCEncoder;
    private long mNativePtr;

    public int getProfile() {
        return 0;
    }

    public native int nativeSetCodecConfig(long j, ByteBuffer byteBuffer, int i);

    public native int nativeSetColorFormat(long j, int i);

    public native int nativeSetHardEncoderStatus(long j, boolean z);

    public native void nativeSwapGlBuffer(long j);

    public native int nativeWriteFile(long j, ByteBuffer byteBuffer, int i, int i2, int i3, int i4);

    public void onEncoderData(ByteBuffer byteBuffer, int i, boolean z) {
    }

    public void onEncoderData(byte[] bArr, int i, boolean z) {
    }

    public Surface onInitHardEncoder(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        return null;
    }

    public void onWriteFile(ByteBuffer byteBuffer, long j, long j2, int i, int i2) {
    }

    public void onSwapGlBuffers() {
        nativeSwapGlBuffer(this.mNativePtr);
    }

    public void onUninitHardEncoder() {
        if (this.mAVCEncoder != null) {
            this.mAVCEncoder.mo39596b();
            this.mAVCEncoder = null;
            C19226c.m46859a(TAG, "====== uninitAVCEncoder ======");
        }
    }

    public HWAvcNativeBridge(long j) {
        this.mNativePtr = j;
    }

    public void setColorFormat(int i) {
        nativeSetColorFormat(this.mNativePtr, i);
    }

    public void onSetCodecConfig(ByteBuffer byteBuffer) {
        nativeSetCodecConfig(this.mNativePtr, byteBuffer, byteBuffer.remaining());
    }

    public int onEncoderData(int i, int i2, int i3, boolean z) {
        if (this.mAVCEncoder != null) {
            this.mAVCEncoder.mo39592a(i, i2, i3, z);
        }
        return 0;
    }

    public void onWriteFile(ByteBuffer byteBuffer, int i, int i2, int i3) {
        nativeWriteFile(this.mNativePtr, byteBuffer, byteBuffer.remaining(), i, i2, i3);
    }

    public Surface onInitHardEncoder(int i, int i2, int i3, int i4, boolean z) {
        if (this.mAVCEncoder == null) {
            this.mAVCEncoder = new C19216a();
            this.mAVCEncoder.f52986f = i4;
        }
        C19216a.m46839a((C19221b) this);
        Surface a = this.mAVCEncoder.mo39594a(i, i2, i3, 1, 1, i4, z);
        if (a == null) {
            this.mAVCEncoder = null;
            nativeSetHardEncoderStatus(this.mNativePtr, false);
            return null;
        }
        nativeSetHardEncoderStatus(this.mNativePtr, true);
        return a;
    }
}
