package com.p683ss.android.common.p1146d;

import android.text.TextUtils;
import com.bytedance.p502b.p503a.p506b.p508b.C9220a;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c;
import com.p683ss.android.ugc.aweme.feed.p1729l.C30469d;
import com.p683ss.android.ugc.aweme.p1963ml.C37120o;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.d.b */
final class C18897b {
    /* renamed from: a */
    static void m46008a(String str, JSONObject jSONObject) {
        C18894a.m46007b(str, jSONObject);
        if (C37120o.m83349a().mo76392b()) {
            try {
                if (TextUtils.equals(str, "click_comment_button")) {
                    if (jSONObject.opt("group_id") != null) {
                        C30469d.f79621d.mo60886b(jSONObject.opt("group_id").toString());
                    }
                } else if (TextUtils.equals(str, "video_play_finish")) {
                    if (jSONObject.opt("group_id") != null) {
                        C30469d.f79621d.mo60888d(jSONObject.opt("group_id").toString());
                    }
                } else if (TextUtils.equals(str, "like")) {
                    if (jSONObject.opt("group_id") != null) {
                        C30469d.f79621d.mo60884a(jSONObject.opt("group_id").toString());
                    }
                } else if (TextUtils.equals(str, "enter_personal_detail") && jSONObject.opt("group_id") != null) {
                    C30469d.f79621d.mo60887c(jSONObject.opt("group_id").toString());
                }
            } catch (Throwable th) {
                C9220a.m18311a(th);
            }
        }
        C25593c.f67757i.mo52754a(str, jSONObject);
    }
}
