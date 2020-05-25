package com.bytedance.vcloud.abrmodule;

public interface ISpeedRecord {
    long getBytes();

    String getStreamId();

    long getTime();

    long getTimestamp();

    int getTrackType();
}
