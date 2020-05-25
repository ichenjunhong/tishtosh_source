package com.p683ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.lancet.C18988i;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.p1340am.C22571a;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.video.C48067n;
import com.p683ss.android.ugc.aweme.video.C48116r;
import com.p683ss.android.ugc.aweme.video.C48117s;
import com.p683ss.android.ugc.aweme.video.C48118t;
import com.p683ss.android.ugc.aweme.video.C48119u;
import com.p683ss.android.ugc.aweme.video.C48120v;
import com.p683ss.android.ugc.aweme.video.experiment.BitrateModelThresholdExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.C48017a;
import com.p683ss.android.ugc.aweme.video.experiment.Enable265Experiment;
import com.p683ss.android.ugc.aweme.video.experiment.EnableH265BlackListExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.ForceTokeepSurfaceBelowKITKATExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.MultiPlayerExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerEventLogV2Experiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerFramesWaitExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.PlayerUseVideoTextureRendererExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.TTPlayerAsyncInitExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.TTPlayerRenderTypeExperiment;
import com.p683ss.android.ugc.aweme.video.local.C48063g;
import com.p683ss.android.ugc.aweme.video.p2392a.C47977a;
import com.p683ss.android.ugc.aweme.video.p2392a.C47978b;
import com.p683ss.android.ugc.aweme.video.p2394c.C48005c;
import com.p683ss.android.ugc.aweme.video.preload.C48107j;
import com.p683ss.android.ugc.playerkit.p2493b.C50107b;
import com.p683ss.android.ugc.playerkit.p2494c.C50109a;
import com.p683ss.android.ugc.playerkit.p2494c.C50111c;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;
import com.p683ss.android.ugc.playerkit.p2494c.C50119h;
import com.p683ss.android.ugc.playerkit.videoview.C50140c;
import com.p683ss.android.ugc.playerkit.videoview.p2497c.C50141a;
import com.p683ss.ttvideoengine.utils.TTVideoEngineLog;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.PlayerKitInitTask */
public class PlayerKitInitTask implements LegoTask {
    public C35896f process() {
        return C35894d.m81063a(this);
    }

    public C35898h type() {
        return C35898h.MAIN;
    }

    public void run(Context context) {
        C22574a.m55738f().mo46917a("method_init_player_kit_duration", false);
        C50109a.m108068s().f125511a = new C50119h() {
            /* renamed from: m */
            public final C50111c mo95432m() {
                return C47983ad.Normal;
            }

            /* renamed from: a */
            public final C50116c mo95420a() {
                return C48069o.m104089K();
            }

            /* renamed from: f */
            public final boolean mo95425f() {
                return C48063g.m104079b();
            }

            /* renamed from: h */
            public final int mo95427h() {
                return C48017a.m103960b();
            }

            /* renamed from: i */
            public final boolean mo95428i() {
                return C48005c.m103859c();
            }

            /* renamed from: l */
            public final Context mo95431l() {
                return C11010c.m22280a();
            }

            /* renamed from: j */
            public final boolean mo95429j() {
                if (C18988i.f52293a || C48114q.f120923a) {
                    return true;
                }
                return false;
            }

            /* renamed from: k */
            public final boolean mo95430k() {
                return VideoBitRateABManager.m103801c().mo95132d();
            }

            /* renamed from: b */
            public final int mo95421b() {
                return C10181b.m20511a().mo18168a(TTPlayerRenderTypeExperiment.class, true, "ttplayer_render_type", 31744, 0);
            }

            /* renamed from: c */
            public final boolean mo95422c() {
                return C10181b.m20511a().mo18172a(MultiPlayerExperiment.class, true, "enable_multi_player", 31744, false);
            }

            /* renamed from: d */
            public final boolean mo95423d() {
                return C10181b.m20511a().mo18172a(Enable265Experiment.class, true, "enable_h265", 31744, true);
            }

            /* renamed from: e */
            public final boolean mo95424e() {
                return C10181b.m20511a().mo18172a(EnableH265BlackListExperiment.class, true, "enable_h265_black_list", 31744, false);
            }

            /* renamed from: g */
            public final double mo95426g() {
                return C10181b.m20511a().mo18166a(BitrateModelThresholdExperiment.class, true, "video_auto_model_threshold", 31744, -1.0d);
            }

            /* renamed from: n */
            public final boolean mo95433n() {
                return C10181b.m20511a().mo18172a(ForceTokeepSurfaceBelowKITKATExperiment.class, true, "should_force_to_keep_surface_below_kitkat", 31744, false);
            }

            /* renamed from: o */
            public final boolean mo95434o() {
                return C10181b.m20511a().mo18172a(TTPlayerAsyncInitExperiment.class, true, "is_ttplayer_async_init", 31744, true);
            }

            /* renamed from: p */
            public final int mo95435p() {
                return C10181b.m20511a().mo18168a(PlayerFramesWaitExperiment.class, true, "player_framews_wait", 31744, 1);
            }

            /* renamed from: q */
            public final boolean mo95436q() {
                return C10181b.m20511a().mo18172a(PlayerUseVideoTextureRendererExperiment.class, true, "player_use_video_texture_renderer", 31744, false);
            }

            /* renamed from: r */
            public final boolean mo95437r() {
                return C10181b.m20511a().mo18172a(PlayerEventLogV2Experiment.class, true, "player_event_log_v2_open", 31744, false);
            }
        };
        C50140c playUrlBuilder = C50140c.INSTANCE.setBitrateManager(C48116r.f120924a).setHttpsHelper(C48117s.f120925a).setPlayUrlBuilder(C48118t.f120926a);
        C48107j f = C48107j.m104193f();
        f.getClass();
        playUrlBuilder.setCacheChecker(new C48119u(f)).setPlayInfoCallback(new C48067n());
        C50107b.f125506c = new C22571a();
        TTVideoEngineLog.setListener(C48120v.f120928a);
        C50141a.m108193a().f125653b = new C47977a();
        C50141a.m108193a().f125652a = new C47978b();
        C22574a.m55738f().mo46921b("method_init_player_kit_duration", false);
    }
}
