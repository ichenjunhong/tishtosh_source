package com.p683ss.android.ugc.aweme.flowfeed.p1756e;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.flowfeed.p1758g.C31780c;
import com.p683ss.android.ugc.aweme.live.C36006a;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.model.TextExtraStruct;
import com.p683ss.android.ugc.aweme.newfollow.p1995b.C37852b;
import com.p683ss.android.ugc.aweme.newfollow.p2000g.C37879b;
import com.p683ss.android.ugc.aweme.p1632di.C27614ba;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.e.c */
public final class C31768c implements C31780c {
    /* renamed from: a */
    public static C31780c m73795a() {
        if (C27991b.f73516l == null) {
            synchronized (C31780c.class) {
                if (C27991b.f73516l == null) {
                    C27991b.f73516l = C27614ba.m66299c();
                }
            }
        }
        return (C31780c) C27991b.f73516l;
    }

    /* renamed from: a */
    public final boolean mo64698a(User user, Activity activity, String str) {
        String str2;
        boolean z = false;
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            return false;
        }
        StringBuilder sb = new StringBuilder("aweme://user/profile/");
        sb.append(user.getUid());
        C41311y a = C41311y.m91065a(sb.toString());
        a.mo83870a("enter_from", str);
        a.mo83870a("sec_user_id", user.getSecUid());
        if (user != null && user.getFollowStatus() == 0 && "homepage_follow".equals(str)) {
            z = true;
        }
        if (z) {
            a.mo83870a("extra_previous_page_position", "content_card_button");
        } else {
            a.mo83870a("extra_previous_page_position", "main_head");
        }
        String str3 = "enter_from_request_id";
        if (TextUtils.isEmpty(user.getRequestId())) {
            str2 = "";
        } else {
            str2 = user.getRequestId();
        }
        a.mo83870a(str3, str2);
        C41302w.m91042a().mo83858a(activity, a.mo83871a());
        return true;
    }

    /* renamed from: a */
    public final void mo64693a(Context context, String str, String str2, String str3) {
        UserProfileActivity.m89408a(context, str, str2, str3);
    }

    /* renamed from: a */
    public final boolean mo64695a(View view, View view2, Aweme aweme, String str) {
        return C37852b.m84501a(view, view2, aweme, str);
    }

    /* renamed from: b */
    public final boolean mo64700b(View view, View view2, Aweme aweme, String str) {
        return C37852b.m84505b(view, view2, aweme, str);
    }

    /* renamed from: b */
    public final boolean mo64701b(Aweme aweme, User user, Activity activity, String str) {
        return C37852b.m84506b(aweme, user, activity, str);
    }

    /* renamed from: a */
    public final boolean mo64697a(Aweme aweme, User user, Activity activity, String str) {
        return C37852b.m84503a(aweme, user, activity, str);
    }

    /* renamed from: a */
    public final boolean mo64699a(User user, Activity activity, String str, String str2) {
        String str3;
        C36006a aVar = new C36006a(activity, user);
        aVar.mo74739b(str);
        aVar.mo74740c("live_cell");
        String str4 = "live_cell_position";
        if ("video_head".equals(str2)) {
            str3 = "card_head";
        } else {
            str3 = "card_content";
        }
        aVar.mo74738a(str4, str3);
        aVar.mo74741d(user.getRequestId());
        C36173w.m81665a().getLiveWatcherUtils().mo70097a(aVar);
        return true;
    }

    /* renamed from: a */
    public final boolean mo64696a(View view, TextExtraStruct textExtraStruct, View view2, Aweme aweme, String str) {
        return C37852b.m84502a(view, textExtraStruct, view2, aweme, str);
    }

    /* renamed from: a */
    public final void mo64694a(Aweme aweme, String str, String str2, Activity activity, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            C41302w a = C41302w.m91042a();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(str);
            a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83870a("enter_from", str3).mo83870a("sec_user_id", str2).mo83871a());
            C37879b.m84573a(aweme, str, "head", str3, str4);
            C37879b.m84584b(aweme, str3);
        }
    }
}
