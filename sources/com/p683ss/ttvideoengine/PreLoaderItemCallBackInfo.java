package com.p683ss.ttvideoengine;

import com.p683ss.ttvideoengine.DataLoaderHelper.DataLoaderTaskProgressInfo;
import com.p683ss.ttvideoengine.model.VideoInfo;
import com.p683ss.ttvideoengine.model.VideoModel;
import com.p683ss.ttvideoengine.utils.Error;
import java.util.List;

/* renamed from: com.ss.ttvideoengine.PreLoaderItemCallBackInfo */
public class PreLoaderItemCallBackInfo {
    public VideoModel fetchVideoModel;
    private int mKey;
    public DataLoaderTaskProgressInfo preloadDataInfo;
    public Error preloadError;
    public List<VideoInfo> usingUrlInfos;

    public int getKey() {
        return this.mKey;
    }

    public PreLoaderItemCallBackInfo(int i) {
        this.mKey = i;
    }
}
