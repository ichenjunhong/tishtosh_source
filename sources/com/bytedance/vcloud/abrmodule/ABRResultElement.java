package com.bytedance.vcloud.abrmodule;

public class ABRResultElement {
    private long bitrate;
    private int mediaType;
    private int seconds;

    public long getBitrate() {
        return this.bitrate;
    }

    public int getMediaType() {
        return this.mediaType;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public ABRResultElement(long j, int i, int i2) {
        this.bitrate = j;
        this.seconds = i;
        this.mediaType = i2;
    }
}
