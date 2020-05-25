package com.p683ss.ttvideoengine.log;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.chatroom.p325ui.C6162et;
import com.p683ss.ttvideoengine.utils.EngineThreadPool;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.log.VideoEventOneOpera */
public class VideoEventOneOpera {
    public int mDisAbleV3Async;
    private VideoEventBase mEventBase;
    public HashMap mLastOperaTimeMap = new HashMap();
    public OperaContext mOperaContext = new OperaContext();

    /* renamed from: com.ss.ttvideoengine.log.VideoEventOneOpera$AsyncGetLogDataRunnable */
    static class AsyncGetLogDataRunnable implements Runnable {
        private Context rContext;
        private VideoEventOneOpera rEvent;
        private VideoEventBase rEventBase;
        private Handler rHandler = new Handler(Looper.getMainLooper());
        private OperaContext rOperaContext;

        public void run() {
            if (this.rEvent != null) {
                if (this.rEventBase != null) {
                    this.rEventBase.mNetworkType = VideoEventBase.getNetworkType(this.rContext);
                }
                final JSONObject jsonObject = this.rEvent.toJsonObject(this.rOperaContext);
                if (this.rHandler == null || this.rHandler.getLooper() == null) {
                    VideoEventManager.instance.addEventV2(jsonObject, "videoplayer_oneopera");
                    return;
                }
                this.rHandler.post(new Runnable() {
                    public void run() {
                        VideoEventManager.instance.addEventV2(jsonObject, "videoplayer_oneopera");
                    }
                });
                this.rEvent.mLastOperaTimeMap.remove(this.rOperaContext.mOperaType);
                this.rEvent.mLastOperaTimeMap.put(this.rOperaContext.mOperaType, Long.valueOf(this.rOperaContext.mEndT));
            }
        }

        public AsyncGetLogDataRunnable(Context context, VideoEventOneOpera videoEventOneOpera, VideoEventBase videoEventBase, OperaContext operaContext) {
            this.rEvent = videoEventOneOpera;
            this.rEventBase = videoEventBase;
            this.rContext = context;
            this.rOperaContext = operaContext;
        }
    }

    /* renamed from: com.ss.ttvideoengine.log.VideoEventOneOpera$OperaContext */
    class OperaContext {
        public long mAudioLenAfterMS;
        public long mCostTime;
        public long mEndT;
        public String mEndType;
        public int mIndex;
        public int mIsSeekInCached;
        public String mOperaType;
        public int mRetryCount;
        public long mStartT;
        public String mStateAfter;
        public String mStateBefore;
        public long mVideoLenAfterMS;

        private OperaContext() {
            this.mOperaType = "";
            this.mStateBefore = "";
            this.mStateAfter = "";
            this.mCostTime = -2147483648L;
            this.mEndType = "";
            this.mStartT = -2147483648L;
            this.mEndT = -2147483648L;
        }
    }

    public void movieShouldRetry() {
        this.mOperaContext.mRetryCount++;
    }

    public long getLastSeekTime() {
        if (this.mLastOperaTimeMap.containsKey("seek")) {
            return ((Long) this.mLastOperaTimeMap.get("seek")).longValue();
        }
        return -1;
    }

    public void sendOperaEvent() {
        this.mEventBase.updateVideoInfo(null);
        if (this.mDisAbleV3Async == 1) {
            TTVideoEngineLog.m110647i("VideoEventOneOpera", "report sync");
            VideoEventManager.instance.addEventV2(toJsonObject(this.mOperaContext), "videoplayer_oneopera");
            this.mLastOperaTimeMap.remove(this.mOperaContext.mOperaType);
            this.mLastOperaTimeMap.put(this.mOperaContext.mOperaType, Long.valueOf(this.mOperaContext.mEndT));
            return;
        }
        TTVideoEngineLog.m110647i("VideoEventOneOpera", "report async");
        EngineThreadPool.addExecuteTask(new AsyncGetLogDataRunnable(this.mEventBase.mContext, this, this.mEventBase, this.mOperaContext));
    }

    VideoEventOneOpera(VideoEventBase videoEventBase) {
        this.mEventBase = videoEventBase;
    }

    public JSONObject toJsonObject(OperaContext operaContext) {
        HashMap hashMap = new HashMap();
        if (this.mEventBase != null) {
            VideoEvent.putToMap((Map) hashMap, "player_sessionid", this.mEventBase.mSessionID);
            if (this.mEventBase.mCurURL == null || this.mEventBase.mCurURL.isEmpty()) {
                VideoEvent.putToMap((Map) hashMap, "cdn_url", this.mEventBase.mInitialURL);
            } else {
                VideoEvent.putToMap((Map) hashMap, "cdn_url", this.mEventBase.mCurURL);
            }
            if (this.mEventBase.mCurIP == null || this.mEventBase.mCurIP.isEmpty()) {
                VideoEvent.putToMap((Map) hashMap, "cdn_ip", this.mEventBase.mInitialIP);
            } else {
                VideoEvent.putToMap((Map) hashMap, "cdn_ip", this.mEventBase.mCurIP);
            }
            VideoEvent.putToMap((Map) hashMap, "resolution", this.mEventBase.mCurrentResolution);
            VideoEvent.putToMap((Map) hashMap, "source_type", this.mEventBase.mSourceTypeStr);
            VideoEvent.putToMap((Map) hashMap, "v", this.mEventBase.mVid);
            VideoEvent.putToMap((Map) hashMap, "pv", this.mEventBase.f128669pv);
            VideoEvent.putToMap((Map) hashMap, "pc", this.mEventBase.f128668pc);
            VideoEvent.putToMap((Map) hashMap, "sv", this.mEventBase.f128670sv);
            VideoEvent.putToMap((Map) hashMap, "sdk_version", this.mEventBase.sdk_version);
            VideoEvent.putToMap((Map) hashMap, "vtype", this.mEventBase.vtype);
            VideoEvent.putToMap((Map) hashMap, "tag", this.mEventBase.mTag);
            VideoEvent.putToMap((Map) hashMap, "subtag", this.mEventBase.mSubTag);
            VideoEvent.putToMap((Map) hashMap, "p2p_cdn_type", this.mEventBase.mP2PCDNType);
            VideoEvent.putToMap((Map) hashMap, "codec", this.mEventBase.codec_type);
            VideoEvent.putToMap((Map) hashMap, "video_codec_nameid", this.mEventBase.videoCodecNameId);
            VideoEvent.putToMap((Map) hashMap, "audio_codec_nameid", this.mEventBase.audioCodecNameId);
            VideoEvent.putToMap((Map) hashMap, "format_type", this.mEventBase.formatType);
            VideoEvent.putToMap((Map) hashMap, "drm_type", this.mEventBase.mDrmType);
            VideoEvent.putToMap((Map) hashMap, "mdl_speed", this.mEventBase.mdl_speed);
            VideoEvent.putToMap((Map) hashMap, "nt", this.mEventBase.mNetworkType);
            VideoEvent.putToMap((Map) hashMap, "reuse_socket", this.mEventBase.mReuseSocket);
        }
        VideoEvent.putToMap((Map) hashMap, "opera_type", operaContext.mOperaType);
        VideoEvent.putToMap((Map) hashMap, "state_before", operaContext.mStateBefore);
        VideoEvent.putToMap((Map) hashMap, "state_after", operaContext.mStateAfter);
        VideoEvent.putToMap((Map) hashMap, "cost_time", operaContext.mCostTime);
        VideoEvent.putToMap((Map) hashMap, "end_type", operaContext.mEndType);
        VideoEvent.putToMap((Map) hashMap, "index", operaContext.mIndex);
        long j = -1;
        if (this.mLastOperaTimeMap.containsKey(operaContext.mOperaType)) {
            long longValue = ((Long) this.mLastOperaTimeMap.get(operaContext.mOperaType)).longValue();
            if (longValue > 0) {
                j = operaContext.mStartT - longValue;
            }
        }
        VideoEvent.putToMap((Map) hashMap, "last_interval", j);
        VideoEvent.putToMap((Map) hashMap, "retry_count", operaContext.mRetryCount);
        VideoEvent.putToMap((Map) hashMap, "is_seek_in_buffer", operaContext.mIsSeekInCached);
        VideoEvent.putToMap((Map) hashMap, "video_len_after", operaContext.mVideoLenAfterMS);
        VideoEvent.putToMap((Map) hashMap, "audio_len_after", operaContext.mAudioLenAfterMS);
        VideoEvent.putToMap((Map) hashMap, "st", operaContext.mStartT);
        VideoEvent.putToMap((Map) hashMap, C6162et.f16534a, operaContext.mEndT);
        StringBuilder sb = new StringBuilder("OneOpera: ");
        sb.append(hashMap.toString());
        TTVideoEngineLog.m110647i("VideoEventOneOpera", sb.toString());
        return new JSONObject(hashMap);
    }

    public void endSeek(String str, int i) {
        if (this.mOperaContext.mStartT <= 0 || this.mOperaContext.mOperaType.isEmpty()) {
            TTVideoEngineLog.m110644d("VideoEventOneOpera", "endSeek without beginSeek, return.");
            return;
        }
        StringBuilder sb = new StringBuilder("endSeek, from ");
        sb.append(this.mOperaContext.mStateBefore);
        sb.append(" to ");
        sb.append(this.mOperaContext.mStateAfter);
        TTVideoEngineLog.m110644d("VideoEventOneOpera", sb.toString());
        this.mOperaContext.mEndT = System.currentTimeMillis();
        this.mOperaContext.mCostTime = this.mOperaContext.mEndT - this.mOperaContext.mStartT;
        this.mOperaContext.mEndType = str;
        this.mOperaContext.mIsSeekInCached = i;
        if (!(this.mEventBase == null || this.mEventBase.mDataSource == null)) {
            Map bytesInfo = this.mEventBase.mDataSource.bytesInfo();
            if (bytesInfo != null) {
                this.mOperaContext.mVideoLenAfterMS = ((Long) bytesInfo.get("vlen")).longValue();
                this.mOperaContext.mAudioLenAfterMS = ((Long) bytesInfo.get("alen")).longValue();
            }
        }
        sendOperaEvent();
        this.mOperaContext = new OperaContext();
    }

    public void beginSeek(int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("brian beginSeek from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        TTVideoEngineLog.m110644d("VideoEventOneOpera", sb.toString());
        this.mOperaContext.mStartT = System.currentTimeMillis();
        this.mOperaContext.mOperaType = "seek";
        this.mOperaContext.mStateBefore = Integer.toString(i);
        this.mOperaContext.mStateAfter = Integer.toString(i2);
        this.mOperaContext.mCostTime = 0;
        this.mOperaContext.mIndex = i3;
    }
}
