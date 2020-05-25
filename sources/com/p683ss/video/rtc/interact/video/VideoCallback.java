package com.p683ss.video.rtc.interact.video;

import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.video.rtc.interact.video.VideoCallback */
public interface VideoCallback {
    boolean updateVideoFrame(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, int i2, int i3, long j);

    boolean updateVideoFrame(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, int i2, int i3, long j, ByteBuffer byteBuffer);
}
