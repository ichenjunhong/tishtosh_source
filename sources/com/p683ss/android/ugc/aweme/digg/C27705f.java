package com.p683ss.android.ugc.aweme.digg;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.familiar.service.C29650b;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.CustomBgFollowUserBtn;
import com.p683ss.android.ugc.aweme.main.service.IUnReadVideoService.C36678a;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.unread.UnReadCircleView;
import com.p683ss.android.ugc.aweme.unread.UnReadVideoViewModel;
import com.p683ss.android.ugc.aweme.unread.UnReadVideoViewModel.C47491a;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.digg.f */
public final class C27705f extends C1352v {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f72721a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27705f.class), "mUnReadVideoAvatarListController", "getMUnReadVideoAvatarListController()Lcom/ss/android/ugc/aweme/main/service/IUnReadVideoService$IUnReadVideoAvatarListController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C27705f.class), "mUnreadVideoViewModel", "getMUnreadVideoViewModel()Lcom/ss/android/ugc/aweme/unread/UnReadVideoViewModel;"))};

    /* renamed from: k */
    public static final C27707a f72722k = new C27707a(null);

    /* renamed from: b */
    public AvatarImageView f72723b;

    /* renamed from: c */
    public TextView f72724c;

    /* renamed from: d */
    public TextView f72725d;

    /* renamed from: e */
    public CustomBgFollowUserBtn f72726e;

    /* renamed from: f */
    C31980a f72727f;

    /* renamed from: g */
    Context f72728g;

    /* renamed from: h */
    public String f72729h;

    /* renamed from: i */
    public String f72730i;

    /* renamed from: j */
    public final UnReadCircleView f72731j;

    /* renamed from: l */
    private final C52668f f72732l;

    /* renamed from: m */
    private final C52668f f72733m;

    /* renamed from: com.ss.android.ugc.aweme.digg.f$a */
    public static final class C27707a {
        private C27707a() {
        }

        public /* synthetic */ C27707a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.f$b */
    static final class C27708b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ User f72735a;

        /* renamed from: b */
        final /* synthetic */ C27705f f72736b;

        /* renamed from: c */
        final /* synthetic */ User f72737c;

        C27708b(User user, C27705f fVar, User user2) {
            this.f72735a = user;
            this.f72736b = fVar;
            this.f72737c = user2;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C27705f fVar = this.f72736b;
            User user = this.f72735a;
            C23089d a = C23089d.m56640a().mo47829a("enter_from", fVar.f72730i).mo47829a("to_user_id", user.getUid());
            if (C52711k.m112239a((Object) fVar.f72730i, (Object) "friend_follow_list")) {
                a.mo47829a("previous_page", fVar.f72729h);
                a.mo47829a("enter_method", "click_label");
            }
            C26890h.m65011a("enter_personal_detail", a.f61491a);
            SmartRouter.buildRoute(fVar.f72728g, "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", fVar.f72730i).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.f$c */
    static final class C27709c extends C52712l implements C52670a<C36678a> {

        /* renamed from: a */
        final /* synthetic */ C27705f f72738a;

        C27709c(C27705f fVar) {
            this.f72738a = fVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C29650b.f77509a.getUnReadVideoAvatarListController(this.f72738a.f72731j, this.f72738a.f72730i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.digg.f$d */
    static final class C27710d extends C52712l implements C52670a<UnReadVideoViewModel> {

        /* renamed from: a */
        final /* synthetic */ C27705f f72739a;

        /* renamed from: b */
        final /* synthetic */ C0184k f72740b;

        C27710d(C27705f fVar, C0184k kVar) {
            this.f72739a = fVar;
            this.f72740b = kVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C0184k kVar = this.f72740b;
            if (kVar != null) {
                return C47491a.m102889a(kVar, this.f72739a.f72730i);
            }
            return null;
        }
    }

    private C27705f(C0184k kVar, View view) {
        super(view);
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        this.f72728g = context;
        this.f72729h = "";
        this.f72730i = "";
        View findViewById = view.findViewById(R.id.f7l);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.view_unread)");
        this.f72731j = (UnReadCircleView) findViewById;
        this.f72732l = C52732g.m112285a(new C27709c(this));
        this.f72733m = C52732g.m112285a(new C27710d(this, kVar));
        View findViewById2 = view.findViewById(R.id.ay2);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.iv_avatar)");
        this.f72723b = (AvatarImageView) findViewById2;
        View findViewById3 = view.findViewById(R.id.dif);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.tv_username)");
        this.f72724c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.d9_);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.tv_description)");
        this.f72725d = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.ai1);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.follow_btn)");
        this.f72726e = (CustomBgFollowUserBtn) findViewById5;
        this.f72727f = new C31980a(this.f72726e, new C31988e(this) {

            /* renamed from: a */
            final /* synthetic */ C27705f f72734a;

            {
                this.f72734a = r1;
            }

            /* renamed from: a */
            public final void mo49741a(int i, User user) {
                String str;
                C52711k.m112240b(user, "user");
                super.mo49741a(i, user);
                if (i != 0) {
                    str = "follow";
                } else {
                    str = "follow_cancel";
                }
                new C23253w(str).mo48161b(this.f72734a.f72730i).mo48166f(user.getUid()).mo48164d(this.f72734a.f72729h).mo48076e();
            }
        });
        if (C25280a.m61493a().isBlackMode()) {
            this.f72726e.setIsBlackMode(true);
            TextView textView = this.f72724c;
            View view2 = this.itemView;
            C52711k.m112236a((Object) view2, "itemView");
            textView.setTextColor(C0726c.m2098c(view2.getContext(), R.color.avn));
            TextView textView2 = this.f72725d;
            View view3 = this.itemView;
            C52711k.m112236a((Object) view3, "itemView");
            textView2.setTextColor(C0726c.m2098c(view3.getContext(), R.color.avv));
        }
    }

    public /* synthetic */ C27705f(C0184k kVar, View view, C52707g gVar) {
        this(kVar, view);
    }
}
