package com.p683ss.video.rtc.interact.model;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: com.ss.video.rtc.interact.model.CommonType */
public class CommonType {

    /* renamed from: com.ss.video.rtc.interact.model.CommonType$FrameFormat */
    public enum FrameFormat {
        TEXTURE_2D,
        TEXTURE_OES
    }

    /* renamed from: com.ss.video.rtc.interact.model.CommonType$NetworkQuality */
    public static class NetworkQuality {
    }

    /* renamed from: com.ss.video.rtc.interact.model.CommonType$VideoOutputFormat */
    public enum VideoOutputFormat {
        PIXEL_FORMAT_UNKNOWN,
        PIXEL_FORMAT_I420,
        PIXEL_FORMAT_NV12,
        PIXEL_FORMAT_NV21,
        PIXEL_FORMAT_BGRA32,
        PIXEL_FORMAT_RGBA32,
        PIXEL_FORMAT_ARGB32,
        PIXEL_FORMAT_ABGR32,
        TEXTURE_2D,
        TEXTURE_OES
    }

    /* renamed from: com.ss.video.rtc.interact.model.CommonType$VideoQuality */
    public static class VideoQuality {
        public static final VideoQuality ANCHOR_HIGH = new VideoQuality(CommonType.align16(480), CommonType.align16(864), 15, 1200);
        public static final VideoQuality ANCHOR_NORMAL = new VideoQuality(CommonType.align16(360), CommonType.align16(640), 15, 800);
        public static final VideoQuality GUEST_HIGH = new VideoQuality(CommonType.align16(240), CommonType.align16(320), 15, 360);
        public static final VideoQuality GUEST_NORMAL = new VideoQuality(CommonType.align16(NormalGiftView.ALPHA_180), CommonType.align16(240), 15, 240);
        public static final VideoQuality MIN = new VideoQuality(16, 16, 15, 50);
        private int mBitrate;
        private int mFps;
        private int mHeight;
        private int mWidth;

        public int getBitrate() {
            return this.mBitrate;
        }

        public int getFps() {
            return this.mFps;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getWidth() {
            return this.mWidth;
        }

        public VideoQuality(int i, int i2, int i3, int i4) {
            this.mWidth = i;
            this.mHeight = i2;
            this.mFps = i3;
            this.mBitrate = i4;
        }
    }

    public static int align16(int i) {
        return ((i + 15) / 16) * 16;
    }
}
