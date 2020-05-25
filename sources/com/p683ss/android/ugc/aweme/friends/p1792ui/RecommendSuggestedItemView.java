package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47916gh;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendSuggestedItemView */
public final class RecommendSuggestedItemView extends RelativeLayout {

    /* renamed from: b */
    public static final int f85090b = 1;

    /* renamed from: c */
    public static final int f85091c = 2;

    /* renamed from: d */
    public static final int f85092d = 3;

    /* renamed from: e */
    public static final int f85093e = 4;

    /* renamed from: f */
    public static final int f85094f = 5;

    /* renamed from: g */
    public static final int f85095g = 6;

    /* renamed from: h */
    public static final C32671a f85096h = new C32671a(null);

    /* renamed from: a */
    public C52682m<? super Integer, ? super String, C52860x> f85097a;

    /* renamed from: i */
    private View f85098i;

    /* renamed from: j */
    private DmtTextView f85099j;

    /* renamed from: k */
    private SmartAvatarImageView f85100k;

    /* renamed from: l */
    private DmtTextView f85101l;

    /* renamed from: m */
    private FansFollowUserBtn f85102m;

    /* renamed from: n */
    private DmtTextView f85103n;

    /* renamed from: o */
    private RelativeLayout f85104o;

    /* renamed from: p */
    private ImageView f85105p;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendSuggestedItemView$a */
    public static final class C32671a {
        private C32671a() {
        }

        /* renamed from: a */
        public static int m75531a() {
            return RecommendSuggestedItemView.f85090b;
        }

        /* renamed from: b */
        public static int m75532b() {
            return RecommendSuggestedItemView.f85091c;
        }

        /* renamed from: c */
        public static int m75533c() {
            return RecommendSuggestedItemView.f85092d;
        }

        /* renamed from: d */
        public static int m75534d() {
            return RecommendSuggestedItemView.f85094f;
        }

        /* renamed from: e */
        public static int m75535e() {
            return RecommendSuggestedItemView.f85095g;
        }

        public /* synthetic */ C32671a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendSuggestedItemView$b */
    static final class C32672b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendSuggestedItemView f85106a;

        C32672b(RecommendSuggestedItemView recommendSuggestedItemView) {
            this.f85106a = recommendSuggestedItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52682m<? super Integer, ? super String, C52860x> mVar = this.f85106a.f85097a;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(C32671a.m75531a()), "click_head");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendSuggestedItemView$c */
    static final class C32673c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendSuggestedItemView f85107a;

        C32673c(RecommendSuggestedItemView recommendSuggestedItemView) {
            this.f85107a = recommendSuggestedItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52682m<? super Integer, ? super String, C52860x> mVar = this.f85107a.f85097a;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(0), "click_name");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendSuggestedItemView$d */
    static final class C32674d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendSuggestedItemView f85108a;

        C32674d(RecommendSuggestedItemView recommendSuggestedItemView) {
            this.f85108a = recommendSuggestedItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52682m<? super Integer, ? super String, C52860x> mVar = this.f85108a.f85097a;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(C32671a.m75532b()), "");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendSuggestedItemView$e */
    static final class C32675e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendSuggestedItemView f85109a;

        C32675e(RecommendSuggestedItemView recommendSuggestedItemView) {
            this.f85109a = recommendSuggestedItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52682m<? super Integer, ? super String, C52860x> mVar = this.f85109a.f85097a;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(C32671a.m75533c()), "");
            }
        }
    }

    private final int getLayoutResId() {
        return R.layout.b4a;
    }

    public final FansFollowUserBtn getMFollowUserBtn() {
        return this.f85102m;
    }

    /* renamed from: a */
    private final void m75525a() {
        LayoutParams buttonLayoutParams = this.f85102m.getButtonLayoutParams();
        buttonLayoutParams.height = C23728o.m58241a(30.0d);
        buttonLayoutParams.width = C23728o.m58241a(88.0d);
        this.f85102m.setButtonLayoutParams(buttonLayoutParams);
        requestLayout();
        this.f85102m.setTypeAppearance(R.style.un);
        if (C10751d.f28908g != null) {
            FansFollowUserBtn fansFollowUserBtn = this.f85102m;
            String str = C10751d.f28908g;
            C52711k.m112236a((Object) str, "FontName.MEDIUM");
            fansFollowUserBtn.setFontType(str);
        }
    }

    /* renamed from: b */
    private final void m75526b() {
        LayoutParams buttonLayoutParams = this.f85102m.getButtonLayoutParams();
        buttonLayoutParams.height = C23728o.m58241a(30.0d);
        buttonLayoutParams.width = C23728o.m58241a(64.0d);
        this.f85102m.setButtonLayoutParams(buttonLayoutParams);
        requestLayout();
        if (m75527c()) {
            this.f85102m.setTypeAppearance(R.style.uh);
            if (C10751d.f28908g != null) {
                FansFollowUserBtn fansFollowUserBtn = this.f85102m;
                String str = C10751d.f28908g;
                C52711k.m112236a((Object) str, "FontName.MEDIUM");
                fansFollowUserBtn.setFontType(str);
            }
        }
    }

    /* renamed from: c */
    private final boolean m75527c() {
        Paint paint = new Paint();
        paint.setTypeface(C10749b.m21787a().mo19435a(C10751d.f28908g));
        if (((double) paint.measureText(this.f85102m.getContext().getString(R.string.b3w))) > 64.0d) {
            return true;
        }
        return false;
    }

    public final void setActionEventListener(C52682m<? super Integer, ? super String, C52860x> mVar) {
        C52711k.m112240b(mVar, "listener");
        this.f85097a = mVar;
    }

    public final void setMFollowUserBtn(FansFollowUserBtn fansFollowUserBtn) {
        C52711k.m112240b(fansFollowUserBtn, "<set-?>");
        this.f85102m = fansFollowUserBtn;
    }

    /* renamed from: a */
    public final void mo66238a(int i) {
        if (i != 4) {
            switch (i) {
                case 0:
                    break;
                case 1:
                    m75525a();
                    return;
                default:
                    m75526b();
                    return;
            }
        }
        m75526b();
    }

    /* renamed from: b */
    public final void mo66240b(User user) {
        C52711k.m112240b(user, "user");
        if (user.getFollowStatus() == 0) {
            this.f85104o.setVisibility(0);
        } else {
            this.f85104o.setVisibility(4);
        }
    }

    /* renamed from: a */
    public final void mo66239a(User user) {
        if (user != null) {
            this.f85098i.setOnClickListener(new C32672b(this));
            if (!TextUtils.isEmpty(user.getUniqueId())) {
                this.f85099j.setText(user.getUniqueId());
            }
            this.f85099j.setFontType(C10751d.f28903b);
            this.f85099j.setOnClickListener(new C32673c(this));
            if (!TextUtils.isEmpty(user.getRecommendReason())) {
                this.f85103n.setText(user.getRecommendReason());
            }
            if (!TextUtils.isEmpty(user.getNickname())) {
                this.f85101l.setText(user.getNickname());
            }
            int followStatus = user.getFollowStatus();
            int followerStatus = user.getFollowerStatus();
            if (C47915gg.m103651b()) {
                this.f85102m.setVisibility(8);
            }
            this.f85102m.mo65360a(followStatus, followerStatus);
            mo66238a(followStatus);
            mo66240b(user);
            C12203q.m24645a((Object) C23608p.m57874a(user.getAvatarThumb())).mo23116a((C12197k) this.f85100k).mo23118a("RecommendSuggestedItemView").mo23121a();
            this.f85102m.setOnClickListener(new C32674d(this));
            this.f85104o.setOnClickListener(new C32675e(this));
            this.f85105p.setVisibility(8);
            C47916gh.m103675a(getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f85099j);
        }
    }

    public RecommendSuggestedItemView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(getLayoutResId(), this);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…e(getLayoutResId(), this)");
        this.f85098i = inflate;
        View findViewById = this.f85098i.findViewById(R.id.dif);
        C52711k.m112236a((Object) findViewById, "mRootView.findViewById(R.id.tv_username)");
        this.f85099j = (DmtTextView) findViewById;
        View findViewById2 = this.f85098i.findViewById(R.id.erd);
        C52711k.m112236a((Object) findViewById2, "mRootView.findViewById(R.id.recommend_avatar)");
        this.f85100k = (SmartAvatarImageView) findViewById2;
        View findViewById3 = this.f85098i.findViewById(R.id.dcr);
        C52711k.m112236a((Object) findViewById3, "mRootView.findViewById(R.id.tv_nickname)");
        this.f85101l = (DmtTextView) findViewById3;
        View findViewById4 = this.f85098i.findViewById(R.id.nr);
        C52711k.m112236a((Object) findViewById4, "mRootView.findViewById(R.id.btn_follow)");
        this.f85102m = (FansFollowUserBtn) findViewById4;
        View findViewById5 = this.f85098i.findViewById(R.id.ayh);
        C52711k.m112236a((Object) findViewById5, "mRootView.findViewById(R.id.iv_block_recommend)");
        this.f85104o = (RelativeLayout) findViewById5;
        View findViewById6 = this.f85098i.findViewById(R.id.c_5);
        C52711k.m112236a((Object) findViewById6, "mRootView.findViewById(R.id.recommend_reason)");
        this.f85103n = (DmtTextView) findViewById6;
        View findViewById7 = this.f85098i.findViewById(R.id.ebt);
        C52711k.m112236a((Object) findViewById7, "mRootView.findViewById(R.id.im_verify)");
        this.f85105p = (ImageView) findViewById7;
    }

    public /* synthetic */ RecommendSuggestedItemView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
