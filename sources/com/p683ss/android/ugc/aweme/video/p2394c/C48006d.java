package com.p683ss.android.ugc.aweme.video.p2394c;

import android.os.Build.VERSION;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.webkit.CookieManager;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.aweme.network.C11030f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.account.token.C18500a;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.player.C38850c;
import com.p683ss.android.ugc.aweme.player.p2051ab.C38843a;
import com.p683ss.android.ugc.aweme.player.p2051ab.C38845b;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbDash403FallbackExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbDashAudioRangeExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbDashAudioTimeRangeExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbDashHijackBackupDnsExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbDashHijackEnableExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbDashHijackMainDnsExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbDashRangeModeExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbDashVideoRangeExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbDashVideoTimeRangeExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbEnableSeekEndExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbEnableVolumeBalanceExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbSkipFindStreamInfoExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbUseCodecPoolExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayeAbVolumeBalanceDataExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayerAbDelayBufferingUpdateExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayerAbEnableDebugLogExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayerAbEnableHardwareDecodeSkipNonrefExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayerAbEngineUseTtnetExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.PlayerAbUseV2BlockReportExp;
import com.p683ss.android.ugc.aweme.player.p2051ab.abs.VolumeBalanceData;
import com.p683ss.android.ugc.aweme.player.sdk.C38854a;
import com.p683ss.android.ugc.aweme.player.sdk.impl.C38889b;
import com.p683ss.android.ugc.aweme.player.sdk.impl.C38907f;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e;
import com.p683ss.android.ugc.aweme.video.C48069o;
import com.p683ss.android.ugc.aweme.video.experiment.C48017a;
import com.p683ss.android.ugc.aweme.video.experiment.DisablePlayerLogv2AsyncExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.EnablePlayerLogExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayeAbReuseEngineExp;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerBufferDataTimeMsExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerMaxBufferTimeMsExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerOptionABRCacheExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerOptionCacheExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerUnifiedAbConfigExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.SUperResCpuCoreNumsExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.SuperRes265Experiment;
import com.p683ss.android.ugc.aweme.video.experiment.SuperResBitrateExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.SuperResCpuFrequencyExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.SuperResRatioLevelExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.TTPlayerUseSysAudioCodecExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.TTplayerIPCExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.VideoCacheEnableSetPlayinfoToP2pExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.VideoCacheLoaderTypeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.C48085g;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50114a;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50115b;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;
import com.p683ss.ttvideoengine.TTVideoEngine;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.video.c.d */
public final class C48006d {

    /* renamed from: a */
    private static C11030f f120650a;

    /* renamed from: a */
    public static C38859e m103862a(C50116c cVar, boolean z) {
        int i;
        C38845b bVar;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        C50116c cVar2 = cVar;
        C50113e eVar = new C50113e();
        eVar.f125531b = cVar2;
        eVar.f125530a = C11010c.m22280a();
        if (cVar2 == C50116c.Ijk || cVar2 == C50116c.IjkHardware) {
            eVar.f125533d = C48007e.f120651a;
        } else if (cVar2 == C50116c.TT || cVar2 == C50116c.TT_IJK_ENGINE || cVar2 == C50116c.TT_HARDWARE) {
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseArray sparseArray = new SparseArray();
            sparseIntArray.put(1, 0);
            int a = C10181b.m20511a().mo18168a(PlayeAbEnableVolumeBalanceExp.class, true, "player_enable_volume_balance", 31744, 0);
            sparseIntArray.put(28, a);
            if (a == 1) {
                try {
                    VolumeBalanceData volumeBalanceData = (VolumeBalanceData) C10181b.m20511a().mo18170a(PlayeAbVolumeBalanceDataExp.class, true, "player_volume_balance_data", 31744, VolumeBalanceData.class);
                    if (volumeBalanceData != null) {
                        sparseArray.put(29, Float.valueOf(volumeBalanceData.getPregain()));
                        sparseArray.put(30, Float.valueOf(volumeBalanceData.getThreshold()));
                        sparseArray.put(31, Float.valueOf(volumeBalanceData.getRatio()));
                        sparseArray.put(32, Float.valueOf(volumeBalanceData.getPredelay()));
                    }
                } catch (Throwable unused) {
                }
            }
            C38843a J = C48069o.m104088J();
            if (J != null) {
                sparseIntArray.put(17, J.f98913c);
                sparseIntArray.put(16, J.f98912b);
                if (J.f98913c == 1) {
                    eVar.mo97889c();
                }
                if (J.f98912b == 1) {
                    eVar.mo97888b();
                }
            } else if (cVar2 == C50116c.TT_HARDWARE) {
                eVar.mo97888b();
                eVar.mo97889c();
            }
            sparseIntArray.put(2, 1);
            int i2 = 1000;
            try {
                i2 = C10181b.m20511a().mo18168a(PlayerBufferDataTimeMsExperiment.class, true, "player_buffer_data_time", 31744, 1000);
            } catch (Exception unused2) {
            }
            sparseIntArray.put(41, C10181b.m20511a().mo18168a(PlayerAbDelayBufferingUpdateExp.class, true, "enable_player_delay_buffing_update", 31744, 0));
            sparseIntArray.put(3, i2);
            sparseIntArray.put(4, C10181b.m20511a().mo18168a(PlayerMaxBufferTimeMsExperiment.class, true, "player_max_buffer_time", 31744, 5000));
            sparseIntArray.put(5, C10181b.m20511a().mo18168a(EnablePlayerLogExperiment.class, true, "enable_player_log", 31744, 1));
            if (C48017a.m103960b() == 2) {
                i = 1;
            } else {
                i = 0;
            }
            sparseIntArray.put(15, i);
            if (C38850c.f98948a) {
                sparseIntArray.put(6, 1);
            }
            Boolean bool = (Boolean) SharePrefCache.inst().getEableUltraResolution().mo47782d();
            Boolean bool2 = (Boolean) SharePrefCache.inst().isInUltraResBlackList().mo47782d();
            if (bool != null && bool.booleanValue() && bool2 != null && !bool2.booleanValue()) {
                sparseIntArray.put(7, 1);
                sparseIntArray.put(8, ((Integer) SharePrefCache.inst().getUltraResolutionLevel().mo47782d()).intValue());
                sparseIntArray.put(9, ((Boolean) SharePrefCache.inst().getEnableAntiAliasing().mo47782d()).booleanValue() ? 1 : 0);
                sparseIntArray.put(12, C10181b.m20511a().mo18168a(SuperRes265Experiment.class, true, "super_res_265", 31744, 0));
                sparseIntArray.put(11, C10181b.m20511a().mo18168a(SuperResBitrateExperiment.class, true, "super_res_bitrate", 31744, 0));
                sparseIntArray.put(10, C10181b.m20511a().mo18168a(SuperResRatioLevelExperiment.class, true, "super_res_ratio_level", 31744, 0));
                sparseIntArray.put(13, C10181b.m20511a().mo18168a(SUperResCpuCoreNumsExperiment.class, true, "super_res_cpu_nums", 31744, 0));
                sparseIntArray.put(14, C10181b.m20511a().mo18168a(SuperResCpuFrequencyExperiment.class, true, "super_res_cpu_frequency", 31744, 0));
            }
            if (C10181b.m20511a().mo18168a(TTplayerIPCExperiment.class, true, "ttplayer_is_ipc", 31744, 0) == 1) {
                sparseIntArray.put(0, 1);
            }
            if (C10181b.m20511a().mo18168a(TTPlayerUseSysAudioCodecExperiment.class, true, "ttplayer_use_sys_audio_codec", 31744, 0) == 1) {
                sparseIntArray.put(18, 1);
            }
            try {
                bVar = (C38845b) C10181b.m20511a().mo18170a(PlayerUnifiedAbConfigExperiment.class, true, "player_unified_ab_config", 31744, C38845b.class);
            } catch (Throwable unused3) {
                bVar = null;
            }
            if (bVar != null) {
                sparseIntArray.put(23, bVar.f98937a);
                sparseIntArray.put(24, bVar.f98938b);
                sparseIntArray.put(26, bVar.f98939c);
                sparseIntArray.put(27, bVar.f98940d);
            }
            try {
                sparseIntArray.put(33, C10181b.m20511a().mo18168a(PlayerOptionCacheExperiment.class, true, "player_option_cache", 31744, 15));
                sparseIntArray.put(34, C10181b.m20511a().mo18168a(PlayeAbReuseEngineExp.class, true, "player_reuse_engine", 31744, 0));
                sparseIntArray.put(40, C10181b.m20511a().mo18168a(DisablePlayerLogv2AsyncExperiment.class, true, "disable_player_logv2_async", 31744, 0));
                C50114a aVar = new C50114a();
                aVar.f125549c = C10181b.m20511a().mo18168a(PlayeAbDashVideoRangeExp.class, true, "player_dash_video_range", 31744, 1048576);
                aVar.f125550d = C10181b.m20511a().mo18168a(PlayeAbDashAudioRangeExp.class, true, "player_dash_audio_range", 31744, 409600);
                aVar.f125551e = C10181b.m20511a().mo18168a(PlayeAbSkipFindStreamInfoExp.class, true, "player_skip_find_stream_info", 31744, 1);
                aVar.f125552f = C10181b.m20511a().mo18168a(PlayeAbDashHijackEnableExp.class, true, "player_dash_enable_hijack", 31744, 1);
                aVar.f125553g = C10181b.m20511a().mo18168a(PlayeAbDashHijackMainDnsExp.class, true, "player_dash_hijack_main_dns", 31744, 2);
                aVar.f125554h = C10181b.m20511a().mo18168a(PlayeAbDashHijackBackupDnsExp.class, true, "player_dash_hijack_backup_dns", 31744, 0);
                aVar.f125555i = C10181b.m20511a().mo18168a(PlayeAbDash403FallbackExp.class, true, "player_dash_403_fallback", 31744, 0);
                aVar.f125556j = C10181b.m20511a().mo18168a(PlayeAbDashRangeModeExp.class, true, "player_dash_range_mode", 31744, 2);
                aVar.f125557k = C10181b.m20511a().mo18168a(PlayeAbDashVideoTimeRangeExp.class, true, "player_dash_video_time_range", 31744, 5000);
                aVar.f125558l = C10181b.m20511a().mo18168a(PlayeAbDashAudioTimeRangeExp.class, true, "player_dash_audio_time_range", 31744, 10000);
                String cookie = CookieManager.getInstance().getCookie(C18845b.f52036a);
                Map<String, String> a2 = C18500a.m44767a(C18845b.f52036a);
                C50115b bVar2 = new C50115b();
                bVar2.f125559a = cookie;
                bVar2.f125560b = a2;
                eVar.f125540k = bVar2;
                if (C10181b.m20511a().mo18168a(PlayeAbUseCodecPoolExp.class, true, "player_use_codecpool", 31744, 0) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (VERSION.SDK_INT >= 24) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z2 || !z3) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                eVar.f125539j = z4;
                if (C10181b.m20511a().mo18168a(PlayerAbEngineUseTtnetExp.class, true, "player_engine_use_ttnet", 31744, 1) == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                eVar.f125544o = z5;
                eVar.f125537h = aVar;
                if (C10181b.m20511a().mo18168a(PlayerAbUseV2BlockReportExp.class, true, "player_use_v2_report_block", 31744, 1) == 1) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                eVar.f125541l = z6;
                eVar.f125542m = C10181b.m20511a().mo18168a(PlayeAbEnableSeekEndExp.class, true, "player_enable_seek_end", 31744, 1);
                eVar.f125543n = C10181b.m20511a().mo18168a(PlayerAbEnableHardwareDecodeSkipNonrefExp.class, true, "player_enable_hardware_decode_skip_nonref", 31744, 0);
                eVar.f125545p = C10181b.m20511a().mo18168a(PlayerOptionABRCacheExperiment.class, true, "player_option_abr_cache", 31744, 60);
                if (f120650a == null) {
                    f120650a = RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder("https://i.snssdk.com/").mo19926b(true).mo19925a();
                }
                eVar.f125546q = f120650a;
            } catch (Throwable th) {
                C9220a.m18311a(th);
            }
            eVar.mo97886a(sparseIntArray);
            eVar.f125536g = sparseArray;
            C38854a.f98960a = false;
            TTVideoEngine.setForceUsePluginPlayer(false);
            if (C48085g.m104142a()) {
                int a3 = C10181b.m20511a().mo18168a(VideoCacheLoaderTypeExperiment.class, true, "videocache_loader_type", 31744, 0);
                if (a3 > 0) {
                    sparseIntArray.put(39, a3);
                    sparseIntArray.put(38, C10181b.m20511a().mo18168a(VideoCacheEnableSetPlayinfoToP2pExperiment.class, true, "enable_set_playinfo_to_p2p", 31744, 0));
                    if (C23794bh.m58386a().getFreeFlowMemberService().mo48194a()) {
                        sparseIntArray.put(37, 1);
                    }
                }
            }
            TTVideoEngineLog.turnOn(1, C10181b.m20511a().mo18168a(PlayerAbEnableDebugLogExp.class, true, "player_enable_debug_log", 31744, 0));
        } else if (cVar2 == C50116c.LIVE) {
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            sparseIntArray2.append(38, 0);
            sparseIntArray2.append(87, 1);
            sparseIntArray2.append(15, 1);
            sparseIntArray2.append(36, 1);
            eVar.mo97886a(sparseIntArray2);
        }
        if (eVar.f125531b == C50116c.Ijk) {
            C38907f fVar = new C38907f(eVar.f125530a, eVar.f125532c, eVar.f125535f, eVar.f125536g, eVar);
            return fVar;
        } else if (eVar.f125531b == C50116c.IjkHardware) {
            C38907f fVar2 = new C38907f(eVar.f125530a, eVar.f125532c, eVar.f125535f, eVar.f125536g, eVar);
            return fVar2;
        } else if (eVar.f125531b == C50116c.TT || eVar.f125531b == C50116c.TT_IJK_ENGINE) {
            C38907f fVar3 = new C38907f(eVar.f125530a, eVar.f125532c, eVar.f125535f, eVar.f125536g, eVar);
            return fVar3;
        } else if (eVar.f125531b == C50116c.TT_HARDWARE) {
            C38907f fVar4 = new C38907f(eVar.f125530a, true, eVar.f125535f, eVar.f125536g, eVar);
            return fVar4;
        } else if (eVar.f125531b == C50116c.LIVE) {
            return new C38889b(eVar.f125530a, eVar.f125535f, eVar.f125534e);
        } else {
            return new C38907f(eVar.f125530a);
        }
    }
}
