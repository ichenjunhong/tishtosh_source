package com.p683ss.android.ugc.aweme.services.external.p2130ui;

import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.external.ui.DuetConfig */
public final class DuetConfig {
    private final Serializable author;
    private String duetChallenge;
    private final String duetFrom;
    private Integer duetGameScore = Integer.valueOf(0);
    private int duetVideoHeight;
    private int duetVideoWidth;
    private StickerDownloadConfig mStickerDownloadConfig;
    private final int minDuration;
    private final String mp4Path;
    private final String originVideo;
    public String outputDir;
    private final String wavPath;

    public final Serializable getAuthor() {
        return this.author;
    }

    public final String getDuetChallenge() {
        return this.duetChallenge;
    }

    public final String getDuetFrom() {
        return this.duetFrom;
    }

    public final Integer getDuetGameScore() {
        return this.duetGameScore;
    }

    public final int getDuetVideoHeight() {
        return this.duetVideoHeight;
    }

    public final int getDuetVideoWidth() {
        return this.duetVideoWidth;
    }

    public final StickerDownloadConfig getMStickerDownloadConfig() {
        return this.mStickerDownloadConfig;
    }

    public final int getMinDuration() {
        return this.minDuration;
    }

    public final String getMp4Path() {
        return this.mp4Path;
    }

    public final String getOriginVideo() {
        return this.originVideo;
    }

    public final String getWavPath() {
        return this.wavPath;
    }

    public final String getOutputDir() {
        String str = this.outputDir;
        if (str == null) {
            C52711k.m112237a("outputDir");
        }
        return str;
    }

    public final void setDuetChallenge(String str) {
        this.duetChallenge = str;
    }

    public final void setDuetGameScore(Integer num) {
        this.duetGameScore = num;
    }

    public final void setDuetVideoHeight(int i) {
        this.duetVideoHeight = i;
    }

    public final void setDuetVideoWidth(int i) {
        this.duetVideoWidth = i;
    }

    public final void setMStickerDownloadConfig(StickerDownloadConfig stickerDownloadConfig) {
        this.mStickerDownloadConfig = stickerDownloadConfig;
    }

    public final void setOutputDir(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.outputDir = str;
    }

    public DuetConfig(String str, String str2, String str3, Serializable serializable, String str4, int i) {
        C52711k.m112240b(str, "originVideo");
        C52711k.m112240b(str2, "mp4Path");
        C52711k.m112240b(str3, "wavPath");
        C52711k.m112240b(serializable, "author");
        C52711k.m112240b(str4, "duetFrom");
        this.originVideo = str;
        this.mp4Path = str2;
        this.wavPath = str3;
        this.author = serializable;
        this.duetFrom = str4;
        this.minDuration = i;
    }
}
