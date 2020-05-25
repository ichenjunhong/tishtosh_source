package com.p683ss.android.ugc.aweme.recommend.p2112b;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31984a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.friends.p1792ui.FansFollowUserBtn;
import com.p683ss.android.ugc.aweme.friends.p1792ui.RelativeUserAvatarListView;
import com.p683ss.android.ugc.aweme.p1382aq.C23205al;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.util.C40574y;
import com.p683ss.android.ugc.aweme.profile.util.C40575z;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.b.b */
public final class C41089b extends C41088a {

    /* renamed from: c */
    public static final C41094a f104433c = new C41094a(null);

    /* renamed from: b */
    public User f104434b;

    /* renamed from: d */
    private final AvatarImageWithVerify f104435d = ((AvatarImageWithVerify) this.itemView.findViewById(R.id.ay2));

    /* renamed from: e */
    private final DmtTextView f104436e = ((DmtTextView) this.itemView.findViewById(R.id.dl2));

    /* renamed from: f */
    private final AutoRTLImageView f104437f = ((AutoRTLImageView) this.itemView.findViewById(R.id.b0_));

    /* renamed from: g */
    private final ImageView f104438g = ((ImageView) this.itemView.findViewById(R.id.eeq));

    /* renamed from: h */
    private final FansFollowUserBtn f104439h = ((FansFollowUserBtn) this.itemView.findViewById(R.id.nr));

    /* renamed from: i */
    private final DmtTextView f104440i = ((DmtTextView) this.itemView.findViewById(R.id.d98));

    /* renamed from: j */
    private final LinearLayout f104441j = ((LinearLayout) this.itemView.findViewById(R.id.cxc));

    /* renamed from: k */
    private final RelativeUserAvatarListView f104442k = ((RelativeUserAvatarListView) this.itemView.findViewById(R.id.cb3));

    /* renamed from: l */
    private int f104443l = (C9432q.m18670a(mo83603a()) - ((int) C9432q.m18687b(mo83603a(), 210.0f)));

    /* renamed from: m */
    private C40574y f104444m = new C40575z(this.f104441j, this.f104443l);

    /* renamed from: n */
    private C31980a f104445n = new C31980a(this.f104439h, new C31988e(this) {

        /* renamed from: a */
        final /* synthetic */ C41089b f104446a;

        {
            this.f104446a = r1;
        }

        /* renamed from: a */
        public final void mo49741a(int i, User user) {
            super.mo49741a(i, user);
            if (i != 0) {
                this.f104446a.mo83605a(this.f104446a.f104434b, "follow", this.f104446a.getAdapterPosition());
            }
            this.f104446a.mo83607b(this.f104446a.f104434b);
            DataCenter dataCenter = this.f104446a.f104431a;
            if (dataCenter != null) {
                dataCenter.mo48228a("action_click_follow", (Object) Integer.valueOf(i));
            }
        }
    });

    /* renamed from: com.ss.android.ugc.aweme.recommend.b.b$a */
    public static final class C41094a {
        private C41094a() {
        }

        public /* synthetic */ C41094a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.b.b$b */
    static final class C41095b implements C31984a {

        /* renamed from: a */
        final /* synthetic */ C41089b f104450a;

        /* renamed from: b */
        final /* synthetic */ User f104451b;

        C41095b(C41089b bVar, User user) {
            this.f104450a = bVar;
            this.f104451b = user;
        }

        /* renamed from: a */
        public final void mo56224a(FollowStatus followStatus) {
            C41089b bVar = this.f104450a;
            User user = this.f104451b;
            C52711k.m112236a((Object) followStatus, "followStatus");
            bVar.mo83612a(user, followStatus.followStatus);
        }
    }

    /* renamed from: b */
    public final int mo83606b() {
        return R.layout.biw;
    }

    /* renamed from: e */
    public final void mo83611e() {
        super.mo83611e();
        mo83605a(this.f104434b, "impression", getAdapterPosition());
    }

    public C41089b(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        super(viewGroup);
        this.itemView.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C41089b f104447a;

            {
                this.f104447a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f104447a.mo83609c(this.f104447a.f104434b);
                this.f104447a.mo83604a(this.f104447a.f104434b);
                this.f104447a.mo83605a(this.f104447a.f104434b, "enter_profile", this.f104447a.getAdapterPosition());
                DataCenter dataCenter = this.f104447a.f104431a;
                if (dataCenter != null) {
                    dataCenter.mo48228a("action_click_item", (Object) "");
                }
            }
        });
        this.f104435d.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C41089b f104448a;

            {
                this.f104448a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f104448a.mo83609c(this.f104448a.f104434b);
                this.f104448a.mo83604a(this.f104448a.f104434b);
                this.f104448a.mo83605a(this.f104448a.f104434b, "enter_profile", this.f104448a.getAdapterPosition());
                DataCenter dataCenter = this.f104448a.f104431a;
                if (dataCenter != null) {
                    dataCenter.mo48228a("action_click_head", (Object) "");
                }
            }
        });
        this.f104438g.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C41089b f104449a;

            {
                this.f104449a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                String str = null;
                C41088a.m90758a(this.f104449a, this.f104449a.f104434b, false, 2, null);
                this.f104449a.mo83605a(this.f104449a.f104434b, "delete", this.f104449a.getAdapterPosition());
                DataCenter dataCenter = this.f104449a.f104431a;
                if (dataCenter != null) {
                    String str2 = "action_click_dislike";
                    User user = this.f104449a.f104434b;
                    if (user != null) {
                        str = user.getUid();
                    }
                    dataCenter.mo48228a(str2, (Object) str);
                }
            }
        });
    }

    /* renamed from: a */
    public final /* synthetic */ void mo83613a(Object obj) {
        boolean z;
        User user = (User) obj;
        if (user != null) {
            this.f104434b = user;
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.f104435d.setUserData(userVerify);
            C52711k.m112240b(user, "user");
            CharSequence remarkName = user.getRemarkName();
            if (remarkName == null || remarkName.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                DmtTextView dmtTextView = this.f104436e;
                C52711k.m112236a((Object) dmtTextView, "mUserNameTv");
                dmtTextView.setText(user.getNickname());
            } else {
                DmtTextView dmtTextView2 = this.f104436e;
                C52711k.m112236a((Object) dmtTextView2, "mUserNameTv");
                dmtTextView2.setText(user.getRemarkName());
            }
            if (C47915gg.m103651b()) {
                FansFollowUserBtn fansFollowUserBtn = this.f104439h;
                C52711k.m112236a((Object) fansFollowUserBtn, "mFollowBtn");
                fansFollowUserBtn.setVisibility(8);
            }
            this.f104445n.mo65173a(user);
            this.f104445n.f83488c = new C41095b(this, user);
            this.f104439h.mo65360a(user.getFollowStatus(), user.getFollowerStatus());
            mo83612a(user, user.getFollowStatus());
            DmtTextView dmtTextView3 = this.f104440i;
            C52711k.m112236a((Object) dmtTextView3, "mDesTv");
            TextView textView = dmtTextView3;
            RelativeUserAvatarListView relativeUserAvatarListView = this.f104442k;
            C52711k.m112236a((Object) relativeUserAvatarListView, "mRelativeUserAvatars");
            relativeUserAvatarListView.setVisibility(0);
            textView.setMaxLines(2);
            textView.setVisibility(0);
            if (!TextUtils.isEmpty(user.getRecommendReason())) {
                textView.setText(user.getRecommendReason());
            } else if (!TextUtils.isEmpty(user.getSignature())) {
                textView.setText(user.getSignature());
            } else {
                C52711k.m112240b(textView, "textView");
                textView.setText(R.string.dk2);
            }
            this.f104442k.mo66274a(user.getRelativeUserInfos(), textView, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        if (com.p683ss.android.ugc.aweme.setting.C41589c.m91437i() == 3) goto L_0x0025;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83612a(com.p683ss.android.ugc.aweme.profile.model.User r2, int r3) {
        /*
            r1 = this;
            java.lang.String r3 = "user"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r3)
            com.ss.android.ugc.aweme.setting.c r3 = com.p683ss.android.ugc.aweme.setting.C41589c.m91432a()
            java.lang.String r0 = "AbTestManager.getInstance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
            int r3 = com.p683ss.android.ugc.aweme.setting.C41589c.m91437i()
            r0 = 2
            if (r3 == r0) goto L_0x0025
            com.ss.android.ugc.aweme.setting.c r3 = com.p683ss.android.ugc.aweme.setting.C41589c.m91432a()
            java.lang.String r0 = "AbTestManager.getInstance()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r0)
            int r3 = com.p683ss.android.ugc.aweme.setting.C41589c.m91437i()
            r0 = 3
            if (r3 != r0) goto L_0x0036
        L_0x0025:
            int r3 = r2.getFollowStatus()
            if (r3 != 0) goto L_0x0036
            com.ss.android.ugc.aweme.views.AutoRTLImageView r3 = r1.f104437f
            if (r3 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.views.AutoRTLImageView r3 = r1.f104437f
            r0 = 8
            r3.setVisibility(r0)
        L_0x0036:
            int r2 = r2.getFollowStatus()
            if (r2 != 0) goto L_0x0048
            android.widget.ImageView r2 = r1.f104438g
            java.lang.String r3 = "mDislikeIv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r3 = 0
            r2.setVisibility(r3)
            return
        L_0x0048:
            android.widget.ImageView r2 = r1.f104438g
            java.lang.String r3 = "mDislikeIv"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            r3 = 4
            r2.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.recommend.p2112b.C41089b.mo83612a(com.ss.android.ugc.aweme.profile.model.User, int):void");
    }

    /* renamed from: a */
    public final void mo83605a(User user, String str, int i) {
        C52711k.m112240b(str, "eventType");
        if (user != null) {
            C23205al e = new C23205al(null, 1, null).mo47981c(str).mo47979a(user.getUid()).mo47982d(user.getRequestId()).mo47983e(user.getRecommendReason());
            DataCenter dataCenter = this.f104431a;
            if (dataCenter != null) {
                dataCenter.mo48228a("key_recommend_user_event", (Object) e);
            }
        }
    }
}
