package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.content.res.Resources;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.experiment.FollowToFollowBackExperiment;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32772s;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.p1807im.C33200k;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.AvatarImageWithVerifyMus;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40444k.C40446b;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39979m;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.profile.util.C40556o;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.do */
public final class C40338do extends C1352v implements OnClickListener, C39979m {

    /* renamed from: j */
    public static final C40339a f102973j = new C40339a(null);

    /* renamed from: a */
    public AvatarImageWithVerifyMus f102974a;

    /* renamed from: b */
    public TextView f102975b;

    /* renamed from: c */
    public User f102976c;

    /* renamed from: d */
    public int f102977d;

    /* renamed from: e */
    public C40340b f102978e;

    /* renamed from: f */
    public C40341c f102979f;

    /* renamed from: g */
    public C40446b f102980g;

    /* renamed from: h */
    public View f102981h;

    /* renamed from: i */
    public String f102982i;

    /* renamed from: k */
    private TextView f102983k;

    /* renamed from: l */
    private TextView f102984l;

    /* renamed from: m */
    private Context f102985m;

    /* renamed from: n */
    private C32772s f102986n;

    /* renamed from: o */
    private int f102987o;

    /* renamed from: p */
    private ImageView f102988p;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.do$a */
    public static final class C40339a {
        private C40339a() {
        }

        public /* synthetic */ C40339a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.do$b */
    public interface C40340b {
        /* renamed from: a */
        void mo82594a(User user, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.do$c */
    public interface C40341c {
        /* renamed from: a */
        void mo82373a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.do$d */
    static final /* synthetic */ class C40342d extends C52710j implements C52670a<C52860x> {
        C40342d(C40338do doVar) {
            super(0, doVar);
        }

        public final String getName() {
            return "follow";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C40338do.class);
        }

        public final String getSignature() {
            return "follow()V";
        }

        public final /* synthetic */ Object invoke() {
            ((C40338do) this.receiver).mo82590a();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.do$e */
    static final /* synthetic */ class C40343e extends C52710j implements C52670a<C52860x> {
        C40343e(C40338do doVar) {
            super(0, doVar);
        }

        public final String getName() {
            return "follow";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C40338do.class);
        }

        public final String getSignature() {
            return "follow()V";
        }

        public final /* synthetic */ Object invoke() {
            ((C40338do) this.receiver).mo82590a();
            return C52860x.f131107a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a7, code lost:
        if (r0 != null) goto L_0x0113;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82590a() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r1 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            boolean r0 = r0.isLogin()
            r1 = 0
            if (r0 != 0) goto L_0x002d
            android.app.Activity r0 = com.bytedance.ies.ugc.p694a.C11016e.m22312g()
            java.lang.String r2 = "homepage_follow"
            java.lang.String r3 = "click_follow_tab"
            com.ss.android.ugc.aweme.profile.ui.do$d r4 = new com.ss.android.ugc.aweme.profile.ui.do$d
            r5 = r7
            com.ss.android.ugc.aweme.profile.ui.do r5 = (com.p683ss.android.ugc.aweme.profile.p2090ui.C40338do) r5
            r4.<init>(r5)
            d.f.a.a r4 = (p2628d.p2639f.p2640a.C52670a) r4
            com.ss.android.ugc.aweme.profile.ui.dp r5 = new com.ss.android.ugc.aweme.profile.ui.dp
            r5.<init>(r4)
            com.ss.android.ugc.aweme.base.component.g r5 = (com.p683ss.android.ugc.aweme.base.component.C23505g) r5
            com.p683ss.android.ugc.aweme.login.C27965f.m66721a(r0, r2, r3, r1, r5)
            return
        L_0x002d:
            com.ss.android.ugc.aweme.profile.model.User r0 = r7.f102976c
            if (r0 != 0) goto L_0x0036
            java.lang.String r2 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x0036:
            int r0 = r0.getFollowStatus()
            if (r0 != 0) goto L_0x0045
            com.ss.android.ugc.aweme.profile.ui.do$c r0 = r7.f102979f
            if (r0 == 0) goto L_0x0045
            int r2 = r7.f102977d
            r0.mo82373a(r2)
        L_0x0045:
            android.content.Context r0 = r7.f102985m
            if (r0 == 0) goto L_0x005e
            android.content.Context r0 = r7.f102985m
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x005e
            android.content.Context r0 = r7.f102985m
            if (r0 == 0) goto L_0x0056
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x005f
        L_0x0056:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            r0.<init>(r1)
            throw r0
        L_0x005e:
            r0 = r1
        L_0x005f:
            com.ss.android.ugc.aweme.profile.model.User r2 = r7.f102976c
            if (r2 != 0) goto L_0x0068
            java.lang.String r3 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0068:
            int r2 = r2.getFollowStatus()
            r3 = 0
            r4 = 1
            r5 = 4
            if (r2 == r5) goto L_0x0098
            switch(r2) {
                case 0: goto L_0x0075;
                case 1: goto L_0x0098;
                case 2: goto L_0x0098;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x0098
        L_0x0075:
            com.ss.android.ugc.aweme.profile.model.User r2 = r7.f102976c
            if (r2 != 0) goto L_0x007e
            java.lang.String r3 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x007e:
            boolean r2 = r2.isSecret()
            if (r2 == 0) goto L_0x0086
            r3 = 4
            goto L_0x0098
        L_0x0086:
            com.ss.android.ugc.aweme.profile.model.User r2 = r7.f102976c
            if (r2 != 0) goto L_0x008f
            java.lang.String r3 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x008f:
            int r2 = r2.getFollowerStatus()
            if (r2 != r4) goto L_0x0097
            r3 = 2
            goto L_0x0098
        L_0x0097:
            r3 = 1
        L_0x0098:
            com.ss.android.ugc.aweme.profile.model.User r2 = r7.f102976c
            if (r2 != 0) goto L_0x00a1
            java.lang.String r6 = "mUser"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x00a1:
            int r2 = r2.getFollowStatus()
            if (r2 != r5) goto L_0x00aa
            if (r0 == 0) goto L_0x0116
            goto L_0x0113
        L_0x00aa:
            if (r3 != r5) goto L_0x0113
            if (r0 == 0) goto L_0x0116
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r5 = "SharePrefCache.inst()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            com.ss.android.ugc.aweme.app.bf r2 = r2.getPrivacyAccountFollowCount()
            java.lang.String r5 = "prefCacheItem"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r5)
            java.lang.Object r5 = r2.mo47782d()
            java.lang.Integer r5 = (java.lang.Integer) r5
            if (r5 != 0) goto L_0x00c9
            goto L_0x00ec
        L_0x00c9:
            int r6 = r5.intValue()
            if (r6 != 0) goto L_0x00ec
            com.bytedance.ies.dmt.ui.b.a$a r6 = new com.bytedance.ies.dmt.ui.b.a$a
            android.content.Context r0 = (android.content.Context) r0
            r6.<init>(r0)
            r0 = 2132547838(0x7f1c18fe, float:2.0748933E38)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r6.mo18899b(r0)
            r6 = 2132545162(0x7f1c0e8a, float:2.0743506E38)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.mo18886a(r6, r1)
            com.bytedance.ies.dmt.ui.b.a r0 = r0.mo18897a()
            r0.mo18882b()
            goto L_0x0107
        L_0x00ec:
            r1 = 3
            java.lang.String r6 = "followCount"
            p2628d.p2639f.p2641b.C52711k.m112236a(r5, r6)
            int r6 = r5.intValue()
            if (r4 <= r6) goto L_0x00f9
            goto L_0x0107
        L_0x00f9:
            if (r1 < r6) goto L_0x0107
            android.content.Context r0 = (android.content.Context) r0
            r1 = 2132547839(0x7f1c18ff, float:2.0748935E38)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21548c(r0, r1)
            r0.mo19066a()
        L_0x0107:
            int r0 = r5.intValue()
            int r0 = r0 + r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.mo47776a(r0)
        L_0x0113:
            r7.m89695a(r3)
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.C40338do.mo82590a():void");
    }

    /* renamed from: b */
    private final void m89696b(int i) {
        this.f102984l.setPadding(0, 0, 0, 0);
        this.f102984l.setGravity(17);
        this.f102984l.setCompoundDrawables(null, null, null, null);
    }

    /* renamed from: a */
    public final void mo82592a(User user) {
        C52711k.m112240b(user, "user");
        if (TextUtils.isEmpty(user.getRemarkName())) {
            TextView textView = this.f102983k;
            User user2 = this.f102976c;
            if (user2 == null) {
                C52711k.m112237a("mUser");
            }
            textView.setText(user2.getNickname());
            return;
        }
        TextView textView2 = this.f102983k;
        User user3 = this.f102976c;
        if (user3 == null) {
            C52711k.m112237a("mUser");
        }
        textView2.setText(user3.getRemarkName());
    }

    public final void onFollowFail(Exception exc) {
        if (!C40026s.f101964a.shouldDoCaptcha(exc)) {
            C22971a.m56494a(this.f102985m, exc, R.string.b47);
        }
        User user = this.f102976c;
        if (user == null) {
            C52711k.m112237a("mUser");
        }
        int followStatus = user.getFollowStatus();
        User user2 = this.f102976c;
        if (user2 == null) {
            C52711k.m112237a("mUser");
        }
        mo82591a(followStatus, user2.getFollowerStatus());
    }

    /* renamed from: a */
    private final void m89695a(int i) {
        int i2;
        String str;
        User user = this.f102976c;
        if (user == null) {
            C52711k.m112237a("mUser");
        }
        mo82591a(i, user.getFollowerStatus());
        User user2 = this.f102976c;
        if (user2 == null) {
            C52711k.m112237a("mUser");
        }
        if (user2.getFollowStatus() == 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        C32772s sVar = this.f102986n;
        if (sVar != null) {
            C39970a aVar = new C39970a();
            User user3 = this.f102976c;
            if (user3 == null) {
                C52711k.m112237a("mUser");
            }
            C39970a a = aVar.mo81871a(user3.getUid());
            User user4 = this.f102976c;
            if (user4 == null) {
                C52711k.m112237a("mUser");
            }
            C39970a a2 = a.mo81874b(user4.getSecUid()).mo81869a(i2);
            if (this.f102987o == 1) {
                str = "homepage_follow";
            } else {
                str = "others_homepage";
            }
            C39970a b = a2.mo81876c(str).mo81873b(12);
            User user5 = this.f102976c;
            if (user5 == null) {
                C52711k.m112237a("mUser");
            }
            sVar.mo66349a(b.mo81877d(user5.getFollowerStatus()).mo81872a());
        }
    }

    public final void onFollowSuccess(FollowStatus followStatus) {
        C52711k.m112240b(followStatus, "followStatus");
        CharSequence charSequence = followStatus.userId;
        User user = this.f102976c;
        if (user == null) {
            C52711k.m112237a("mUser");
        }
        if (TextUtils.equals(charSequence, user.getUid())) {
            User user2 = this.f102976c;
            if (user2 == null) {
                C52711k.m112237a("mUser");
            }
            user2.setFollowStatus(followStatus.followStatus);
            int i = followStatus.followStatus;
            User user3 = this.f102976c;
            if (user3 == null) {
                C52711k.m112237a("mUser");
            }
            C47718bf.m103288a(new C24530d(i, user3));
            mo82591a(followStatus.followStatus, followStatus.followerStatus);
            Context context = this.f102985m;
            User user4 = this.f102976c;
            if (user4 == null) {
                C52711k.m112237a("mUser");
            }
            C40556o.m89968a(context, user4, followStatus);
            if (followStatus.followStatus == 0) {
                User user5 = this.f102976c;
                if (user5 == null) {
                    C52711k.m112237a("mUser");
                }
                if (!TextUtils.isEmpty(user5.getRemarkName())) {
                    User user6 = this.f102976c;
                    if (user6 == null) {
                        C52711k.m112237a("mUser");
                    }
                    user6.setRemarkName("");
                    User user7 = this.f102976c;
                    if (user7 == null) {
                        C52711k.m112237a("mUser");
                    }
                    mo82592a(user7);
                }
            }
        }
    }

    public final void onClick(View view) {
        String str;
        ClickInstrumentation.onClick(view);
        C52711k.m112240b(view, "v");
        int id = view.getId();
        if (id == R.id.ue) {
            C40340b bVar = this.f102978e;
            if (bVar != null) {
                User user = this.f102976c;
                if (user == null) {
                    C52711k.m112237a("mUser");
                }
                bVar.mo82594a(user, this.f102977d);
            }
        } else {
            boolean z = true;
            if (id == R.id.hi) {
                C40446b bVar2 = this.f102980g;
                if (bVar2 != null) {
                    User user2 = this.f102976c;
                    if (user2 == null) {
                        C52711k.m112237a("mUser");
                    }
                    bVar2.mo82233d(user2, this.f102977d);
                }
                User user3 = this.f102976c;
                if (user3 == null) {
                    C52711k.m112237a("mUser");
                }
                if (!(user3 == null || this.f102985m == null)) {
                    SmartRoute buildRoute = SmartRouter.buildRoute(this.f102985m, "aweme://user/profile/");
                    String str2 = "uid";
                    User user4 = this.f102976c;
                    if (user4 == null) {
                        C52711k.m112237a("mUser");
                    }
                    SmartRoute withParam = buildRoute.withParam(str2, user4.getUid());
                    String str3 = "sec_user_id";
                    User user5 = this.f102976c;
                    if (user5 == null) {
                        C52711k.m112237a("mUser");
                    }
                    SmartRoute withParam2 = withParam.withParam(str3, user5.getSecUid());
                    String str4 = "enter_from";
                    if (this.f102987o == 1) {
                        str = "homepage_follow";
                    } else if (this.f102987o == 2) {
                        str = "homepage_friends";
                    } else {
                        str = "others_homepage";
                    }
                    SmartRoute withParam3 = withParam2.withParam(str4, str).withParam("enter_from_request_id", this.f102982i).withParam("extra_previous_page_position", "card_head").withParam("need_track_compare_recommend_reason", 1);
                    String str5 = "previous_recommend_reason";
                    User user6 = this.f102976c;
                    if (user6 == null) {
                        C52711k.m112237a("mUser");
                    }
                    withParam3.withParam(str5, user6.getRecommendReason()).withParam("recommend_from_type", "card").open();
                }
            } else if (id == R.id.ai0) {
                C40446b bVar3 = this.f102980g;
                if (bVar3 != null) {
                    User user7 = this.f102976c;
                    if (user7 == null) {
                        C52711k.m112237a("mUser");
                    }
                    bVar3.mo82232c(user7, this.f102977d);
                }
                IIMService d = C33200k.m76279d();
                Context context = this.f102985m;
                User user8 = this.f102976c;
                if (user8 == null) {
                    C52711k.m112237a("mUser");
                }
                if (user8.getFollowStatus() != 2) {
                    z = false;
                }
                d.wrapperSyncXAlert(context, 2, z, new C40345dq(new C40343e(this)));
            }
        }
    }

    public C40338do(View view, int i) {
        C52711k.m112240b(view, "itemView");
        super(view);
        Context context = view.getContext();
        C52711k.m112236a((Object) context, "itemView.context");
        this.f102985m = context;
        View findViewById = view.findViewById(R.id.hi);
        C52711k.m112236a((Object) findViewById, "itemView.findViewById(R.id.avatar)");
        this.f102974a = (AvatarImageWithVerifyMus) findViewById;
        View findViewById2 = view.findViewById(R.id.cfc);
        C52711k.m112236a((Object) findViewById2, "itemView.findViewById(R.id.root)");
        this.f102981h = findViewById2;
        View findViewById3 = view.findViewById(R.id.dn1);
        C52711k.m112236a((Object) findViewById3, "itemView.findViewById(R.id.user_name)");
        this.f102983k = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.c_5);
        C52711k.m112236a((Object) findViewById4, "itemView.findViewById(R.id.recommend_reason)");
        this.f102975b = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.ai0);
        C52711k.m112236a((Object) findViewById5, "itemView.findViewById(R.id.follow)");
        this.f102984l = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.ue);
        C52711k.m112236a((Object) findViewById6, "itemView.findViewById(R.id.close)");
        this.f102988p = (ImageView) findViewById6;
        OnClickListener onClickListener = this;
        this.f102988p.setOnClickListener(onClickListener);
        this.f102988p.setImageResource(R.drawable.cq3);
        LayoutParams layoutParams = this.f102988p.getLayoutParams();
        C52711k.m112236a((Object) layoutParams, "mClose.layoutParams");
        layoutParams.width = (int) C9432q.m18687b(this.f102985m, -2.0f);
        layoutParams.height = (int) C9432q.m18687b(this.f102985m, -2.0f);
        this.f102988p.setLayoutParams(layoutParams);
        this.f102974a.setOnClickListener(onClickListener);
        this.f102984l.setOnClickListener(onClickListener);
        if (this.f102986n == null) {
            this.f102986n = C32616c.f84865a.getFollowPresenter();
            C32772s sVar = this.f102986n;
            if (sVar != null) {
                sVar.mo66348a((C39979m) this);
            }
        }
        this.f102987o = i;
        this.f102981h.setBackgroundResource(R.color.a2s);
    }

    /* renamed from: a */
    public final void mo82591a(int i, int i2) {
        this.f102984l.setVisibility(0);
        Resources resources = this.f102985m.getResources();
        if (i == 0) {
            if (i2 != 1 || !FollowToFollowBackExperiment.m69596a()) {
                this.f102984l.setText(resources.getText(R.string.b3w));
            } else {
                this.f102984l.setText(resources.getText(R.string.gfm));
            }
            this.f102984l.setBackgroundResource(R.drawable.kq);
            this.f102984l.setTextColor(resources.getColor(R.color.jf));
        } else if (i == 1 || i == 2) {
            m89696b(-1);
            int i3 = R.string.b55;
            if (i == 2) {
                i3 = R.string.as8;
            }
            this.f102984l.setText(i3);
            this.f102984l.setTextColor(resources.getColor(R.color.py));
            this.f102984l.setBackgroundResource(R.drawable.dm_);
        } else {
            if (i == 4) {
                this.f102984l.setBackgroundResource(R.drawable.dm_);
                this.f102984l.setText(resources.getText(R.string.b4y));
                this.f102984l.setTextColor(resources.getColor(R.color.py));
            }
        }
    }
}
