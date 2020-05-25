package com.p683ss.video.rtc.interact.video;

import android.opengl.EGLContext;
import android.view.SurfaceView;
import android.view.TextureView;
import com.p683ss.video.rtc.interact.model.CommonType.VideoOutputFormat;
import java.nio.ByteBuffer;

/* renamed from: com.ss.video.rtc.interact.video.VideoSink */
public interface VideoSink {
    EGLContext getEglContext();

    long getEglContextNativeHandle();

    String getInteractId();

    SurfaceView getSurfaceView();

    TextureView getTextureView();

    void onByteBufferVideoFrame(ByteBuffer byteBuffer, VideoOutputFormat videoOutputFormat, int i, int i2, int i3, long j);

    void onByteBufferVideoFrame(ByteBuffer byteBuffer, VideoOutputFormat videoOutputFormat, int i, int i2, int i3, long j, ByteBuffer byteBuffer2);

    void onTextureVideoFrame(int i, VideoOutputFormat videoOutputFormat, int i2, int i3, float[] fArr, int i4, long j);

    void onTextureVideoFrame(int i, VideoOutputFormat videoOutputFormat, int i2, int i3, float[] fArr, int i4, long j, ByteBuffer byteBuffer);
}
