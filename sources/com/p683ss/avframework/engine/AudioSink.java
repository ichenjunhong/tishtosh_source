package com.p683ss.avframework.engine;

import com.p683ss.avframework.buffer.WrapperNativeAudioBuffer;
import com.p683ss.avframework.utils.JNINamespace;
import java.nio.Buffer;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.AudioSink */
public abstract class AudioSink extends NativeObject {
    public void onData(WrapperNativeAudioBuffer wrapperNativeAudioBuffer) {
    }

    public abstract void onData(Buffer buffer, int i, int i2, int i3, long j);

    public abstract void onNoData();
}
