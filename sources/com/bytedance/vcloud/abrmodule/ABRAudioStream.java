package com.bytedance.vcloud.abrmodule;

public class ABRAudioStream implements IAudioStream {
    public int mBandWidth;
    private String mCodec;
    private int mSampleRate;
    private int mSegmentDuration;
    private String mStreamId = "";

    public int getBandwidth() {
        return 0;
    }

    public String getCodec() {
        return null;
    }

    public int getSampleRate() {
        return 0;
    }

    public int getSegmentDuration() {
        return 0;
    }

    public String getStreamId() {
        return null;
    }

    public void setBandWidth(int i) {
        this.mBandWidth = i;
    }

    public void setCodec(String str) {
        this.mCodec = str;
    }

    public void setSampleRate(int i) {
        this.mSampleRate = i;
    }

    public void setSegmentDuration(int i) {
        this.mSegmentDuration = i;
    }

    public void setStreamId(String str) {
        this.mStreamId = str;
    }
}
