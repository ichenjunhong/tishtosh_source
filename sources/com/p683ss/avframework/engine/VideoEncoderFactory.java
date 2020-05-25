package com.p683ss.avframework.engine;

import com.p683ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.engine.VideoEncoderFactory */
public abstract class VideoEncoderFactory extends NativeObject {
    public abstract VideoEncoder CreateVideoEncoder(String str, boolean z);

    public abstract String GetSupportedFormats();
}
