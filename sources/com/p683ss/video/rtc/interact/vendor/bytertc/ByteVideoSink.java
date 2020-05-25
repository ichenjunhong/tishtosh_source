package com.p683ss.video.rtc.interact.vendor.bytertc;

import android.graphics.Matrix;
import android.opengl.EGLContext;
import android.opengl.GLES20;
import android.os.Handler;
import android.view.SurfaceView;
import android.view.TextureView;
import com.p683ss.video.rtc.engine.mediaio.IVideoSink;
import com.p683ss.video.rtc.interact.model.CommonType.VideoOutputFormat;
import com.p683ss.video.rtc.interact.statistic.LogReporter.LogReportCallback;
import com.p683ss.video.rtc.interact.statistic.RenderVideoFpsStatistics;
import com.p683ss.video.rtc.interact.statistic.RenderVideoFpsStatistics.RenderVideoFpsStatisticsReport;
import com.p683ss.video.rtc.interact.statistic.RenderVideoStallStatistics;
import com.p683ss.video.rtc.interact.statistic.RenderVideoStallStatistics.IRenderVideoStallCallback;
import com.p683ss.video.rtc.interact.utils.log.LogUtil;
import com.p683ss.video.rtc.interact.video.VideoSink;
import com.p683ss.video.rtc.interact.video.VideoSinkFactory;
import java.nio.ByteBuffer;
import org.webrtc.RendererCommon;

/* renamed from: com.ss.video.rtc.interact.vendor.bytertc.ByteVideoSink */
public class ByteVideoSink implements IVideoSink {
    private boolean isFirstRenderFrame = true;
    private boolean isRelease;
    private String mInteractId;
    private boolean mIsStart;
    private LogReportCallback mLogReportCallback;
    private RenderVideoFpsStatistics mRenderVideoFpsStatistics;
    private RenderVideoStallStatistics mRenderVideoStallStatistics;
    private VideoSink mVideoSink;
    private VideoSinkFactory mVideoSinkFactory;

    public EGLContext getEGLContextHandle() {
        return null;
    }

    public synchronized void onDispose() {
    }

    public boolean onInitialize() {
        return true;
    }

    public void onStop() {
        this.mIsStart = false;
    }

    public boolean onStart() {
        this.mIsStart = true;
        this.isFirstRenderFrame = true;
        return true;
    }

    private void destroyVideoSink() {
        VideoSink videoSink = this.mVideoSink;
        this.mVideoSink = null;
        if (videoSink != null) {
            this.mVideoSinkFactory.destroy(videoSink);
        }
    }

    private void onFirstRenderFrameReport() {
        if (this.mLogReportCallback != null) {
            this.mLogReportCallback.onFirstRemoteVideoRender(this.mInteractId);
        }
    }

    public int getBufferType() {
        if (getEGLContextHandle() != null) {
            return 1;
        }
        return 0;
    }

    public int getPixelFormat() {
        if (getBufferType() == 1) {
            return 2;
        }
        return 0;
    }

    public SurfaceView getSurfaceView() {
        if (this.mVideoSink != null) {
            return this.mVideoSink.getSurfaceView();
        }
        return null;
    }

    public TextureView getTextureView() {
        if (this.mVideoSink != null) {
            return this.mVideoSink.getTextureView();
        }
        return null;
    }

    public RenderVideoFpsStatisticsReport getVideoFpsReport() {
        if (this.mRenderVideoFpsStatistics != null) {
            return this.mRenderVideoFpsStatistics.getAvgRenderFps();
        }
        return null;
    }

    private VideoOutputFormat getByteVideoOutputFormat() {
        if (getBufferType() == 0) {
            return VideoOutputFormat.PIXEL_FORMAT_I420;
        }
        if (getBufferType() == 1) {
            return VideoOutputFormat.TEXTURE_2D;
        }
        return VideoOutputFormat.PIXEL_FORMAT_UNKNOWN;
    }

    public synchronized void release() {
        if (!this.isRelease) {
            this.isRelease = true;
            this.mIsStart = false;
            destroyVideoSink();
            this.mRenderVideoStallStatistics.stopStatistics();
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            sb.append(" stopped from outside");
            LogUtil.m110874w("ByteVideoSinkV2", sb.toString());
        }
    }

    public ByteVideoSink(String str, VideoSinkFactory videoSinkFactory, IRenderVideoStallCallback iRenderVideoStallCallback, LogReportCallback logReportCallback, Handler handler) {
        this.mInteractId = str;
        this.mVideoSinkFactory = videoSinkFactory;
        this.mVideoSink = this.mVideoSinkFactory.create(str, false);
        this.mLogReportCallback = logReportCallback;
        this.mRenderVideoStallStatistics = new RenderVideoStallStatistics(this.mInteractId, iRenderVideoStallCallback, handler);
        this.mRenderVideoStallStatistics.startStatistics();
        this.mRenderVideoFpsStatistics = new RenderVideoFpsStatistics(this.mInteractId);
        this.isRelease = false;
    }

    public void consumeByteArrayFrame(byte[] bArr, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        byte[] bArr2 = bArr;
        int i5 = i2;
        int i6 = i3;
        if (this.mIsStart) {
            this.mRenderVideoStallStatistics.rendVideoFrame();
            if (this.mRenderVideoFpsStatistics != null) {
                this.mRenderVideoFpsStatistics.rendVideoFrame();
            }
            if (this.isFirstRenderFrame) {
                this.isFirstRenderFrame = false;
                onFirstRenderFrameReport();
            }
            if (this.mVideoSink != null) {
                if (i5 % 8 == 0) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr2.length);
                    allocateDirect.put(bArr2);
                    if (byteBuffer == null) {
                        this.mVideoSink.onByteBufferVideoFrame(allocateDirect, getByteVideoOutputFormat(), i2, i3, 0, j / 1000000);
                    } else {
                        this.mVideoSink.onByteBufferVideoFrame(allocateDirect, getByteVideoOutputFormat(), i2, i3, 0, j / 1000000, byteBuffer);
                    }
                } else {
                    int i7 = ((i5 + 7) / 8) * 8;
                    int i8 = i7 / 2;
                    ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(((i7 * i6) * 3) / 2);
                    int min = Math.min(i7, i5);
                    int i9 = 0;
                    for (int i10 = 0; i10 < i6; i10++) {
                        allocateDirect2.put(bArr2, i9, min);
                        i9 += i5;
                        if (i7 > min) {
                            allocateDirect2.position(allocateDirect2.position() + (i7 - min));
                        }
                    }
                    int i11 = i5 / 2;
                    int min2 = Math.min(i8, i11);
                    for (int i12 = 0; i12 < i6; i12++) {
                        allocateDirect2.put(bArr2, i9, min2);
                        i9 += i11;
                        for (int i13 = 0; i13 < i8 - min2; i13++) {
                            allocateDirect2.put(Byte.MIN_VALUE);
                        }
                    }
                    if (byteBuffer == null) {
                        this.mVideoSink.onByteBufferVideoFrame(allocateDirect2, getByteVideoOutputFormat(), i7, i3, 0, j / 1000000);
                        return;
                    }
                    this.mVideoSink.onByteBufferVideoFrame(allocateDirect2, getByteVideoOutputFormat(), i7, i3, 0, j / 1000000, byteBuffer);
                }
            }
        }
    }

    public void consumeByteBufferFrame(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i, int i2, int i3, int i4, long j) {
        ByteBuffer byteBuffer3 = byteBuffer;
        int i5 = i2;
        int i6 = i3;
        if (this.mIsStart) {
            this.mRenderVideoStallStatistics.rendVideoFrame();
            if (this.mRenderVideoFpsStatistics != null) {
                this.mRenderVideoFpsStatistics.rendVideoFrame();
            }
            if (this.isFirstRenderFrame) {
                this.isFirstRenderFrame = false;
                onFirstRenderFrameReport();
            }
            if (this.mVideoSink != null) {
                byteBuffer3.position(0);
                if (i5 % 8 != 0) {
                    int i7 = ((i5 + 7) / 8) * 8;
                    int i8 = i7 / 2;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((i7 * i6) * 3) / 2);
                    int min = Math.min(i7, i5);
                    byte[] bArr = new byte[min];
                    for (int i9 = 0; i9 < i6; i9++) {
                        byteBuffer3.get(bArr);
                        if (i5 > min) {
                            byteBuffer3.position(byteBuffer.position() + (i5 - min));
                        }
                        allocateDirect.put(bArr);
                        if (i7 > min) {
                            allocateDirect.position(allocateDirect.position() + (i7 - min));
                        }
                    }
                    int i10 = i5 / 2;
                    int min2 = Math.min(i8, i10);
                    byte[] bArr2 = new byte[min2];
                    for (int i11 = 0; i11 < i6; i11++) {
                        byteBuffer3.get(bArr2);
                        if (i10 > min2) {
                            byteBuffer3.position(byteBuffer.position() + (i10 - min2));
                        }
                        allocateDirect.put(bArr2);
                        for (int i12 = 0; i12 < i8 - min2; i12++) {
                            allocateDirect.put(Byte.MIN_VALUE);
                        }
                    }
                    if (byteBuffer2 == null) {
                        this.mVideoSink.onByteBufferVideoFrame(allocateDirect, getByteVideoOutputFormat(), i7, i3, 0, j / 1000000);
                        return;
                    }
                    this.mVideoSink.onByteBufferVideoFrame(allocateDirect, getByteVideoOutputFormat(), i7, i3, 0, j / 1000000, byteBuffer2);
                } else if (byteBuffer2 == null) {
                    this.mVideoSink.onByteBufferVideoFrame(byteBuffer, getByteVideoOutputFormat(), i2, i3, 0, j / 1000000);
                } else {
                    this.mVideoSink.onByteBufferVideoFrame(byteBuffer, getByteVideoOutputFormat(), i2, i3, 0, j / 1000000, byteBuffer2);
                }
            }
        }
    }

    public void consumeTextureFrame(int i, ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, long j, float[] fArr) {
        if (this.mIsStart && getEGLContextHandle() != null) {
            this.mRenderVideoStallStatistics.rendVideoFrame();
            if (this.mRenderVideoFpsStatistics != null) {
                this.mRenderVideoFpsStatistics.rendVideoFrame();
            }
            if (this.isFirstRenderFrame) {
                this.isFirstRenderFrame = false;
                onFirstRenderFrameReport();
            }
            if (this.mVideoSink != null) {
                GLES20.glFlush();
                int i6 = i;
                int i7 = i3;
                int i8 = i4;
                this.mVideoSink.onTextureVideoFrame(i6, getByteVideoOutputFormat(), i7, i8, RendererCommon.convertMatrixFromAndroidGraphicsMatrix(new Matrix()), i5, j / 1000000, byteBuffer);
            }
        }
    }

    public void consumeYUVByteArrayFrame(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5, int i6, long j, ByteBuffer byteBuffer) {
        byte[] bArr4 = bArr;
        byte[] bArr5 = bArr2;
        byte[] bArr6 = bArr3;
        if (this.mIsStart) {
            this.mRenderVideoStallStatistics.rendVideoFrame();
            if (this.mRenderVideoFpsStatistics != null) {
                this.mRenderVideoFpsStatistics.rendVideoFrame();
            }
            if (this.isFirstRenderFrame) {
                this.isFirstRenderFrame = false;
                onFirstRenderFrameReport();
            }
            if (this.mVideoSink != null) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr4.length + bArr5.length + bArr6.length);
                allocateDirect.put(bArr);
                allocateDirect.put(bArr5);
                allocateDirect.put(bArr6);
                if (byteBuffer == null) {
                    this.mVideoSink.onByteBufferVideoFrame(allocateDirect, getByteVideoOutputFormat(), i, i5, 0, j / 1000000);
                    return;
                }
                this.mVideoSink.onByteBufferVideoFrame(allocateDirect, getByteVideoOutputFormat(), i, i5, 0, j / 1000000, byteBuffer);
            }
        }
    }
}
