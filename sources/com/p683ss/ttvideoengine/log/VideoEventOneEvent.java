package com.p683ss.ttvideoengine.log;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.livesdk.chatroom.p325ui.C6162et;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.ttvideoengine.utils.EngineThreadPool;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.log.VideoEventOneEvent */
public class VideoEventOneEvent {
    public long mAccuCostTime;
    public int mDisAbleV3Async;
    private VideoEventBase mEventBase;
    public EventContext mEventContext = new EventContext();
    private VideoEventOneOpera mEventOpera;
    public HashMap mLastEventTimeMap = new HashMap();

    /* renamed from: com.ss.ttvideoengine.log.VideoEventOneEvent$AsyncGetLogDataRunnable */
    static class AsyncGetLogDataRunnable implements Runnable {
        private Context rContext;
        private VideoEventOneEvent rEvent;
        private VideoEventBase rEventBase;
        private EventContext rEventContext;
        private Handler rHandler = new Handler(Looper.getMainLooper());

        public void run() {
            if (this.rEvent != null) {
                if (this.rEventBase != null) {
                    this.rEventBase.updateMDLInfo();
                    this.rEventBase.mNetworkType = VideoEventBase.getNetworkType(this.rContext);
                }
                final JSONObject jsonObject = this.rEvent.toJsonObject(this.rEventContext);
                if (this.rHandler == null || this.rHandler.getLooper() == null) {
                    VideoEventManager.instance.addEventV2(jsonObject, "videoplayer_oneevent");
                    return;
                }
                this.rHandler.post(new Runnable() {
                    public void run() {
                        VideoEventManager.instance.addEventV2(jsonObject, "videoplayer_oneevent");
                    }
                });
                this.rEvent.mLastEventTimeMap.remove(this.rEventContext.mEventType);
                this.rEvent.mLastEventTimeMap.put(this.rEventContext.mEventType, Long.valueOf(this.rEventContext.mEndT));
            }
        }

        public AsyncGetLogDataRunnable(Context context, VideoEventOneEvent videoEventOneEvent, VideoEventBase videoEventBase, EventContext eventContext) {
            this.rEvent = videoEventOneEvent;
            this.rEventBase = videoEventBase;
            this.rContext = context;
            this.rEventContext = eventContext;
        }
    }

    /* renamed from: com.ss.ttvideoengine.log.VideoEventOneEvent$EventContext */
    class EventContext {
        public long mAudioLenAfterMS;
        public long mAudioLenBeforeMS;
        public long mBytesFromMDL;
        public long mCostTime;
        public long mEndT;
        public String mEndType;
        public String mEventType;
        public long mFirstFrameTime;
        public int mIndex;
        public long mLastSeekTime;
        public int mRetryCount;
        public long mStartT;
        public long mVideoLenAfterMS;
        public long mVideoLenBeforeMS;
        public int mVideoPos;

        private EventContext() {
            this.mEventType = "";
            this.mCostTime = -2147483648L;
            this.mEndType = "";
            this.mStartT = -2147483648L;
            this.mEndT = -2147483648L;
            this.mFirstFrameTime = -2147483648L;
            this.mLastSeekTime = -2147483648L;
            this.mVideoPos = DynamicTabYellowPointVersion.DEFAULT;
        }
    }

    public void movieShouldRetry() {
        this.mEventContext.mRetryCount++;
    }

    public void showedFirstFrame() {
        this.mEventContext.mFirstFrameTime = System.currentTimeMillis();
    }

    public void sendOneEvent() {
        this.mEventBase.updateVideoInfo(null);
        if (this.mDisAbleV3Async == 1) {
            TTVideoEngineLog.m110647i("VideoEventOneEvent", "report sync");
            VideoEventManager.instance.addEventV2(toJsonObject(this.mEventContext), "videoplayer_oneevent");
            this.mLastEventTimeMap.remove(this.mEventContext.mEventType);
            this.mLastEventTimeMap.put(this.mEventContext.mEventType, Long.valueOf(this.mEventContext.mEndT));
            return;
        }
        TTVideoEngineLog.m110647i("VideoEventOneEvent", "report async");
        EngineThreadPool.addExecuteTask(new AsyncGetLogDataRunnable(this.mEventBase.mContext, this, this.mEventBase, this.mEventContext));
    }

    public void movieStallEnd(String str) {
        if (this.mEventContext.mStartT <= 0 || this.mEventContext.mEventType.isEmpty()) {
            TTVideoEngineLog.m110644d("VideoEventOneEvent", "movieStallEnd without movieStalled, return.");
            return;
        }
        this.mEventContext.mEndT = System.currentTimeMillis();
        TTVideoEngineLog.m110644d("VideoEventOneEvent", "movieStallEnd");
        this.mEventContext.mCostTime = this.mEventContext.mEndT - this.mEventContext.mStartT;
        if (this.mEventContext.mCostTime > 0) {
            this.mAccuCostTime += this.mEventContext.mCostTime;
        }
        this.mEventContext.mEndType = str;
        this.mEventContext.mLastSeekTime = this.mEventOpera.getLastSeekTime();
        if (!(this.mEventBase == null || this.mEventBase.mDataSource == null)) {
            Map bytesInfo = this.mEventBase.mDataSource.bytesInfo();
            if (bytesInfo != null) {
                this.mEventContext.mVideoLenAfterMS = ((Long) bytesInfo.get("vlen")).longValue();
                this.mEventContext.mAudioLenAfterMS = ((Long) bytesInfo.get("alen")).longValue();
                this.mEventContext.mBytesFromMDL = ((Long) bytesInfo.get("vds")).longValue();
            }
        }
        sendOneEvent();
        this.mEventContext = new EventContext();
    }

    public JSONObject toJsonObject(EventContext eventContext) {
        long j;
        long j2;
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
            VideoEvent.putToMap((Map) hashMap, "play_speed", this.mEventBase.mPlaySpeed);
            VideoEvent.putToMap((Map) hashMap, "cur_req_pos", this.mEventBase.mdl_cur_req_pos);
            VideoEvent.putToMap((Map) hashMap, "cur_end_pos", this.mEventBase.mdl_cur_end_pos);
            VideoEvent.putToMap((Map) hashMap, "cur_cache_pos", this.mEventBase.mdl_cur_cache_pos);
            VideoEvent.putToMap((Map) hashMap, "cur_ip", this.mEventBase.mdl_cur_ip);
            VideoEvent.putToMap((Map) hashMap, "cur_host", this.mEventBase.mdl_cur_host);
            VideoEvent.putToMap((Map) hashMap, "reply_size", this.mEventBase.mdl_reply_size);
            VideoEvent.putToMap((Map) hashMap, "down_pos", this.mEventBase.mdl_down_pos);
            VideoEvent.putToMap((Map) hashMap, "player_wait_time", this.mEventBase.mdl_player_wait_time);
            VideoEvent.putToMap((Map) hashMap, "player_wait_num", this.mEventBase.mdl_player_wait_num);
            VideoEvent.putToMap((Map) hashMap, "mdl_stage", this.mEventBase.mdl_stage);
            VideoEvent.putToMap((Map) hashMap, "mdl_ec", this.mEventBase.mdl_error_code);
            VideoEvent.putToMap((Map) hashMap, "cur_task_num", this.mEventBase.mdl_cur_task_num);
            VideoEvent.putToMap((Map) hashMap, "mdl_speed", this.mEventBase.mdl_speed);
            VideoEvent.putToMap((Map) hashMap, "mdl_file_key", this.mEventBase.mdl_file_key);
            VideoEvent.putToMap((Map) hashMap, "mdl_is_socrf", this.mEventBase.mdl_is_socrf);
            VideoEvent.putToMap((Map) hashMap, "mdl_req_num", this.mEventBase.mdl_req_num);
            VideoEvent.putToMap((Map) hashMap, "mdl_url_index", this.mEventBase.mdl_url_index);
            VideoEvent.putToMap((Map) hashMap, "mdl_re_url", this.mEventBase.mdl_re_url);
            VideoEvent.putToMap((Map) hashMap, "mdl_cur_source", this.mEventBase.mdl_cur_soure);
            VideoEvent.putToMap((Map) hashMap, "mdl_extra_info", this.mEventBase.mdl_extra_info);
            VideoEvent.putToMap((Map) hashMap, "nt", this.mEventBase.mNetworkType);
            VideoEvent.putToMap((Map) hashMap, "mdl_fs", this.mEventBase.mdl_fs);
        }
        VideoEvent.putToMap((Map) hashMap, "event_type", eventContext.mEventType);
        VideoEvent.putToMap((Map) hashMap, "cost_time", eventContext.mCostTime);
        VideoEvent.putToMap((Map) hashMap, "end_type", eventContext.mEndType);
        VideoEvent.putToMap((Map) hashMap, "index", eventContext.mIndex);
        long j3 = -1;
        if (eventContext.mFirstFrameTime > 0) {
            j = eventContext.mStartT - eventContext.mFirstFrameTime;
        } else {
            j = -1;
        }
        VideoEvent.putToMap((Map) hashMap, "first_frame_interval", j);
        if (eventContext.mLastSeekTime > 0) {
            j2 = eventContext.mStartT - eventContext.mLastSeekTime;
        } else {
            j2 = -1;
        }
        VideoEvent.putToMap((Map) hashMap, "last_seek_interval", j2);
        if (this.mLastEventTimeMap.containsKey(eventContext.mEventType)) {
            long longValue = ((Long) this.mLastEventTimeMap.get(eventContext.mEventType)).longValue();
            if (longValue > 0) {
                j3 = eventContext.mStartT - longValue;
            }
        }
        VideoEvent.putToMap((Map) hashMap, "last_event_interval", j3);
        VideoEvent.putToMap((Map) hashMap, "last_switch_interval", -1);
        VideoEvent.putToMap((Map) hashMap, "video_pos", eventContext.mVideoPos);
        VideoEvent.putToMap((Map) hashMap, "retry_count", eventContext.mRetryCount);
        VideoEvent.putToMap((Map) hashMap, "reuse_socket", this.mEventBase.mReuseSocket);
        VideoEvent.putToMap((Map) hashMap, "read_count_mdl", eventContext.mBytesFromMDL);
        VideoEvent.putToMap((Map) hashMap, "audio_len_before", eventContext.mAudioLenBeforeMS);
        VideoEvent.putToMap((Map) hashMap, "video_len_before", eventContext.mVideoLenBeforeMS);
        VideoEvent.putToMap((Map) hashMap, "audio_len_after", eventContext.mAudioLenAfterMS);
        VideoEvent.putToMap((Map) hashMap, "video_len_after", eventContext.mVideoLenAfterMS);
        VideoEvent.putToMap((Map) hashMap, "st", eventContext.mStartT);
        VideoEvent.putToMap((Map) hashMap, C6162et.f16534a, eventContext.mEndT);
        StringBuilder sb = new StringBuilder("OneEvent: ");
        sb.append(hashMap.toString());
        TTVideoEngineLog.m110647i("VideoEventOneEvent", sb.toString());
        return new JSONObject(hashMap);
    }

    VideoEventOneEvent(VideoEventBase videoEventBase, VideoEventOneOpera videoEventOneOpera) {
        this.mEventBase = videoEventBase;
        this.mEventOpera = videoEventOneOpera;
    }

    public void movieStalled(int i, int i2) {
        TTVideoEngineLog.m110644d("VideoEventOneEvent", "movieStalled");
        this.mEventContext.mStartT = System.currentTimeMillis();
        this.mEventContext.mVideoPos = i;
        this.mEventContext.mIndex = i2;
        this.mEventContext.mEventType = "block_net";
        if (this.mEventBase != null && this.mEventBase.mDataSource != null) {
            Map bytesInfo = this.mEventBase.mDataSource.bytesInfo();
            if (bytesInfo != null) {
                this.mEventContext.mVideoLenBeforeMS = ((Long) bytesInfo.get("vlen")).longValue();
                this.mEventContext.mAudioLenBeforeMS = ((Long) bytesInfo.get("alen")).longValue();
                this.mEventContext.mBytesFromMDL = ((Long) bytesInfo.get("vds")).longValue();
            }
        }
    }
}
