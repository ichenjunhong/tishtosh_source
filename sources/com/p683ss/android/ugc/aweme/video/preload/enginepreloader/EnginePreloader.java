package com.p683ss.android.ugc.aweme.video.preload.enginepreloader;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ttve.nativePort.TEVideoRecorder;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.model.BitRate;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p683ss.android.ugc.aweme.player.C38824a;
import com.p683ss.android.ugc.aweme.player.C38850c;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayerAbChecksumLevelExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayerAbEnableDebugLogExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayerAbPreloadSizeOffsetThresholdExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayerAbTestSpeedVersionExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.abr.PlayerAbABRAlgoExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.abr.PlayerAbABRSpeedPredictAlgoExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.abr.PlayerAbABRSpeedPredictTimeIntervalExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.dnstype.PlayerAbBackupDnsTypeExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.dnstype.PlayerAbMainDnsDelayTimeExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.dnstype.PlayerAbMainDnsTypeExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.medialoader.PlayerAbMedialoaderAccessCheckLevelExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.medialoader.PlayerAbMedialoaderEnableBenchmarkExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.medialoader.PlayerAbMedialoaderEnablePreconneExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.medialoader.PlayerAbMedialoaderEnableSpeedCoefficientExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.medialoader.PlayerAbMedialoaderEnableTLSSessionReuseExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.medialoader.PlayerAbMedialoaderEnableTaskReuseExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.medialoader.PlayerAbMedialoaderPreconnectNumExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.medialoader.PlayerAbMedialoaderTLSVersionExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.medialoader.PlayerAbMedialoaderTaskReuseParallelNextThresholdExp;
import com.p683ss.android.ugc.aweme.setting.model.MLModel;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.android.ugc.aweme.video.C47985af;
import com.p683ss.android.ugc.aweme.video.C48001c;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.p683ss.android.ugc.aweme.video.experiment.DisableVideocacheLocalServerExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.EnableP2pStragetyControlExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.P2pStragetyExpiredTimeExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.P2pStragetyMaxBufferingTimeExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.P2pStragetyMaxLeaveWaitTimeExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.P2pStragetyMinPlayNumberExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerDataEncryptExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.RingBufferSizeMdlExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.UsePrivateCachePathExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.VideoCacheLoaderTypeExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.VideoCacheMaxCacheSizeExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.VideoCacheP2pLevelExperiment;
import com.p683ss.android.ugc.aweme.video.preload.C48072b;
import com.p683ss.android.ugc.aweme.video.preload.C48073c;
import com.p683ss.android.ugc.aweme.video.preload.C48074d;
import com.p683ss.android.ugc.aweme.video.preload.C48075e;
import com.p683ss.android.ugc.aweme.video.preload.C48083f;
import com.p683ss.android.ugc.aweme.video.preload.C48085g;
import com.p683ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderConcurrentNumExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderConfigExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderEnableNetworkChangedListenExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderOpenTimeoutExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderPreloadStrategyExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderRWTimeoutExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.EnginePreloaderStackOrQueueExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.PlayerPreloadLazyGetUrlsExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoNetworkSpeedAlgorithmExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoSpeedQueueSizeExperiment;
import com.p683ss.android.ugc.p2454f.C48918e;
import com.p683ss.android.ugc.playerkit.p2493b.C50107b;
import com.p683ss.android.ugc.playerkit.p2494c.C50109a;
import com.p683ss.android.ugc.playerkit.session.C50122a;
import com.p683ss.android.ugc.playerkit.videoview.p2495a.C50133a;
import com.p683ss.android.ugc.playerkit.videoview.p2497c.C50141a;
import com.p683ss.mediakit.fetcher.AVMDLURLFetcherBridge;
import com.p683ss.mediakit.medialoader.AVMDLLog;
import com.p683ss.ttvideoengine.DataLoaderHelper;
import com.p683ss.ttvideoengine.DataLoaderHelper.DataLoaderCacheFileInfo;
import com.p683ss.ttvideoengine.DataLoaderHelper.DataLoaderTaskProgressInfo;
import com.p683ss.ttvideoengine.DataLoaderListener;
import com.p683ss.ttvideoengine.DataLoaderResourceProvider;
import com.p683ss.ttvideoengine.Resolution;
import com.p683ss.ttvideoengine.TTVideoEngine;
import com.p683ss.ttvideoengine.fetcher.FetcherMaker;
import com.p683ss.ttvideoengine.model.VideoModel;
import com.p683ss.ttvideoengine.utils.DataLoaderCDNLog;
import com.p683ss.ttvideoengine.utils.Error;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p064c.p065a.C1663a;
import p064c.p065a.C2177l;
import p064c.p065a.p093k.C2168a;
import p064c.p065a.p094l.C2180b;
import p064c.p065a.p095m.C2191a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader */
public final class EnginePreloader implements C48073c {

    /* renamed from: a */
    public static final boolean f120804a = false;

    /* renamed from: b */
    public WeakReference<C48072b> f120805b;

    /* renamed from: c */
    C48074d f120806c;

    /* renamed from: d */
    C2180b<Integer> f120807d;

    /* renamed from: e */
    int f120808e;

    /* renamed from: f */
    public Map<String, List<C48083f>> f120809f = new LinkedHashMap<String, List<C48083f>>() {
        /* access modifiers changed from: protected */
        public final boolean removeEldestEntry(Entry entry) {
            if (size() > 10) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: g */
    private volatile boolean f120810g;

    /* renamed from: h */
    private int f120811h;

    /* renamed from: i */
    private boolean f120812i;

    /* renamed from: j */
    private File f120813j;

    /* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader$CDNLog */
    public static class CDNLog {
        @C17952c(mo34828a = "contentLength")
        public long contentLength;
        @C17952c(mo34828a = "f_key")
        public String fileKey;
        @C17952c(mo34828a = "url")
        public String finalUrl;
        @C17952c(mo34828a = "host")
        public String host;
        @C17952c(mo34828a = "is_redirect")
        public int isRedirect;
        @C17952c(mo34828a = "ori_url")
        public String oriUrl;
        @C17952c(mo34828a = "req_end_t")
        public long reqEndT;
        @C17952c(mo34828a = "req_start_t")
        public long reqStartT;
        @C17952c(mo34828a = "server_ip")
        public String serverIp;
        @C17952c(mo34828a = "status_code")
        public int statusCode;
        @C17952c(mo34828a = "ttfb")
        public long ttfb;
        @C17952c(mo34828a = "x_cache")
        public String xCache;
        @C17952c(mo34828a = "x_m_cache")
        public String xMCache;
    }

    /* renamed from: com.ss.android.ugc.aweme.video.preload.enginepreloader.EnginePreloader$a */
    public static class C48082a {

        /* renamed from: a */
        public static final EnginePreloader f120827a = new EnginePreloader();
    }

    /* renamed from: a */
    public final Object mo95341a(VideoUrlModel videoUrlModel, String str, String[] strArr) {
        return null;
    }

    /* renamed from: d */
    public final String mo95352d() {
        return "engine";
    }

    /* renamed from: e */
    public final C48075e mo95354e(VideoUrlModel videoUrlModel) {
        return null;
    }

    /* renamed from: h */
    public final List<C47985af> mo95358h(VideoUrlModel videoUrlModel) {
        return null;
    }

    /* renamed from: b */
    public final void mo95348b() {
        DataLoaderHelper.getDataLoader().cancelAllTasks();
    }

    /* renamed from: c */
    public final void mo95350c() {
        DataLoaderHelper.getDataLoader().clearAllCaches();
    }

    /* renamed from: e */
    public final File mo95355e() {
        return this.f120813j;
    }

    /* renamed from: f */
    private String m104119f() {
        File file;
        Context a = C11010c.m22280a();
        if (a == null) {
            return null;
        }
        boolean z = true;
        try {
            if (C10181b.m20511a().mo18168a(UsePrivateCachePathExperiment.class, true, "player_cache_use_private_path", 31744, 1) != 1) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (!C48016e.m103957g() || z) {
            file = a.getCacheDir();
        } else {
            file = C48016e.m103941b(a);
        }
        if (file == null) {
            return null;
        }
        File file2 = new File(file, "cachev2");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        this.f120813j = file2;
        return file2.getAbsolutePath();
    }

    /* renamed from: a */
    public final boolean mo95343a() {
        String f = m104119f();
        if (!TextUtils.isEmpty(f)) {
            try {
                if (C48085g.m104142a()) {
                    int a = C10181b.m20511a().mo18168a(VideoCacheLoaderTypeExperiment.class, true, "videocache_loader_type", 31744, 0);
                    if (a > 0) {
                        TTVideoEngine.setIntValue(5, a);
                    }
                }
                this.f120812i = C10181b.m20511a().mo18172a(PlayerPreloadLazyGetUrlsExperiment.class, true, "player_preload_lazy_get_urls", 31744, true);
                int a2 = C10181b.m20511a().mo18168a(VideoSpeedQueueSizeExperiment.class, true, "video_speed_queue_size", 31744, 10);
                if (C48918e.f123069c != a2 && a2 > 0) {
                    C48918e.f123069c = a2;
                    C48918e.m105713a().mo96743a(a2);
                }
                TTVideoEngine.setIntValue(30, C10181b.m20511a().mo18168a(PlayerDataEncryptExperiment.class, true, "player_data_encrpt", 31744, 1));
                TTVideoEngine.setIntValue(16, C10181b.m20511a().mo18168a(VideoCacheP2pLevelExperiment.class, true, "videocache_p2p_level", 31744, 0));
                int a3 = C10181b.m20511a().mo18168a(VideoCacheMaxCacheSizeExperiment.class, true, "player_cache_max_size", 31744, -1);
                if (a3 > VideoCacheMaxCacheSizeExperiment.MIN_SIZE) {
                    TTVideoEngine.setIntValue(1, a3 * VideoCacheMaxCacheSizeExperiment.UNIT_CONVERSION);
                }
                TTVideoEngine.setIntValue(1005, C10181b.m20511a().mo18168a(DisableVideocacheLocalServerExperiment.class, true, "disable_videocache_local_server", 31744, 0));
                TTVideoEngine.setIntValue(1006, C10181b.m20511a().mo18168a(RingBufferSizeMdlExperiment.class, true, "ring_buffer_size", 31744, -1));
                TTVideoEngine.setIntValue(15, 0);
                TTVideoEngine.setIntValue(93, C10181b.m20511a().mo18168a(PlayerAbMedialoaderEnableBenchmarkExp.class, true, "player_medialoader_enable_benchmark_io", 31744, 0));
                TTVideoEngine.setIntValue(94, C10181b.m20511a().mo18168a(PlayerAbMedialoaderEnableSpeedCoefficientExp.class, true, "player_medialoader_enable_speed_coefficient", 31744, 0));
                TTVideoEngine.setIntValue(3, C10181b.m20511a().mo18168a(EnginePreloaderOpenTimeoutExperiment.class, true, "engine_preloader_open_timeout", 31744, 10));
                TTVideoEngine.setIntValue(BaseNotice.COMMENT_REPLY_WITH_VIDEO, C10181b.m20511a().mo18168a(EnginePreloaderEnableNetworkChangedListenExperiment.class, true, "engine_preloader_enable_network_changed_listen", 31744, 0));
                TTVideoEngine.setIntValue(2, C10181b.m20511a().mo18168a(EnginePreloaderRWTimeoutExperiment.class, true, "engine_preloader_rw_timeout", 31744, 10));
                TTVideoEngine.setIntValue(11, C10181b.m20511a().mo18168a(EnginePreloaderConcurrentNumExperiment.class, true, "engine_preloader_concurrent_num", 31744, 1));
                TTVideoEngine.setIntValue(80, C10181b.m20511a().mo18168a(EnginePreloaderStackOrQueueExperiment.class, true, "engine_preloader_queue_or_stack", 31744, 1));
                TTVideoEngine.setIntValue(12, C10181b.m20511a().mo18168a(EnginePreloaderPreloadStrategyExperiment.class, true, "engine_preloader_preload_strategy", 31744, 1));
                TTVideoEngine.setIntValue(13, C10181b.m20511a().mo18168a(PlayerAbChecksumLevelExp.class, true, "checksum_level", 31744, 0));
                TTVideoEngine.setIntValue(14, C10181b.m20511a().mo18168a(PlayerAbTestSpeedVersionExp.class, true, "player_test_speed_version", 31744, 2));
                TTVideoEngine.setIntValue(90, C10181b.m20511a().mo18168a(PlayerAbMainDnsTypeExp.class, true, "player_ab_main_dns_type", 31744, 0));
                TTVideoEngine.setIntValue(91, C10181b.m20511a().mo18168a(PlayerAbBackupDnsTypeExp.class, true, "player_ab_backup_dns_type", 31744, 3));
                TTVideoEngine.setIntValue(92, C10181b.m20511a().mo18168a(PlayerAbMainDnsDelayTimeExp.class, true, "player_ab_main_dns_timeout", 31744, 0));
                TTVideoEngine.setIntValue(1102, C10181b.m20511a().mo18168a(PlayerAbMedialoaderAccessCheckLevelExp.class, true, "player_medialoader_access_check_level", 31744, 0));
                TTVideoEngine.setIntValue(1101, C10181b.m20511a().mo18168a(PlayerAbMedialoaderEnableTaskReuseExp.class, true, "player_medialoader_enable_task_reuse", 31744, 0));
                TTVideoEngine.setIntValue(1103, C10181b.m20511a().mo18168a(PlayerAbMedialoaderTaskReuseParallelNextThresholdExp.class, true, "player_medialoader_task_reuse_parallel_next_threshold", 31744, 0));
                TTVideoEngine.setIntValue(1001, C10181b.m20511a().mo18168a(PlayerAbMedialoaderEnablePreconneExp.class, true, "player_medialoader_enable_preconnect", 31744, 0));
                TTVideoEngine.setIntValue(BaseNotice.CHECK_PROFILE, C10181b.m20511a().mo18168a(PlayerAbMedialoaderPreconnectNumExp.class, true, "player_medialoader_preconnect_num", 31744, 3));
                TTVideoEngine.setIntValue(BaseNotice.HASHTAG, C10181b.m20511a().mo18168a(PlayerAbMedialoaderEnableTLSSessionReuseExp.class, true, "player_medialoader_enable_tls_session_reuse", 31744, 0));
                TTVideoEngine.setIntValue(100, C10181b.m20511a().mo18168a(PlayerAbMedialoaderTLSVersionExp.class, true, "player_medialoader_tls_version", 31744, 2));
                TTVideoEngine.setIntValue(95, C10181b.m20511a().mo18168a(EnableP2pStragetyControlExperiment.class, true, "enable_p2p_stragety_control", 31744, 0));
                TTVideoEngine.setIntValue(99, C10181b.m20511a().mo18168a(P2pStragetyExpiredTimeExperiment.class, true, "p2p_stragety_expired_time", 31744, 120));
                TTVideoEngine.setIntValue(96, C10181b.m20511a().mo18168a(P2pStragetyMinPlayNumberExperiment.class, true, "p2p_stragety_min_play_num", 31744, 5));
                TTVideoEngine.setIntValue(98, C10181b.m20511a().mo18168a(P2pStragetyMaxBufferingTimeExperiment.class, true, "p2p_stragety_max_buffering_time", 31744, 300));
                TTVideoEngine.setIntValue(97, C10181b.m20511a().mo18168a(P2pStragetyMaxLeaveWaitTimeExperiment.class, true, "p2p_stragety_max_leave_wait_time", 31744, 600));
                EnginePreloaderConfig enginePreloaderConfig = null;
                try {
                    enginePreloaderConfig = (EnginePreloaderConfig) C10181b.m20511a().mo18170a(EnginePreloaderConfigExperiment.class, true, "engine_preload_config", 31744, EnginePreloaderConfig.class);
                } catch (Throwable unused) {
                }
                if (enginePreloaderConfig == null) {
                    enginePreloaderConfig = new EnginePreloaderConfig();
                }
                TTVideoEngine.setIntValue(7, enginePreloaderConfig.enableExternDns);
                TTVideoEngine.setIntValue(8, enginePreloaderConfig.enableSocketReuse);
                TTVideoEngine.setIntValue(9, enginePreloaderConfig.enableSocketIdleTimeout);
                TTVideoEngine.setStringValue(0, f);
                TTVideoEngine.setDataLoaderListener(new DataLoaderListener() {
                    public final String apiStringForFetchVideoModel(Map<String, String> map, String str, Resolution resolution) {
                        return null;
                    }

                    public final String authStringForFetchVideoModel(String str, Resolution resolution) {
                        return null;
                    }

                    public final String getCheckSumInfo(String str) {
                        C50122a a = C50122a.m108112a();
                        if (!TextUtils.isEmpty(str)) {
                            return (String) a.f125603a.get(str);
                        }
                        return "";
                    }

                    public final boolean loadLibrary(String str) {
                        C52711k.m112240b(str, "pluginName");
                        IPluginService iPluginService = C48085g.f120850b;
                        if (iPluginService != null) {
                            return iPluginService.mo19935a("com.ss.android.ugc.aweme.videocache_v2", str);
                        }
                        return false;
                    }

                    public final void onNotifyCDNLog(DataLoaderCDNLog dataLoaderCDNLog) {
                        if (dataLoaderCDNLog != null) {
                            C48083f fVar = new C48083f(dataLoaderCDNLog);
                            if (!TextUtils.isEmpty(fVar.f120833a)) {
                                List list = (List) EnginePreloader.this.f120809f.get(fVar.f120833a);
                                if (list == null && !TextUtils.isEmpty(fVar.f120833a)) {
                                    list = new ArrayList();
                                    EnginePreloader.this.f120809f.put(fVar.f120833a, list);
                                }
                                if (list != null) {
                                    list.add(fVar);
                                }
                            }
                        }
                    }

                    public final void onTaskProgress(final DataLoaderTaskProgressInfo dataLoaderTaskProgressInfo) {
                        StringBuilder sb = new StringBuilder("onTaskProgress key:");
                        sb.append(dataLoaderTaskProgressInfo.mKey);
                        sb.append(", mediasize:");
                        sb.append(dataLoaderTaskProgressInfo.mMediaSize);
                        sb.append(", cacheSize:");
                        sb.append(dataLoaderTaskProgressInfo.mCacheSizeFromZero);
                        C38824a.m86238a("EnginePreloader", sb.toString());
                        C18842a.m45934b(new Runnable() {
                            public final void run() {
                                if (EnginePreloader.this.f120805b != null) {
                                    C48072b bVar = (C48072b) EnginePreloader.this.f120805b.get();
                                    if (bVar != null) {
                                        bVar.mo62821a(dataLoaderTaskProgressInfo.mKey, dataLoaderTaskProgressInfo.mMediaSize, dataLoaderTaskProgressInfo.mCacheSizeFromZero);
                                    }
                                }
                            }
                        });
                    }

                    public final void onNotifyCDNLog(JSONObject jSONObject) {
                        if (jSONObject != null) {
                            C48083f fVar = new C48083f((CDNLog) C47760cd.m103384a(jSONObject.toString(), CDNLog.class));
                            if (!TextUtils.isEmpty(fVar.f120833a)) {
                                List list = (List) EnginePreloader.this.f120809f.get(fVar.f120833a);
                                if (list == null && !TextUtils.isEmpty(fVar.f120833a)) {
                                    list = new ArrayList();
                                    EnginePreloader.this.f120809f.put(fVar.f120833a, list);
                                }
                                if (list != null) {
                                    list.add(fVar);
                                }
                            }
                        }
                    }

                    public final void dataLoaderError(String str, int i, Error error) {
                        String str2;
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("video_cache_error_code", error.code);
                            String str3 = "video_cache_msg";
                            if (error.description.length() > 1500) {
                                str2 = error.description.substring(0, 1500);
                            } else {
                                str2 = error.description;
                            }
                            jSONObject.put(str3, str2);
                            C50107b.m108066a(str, error.code, jSONObject.toString());
                            C23131p.m57779a("video_cache_error_report", jSONObject);
                            C26890h.m65012a("VIDEO_CACHE_LOG_ERROR_EVENT_KEY", jSONObject);
                        } catch (Exception unused) {
                        }
                    }

                    public final void onLogInfo(int i, String str, JSONObject jSONObject) {
                        String str2;
                        String str3 = "loginfo";
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        if (jSONObject != null) {
                            str2 = jSONObject.toString();
                        } else {
                            str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
                        }
                        sb.append(str2);
                        String sb2 = sb.toString();
                        String str4 = C50122a.m108112a().mo97900b().uri;
                        if (C50107b.f125506c != null) {
                            C50107b.f125506c.mo46913a(str3, sb2, str4);
                        }
                        StringBuilder sb3 = new StringBuilder("onLogInfo what:");
                        sb3.append(i);
                        sb3.append(", logType:");
                        sb3.append(str);
                        sb3.append(", log:");
                        sb3.append(jSONObject);
                        C38824a.m86238a("EnginePreloader", sb3.toString());
                        try {
                            AppLog.recordMiscLog(C11010c.m22280a(), str, jSONObject);
                        } catch (Exception unused) {
                        }
                    }

                    public final void onNotify(int i, long j, long j2, String str) {
                        StringBuilder sb = new StringBuilder("onNotify what:");
                        sb.append(i);
                        sb.append(", code:");
                        sb.append(j);
                        sb.append(", param:");
                        sb.append(j2);
                        sb.append(", info:");
                        sb.append(str);
                        C38824a.m86238a("EnginePreloader", sb.toString());
                        final int i2 = i;
                        final long j3 = j;
                        final long j4 = j2;
                        C480781 r1 = new Runnable() {
                            public final void run() {
                                int i;
                                if (i2 == 2) {
                                    EnginePreloader enginePreloader = EnginePreloader.this;
                                    long j = j3;
                                    long j2 = j4;
                                    if (j > 0) {
                                        if (j2 > 0 && C10181b.m20511a().mo18168a(VideoNetworkSpeedAlgorithmExperiment.class, true, "video_network_speed_algorithm", 31744, 0) == 2) {
                                            C48918e.m105713a().mo96747e();
                                        } else if (j2 > 0) {
                                            double d = (double) j;
                                            Double.isNaN(d);
                                            double d2 = 8.0d * d;
                                            double d3 = (double) j2;
                                            Double.isNaN(d3);
                                            C48918e.m105713a().mo96742a(d2 / (d3 / 1000.0d), d, j2);
                                            MLModel a = C23794bh.m58396j().mo76387a();
                                            if (a != null) {
                                                if (enginePreloader.f120807d == null) {
                                                    if (a == null || a.params == null || a.params.length <= 0) {
                                                        i = 500;
                                                    } else {
                                                        i = a.params[0];
                                                    }
                                                    enginePreloader.f120808e = i;
                                                    enginePreloader.f120807d = C2180b.m6534l();
                                                    enginePreloader.f120807d.mo6508a(C1663a.LATEST).mo6442a((long) enginePreloader.f120808e, TimeUnit.MILLISECONDS, C2168a.m6523d(), true).mo6449a((C2177l<? super T>) new C2191a<Integer>() {
                                                        public final void onComplete() {
                                                        }

                                                        public final void onError(Throwable th) {
                                                            C9220a.m18311a(th);
                                                        }

                                                        public final /* synthetic */ void onNext(Object obj) {
                                                            Integer num = (Integer) obj;
                                                            C48918e.m105713a().mo96745c();
                                                        }
                                                    });
                                                }
                                                enginePreloader.f120807d.onNext(Integer.valueOf((int) j));
                                            }
                                        }
                                    }
                                } else if (i2 == 20) {
                                    EnginePreloader enginePreloader2 = EnginePreloader.this;
                                    long j3 = j3;
                                    long j4 = j4;
                                    if (j3 > 0 && j4 > 0) {
                                        if (enginePreloader2.f120806c == null) {
                                            enginePreloader2.f120806c = new C48074d();
                                        }
                                        enginePreloader2.f120806c.f120800b = j3;
                                        enginePreloader2.f120806c.f120799a = j4;
                                    }
                                }
                            }
                        };
                        C18842a.m45934b(r1);
                    }
                });
                AVMDLURLFetcherBridge.setFetcherMaker(new FetcherMaker());
                AVMDLLog.turnOn(1, C10181b.m20511a().mo18168a(PlayerAbEnableDebugLogExp.class, true, "player_enable_debug_log", 31744, 0));
                HashMap hashMap = new HashMap();
                hashMap.put("deviceid", AppLog.getServerDeviceId());
                TTVideoEngine.setAppInfo(C11010c.m22280a(), hashMap);
                TTVideoEngine.startDataLoader(C11010c.m22280a());
                if (C38850c.m86285b()) {
                    TTVideoEngine.setDefaultABRAlgorithm(C10181b.m20511a().mo18168a(PlayerAbABRAlgoExp.class, true, "player_abr_algo", 31744, 0));
                    TTVideoEngine.startSpeedPredictor(C10181b.m20511a().mo18168a(PlayerAbABRSpeedPredictAlgoExp.class, true, "player_abr_speed_predict_algo", 31744, 0), C10181b.m20511a().mo18168a(PlayerAbABRSpeedPredictTimeIntervalExp.class, true, "player_abr_speed_predict_time_interval", 31744, 500));
                }
                this.f120810g = true;
            } catch (Exception e) {
                C9220a.m18312a((Throwable) e, "checkInit fail.");
            }
        }
        return this.f120810g;
    }

    /* renamed from: a */
    public final void mo95342a(C48072b bVar) {
        this.f120805b = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public final long mo95340a(String str) {
        DataLoaderCacheFileInfo cacheFileInfo = DataLoaderHelper.getDataLoader().cacheFileInfo(str);
        if (cacheFileInfo != null) {
            return cacheFileInfo.mCacheSizeFromZero;
        }
        return 0;
    }

    /* renamed from: b */
    public final long mo95347b(String str) {
        DataLoaderCacheFileInfo cacheFileInfo = DataLoaderHelper.getDataLoader().cacheFileInfo(str);
        if (cacheFileInfo != null) {
            return cacheFileInfo.mMediaSize;
        }
        return 0;
    }

    /* renamed from: c */
    public final boolean mo95351c(VideoUrlModel videoUrlModel) {
        return mo95345a(videoUrlModel, 0);
    }

    /* renamed from: b */
    public final void mo95349b(C48072b bVar) {
        if (this.f120805b != null && this.f120805b.get() == bVar) {
            this.f120805b = null;
        }
    }

    /* renamed from: d */
    public final void mo95353d(VideoUrlModel videoUrlModel) {
        String str;
        if (videoUrlModel != null) {
            if (TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
                str = videoUrlModel.getBitRatedRatioUri();
            } else {
                str = videoUrlModel.getDashVideoId();
            }
            DataLoaderHelper.getDataLoader().cancelTask(str);
        }
    }

    /* renamed from: g */
    public final List<C48083f> mo95357g(VideoUrlModel videoUrlModel) {
        String str;
        if (TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
            str = videoUrlModel.getBitRatedRatioUri();
        } else {
            str = videoUrlModel.getDashVideoId();
        }
        return (List) this.f120809f.get(str);
    }

    /* renamed from: a */
    public final boolean mo95344a(VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null) {
            return false;
        }
        String bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
        if (!TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
            VideoModel b = C48001c.m103850b(videoUrlModel.getDashVideoId());
            if (b == null || C48001c.m103847a(b) <= 0) {
                return false;
            }
            return true;
        } else if (DataLoaderHelper.getDataLoader().cacheFileInfo(bitRatedRatioUri) != null) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public final int mo95346b(VideoUrlModel videoUrlModel) {
        long j;
        if (videoUrlModel == null) {
            return 0;
        }
        String bitRatedRatioUri = videoUrlModel.getBitRatedRatioUri();
        if (!TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
            VideoModel b = C48001c.m103850b(videoUrlModel.getDashVideoId());
            if (b != null) {
                return (int) C48001c.m103847a(b);
            }
            return 0;
        }
        DataLoaderCacheFileInfo cacheFileInfo = DataLoaderHelper.getDataLoader().cacheFileInfo(bitRatedRatioUri);
        if (cacheFileInfo != null) {
            j = cacheFileInfo.mCacheSizeFromZero;
        } else {
            j = 0;
        }
        return (int) j;
    }

    /* renamed from: f */
    public final C48083f mo95356f(VideoUrlModel videoUrlModel) {
        String str;
        if (TextUtils.isEmpty(videoUrlModel.getDashVideoId())) {
            str = videoUrlModel.getBitRatedRatioUri();
        } else {
            str = videoUrlModel.getDashVideoId();
        }
        if (TextUtils.isEmpty(str) || !this.f120809f.containsKey(str)) {
            return null;
        }
        List list = (List) this.f120809f.get(str);
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (C48083f) list.get(list.size() - 1);
    }

    /* renamed from: a */
    public final boolean mo95345a(final VideoUrlModel videoUrlModel, int i) {
        final int i2;
        StringBuilder sb = new StringBuilder("preload id:");
        sb.append(videoUrlModel.getSourceId());
        sb.append(", size:");
        sb.append(i);
        sb.append(", key:");
        sb.append(videoUrlModel.getBitRatedRatioUri());
        if (!this.f120810g || videoUrlModel == null) {
            return false;
        }
        if ((i == -1 || i == 0) && this.f120811h > 0) {
            i2 = this.f120811h;
        } else {
            i2 = i;
        }
        if (!TextUtils.isEmpty(videoUrlModel.getDashVideoModelStr())) {
            try {
                VideoModel a = C48001c.m103848a(videoUrlModel.getDashVideoModelStr());
                if (a == null || a.getVideoRef() == null) {
                    return false;
                }
                videoUrlModel.setDashVideoId(a.getVideoRef().mVideoId);
                C48001c.m103849a(a.getVideoRef().mVideoId, a);
                TTVideoEngine.addTask(a, TTVideoEngine.findBestResolution(a, C48001c.f120647a, 1), (long) i);
                return false;
            } catch (Throwable unused) {
                return false;
            }
        } else if (!this.f120812i) {
            C50133a b = C50141a.m108193a().mo97943b(videoUrlModel.getBitRatedRatioUri()).mo97946b(videoUrlModel, C50109a.m108068s().mo95420a(), false);
            if (b.f125637a == null || b.f125637a.length <= 0) {
                return false;
            }
            new StringBuilder("preload uri:").append(b.f125639c);
            C50122a.m108112a().mo97899a(b.f125639c, b.f125641e);
            if (C10181b.m20511a().mo18168a(PlayerAbMedialoaderEnablePreconneExp.class, true, "player_medialoader_enable_preconnect", 31744, 0) == 1) {
                for (String preConnect : b.f125637a) {
                    TTVideoEngine.preConnect(preConnect);
                }
            }
            int a2 = C10181b.m20511a().mo18168a(PlayerAbPreloadSizeOffsetThresholdExp.class, true, "player_preload_size_offset_threshold", 31744, 0);
            long j = (long) i2;
            if (videoUrlModel.getSize() > j && videoUrlModel.getSize() - j <= ((long) a2)) {
                i2 = (int) videoUrlModel.getSize();
            }
            TTVideoEngine.addTask(b.f125639c, b.f125639c, b.f125637a, (long) i2);
            return true;
        } else {
            String uri = videoUrlModel.getUri();
            if (C10181b.m20511a().mo18168a(PlayerAbMedialoaderEnablePreconneExp.class, true, "player_medialoader_enable_preconnect", 31744, 0) == 1) {
                List<String> urlList = videoUrlModel.getUrlList();
                if (videoUrlModel.getBitRate() != null && videoUrlModel.getBitRate().size() > 0) {
                    urlList = ((BitRate) videoUrlModel.getBitRate().get(0)).urlList();
                }
                if (urlList != null) {
                    for (String preConnect2 : urlList) {
                        TTVideoEngine.preConnect(preConnect2);
                    }
                }
            }
            TTVideoEngine.addTask(uri, uri, (long) i2, (DataLoaderResourceProvider) new DataLoaderResourceProvider() {

                /* renamed from: a */
                C50133a f120823a;

                public final String getKey() {
                    if (this.f120823a == null) {
                        getUrls();
                    }
                    if (this.f120823a != null) {
                        return this.f120823a.f125639c;
                    }
                    return null;
                }

                public final String[] getUrls() {
                    if (this.f120823a == null) {
                        this.f120823a = C50141a.m108193a().mo97943b(videoUrlModel.getBitRatedRatioUri()).mo97946b(videoUrlModel, C50109a.m108068s().mo95420a(), false);
                    }
                    if (this.f120823a != null) {
                        return this.f120823a.f125637a;
                    }
                    return null;
                }

                public final long getPreloadSize() {
                    if (this.f120823a == null) {
                        getUrls();
                    }
                    int i = i2;
                    if (this.f120823a != null) {
                        int a = C10181b.m20511a().mo18168a(PlayerAbPreloadSizeOffsetThresholdExp.class, true, "player_preload_size_offset_threshold", 31744, 0);
                        if (this.f120823a.f125640d != null) {
                            if (this.f120823a.f125640d.getSize() > i2 && this.f120823a.f125640d.getSize() - i2 <= a) {
                                i = this.f120823a.f125640d.getSize();
                            }
                        } else if (videoUrlModel.getSize() > ((long) i2) && videoUrlModel.getSize() - ((long) i2) <= ((long) a)) {
                            i = (int) videoUrlModel.getSize();
                        }
                    }
                    return (long) i;
                }
            });
            return false;
        }
    }
}
