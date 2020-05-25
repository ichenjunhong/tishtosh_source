package com.p683ss.android.ugc.aweme.feed.model.live;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrlExtra */
public class LiveStreamUrlExtra implements Serializable {
    private static final int DEFAULT_DEFAULT_BITRATE = 500;
    private static final int DEFAULT_FPS = 15;
    private static final int DEFAULT_HEIGHT = 640;
    private static final int DEFAULT_MAX_BITRATE = 800;
    private static final int DEFAULT_MIN_BITRATE = 200;
    private static final int DEFAULT_PREVIEW_HEIGHT = 1280;
    private static final int DEFAULT_PREVIEW_WIDTH = 720;
    private static final int DEFAULT_PROFILE = 1;
    private static final int DEFAULT_WIDTH = 360;
    @C17952c(mo34828a = "anchor_interact_profile")
    int anchorInteractProfile;
    @C17952c(mo34828a = "audience_interact_profile")
    int audienceInteractProfile;
    @C17952c(mo34828a = "bitrate_adapt_strategy")
    int bitrateAdaptStrategy;
    @C17952c(mo34828a = "default_bitrate")
    int defaultBitrate = 500;
    @C17952c(mo34828a = "bframe_enable")
    boolean enableBFrame = true;
    @C17952c(mo34828a = "h265_enable")
    boolean enableH265;
    @C17952c(mo34828a = "fps")
    int fps = 15;
    @C17952c(mo34828a = "gop_sec")
    float gopSec = 2.0f;
    @C17952c(mo34828a = "hardware_encode")
    boolean hardwareEncode;
    @C17952c(mo34828a = "height")
    int height = DEFAULT_HEIGHT;
    @C17952c(mo34828a = "roi")
    boolean isRoi;
    @C17952c(mo34828a = "sw_roi")
    boolean isSwRoi;
    @C17952c(mo34828a = "max_bitrate")
    int maxBitrate = DEFAULT_MAX_BITRATE;
    @C17952c(mo34828a = "min_bitrate")
    int minBitrate = 200;
    @C17952c(mo34828a = "ngb_push_url")
    String ngbPushUrl = "";
    @C17952c(mo34828a = "ngb_push_url_postfix")
    String ngbPushUrlPrefix = "";
    private int previewHeight;
    private int previewWidth;
    @C17952c(mo34828a = "video_profile")
    int profile = 1;
    @C17952c(mo34828a = "super_resolution")
    SrConfig srConfig;
    @C17952c(mo34828a = "width")
    int width = DEFAULT_WIDTH;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveStreamUrlExtra$SrConfig */
    public static class SrConfig implements Serializable {
        @C17952c(mo34828a = "antialiasing")
        public boolean antiAlias;
        @C17952c(mo34828a = "enable")
        public boolean enabled;
        @C17952c(mo34828a = "strength")
        public int strength;

        public SrConfig() {
            this(false, false, 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SrConfig{enabled=");
            sb.append(this.enabled);
            sb.append(", antiAlias=");
            sb.append(this.antiAlias);
            sb.append(", strength=");
            sb.append(this.strength);
            sb.append('}');
            return sb.toString();
        }

        public SrConfig(boolean z, boolean z2, int i) {
            this.enabled = z;
            this.antiAlias = z2;
            this.strength = i;
        }
    }

    public int getAnchorInteractProfile() {
        return this.anchorInteractProfile;
    }

    public int getAudienceInteractProfile() {
        return this.audienceInteractProfile;
    }

    public int getBitrateAdaptStrategy() {
        return this.bitrateAdaptStrategy;
    }

    public float getGopSec() {
        return this.gopSec;
    }

    public String getNgbPushUrl() {
        return this.ngbPushUrl;
    }

    public String getNgbPushUrlPrefix() {
        return this.ngbPushUrlPrefix;
    }

    public int getProfile() {
        return this.profile;
    }

    public SrConfig getSrConfig() {
        return this.srConfig;
    }

    public boolean isEnableBFrame() {
        return this.enableBFrame;
    }

    public boolean isEnableH265() {
        return this.enableH265;
    }

    public boolean isHardwareEncode() {
        return this.hardwareEncode;
    }

    public boolean isRoi() {
        return this.isRoi;
    }

    public boolean isSwRoi() {
        return this.isSwRoi;
    }

    public int getDefaultBitrate() {
        if (this.defaultBitrate == 0) {
            this.defaultBitrate = 500;
        }
        return this.defaultBitrate;
    }

    public int getFPS() {
        if (this.fps == 0) {
            this.fps = 15;
        }
        return this.fps;
    }

    public int getHeight() {
        if (this.height == 0) {
            this.height = DEFAULT_HEIGHT;
        }
        return this.height;
    }

    public int getMinBitrate() {
        if (this.minBitrate == 0) {
            this.minBitrate = 200;
        }
        return this.minBitrate;
    }

    public int getPreviewHeight() {
        if (this.previewHeight == 0) {
            return DEFAULT_PREVIEW_HEIGHT;
        }
        return this.previewHeight;
    }

    public int getPreviewWidth() {
        if (this.previewWidth == 0) {
            return DEFAULT_PREVIEW_WIDTH;
        }
        return this.previewWidth;
    }

    public int getWidth() {
        if (this.width == 0) {
            this.width = DEFAULT_WIDTH;
        }
        return this.width;
    }

    public int getMaxBitrate() {
        if (this.maxBitrate == 0) {
            this.maxBitrate = (getDefaultBitrate() * 2) - getMinBitrate();
        }
        return this.maxBitrate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LiveStreamUrlExtra{ngbPushUrl='");
        sb.append(this.ngbPushUrl);
        sb.append('\'');
        sb.append(", ngbPushUrlPrefix='");
        sb.append(this.ngbPushUrlPrefix);
        sb.append('\'');
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", minBitrate=");
        sb.append(this.minBitrate);
        sb.append(", defaultBitrate=");
        sb.append(this.defaultBitrate);
        sb.append(", maxBitrate=");
        sb.append(this.maxBitrate);
        sb.append(", profile=");
        sb.append(this.profile);
        sb.append(", hardwareEncode=");
        sb.append(this.hardwareEncode);
        sb.append(", bitrateAdaptStrategy=");
        sb.append(this.bitrateAdaptStrategy);
        sb.append(", fps=");
        sb.append(this.fps);
        sb.append(", anchorInteractProfile=");
        sb.append(this.anchorInteractProfile);
        sb.append(", audienceInteractProfile=");
        sb.append(this.audienceInteractProfile);
        sb.append(", srConfig=");
        sb.append(this.srConfig);
        sb.append(", enableH265=");
        sb.append(this.enableH265);
        sb.append(", gopSec=");
        sb.append(this.gopSec);
        sb.append(", enableBFrame=");
        sb.append(this.enableBFrame);
        sb.append(", isRoi=");
        sb.append(this.isRoi);
        sb.append(", isSwRoi=");
        sb.append(this.isSwRoi);
        sb.append(", previewWidth=");
        sb.append(this.previewWidth);
        sb.append(", previewHeight=");
        sb.append(this.previewHeight);
        sb.append('}');
        return sb.toString();
    }

    public void setAnchorInteractProfile(int i) {
        this.anchorInteractProfile = i;
    }

    public void setAudienceInteractProfile(int i) {
        this.audienceInteractProfile = i;
    }

    @C17952c(mo34828a = "bitrate_adapt_strategy")
    public void setBitrateAdaptStrategy(int i) {
        this.bitrateAdaptStrategy = i;
    }

    public void setDefaultBitrate(int i) {
        this.defaultBitrate = i;
    }

    @C17952c(mo34828a = "bframe_enable")
    public void setEnableBFrame(boolean z) {
        this.enableBFrame = z;
    }

    @C17952c(mo34828a = "h265_enable")
    public void setEnableH265(boolean z) {
        this.enableH265 = z;
    }

    public void setFPS(int i) {
        this.fps = i;
    }

    @C17952c(mo34828a = "gop_sec")
    public void setGopSec(float f) {
        this.gopSec = f;
    }

    public void setHardwareEncode(boolean z) {
        this.hardwareEncode = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setMaxBitrate(int i) {
        this.maxBitrate = i;
    }

    public void setMinBitrate(int i) {
        this.minBitrate = i;
    }

    public void setNgbPushUrl(String str) {
        this.ngbPushUrl = str;
    }

    public void setNgbPushUrlPrefix(String str) {
        this.ngbPushUrlPrefix = str;
    }

    public void setProfile(int i) {
        this.profile = i;
    }

    @C17952c(mo34828a = "roi")
    public void setRoi(boolean z) {
        this.isRoi = z;
    }

    public void setSrConfig(SrConfig srConfig2) {
        this.srConfig = srConfig2;
    }

    @C17952c(mo34828a = "sw_roi")
    public void setSwRoi(boolean z) {
        this.isSwRoi = z;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
