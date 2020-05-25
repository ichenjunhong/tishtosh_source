package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model;

import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareAwemeConfig */
public final class ShareAwemeConfig {
    public static final Companion Companion = new Companion(null);
    private boolean autoPlay;
    private int borderRadius = C23728o.m58241a(4.0d);
    private boolean enablePlayControl;
    private float height = ((float) C23728o.m58241a(252.0d));
    private boolean isLoop;
    private boolean isMute = true;
    private boolean needResize;
    private boolean showMuteBtn;
    private boolean showTitle = true;
    private float width = ((float) C23728o.m58241a(158.0d));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareAwemeConfig$Builder */
    public static final class Builder {
        private final ShareAwemeConfig mConfig = new ShareAwemeConfig();

        public final ShareAwemeConfig build() {
            return this.mConfig;
        }

        public final Builder autoPlay(boolean z) {
            this.mConfig.setAutoPlay(z);
            return this;
        }

        public final Builder borderRadius(int i) {
            this.mConfig.setBorderRadius(i);
            return this;
        }

        public final Builder enablePlayControl(boolean z) {
            this.mConfig.setEnablePlayControl(z);
            return this;
        }

        public final Builder height(float f) {
            this.mConfig.setHeight(f);
            return this;
        }

        public final Builder isLoop(boolean z) {
            this.mConfig.setLoop(z);
            return this;
        }

        public final Builder isMute(boolean z) {
            this.mConfig.setMute(z);
            return this;
        }

        public final Builder needResize(boolean z) {
            this.mConfig.setNeedResize(z);
            return this;
        }

        public final Builder showMuteBtn(boolean z) {
            this.mConfig.setShowMuteBtn(z);
            return this;
        }

        public final Builder showTitle(boolean z) {
            this.mConfig.setShowTitle(z);
            return this;
        }

        public final Builder width(float f) {
            this.mConfig.setWidth(f);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareAwemeConfig$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    public final int getBorderRadius() {
        return this.borderRadius;
    }

    public final boolean getEnablePlayControl() {
        return this.enablePlayControl;
    }

    public final float getHeight() {
        return this.height;
    }

    public final boolean getNeedResize() {
        return this.needResize;
    }

    public final boolean getShowMuteBtn() {
        return this.showMuteBtn;
    }

    public final boolean getShowTitle() {
        return this.showTitle;
    }

    public final float getWidth() {
        return this.width;
    }

    public final boolean isLoop() {
        return this.isLoop;
    }

    public final boolean isMute() {
        return this.isMute;
    }

    public final void setAutoPlay(boolean z) {
        this.autoPlay = z;
    }

    public final void setBorderRadius(int i) {
        this.borderRadius = i;
    }

    public final void setEnablePlayControl(boolean z) {
        this.enablePlayControl = z;
    }

    public final void setHeight(float f) {
        this.height = f;
    }

    public final void setLoop(boolean z) {
        this.isLoop = z;
    }

    public final void setMute(boolean z) {
        this.isMute = z;
    }

    public final void setNeedResize(boolean z) {
        this.needResize = z;
    }

    public final void setShowMuteBtn(boolean z) {
        this.showMuteBtn = z;
    }

    public final void setShowTitle(boolean z) {
        this.showTitle = z;
    }

    public final void setWidth(float f) {
        this.width = f;
    }
}
