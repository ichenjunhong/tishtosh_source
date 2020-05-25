package com.p683ss.ttvideoengine;

import com.p683ss.ttvideoengine.model.VideoModel;
import com.p683ss.ttvideoengine.utils.Error;

/* renamed from: com.ss.ttvideoengine.PreloaderVidItemFetchListener */
public interface PreloaderVidItemFetchListener {
    void fetchEnd(VideoModel videoModel, Error error);
}
