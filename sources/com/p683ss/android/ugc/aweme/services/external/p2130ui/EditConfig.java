package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.EditConfig */
public final class EditConfig {
    public static final Companion Companion = new Companion(null);
    private String ccvid;
    private AVChallenge challenge;
    private List<? extends AVChallenge> challenges;
    private boolean clear;
    private String creationId;
    private String enterFrom;
    private Integer launchFlag;
    private MediaInfo mediaInfo;
    private Integer requestCode;
    private String shootway;

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.EditConfig$Builder */
    public static class Builder {
        private EditConfig config = new EditConfig(null);

        public final EditConfig build() {
            return this.config;
        }

        public final Builder ccvid(String str) {
            C52711k.m112240b(str, "ccvid");
            Builder builder = this;
            builder.config.setCcvid(str);
            return builder;
        }

        public final Builder challenge(AVChallenge aVChallenge) {
            C52711k.m112240b(aVChallenge, "challenge");
            Builder builder = this;
            builder.config.setChallenge(aVChallenge);
            return builder;
        }

        public final Builder challenges(List<? extends AVChallenge> list) {
            C52711k.m112240b(list, "challenges");
            Builder builder = this;
            builder.config.setChallenges(list);
            return builder;
        }

        public final Builder clear(boolean z) {
            Builder builder = this;
            builder.config.setClear(z);
            return builder;
        }

        public final Builder creationId(String str) {
            Builder builder = this;
            builder.config.setCreationId(str);
            return builder;
        }

        public final Builder enterFrom(String str) {
            Builder builder = this;
            builder.config.setEnterFrom(str);
            return builder;
        }

        public final Builder launchFlag(int i) {
            Builder builder = this;
            builder.config.setLaunchFlag(Integer.valueOf(i));
            return builder;
        }

        public final Builder mediaInfo(MediaInfo mediaInfo) {
            C52711k.m112240b(mediaInfo, "mediaInfo");
            Builder builder = this;
            builder.config.setMediaInfo(mediaInfo);
            return builder;
        }

        public final Builder requestCode(int i) {
            Builder builder = this;
            builder.config.setRequestCode(Integer.valueOf(i));
            return builder;
        }

        public final Builder shootWay(String str) {
            Builder builder = this;
            builder.config.setShootway(str);
            return builder;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.EditConfig$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    private EditConfig() {
    }

    public final String getCcvid() {
        return this.ccvid;
    }

    public final AVChallenge getChallenge() {
        return this.challenge;
    }

    public final List<AVChallenge> getChallenges() {
        return this.challenges;
    }

    public final boolean getClear() {
        return this.clear;
    }

    public final String getCreationId() {
        return this.creationId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final Integer getLaunchFlag() {
        return this.launchFlag;
    }

    public final MediaInfo getMediaInfo() {
        return this.mediaInfo;
    }

    public final Integer getRequestCode() {
        return this.requestCode;
    }

    public final String getShootway() {
        return this.shootway;
    }

    public final void setCcvid(String str) {
        this.ccvid = str;
    }

    public final void setChallenge(AVChallenge aVChallenge) {
        this.challenge = aVChallenge;
    }

    public final void setChallenges(List<? extends AVChallenge> list) {
        this.challenges = list;
    }

    public final void setClear(boolean z) {
        this.clear = z;
    }

    public final void setCreationId(String str) {
        this.creationId = str;
    }

    public final void setEnterFrom(String str) {
        this.enterFrom = str;
    }

    public final void setLaunchFlag(Integer num) {
        this.launchFlag = num;
    }

    public final void setMediaInfo(MediaInfo mediaInfo2) {
        this.mediaInfo = mediaInfo2;
    }

    public final void setRequestCode(Integer num) {
        this.requestCode = num;
    }

    public final void setShootway(String str) {
        this.shootway = str;
    }

    public /* synthetic */ EditConfig(C52707g gVar) {
        this();
    }
}
