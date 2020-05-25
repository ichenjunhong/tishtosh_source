package com.p683ss.ttvideoengine;

import android.os.SystemClock;
import android.text.TextUtils;
import com.C2240a;
import com.p683ss.ttvideoengine.model.VideoModel;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.ttvideoengine.VideoModelCache */
public class VideoModelCache {
    private static int mCacheNB = 100;
    private static VideoModelCache mInstance = null;
    private static int mTimeOutSetByUser = -1;
    private ConcurrentHashMap<String, VideoModelCacheInfo> mVideoModelCache = new ConcurrentHashMap<>();

    /* renamed from: com.ss.ttvideoengine.VideoModelCache$VideoModelCacheInfo */
    public static class VideoModelCacheInfo {
        public boolean isExpired;
        public VideoModel model;
        public long modelGotTime;
    }

    public static VideoModelCache getInstance() {
        if (mInstance == null) {
            synchronized (VideoModelCache.class) {
                if (mInstance == null) {
                    mInstance = new VideoModelCache();
                }
            }
        }
        return mInstance;
    }

    public void clear() {
        mTimeOutSetByUser = -1;
        mCacheNB = 100;
        if (this.mVideoModelCache != null) {
            this.mVideoModelCache.clear();
        }
    }

    public void setCacheNb(int i) {
        mCacheNB = i;
    }

    public void setTimeOutInSec(int i) {
        mTimeOutSetByUser = i;
    }

    public void remove(String str, String str2) {
        if (this.mVideoModelCache != null) {
            String videoModelCacheKey = getVideoModelCacheKey(str, str2);
            if (!TextUtils.isEmpty(videoModelCacheKey)) {
                this.mVideoModelCache.remove(videoModelCacheKey);
            }
        }
    }

    public VideoModelCacheInfo get(String str, String str2) {
        if (this.mVideoModelCache != null) {
            String videoModelCacheKey = getVideoModelCacheKey(str, str2);
            if (TextUtils.isEmpty(videoModelCacheKey)) {
                return null;
            }
            VideoModelCacheInfo videoModelCacheInfo = (VideoModelCacheInfo) this.mVideoModelCache.get(videoModelCacheKey);
            if (videoModelCacheInfo != null) {
                int i = 3600;
                if (mTimeOutSetByUser > 0) {
                    i = mTimeOutSetByUser;
                } else if (videoModelCacheInfo.model != null) {
                    i = (videoModelCacheInfo.model.getVideoRefInt(3) + 3600) - 300;
                }
                if (SystemClock.elapsedRealtime() - videoModelCacheInfo.modelGotTime > ((long) (i * 1000))) {
                    videoModelCacheInfo.isExpired = true;
                } else {
                    videoModelCacheInfo.isExpired = false;
                }
                return videoModelCacheInfo;
            }
        }
        return null;
    }

    private String getVideoModelCacheKey(String str, String str2) {
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        String[] split;
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        CharSequence charSequence4 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String[] split2 = str2.split("[?]");
        if (split2.length >= 2) {
            CharSequence charSequence5 = null;
            charSequence3 = null;
            charSequence2 = null;
            charSequence = null;
            for (String str3 : split2[1].split("&")) {
                int indexOf = str3.indexOf("codec_type");
                if (indexOf >= 0) {
                    charSequence5 = str3.substring(indexOf + 11);
                } else {
                    int indexOf2 = str3.indexOf("CodecType");
                    if (indexOf2 >= 0) {
                        charSequence5 = str3.substring(indexOf2 + 10);
                    } else {
                        int indexOf3 = str3.indexOf("format_type");
                        if (indexOf3 >= 0) {
                            charSequence3 = str3.substring(indexOf3 + 12);
                        } else {
                            int indexOf4 = str3.indexOf("FormatType");
                            if (indexOf4 >= 0) {
                                charSequence3 = str3.substring(indexOf4 + 11);
                            } else {
                                int indexOf5 = str3.indexOf("ptoken");
                                if (indexOf5 >= 0) {
                                    charSequence2 = str3.substring(indexOf5 + 7);
                                } else {
                                    int indexOf6 = str3.indexOf("PToken");
                                    if (indexOf6 >= 0) {
                                        charSequence2 = str3.substring(indexOf6 + 7);
                                    } else {
                                        int indexOf7 = str3.indexOf("ssl");
                                        if (indexOf7 >= 0) {
                                            charSequence = str3.substring(indexOf7 + 4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            charSequence4 = charSequence5;
        } else {
            charSequence3 = null;
            charSequence2 = null;
            charSequence = null;
        }
        sb.append(str);
        if (!TextUtils.isEmpty(charSequence4)) {
            sb.append(C2240a.m6772a("/%s", new Object[]{charSequence4}));
        }
        if (!TextUtils.isEmpty(charSequence3)) {
            sb.append(C2240a.m6772a("/%s", new Object[]{charSequence3}));
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            sb.append(C2240a.m6772a("/%s", new Object[]{charSequence2}));
        }
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(C2240a.m6772a("/%s", new Object[]{charSequence}));
        }
        return sb.toString();
    }

    public void put(String str, String str2, VideoModel videoModel) {
        if (this.mVideoModelCache != null && str != null && str2 != null) {
            VideoModelCacheInfo videoModelCacheInfo = new VideoModelCacheInfo();
            videoModelCacheInfo.model = videoModel;
            videoModelCacheInfo.modelGotTime = SystemClock.elapsedRealtime();
            put(str, str2, videoModelCacheInfo);
        }
    }

    public void put(String str, String str2, VideoModelCacheInfo videoModelCacheInfo) {
        String videoModelCacheKey = getVideoModelCacheKey(str, str2);
        if (!TextUtils.isEmpty(videoModelCacheKey)) {
            this.mVideoModelCache.put(videoModelCacheKey, videoModelCacheInfo);
            if (this.mVideoModelCache.size() > mCacheNB) {
                long j = Long.MAX_VALUE;
                String str3 = null;
                for (Entry entry : this.mVideoModelCache.entrySet()) {
                    VideoModelCacheInfo videoModelCacheInfo2 = (VideoModelCacheInfo) entry.getValue();
                    if (videoModelCacheInfo2.modelGotTime < j) {
                        j = videoModelCacheInfo2.modelGotTime;
                        str3 = (String) entry.getKey();
                    }
                }
                if (str3 != null) {
                    this.mVideoModelCache.remove(str3);
                }
            }
        }
    }
}
