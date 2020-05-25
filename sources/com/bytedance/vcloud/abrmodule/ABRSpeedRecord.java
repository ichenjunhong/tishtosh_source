package com.bytedance.vcloud.abrmodule;

public class ABRSpeedRecord implements ISpeedRecord {
    private long mBytes;
    private String mStreamId = "";
    private long mTime;
    private long mTimestamp;
    private int mTrackType;

    public long getBytes() {
        return this.mBytes;
    }

    public String getStreamId() {
        return this.mStreamId;
    }

    public long getTime() {
        return this.mTime;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public int getTrackType() {
        return this.mTrackType;
    }

    public void setBytes(long j) {
        this.mBytes = j;
    }

    public void setSteamId(String str) {
        this.mStreamId = str;
    }

    public void setTime(long j) {
        this.mTime = j;
    }

    public void setTimestamp(long j) {
        this.mTimestamp = j;
    }

    public void setTrackType(int i) {
        this.mTrackType = i;
    }
}
