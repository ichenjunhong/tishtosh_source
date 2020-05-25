package com.p683ss.android.ugc.aweme.profile.api;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.keva.Keva;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.profile.C39877j;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;

/* renamed from: com.ss.android.ugc.aweme.profile.api.d */
public final class C39791d {

    /* renamed from: a */
    public static final String f101564a;

    /* renamed from: b */
    private static boolean f101565b = true;

    /* renamed from: a */
    public static Builder m88501a() {
        return Uri.parse(f101564a).buildUpon();
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(C18845b.f52040e);
        sb.append("/aweme/v1/user/");
        f101564a = sb.toString();
    }

    /* renamed from: b */
    public static boolean m88510b() {
        if (!C20854a.m53167g().isLogin()) {
            return false;
        }
        Keva repo = Keva.getRepo("keva_repo_profile_component");
        if (!C40733z.f103767a.needShowCompleteProfileGuideBar() || repo.getBoolean(C39877j.f101725a.mo80973d(), false) || repo.getInt(C39877j.f101725a.mo80971b(), 0) >= 3 || System.currentTimeMillis() - repo.getLong(C39877j.f101725a.mo80972c(), 0) <= 2592000000L) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m88506a(boolean z) {
        if (!C10181b.m20511a().mo18172a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", 31744, true)) {
            return "/aweme/v1/user/";
        }
        if (z) {
            return "/aweme/v1/user/profile/self/";
        }
        return "/aweme/v1/user/profile/other/";
    }

    /* renamed from: a */
    public static String m88503a(String str) {
        if (!m88510b() || !TextUtils.equals(str, C20854a.m53167g().getCurUserId())) {
            return m88501a().appendQueryParameter("user_id", str).toString();
        }
        return m88501a().appendQueryParameter("user_id", str).appendQueryParameter("need_pv", "true").toString();
    }

    /* renamed from: b */
    public static String m88508b(String str, String str2, int i) {
        return m88509b(str, str2, null, i);
    }

    /* renamed from: b */
    public static UserResponse m88507b(String str, boolean z, String str2) throws Exception {
        return (UserResponse) C40026s.f101964a.apiExecuteGetJSONObject(str, UserResponse.class, "", z, str2);
    }

    /* renamed from: a */
    public static User m88502a(String str, boolean z, String str2) throws Exception {
        String str3;
        C18922i iVar = new C18922i(str);
        String str4 = "is_cold_start";
        if (f101565b) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        iVar.mo38778a(str4, str3);
        f101565b = false;
        return (User) C40026s.f101964a.apiExecuteGetJSONObject(iVar.toString(), User.class, "user", z, str2);
    }

    /* renamed from: a */
    public static String m88504a(String str, String str2, int i) {
        if (TextUtils.isEmpty(str2)) {
            return m88503a(str);
        }
        Builder appendQueryParameter = m88501a().appendQueryParameter("user_id", str).appendQueryParameter("unique_id", str2).appendQueryParameter("from", String.valueOf(i));
        if (m88510b() && TextUtils.equals(str, C20854a.m53167g().getCurUserId())) {
            appendQueryParameter.appendQueryParameter("need_pv", "true");
        }
        return appendQueryParameter.toString();
    }

    /* renamed from: b */
    public static String m88509b(String str, String str2, String str3, int i) {
        Builder buildUpon = Uri.parse(C18845b.f52040e).buildUpon();
        String curUserId = C20854a.m53167g().getCurUserId();
        String curSecUserId = C20854a.m53167g().getCurSecUserId();
        String uniqueId = C20854a.m53167g().getCurUser().getUniqueId();
        int i2 = 1;
        if ((!TextUtils.isEmpty(str2) && TextUtils.equals(curUserId, str2)) || ((!TextUtils.isEmpty(str) && TextUtils.equals(curSecUserId, str)) || (!TextUtils.isEmpty(str3) && TextUtils.equals(uniqueId, str3)))) {
            buildUpon.path(m88506a(true));
            if (m88510b()) {
                buildUpon.appendQueryParameter("need_pv", "true");
            }
        } else if (!TextUtils.isEmpty(str)) {
            buildUpon.path(m88506a(false)).appendQueryParameter("sec_user_id", str);
        } else if (!TextUtils.isEmpty(str2)) {
            buildUpon.path(m88506a(false)).appendQueryParameter("user_id", str2);
        } else if (!TextUtils.isEmpty(str3)) {
            buildUpon.path(m88506a(false)).appendQueryParameter("unique_id", str3);
        } else if (C20854a.m53167g().isLogin()) {
            buildUpon.path(m88506a(true));
            if (m88510b()) {
                buildUpon.appendQueryParameter("need_pv", "true");
            }
        } else {
            buildUpon.path(m88506a(false));
        }
        if (!C20854a.m53167g().isUidContactPermisioned()) {
            i2 = 2;
        }
        buildUpon.appendQueryParameter("address_book_access", String.valueOf(i2));
        buildUpon.appendQueryParameter("from", String.valueOf(i));
        return buildUpon.toString();
    }

    /* renamed from: a */
    public static String m88505a(String str, String str2, String str3, int i) {
        return m88501a().appendQueryParameter("user_id", str).appendQueryParameter("sec_user_id", str2).appendQueryParameter("unique_id", str3).appendQueryParameter("from", String.valueOf(i)).toString();
    }
}
