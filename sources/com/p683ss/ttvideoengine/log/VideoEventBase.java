package com.p683ss.ttvideoengine.log;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18978d;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.ttvideoengine.model.VideoInfo;
import com.p683ss.ttvideoengine.model.VideoModel;
import com.p683ss.ttvideoengine.utils.SessionIDGenerator;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.log.VideoEventBase */
public class VideoEventBase {
    public int audioCodecNameId = DynamicTabYellowPointVersion.DEFAULT;
    public String codec_type = "";
    public String dynamic_type = "";
    public int formatType = DynamicTabYellowPointVersion.DEFAULT;
    public Context mContext;
    public String mCurHost;
    public String mCurIP;
    public String mCurQuality;
    public String mCurResolution;
    public String mCurURL;
    public String mCurrentResolution = "";
    public EventLoggerSource mDataSource;
    public String mDeviceId;
    public int mDisAbleV3Async;
    public String mDrmTokenUrl = "";
    public int mDrmType;
    public String mInitialHost;
    public String mInitialIP;
    public String mInitialURL;
    public String mLastResolution = "";
    public String mMDLInfo = "";
    public String mNetworkType = "";
    public int mP2PCDNType = DynamicTabYellowPointVersion.DEFAULT;
    public float mPlaySpeed = 1.0f;
    public int mPlayType;
    public int mReuseSocket;
    public String mSessionID;
    public String mSourceTypeStr = "";
    public String mSubTag = "default";
    public String mTag = "default";
    public String mTraceID = "";
    public String mVid = "";
    public int mVideoHW = DynamicTabYellowPointVersion.DEFAULT;
    private Map mVideoInfo;
    public long mdl_cur_cache_pos = -2147483648L;
    public long mdl_cur_end_pos = -2147483648L;
    public String mdl_cur_host = "";
    public String mdl_cur_ip = "";
    public long mdl_cur_req_pos = -2147483648L;
    public int mdl_cur_soure = -1;
    public int mdl_cur_task_num = DynamicTabYellowPointVersion.DEFAULT;
    public long mdl_dns_t = -2147483648L;
    public long mdl_down_pos = -2147483648L;
    public long mdl_end_t = -2147483648L;
    public int mdl_error_code;
    public String mdl_extra_info = "";
    public String mdl_file_key = "";
    public long mdl_fs = -2147483648L;
    public int mdl_http_code = -1;
    public long mdl_http_open_end_t = -2147483648L;
    public long mdl_httpfb = -2147483648L;
    public int mdl_is_socrf = -1;
    public int mdl_player_wait_num = DynamicTabYellowPointVersion.DEFAULT;
    public long mdl_player_wait_time = -2147483648L;
    public String mdl_re_url = "";
    public long mdl_reply_size = -2147483648L;
    public int mdl_req_num = -1;
    public long mdl_req_t = -2147483648L;
    public int mdl_speed = DynamicTabYellowPointVersion.DEFAULT;
    public int mdl_stage = DynamicTabYellowPointVersion.DEFAULT;
    public long mdl_tcp_end_t = -2147483648L;
    public long mdl_tcp_start_t = -2147483648L;
    public long mdl_ttfp = -2147483648L;
    public int mdl_url_index = -1;

    /* renamed from: pc */
    public String f128668pc = "";

    /* renamed from: pv */
    public String f128669pv = "";
    public String sdk_version = "";

    /* renamed from: sv */
    public String f128670sv = "";

    /* renamed from: vd */
    public int f128671vd = DynamicTabYellowPointVersion.DEFAULT;
    public int videoCodecNameId = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: vs */
    public int f128672vs = DynamicTabYellowPointVersion.DEFAULT;
    public String vtype = "";

    /* renamed from: com.ss.ttvideoengine.log.VideoEventBase$_lancet */
    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo */
        static NetworkInfo m110640xea89a0b0(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                return C18978d.m46154a();
            }
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getNetworkInfo */
        static NetworkInfo m110641x228a3316(ConnectivityManager connectivityManager, int i) {
            try {
                return connectivityManager.getNetworkInfo(i);
            } catch (Exception e) {
                C32458a.m75148a((Throwable) e);
                return C18978d.m46154a();
            }
        }
    }

    public String getCurHost() {
        return this.mCurHost;
    }

    public String getCurIP() {
        return this.mCurIP;
    }

    public String getCurQuality() {
        return this.mCurQuality;
    }

    public String getCurResolution() {
        return this.mCurResolution;
    }

    public String getCurURL() {
        return this.mCurURL;
    }

    public void movieFinish() {
        updateVideoInfo(null);
    }

    public void updateMDLInfo() {
        String str;
        synchronized (this) {
            str = this.mMDLInfo;
        }
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    JSONObject jSONObject = new JSONObject(str);
                    if (!jSONObject.isNull("cur_req_pos")) {
                        this.mdl_cur_req_pos = ((Number) jSONObject.get("cur_req_pos")).longValue();
                    }
                    if (!jSONObject.isNull("cur_end_pos")) {
                        this.mdl_cur_end_pos = ((Number) jSONObject.get("cur_end_pos")).longValue();
                    }
                    if (!jSONObject.isNull("cur_cache_pos")) {
                        this.mdl_cur_cache_pos = ((Number) jSONObject.get("cur_cache_pos")).longValue();
                    }
                    if (!jSONObject.isNull("down_pos")) {
                        this.mdl_down_pos = ((Number) jSONObject.get("down_pos")).longValue();
                    }
                    if (!jSONObject.isNull("err_code")) {
                        this.mdl_error_code = ((Integer) jSONObject.get("err_code")).intValue();
                    }
                    if (!jSONObject.isNull("player_wait_num")) {
                        this.mdl_player_wait_num = ((Integer) jSONObject.get("player_wait_num")).intValue();
                    }
                    if (!jSONObject.isNull("player_wait_time")) {
                        this.mdl_player_wait_time = ((Number) jSONObject.get("player_wait_time")).longValue();
                    }
                    if (!jSONObject.isNull("reply_size")) {
                        this.mdl_reply_size = ((Number) jSONObject.get("reply_size")).longValue();
                    }
                    if (!jSONObject.isNull("stage")) {
                        this.mdl_stage = ((Integer) jSONObject.get("stage")).intValue();
                    }
                    if (!jSONObject.isNull("cur_host")) {
                        this.mdl_cur_host = jSONObject.get("cur_host").toString();
                    }
                    if (!jSONObject.isNull("cur_ip")) {
                        this.mdl_cur_ip = jSONObject.get("cur_ip").toString();
                    }
                    if (!jSONObject.isNull("cur_task_num")) {
                        this.mdl_cur_task_num = ((Integer) jSONObject.get("cur_task_num")).intValue();
                    }
                    if (!jSONObject.isNull("speed")) {
                        this.mdl_speed = ((Integer) jSONObject.get("speed")).intValue();
                    }
                    if (!jSONObject.isNull("file_key")) {
                        this.mdl_file_key = jSONObject.get("file_key").toString();
                    }
                    if (!jSONObject.isNull("is_socrf")) {
                        this.mdl_is_socrf = ((Integer) jSONObject.get("is_socrf")).intValue();
                    }
                    if (!jSONObject.isNull("req_num")) {
                        this.mdl_req_num = ((Integer) jSONObject.get("req_num")).intValue();
                    }
                    if (!jSONObject.isNull("url_index")) {
                        this.mdl_url_index = ((Integer) jSONObject.get("url_index")).intValue();
                    }
                    if (!jSONObject.isNull("re_url")) {
                        this.mdl_re_url = jSONObject.get("re_url").toString();
                    }
                    if (!jSONObject.isNull("cur_source")) {
                        this.mdl_cur_soure = ((Integer) jSONObject.get("cur_source")).intValue();
                    }
                    if (!jSONObject.isNull("extra_info")) {
                        this.mdl_extra_info = jSONObject.get("extra_info").toString();
                    }
                    if (!jSONObject.isNull("status_code")) {
                        this.mdl_http_code = ((Integer) jSONObject.get("status_code")).intValue();
                    }
                    if (!jSONObject.isNull("req_t")) {
                        this.mdl_req_t = ((Number) jSONObject.get("req_t")).longValue();
                    }
                    if (!jSONObject.isNull("end_t")) {
                        this.mdl_end_t = ((Number) jSONObject.get("end_t")).longValue();
                    }
                    if (!jSONObject.isNull("dns_t")) {
                        this.mdl_dns_t = ((Number) jSONObject.get("dns_t")).longValue();
                    }
                    if (!jSONObject.isNull("tcp_con_start_t")) {
                        this.mdl_tcp_start_t = ((Number) jSONObject.get("tcp_con_start_t")).longValue();
                    }
                    if (!jSONObject.isNull("tcp_con_t")) {
                        this.mdl_tcp_end_t = ((Number) jSONObject.get("tcp_con_t")).longValue();
                    }
                    if (!jSONObject.isNull("tcp_first_pack_t")) {
                        this.mdl_ttfp = ((Number) jSONObject.get("tcp_first_pack_t")).longValue();
                    }
                    if (!jSONObject.isNull("http_first_body_t")) {
                        this.mdl_httpfb = ((Number) jSONObject.get("http_first_body_t")).longValue();
                    }
                    if (!jSONObject.isNull("http_open_end_t")) {
                        this.mdl_http_open_end_t = ((Number) jSONObject.get("http_open_end_t")).longValue();
                    }
                    if (!jSONObject.isNull("fs")) {
                        this.mdl_fs = ((Number) jSONObject.get("fs")).longValue();
                    }
                }
            } catch (JSONException e) {
                TTVideoEngineLog.m110645d(e);
            }
        }
    }

    public void setCurHost(String str) {
        this.mCurHost = str;
    }

    public void setCurIP(String str) {
        this.mCurIP = str;
    }

    public void setCurQuality(String str) {
        this.mCurQuality = str;
    }

    public void setCurResolution(String str) {
        this.mCurResolution = str;
    }

    public void setCurURL(String str) {
        this.mCurURL = str;
    }

    public void setP2PCDNType(int i) {
        this.mP2PCDNType = i;
    }

    public void setTag(String str) {
        this.mTag = str;
    }

    public void useVideoHW(int i) {
        this.mVideoHW = i;
    }

    public static String getNetworkType(Context context) {
        if (context == null) {
            return "unknown";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return "unavailable";
        }
        NetworkInfo com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo = _lancet.m110640xea89a0b0(connectivityManager);
        if (com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo == null || !com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getActiveNetworkInfo.isAvailable()) {
            return "unavailable";
        }
        NetworkInfo com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getNetworkInfo = _lancet.m110641x228a3316(connectivityManager, 1);
        if (com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getNetworkInfo != null) {
            State state = com_ss_android_ugc_aweme_lancet_network_ConnecttivityManagerLancet_getNetworkInfo.getState();
            if (state != null && (state == State.CONNECTED || state == State.CONNECTING)) {
                return "WIFI";
            }
        }
        int networkType = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
        if (networkType == 20) {
            return "5G";
        }
        switch (networkType) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2G";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3G";
            case 13:
                return "4G";
            default:
                return "wwan";
        }
    }

    VideoEventBase(EventLoggerSource eventLoggerSource) {
        this.mDataSource = eventLoggerSource;
        this.mSessionID = SessionIDGenerator.generateSessionID(null);
    }

    public void setVideoInfo(VideoModel videoModel) {
        if (videoModel != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            if (videoModel.getVideoRef() != null) {
                List<VideoInfo> videoInfoList = videoModel.getVideoRef().getVideoInfoList();
                if (videoInfoList != null && videoInfoList.size() > 0) {
                    for (VideoInfo videoInfo : videoInfoList) {
                        String resolution = videoInfo.getResolution().toString(videoInfo.getMediatype());
                        hashMap.put(resolution, Long.valueOf(videoInfo.getValueLong(12)));
                        hashMap2.put(resolution, videoInfo.getValueStr(8));
                    }
                }
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("duration", Integer.valueOf(videoModel.getVideoRefInt(3)));
            hashMap3.put("size", hashMap);
            hashMap3.put("codec", hashMap2);
            hashMap3.put("vtype", videoModel.getVType());
            hashMap3.put("dynamic_type", videoModel.getDynamicType());
            this.mVideoInfo = hashMap3;
        }
    }

    public void updateVideoInfo(VideoModel videoModel) {
        Object obj;
        if (videoModel != null) {
            setVideoInfo(videoModel);
        }
        if (this.mVideoInfo != null) {
            if (this.f128671vd <= 0) {
                this.f128671vd = ((Integer) this.mVideoInfo.get("duration")).intValue() * 1000;
            }
            Object obj2 = ((Map) this.mVideoInfo.get("size")).get(this.mCurrentResolution);
            int i = -1;
            if (obj2 != null) {
                i = ((Long) obj2).intValue();
            }
            this.f128672vs = i;
            Map map = (Map) this.mVideoInfo.get("codec");
            if (map.get(this.mCurrentResolution) != null) {
                obj = map.get(this.mCurrentResolution);
            } else {
                obj = "";
            }
            this.codec_type = (String) obj;
            this.vtype = (String) this.mVideoInfo.get("vtype");
            this.dynamic_type = (String) this.mVideoInfo.get("dynamic_type");
        }
        if (this.mDataSource != null) {
            Map versionInfo = this.mDataSource.versionInfo();
            if (versionInfo != null) {
                this.f128669pv = (String) versionInfo.get("pv");
                this.f128668pc = (String) versionInfo.get("pc");
                this.f128670sv = (String) versionInfo.get("sv");
                this.sdk_version = (String) versionInfo.get("sdk_version");
            }
            String logValueStr = this.mDataSource.getLogValueStr(0);
            if (!TextUtils.isEmpty(logValueStr)) {
                this.codec_type = logValueStr;
            }
            this.videoCodecNameId = this.mDataSource.getLogValueInt(24);
            this.audioCodecNameId = this.mDataSource.getLogValueInt(25);
            switch (this.videoCodecNameId) {
                case 2:
                    this.mVideoHW = 1;
                    break;
                case 3:
                case 5:
                case 6:
                case 7:
                    this.mVideoHW = 0;
                    break;
            }
            this.formatType = this.mDataSource.getLogValueInt(49);
            synchronized (this) {
                this.mMDLInfo = this.mDataSource.getMediaLoaderInfo();
            }
            if (this.mDisAbleV3Async == 1) {
                this.mNetworkType = getNetworkType(this.mContext);
                updateMDLInfo();
            }
            StringBuilder sb = new StringBuilder("info from mdl: ");
            sb.append(this.mMDLInfo);
            sb.append(", traceID: ");
            sb.append(this.mTraceID);
            TTVideoEngineLog.m110647i("VideoEventBase", sb.toString());
        }
    }

    public void configResolution(String str, String str2) {
        this.mLastResolution = str2;
        this.mCurrentResolution = str;
    }

    public void beginToPlay(String str, String str2) {
        this.mVid = str;
        this.mDeviceId = str2;
        this.mSessionID = SessionIDGenerator.generateSessionID(this.mDeviceId);
    }

    public void setSourceType(int i, String str) {
        switch (i) {
            case 0:
                this.mSourceTypeStr = "local_url";
                break;
            case 1:
                this.mSourceTypeStr = "dir_url";
                break;
            case 2:
                this.mSourceTypeStr = "playitem";
                break;
            case 3:
                this.mSourceTypeStr = "preload";
                break;
            case 4:
                this.mSourceTypeStr = C22858c.f61207c;
                break;
            case 5:
                this.mSourceTypeStr = "vid";
                break;
            case 6:
                this.mSourceTypeStr = "fd";
                break;
            case 7:
                this.mSourceTypeStr = "mds";
                break;
        }
        this.mVid = str;
    }
}
