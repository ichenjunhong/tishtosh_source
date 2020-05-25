package com.p683ss.avframework.livestreamv2.core.interact;

import com.p683ss.avframework.livestreamv2.core.LiveCore.ILiveCoreTextureFrameAvailableListener;
import com.p683ss.avframework.opengl.GLThreadManager;
import com.p683ss.avframework.utils.AVLog;
import com.p683ss.video.rtc.interact.video.VideoCallback;
import com.p683ss.video.rtc.interact.video.VideoClient;
import java.nio.ByteBuffer;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.InteractVideoClient */
class InteractVideoClient implements ILiveCoreTextureFrameAvailableListener, VideoClient {
    private String TAG = "InteractVideoClient";
    private long mLastLogTime;
    private boolean mStart;
    private VideoCallback mVideoCallback;

    public void start() {
        this.mStart = true;
    }

    public void stop() {
        this.mStart = false;
    }

    InteractVideoClient() {
    }

    public void release() {
        synchronized (this) {
            this.mVideoCallback = null;
        }
    }

    public void prepare(VideoCallback videoCallback) {
        synchronized (this) {
            this.mVideoCallback = videoCallback;
            this.mStart = false;
        }
    }

    public void onTextureFrameAvailable(EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, ByteBuffer byteBuffer) {
        onTextureFrameAvailable(GLThreadManager.getEGLContext(), i, z, i2, i3, j, fArr, byteBuffer);
    }

    public void onTextureFrameAvailable(android.opengl.EGLContext eGLContext, int i, boolean z, int i2, int i3, long j, float[] fArr, ByteBuffer byteBuffer) {
        synchronized (this) {
            if (this.mVideoCallback != null && this.mStart) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.mLastLogTime > 10000) {
                    String str = this.TAG;
                    StringBuilder sb = new StringBuilder("Input interact video frame tex ");
                    sb.append(i);
                    AVLog.ioi(str, sb.toString());
                    this.mLastLogTime = currentTimeMillis;
                } else {
                    int i4 = i;
                }
                this.mVideoCallback.updateVideoFrame(null, eGLContext, i, i2, i3, j / 1000000, byteBuffer);
            }
        }
    }
}
