package com.bytedance.vcloud.abrmodule;

public interface IStream {
    int getBandwidth();

    String getCodec();

    int getSegmentDuration();

    String getStreamId();
}
