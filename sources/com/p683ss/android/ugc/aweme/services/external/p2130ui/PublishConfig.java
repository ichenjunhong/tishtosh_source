package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.PublishConfig */
public final class PublishConfig {
    private String challenge;
    public String creationId;
    public String enterFrom;
    private Boolean fastPublish;
    private String musicId;
    public String shootway;
    private String videoId;
    private String videoPath;

    /* renamed from: com.ss.android.ugc.aweme.services.external.ui.PublishConfig$Builder */
    public static class Builder {
        private PublishConfig config = new PublishConfig(null);

        public final PublishConfig build() {
            return this.config;
        }

        public final Builder challenge(String str) {
            C52711k.m112240b(str, "challenge");
            Builder builder = this;
            builder.config.setChallenge(str);
            return builder;
        }

        public final Builder creationId(String str) {
            C52711k.m112240b(str, "creationId");
            Builder builder = this;
            builder.config.setCreationId(str);
            return builder;
        }

        public final Builder enterFrom(String str) {
            C52711k.m112240b(str, "enterFrom");
            Builder builder = this;
            builder.config.setEnterFrom(str);
            return builder;
        }

        public final Builder fastPublish(boolean z) {
            Builder builder = this;
            builder.config.setFastPublish(Boolean.valueOf(z));
            return builder;
        }

        public final Builder musicId(String str) {
            C52711k.m112240b(str, "musicId");
            Builder builder = this;
            builder.config.setMusicId(str);
            return builder;
        }

        public final Builder shootWay(String str) {
            C52711k.m112240b(str, "shootway");
            Builder builder = this;
            builder.config.setShootway(str);
            return builder;
        }

        public final Builder videoId(String str) {
            C52711k.m112240b(str, "videoId");
            Builder builder = this;
            builder.config.setVideoId(str);
            return builder;
        }

        public final Builder videoPath(String str) {
            C52711k.m112240b(str, LeakCanaryFileProvider.f132050j);
            Builder builder = this;
            builder.config.setVideoPath(str);
            return builder;
        }
    }

    private PublishConfig() {
    }

    public final String getChallenge() {
        return this.challenge;
    }

    public final Boolean getFastPublish() {
        return this.fastPublish;
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final String getCreationId() {
        String str = this.creationId;
        if (str == null) {
            C52711k.m112237a("creationId");
        }
        return str;
    }

    public final String getEnterFrom() {
        String str = this.enterFrom;
        if (str == null) {
            C52711k.m112237a("enterFrom");
        }
        return str;
    }

    public final String getShootway() {
        String str = this.shootway;
        if (str == null) {
            C52711k.m112237a("shootway");
        }
        return str;
    }

    public final void setChallenge(String str) {
        this.challenge = str;
    }

    public final void setFastPublish(Boolean bool) {
        this.fastPublish = bool;
    }

    public final void setMusicId(String str) {
        this.musicId = str;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }

    public /* synthetic */ PublishConfig(C52707g gVar) {
        this();
    }

    public final void setCreationId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.creationId = str;
    }

    public final void setEnterFrom(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.enterFrom = str;
    }

    public final void setShootway(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.shootway = str;
    }
}
