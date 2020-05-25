package org.webrtc;

public interface VideoEncoder {

    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    public static class CodecSpecificInfo {
    }

    public enum ScaleMode {
        AUTO(0),
        STRETCH(1),
        FIT_WITH_CROPPING(2),
        FIT_WITH_FILLING(3);
        
        private int value;

        static ScaleMode fromValue(int i) {
            switch (i) {
                case 0:
                    return AUTO;
                case 1:
                    return STRETCH;
                case 2:
                    return FIT_WITH_CROPPING;
                case 3:
                    return FIT_WITH_FILLING;
                default:
                    return AUTO;
            }
        }

        private ScaleMode(int i) {
            this.value = i;
        }
    }

    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;

        /* renamed from: on */
        public final boolean f133446on;

        private ScalingSettings() {
        }

        public String toString() {
            if (!this.f133446on) {
                return "OFF";
            }
            StringBuilder sb = new StringBuilder("[ ");
            sb.append(this.low);
            sb.append(", ");
            sb.append(this.high);
            sb.append(" ]");
            return sb.toString();
        }

        public ScalingSettings(boolean z) {
            this.f133446on = z;
        }

        public ScalingSettings(int i, int i2) {
            this.f133446on = true;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        public ScalingSettings(boolean z, int i, int i2) {
            this.f133446on = z;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }
    }

    public static class Settings {
        public final int height;
        public final ScaleMode scaleMode;
        public final int targetBps;
        public final int targetFps;
        public final int width;

        public Settings(int i, int i2, int i3, int i4, int i5) {
            this.width = i;
            this.height = i2;
            this.scaleMode = ScaleMode.fromValue(i3);
            this.targetBps = i4;
            this.targetFps = i5;
        }
    }

    VideoCodecStatus encode(VideoFrame videoFrame, boolean z);

    VideoCodecStatus initEncode(Settings settings, Callback callback);

    VideoCodecStatus release();

    VideoCodecStatus requestKeyFrame();

    VideoCodecStatus setRateAllocation(int i, int i2);
}
