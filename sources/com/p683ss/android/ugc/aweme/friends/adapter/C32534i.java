package com.p683ss.android.ugc.aweme.friends.adapter;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.router.SmartRouter;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.friends.invite.I18nFollowAndInviteUserBtn;
import com.p683ss.android.ugc.aweme.friends.model.Friend;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32505b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.i */
public final class C32534i<T extends User> extends C1352v {

    /* renamed from: a */
    final boolean f84709a;

    /* renamed from: b */
    Context f84710b;

    /* renamed from: c */
    T f84711c;

    /* renamed from: d */
    int f84712d;

    /* renamed from: e */
    C32505b f84713e;

    /* renamed from: f */
    AvatarImageWithVerify f84714f;

    /* renamed from: g */
    TextView f84715g;

    /* renamed from: h */
    TextView f84716h;

    /* renamed from: i */
    I18nFollowAndInviteUserBtn f84717i;

    /* renamed from: j */
    ViewGroup f84718j;

    /* renamed from: k */
    TextView f84719k;

    /* renamed from: a */
    static String m75285a(int i) {
        switch (i) {
            case 0:
                return "contact_friend";
            case 1:
                return "weibo";
            case 2:
                return "twitter";
            case 3:
                return "facebook";
            case 4:
                return "vk";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public final void mo65837a() {
        if (this.f84711c != null) {
            this.f84717i.mo65360a(this.f84711c.getFollowStatus(), this.f84711c.getFollowerStatus());
        }
    }

    /* renamed from: b */
    public final void mo65839b() {
        if (m75284a(this.f84711c) != null) {
            if (!m75284a(this.f84711c).isInvited()) {
                this.f84717i.mo65912a();
            } else {
                this.f84717i.mo65913b();
            }
        }
    }

    /* renamed from: a */
    static Friend m75284a(T t) {
        if (t instanceof Friend) {
            return (Friend) t;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo65838a(String str) {
        if (this.f84711c != null && !TextUtils.isEmpty(this.f84711c.getUid())) {
            C26890h.m65005a(this.f84710b, str, m75285a(this.f84712d), this.f84711c.getUid(), 0);
            C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_from", m75285a(this.f84712d)).mo47829a("enter_method", str).mo47829a("to_user_id", this.f84711c.getUid()).mo47829a("author_id", "").mo47829a("group_id", "").mo47829a("request_id", "").f61491a);
            SmartRouter.buildRoute(this.f84710b, "aweme://user/profile/").withParam("uid", this.f84711c.getUid()).withParam("sec_user_id", this.f84711c.getSecUid()).withParam("from_discover", m75285a(this.f84712d)).open();
        }
    }

    public C32534i(View view, C32505b bVar, boolean z) {
        super(view);
        this.f84709a = z;
        this.f84710b = view.getContext();
        this.f84714f = (AvatarImageWithVerify) view.findViewById(R.id.ay2);
        this.f84715g = (TextView) view.findViewById(R.id.dl2);
        this.f84716h = (TextView) view.findViewById(R.id.dkf);
        this.f84717i = (I18nFollowAndInviteUserBtn) view.findViewById(R.id.dkd);
        this.f84718j = (ViewGroup) view.findViewById(R.id.ajx);
        this.f84713e = bVar;
        this.f84717i.setOnClickListener(new C32535j(this));
        this.f84714f.setOnClickListener(new C32536k(this));
        this.f84715g.setOnClickListener(new C32537l(this));
        this.f84718j.setOnClickListener(new C32538m(this));
        ((C13833a) this.f84714f.getAvatarImageView().getHierarchy()).mo25902b((int) R.drawable.cy2);
        this.f84719k = (TextView) view.findViewById(R.id.ath);
    }
}
