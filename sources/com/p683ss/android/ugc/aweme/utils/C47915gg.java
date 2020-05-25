package com.p683ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import java.util.Collection;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.utils.gg */
public class C47915gg {

    /* renamed from: a */
    private static User f120506a;

    /* renamed from: b */
    private static boolean f120507b;

    /* renamed from: a */
    public static void m103644a() {
        f120506a = null;
    }

    /* renamed from: a */
    public static boolean m103645a(int i) {
        return (i == 0 || i == 4) ? false : true;
    }

    /* renamed from: q */
    public static boolean m103668q(User user) {
        return false;
    }

    /* renamed from: b */
    public static boolean m103651b() {
        return C20854a.m53167g().isChildrenMode();
    }

    /* renamed from: c */
    public static boolean m103654c() {
        User currentUser = BaseUserService.getBaseUserService_Monster().getCurrentUser();
        if (currentUser == null || !currentUser.isContentLanguageDialogShown()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static String m103653c(User user) {
        return m103643a(user, false);
    }

    /* renamed from: g */
    public static UrlModel m103658g(User user) {
        return C47914gf.m103639a(user);
    }

    /* renamed from: j */
    public static boolean m103661j(User user) {
        return C47914gf.m103640b(user);
    }

    /* renamed from: k */
    public static boolean m103662k(User user) {
        return C47914gf.m103641c(user);
    }

    /* renamed from: d */
    public static boolean m103655d(User user) {
        if (user.getFollowStatus() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static UrlModel m103657f(User user) {
        UrlModel g = m103658g(user);
        if (g != null) {
            return g;
        }
        return m103659h(user);
    }

    /* renamed from: i */
    public static String m103660i(User user) {
        if (user == null) {
            return "";
        }
        return user.getNickname();
    }

    /* renamed from: l */
    public static boolean m103663l(User user) {
        if (user == null) {
            return false;
        }
        return m103645a(user.getFollowStatus());
    }

    /* renamed from: n */
    public static String m103665n(User user) {
        if (user == null) {
            return "";
        }
        return user.getUid();
    }

    /* renamed from: o */
    public static String m103666o(User user) {
        if (user == null) {
            return "";
        }
        return user.getNickname();
    }

    /* renamed from: p */
    public static String m103667p(User user) {
        if (user == null) {
            return "";
        }
        return user.getSignature();
    }

    /* renamed from: r */
    public static boolean m103669r(User user) {
        if (user == null || (!user.isBlock && !user.isBlocked())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m103642a(User user) {
        String str;
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            str = user.getRemarkName();
        } else {
            str = m103650b(user);
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    /* renamed from: b */
    public static String m103649b(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return "";
        }
        return aweme.getAuthor().getNickname();
    }

    /* renamed from: h */
    public static UrlModel m103659h(User user) {
        if (user == null) {
            return null;
        }
        UrlModel avatarLarger = user.getAvatarLarger();
        if (avatarLarger == null) {
            avatarLarger = user.getAvatarMedium();
        }
        if (avatarLarger == null) {
            avatarLarger = user.getAvatarThumb();
        }
        return avatarLarger;
    }

    /* renamed from: u */
    public static boolean m103672u(User user) {
        if (user == null || !TextUtils.equals("unique_id", user.getNameField())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m103650b(User user) {
        if (user == null) {
            return "";
        }
        if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle("Comment")) {
            return m103656e(user);
        }
        return user.getNickname();
    }

    /* renamed from: e */
    public static String m103656e(User user) {
        if (user == null) {
            return "";
        }
        if (!TextUtils.isEmpty(user.getUniqueId())) {
            return user.getUniqueId();
        }
        if (user.getShortId() == null) {
            return "";
        }
        return user.getShortId();
    }

    /* renamed from: m */
    public static boolean m103664m(User user) {
        if (user == null) {
            return false;
        }
        if (user == f120506a) {
            return f120507b;
        }
        f120507b = TextUtils.equals(BaseUserService.getBaseUserService_Monster().getCurrentUserID(), user.getUid());
        f120506a = user;
        return f120507b;
    }

    /* renamed from: s */
    public static boolean m103670s(User user) {
        if (user == null || TextUtils.isEmpty(user.getRecommendReasonRelation())) {
            return false;
        }
        return Pattern.compile("<b>").matcher(user.getRecommendReasonRelation()).find();
    }

    /* renamed from: a */
    public static boolean m103646a(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        return m103645a(aweme.getAuthor().getFollowStatus());
    }

    /* renamed from: t */
    public static String m103671t(User user) {
        StringBuilder sb = new StringBuilder();
        sb.append(" user: ");
        if (user == null) {
            sb.append(" ");
        } else {
            sb.append("{ ");
            sb.append(" uid: ");
            sb.append(user.getUid());
            sb.append(',');
            sb.append(" following_count: ");
            sb.append(user.getFollowingCount());
            sb.append(',');
            sb.append(" follower_count: ");
            sb.append(user.getFollowerCount());
            sb.append(" }");
        }
        sb.append(" time: ");
        sb.append(System.currentTimeMillis());
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m103647a(String str) {
        return TextUtils.equals(C20854a.m53167g().getCurUserId(), str);
    }

    /* renamed from: a */
    public static String[] m103648a(UrlModel urlModel) {
        if (urlModel == null || C23715d.m58202a((Collection<T>) urlModel.getUrlList())) {
            return null;
        }
        return (String[]) urlModel.getUrlList().toArray(new String[urlModel.getUrlList().size()]);
    }

    /* renamed from: a */
    public static String m103643a(User user, boolean z) {
        String str;
        String str2;
        if (!TextUtils.isEmpty(user.getRemarkName())) {
            str = user.getRemarkName();
        } else {
            str = m103650b(user);
        }
        if (z) {
            str2 = "@";
        } else {
            str2 = "";
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m103652b(User user, boolean z) {
        if (user == null || z || user.getFollowStatus() == 1 || user.getFollowStatus() == 2 || !user.isSecret()) {
            return false;
        }
        return true;
    }
}
