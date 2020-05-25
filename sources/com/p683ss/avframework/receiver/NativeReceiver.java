package com.p683ss.avframework.receiver;

import com.p683ss.avframework.engine.AudioDecoderFactory;
import com.p683ss.avframework.engine.Receiver;
import com.p683ss.avframework.engine.VideoDecoderFactory;
import com.p683ss.avframework.utils.JNINamespace;
import java.nio.ByteBuffer;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.receiver.NativeReceiver */
public class NativeReceiver extends Receiver {
    private native int nativeAudioBuffer(ByteBuffer byteBuffer, long j);

    private native long nativeCreate(VideoDecoderFactory videoDecoderFactory, AudioDecoderFactory audioDecoderFactory);

    private native void nativeRelease();

    public boolean isNativeReceiver() {
        return true;
    }

    public int readVideoBuffer(ByteBuffer byteBuffer) {
        return 0;
    }

    public synchronized void release() {
        if (this.mNativeObj != 0) {
            nativeRelease();
            this.mNativeObj = 0;
        }
    }

    public int readAudioBuffer(ByteBuffer byteBuffer) {
        return nativeAudioBuffer(byteBuffer, this.mNativeObj);
    }

    public NativeReceiver(VideoDecoderFactory videoDecoderFactory, AudioDecoderFactory audioDecoderFactory) {
        nativeCreate(videoDecoderFactory, audioDecoderFactory);
    }
}
