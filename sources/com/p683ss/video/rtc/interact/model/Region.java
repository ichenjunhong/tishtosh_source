package com.p683ss.video.rtc.interact.model;

/* renamed from: com.ss.video.rtc.interact.model.Region */
public class Region {
    private double mHeight;
    private String mInteractId;
    private int mMediaType;
    private boolean mMuteAudio;
    private boolean mNeedWriteToSei = true;
    private int mStatus;
    private boolean mTalking;
    private long mUserId;
    private double mWidth;

    /* renamed from: mX */
    private double f128977mX;

    /* renamed from: mY */
    private double f128978mY;

    public double getHeight() {
        return this.mHeight;
    }

    public String getInteractId() {
        return this.mInteractId;
    }

    public int getMediaType() {
        return this.mMediaType;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public long getUserId() {
        return this.mUserId;
    }

    public double getWidth() {
        return this.mWidth;
    }

    public double getX() {
        return this.f128977mX;
    }

    public double getY() {
        return this.f128978mY;
    }

    public boolean isMuteAudio() {
        return this.mMuteAudio;
    }

    public boolean isTalking() {
        return this.mTalking;
    }

    public boolean needWriteToSei() {
        return this.mNeedWriteToSei;
    }

    public Region interactId(String str) {
        this.mInteractId = str;
        return this;
    }

    public Region mediaType(int i) {
        this.mMediaType = i;
        return this;
    }

    public Region muteAudio(boolean z) {
        this.mMuteAudio = z;
        return this;
    }

    public Region status(int i) {
        this.mStatus = i;
        return this;
    }

    public Region talking(boolean z) {
        this.mTalking = z;
        return this;
    }

    public Region userId(long j) {
        this.mUserId = j;
        return this;
    }

    public Region writeToSei(boolean z) {
        this.mNeedWriteToSei = z;
        return this;
    }

    public Region position(double d, double d2) {
        this.f128977mX = d;
        this.f128978mY = d2;
        return this;
    }

    public Region size(double d, double d2) {
        this.mWidth = d;
        this.mHeight = d2;
        return this;
    }
}
