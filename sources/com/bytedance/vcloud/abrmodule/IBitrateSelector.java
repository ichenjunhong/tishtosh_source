package com.bytedance.vcloud.abrmodule;

import java.util.Map;

public interface IBitrateSelector {
    ABRResult predictBitrate(IPlayStateSupplier iPlayStateSupplier);

    ABRResult predictStartupBitrate(IInitParams iInitParams, Map<String, IVideoStream> map, Map<String, IAudioStream> map2, IPlayStateSupplier iPlayStateSupplier);

    void release();
}
