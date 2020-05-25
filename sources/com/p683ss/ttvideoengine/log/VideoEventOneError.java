package com.p683ss.ttvideoengine.log;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.ttvideoengine.utils.EngineThreadPool;
import com.p683ss.ttvideoengine.utils.Error;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.log.VideoEventOneError */
public class VideoEventOneError {
    public String mCDNIP = "";
    public String mCDNUrl = "";
    public int mDisAbleV3Async;
    public int mErrorCode = DynamicTabYellowPointVersion.DEFAULT;
    public String mErrorStage = "";
    public int mErrorType = DynamicTabYellowPointVersion.DEFAULT;
    private VideoEventBase mEventBase;
    public boolean mFirstFrameShown;
    public int mRetryCount;
    public int vsc = DynamicTabYellowPointVersion.DEFAULT;
    public String vscMessage = "";

    /* renamed from: com.ss.ttvideoengine.log.VideoEventOneError$AsyncGetLogDataRunnable */
    static class AsyncGetLogDataRunnable implements Runnable {
        private Context rContext;
        private VideoEventOneError rEvent;
        private VideoEventBase rEventBase;
        private Handler rHandler = new Handler(Looper.getMainLooper());

        public void run() {
            if (this.rEvent != null) {
                if (this.rEventBase != null) {
                    this.rEventBase.updateMDLInfo();
                    this.rEventBase.mNetworkType = VideoEventBase.getNetworkType(this.rContext);
                }
                final JSONObject jsonObject = this.rEvent.toJsonObject();
                if (this.rHandler == null || this.rHandler.getLooper() == null) {
                    VideoEventManager.instance.addEventV2(jsonObject, "videoplayer_oneerror");
                } else {
                    this.rHandler.post(new Runnable() {
                        public void run() {
                            VideoEventManager.instance.addEventV2(jsonObject, "videoplayer_oneerror");
                        }
                    });
                }
            }
        }

        public AsyncGetLogDataRunnable(Context context, VideoEventOneError videoEventOneError, VideoEventBase videoEventBase) {
            this.rEvent = videoEventOneError;
            this.rEventBase = videoEventBase;
            this.rContext = context;
        }
    }

    public void showedFirstFrame() {
        this.mFirstFrameShown = true;
    }

    public void sendErrorEvent() {
        if (this.mFirstFrameShown) {
            this.mErrorStage = "playing";
        } else {
            this.mErrorStage = "beforePlay";
        }
        if (this.mDisAbleV3Async == 1) {
            TTVideoEngineLog.m110647i("VideoEventOneError", "report sync");
            VideoEventManager.instance.addEventV2(toJsonObject(), "videoplayer_oneerror");
            return;
        }
        TTVideoEngineLog.m110647i("VideoEventOneError", "report async");
        EngineThreadPool.addExecuteTask(new AsyncGetLogDataRunnable(this.mEventBase.mContext, this, this.mEventBase));
    }

    public JSONObject toJsonObject() {
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
            VideoEvent.putToMap((Map) hashMap, "tag", this.mEventBase.mTag);
            VideoEvent.putToMap((Map) hashMap, "subtag", this.mEventBase.mSubTag);
            VideoEvent.putToMap((Map) hashMap, "sdk_version", this.mEventBase.sdk_version);
            VideoEvent.putToMap((Map) hashMap, "video_hw", this.mEventBase.mVideoHW);
            VideoEvent.putToMap((Map) hashMap, "vtype", this.mEventBase.vtype);
            VideoEvent.putToMap((Map) hashMap, "p2p_cdn_type", this.mEventBase.mP2PCDNType);
            VideoEvent.putToMap((Map) hashMap, "codec", this.mEventBase.codec_type);
            VideoEvent.putToMap((Map) hashMap, "video_codec_nameid", this.mEventBase.videoCodecNameId);
            VideoEvent.putToMap((Map) hashMap, "audio_codec_nameid", this.mEventBase.audioCodecNameId);
            VideoEvent.putToMap((Map) hashMap, "format_type", this.mEventBase.formatType);
            VideoEvent.putToMap((Map) hashMap, "drm_type", this.mEventBase.mDrmType);
            VideoEvent.putToMap((Map) hashMap, "drm_token_url", this.mEventBase.mDrmTokenUrl);
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
            VideoEvent.putToMap((Map) hashMap, "mdl_speed", this.mEventBase.mdl_speed);
            VideoEvent.putToMap((Map) hashMap, "mdl_file_key", this.mEventBase.mdl_file_key);
            VideoEvent.putToMap((Map) hashMap, "mdl_is_socrf", this.mEventBase.mdl_is_socrf);
            VideoEvent.putToMap((Map) hashMap, "mdl_req_num", this.mEventBase.mdl_req_num);
            VideoEvent.putToMap((Map) hashMap, "mdl_url_index", this.mEventBase.mdl_url_index);
            VideoEvent.putToMap((Map) hashMap, "mdl_re_url", this.mEventBase.mdl_re_url);
            VideoEvent.putToMap((Map) hashMap, "nt", this.mEventBase.mNetworkType);
            VideoEvent.putToMap((Map) hashMap, "mdl_fs", this.mEventBase.mdl_fs);
            VideoEvent.putToMap((Map) hashMap, "req_t", this.mEventBase.mdl_req_t);
            VideoEvent.putToMap((Map) hashMap, "end_t", this.mEventBase.mdl_end_t);
            VideoEvent.putToMap((Map) hashMap, "dns_t", this.mEventBase.mdl_dns_t);
            VideoEvent.putToMap((Map) hashMap, "tcp_con_start_t", this.mEventBase.mdl_tcp_start_t);
            VideoEvent.putToMap((Map) hashMap, "tcp_con_t", this.mEventBase.mdl_tcp_end_t);
            VideoEvent.putToMap((Map) hashMap, "tcp_first_pack_t", this.mEventBase.mdl_ttfp);
            VideoEvent.putToMap((Map) hashMap, "http_first_body_t", this.mEventBase.mdl_httpfb);
            VideoEvent.putToMap((Map) hashMap, "http_open_end_t", this.mEventBase.mdl_http_open_end_t);
            VideoEvent.putToMap((Map) hashMap, "http_code", this.mEventBase.mdl_http_code);
        }
        VideoEvent.putToMap((Map) hashMap, "errt", this.mErrorType);
        VideoEvent.putToMap((Map) hashMap, "errc", this.mErrorCode);
        VideoEvent.putToMap((Map) hashMap, "es", this.mErrorStage);
        VideoEvent.putToMap((Map) hashMap, "vsc", this.vsc);
        VideoEvent.putToMap((Map) hashMap, "vsc_message", this.vscMessage);
        VideoEvent.putToMap((Map) hashMap, "retry_count", this.mRetryCount);
        StringBuilder sb = new StringBuilder("OneError: ");
        sb.append(hashMap.toString());
        TTVideoEngineLog.m110647i("VideoEventOneError", sb.toString());
        return new JSONObject(hashMap);
    }

    public void errorHappened(Error error) {
        this.mErrorCode = error.code;
        this.mErrorType = error.getType();
        sendErrorEvent();
    }

    VideoEventOneError(VideoEventBase videoEventBase) {
        this.mEventBase = videoEventBase;
    }

    public void errorHappened(int i, String str) {
        this.vsc = i;
        this.vscMessage = str;
        sendErrorEvent();
    }

    public void movieShouldRetry(Error error, int i, int i2) {
        this.mRetryCount++;
    }
}
