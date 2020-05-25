package com.p683ss.video.rtc.interact.vendor.zego;

import android.os.Handler;
import android.view.SurfaceView;
import android.view.TextureView;
import com.p683ss.video.rtc.interact.model.CommonType.VideoOutputFormat;
import com.p683ss.video.rtc.interact.statistic.LogReporter.LogReportCallback;
import com.p683ss.video.rtc.interact.statistic.RenderVideoFpsStatistics;
import com.p683ss.video.rtc.interact.statistic.RenderVideoFpsStatistics.RenderVideoFpsStatisticsReport;
import com.p683ss.video.rtc.interact.statistic.RenderVideoStallStatistics;
import com.p683ss.video.rtc.interact.statistic.RenderVideoStallStatistics.IRenderVideoStallCallback;
import com.p683ss.video.rtc.interact.utils.log.LogUtil;
import com.p683ss.video.rtc.interact.video.VideoSink;
import com.p683ss.video.rtc.interact.video.VideoSinkFactory;
import com.zego.zegoavkit2.enums.VideoPixelFormat;
import com.zego.zegoavkit2.videorender.IZegoVideoRenderCallback;
import com.zego.zegoavkit2.videorender.VideoRenderType;
import com.zego.zegoavkit2.videorender.ZegoExternalVideoRender;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.video.rtc.interact.vendor.zego.ZegoVideoSink */
public class ZegoVideoSink implements IZegoVideoRenderCallback {
    private boolean isFirstRenderFrame = true;
    private Handler mHandler;
    private final Object mInteractFence = new Object();
    private LogReportCallback mLogReportCallback;
    private Map<String, RenderVideoFpsStatistics> mRenderFpsStatisticsMap = new HashMap();
    private Map<String, RenderVideoStallStatistics> mRenderStatisticsMap = new HashMap();
    private IRenderVideoStallCallback mRenderVideoStallCallback;
    private VideoSinkFactory mVideoSinkFactory;
    private ZegoEngine mZegoEngine;
    private Map<String, VideoSink> mZegoVideoSinkMap = new HashMap();
    private volatile boolean started;

    public void stop() {
        this.started = false;
    }

    public void start() {
        this.isFirstRenderFrame = true;
        this.started = true;
    }

    public ArrayList<RenderVideoFpsStatisticsReport> getVideoFpsReport() {
        ArrayList<RenderVideoFpsStatisticsReport> arrayList = new ArrayList<>();
        for (RenderVideoFpsStatistics avgRenderFps : this.mRenderFpsStatisticsMap.values()) {
            RenderVideoFpsStatisticsReport avgRenderFps2 = avgRenderFps.getAvgRenderFps();
            if (avgRenderFps2 != null) {
                arrayList.add(avgRenderFps2);
            }
        }
        return arrayList;
    }

    public void release() {
        if (this.started) {
            stop();
        }
        synchronized (this.mInteractFence) {
            for (RenderVideoStallStatistics stopStatistics : this.mRenderStatisticsMap.values()) {
                stopStatistics.stopStatistics();
            }
            this.mRenderStatisticsMap.clear();
            this.mRenderFpsStatisticsMap.clear();
            for (VideoSink destroy : this.mZegoVideoSinkMap.values()) {
                this.mVideoSinkFactory.destroy(destroy);
            }
            this.mZegoVideoSinkMap.clear();
        }
        ZegoExternalVideoRender.setVideoRenderCallback(null);
    }

    public static void enableExternalVideoRender(boolean z) {
        VideoRenderType videoRenderType;
        if (z) {
            videoRenderType = VideoRenderType.VIDEO_RENDER_TYPE_YUV;
        } else {
            videoRenderType = VideoRenderType.VIDEO_RENDER_TYPE_NONE;
        }
        ZegoExternalVideoRender.setVideoRenderType(videoRenderType);
    }

    private void onFirstRenderFrameReport(String str) {
        if (this.mLogReportCallback != null) {
            this.mLogReportCallback.onFirstRemoteVideoRender(str);
        }
    }

    private void removeRenderVideoStatistics(String str) {
        ((RenderVideoStallStatistics) this.mRenderStatisticsMap.remove(str)).stopStatistics();
    }

    private void addRenderVideoStatistics(String str) {
        RenderVideoStallStatistics renderVideoStallStatistics = new RenderVideoStallStatistics(str, this.mRenderVideoStallCallback, this.mHandler);
        this.mRenderStatisticsMap.put(str, renderVideoStallStatistics);
        renderVideoStallStatistics.startStatistics();
        this.mRenderFpsStatisticsMap.put(str, new RenderVideoFpsStatistics(str));
    }

    public SurfaceView getSurfaceView(String str) {
        synchronized (this.mInteractFence) {
            VideoSink videoSink = (VideoSink) this.mZegoVideoSinkMap.get(str);
            if (videoSink == null) {
                return null;
            }
            SurfaceView surfaceView = videoSink.getSurfaceView();
            return surfaceView;
        }
    }

    public TextureView getTextureView(String str) {
        synchronized (this.mInteractFence) {
            VideoSink videoSink = (VideoSink) this.mZegoVideoSinkMap.get(str);
            if (videoSink == null) {
                return null;
            }
            TextureView textureView = videoSink.getTextureView();
            return textureView;
        }
    }

    private VideoOutputFormat getZegoVideoOutputFormat(VideoPixelFormat videoPixelFormat) {
        switch (videoPixelFormat) {
            case PIXEL_FORMAT_I420:
                return VideoOutputFormat.PIXEL_FORMAT_I420;
            case PIXEL_FORMAT_NV12:
                return VideoOutputFormat.PIXEL_FORMAT_NV12;
            case PIXEL_FORMAT_NV21:
                return VideoOutputFormat.PIXEL_FORMAT_NV21;
            case PIXEL_FORMAT_RGBA32:
                return VideoOutputFormat.PIXEL_FORMAT_RGBA32;
            case PIXEL_FORMAT_BGRA32:
                return VideoOutputFormat.PIXEL_FORMAT_BGRA32;
            case PIXEL_FORMAT_ARGB32:
                return VideoOutputFormat.PIXEL_FORMAT_ARGB32;
            case PIXEL_FORMAT_ABGR32:
                return VideoOutputFormat.PIXEL_FORMAT_ABGR32;
            default:
                return VideoOutputFormat.PIXEL_FORMAT_UNKNOWN;
        }
    }

    public void onUserJoined(String str) {
        synchronized (this.mInteractFence) {
            if (!this.mZegoVideoSinkMap.containsKey(str)) {
                this.mZegoVideoSinkMap.put(str, this.mVideoSinkFactory.create(String.valueOf(str), false));
                addRenderVideoStatistics(str);
            }
        }
    }

    public void onUserLeaved(String str) {
        synchronized (this.mInteractFence) {
            if (this.mZegoVideoSinkMap.containsKey(str)) {
                VideoSink videoSink = (VideoSink) this.mZegoVideoSinkMap.remove(str);
                if (videoSink != null) {
                    this.mVideoSinkFactory.destroy(videoSink);
                }
                removeRenderVideoStatistics(str);
            }
        }
    }

    public static void enableVideoFrameCallback(boolean z, String str) {
        ZegoExternalVideoRender.enableVideoRender(z, str);
    }

    public void setRotation(String str, int i) {
        StringBuilder sb = new StringBuilder("setRotation  streamID:");
        sb.append(str);
        sb.append(" rotation:");
        sb.append(i);
        LogUtil.m110872i("ZegoVideoSink", sb.toString());
    }

    public void setFlipMode(String str, int i) {
        StringBuilder sb = new StringBuilder("setFlipMode(\"");
        sb.append(str);
        sb.append("\", ");
        sb.append(i);
        sb.append(")");
        LogUtil.m110874w("ZegoVideoSink", sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r9 = ((r0.width + 7) / 8) * 8;
        r4 = 3;
        r3 = java.nio.ByteBuffer.allocateDirect(((r0.height * r9) * 3) / 2);
        r3.clear();
        r8 = new int[]{r0.width, r0.width / 2, r0.width / 2};
        r10 = new int[]{r9, r9 / 2, r9 / 2};
        r12 = new int[]{r0.height, r0.height / 2, r0.height / 2};
        r7 = r3.array();
        r14 = r3.arrayOffset() + r3.position();
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ac, code lost:
        if (r13 >= r4) goto L_0x0134;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        r15 = r0.byteBuffers[r13];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        if (r15 == null) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ba, code lost:
        if (r8[r13] != r0.strides[r13]) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c2, code lost:
        if (r0.strides[r13] != r10[r13]) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c4, code lost:
        r4 = r15.position();
        r3.put(r15);
        r14 = r14 + (r15.position() - r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d2, code lost:
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d5, code lost:
        if (r4 >= r12[r13]) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d7, code lost:
        r15.get(r7, r14, r8[r13]);
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e3, code lost:
        if (r5 >= (r10[r13] - r8[r13])) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e5, code lost:
        r7[(r8[r13] + r14) + r5] = r7[((r14 + r8[r13]) - 1) - r5];
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fb, code lost:
        r15.position((r15.position() + r0.strides[r13]) - r8[r13]);
        r14 = r14 + r10[r13];
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0113, code lost:
        r13 = r13 + 1;
        r4 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011b, code lost:
        r2 = new java.lang.StringBuilder("buffer ");
        r2.append(r13);
        r2.append(" is null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0133, code lost:
        throw new java.lang.Exception(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0134, code lost:
        r6.onByteBufferVideoFrame(r3, getZegoVideoOutputFormat(r2), r9, r0.height, 0, java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0143, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onVideoRenderCallback(com.zego.zegoavkit2.entities.VideoFrame r19, com.zego.zegoavkit2.enums.VideoPixelFormat r20, java.lang.String r21) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            boolean r3 = r1.started
            if (r3 != 0) goto L_0x000b
            return
        L_0x000b:
            com.zego.zegoavkit2.enums.VideoPixelFormat r3 = com.zego.zegoavkit2.enums.VideoPixelFormat.PIXEL_FORMAT_I420     // Catch:{ Exception -> 0x0177 }
            if (r2 != r3) goto L_0x0163
            com.ss.video.rtc.interact.vendor.zego.ZegoEngine r3 = r1.mZegoEngine     // Catch:{ Exception -> 0x0177 }
            r4 = r21
            java.lang.String r3 = r3.splitInteractIdFromStreamId(r4)     // Catch:{ Exception -> 0x0177 }
            java.lang.Object r4 = r1.mInteractFence     // Catch:{ Exception -> 0x0177 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x0177 }
            java.util.Map<java.lang.String, com.ss.video.rtc.interact.video.VideoSink> r5 = r1.mZegoVideoSinkMap     // Catch:{ all -> 0x0160 }
            boolean r5 = r5.containsKey(r3)     // Catch:{ all -> 0x0160 }
            if (r5 == 0) goto L_0x0147
            monitor-exit(r4)     // Catch:{ all -> 0x0160 }
            java.util.Map<java.lang.String, com.ss.video.rtc.interact.statistic.RenderVideoStallStatistics> r4 = r1.mRenderStatisticsMap     // Catch:{ Exception -> 0x0177 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ Exception -> 0x0177 }
            com.ss.video.rtc.interact.statistic.RenderVideoStallStatistics r4 = (com.p683ss.video.rtc.interact.statistic.RenderVideoStallStatistics) r4     // Catch:{ Exception -> 0x0177 }
            if (r4 == 0) goto L_0x0030
            r4.rendVideoFrame()     // Catch:{ Exception -> 0x0177 }
        L_0x0030:
            java.util.Map<java.lang.String, com.ss.video.rtc.interact.statistic.RenderVideoFpsStatistics> r4 = r1.mRenderFpsStatisticsMap     // Catch:{ Exception -> 0x0177 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ Exception -> 0x0177 }
            com.ss.video.rtc.interact.statistic.RenderVideoFpsStatistics r4 = (com.p683ss.video.rtc.interact.statistic.RenderVideoFpsStatistics) r4     // Catch:{ Exception -> 0x0177 }
            if (r4 == 0) goto L_0x003d
            r4.rendVideoFrame()     // Catch:{ Exception -> 0x0177 }
        L_0x003d:
            boolean r4 = r1.isFirstRenderFrame     // Catch:{ Exception -> 0x0177 }
            r5 = 0
            if (r4 == 0) goto L_0x0047
            r1.isFirstRenderFrame = r5     // Catch:{ Exception -> 0x0177 }
            r1.onFirstRenderFrameReport(r3)     // Catch:{ Exception -> 0x0177 }
        L_0x0047:
            java.lang.Object r4 = r1.mInteractFence     // Catch:{ Exception -> 0x0177 }
            monitor-enter(r4)     // Catch:{ Exception -> 0x0177 }
            java.util.Map<java.lang.String, com.ss.video.rtc.interact.video.VideoSink> r6 = r1.mZegoVideoSinkMap     // Catch:{ all -> 0x0144 }
            java.lang.Object r3 = r6.get(r3)     // Catch:{ all -> 0x0144 }
            r6 = r3
            com.ss.video.rtc.interact.video.VideoSink r6 = (com.p683ss.video.rtc.interact.video.VideoSink) r6     // Catch:{ all -> 0x0144 }
            if (r6 != 0) goto L_0x0057
            monitor-exit(r4)     // Catch:{ all -> 0x0144 }
            return
        L_0x0057:
            monitor-exit(r4)     // Catch:{ all -> 0x0144 }
            int r3 = r0.width     // Catch:{ Exception -> 0x0177 }
            int r3 = r3 + 7
            int r3 = r3 / 8
            int r9 = r3 * 8
            int r3 = r0.height     // Catch:{ Exception -> 0x0177 }
            int r3 = r3 * r9
            r4 = 3
            int r3 = r3 * 3
            r7 = 2
            int r3 = r3 / r7
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r3)     // Catch:{ Exception -> 0x0177 }
            r3.clear()     // Catch:{ Exception -> 0x0177 }
            int[] r8 = new int[r4]     // Catch:{ Exception -> 0x0177 }
            int r10 = r0.width     // Catch:{ Exception -> 0x0177 }
            r8[r5] = r10     // Catch:{ Exception -> 0x0177 }
            int r10 = r0.width     // Catch:{ Exception -> 0x0177 }
            int r10 = r10 / r7
            r11 = 1
            r8[r11] = r10     // Catch:{ Exception -> 0x0177 }
            int r10 = r0.width     // Catch:{ Exception -> 0x0177 }
            int r10 = r10 / r7
            r8[r7] = r10     // Catch:{ Exception -> 0x0177 }
            int[] r10 = new int[r4]     // Catch:{ Exception -> 0x0177 }
            r10[r5] = r9     // Catch:{ Exception -> 0x0177 }
            int r12 = r9 / 2
            r10[r11] = r12     // Catch:{ Exception -> 0x0177 }
            int r12 = r9 / 2
            r10[r7] = r12     // Catch:{ Exception -> 0x0177 }
            int[] r12 = new int[r4]     // Catch:{ Exception -> 0x0177 }
            int r13 = r0.height     // Catch:{ Exception -> 0x0177 }
            r12[r5] = r13     // Catch:{ Exception -> 0x0177 }
            int r13 = r0.height     // Catch:{ Exception -> 0x0177 }
            int r13 = r13 / r7
            r12[r11] = r13     // Catch:{ Exception -> 0x0177 }
            int r13 = r0.height     // Catch:{ Exception -> 0x0177 }
            int r13 = r13 / r7
            r12[r7] = r13     // Catch:{ Exception -> 0x0177 }
            byte[] r7 = r3.array()     // Catch:{ Exception -> 0x0177 }
            int r13 = r3.arrayOffset()     // Catch:{ Exception -> 0x0177 }
            int r14 = r3.position()     // Catch:{ Exception -> 0x0177 }
            int r13 = r13 + r14
            r14 = r13
            r13 = 0
        L_0x00ac:
            if (r13 >= r4) goto L_0x0134
            java.nio.ByteBuffer[] r15 = r0.byteBuffers     // Catch:{ Exception -> 0x0177 }
            r15 = r15[r13]     // Catch:{ Exception -> 0x0177 }
            if (r15 == 0) goto L_0x011b
            r4 = r8[r13]     // Catch:{ Exception -> 0x0177 }
            int[] r5 = r0.strides     // Catch:{ Exception -> 0x0177 }
            r5 = r5[r13]     // Catch:{ Exception -> 0x0177 }
            if (r4 != r5) goto L_0x00d2
            int[] r4 = r0.strides     // Catch:{ Exception -> 0x0177 }
            r4 = r4[r13]     // Catch:{ Exception -> 0x0177 }
            r5 = r10[r13]     // Catch:{ Exception -> 0x0177 }
            if (r4 != r5) goto L_0x00d2
            int r4 = r15.position()     // Catch:{ Exception -> 0x0177 }
            r3.put(r15)     // Catch:{ Exception -> 0x0177 }
            int r5 = r15.position()     // Catch:{ Exception -> 0x0177 }
            int r5 = r5 - r4
            int r14 = r14 + r5
            goto L_0x0113
        L_0x00d2:
            r4 = 0
        L_0x00d3:
            r5 = r12[r13]     // Catch:{ Exception -> 0x0177 }
            if (r4 >= r5) goto L_0x0113
            r5 = r8[r13]     // Catch:{ Exception -> 0x0177 }
            r15.get(r7, r14, r5)     // Catch:{ Exception -> 0x0177 }
            r5 = 0
        L_0x00dd:
            r16 = r10[r13]     // Catch:{ Exception -> 0x0177 }
            r17 = r8[r13]     // Catch:{ Exception -> 0x0177 }
            int r11 = r16 - r17
            if (r5 >= r11) goto L_0x00fb
            r11 = r8[r13]     // Catch:{ Exception -> 0x0177 }
            int r11 = r11 + r14
            int r11 = r11 + r5
            r16 = r8[r13]     // Catch:{ Exception -> 0x0177 }
            int r16 = r14 + r16
            r17 = 1
            int r16 = r16 + -1
            int r16 = r16 - r5
            byte r16 = r7[r16]     // Catch:{ Exception -> 0x0177 }
            r7[r11] = r16     // Catch:{ Exception -> 0x0177 }
            int r5 = r5 + 1
            r11 = 1
            goto L_0x00dd
        L_0x00fb:
            r17 = 1
            int r5 = r15.position()     // Catch:{ Exception -> 0x0177 }
            int[] r11 = r0.strides     // Catch:{ Exception -> 0x0177 }
            r11 = r11[r13]     // Catch:{ Exception -> 0x0177 }
            int r5 = r5 + r11
            r11 = r8[r13]     // Catch:{ Exception -> 0x0177 }
            int r5 = r5 - r11
            r15.position(r5)     // Catch:{ Exception -> 0x0177 }
            r5 = r10[r13]     // Catch:{ Exception -> 0x0177 }
            int r14 = r14 + r5
            int r4 = r4 + 1
            r11 = 1
            goto L_0x00d3
        L_0x0113:
            r17 = 1
            int r13 = r13 + 1
            r4 = 3
            r5 = 0
            r11 = 1
            goto L_0x00ac
        L_0x011b:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0177 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0177 }
            java.lang.String r3 = "buffer "
            r2.<init>(r3)     // Catch:{ Exception -> 0x0177 }
            r2.append(r13)     // Catch:{ Exception -> 0x0177 }
            java.lang.String r3 = " is null."
            r2.append(r3)     // Catch:{ Exception -> 0x0177 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0177 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0177 }
            throw r0     // Catch:{ Exception -> 0x0177 }
        L_0x0134:
            com.ss.video.rtc.interact.model.CommonType$VideoOutputFormat r8 = r1.getZegoVideoOutputFormat(r2)     // Catch:{ Exception -> 0x0177 }
            int r10 = r0.height     // Catch:{ Exception -> 0x0177 }
            r11 = 0
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0177 }
            r7 = r3
            r6.onByteBufferVideoFrame(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0177 }
            return
        L_0x0144:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0144 }
            throw r0     // Catch:{ Exception -> 0x0177 }
        L_0x0147:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x0160 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0160 }
            java.lang.String r5 = "interact id "
            r2.<init>(r5)     // Catch:{ all -> 0x0160 }
            r2.append(r3)     // Catch:{ all -> 0x0160 }
            java.lang.String r3 = " is not in the list."
            r2.append(r3)     // Catch:{ all -> 0x0160 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0160 }
            r0.<init>(r2)     // Catch:{ all -> 0x0160 }
            throw r0     // Catch:{ all -> 0x0160 }
        L_0x0160:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0160 }
            throw r0     // Catch:{ Exception -> 0x0177 }
        L_0x0163:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Exception -> 0x0177 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0177 }
            java.lang.String r4 = "videoPixelFormat unsupported: "
            r3.<init>(r4)     // Catch:{ Exception -> 0x0177 }
            r3.append(r2)     // Catch:{ Exception -> 0x0177 }
            java.lang.String r2 = r3.toString()     // Catch:{ Exception -> 0x0177 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0177 }
            throw r0     // Catch:{ Exception -> 0x0177 }
        L_0x0177:
            r0 = move-exception
            java.lang.String r2 = "ZegoVideoSink"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = r0.toString()
            r3.append(r0)
            java.lang.String r0 = "ZegoVideoSink.java:onVideoRenderCallback 10000"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.p683ss.video.rtc.interact.utils.log.LogUtil.m110871e(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoSink.onVideoRenderCallback(com.zego.zegoavkit2.entities.VideoFrame, com.zego.zegoavkit2.enums.VideoPixelFormat, java.lang.String):void");
    }

    public ZegoVideoSink(VideoSinkFactory videoSinkFactory, IRenderVideoStallCallback iRenderVideoStallCallback, LogReportCallback logReportCallback, Handler handler, ZegoEngine zegoEngine) {
        ZegoExternalVideoRender.setVideoRenderCallback(this);
        this.mVideoSinkFactory = videoSinkFactory;
        this.mRenderVideoStallCallback = iRenderVideoStallCallback;
        this.mLogReportCallback = logReportCallback;
        this.mHandler = handler;
        this.mZegoEngine = zegoEngine;
    }
}
