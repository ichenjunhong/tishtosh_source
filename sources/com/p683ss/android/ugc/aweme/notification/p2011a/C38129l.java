package com.p683ss.android.ugc.aweme.notification.p2011a;

import android.app.Activity;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.a.l */
public final class C38129l extends C1322a<C38128k> {

    /* renamed from: c */
    public static final C38130a f97087c = new C38130a(null);

    /* renamed from: a */
    final List<User> f97088a = new ArrayList();

    /* renamed from: b */
    final int f97089b = 4;

    /* renamed from: d */
    private final int f97090d = ((int) C9432q.m18687b(C11010c.m22280a(), 27.0f));

    /* renamed from: e */
    private final Activity f97091e;

    /* renamed from: com.ss.android.ugc.aweme.notification.a.l$a */
    public static final class C38130a {
        private C38130a() {
        }

        public /* synthetic */ C38130a(C52707g gVar) {
            this();
        }
    }

    public final int getItemCount() {
        return this.f97088a.size();
    }

    public C38129l(Activity activity, int i) {
        C52711k.m112240b(activity, "mActivity");
        this.f97091e = activity;
    }

    public final /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C38128k kVar = (C38128k) vVar;
        C52711k.m112240b(kVar, "holder");
        User user = (User) this.f97088a.get(i);
        if (user != null) {
            kVar.f97084a = user;
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            kVar.f97085b.setUserData(userVerify);
        }
    }

    public final /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        AvatarImageWithVerify avatarImageWithVerify = new AvatarImageWithVerify(viewGroup.getContext());
        avatarImageWithVerify.setLayoutParams(new LayoutParams(this.f97090d, this.f97090d));
        return new C38128k(this.f97091e, avatarImageWithVerify);
    }
}
