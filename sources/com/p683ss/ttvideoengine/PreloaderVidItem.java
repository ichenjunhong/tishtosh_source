package com.p683ss.ttvideoengine;

import com.p683ss.ttvideoengine.net.TTVNetClient;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.ttvideoengine.PreloaderVidItem */
public class PreloaderVidItem {
    public int mApiVersion;
    public boolean mBoeEnable;
    private IPreLoaderItemCallBackListener mCallBackListener;
    public boolean mDashEnable;
    private PreloaderVidItemFetchListener mFetchEndListener;
    private PreloaderFilePathListener mFilePathListener;
    public boolean mForbidP2p;
    public boolean mH265Enable;
    public boolean mHttpsEnable;
    public PreloaderVidItemListener mListener;
    private TTVNetClient mNetClient;
    private boolean mOnlyFetchVideoModel;
    public Map<Integer, String> mParams;
    public long mPreloadSize;
    public int mPriorityLevel;
    public Resolution mResolution = Resolution.SuperHigh;
    public HashMap<String, Resolution> mResolutionMap;
    public String mVideoId;

    public IPreLoaderItemCallBackListener getCallBackListener() {
        return this.mCallBackListener;
    }

    /* access modifiers changed from: 0000 */
    public PreloaderVidItemFetchListener getFetchEndListener() {
        return this.mFetchEndListener;
    }

    /* access modifiers changed from: 0000 */
    public PreloaderFilePathListener getFilePathListener() {
        return this.mFilePathListener;
    }

    /* access modifiers changed from: 0000 */
    public boolean getOnlyFetchVideoModel() {
        return this.mOnlyFetchVideoModel;
    }

    public int getPriorityLevel() {
        return this.mPriorityLevel;
    }

    public TTVNetClient getNetClient() {
        if (this.mNetClient != null) {
            return this.mNetClient;
        }
        if (TTVideoEngineConfig.gNetClient != null) {
            return TTVideoEngineConfig.gNetClient;
        }
        return null;
    }

    public void setCallBackListener(IPreLoaderItemCallBackListener iPreLoaderItemCallBackListener) {
        this.mCallBackListener = iPreLoaderItemCallBackListener;
    }

    public void setFetchEndListener(PreloaderVidItemFetchListener preloaderVidItemFetchListener) {
        this.mFetchEndListener = preloaderVidItemFetchListener;
    }

    public void setFilePathListener(PreloaderFilePathListener preloaderFilePathListener) {
        this.mFilePathListener = preloaderFilePathListener;
    }

    public void setNetworkClient(TTVNetClient tTVNetClient) {
        this.mNetClient = tTVNetClient;
    }

    public void setOnlyFetchVideoModel(boolean z) {
        this.mOnlyFetchVideoModel = z;
    }

    public void setPriorityLevel(int i) {
        this.mPriorityLevel = i;
    }

    public void setResolutionMap(HashMap<String, Resolution> hashMap) {
        if (hashMap != null && hashMap.size() > 0) {
            this.mResolutionMap = hashMap;
        }
    }

    public PreloaderVidItem(String str, Resolution resolution, long j, boolean z) {
        this.mVideoId = str;
        this.mResolution = resolution;
        this.mPreloadSize = j;
        this.mH265Enable = z;
    }

    public PreloaderVidItem(String str, Resolution resolution, long j, boolean z, boolean z2) {
        this.mVideoId = str;
        this.mResolution = resolution;
        this.mPreloadSize = j;
        this.mH265Enable = z;
        this.mForbidP2p = z2;
    }
}
