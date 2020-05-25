package com.p683ss.android.ugc.aweme.notification.utils;

import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.notification.p2018g.C38206a;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.c */
public final class C38454c {
    /* renamed from: a */
    public static void m85775a(Context context) {
        SmartRouter.buildRoute(context, "aweme://check_profile").open();
    }

    /* renamed from: a */
    public static void m85776a(Context context, String str, String str2, String str3) {
        SmartRouter.buildRoute((Context) (Activity) context, "aweme://challenge/detail/").withParam("cid", str).withParam("enter_from", str2).withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0).withParam("process_id", str3).open();
    }

    /* renamed from: a */
    public static void m85777a(Context context, String str, String str2, String str3, int i) {
        if (C38206a.f97273b.isFollowFeedEnterFullScreenDetail()) {
            C41302w a = C41302w.m91042a();
            Activity activity = (Activity) context;
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(str);
            a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83868a("profile_enterprise_type", i).mo83870a("cid", str3).mo83870a("refer", str2).mo83870a("video_from", "from_launch_forward").mo83871a());
            return;
        }
        C41302w a2 = C41302w.m91042a();
        Activity activity2 = (Activity) context;
        StringBuilder sb2 = new StringBuilder("aweme://aweme/detail/");
        sb2.append(str);
        a2.mo83858a(activity2, C41311y.m91065a(sb2.toString()).mo83870a("refer", str2).mo83870a("cid", str3).mo83871a());
    }
}
