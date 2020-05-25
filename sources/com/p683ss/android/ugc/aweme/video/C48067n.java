package com.p683ss.android.ugc.aweme.video;

import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.bytedance.p582g.p583a.p584a.C9951d;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38858d;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e;
import com.p683ss.android.ugc.aweme.video.p2394c.C48005c;
import com.p683ss.android.ugc.aweme.video.p2394c.C48006d;
import com.p683ss.android.ugc.playerkit.p2494c.C50113e.C50116c;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.n */
public final class C48067n implements C38858d {
    /* renamed from: a */
    public final C38859e mo78834a(C50116c cVar) {
        return C48006d.m103862a(cVar, false);
    }

    /* renamed from: a */
    private static JSONObject m104083a(long j, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        C23088c a = C23088c.m56631a().mo47824a("duration", sb.toString());
        a.mo47819a("is_cache", Boolean.valueOf(z));
        a.mo47819a("h265", Boolean.valueOf(z2));
        a.mo47823a("video_duration", Long.valueOf(C48121w.m104250N().mo95251i()));
        C48005c.m103855a(a);
        return a.mo47825b();
    }

    /* renamed from: b */
    public final void mo78836b(String str, long j, C50116c cVar, boolean z, boolean z2) {
        String str2;
        if (j > 0) {
            switch (cVar) {
                case EXO:
                    str2 = "aweme_movie_play_exo";
                    break;
                case TT:
                    str2 = "aweme_movie_play_tt";
                    break;
                case IjkHardware:
                    str2 = "aweme_movie_ijk_hardware";
                    break;
                case TT_IJK_ENGINE:
                    str2 = "aweme_movie_tt_ijk_engine";
                    break;
                case TT_HARDWARE:
                    str2 = "aweme_movie_tt_hardware";
                    break;
                default:
                    str2 = "aweme_movie_play";
                    break;
            }
            C26890h.onEvent(MobClick.obtain().setEventName(str2).setLabelName("perf_monitor").setExtValueLong(j));
            C23131p.m57779a(str, m104083a(j, z, z2));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", str);
                jSONObject.put("player_type", str2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", j);
                C9951d.m19999a("ttmp_play_info_ff", jSONObject, jSONObject2, null);
            } catch (Throwable th) {
                C9220a.m18311a(th);
            }
        }
    }

    /* renamed from: a */
    public final void mo78835a(String str, long j, C50116c cVar, boolean z, boolean z2) {
        String str2;
        if (j > 0) {
            switch (cVar) {
                case EXO:
                    str2 = "aweme_movie_play_exo";
                    break;
                case TT:
                    str2 = "aweme_movie_play_tt";
                    break;
                case IjkHardware:
                    str2 = "aweme_movie_ijk_hardware";
                    break;
                case TT_IJK_ENGINE:
                    str2 = "aweme_movie_tt_ijk_engine";
                    break;
                default:
                    str2 = "aweme_movie_play";
                    break;
            }
            C23131p.m57779a(str, m104083a(j, z, z2));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", str);
                jSONObject.put("player_type", str2);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("duration", j);
                C9951d.m19999a("ttmp_play_info_prepare", jSONObject, jSONObject2, null);
            } catch (Throwable th) {
                C9220a.m18311a(th);
            }
        }
    }
}
