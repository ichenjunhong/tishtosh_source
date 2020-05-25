package com.bytedance.vcloud.abrmodule;

public class ABRVideoStream implements IVideoStream {
    public int mBandWidth;
    private String mCodec;
    private int mFrameRate;
    private int mHeight;
    private int mSegmentDuration;
    private String mStreamId = "";
    private int mWidth;

    public int getBandwidth() {
        return this.mBandWidth;
    }

    public String getCodec() {
        return this.mCodec;
    }

    public float getFrameRate() {
        return (float) this.mFrameRate;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getSegmentDuration() {
        return this.mSegmentDuration;
    }

    public String getStreamId() {
        return this.mStreamId;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public void setBandWidth(int i) {
        this.mBandWidth = i;
    }

    public void setCodec(String str) {
        this.mCodec = str;
    }

    public void setFrameRate(int i) {
        this.mFrameRate = i;
    }

    public void setHeight(int i) {
        this.mHeight = i;
    }

    public void setSegmentDuration(int i) {
        this.mSegmentDuration = i;
    }

    public void setStreamId(String str) {
        this.mStreamId = str;
    }

    public void setWidth(int i) {
        this.mWidth = i;
    }
}
