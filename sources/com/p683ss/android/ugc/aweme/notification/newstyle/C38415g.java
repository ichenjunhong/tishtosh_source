package com.p683ss.android.ugc.aweme.notification.newstyle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.commercialize.log.C26052as;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment;
import com.p683ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.p683ss.android.ugc.aweme.notification.utils.C38455d;
import com.p683ss.android.ugc.aweme.p2108r.p2110b.C41052b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.g */
public final class C38415g {

    /* renamed from: a */
    public static final C38415g f97773a = new C38415g();

    /* renamed from: b */
    private static final int f97774b = C23728o.m58241a(10.0d);

    /* renamed from: c */
    private static final boolean f97775c = MTNotificationTabMergeExperiment.m85061a();

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.g$a */
    static final class C38416a implements OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f97776a;

        C38416a(View view) {
            this.f97776a = view;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (i2 > C38415g.m85723a()) {
                this.f97776a.setTop(C38415g.m85723a());
            }
        }
    }

    private C38415g() {
    }

    /* renamed from: a */
    public static int m85723a() {
        return f97774b;
    }

    /* renamed from: b */
    public static boolean m85730b() {
        return f97775c;
    }

    /* renamed from: c */
    public static boolean m85731c() {
        return f97775c;
    }

    /* renamed from: d */
    public static boolean m85732d() {
        return f97775c;
    }

    /* renamed from: a */
    public static void m85728a(View view) {
        C52711k.m112240b(view, "view");
        view.addOnLayoutChangeListener(new C38416a(view));
    }

    /* renamed from: b */
    public static void m85729b(View view) {
        C52711k.m112240b(view, "view");
        C41052b.m90722a(view);
    }

    /* renamed from: a */
    public final void mo78318a(Context context) {
        C52711k.m112240b(context, "context");
        if (context instanceof Activity) {
            m85725a((Activity) context);
        }
    }

    /* renamed from: a */
    public static String m85724a(User user) {
        C52711k.m112240b(user, "user");
        if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle("Notification")) {
            String a = C38455d.m85778a(user);
            C52711k.m112236a((Object) a, "NoticeUserUtils.getHandle(user)");
            return a;
        } else if (!TextUtils.isEmpty(user.getRemarkName())) {
            String remarkName = user.getRemarkName();
            C52711k.m112236a((Object) remarkName, "user.remarkName");
            return remarkName;
        } else {
            String nickname = user.getNickname();
            C52711k.m112236a((Object) nickname, "user.nickname");
            return nickname;
        }
    }

    /* renamed from: a */
    public static void m85725a(Activity activity) {
        C52711k.m112240b(activity, "mActivity");
        Intent intent = activity.getIntent();
        if (intent != null && intent.getBooleanExtra("from_notification", false)) {
            String stringExtra = intent.getStringExtra("rule_id");
            if (!TextUtils.isEmpty(stringExtra)) {
                C52711k.m112236a((Object) stringExtra, "ruleId");
                C26052as.m63104a().logVideoPlayFromPush("video_play_from_push", stringExtra);
            }
        }
    }

    /* renamed from: a */
    public static void m85726a(Context context, FollowNotice followNotice) {
        C52711k.m112240b(context, "context");
        if ((context instanceof Activity) && followNotice != null) {
            Intent intent = ((Activity) context).getIntent();
            if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                String stringExtra = intent.getStringExtra("rule_id");
                if (!TextUtils.isEmpty(stringExtra)) {
                    User user = followNotice.getUser();
                    C52711k.m112236a((Object) user, "followNotice.user");
                    String uid = user.getUid();
                    C52711k.m112236a((Object) uid, "followNotice.user.uid");
                    C52711k.m112236a((Object) stringExtra, "ruleId");
                    C26052as.m63104a().logFollowUserEventPush("follow_from_push", "message", uid, "previous_page", "other_places", stringExtra);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m85727a(Context context, String str, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "accountType");
        if (context instanceof Activity) {
            Intent intent = ((Activity) context).getIntent();
            if (intent != null && intent.getBooleanExtra("from_notification", false)) {
                String stringExtra = intent.getStringExtra("rule_id");
                if (!TextUtils.isEmpty(stringExtra)) {
                    C26890h.m65011a("enter_personal_detail_backup_from_push", C23089d.m56640a().mo47829a("action_type", "click").mo47829a("account_type", str).mo47829a("client_order", String.valueOf(i)).mo47829a("rule_id", stringExtra).mo47831b().f61491a);
                }
            }
        }
    }
}
