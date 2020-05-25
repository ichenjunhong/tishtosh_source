package com.p683ss.android.ugc.aweme.profile.util;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.model.C26121f;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.profile.util.ai */
public final class C40535ai extends C47915gg {
    /* renamed from: a */
    public static void m89942a(JSONObject jSONObject) throws JSONException {
        String str;
        String str2;
        long j;
        String str3 = "";
        String str4 = "";
        String str5 = "";
        User curUser = C20854a.m53167g().getCurUser();
        boolean z = false;
        if (curUser == null || !C20854a.m53167g().isLogin()) {
            str2 = str4;
            str = str5;
            j = -1;
        } else {
            j = Long.parseLong(C20854a.m53167g().getCurUserId());
            if (TextUtils.isEmpty(curUser.getUniqueId())) {
                str2 = curUser.getShortId();
            } else {
                str2 = curUser.getUniqueId();
            }
            str = curUser.getBindPhone();
            UrlModel avatarMedium = curUser.getAvatarMedium();
            if (!(avatarMedium == null || avatarMedium.getUrlList() == null || avatarMedium.getUrlList().isEmpty())) {
                jSONObject.put("avatar_url", avatarMedium.getUrlList().get(0));
            }
            z = true;
        }
        jSONObject.put("is_login", z);
        jSONObject.put("success", z);
        jSONObject.put("user_id", String.valueOf(j));
        jSONObject.put("nickname", str3);
        jSONObject.put("unique_id", str2);
        jSONObject.put("bind_phone", str);
        jSONObject.put("code", 1);
        Long a = C26121f.m63397a(curUser);
        if (a != null) {
            jSONObject.put("decoration_id", a);
        }
    }
}
