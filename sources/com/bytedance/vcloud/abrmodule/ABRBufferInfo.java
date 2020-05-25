package com.bytedance.vcloud.abrmodule;

public class ABRBufferInfo implements IBufferInfo {
    private long mFileAvailSize = -1;
    private float mPlayerAvailDuration = -1.0f;
    private String mStreamId = "";

    public long getFileAvailSize() {
        return this.mFileAvailSize;
    }

    public float getPlayerAvailDuration() {
        return this.mPlayerAvailDuration;
    }

    public String getStreamId() {
        return this.mStreamId;
    }

    public void setFileAvailSize(long j) {
        this.mFileAvailSize = j;
    }

    public void setPlayerAvailDuration(float f) {
        this.mPlayerAvailDuration = f;
    }

    public void setStreamId(String str) {
        this.mStreamId = str;
    }
}
