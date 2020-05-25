package com.p683ss.android.ugc.aweme.shortvideo.p2242ui;

import com.bytedance.als.C2767k;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.filter.C31459g;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.property.C40789h.C40790a;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.p2206j.C43906h;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.p2243a.C44939a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45426bi;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45457u;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.tools.utils.C50203g;
import dmt.p2652av.video.p2655c.C52951e;
import p2628d.C52860x;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.cs */
final /* synthetic */ class C45124cs implements C2767k {

    /* renamed from: a */
    private final VideoRecordNewActivity f114244a;

    C45124cs(VideoRecordNewActivity videoRecordNewActivity) {
        this.f114244a = videoRecordNewActivity;
    }

    public final void onChanged(Object obj) {
        VideoRecordNewActivity videoRecordNewActivity = this.f114244a;
        C52860x xVar = (C52860x) obj;
        if (!videoRecordNewActivity.f113799y) {
            videoRecordNewActivity.f113799y = true;
            C31459g e = ((C43906h) videoRecordNewActivity.mo91195e().mo89445c()).mo89440e();
            String str = "";
            String str2 = "";
            Effect k = videoRecordNewActivity.mo91201k();
            if (k != null) {
                str = k.getEffectId();
                str2 = k.getName();
            }
            long longExtra = videoRecordNewActivity.getIntent().getLongExtra("extra_start_record_time", 0);
            long currentTimeMillis = System.currentTimeMillis() - longExtra;
            int intExtra = videoRecordNewActivity.getIntent().getIntExtra("sdk_load_ve_so_status", -1);
            C31459g gVar = e;
            long longExtra2 = videoRecordNewActivity.getIntent().getLongExtra("preload_ve_so_cost_time", -1);
            int intExtra2 = videoRecordNewActivity.getIntent().getIntExtra("preload_ve_so_task_status", -1);
            long longExtra3 = videoRecordNewActivity.getIntent().getLongExtra("extra_decompress_time", -10086);
            StringBuilder sb = new StringBuilder("So decompress: VideoRecordNewActivity, decompress time:");
            sb.append(longExtra3);
            C50203g.m108358a(sb.toString());
            boolean z = false;
            if (C52951e.f131360a) {
                C52951e.f131360a = false;
                z = true;
            }
            String str3 = str;
            String str4 = str2;
            long j = longExtra;
            long longExtra4 = videoRecordNewActivity.getIntent().getLongExtra("effect_download_duration", -1);
            long longExtra5 = videoRecordNewActivity.getIntent().getLongExtra("music_download_duration", -1);
            C26890h.m65011a("tool_performance_record_first_frame", C23089d.m56640a().mo47826a("sdk_load_ve_so_status", intExtra).mo47826a("preload_ve_so_task_status", intExtra2).mo47827a("preload_ve_so_cost_time", longExtra2).mo47827a("extra_decompress_time", longExtra3).mo47827a("first_frame_duration", currentTimeMillis).mo47829a("shoot_way", videoRecordNewActivity.f113778d.f107132y).mo47829a("enter_from", videoRecordNewActivity.f113778d.f107133z).mo47829a("creation_id", videoRecordNewActivity.f113778d.f107131x).mo47828a("cold_start", (Object) Boolean.valueOf(z)).mo47828a("is_sandbox", (Object) Boolean.valueOf(C44939a.m98279a(videoRecordNewActivity))).mo47827a("effect_download_duration", longExtra4).mo47827a("music_download_duration", longExtra5).mo47827a("video_download_duration", videoRecordNewActivity.getIntent().getLongExtra("video_download_duration", -1)).mo47829a("camera_type", C45457u.m99057a(videoRecordNewActivity.f113766E.mo91307M().getCurrentCameraType())).f61491a);
            C31459g gVar2 = gVar;
            C23089d a = C23089d.m56640a().mo47829a("creation_id", videoRecordNewActivity.f113778d.f107131x).mo47829a("shoot_way", videoRecordNewActivity.f113778d.f107132y).mo47826a("draft_id", videoRecordNewActivity.f113778d.f107022A).mo47829a("filter_list", gVar2.f82326c).mo47826a("filter_id_list", gVar2.f82324a).mo47829a("enter_from", videoRecordNewActivity.f113778d.f107133z).mo47829a("prop_id", videoRecordNewActivity.mo91196f().mo97825y().mo97775c()).mo47829a("mv_id", str3).mo47829a("mv_name", str4).mo47828a("cold_start", (Object) Boolean.valueOf(z)).mo47827a("download_res_time", videoRecordNewActivity.getIntent().getLongExtra("extra_start_record_download_res_time", 0)).mo47829a("camera_type", C45457u.m99057a(videoRecordNewActivity.f113766E.mo91307M().getCurrentCameraType()));
            if (j > 0 && currentTimeMillis > 0) {
                a.mo47827a("duration", currentTimeMillis);
            }
            if (C39618d.f101152P.mo83103a(C40790a.VboostCompile)) {
                a.mo47828a("is_vboost", (Object) Boolean.valueOf(C43214dh.m94820i()));
            }
            C26890h.m65011a("enter_video_shoot_page", a.f61491a);
            C26890h.m65011a("tool_performance_4k_video_import", C23089d.m56640a().mo47828a("is_4k_enable", (Object) Boolean.valueOf(C45426bi.m98997a())).f61491a);
        }
    }
}
