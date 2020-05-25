package com.p683ss.ttvideoengine;

import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.ss.ttvideoengine.PreloaderURLItem */
public class PreloaderURLItem {
    private IPreLoaderItemCallBackListener mCallBackListener;
    private String mFilePath;
    private HashMap<String, String> mHeaders;
    private String mKey;
    private long mPreloadSize;
    private int mPriorityLevel;
    private DataLoaderResourceProvider mProvider;
    private String[] mUrls;
    private String mVideoId;

    public HashMap<String, String> customHeaders() {
        return this.mHeaders;
    }

    public IPreLoaderItemCallBackListener getCallBackListener() {
        return this.mCallBackListener;
    }

    public String getFilePath() {
        return this.mFilePath;
    }

    public String getKey() {
        return this.mKey;
    }

    public long getPreloadSize() {
        return this.mPreloadSize;
    }

    public int getPriorityLevel() {
        return this.mPriorityLevel;
    }

    public DataLoaderResourceProvider getProvider() {
        return this.mProvider;
    }

    public String[] getUrls() {
        return this.mUrls;
    }

    public String getVideoId() {
        return this.mVideoId;
    }

    public void setCallBackListener(IPreLoaderItemCallBackListener iPreLoaderItemCallBackListener) {
        this.mCallBackListener = iPreLoaderItemCallBackListener;
    }

    public void setKey(String str) {
        this.mKey = str;
    }

    public void setPriorityLevel(int i) {
        this.mPriorityLevel = i;
    }

    public void setProvider(DataLoaderResourceProvider dataLoaderResourceProvider) {
        this.mProvider = dataLoaderResourceProvider;
    }

    public void setCustomHeader(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            if (this.mHeaders == null) {
                this.mHeaders = new HashMap<>();
            }
            HashMap<String, String> hashMap = this.mHeaders;
            StringBuilder sb = new StringBuilder();
            sb.append(str.substring(0, 1).toUpperCase());
            sb.append(str.substring(1));
            hashMap.put(sb.toString(), str2);
        }
    }

    public PreloaderURLItem(String str, long j, String[] strArr, String str2) {
        this.mFilePath = str2;
        this.mVideoId = str;
        this.mPreloadSize = j;
        this.mUrls = strArr;
    }

    public PreloaderURLItem(String str, String str2, long j, DataLoaderResourceProvider dataLoaderResourceProvider) {
        this.mProvider = dataLoaderResourceProvider;
        this.mVideoId = str2;
        this.mPreloadSize = j;
        this.mKey = str;
    }

    public PreloaderURLItem(String str, String str2, long j, String[] strArr) {
        this.mKey = str;
        this.mVideoId = str2;
        this.mPreloadSize = j;
        this.mUrls = strArr;
    }
}
