package com.zego.p2623ve;

import android.media.Image.Plane;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.EncoderCapabilities;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Surface;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.zego.ve.MediaCodecVideoEncoder */
public class MediaCodecVideoEncoder {
    private static final String[] H264_HW_EXCEPTION_MODELS = {"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4", "EML-AL00", "XT1079", "PACM00", "SM-G9250"};
    private static final String[] HW_BLACKLISTS = {"omx.google.", "omx.ffmpeg.", "omx.pv", "omx.k3.ffmpeg.", "omx.avcodec.", "omx.ittiam.", "omx.sec.avc.sw.", "omx.marvell.video.h264encoder"};
    private static int codecErrors;
    private static boolean enableWhitelist = true;
    private static MediaCodecVideoEncoderErrorCallback errorCallback;
    private static final MediaCodecProperties exynosH264HwProperties = new MediaCodecProperties("OMX.Exynos.", 21, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties exynosVp8HwProperties = new MediaCodecProperties("OMX.Exynos.", 23, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties freescaleH264HwProperties = new MediaCodecProperties("OMX.Freescale.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties[] h264HwList = {qcomH264HwProperties, exynosH264HwProperties, mtkH264HwProperties, kirinH264HwProperties, kirin960H264HwProperties, tiH264HwProperties, intelH264HwProperties, nvidiaH264HwProperties, rkH264HwProperties, winnerH264HwProperties, mstarH264HwProperties, freescaleH264HwProperties, sprdH264HwProperties};
    private static final MediaCodecProperties[] hevcHwList = {qcomHEVCHwProperties, kirin960HEVCHwProperties, kirinHEVCHwProperties, mtkHEVCHwProperties};
    private static Set<String> hwEncoderDisabledTypes = new HashSet();
    private static final MediaCodecProperties intelH264HwProperties = new MediaCodecProperties("OMX.Intel.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties intelVp8HwProperties = new MediaCodecProperties("OMX.Intel.", 21, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties kirin960H264HwProperties = new MediaCodecProperties("OMX.hisi.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties kirin960HEVCHwProperties = new MediaCodecProperties("OMX.hisi.", 21, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties kirinH264HwProperties = new MediaCodecProperties("OMX.IMG.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties kirinHEVCHwProperties = new MediaCodecProperties("OMX.IMG.", 21, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties mstarH264HwProperties = new MediaCodecProperties("OMX.MS.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties mtkH264HwProperties = new MediaCodecProperties("OMX.MTK.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties mtkHEVCHwProperties = new MediaCodecProperties("OMX.MTK.", 21, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties nvidiaH264HwProperties = new MediaCodecProperties("OMX.Nvidia.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties qcomH264HwProperties = new MediaCodecProperties("OMX.qcom.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties qcomHEVCHwProperties = new MediaCodecProperties("OMX.qcom.", 21, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties qcomVp8HwProperties = new MediaCodecProperties("OMX.qcom.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties rkH264HwProperties = new MediaCodecProperties("OMX.rk.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static MediaCodecVideoEncoder runningInstance;
    private static final MediaCodecProperties sprdH264HwProperties = new MediaCodecProperties("OMX.sprd.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final int[] supportedColorList = {21, 2135033992, 2141391872, 2141391876, 19, 20, 2130706688, 2130708361};
    private static final int[] supportedSurfaceColorList = {2130708361};
    private static final MediaCodecProperties tiH264HwProperties = new MediaCodecProperties("OMX.TI.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties[] vp8HwList = {qcomVp8HwProperties, exynosVp8HwProperties, intelVp8HwProperties};
    private static final MediaCodecProperties winnerH264HwProperties = new MediaCodecProperties("OMX.allwinner.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private double bitrateAccumulator;
    private double bitrateAccumulatorMax;
    private int bitrateAdjustmentScaleExp;
    private BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
    private double bitrateObservationTimeMs;
    private VImage cacheImage = new VImage();
    private int colorFormat;
    private ByteBuffer configData;
    private long forcedKeyFrameMs;
    private int height;
    private ByteBuffer[] inputBuffers;
    private Surface inputSurface;
    private long lastKeyFrameMs;
    public MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private int originFps;
    private ByteBuffer[] outputBuffers;
    private int sliceHeight;
    private int stride;
    private int targetBitrateBps;
    private int targetFps;
    private VideoCodecType type;
    private int width;

    /* renamed from: com.zego.ve.MediaCodecVideoEncoder$BitrateAdjustmentType */
    public enum BitrateAdjustmentType {
        NO_ADJUSTMENT,
        FRAMERATE_ADJUSTMENT,
        DYNAMIC_ADJUSTMENT
    }

    /* renamed from: com.zego.ve.MediaCodecVideoEncoder$EncoderProperties */
    static class EncoderProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecName;
        public final int colorFormat;
        public final boolean supportedCBR;
        public final boolean supportedProfile;

        public EncoderProperties(String str, int i, BitrateAdjustmentType bitrateAdjustmentType2, boolean z, boolean z2) {
            this.codecName = str;
            this.colorFormat = i;
            this.bitrateAdjustmentType = bitrateAdjustmentType2;
            this.supportedCBR = z;
            this.supportedProfile = z2;
        }
    }

    /* renamed from: com.zego.ve.MediaCodecVideoEncoder$MediaCodecProperties */
    static class MediaCodecProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecPrefix;
        public final int minSdk;

        MediaCodecProperties(String str, int i, BitrateAdjustmentType bitrateAdjustmentType2) {
            this.codecPrefix = str;
            this.minSdk = i;
            this.bitrateAdjustmentType = bitrateAdjustmentType2;
        }
    }

    /* renamed from: com.zego.ve.MediaCodecVideoEncoder$MediaCodecVideoEncoderErrorCallback */
    public interface MediaCodecVideoEncoderErrorCallback {
        void onMediaCodecVideoEncoderCriticalError(int i);
    }

    /* renamed from: com.zego.ve.MediaCodecVideoEncoder$OutputBufferInfo */
    static class OutputBufferInfo {
        public final ByteBuffer buffer;
        public final int index;
        public final boolean isKeyFrame;
        public final long presentationTimestampUs;
        public final int size;

        public OutputBufferInfo(int i, ByteBuffer byteBuffer, int i2, boolean z, long j) {
            this.index = i;
            this.buffer = byteBuffer;
            this.size = i2;
            this.isKeyFrame = z;
            this.presentationTimestampUs = j;
        }
    }

    /* renamed from: com.zego.ve.MediaCodecVideoEncoder$VImage */
    static class VImage {
        public boolean isI420;
        public ByteBuffer uBuffer;
        public int uStride;
        public ByteBuffer vBuffer;
        public int vStride;
        public ByteBuffer yBuffer;
        public int yStride;

        private VImage() {
        }
    }

    /* renamed from: com.zego.ve.MediaCodecVideoEncoder$VideoCodecType */
    public enum VideoCodecType {
        VIDEO_CODEC_H264_AVC,
        VIDEO_CODEC_H264_AVC_MULTILAYER,
        VIDEO_CODEC_H265,
        VIDEO_CODEC_VP8
    }

    public static boolean isVp8HwSupported(boolean z) {
        return false;
    }

    public static void disableH264HwCodec() {
        hwEncoderDisabledTypes.add("video/avc");
    }

    public static void disableHEVCHwCodec() {
        hwEncoderDisabledTypes.add("video/hevc");
    }

    public static void disableVp8HwCodec() {
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    public static String getCodecName() {
        return findHwEncoder("video/avc", h264HwList, supportedColorList).codecName;
    }

    /* access modifiers changed from: 0000 */
    public int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(0);
        } catch (IllegalStateException unused) {
            return -2;
        }
    }

    public static boolean isH264HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", h264HwList, supportedSurfaceColorList) == null) {
            return false;
        }
        return true;
    }

    public static void printStackTrace() {
        if (runningInstance != null && runningInstance.mediaCodecThread != null) {
            runningInstance.mediaCodecThread.getStackTrace();
        }
    }

    private void checkOnMediaCodecThread() {
        if (this.mediaCodecThread.getId() != Thread.currentThread().getId()) {
            StringBuilder sb = new StringBuilder("MediaCodecVideoEncoder previously operated on ");
            sb.append(this.mediaCodecThread);
            sb.append(" but is now called on ");
            sb.append(Thread.currentThread());
            throw new RuntimeException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public void release() {
        if (this.mediaCodecThread != null) {
            checkOnMediaCodecThread();
            if (this.mediaCodec != null) {
                if (this.inputSurface != null) {
                    this.mediaCodec.signalEndOfInputStream();
                    this.inputSurface.release();
                    this.inputSurface = null;
                } else {
                    this.mediaCodec.flush();
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            MediaCodecVideoEncoder.this.mediaCodec.stop();
                            MediaCodecVideoEncoder.this.mediaCodec.release();
                            MediaCodecVideoEncoder.this.mediaCodec = null;
                        } catch (Exception unused) {
                        }
                        countDownLatch.countDown();
                    }
                }).start();
                if (!ThreadUtils.awaitUninterruptibly(countDownLatch, 5000)) {
                    codecErrors++;
                    if (errorCallback != null) {
                        errorCallback.onMediaCodecVideoEncoderCriticalError(codecErrors);
                    }
                }
            }
            this.mediaCodecThread = null;
            runningInstance = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public OutputBufferInfo dequeueOutputBuffer() {
        boolean z;
        boolean z2;
        checkOnMediaCodecThread();
        try {
            BufferInfo bufferInfo = new BufferInfo();
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer >= 0) {
                if ((bufferInfo.flags & 2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.configData = ByteBuffer.allocateDirect(bufferInfo.size);
                    ByteBuffer byteBuffer = getByteBuffer(false, dequeueOutputBuffer);
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    this.configData.put(byteBuffer);
                    this.mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
                }
            }
            int i = dequeueOutputBuffer;
            if (i >= 0) {
                ByteBuffer duplicate = getByteBuffer(false, i).duplicate();
                duplicate.position(bufferInfo.offset);
                duplicate.limit(bufferInfo.offset + bufferInfo.size);
                reportEncodedFrame(bufferInfo.size);
                if ((bufferInfo.flags & 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                OutputBufferInfo outputBufferInfo = new OutputBufferInfo(i, duplicate.slice(), bufferInfo.size, z, bufferInfo.presentationTimeUs);
                return outputBufferInfo;
            } else if (i == -3) {
                if (VERSION.SDK_INT < 21) {
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                }
                return dequeueOutputBuffer();
            } else if (i == -2) {
                return dequeueOutputBuffer();
            } else {
                if (i == -1) {
                    return null;
                }
                StringBuilder sb = new StringBuilder("dequeueOutputBuffer: ");
                sb.append(i);
                throw new RuntimeException(sb.toString());
            }
        } catch (IllegalStateException unused) {
            OutputBufferInfo outputBufferInfo2 = new OutputBufferInfo(-1, null, -1, false, -1);
            return outputBufferInfo2;
        }
    }

    public static void setErrorCallback(MediaCodecVideoEncoderErrorCallback mediaCodecVideoEncoderErrorCallback) {
        errorCallback = mediaCodecVideoEncoderErrorCallback;
    }

    static MediaCodec createByCodecName(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private double getBitrateScale(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return Math.pow(2.0d, d / 10.0d);
    }

    /* access modifiers changed from: 0000 */
    public boolean releaseOutputBuffer(int i) {
        checkOnMediaCodecThread();
        try {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public static boolean isH264HwSupported(boolean z) {
        enableWhitelist = z;
        if (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", h264HwList, supportedColorList) == null) {
            return false;
        }
        return true;
    }

    public static boolean isHEVCHwSupported(boolean z) {
        enableWhitelist = z;
        if (hwEncoderDisabledTypes.contains("video/hevc") || findHwEncoder("video/hevc", hevcHwList, supportedColorList) == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public VImage getImage(int i) {
        Plane[] planes = this.mediaCodec.getInputImage(i).getPlanes();
        this.cacheImage.yBuffer = planes[0].getBuffer();
        this.cacheImage.yStride = planes[0].getRowStride();
        this.cacheImage.uBuffer = planes[1].getBuffer();
        this.cacheImage.uStride = planes[1].getRowStride();
        this.cacheImage.vBuffer = planes[2].getBuffer();
        this.cacheImage.vStride = planes[2].getRowStride();
        if (planes[1].getPixelStride() == 1 && planes[2].getPixelStride() == 1) {
            this.cacheImage.isI420 = true;
        } else {
            this.cacheImage.isI420 = false;
        }
        return this.cacheImage;
    }

    private void reportEncodedFrame(int i) {
        if (this.targetFps != 0 && this.bitrateAdjustmentType == BitrateAdjustmentType.DYNAMIC_ADJUSTMENT) {
            double d = (double) this.targetBitrateBps;
            double d2 = (double) this.targetFps;
            Double.isNaN(d2);
            double d3 = d2 * 8.0d;
            Double.isNaN(d);
            double d4 = d / d3;
            double d5 = this.bitrateAccumulator;
            double d6 = (double) i;
            Double.isNaN(d6);
            this.bitrateAccumulator = d5 + (d6 - d4);
            double d7 = this.bitrateObservationTimeMs;
            double d8 = (double) this.targetFps;
            Double.isNaN(d8);
            this.bitrateObservationTimeMs = d7 + (1000.0d / d8);
            double d9 = this.bitrateAccumulatorMax * 3.0d;
            this.bitrateAccumulator = Math.min(this.bitrateAccumulator, d9);
            this.bitrateAccumulator = Math.max(this.bitrateAccumulator, -d9);
            if (this.bitrateObservationTimeMs > 3000.0d) {
                boolean z = true;
                if (this.bitrateAccumulator > this.bitrateAccumulatorMax) {
                    this.bitrateAdjustmentScaleExp -= (int) ((this.bitrateAccumulator / this.bitrateAccumulatorMax) + 0.5d);
                    this.bitrateAccumulator = this.bitrateAccumulatorMax;
                } else if (this.bitrateAccumulator < (-this.bitrateAccumulatorMax)) {
                    this.bitrateAdjustmentScaleExp += (int) (((-this.bitrateAccumulator) / this.bitrateAccumulatorMax) + 0.5d);
                    this.bitrateAccumulator = -this.bitrateAccumulatorMax;
                } else {
                    z = false;
                }
                if (z) {
                    this.bitrateAdjustmentScaleExp = Math.min(this.bitrateAdjustmentScaleExp, 10);
                    this.bitrateAdjustmentScaleExp = Math.max(this.bitrateAdjustmentScaleExp, -10);
                    setRates(this.targetBitrateBps / 1000, this.targetFps);
                }
                this.bitrateObservationTimeMs = ProfileUiInitOptimizeEnterThreshold.DEFAULT;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void checkKeyFrameRequired(boolean z, long j) {
        boolean z2;
        long j2 = (j + 500) / 1000;
        if (this.lastKeyFrameMs < 0) {
            this.lastKeyFrameMs = j2;
        }
        if (z || this.forcedKeyFrameMs <= 0 || j2 <= this.lastKeyFrameMs + this.forcedKeyFrameMs) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.mediaCodec.setParameters(bundle);
            this.lastKeyFrameMs = j2;
        }
    }

    /* access modifiers changed from: 0000 */
    public ByteBuffer getByteBuffer(boolean z, int i) {
        if (VERSION.SDK_INT >= 21) {
            if (z) {
                return this.mediaCodec.getInputBuffer(i);
            }
            return this.mediaCodec.getOutputBuffer(i);
        } else if (z) {
            return this.inputBuffers[i];
        } else {
            return this.outputBuffers[i];
        }
    }

    private boolean setRates(int i, int i2) {
        checkOnMediaCodecThread();
        if (this.bitrateAdjustmentType == BitrateAdjustmentType.DYNAMIC_ADJUSTMENT) {
            double d = (double) i;
            Double.isNaN(d);
            this.bitrateAccumulatorMax = d / 8.0d;
            if (this.targetBitrateBps > 0 && i < this.targetBitrateBps) {
                double d2 = this.bitrateAccumulator;
                Double.isNaN(d);
                double d3 = d2 * d;
                double d4 = (double) this.targetBitrateBps;
                Double.isNaN(d4);
                this.bitrateAccumulator = d3 / d4;
            }
        }
        this.targetBitrateBps = i;
        this.targetFps = i2;
        if (this.bitrateAdjustmentType == BitrateAdjustmentType.FRAMERATE_ADJUSTMENT && this.targetFps > 0) {
            i = (this.originFps * this.targetBitrateBps) / this.targetFps;
        } else if (this.bitrateAdjustmentType == BitrateAdjustmentType.DYNAMIC_ADJUSTMENT && this.bitrateAdjustmentScaleExp != 0) {
            double d5 = (double) i;
            double bitrateScale = getBitrateScale(this.bitrateAdjustmentScaleExp);
            Double.isNaN(d5);
            i = (int) (d5 * bitrateScale);
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i);
            this.mediaCodec.setParameters(bundle);
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private static EncoderProperties findHwEncoder(String str, MediaCodecProperties[] mediaCodecPropertiesArr, int[] iArr) {
        MediaCodecInfo mediaCodecInfo;
        String str2;
        BitrateAdjustmentType bitrateAdjustmentType2;
        boolean z;
        int[] iArr2;
        boolean z2;
        boolean z3;
        boolean z4;
        String str3 = str;
        MediaCodecProperties[] mediaCodecPropertiesArr2 = mediaCodecPropertiesArr;
        int[] iArr3 = iArr;
        if (VERSION.SDK_INT < 19) {
            return null;
        }
        if (str3.equals("video/avc") && Arrays.asList(H264_HW_EXCEPTION_MODELS).contains(Build.MODEL)) {
            return null;
        }
        int i = 0;
        while (i < MediaCodecList.getCodecCount()) {
            try {
                try {
                    mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
                } catch (IllegalArgumentException unused) {
                    mediaCodecInfo = null;
                }
                if (mediaCodecInfo != null) {
                    if (mediaCodecInfo.isEncoder()) {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                str2 = null;
                                break;
                            } else if (supportedTypes[i2].equals(str3)) {
                                str2 = mediaCodecInfo.getName();
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (str2 != null) {
                            BitrateAdjustmentType bitrateAdjustmentType3 = BitrateAdjustmentType.NO_ADJUSTMENT;
                            if (enableWhitelist) {
                                int length2 = mediaCodecPropertiesArr2.length;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= length2) {
                                        bitrateAdjustmentType2 = bitrateAdjustmentType3;
                                        z = false;
                                        break;
                                    }
                                    MediaCodecProperties mediaCodecProperties = mediaCodecPropertiesArr2[i3];
                                    if (!str2.startsWith(mediaCodecProperties.codecPrefix) || VERSION.SDK_INT < mediaCodecProperties.minSdk) {
                                        i3++;
                                    } else {
                                        if (mediaCodecProperties.bitrateAdjustmentType != BitrateAdjustmentType.NO_ADJUSTMENT) {
                                            bitrateAdjustmentType3 = mediaCodecProperties.bitrateAdjustmentType;
                                        }
                                        bitrateAdjustmentType2 = bitrateAdjustmentType3;
                                        z = true;
                                    }
                                }
                            } else {
                                String lowerCase = str2.toLowerCase();
                                String[] strArr = HW_BLACKLISTS;
                                int length3 = strArr.length;
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= length3) {
                                        z4 = false;
                                        break;
                                    } else if (lowerCase.startsWith(strArr[i4])) {
                                        z4 = true;
                                        break;
                                    } else {
                                        i4++;
                                    }
                                }
                                z = !z4;
                                bitrateAdjustmentType2 = bitrateAdjustmentType3;
                            }
                            if (z) {
                                try {
                                    CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str3);
                                    int[] iArr4 = capabilitiesForType.colorFormats;
                                    for (int i5 : iArr3) {
                                        for (int i6 : capabilitiesForType.colorFormats) {
                                            if (i6 == i5) {
                                                if (VERSION.SDK_INT >= 21) {
                                                    EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
                                                    if (encoderCapabilities != null && encoderCapabilities.isBitrateModeSupported(2)) {
                                                        z2 = true;
                                                        if (VERSION.SDK_INT >= 23 || !str3.equals("video/avc")) {
                                                            z3 = false;
                                                        } else {
                                                            MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str3, 640, 480);
                                                            createVideoFormat.setInteger("profile", 1);
                                                            z3 = capabilitiesForType.isFormatSupported(createVideoFormat);
                                                        }
                                                        EncoderProperties encoderProperties = new EncoderProperties(str2, i6, bitrateAdjustmentType2, z2, z3);
                                                        return encoderProperties;
                                                    }
                                                }
                                                z2 = false;
                                                if (VERSION.SDK_INT >= 23) {
                                                }
                                                z3 = false;
                                                EncoderProperties encoderProperties2 = new EncoderProperties(str2, i6, bitrateAdjustmentType2, z2, z3);
                                                return encoderProperties2;
                                            }
                                        }
                                    }
                                    continue;
                                } catch (IllegalArgumentException unused2) {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                i++;
            } catch (Exception unused3) {
                printStackTrace();
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public boolean encodeTexture(boolean z, int i, float[] fArr, long j) {
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z, j);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean encodeBuffer(boolean z, int i, int i2, long j) {
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z, j);
            this.mediaCodec.queueInputBuffer(i, 0, i2, j, 0);
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean initEncode(int r18, int r19, int r20, int r21, int r22, boolean r23, int r24) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            r4 = r24
            r0.width = r1
            r0.height = r2
            r5 = 0
            r0.forcedKeyFrameMs = r5
            r5 = -1
            r0.lastKeyFrameMs = r5
            java.lang.Thread r5 = r0.mediaCodecThread
            if (r5 != 0) goto L_0x01b1
            com.zego.ve.MediaCodecVideoEncoder$VideoCodecType[] r5 = com.zego.p2623ve.MediaCodecVideoEncoder.VideoCodecType.values()
            r5 = r5[r18]
            com.zego.ve.MediaCodecVideoEncoder$VideoCodecType r6 = com.zego.p2623ve.MediaCodecVideoEncoder.VideoCodecType.VIDEO_CODEC_H264_AVC
            r7 = 21
            r8 = 1
            r9 = -1
            r10 = 0
            if (r5 != r6) goto L_0x0051
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/avc"
            com.zego.ve.MediaCodecVideoEncoder$MediaCodecProperties[] r11 = h264HwList
            if (r23 == 0) goto L_0x0032
            int[] r12 = supportedSurfaceColorList
            goto L_0x0034
        L_0x0032:
            int[] r12 = supportedColorList
        L_0x0034:
            com.zego.ve.MediaCodecVideoEncoder$EncoderProperties r6 = findHwEncoder(r6, r11, r12)
            boolean r11 = r6.supportedProfile
            if (r11 == 0) goto L_0x004e
            int r11 = r1 * r2
            int r11 = r11 / 256
            r12 = 8192(0x2000, float:1.14794E-41)
            if (r11 > r12) goto L_0x0047
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x004a
        L_0x0047:
            r11 = 32768(0x8000, float:4.5918E-41)
        L_0x004a:
            r12 = r11
            r11 = 1
            goto L_0x00b5
        L_0x004e:
            r11 = -1
            r12 = -1
            goto L_0x00b5
        L_0x0051:
            com.zego.ve.MediaCodecVideoEncoder$VideoCodecType r6 = com.zego.p2623ve.MediaCodecVideoEncoder.VideoCodecType.VIDEO_CODEC_H265
            if (r5 != r6) goto L_0x0067
            java.lang.String r5 = "video/hevc"
            java.lang.String r6 = "video/hevc"
            com.zego.ve.MediaCodecVideoEncoder$MediaCodecProperties[] r11 = hevcHwList
            if (r23 == 0) goto L_0x0060
            int[] r12 = supportedSurfaceColorList
            goto L_0x0062
        L_0x0060:
            int[] r12 = supportedColorList
        L_0x0062:
            com.zego.ve.MediaCodecVideoEncoder$EncoderProperties r6 = findHwEncoder(r6, r11, r12)
            goto L_0x004e
        L_0x0067:
            com.zego.ve.MediaCodecVideoEncoder$VideoCodecType r6 = com.zego.p2623ve.MediaCodecVideoEncoder.VideoCodecType.VIDEO_CODEC_VP8
            if (r5 != r6) goto L_0x01b0
            java.lang.String r5 = "video/x-vnd.on2.vp8"
            java.lang.String r6 = "video/x-vnd.on2.vp8"
            com.zego.ve.MediaCodecVideoEncoder$MediaCodecProperties[] r11 = vp8HwList
            if (r23 == 0) goto L_0x0076
            int[] r12 = supportedSurfaceColorList
            goto L_0x0078
        L_0x0076:
            int[] r12 = supportedColorList
        L_0x0078:
            com.zego.ve.MediaCodecVideoEncoder$EncoderProperties r6 = findHwEncoder(r6, r11, r12)
            com.zego.ve.MediaCodecVideoEncoder$VideoCodecType r11 = r0.type
            com.zego.ve.MediaCodecVideoEncoder$VideoCodecType r12 = com.zego.p2623ve.MediaCodecVideoEncoder.VideoCodecType.VIDEO_CODEC_VP8
            if (r11 != r12) goto L_0x004e
            java.lang.String r11 = r6.codecName
            com.zego.ve.MediaCodecVideoEncoder$MediaCodecProperties r12 = qcomVp8HwProperties
            java.lang.String r12 = r12.codecPrefix
            boolean r11 = r11.startsWith(r12)
            if (r11 == 0) goto L_0x004e
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 == r7) goto L_0x00af
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 22
            if (r11 != r12) goto L_0x0099
            goto L_0x00af
        L_0x0099:
            int r11 = android.os.Build.VERSION.SDK_INT
            r12 = 23
            if (r11 != r12) goto L_0x00a5
            int r11 = r4 * 1000
            long r11 = (long) r11
            r0.forcedKeyFrameMs = r11
            goto L_0x004e
        L_0x00a5:
            int r11 = android.os.Build.VERSION.SDK_INT
            if (r11 <= r12) goto L_0x004e
            int r11 = r4 * 1000
            long r11 = (long) r11
            r0.forcedKeyFrameMs = r11
            goto L_0x004e
        L_0x00af:
            int r11 = r4 * 1000
            long r11 = (long) r11
            r0.forcedKeyFrameMs = r11
            goto L_0x004e
        L_0x00b5:
            if (r6 == 0) goto L_0x01a8
            runningInstance = r0
            int r13 = r6.colorFormat
            r0.colorFormat = r13
            com.zego.ve.MediaCodecVideoEncoder$BitrateAdjustmentType r13 = r6.bitrateAdjustmentType
            r0.bitrateAdjustmentType = r13
            r13 = 30
            r14 = r22
            int r13 = java.lang.Math.min(r14, r13)
            com.zego.ve.MediaCodecVideoEncoder$BitrateAdjustmentType r14 = r0.bitrateAdjustmentType
            com.zego.ve.MediaCodecVideoEncoder$BitrateAdjustmentType r15 = com.zego.p2623ve.MediaCodecVideoEncoder.BitrateAdjustmentType.FRAMERATE_ADJUSTMENT
            if (r14 != r15) goto L_0x00d1
            r0.originFps = r13
        L_0x00d1:
            r14 = r21
            r0.targetBitrateBps = r14
            r0.targetFps = r13
            int r13 = r0.targetBitrateBps
            double r13 = (double) r13
            r15 = 4620693217682128896(0x4020000000000000, double:8.0)
            java.lang.Double.isNaN(r13)
            double r13 = r13 / r15
            r0.bitrateAccumulatorMax = r13
            r13 = 0
            r0.bitrateAccumulator = r13
            r0.bitrateObservationTimeMs = r13
            r0.bitrateAdjustmentScaleExp = r10
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            r0.mediaCodecThread = r13
            android.media.MediaFormat r5 = android.media.MediaFormat.createVideoFormat(r5, r1, r2)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            java.lang.String r13 = "bitrate"
            int r14 = r0.targetBitrateBps     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            r5.setInteger(r13, r14)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            boolean r13 = r6.supportedCBR     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            if (r13 == 0) goto L_0x0105
            java.lang.String r13 = "bitrate-mode"
            r14 = 2
            r5.setInteger(r13, r14)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
        L_0x0105:
            java.lang.String r13 = "color-format"
            int r14 = r6.colorFormat     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            r5.setInteger(r13, r14)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            java.lang.String r13 = "frame-rate"
            int r14 = r0.targetFps     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            r5.setInteger(r13, r14)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            java.lang.String r13 = "i-frame-interval"
            r5.setInteger(r13, r4)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            if (r11 == r9) goto L_0x0124
            java.lang.String r4 = "profile"
            r5.setInteger(r4, r11)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            java.lang.String r4 = "level"
            r5.setInteger(r4, r12)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
        L_0x0124:
            java.lang.String r4 = r6.codecName     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            android.media.MediaCodec r4 = createByCodecName(r4)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            r0.mediaCodec = r4     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            com.zego.ve.MediaCodecVideoEncoder$VideoCodecType r4 = r0.type     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            r0.type = r4     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            android.media.MediaCodec r4 = r0.mediaCodec     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            if (r4 != 0) goto L_0x0135
            return r10
        L_0x0135:
            android.media.MediaCodec r4 = r0.mediaCodec     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            r6 = 0
            r4.configure(r5, r6, r6, r8)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            if (r23 == 0) goto L_0x0145
            android.media.MediaCodec r4 = r0.mediaCodec     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            android.view.Surface r4 = r4.createInputSurface()     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            r0.inputSurface = r4     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
        L_0x0145:
            android.media.MediaCodec r4 = r0.mediaCodec     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            r4.start()     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            if (r4 >= r7) goto L_0x0156
            android.media.MediaCodec r4 = r0.mediaCodec     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            java.nio.ByteBuffer[] r4 = r4.getOutputBuffers()     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            r0.outputBuffers = r4     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
        L_0x0156:
            if (r23 != 0) goto L_0x019f
            r0.stride = r10     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            r0.sliceHeight = r10     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            if (r3 >= r7) goto L_0x0169
            android.media.MediaCodec r3 = r0.mediaCodec     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            java.nio.ByteBuffer[] r3 = r3.getInputBuffers()     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            r0.inputBuffers = r3     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            goto L_0x018f
        L_0x0169:
            android.media.MediaCodec r3 = r0.mediaCodec     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            android.media.MediaFormat r3 = r3.getInputFormat()     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            java.lang.String r4 = "stride"
            boolean r4 = r3.containsKey(r4)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            if (r4 == 0) goto L_0x017f
            java.lang.String r4 = "stride"
            int r4 = r3.getInteger(r4)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            r0.stride = r4     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
        L_0x017f:
            java.lang.String r4 = "slice-height"
            boolean r4 = r3.containsKey(r4)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            if (r4 == 0) goto L_0x018f
            java.lang.String r4 = "slice-height"
            int r3 = r3.getInteger(r4)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            r0.sliceHeight = r3     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
        L_0x018f:
            int r3 = r0.stride     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            int r1 = java.lang.Math.max(r1, r3)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            r0.stride = r1     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            int r1 = r0.sliceHeight     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            int r1 = java.lang.Math.max(r2, r1)     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
            r0.sliceHeight = r1     // Catch:{ IllegalStateException -> 0x01a4, Exception -> 0x01a0 }
        L_0x019f:
            return r8
        L_0x01a0:
            printStackTrace()
            return r10
        L_0x01a4:
            printStackTrace()
            return r10
        L_0x01a8:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Can not find HW encoder for h264"
            r1.<init>(r2)
            throw r1
        L_0x01b0:
            return r10
        L_0x01b1:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Forgot to release()?"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zego.p2623ve.MediaCodecVideoEncoder.initEncode(int, int, int, int, int, boolean, int):boolean");
    }
}
