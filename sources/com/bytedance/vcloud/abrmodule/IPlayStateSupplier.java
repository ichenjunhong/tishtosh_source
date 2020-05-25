package com.bytedance.vcloud.abrmodule;

import java.util.Map;
import java.util.Queue;

public interface IPlayStateSupplier {
    Map<String, IBufferInfo> getAudioBufferInfo();

    int getCurrentDownloadAudioBitrate();

    int getCurrentDownloadVideoBitrate();

    int getMaxCacheAudioTime();

    int getMaxCacheVideoTime();

    float getNetworkSpeed();

    float getPlaySpeed();

    int getPlayerAudioCacheTime();

    int getPlayerVideoCacheTime();

    Queue<ISpeedRecord> getTimelineNetworkSpeed();

    Map<String, IBufferInfo> getVideoBufferInfo();
}
