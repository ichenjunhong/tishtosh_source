package com.p683ss.android.ugc.aweme.recommend.p2112b;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0210y;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.support.p030v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.p1382aq.C23205al;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.b.a */
public abstract class C41088a extends C41106f<User> {

    /* renamed from: a */
    public final DataCenter f104431a;

    /* renamed from: b */
    private final ViewStub f104432b;

    /* renamed from: b */
    public abstract int mo83606b();

    /* renamed from: c */
    public void mo83608c() {
    }

    /* renamed from: d */
    public void mo83610d() {
    }

    /* renamed from: e */
    public void mo83611e() {
    }

    /* renamed from: f */
    private FragmentActivity mo83619f() {
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        Context context = view.getContext();
        if (context != null) {
            return (FragmentActivity) context;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* renamed from: g */
    private String m90760g() {
        DataCenter dataCenter = this.f104431a;
        if (dataCenter != null) {
            String str = (String) dataCenter.mo48229a("key_enter_from");
            if (str != null) {
                return str;
            }
        }
        return "find_friends";
    }

    /* renamed from: h */
    private String m90761h() {
        DataCenter dataCenter = this.f104431a;
        if (dataCenter != null) {
            String str = (String) dataCenter.mo48229a("key_previous_page");
            if (str != null) {
                return str;
            }
        }
        return "others_homepage";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Context mo83603a() {
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        return context;
    }

    /* renamed from: b */
    public final void mo83607b(User user) {
        String str;
        if (user != null) {
            if (user.getFollowStatus() == 0) {
                str = "follow";
            } else {
                str = "follow_cancel";
            }
            C23253w f = new C23253w(str).mo48164d(m90761h()).mo48161b(m90760g()).mo48163c("follow_button").mo48166f(user.getUid());
            f.f62126P = "card";
            f.mo48076e();
        }
    }

    public C41088a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.biy, viewGroup, false);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(\n   …user_view, parent, false)");
        super(inflate);
        C0210y a = C0214z.m440a(mo83619f());
        FragmentActivity f = mo83619f();
        if (f != null) {
            this.f104431a = DataCenter.m57235a(a, (C0184k) f);
            View findViewById = this.itemView.findViewById(R.id.zn);
            C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.content_container)");
            this.f104432b = (ViewStub) findViewById;
            this.f104432b.setLayoutResource(mo83606b());
            this.f104432b.inflate();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
    }

    /* renamed from: a */
    public final void mo83604a(User user) {
        if (user != null) {
            C23249s h = new C23249s().mo48144s(user.getUid()).mo48137c(m90760g()).mo48143h(m90761h());
            h.f62087O = "card";
            h.mo48076e();
        }
    }

    /* renamed from: c */
    public final void mo83609c(User user) {
        if (user != null) {
            UserProfileActivity.m89400a(mo83603a(), C47661ab.m103163a().mo94972a("uid", user.getUid()).mo94972a("sec_user_id", user.getSecUid()).mo94972a("enter_from", m90760g()).mo94972a("enter_from_request_id", user.getRequestId()).mo94969a("need_track_compare_recommend_reason", 1).mo94969a("from_recommend_card", 1).mo94972a("previous_recommend_reason", user.getRecommendReason()).mo94972a("recommend_from_type", "list").f120139a);
        }
    }

    /* renamed from: a */
    public void mo83605a(User user, String str, int i) {
        C52711k.m112240b(str, "eventType");
        if (user != null) {
            new C23205al(null, 1, null).mo47979a(user.getUid()).mo47980b(m90760g()).mo47981c(str).mo47977a(i).mo47982d(user.getRequestId()).mo47983e(user.getRecommendReason()).mo47984f("card").mo47985g("nonempty").mo48076e();
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m90758a(C41088a aVar, User user, boolean z, int i, Object obj) {
        if (user != null) {
            C32616c cVar = C32616c.f84865a;
            String uid = user.getUid();
            C52711k.m112236a((Object) uid, "uid");
            cVar.dislikeRecommendUser(uid, user.getSecUid());
            C10691a.m21548c(aVar.mo83603a(), (int) R.string.ti).mo19066a();
        }
    }
}
