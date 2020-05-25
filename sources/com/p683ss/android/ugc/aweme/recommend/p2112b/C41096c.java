package com.p683ss.android.ugc.aweme.recommend.p2112b;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31984a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31985b;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.friends.p1792ui.FansFollowUserBtn;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.util.C40574y;
import com.p683ss.android.ugc.aweme.profile.util.C40575z;
import com.p683ss.android.ugc.aweme.recommend.C41083a;
import com.p683ss.android.ugc.aweme.recommend.C41083a.C41084a;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.p683ss.android.ugc.aweme.views.AutoRTLImageView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.recommend.b.c */
public class C41096c extends C41088a {

    /* renamed from: e */
    public static final C41102a f104452e = new C41102a(null);

    /* renamed from: b */
    public final FansFollowUserBtn f104453b = ((FansFollowUserBtn) this.itemView.findViewById(R.id.nr));

    /* renamed from: c */
    public final DmtTextView f104454c = ((DmtTextView) this.itemView.findViewById(R.id.e0k));

    /* renamed from: d */
    public User f104455d;

    /* renamed from: f */
    private final AvatarImageWithVerify f104456f = ((AvatarImageWithVerify) this.itemView.findViewById(R.id.ay2));

    /* renamed from: g */
    private final DmtTextView f104457g = ((DmtTextView) this.itemView.findViewById(R.id.dl2));

    /* renamed from: h */
    private final AutoRTLImageView f104458h = ((AutoRTLImageView) this.itemView.findViewById(R.id.b0_));

    /* renamed from: i */
    private final LinearLayout f104459i = ((LinearLayout) this.itemView.findViewById(R.id.cxc));

    /* renamed from: j */
    private final DmtTextView f104460j = ((DmtTextView) this.itemView.findViewById(R.id.d98));

    /* renamed from: k */
    private final ImageView f104461k = ((ImageView) this.itemView.findViewById(R.id.a6f));

    /* renamed from: l */
    private int f104462l = (C9432q.m18670a(mo83603a()) - ((int) C9432q.m18687b(mo83603a(), 246.0f)));

    /* renamed from: m */
    private C40574y f104463m = new C40575z(this.f104459i, this.f104462l);

    /* renamed from: n */
    private C31980a f104464n;

    /* renamed from: com.ss.android.ugc.aweme.recommend.b.c$a */
    public static final class C41102a {
        private C41102a() {
        }

        public /* synthetic */ C41102a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.recommend.b.c$b */
    static final class C41103b implements C31984a {

        /* renamed from: a */
        final /* synthetic */ C41096c f104470a;

        /* renamed from: b */
        final /* synthetic */ User f104471b;

        C41103b(C41096c cVar, User user) {
            this.f104470a = cVar;
            this.f104471b = user;
        }

        /* renamed from: a */
        public final void mo56224a(FollowStatus followStatus) {
            C41096c cVar = this.f104470a;
            User user = this.f104471b;
            C52711k.m112236a((Object) followStatus, "followStatus");
            cVar.mo83618a(user, followStatus.followStatus);
        }
    }

    /* renamed from: b */
    public int mo83606b() {
        return R.layout.bix;
    }

    /* renamed from: f */
    public boolean mo83619f() {
        return true;
    }

    /* renamed from: c */
    public final void mo83608c() {
        ImageView imageView = this.f104461k;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* renamed from: d */
    public final void mo83610d() {
        ImageView imageView = this.f104461k;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: e */
    public final void mo83611e() {
        super.mo83611e();
        mo83605a(this.f104455d, "impression", getAdapterPosition());
    }

    public C41096c(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        super(viewGroup);
        this.f104453b.setTextSize(14.0f);
        FansFollowUserBtn fansFollowUserBtn = this.f104453b;
        Typeface defaultFromStyle = Typeface.defaultFromStyle(1);
        C52711k.m112236a((Object) defaultFromStyle, "Typeface.defaultFromStyle(Typeface.BOLD)");
        fansFollowUserBtn.setTypeface(defaultFromStyle);
        this.f104464n = new C31980a(this.f104453b, new C31988e(this) {

            /* renamed from: a */
            final /* synthetic */ C41096c f104465a;

            {
                this.f104465a = r1;
            }

            /* renamed from: a */
            public final void mo49741a(int i, User user) {
                super.mo49741a(i, user);
                User user2 = this.f104465a.f104455d;
                if (user2 != null) {
                    if (i != 0) {
                        this.f104465a.mo83605a(this.f104465a.f104455d, "follow", this.f104465a.getAdapterPosition());
                        C41083a aVar = C41083a.f104427a;
                        Context a = this.f104465a.mo83603a();
                        FansFollowUserBtn fansFollowUserBtn = this.f104465a.f104453b;
                        C52711k.m112236a((Object) fansFollowUserBtn, "mFollowBtn");
                        DmtTextView dmtTextView = this.f104465a.f104454c;
                        C52711k.m112236a((Object) dmtTextView, "mDislikeBtn");
                        int followerStatus = user2.getFollowerStatus();
                        C52711k.m112240b(a, "context");
                        C52711k.m112240b(fansFollowUserBtn, "followUserBtn");
                        C52711k.m112240b(dmtTextView, "dislikeBtn");
                        C52711k.m112240b(a, "context");
                        C52711k.m112240b(fansFollowUserBtn, "followUserBtn");
                        C52711k.m112240b(dmtTextView, "dislikeBtn");
                        if (dmtTextView.getVisibility() != 8) {
                            dmtTextView.setVisibility(8);
                            fansFollowUserBtn.mo65360a(i, followerStatus);
                            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{(int) C9432q.m18687b(a, 68.0f), (int) C9432q.m18687b(a, 142.0f)});
                            C52711k.m112236a((Object) ofInt, "it");
                            ofInt.setInterpolator(new LinearInterpolator());
                            ofInt.setDuration(300);
                            C52711k.m112236a((Object) ofInt, "ValueAnimator.ofInt(orig…tion = duration\n        }");
                            ofInt.addUpdateListener(new C41084a(fansFollowUserBtn));
                            ofInt.start();
                        }
                    } else {
                        C41083a aVar2 = C41083a.f104427a;
                        Context a2 = this.f104465a.mo83603a();
                        FansFollowUserBtn fansFollowUserBtn2 = this.f104465a.f104453b;
                        C52711k.m112236a((Object) fansFollowUserBtn2, "mFollowBtn");
                        DmtTextView dmtTextView2 = this.f104465a.f104454c;
                        C52711k.m112236a((Object) dmtTextView2, "mDislikeBtn");
                        aVar2.mo83599a(a2, fansFollowUserBtn2, dmtTextView2, i, user2.getFollowerStatus());
                    }
                    this.f104465a.mo83607b(user2);
                }
                DataCenter dataCenter = this.f104465a.f104431a;
                if (dataCenter != null) {
                    dataCenter.mo48228a("action_click_follow", (Object) Integer.valueOf(i));
                }
            }
        });
        this.f104464n.f83489d = new C31985b(this) {

            /* renamed from: a */
            final /* synthetic */ C41096c f104466a;

            {
                this.f104466a = r1;
            }

            /* renamed from: a */
            public final void mo65177a(FollowStatus followStatus) {
                C52711k.m112240b(followStatus, "followStatus");
                User user = this.f104466a.f104455d;
                if (user != null) {
                    user.setFollowStatus(followStatus.followStatus);
                    user.setFollowerStatus(followStatus.followerStatus);
                    C41096c cVar = this.f104466a;
                    FansFollowUserBtn fansFollowUserBtn = this.f104466a.f104453b;
                    C52711k.m112236a((Object) fansFollowUserBtn, "mFollowBtn");
                    DmtTextView dmtTextView = this.f104466a.f104454c;
                    C52711k.m112236a((Object) dmtTextView, "mDislikeBtn");
                    cVar.mo83617a(fansFollowUserBtn, dmtTextView, user);
                    this.f104466a.mo83618a(user, user.getFollowStatus());
                }
            }

            /* renamed from: a */
            public final void mo65178a(Exception exc) {
                int i;
                C41083a aVar = C41083a.f104427a;
                Context a = this.f104466a.mo83603a();
                FansFollowUserBtn fansFollowUserBtn = this.f104466a.f104453b;
                C52711k.m112236a((Object) fansFollowUserBtn, "mFollowBtn");
                DmtTextView dmtTextView = this.f104466a.f104454c;
                C52711k.m112236a((Object) dmtTextView, "mDislikeBtn");
                User user = this.f104466a.f104455d;
                if (user != null) {
                    i = user.getFollowerStatus();
                } else {
                    i = 0;
                }
                aVar.mo83599a(a, fansFollowUserBtn, dmtTextView, 0, i);
            }
        };
        this.itemView.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C41096c f104467a;

            {
                this.f104467a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f104467a.mo83609c(this.f104467a.f104455d);
                this.f104467a.mo83604a(this.f104467a.f104455d);
                this.f104467a.mo83605a(this.f104467a.f104455d, "enter_profile", this.f104467a.getAdapterPosition());
                DataCenter dataCenter = this.f104467a.f104431a;
                if (dataCenter != null) {
                    dataCenter.mo48228a("action_click_item", (Object) "");
                }
            }
        });
        this.f104456f.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C41096c f104468a;

            {
                this.f104468a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                this.f104468a.mo83609c(this.f104468a.f104455d);
                this.f104468a.mo83604a(this.f104468a.f104455d);
                this.f104468a.mo83605a(this.f104468a.f104455d, "enter_profile", this.f104468a.getAdapterPosition());
                DataCenter dataCenter = this.f104468a.f104431a;
                if (dataCenter != null) {
                    dataCenter.mo48228a("action_click_head", (Object) "");
                }
            }
        });
        this.f104454c.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ C41096c f104469a;

            {
                this.f104469a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                String str = null;
                C41088a.m90758a(this.f104469a, this.f104469a.f104455d, false, 2, null);
                this.f104469a.mo83605a(this.f104469a.f104455d, "delete", this.f104469a.getAdapterPosition());
                DataCenter dataCenter = this.f104469a.f104431a;
                if (dataCenter != null) {
                    String str2 = "action_click_dislike";
                    User user = this.f104469a.f104455d;
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
        User user = (User) obj;
        if (user != null) {
            this.f104455d = user;
            UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
            this.f104456f.setUserData(userVerify);
            if (!mo83619f()) {
                this.f104456f.mo48964b();
            }
            if (!TextUtils.isEmpty(user.getRemarkName())) {
                DmtTextView dmtTextView = this.f104457g;
                C52711k.m112236a((Object) dmtTextView, "mUserNameTv");
                dmtTextView.setText(user.getRemarkName());
            } else {
                DmtTextView dmtTextView2 = this.f104457g;
                C52711k.m112236a((Object) dmtTextView2, "mUserNameTv");
                dmtTextView2.setText(user.getNickname());
            }
            if (!TextUtils.isEmpty(user.getRecommendReason())) {
                DmtTextView dmtTextView3 = this.f104460j;
                C52711k.m112236a((Object) dmtTextView3, "mDesTv");
                dmtTextView3.setText(user.getRecommendReason());
            } else if (!TextUtils.isEmpty(user.getSignature())) {
                DmtTextView dmtTextView4 = this.f104460j;
                C52711k.m112236a((Object) dmtTextView4, "mDesTv");
                dmtTextView4.setText(user.getSignature());
            } else {
                DmtTextView dmtTextView5 = this.f104460j;
                C52711k.m112236a((Object) dmtTextView5, "mDesTv");
                dmtTextView5.setVisibility(8);
            }
            if (C47915gg.m103651b()) {
                FansFollowUserBtn fansFollowUserBtn = this.f104453b;
                C52711k.m112236a((Object) fansFollowUserBtn, "mFollowBtn");
                fansFollowUserBtn.setVisibility(8);
                DmtTextView dmtTextView6 = this.f104454c;
                C52711k.m112236a((Object) dmtTextView6, "mDislikeBtn");
                dmtTextView6.setVisibility(8);
                return;
            }
            this.f104464n.mo65173a(user);
            this.f104464n.f83488c = new C41103b(this, user);
            FansFollowUserBtn fansFollowUserBtn2 = this.f104453b;
            C52711k.m112236a((Object) fansFollowUserBtn2, "mFollowBtn");
            DmtTextView dmtTextView7 = this.f104454c;
            C52711k.m112236a((Object) dmtTextView7, "mDislikeBtn");
            mo83617a(fansFollowUserBtn2, dmtTextView7, user);
            mo83618a(user, user.getFollowStatus());
        }
    }

    /* renamed from: a */
    public final void mo83618a(User user, int i) {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        if (C41589c.m91437i() != 2) {
            C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
            if (C41589c.m91437i() != 3) {
                return;
            }
        }
        if (user.getFollowStatus() == 0) {
            AutoRTLImageView autoRTLImageView = this.f104458h;
            C52711k.m112236a((Object) autoRTLImageView, "mRemarkEdit");
            autoRTLImageView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo83617a(FansFollowUserBtn fansFollowUserBtn, DmtTextView dmtTextView, User user) {
        int i;
        fansFollowUserBtn.mo65360a(user.getFollowStatus(), user.getFollowerStatus());
        if (user.getGender() == 2) {
            dmtTextView.setText(mo83603a().getResources().getString(R.string.d2));
        } else {
            dmtTextView.setText(mo83603a().getResources().getString(R.string.d3));
        }
        if (C47915gg.m103663l(user)) {
            dmtTextView.setVisibility(8);
            i = (int) C9432q.m18687b(mo83603a(), 142.0f);
        } else {
            dmtTextView.setVisibility(0);
            i = (int) C9432q.m18687b(mo83603a(), 68.0f);
        }
        LayoutParams buttonLayoutParams = fansFollowUserBtn.getButtonLayoutParams();
        buttonLayoutParams.width = i;
        fansFollowUserBtn.setButtonLayoutParams(buttonLayoutParams);
    }
}
