package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.common.C10678c;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageWithVerify;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.experiment.C29504e;
import com.p683ss.android.ugc.aweme.experiment.EnableFriendsEnhanceFollowBackExperiment;
import com.p683ss.android.ugc.aweme.experiment.ShowRemarkIconStyleExperiemnt;
import com.p683ss.android.ugc.aweme.friends.adapter.C32528d;
import com.p683ss.android.ugc.aweme.friends.adapter.C32541p;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32506c;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.i18n.C33095b;
import com.p683ss.android.ugc.aweme.profile.C39715aa;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.util.C40574y;
import com.p683ss.android.ugc.aweme.profile.util.C40575z;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.router.C41311y;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.UserVerify;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendUserItemView */
public class RecommendUserItemView extends RelativeLayout {

    /* renamed from: f */
    public static final int f85110f = 1;

    /* renamed from: g */
    public static final int f85111g = 2;

    /* renamed from: h */
    public static final int f85112h = 3;

    /* renamed from: i */
    public static final int f85113i = 4;

    /* renamed from: j */
    public static final int f85114j = 5;

    /* renamed from: k */
    public static final C32676a f85115k = new C32676a(null);

    /* renamed from: a */
    private View f85116a;

    /* renamed from: b */
    private TextView f85117b;

    /* renamed from: c */
    private AvatarImageWithVerify f85118c;

    /* renamed from: d */
    private TextView f85119d;

    /* renamed from: e */
    public C52682m<? super Integer, ? super String, C52860x> f85120e;

    /* renamed from: l */
    private FansFollowUserBtn f85121l;

    /* renamed from: m */
    private TextView f85122m;

    /* renamed from: n */
    private View f85123n;

    /* renamed from: o */
    private ImageView f85124o;

    /* renamed from: p */
    private View f85125p;

    /* renamed from: q */
    private RecyclerView f85126q;

    /* renamed from: r */
    private final boolean f85127r;

    /* renamed from: s */
    private int f85128s;

    /* renamed from: t */
    private RelativeUserAvatarListView f85129t;

    /* renamed from: u */
    private LinearLayout f85130u;

    /* renamed from: v */
    private int f85131v;

    /* renamed from: w */
    private C40574y f85132w;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendUserItemView$a */
    public static final class C32676a {
        private C32676a() {
        }

        /* renamed from: a */
        public static int m75541a() {
            return RecommendUserItemView.f85110f;
        }

        /* renamed from: b */
        public static int m75542b() {
            return RecommendUserItemView.f85111g;
        }

        /* renamed from: c */
        public static int m75543c() {
            return RecommendUserItemView.f85112h;
        }

        /* renamed from: d */
        public static int m75544d() {
            return RecommendUserItemView.f85113i;
        }

        /* renamed from: e */
        public static int m75545e() {
            return RecommendUserItemView.f85114j;
        }

        public /* synthetic */ C32676a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendUserItemView$b */
    static final class C32677b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendUserItemView f85133a;

        C32677b(RecommendUserItemView recommendUserItemView) {
            this.f85133a = recommendUserItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52682m<? super Integer, ? super String, C52860x> mVar = this.f85133a.f85120e;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(C32676a.m75541a()), "click_head");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendUserItemView$c */
    static final class C32678c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendUserItemView f85134a;

        C32678c(RecommendUserItemView recommendUserItemView) {
            this.f85134a = recommendUserItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52682m<? super Integer, ? super String, C52860x> mVar = this.f85134a.f85120e;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(0), "click_name");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendUserItemView$d */
    static final class C32679d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendUserItemView f85135a;

        C32679d(RecommendUserItemView recommendUserItemView) {
            this.f85135a = recommendUserItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52682m<? super Integer, ? super String, C52860x> mVar = this.f85135a.f85120e;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(C32676a.m75542b()), "");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendUserItemView$e */
    static final class C32680e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendUserItemView f85136a;

        C32680e(RecommendUserItemView recommendUserItemView) {
            this.f85136a = recommendUserItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52682m<? super Integer, ? super String, C52860x> mVar = this.f85136a.f85120e;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(C32676a.m75543c()), "");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendUserItemView$f */
    public static final class C32681f implements C32506c {

        /* renamed from: a */
        final /* synthetic */ RecommendUserItemView f85137a;

        C32681f(RecommendUserItemView recommendUserItemView) {
            this.f85137a = recommendUserItemView;
        }

        /* renamed from: a */
        public final void mo65818a(String str, int i) {
            if (str != null) {
                C41302w a = C41302w.m91042a();
                StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
                sb.append(str);
                a.mo83861a(C41311y.m91065a(sb.toString()).mo83870a("refer", "find_friends").mo83871a());
                C52682m<? super Integer, ? super String, C52860x> mVar = this.f85137a.f85120e;
                if (mVar != null) {
                    mVar.invoke(Integer.valueOf(C32676a.m75544d()), str);
                }
            }
        }
    }

    public int getLayoutResId() {
        return R.layout.z7;
    }

    /* access modifiers changed from: protected */
    public final AvatarImageWithVerify getMAvatarIv() {
        return this.f85118c;
    }

    /* access modifiers changed from: protected */
    public final ImageView getMBlockUserIv() {
        return this.f85124o;
    }

    /* access modifiers changed from: protected */
    public final TextView getMDescTv() {
        return this.f85122m;
    }

    /* access modifiers changed from: protected */
    public final TextView getMFollowInfoTv() {
        return this.f85119d;
    }

    /* access modifiers changed from: protected */
    public final FansFollowUserBtn getMFollowUserBtn() {
        return this.f85121l;
    }

    /* access modifiers changed from: protected */
    public final View getMNewFriendRecommendMask() {
        return this.f85125p;
    }

    /* access modifiers changed from: protected */
    public final RecyclerView getMRecViewRecommendItem() {
        return this.f85126q;
    }

    /* access modifiers changed from: protected */
    public final View getMRemarkEdit() {
        return this.f85123n;
    }

    /* access modifiers changed from: protected */
    public final View getMRootView() {
        return this.f85116a;
    }

    /* access modifiers changed from: protected */
    public final TextView getMUserNameTv() {
        return this.f85117b;
    }

    public final void setAdapterPosition(int i) {
        this.f85128s = i;
    }

    public final void setActionEventListener(C52682m<? super Integer, ? super String, C52860x> mVar) {
        C52711k.m112240b(mVar, "listener");
        this.f85120e = mVar;
    }

    /* access modifiers changed from: protected */
    public final void setMAvatarIv(AvatarImageWithVerify avatarImageWithVerify) {
        C52711k.m112240b(avatarImageWithVerify, "<set-?>");
        this.f85118c = avatarImageWithVerify;
    }

    /* access modifiers changed from: protected */
    public final void setMBlockUserIv(ImageView imageView) {
        C52711k.m112240b(imageView, "<set-?>");
        this.f85124o = imageView;
    }

    /* access modifiers changed from: protected */
    public final void setMDescTv(TextView textView) {
        C52711k.m112240b(textView, "<set-?>");
        this.f85122m = textView;
    }

    /* access modifiers changed from: protected */
    public final void setMFollowInfoTv(TextView textView) {
        C52711k.m112240b(textView, "<set-?>");
        this.f85119d = textView;
    }

    /* access modifiers changed from: protected */
    public final void setMFollowUserBtn(FansFollowUserBtn fansFollowUserBtn) {
        C52711k.m112240b(fansFollowUserBtn, "<set-?>");
        this.f85121l = fansFollowUserBtn;
    }

    /* access modifiers changed from: protected */
    public final void setMNewFriendRecommendMask(View view) {
        C52711k.m112240b(view, "<set-?>");
        this.f85125p = view;
    }

    /* access modifiers changed from: protected */
    public final void setMRecViewRecommendItem(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "<set-?>");
        this.f85126q = recyclerView;
    }

    /* access modifiers changed from: protected */
    public final void setMRemarkEdit(View view) {
        C52711k.m112240b(view, "<set-?>");
        this.f85123n = view;
    }

    /* access modifiers changed from: protected */
    public final void setMRootView(View view) {
        C52711k.m112240b(view, "<set-?>");
        this.f85116a = view;
    }

    /* access modifiers changed from: protected */
    public final void setMUserNameTv(TextView textView) {
        C52711k.m112240b(textView, "<set-?>");
        this.f85117b = textView;
    }

    /* renamed from: c */
    public void mo65351c(User user) {
        C52711k.m112240b(user, "user");
        if (!this.f85127r) {
            this.f85124o.setVisibility(8);
        } else if (user.getFollowStatus() == 0) {
            this.f85124o.setVisibility(0);
        } else {
            this.f85124o.setVisibility(4);
        }
    }

    /* renamed from: a */
    public void mo65348a(User user) {
        C52711k.m112240b(user, "user");
        this.f85116a.setOnClickListener(new C32677b(this));
        if (TextUtils.isEmpty(user.getRemarkName())) {
            this.f85117b.setText(user.getNickname());
        } else {
            this.f85117b.setText(user.getRemarkName());
        }
        this.f85117b.setOnClickListener(new C32678c(this));
        UserVerify userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()), user.getWeiboVerify());
        this.f85118c.setUserData(userVerify);
        if (C29504e.m69644d()) {
            TextView textView = this.f85122m;
            C52711k.m112240b(user, "user");
            C52711k.m112240b(textView, "textView");
            this.f85129t.setVisibility(0);
            textView.setMaxLines(2);
            m75536a(user, textView);
            this.f85129t.mo66274a(user.getRelativeUserInfos(), textView, false);
            C52711k.m112240b(user, "user");
        } else {
            m75536a(user, this.f85122m);
            mo65347a(this.f85119d, user);
        }
        int followStatus = user.getFollowStatus();
        int followerStatus = user.getFollowerStatus();
        if (C47915gg.m103651b()) {
            this.f85121l.setVisibility(8);
        }
        this.f85121l.mo65360a(followStatus, followerStatus);
        if (followStatus != 4) {
            switch (followStatus) {
                case 0:
                case 1:
                    break;
                default:
                    FansFollowUserBtn fansFollowUserBtn = this.f85121l;
                    LayoutParams buttonLayoutParams = fansFollowUserBtn.getButtonLayoutParams();
                    if (!(buttonLayoutParams.height == C23728o.m58241a(30.0d) && buttonLayoutParams.width == C23728o.m58241a(68.0d))) {
                        buttonLayoutParams.height = C23728o.m58241a(30.0d);
                        buttonLayoutParams.width = C23728o.m58241a(68.0d);
                        fansFollowUserBtn.setButtonLayoutParams(buttonLayoutParams);
                        fansFollowUserBtn.getLayoutParams().height = buttonLayoutParams.height;
                        fansFollowUserBtn.requestLayout();
                        break;
                    }
            }
        }
        this.f85121l.mo66154a();
        mo65351c(user);
        this.f85121l.setOnClickListener(new C32679d(this));
        mo65349a(user, user.getFollowStatus());
        this.f85124o.setOnClickListener(new C32680e(this));
        if (!C9376b.m18558a((Collection<T>) user.getRecommendAwemeItems())) {
            this.f85126q.setVisibility(0);
            C32541p createRecommendAwemeAdapter = C32616c.f84865a.createRecommendAwemeAdapter();
            createRecommendAwemeAdapter.mo65844a(new C32681f(this));
            createRecommendAwemeAdapter.mo50303a(user.getRecommendAwemeItems());
            createRecommendAwemeAdapter.mo65845b(this.f85128s);
            this.f85126q.setAdapter(createRecommendAwemeAdapter);
            return;
        }
        this.f85126q.setVisibility(8);
    }

    /* renamed from: a */
    private static void m75536a(User user, TextView textView) {
        C52711k.m112240b(user, "user");
        C52711k.m112240b(textView, "textView");
        textView.setVisibility(0);
        if (!TextUtils.isEmpty(user.getRecommendReason())) {
            textView.setText(user.getRecommendReason());
        } else if (!TextUtils.isEmpty(user.getSignature())) {
            textView.setText(user.getSignature());
        } else {
            C39715aa.m88420a(textView);
        }
    }

    /* renamed from: a */
    public void mo65347a(TextView textView, User user) {
        C52711k.m112240b(textView, "textView");
        C52711k.m112240b(user, "user");
        StringBuilder sb = new StringBuilder();
        sb.append(getContext().getString(R.string.fft));
        sb.append(":");
        sb.append(C33095b.m76068a((long) user.getAwemeCount()));
        sb.append("  ");
        sb.append(getContext().getString(R.string.b57));
        sb.append(":");
        sb.append(C33095b.m76068a((long) user.getFollowerCount()));
        textView.setVisibility(0);
        textView.setText(sb.toString());
    }

    /* renamed from: a */
    public void mo65349a(User user, int i) {
        C52711k.m112240b(user, "user");
        if ((C10181b.m20511a().mo18168a(ShowRemarkIconStyleExperiemnt.class, true, "show_remark_icon_style", 31744, 0) == 2 || C10181b.m20511a().mo18168a(ShowRemarkIconStyleExperiemnt.class, true, "show_remark_icon_style", 31744, 0) == 3) && user.getFollowStatus() == 0) {
            this.f85123n.setVisibility(8);
        }
    }

    public RecommendUserItemView(Context context, AttributeSet attributeSet, int i) {
        float b;
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f85127r = C10181b.m20511a().mo18172a(EnableFriendsEnhanceFollowBackExperiment.class, true, "friends_enhance_followback", 31744, false);
        View inflate = LayoutInflater.from(context).inflate(getLayoutResId(), this);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…e(getLayoutResId(), this)");
        this.f85116a = inflate;
        setBackground(C10678c.m21505e(context));
        View findViewById = this.f85116a.findViewById(R.id.dl2);
        C52711k.m112236a((Object) findViewById, "mRootView.findViewById<T…View>(R.id.txt_user_name)");
        this.f85117b = (TextView) findViewById;
        View findViewById2 = this.f85116a.findViewById(R.id.ay2);
        C52711k.m112236a((Object) findViewById2, "mRootView.findViewById<A…thVerify>(R.id.iv_avatar)");
        this.f85118c = (AvatarImageWithVerify) findViewById2;
        View findViewById3 = this.f85116a.findViewById(R.id.dkf);
        C52711k.m112236a((Object) findViewById3, "mRootView.findViewById<T…ew>(R.id.txt_follow_info)");
        this.f85119d = (TextView) findViewById3;
        View findViewById4 = this.f85116a.findViewById(R.id.nr);
        C52711k.m112236a((Object) findViewById4, "mRootView.findViewById<F…UserBtn>(R.id.btn_follow)");
        this.f85121l = (FansFollowUserBtn) findViewById4;
        View findViewById5 = this.f85116a.findViewById(R.id.d98);
        C52711k.m112236a((Object) findViewById5, "mRootView.findViewById<TextView>(R.id.tv_desc)");
        this.f85122m = (TextView) findViewById5;
        View findViewById6 = this.f85116a.findViewById(R.id.b0_);
        C52711k.m112236a((Object) findViewById6, "mRootView.findViewById<View>(R.id.iv_edit_remark)");
        this.f85123n = findViewById6;
        View findViewById7 = this.f85116a.findViewById(R.id.ayh);
        C52711k.m112236a((Object) findViewById7, "mRootView.findViewById<I…(R.id.iv_block_recommend)");
        this.f85124o = (ImageView) findViewById7;
        View findViewById8 = this.f85116a.findViewById(R.id.bqf);
        C52711k.m112236a((Object) findViewById8, "mRootView.findViewById<V…ew_friend_recommend_mask)");
        this.f85125p = findViewById8;
        View findViewById9 = this.f85116a.findViewById(R.id.bbz);
        RecyclerView recyclerView = (RecyclerView) findViewById9;
        recyclerView.mo4798a((C1331h) new C32528d(0, (int) C9432q.m18687b(context, 4.0f), 0));
        recyclerView.setLayoutManager(new RecommendUserItemView$$special$$inlined$apply$lambda$1(context, 0, false, context));
        C52711k.m112236a((Object) findViewById9, "mRootView.findViewById<R…}\n            }\n        }");
        this.f85126q = recyclerView;
        View findViewById10 = this.f85116a.findViewById(R.id.cb3);
        C52711k.m112236a((Object) findViewById10, "mRootView.findViewById(R.id.relative_user_avatar)");
        this.f85129t = (RelativeUserAvatarListView) findViewById10;
        View findViewById11 = this.f85116a.findViewById(R.id.cxc);
        C52711k.m112236a((Object) findViewById11, "mRootView.findViewById(R.id.tag_layout)");
        this.f85130u = (LinearLayout) findViewById11;
        int a = C9432q.m18670a(this.f85116a.getContext());
        if (this.f85127r) {
            b = C9432q.m18687b(this.f85116a.getContext(), 210.0f);
        } else {
            b = C9432q.m18687b(this.f85116a.getContext(), 185.0f);
        }
        this.f85131v = a - ((int) b);
        this.f85132w = new C40575z(this.f85130u, this.f85131v);
    }

    public /* synthetic */ RecommendUserItemView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
