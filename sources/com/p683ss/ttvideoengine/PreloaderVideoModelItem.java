package com.p683ss.ttvideoengine;

import com.p683ss.ttvideoengine.model.VideoModel;
import java.util.Map;

/* renamed from: com.ss.ttvideoengine.PreloaderVideoModelItem */
public class PreloaderVideoModelItem {
    private IPreLoaderItemCallBackListener mCallBackListener;
    private PreloaderFilePathListener mFilePathListener;
    public boolean mForbidP2p;
    public Map<Integer, String> mParams;
    public long mPreloadSize;
    private int mPriorityLevel;
    public Resolution mResolution = Resolution.Undefine;
    public VideoModel mVideoModel;

    public IPreLoaderItemCallBackListener getCallBackListener() {
        return this.mCallBackListener;
    }

    /* access modifiers changed from: 0000 */
    public PreloaderFilePathListener getFilePathListener() {
        return this.mFilePathListener;
    }

    public int getPriorityLevel() {
        return this.mPriorityLevel;
    }

    public void setCallBackListener(IPreLoaderItemCallBackListener iPreLoaderItemCallBackListener) {
        this.mCallBackListener = iPreLoaderItemCallBackListener;
    }

    public void setFilePathListener(PreloaderFilePathListener preloaderFilePathListener) {
        this.mFilePathListener = preloaderFilePathListener;
    }

    public void setPriorityLevel(int i) {
        this.mPriorityLevel = i;
    }

    public PreloaderVideoModelItem(VideoModel videoModel, Resolution resolution, long j, PreloaderFilePathListener preloaderFilePathListener) {
        this.mVideoModel = videoModel;
        this.mResolution = resolution;
        this.mPreloadSize = j;
        this.mFilePathListener = preloaderFilePathListener;
    }

    public PreloaderVideoModelItem(VideoModel videoModel, Resolution resolution, long j, boolean z) {
        this.mVideoModel = videoModel;
        this.mResolution = resolution;
        this.mPreloadSize = j;
        this.mForbidP2p = z;
    }
}
