package com.p683ss.android.ugc.aweme.video.p2394c;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.video.C48069o;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.video.experiment.EnableIesRouteExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.UseTTNetExperiment;
import com.p683ss.android.ugc.aweme.video.experiment.UseVideoCacheHttpDnsExperiment;
import com.toutiao.proxyserver.C51895s;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.video.c.c */
public final class C48005c {
    /* renamed from: a */
    public static boolean m103857a() {
        return true;
    }

    /* renamed from: b */
    public static boolean m103858b() {
        return false;
    }

    /* renamed from: d */
    private static boolean m103860d() {
        return C48003a.m103851a();
    }

    /* renamed from: c */
    public static boolean m103859c() {
        return C10181b.m20511a().mo18172a(EnableIesRouteExperiment.class, true, "enable_ies_route", 31744, true);
    }

    /* renamed from: e */
    private static boolean m103861e() {
        return C10181b.m20511a().mo18172a(UseVideoCacheHttpDnsExperiment.class, true, "use_video_cache_http_dns", 31744, false);
    }

    /* renamed from: a */
    public static C23088c m103855a(C23088c cVar) {
        if (cVar == null) {
            cVar = C23088c.m56631a();
        }
        cVar.mo47824a("playerType", C48121w.m104250N().mo95242a().toString());
        cVar.mo47824a("from", "PlayerCommonParamManager");
        cVar.mo47819a("is_break_resume_check_enabled", Boolean.valueOf(m103857a()));
        cVar.mo47819a("is_force_request_validation", Boolean.valueOf(m103858b()));
        cVar.mo47819a("is_play_link_select_enabled", Boolean.valueOf(m103859c()));
        cVar.mo47819a("is_preload_enabled", Boolean.valueOf(m103860d()));
        cVar.mo47819a("need_pre_load_in_settings", (Boolean) SharePrefCache.inst().getVideoPreload().mo47782d());
        cVar.mo47822a("weak_net_pre_load_switch_in_settings", (Integer) SharePrefCache.inst().getWeakNetPreLoadSwitch().mo47782d());
        cVar.mo47819a("use_video_cache_http_dns", Boolean.valueOf(m103861e()));
        cVar.mo47819a("video_cache_use_ttnet", Boolean.valueOf(C51895s.f129475j));
        cVar.mo47822a("multi_player", Integer.valueOf(C48069o.f120792a ? 1 : 0));
        return cVar;
    }

    /* renamed from: a */
    public static JSONObject m103856a(JSONObject jSONObject) throws JSONException {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("playerType", C48121w.m104250N().mo95242a().toString());
        jSONObject.put("from", "PlayerCommonParamManager");
        jSONObject.put("is_break_resume_check_enabled", m103857a());
        jSONObject.put("is_force_request_validation", m103858b());
        jSONObject.put("is_play_link_select_enabled", m103859c());
        jSONObject.put("is_preload_enabled", m103860d());
        jSONObject.put("need_pre_load_in_settings", SharePrefCache.inst().getVideoPreload().mo47782d());
        jSONObject.put("weak_net_pre_load_switch_in_settings", SharePrefCache.inst().getWeakNetPreLoadSwitch().mo47782d());
        String str = "video_cache_use_ttnet";
        boolean z = true;
        if (C10181b.m20511a().mo18168a(UseTTNetExperiment.class, true, "use_ttnet", 31744, 0) != 1) {
            z = false;
        }
        jSONObject.put(str, z);
        jSONObject.put("multi_player", C48069o.f120792a ? 1 : 0);
        return jSONObject;
    }
}
