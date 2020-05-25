package com.bytedance.vcloud.abrmodule;

import java.util.Map;

public interface IABRModule {
    ABRResult getNextSegmentBitrate();

    ABRResult getStartupBitrate();

    void init(IInitParams iInitParams, IPlayStateSupplier iPlayStateSupplier);

    void release();

    void setInfoListener(IABRInfoListener iABRInfoListener);

    void setMediaInfo(Map<String, IVideoStream> map, Map<String, IAudioStream> map2);

    void start();

    void stop();
}
