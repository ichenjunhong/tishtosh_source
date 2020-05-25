package com.p683ss.ttvideoengine.log;

import android.text.TextUtils;
import com.bytedance.android.livesdk.chatroom.p325ui.C6162et;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.log.VideoEvent */
public class VideoEvent {
    public Map abrInfo = null;
    public int accuErrCount = DynamicTabYellowPointVersion.DEFAULT;
    public String apiString = "";
    public int apiver = DynamicTabYellowPointVersion.DEFAULT;
    public int apiverFinal = DynamicTabYellowPointVersion.DEFAULT;
    public int asyncCodecId = DynamicTabYellowPointVersion.DEFAULT;
    public int asyncInit = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: at */
    public long f128650at = -2147483648L;
    public int audioBufferLength = DynamicTabYellowPointVersion.DEFAULT;
    public int audioCodecNameId = DynamicTabYellowPointVersion.DEFAULT;
    public long audioDeviceOpenedTime = -2147483648L;
    public long audioDeviceStartTime = -2147483648L;
    public String auth = "";

    /* renamed from: bc */
    public int f128651bc = DynamicTabYellowPointVersion.DEFAULT;
    public long bft = -2147483648L;
    public long bitrate = 0;

    /* renamed from: br */
    public int f128652br = DynamicTabYellowPointVersion.DEFAULT;
    public long bufferAccuT = -2147483648L;
    public int bufferSeconds = DynamicTabYellowPointVersion.DEFAULT;
    public String cacheDir = "";
    public int cacheFile = DynamicTabYellowPointVersion.DEFAULT;
    public int checkHijack = -1;
    public String chipBoardName = "";
    public String chipHardwareName = "";
    public long clockDiff = -2147483648L;
    public int codecPool = DynamicTabYellowPointVersion.DEFAULT;
    public String codec_type = "";
    public float containerFps = Float.MIN_VALUE;
    public float cpuUse = Float.MIN_VALUE;
    public int curAudioDecodeError = DynamicTabYellowPointVersion.DEFAULT;
    public long curPlayBackTime = -2147483648L;
    public int curVideoDecodeError = DynamicTabYellowPointVersion.DEFAULT;
    public int curVideoDecoderFps = DynamicTabYellowPointVersion.DEFAULT;
    public float curVideoOutputFps = Float.MIN_VALUE;
    public int curVideoRenderError = DynamicTabYellowPointVersion.DEFAULT;
    public int customP2PCDNType = DynamicTabYellowPointVersion.DEFAULT;
    public int dbc = DynamicTabYellowPointVersion.DEFAULT;
    public long decodeFirstAudioFrameT = -2147483648L;
    public long decodeFirstVideoFrameT = -2147483648L;
    public long decodeSecondVideoFrameT = -2147483648L;
    public long decoderBufferAccuT = -2147483648L;
    public int decoderType = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: df */
    public String f128653df = "";
    public int disableAccurateStart = DynamicTabYellowPointVersion.DEFAULT;
    public int dnsModule = DynamicTabYellowPointVersion.DEFAULT;
    public long dnsT = -2147483648L;
    public long dns_end_t = -2147483648L;
    public String dns_server_ip;
    public long dns_start_t = -2147483648L;
    public long download_speed = -2147483648L;
    public String drmTokenUrl = "";
    public int drmType = 0;
    public int dropCount = DynamicTabYellowPointVersion.DEFAULT;
    public String dynamic_type = "";
    public int enableBash = DynamicTabYellowPointVersion.DEFAULT;
    public int enableMDL = DynamicTabYellowPointVersion.DEFAULT;
    public int enableSharp = DynamicTabYellowPointVersion.DEFAULT;
    public String encryptKey;
    public int engineState = DynamicTabYellowPointVersion.DEFAULT;
    public int errCount = DynamicTabYellowPointVersion.DEFAULT;
    public int errc = DynamicTabYellowPointVersion.DEFAULT;
    public int errt = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: et */
    public long f128654et = -2147483648L;

    /* renamed from: ex */
    public Map f128655ex = null;
    public String externLogFromApp = "";
    public int fetchedAndLeaveByUser = DynamicTabYellowPointVersion.DEFAULT;
    public String filePath = "";
    public String filekey = "";
    public int finish = DynamicTabYellowPointVersion.DEFAULT;
    public long firstBufferEndT = -2147483648L;
    public long firstBufferStartT = -2147483648L;
    public double firstFrameSpeed = -2.147483648E9d;
    public int firstHijackCode = -1;
    public int first_errc = DynamicTabYellowPointVersion.DEFAULT;
    public int first_errc_internal = DynamicTabYellowPointVersion.DEFAULT;
    public int first_errt = DynamicTabYellowPointVersion.DEFAULT;
    public int formatType = DynamicTabYellowPointVersion.DEFAULT;
    public long generateP2PInfoEndTime = -2147483648L;
    public long generateP2PInfoStartTime = -2147483648L;
    public long getP2PUrlTime = -2147483648L;
    public int height = DynamicTabYellowPointVersion.DEFAULT;
    public int hijack = DynamicTabYellowPointVersion.DEFAULT;
    public int hijackRetry = -1;

    /* renamed from: hw */
    public int f128656hw = DynamicTabYellowPointVersion.DEFAULT;
    public int hwCodecException = DynamicTabYellowPointVersion.DEFAULT;
    public String hwCodecName = "";
    public String internalIP = "";
    public int isDisableShortSeek = DynamicTabYellowPointVersion.DEFAULT;
    public int isPreferNearestSample = DynamicTabYellowPointVersion.DEFAULT;
    public int isStartPlayAutomatically = DynamicTabYellowPointVersion.DEFAULT;
    public long lastBufferEndT = -2147483648L;
    public long lastBufferStartT = -2147483648L;
    public int lastHijackCode = -1;
    public long lastResolutionEndT = -2147483648L;
    public long lastResolutionStartT = -2147483648L;
    public long lastSeekEndT = -2147483648L;
    public int lastSeekPosition = DynamicTabYellowPointVersion.DEFAULT;
    public long lastSeekStartT = -2147483648L;
    public int leave_block_t = DynamicTabYellowPointVersion.DEFAULT;
    public int leave_method = DynamicTabYellowPointVersion.DEFAULT;
    public int leave_reason = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: lf */
    public String f128657lf = "";
    public int loadState = DynamicTabYellowPointVersion.DEFAULT;
    public String loaderType = "";
    public int loopcount = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: lt */
    public long f128658lt = -2147483648L;
    public int mBufferTimeout = 0;
    public String mCustomStr = "";
    public int mFramesSetDropNum = DynamicTabYellowPointVersion.DEFAULT;
    public String mInitialHost = "";
    public String mInitialIP = "";
    public String mInitialQuality = "";
    public String mInitialResolution = "";
    public String mInitialURL = "";
    public Map mPlayItem = null;
    public Map mPreloadInfo = null;
    public String mdlVersin = "";
    public int mediaCodecRender = DynamicTabYellowPointVersion.DEFAULT;
    public float memoryUse = Float.MIN_VALUE;
    public Map merror = null;
    public int mute = DynamicTabYellowPointVersion.DEFAULT;
    public String netClient = "";
    public int netWorkTryCount = DynamicTabYellowPointVersion.DEFAULT;
    public int networkTimeout = DynamicTabYellowPointVersion.DEFAULT;
    public String ownPlayerCreateException = "";
    public int p2pCDNType = DynamicTabYellowPointVersion.DEFAULT;
    public String p2pLoadInfo = "";
    public String p2pSDKVersion = "";
    public String p2pUrl = "";
    public long pauseAccuT = -2147483648L;

    /* renamed from: pc */
    public String f128659pc = "";
    public int playBackState = DynamicTabYellowPointVersion.DEFAULT;
    public int playCount = DynamicTabYellowPointVersion.DEFAULT;
    public double playEndSpeed = -2.147483648E9d;
    public long playPreparedT = -2147483648L;
    public long playStartedT = -2147483648L;
    public long playbackBufferEndT = -2147483648L;
    public Map playbackparams = null;
    public long player_created_t = -2147483648L;
    public int pluginException = DynamicTabYellowPointVersion.DEFAULT;
    public int preload = DynamicTabYellowPointVersion.DEFAULT;
    public long prepare_end_time = -2147483648L;
    public long prepare_start_time = -2147483648L;
    public String proxy_url = "";

    /* renamed from: pt */
    public long f128660pt = -2147483648L;

    /* renamed from: pv */
    public String f128661pv = "";
    public long receiveFirstAudioFrameT = -2147483648L;
    public long receiveFirstVideoFrameT = -2147483648L;
    public String render_type = "";
    public int reuseSocket = DynamicTabYellowPointVersion.DEFAULT;
    public String sdk_version = "";
    public int seekCount = DynamicTabYellowPointVersion.DEFAULT;
    public int seek_accu_t = DynamicTabYellowPointVersion.DEFAULT;
    public long server_local_diff = -2147483648L;
    public String sourceType = "";
    public int startTime = DynamicTabYellowPointVersion.DEFAULT;
    public String subTag = "";
    public int superRes = DynamicTabYellowPointVersion.DEFAULT;
    public String surfaceCode = "";
    public long surfaceSetTime = -2147483648L;

    /* renamed from: sv */
    public String f128662sv = "";
    public int switchResolutionCount = DynamicTabYellowPointVersion.DEFAULT;
    public String tag = "";
    public int textureRender = DynamicTabYellowPointVersion.DEFAULT;
    public String textureRenderError = "";
    public String traceID = null;
    public long tranConnectT = -2147483648L;
    public long tranFirstPacketT = -2147483648L;
    public int type = DynamicTabYellowPointVersion.DEFAULT;
    public int useVideoModelCache = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: v */
    public String f128663v = "";

    /* renamed from: vd */
    public int f128664vd = DynamicTabYellowPointVersion.DEFAULT;
    public int vds = DynamicTabYellowPointVersion.DEFAULT;
    public Map vidInfo;
    public int videoBufferLength = DynamicTabYellowPointVersion.DEFAULT;
    public int videoCodecNameId = DynamicTabYellowPointVersion.DEFAULT;
    public long videoDeviceOpenedTime = -2147483648L;
    public long videoDeviceStartTime = -2147483648L;
    public int video_preload_size = DynamicTabYellowPointVersion.DEFAULT;
    public int volume = DynamicTabYellowPointVersion.DEFAULT;
    public long vpls = 0;
    public int vps = DynamicTabYellowPointVersion.DEFAULT;

    /* renamed from: vs */
    public int f128665vs = DynamicTabYellowPointVersion.DEFAULT;
    public int vsc = DynamicTabYellowPointVersion.DEFAULT;
    public String vscMessage = "";

    /* renamed from: vt */
    public long f128666vt = -2147483648L;
    public String vtype = "";

    /* renamed from: vu */
    public ArrayList f128667vu = new ArrayList();
    public int watchduration = DynamicTabYellowPointVersion.DEFAULT;
    public int width = DynamicTabYellowPointVersion.DEFAULT;

    public JSONObject toJsonObject() {
        HashMap hashMap = new HashMap();
        putToMap((Map) hashMap, "log_type", "video_playq");
        putToMap((Map) hashMap, "vsc", this.vsc);
        putToMap((Map) hashMap, "vsc_message", this.vscMessage);
        putToMap((Map) hashMap, "sdk_version", this.sdk_version);
        putToMap((Map) hashMap, "plugin_exception", this.pluginException);
        putToMap((Map) hashMap, "sv", this.f128662sv);
        putToMap((Map) hashMap, "pv", this.f128661pv);
        putToMap((Map) hashMap, "pc", this.f128659pc);
        putToMap((Map) hashMap, "v", this.f128663v);
        putToMap((Map) hashMap, "play_type", this.type);
        putToMap((Map) hashMap, "pt", this.f128660pt);
        putToMap((Map) hashMap, "at", this.f128650at);
        putToMap((Map) hashMap, "prepare_start_time", this.prepare_start_time);
        putToMap((Map) hashMap, "prepare_end_time", this.prepare_end_time);
        putToMap((Map) hashMap, "play_preparedt", this.playPreparedT);
        putToMap((Map) hashMap, "play_startedt", this.playStartedT);
        putToMap((Map) hashMap, "vt", this.f128666vt);
        putToMap((Map) hashMap, C6162et.f16534a, this.f128654et);
        putToMap((Map) hashMap, "lt", this.f128658lt);
        putToMap((Map) hashMap, "bft", this.bft);
        putToMap((Map) hashMap, "bc", this.f128651bc);
        putToMap((Map) hashMap, "dbc", this.dbc);
        putToMap((Map) hashMap, "br", this.f128652br);
        putToMap((Map) hashMap, "vu", this.f128667vu);
        putToMap((Map) hashMap, "vd", this.f128664vd);
        putToMap((Map) hashMap, "vs", this.f128665vs);
        putToMap((Map) hashMap, "vps", this.vps);
        putToMap((Map) hashMap, "vds", this.vds);
        putToMap((Map) hashMap, "width", this.width);
        putToMap((Map) hashMap, "height", this.height);
        putToMap((Map) hashMap, "super_res", this.superRes);
        putToMap((Map) hashMap, "async_init", this.asyncInit);
        putToMap((Map) hashMap, "async_codec_id", this.asyncCodecId);
        putToMap((Map) hashMap, "download_speed", this.download_speed);
        putToMap((Map) hashMap, "video_preload_size", this.video_preload_size);
        putToMap((Map) hashMap, "errt", this.errt);
        putToMap((Map) hashMap, "errc", this.errc);
        putToMap((Map) hashMap, "df", this.f128653df);
        putToMap((Map) hashMap, "lf", this.f128657lf);
        putToMap((Map) hashMap, "codec", this.codec_type);
        putToMap((Map) hashMap, "render_type", this.render_type);
        putToMap((Map) hashMap, "merror", this.merror);
        putToMap((Map) hashMap, "hijack", this.hijack);
        putToMap((Map) hashMap, "hw", this.f128656hw);
        putToMap((Map) hashMap, "cache_file", this.cacheFile);
        putToMap((Map) hashMap, "decoder_type", this.decoderType);
        putToMap((Map) hashMap, "use_preload", this.preload);
        putToMap((Map) hashMap, "dns_t", this.dnsT);
        putToMap((Map) hashMap, "tran_ct", this.tranConnectT);
        putToMap((Map) hashMap, "tran_ft", this.tranFirstPacketT);
        putToMap((Map) hashMap, "re_f_videoframet", this.receiveFirstVideoFrameT);
        putToMap((Map) hashMap, "de_f_videoframet", this.decodeFirstVideoFrameT);
        putToMap((Map) hashMap, "re_f_audioframet", this.receiveFirstAudioFrameT);
        putToMap((Map) hashMap, "de_f_audioframet", this.decodeFirstAudioFrameT);
        putToMap((Map) hashMap, "bu_acu_t", this.bufferAccuT);
        putToMap((Map) hashMap, "de_bu_acu_t", this.decoderBufferAccuT);
        putToMap((Map) hashMap, "pause_acu_t", this.pauseAccuT);
        putToMap((Map) hashMap, "internal_ip", this.internalIP);
        putToMap((Map) hashMap, "accu_errc", this.accuErrCount);
        putToMap((Map) hashMap, "try_err_c", this.errCount);
        putToMap((Map) hashMap, "tag", this.tag);
        putToMap((Map) hashMap, "subtag", this.subTag);
        putToMap((Map) hashMap, "ex", this.f128655ex);
        putToMap((Map) hashMap, "first_buf_startt", this.firstBufferStartT);
        putToMap((Map) hashMap, "first_buf_endt", this.firstBufferEndT);
        putToMap((Map) hashMap, "cur_play_pos", this.curPlayBackTime);
        putToMap((Map) hashMap, "load_state", this.loadState);
        putToMap((Map) hashMap, "playback_state", this.playBackState);
        putToMap((Map) hashMap, "engine_state", this.engineState);
        putToMap((Map) hashMap, "video_out_fps", this.curVideoOutputFps);
        putToMap((Map) hashMap, "container_fps", this.containerFps);
        putToMap((Map) hashMap, "video_decoder_fps", this.curVideoDecoderFps);
        putToMap((Map) hashMap, "clock_diff", this.clockDiff);
        putToMap((Map) hashMap, "drop_count", this.dropCount);
        putToMap((Map) hashMap, "video_device_opened_t", this.videoDeviceOpenedTime);
        putToMap((Map) hashMap, "audio_device_opened_t", this.audioDeviceOpenedTime);
        putToMap((Map) hashMap, "generate_p2p_info_start_t", this.generateP2PInfoStartTime);
        putToMap((Map) hashMap, "generate_p2p_info_end_t", this.generateP2PInfoEndTime);
        putToMap((Map) hashMap, "get_p2p_url_t", this.getP2PUrlTime);
        putToMap((Map) hashMap, "finish", this.finish);
        putToMap((Map) hashMap, "cache_dir", this.cacheDir);
        putToMap((Map) hashMap, "file_path", this.filePath);
        putToMap((Map) hashMap, "file_key", this.filekey);
        putToMap((Map) hashMap, "is_start_play_automatically", this.isStartPlayAutomatically);
        putToMap((Map) hashMap, "player_create_exception", this.ownPlayerCreateException);
        putToMap((Map) hashMap, "preload", this.mPreloadInfo);
        putToMap((Map) hashMap, "playitem", this.mPlayItem);
        putToMap((Map) hashMap, "custom_str", this.mCustomStr);
        putToMap((Map) hashMap, "initial_url", this.mInitialURL);
        putToMap((Map) hashMap, "initial_host", this.mInitialHost);
        putToMap((Map) hashMap, "initial_ip", this.mInitialIP);
        putToMap((Map) hashMap, "initial_resolution", this.mInitialResolution);
        putToMap((Map) hashMap, "initial_quality", this.mInitialQuality);
        putToMap((Map) hashMap, "apiver", this.apiver);
        putToMap((Map) hashMap, "auth", this.auth);
        putToMap((Map) hashMap, "apiver_final", this.apiverFinal);
        putToMap((Map) hashMap, "playparam", this.playbackparams);
        putToMap((Map) hashMap, "vtype", this.vtype);
        putToMap((Map) hashMap, "dynamic_type", this.dynamic_type);
        putToMap((Map) hashMap, "lc", this.loopcount);
        putToMap((Map) hashMap, "switch_resolution_c", this.switchResolutionCount);
        putToMap((Map) hashMap, "watch_dur", this.watchduration);
        putToMap((Map) hashMap, "sc", this.seekCount);
        putToMap((Map) hashMap, "vid_cache", this.useVideoModelCache);
        putToMap((Map) hashMap, "p2p_cdn_type", this.p2pCDNType);
        putToMap((Map) hashMap, "custom_p2p_cdn_type", this.customP2PCDNType);
        putToMap((Map) hashMap, "p2p_url", this.p2pUrl);
        putToMap((Map) hashMap, "p2p_load_info", this.p2pLoadInfo);
        putToMap((Map) hashMap, "p2p_sdk_version", this.p2pSDKVersion);
        putToMap((Map) hashMap, "start_time", this.startTime);
        putToMap((Map) hashMap, "reuse_socket", this.reuseSocket);
        putToMap((Map) hashMap, "disable_accurate_start", this.disableAccurateStart);
        putToMap((Map) hashMap, "audio_codec_nameId", this.audioCodecNameId);
        putToMap((Map) hashMap, "video_codec_nameId", this.videoCodecNameId);
        putToMap((Map) hashMap, "format_type", this.formatType);
        putToMap((Map) hashMap, "surface_set_time", this.surfaceSetTime);
        putToMap((Map) hashMap, "surface_code", this.surfaceCode);
        putToMap((Map) hashMap, "frames_drop_set_num", this.mFramesSetDropNum);
        putToMap((Map) hashMap, "video_device_start_t", this.videoDeviceStartTime);
        putToMap((Map) hashMap, "audio_device_start_t", this.audioDeviceStartTime);
        putToMap((Map) hashMap, "video_length", this.videoBufferLength);
        putToMap((Map) hashMap, "audio_length", this.audioBufferLength);
        putToMap((Map) hashMap, "de_s_videoframet", this.decodeSecondVideoFrameT);
        putToMap((Map) hashMap, "extern_log_from_app", this.externLogFromApp);
        putToMap((Map) hashMap, "api_str", this.apiString);
        putToMap((Map) hashMap, "net_client", this.netClient);
        putToMap((Map) hashMap, "fetch_lv", this.fetchedAndLeaveByUser);
        putToMap((Map) hashMap, "volume", this.volume);
        putToMap((Map) hashMap, "mute", this.mute);
        putToMap((Map) hashMap, "source_type", this.sourceType);
        putToMap((Map) hashMap, "sharp", this.enableSharp);
        putToMap((Map) hashMap, "dns_server_ip", this.dns_server_ip);
        putToMap((Map) hashMap, "abr_info", this.abrInfo);
        putToMap((Map) hashMap, "enc_key", this.encryptKey);
        putToMap((Map) hashMap, "play_c", this.playCount);
        putToMap((Map) hashMap, "hw_codec_name", this.hwCodecName);
        putToMap((Map) hashMap, "hw_codec_exception", this.hwCodecException);
        putToMap((Map) hashMap, "proxy_url", this.proxy_url);
        putToMap((Map) hashMap, "enable_bash", this.enableBash);
        putToMap((Map) hashMap, "enable_mdl", this.enableMDL);
        putToMap((Map) hashMap, "network_try_count", this.netWorkTryCount);
        putToMap((Map) hashMap, "chipboard", this.chipBoardName);
        putToMap((Map) hashMap, "chiphardware", this.chipHardwareName);
        putToMap((Map) hashMap, "buffer_timeout", this.mBufferTimeout);
        putToMap((Map) hashMap, "dns_start_t", this.dns_start_t);
        putToMap((Map) hashMap, "dns_end_t", this.dns_end_t);
        putToMap((Map) hashMap, "player_created_t", this.player_created_t);
        putToMap((Map) hashMap, "fir_errt", this.first_errt);
        putToMap((Map) hashMap, "fir_errc", this.first_errc);
        putToMap((Map) hashMap, "fir_errc_in", this.first_errc_internal);
        putToMap((Map) hashMap, "vid_info", this.vidInfo);
        putToMap((Map) hashMap, "lv_reason", this.leave_reason);
        putToMap((Map) hashMap, "lv_bt", this.leave_block_t);
        putToMap((Map) hashMap, "lv_method", this.leave_method);
        putToMap((Map) hashMap, "sat", this.seek_accu_t);
        putToMap((Map) hashMap, "lsst", this.lastSeekStartT);
        putToMap((Map) hashMap, "lset", this.lastSeekEndT);
        putToMap((Map) hashMap, "lbst", this.lastBufferStartT);
        putToMap((Map) hashMap, "lbet", this.lastBufferEndT);
        putToMap((Map) hashMap, "ldst", this.lastResolutionStartT);
        putToMap((Map) hashMap, "ldet", this.lastResolutionEndT);
        putToMap((Map) hashMap, "lsp", this.lastSeekPosition);
        putToMap((Map) hashMap, "sl_diff", this.server_local_diff);
        putToMap((Map) hashMap, "trace_id", this.traceID);
        putToMap((Map) hashMap, "vpls", this.vpls);
        putToMap((Map) hashMap, "network_timeout", this.networkTimeout);
        putToMap((Map) hashMap, "is_pref_near_sam", this.isPreferNearestSample);
        putToMap((Map) hashMap, "mediacodec_render", this.mediaCodecRender);
        putToMap((Map) hashMap, "is_disable_short_seek", this.isDisableShortSeek);
        putToMap((Map) hashMap, "check_hijack", this.checkHijack);
        putToMap((Map) hashMap, "hijack_retry", this.hijackRetry);
        putToMap((Map) hashMap, "first_hijack_code", this.firstHijackCode);
        putToMap((Map) hashMap, "last_hijack_code", this.lastHijackCode);
        putToMap((Map) hashMap, "drm_type", this.drmType);
        putToMap((Map) hashMap, "drm_token_url", this.drmTokenUrl);
        putToMap((Map) hashMap, "mdl_loader_type", this.loaderType);
        putToMap((Map) hashMap, "mdl_version", this.mdlVersin);
        putToMap((Map) hashMap, "dns_mod", this.dnsModule);
        putToMap((Map) hashMap, "vd_err", this.curVideoDecodeError);
        putToMap((Map) hashMap, "ad_err", this.curAudioDecodeError);
        putToMap((Map) hashMap, "vr_err", this.curVideoRenderError);
        putToMap((Map) hashMap, "mem_use", this.memoryUse);
        putToMap((Map) hashMap, "cpu_use", this.cpuUse);
        putToMap((Map) hashMap, "vt_speed", (float) this.firstFrameSpeed);
        putToMap((Map) hashMap, "end_speed", (float) this.playEndSpeed);
        putToMap((Map) hashMap, "super_res", this.superRes);
        putToMap((Map) hashMap, "mediacodec_render", this.mediaCodecRender);
        putToMap((Map) hashMap, "tr", this.textureRender);
        putToMap((Map) hashMap, "tr_err", this.textureRenderError);
        putToMap((Map) hashMap, "pbt", this.playbackBufferEndT);
        putToMap((Map) hashMap, "cp", this.codecPool);
        putToMap((Map) hashMap, "bit_rate", this.bitrate);
        return new JSONObject(hashMap);
    }

    public static void putToMap(Map map, String str, float f) {
        if (f != Float.MIN_VALUE) {
            map.put(str, Float.valueOf(f));
        }
    }

    public static void putToMap(Map map, String str, int i) {
        if (i != Integer.MIN_VALUE) {
            map.put(str, Integer.valueOf(i));
        }
    }

    public static void putToMap(Map map, String str, long j) {
        if (j != -2147483648L) {
            map.put(str, Long.valueOf(j));
        }
    }

    public static void putToMap(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    public static void putToMap(Map map, String str, ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            map.put(str, arrayList);
        }
    }

    public static void putToMap(Map map, String str, Map map2) {
        if (map2 != null && !map2.isEmpty()) {
            map.put(str, map2);
        }
    }
}
