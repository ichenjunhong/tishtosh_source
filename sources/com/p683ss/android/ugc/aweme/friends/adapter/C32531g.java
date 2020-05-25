package com.p683ss.android.ugc.aweme.friends.adapter;

import android.content.Context;
import android.widget.TextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.g */
public final class C32531g {

    /* renamed from: a */
    public static final C32531g f84700a = new C32531g();

    private C32531g() {
    }

    /* renamed from: a */
    public static void m75277a(AvatarImageWithVerify avatarImageWithVerify, Context context, User user, TextView textView) {
        C52711k.m112240b(avatarImageWithVerify, "avatar");
        C52711k.m112240b(user, "user");
        avatarImageWithVerify.mo48964b();
        C47916gh.m103675a(context, user.getCustomVerify(), user.getEnterpriseVerifyReason(), textView);
    }
}
