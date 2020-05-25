package com.p683ss.ttvideoengine.fetcher;

import android.text.TextUtils;
import com.C2240a;
import com.p683ss.mediakit.fetcher.AVMDLURLFetcherInterface;
import com.p683ss.mediakit.fetcher.AVMDLURLFetcherListener;
import com.p683ss.ttvideoengine.VideoModelCache;
import com.p683ss.ttvideoengine.VideoModelCache.VideoModelCacheInfo;
import com.p683ss.ttvideoengine.fetcher.VideoInfoFetcher.FetcherListener;
import com.p683ss.ttvideoengine.model.VideoInfo;
import com.p683ss.ttvideoengine.model.VideoModel;
import com.p683ss.ttvideoengine.utils.Error;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.ttvideoengine.fetcher.MDLFetcher */
public class MDLFetcher implements AVMDLURLFetcherInterface {
    private String mFallbackAPI;
    private VideoInfoFetcher mFetcher;
    public String mFileHash;
    private String mKeyseed;
    public AVMDLURLFetcherListener mListener;
    public String[] mNewUrls;
    public String mVideoID;

    /* renamed from: com.ss.ttvideoengine.fetcher.MDLFetcher$MyFetcherListener */
    static class MyFetcherListener implements FetcherListener {
        private final WeakReference<MDLFetcher> mFetcherRef;

        public void onLog(String str) {
        }

        public void onRetry(Error error) {
        }

        public MyFetcherListener(MDLFetcher mDLFetcher) {
            this.mFetcherRef = new WeakReference<>(mDLFetcher);
        }

        public void onStatusException(int i, String str) {
            MDLFetcher mDLFetcher = (MDLFetcher) this.mFetcherRef.get();
            if (mDLFetcher != null) {
                mDLFetcher.mListener.onCompletion(i, mDLFetcher.mVideoID, mDLFetcher.mFileHash, null);
            }
        }

        public void onCompletion(VideoModel videoModel, Error error) {
            MDLFetcher mDLFetcher = (MDLFetcher) this.mFetcherRef.get();
            if (mDLFetcher != null) {
                if (videoModel == null || error != null) {
                    int i = -9997;
                    if (error != null) {
                        i = error.code;
                    }
                    mDLFetcher.mListener.onCompletion(i, mDLFetcher.mVideoID, mDLFetcher.mFileHash, null);
                    return;
                }
                mDLFetcher.mNewUrls = mDLFetcher._getUrlsFromVideoModelByFileHash(videoModel, mDLFetcher.mFileHash);
                if (mDLFetcher.mNewUrls != null) {
                    mDLFetcher.mListener.onCompletion(0, mDLFetcher.mVideoID, mDLFetcher.mFileHash, mDLFetcher.mNewUrls);
                } else {
                    mDLFetcher.mListener.onCompletion(-1, mDLFetcher.mVideoID, mDLFetcher.mFileHash, null);
                }
            }
        }
    }

    public void close() {
        if (this.mFetcher != null) {
            this.mFetcher.cancel();
            this.mFetcher = null;
        }
        this.mNewUrls = null;
    }

    public String[] getURLs() {
        if (this.mNewUrls == null || this.mNewUrls.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder("get urls from cache. + urls.length = ");
        sb.append(this.mNewUrls.length);
        TTVideoEngineLog.m110644d("MDLFetcher", sb.toString());
        return this.mNewUrls;
    }

    public MDLFetcher(String str, String str2) {
        this.mFallbackAPI = str;
        this.mKeyseed = str2;
    }

    public String[] _getUrlsFromVideoModelByFileHash(VideoModel videoModel, String str) {
        if (videoModel == null || TextUtils.isEmpty(str)) {
            return null;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(15), str);
        VideoInfo videoInfo = videoModel.getVideoInfo((Map<Integer, String>) hashMap);
        if (videoInfo == null) {
            return null;
        }
        String[] valueStrArr = videoInfo.getValueStrArr(16);
        if (valueStrArr == null || valueStrArr.length <= 0) {
            return null;
        }
        return valueStrArr;
    }

    public int start(String str, String str2, String str3, AVMDLURLFetcherListener aVMDLURLFetcherListener) {
        VideoModelCacheInfo videoModelCacheInfo;
        boolean z;
        this.mVideoID = str;
        this.mFileHash = str2;
        this.mListener = aVMDLURLFetcherListener;
        synchronized (MDLFetcher.class) {
            videoModelCacheInfo = VideoModelCache.getInstance().get(this.mVideoID, this.mFallbackAPI);
        }
        if (videoModelCacheInfo != null && !videoModelCacheInfo.isExpired) {
            TTVideoEngineLog.m110647i("MDLFetcher", C2240a.m6772a("get videoModel from cache,key is %s; videoId = %s", new Object[]{this.mFileHash, this.mVideoID}));
            String[] _getUrlsFromVideoModelByFileHash = _getUrlsFromVideoModelByFileHash(videoModelCacheInfo.model, this.mFileHash);
            if (!TextUtils.isEmpty(str3) && _getUrlsFromVideoModelByFileHash != null && _getUrlsFromVideoModelByFileHash.length > 0) {
                this.mNewUrls = _getUrlsFromVideoModelByFileHash;
                int i = 0;
                while (true) {
                    if (i >= _getUrlsFromVideoModelByFileHash.length) {
                        break;
                    } else if (_getUrlsFromVideoModelByFileHash[i].equals(str3)) {
                        z = false;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            z = true;
            if (!z) {
                this.mNewUrls = null;
                synchronized (MDLFetcher.class) {
                    VideoModelCache.getInstance().remove(this.mVideoID, this.mFallbackAPI);
                }
            } else if (this.mNewUrls != null) {
                return 1;
            }
        }
        this.mFetcher = new VideoInfoFetcher(null, null);
        this.mFetcher.setUseVideoModelCache(true);
        this.mFetcher.setVideoID(str);
        this.mFetcher.setListener(new MyFetcherListener(this));
        this.mFetcher.fetchInfo(this.mFallbackAPI, null, 0, this.mKeyseed);
        return 0;
    }
}
