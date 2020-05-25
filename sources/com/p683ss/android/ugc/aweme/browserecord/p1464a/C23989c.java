package com.p683ss.android.ugc.aweme.browserecord.p1464a;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.browserecord.model.C24042a;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.familiar.service.C29650b;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.FollowUserBtn;
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

/* renamed from: com.ss.android.ugc.aweme.browserecord.a.c */
public final class C23989c extends C1352v {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f63680a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23989c.class), "mUnReadVideoAvatarListController", "getMUnReadVideoAvatarListController()Lcom/ss/android/ugc/aweme/main/service/IUnReadVideoService$IUnReadVideoAvatarListController;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C23989c.class), "mUnreadVideoViewModel", "getMUnreadVideoViewModel()Lcom/ss/android/ugc/aweme/unread/UnReadVideoViewModel;"))};

    /* renamed from: m */
    public static final C23991a f63681m = new C23991a(null);

    /* renamed from: b */
    final int f63682b = C23728o.m58241a(82.0d);

    /* renamed from: c */
    final AvatarImageView f63683c = ((AvatarImageView) this.f63691k.findViewById(R.id.ay2));

    /* renamed from: d */
    final TextView f63684d = ((TextView) this.f63691k.findViewById(R.id.dif));

    /* renamed from: e */
    final TextView f63685e = ((TextView) this.f63691k.findViewById(R.id.d9_));

    /* renamed from: f */
    final FollowUserBtn f63686f = ((FollowUserBtn) this.f63691k.findViewById(R.id.ai1));

    /* renamed from: g */
    public final UnReadCircleView f63687g;

    /* renamed from: h */
    C31980a f63688h;

    /* renamed from: i */
    public String f63689i;

    /* renamed from: j */
    public final C0184k f63690j;

    /* renamed from: k */
    final View f63691k;

    /* renamed from: l */
    public final String f63692l;

    /* renamed from: n */
    private final int f63693n = C23728o.m58241a(94.0d);

    /* renamed from: o */
    private final C52668f f63694o;

    /* renamed from: p */
    private final C52668f f63695p;

    /* renamed from: com.ss.android.ugc.aweme.browserecord.a.c$a */
    public static final class C23991a {
        private C23991a() {
        }

        public /* synthetic */ C23991a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.a.c$b */
    static final class C23992b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ User f63697a;

        /* renamed from: b */
        final /* synthetic */ C23989c f63698b;

        /* renamed from: c */
        final /* synthetic */ C24042a f63699c;

        C23992b(User user, C23989c cVar, C24042a aVar) {
            this.f63697a = user;
            this.f63698b = cVar;
            this.f63699c = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C23989c cVar = this.f63698b;
            User user = this.f63697a;
            C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_from", cVar.f63689i).mo47829a("to_user_id", user.getUid()).f61491a);
            SmartRouter.buildRoute(cVar.f63691k.getContext(), "aweme://user/profile/").withParam("uid", user.getUid()).withParam("sec_user_id", user.getSecUid()).withParam("enter_from", cVar.f63689i).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.a.c$c */
    static final class C23993c extends C52712l implements C52670a<C36678a> {

        /* renamed from: a */
        final /* synthetic */ C23989c f63700a;

        C23993c(C23989c cVar) {
            this.f63700a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C29650b.f77509a.getUnReadVideoAvatarListController(this.f63700a.f63687g, "video_play_list");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.browserecord.a.c$d */
    static final class C23994d extends C52712l implements C52670a<UnReadVideoViewModel> {

        /* renamed from: a */
        final /* synthetic */ C23989c f63701a;

        C23994d(C23989c cVar) {
            this.f63701a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C47491a.m102889a(this.f63701a.f63690j, "video_play_list");
        }
    }

    public C23989c(C0184k kVar, View view, String str) {
        C52711k.m112240b(kVar, "owner");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(str, "mPreviousPage");
        super(view);
        this.f63690j = kVar;
        this.f63691k = view;
        this.f63692l = str;
        View findViewById = this.f63691k.findViewById(R.id.f7l);
        C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.view_unread)");
        this.f63687g = (UnReadCircleView) findViewById;
        this.f63694o = C52732g.m112285a(new C23993c(this));
        this.f63695p = C52732g.m112285a(new C23994d(this));
        this.f63689i = "personal_homepage";
        this.f63688h = new C31980a(this.f63686f, new C31988e(this) {

            /* renamed from: a */
            final /* synthetic */ C23989c f63696a;

            {
                this.f63696a = r1;
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
                new C23253w(str).mo48161b(this.f63696a.f63689i).mo48166f(user.getUid()).mo48164d(this.f63696a.f63692l).mo48076e();
            }
        });
    }
}
