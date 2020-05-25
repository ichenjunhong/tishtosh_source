package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.app.Activity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.a.k */
public final class C38128k extends C1352v implements OnClickListener {

    /* renamed from: a */
    User f97084a;

    /* renamed from: b */
    final AvatarImageWithVerify f97085b;

    /* renamed from: c */
    private final Activity f97086c;

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C52711k.m112240b(view, "v");
        User user = this.f97084a;
        if (user != null) {
            C41302w a = C41302w.m91042a();
            Activity activity = this.f97086c;
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(user.getUid());
            a.mo83858a(activity, C41311y.m91065a(sb.toString()).mo83870a("sec_user_id", user.getSecUid()).mo83871a());
        }
    }

    public C38128k(Activity activity, AvatarImageWithVerify avatarImageWithVerify) {
        C52711k.m112240b(activity, "mActivity");
        C52711k.m112240b(avatarImageWithVerify, "avatarImageView");
        super(avatarImageWithVerify);
        this.f97086c = activity;
        this.f97085b = avatarImageWithVerify;
        this.f97085b.setOnClickListener(this);
    }
}
