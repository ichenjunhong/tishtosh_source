package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17950a;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo */
public class AwemeSplashInfo implements Serializable {
    public transient boolean adCardShownOnce;
    @C17952c(mo34828a = "awesome_splash_id")
    private String awesomeSplashId;
    public transient boolean contextTrackSent;
    @C17952c(mo34828a = "disable_hotstart_show")
    private boolean disableHotStartShow;
    @C17952c(mo34828a = "enable_splash_open")
    private boolean enableSplashOpen;
    @C17952c(mo34828a = "end_time")
    private int endTime;
    @C17952c(mo34828a = "hot_show_type")
    private int hotShowType;
    @C17952c(mo34828a = "is_invalid_ad")
    private boolean isInvalidAd;
    @C17950a(mo34824a = false, mo34825b = false)
    private transient boolean isShown;
    @C17952c(mo34828a = "label_info")
    private LabelInfo labelInfo;
    @C17952c(mo34828a = "predownload_text")
    private String predownloadText;
    @C17952c(mo34828a = "preload_type")
    private int preloadType;
    @C17952c(mo34828a = "skip_info")
    private SkipInfo skipInfo;
    @C17952c(mo34828a = "splash_show_time")
    private float splashShowTime = 3000.0f;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo$LabelInfo */
    public class LabelInfo implements Serializable {
        @C17952c(mo34828a = "background_color")
        private String backgroundColor;
        @C17952c(mo34828a = "position")
        private int position;
        @C17952c(mo34828a = "text")
        private String text;
        @C17952c(mo34828a = "text_color")
        private String textColor;

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public int getPosition() {
            return this.position;
        }

        public String getText() {
            return this.text;
        }

        public String getTextColor() {
            return this.textColor;
        }

        public LabelInfo() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeSplashInfo$SkipInfo */
    public class SkipInfo implements Serializable {
        @C17952c(mo34828a = "background_color")
        private String backgroundColor;
        @C17952c(mo34828a = "countdown_unit")
        private String countdownUnit;
        @C17952c(mo34828a = "countdown_enable")
        private int countdown_enable;
        @C17952c(mo34828a = "height_extra_size")
        private int heightExtraSize;
        @C17952c(mo34828a = "text")
        private String text;
        @C17952c(mo34828a = "text_color")
        private String textColor;
        @C17952c(mo34828a = "width_extra_size")
        private int widthExtraSize;

        public String getBackgroundColor() {
            return this.backgroundColor;
        }

        public String getCountdownUnit() {
            return this.countdownUnit;
        }

        public int getHeightExtraSize() {
            return this.heightExtraSize;
        }

        public String getText() {
            return this.text;
        }

        public String getTextColor() {
            return this.textColor;
        }

        public int getWidthExtraSize() {
            return this.widthExtraSize;
        }

        public boolean isCountdown_enable() {
            if (this.countdown_enable == 1) {
                return true;
            }
            return false;
        }

        public SkipInfo() {
        }
    }

    public String getAwesomeSplashId() {
        return this.awesomeSplashId;
    }

    public int getEndTime() {
        return this.endTime;
    }

    public int getHotShowType() {
        return this.hotShowType;
    }

    public LabelInfo getLabelInfo() {
        return this.labelInfo;
    }

    public String getPredownloadText() {
        return this.predownloadText;
    }

    public int getPreloadType() {
        return this.preloadType;
    }

    public SkipInfo getSkipInfo() {
        return this.skipInfo;
    }

    public float getSplashShowTime() {
        return this.splashShowTime;
    }

    public boolean isDisableHotStartShow() {
        return this.disableHotStartShow;
    }

    public boolean isEnableSplashOpen() {
        return this.enableSplashOpen;
    }

    public boolean isInvalidAd() {
        return this.isInvalidAd;
    }

    public boolean isShown() {
        return this.isShown;
    }

    public void setAwesomeSplashId(String str) {
        this.awesomeSplashId = str;
    }

    public void setEnableSplashOpen(boolean z) {
        this.enableSplashOpen = z;
    }

    public void setEndTime(int i) {
        this.endTime = i;
    }

    public void setHotShowType(int i) {
        this.hotShowType = i;
    }

    public void setInvalidAd(boolean z) {
        this.isInvalidAd = z;
    }

    public void setPreloadType(int i) {
        this.preloadType = i;
    }

    public void setShown(boolean z) {
        this.isShown = z;
    }

    public void setSplashShowTime(float f) {
        this.splashShowTime = f;
    }
}
