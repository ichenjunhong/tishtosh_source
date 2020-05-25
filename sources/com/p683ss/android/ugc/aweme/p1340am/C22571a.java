package com.p683ss.android.ugc.aweme.p1340am;

import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.playerkit.p2493b.C50106a;
import com.p683ss.android.ugc.playerkit.session.C50122a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.am.a */
public final class C22571a implements C50106a {

    /* renamed from: a */
    public static boolean f60694a;

    /* renamed from: b */
    public static final boolean f60695b = false;

    /* renamed from: a */
    public final void mo46913a(String str, String str2, String str3) {
        if (f60694a) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt_video_uid", C20854a.m53167g().getCurUserId());
                jSONObject.put("dmt_video_log_tag", str);
                jSONObject.put("dmt_video_log_type", "Debug");
                jSONObject.put("dmt_video_log_msg", str2);
                String str4 = "dmt_video_log_vid";
                if (str3 == null) {
                    str3 = C50122a.m108112a().mo97900b().uri;
                }
                jSONObject.put(str4, str3);
                C23131p.m57779a("dmt_video_log", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }
}
