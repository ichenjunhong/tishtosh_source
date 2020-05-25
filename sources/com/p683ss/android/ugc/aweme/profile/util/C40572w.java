package com.p683ss.android.ugc.aweme.profile.util;

import android.app.Activity;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.util.w */
public final class C40572w {
    /* renamed from: a */
    public static void m90011a(Activity activity, User user, List<Aweme> list) {
        m90009a(activity, user, null, list);
    }

    /* renamed from: a */
    public static void m90009a(Activity activity, User user, String str, List<Aweme> list) {
        m90010a(activity, user, str, list, false);
    }

    /* renamed from: a */
    private static void m90010a(Activity activity, User user, String str, List<Aweme> list, boolean z) {
        C41979aq.m91946a().shareProfile(null, activity, user, list, false);
    }
}
