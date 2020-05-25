package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarImageView;
import com.ss.android.ugc.trill.R;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendFriendsItemView */
public final class RecommendFriendsItemView extends RelativeLayout {

    /* renamed from: h */
    public static final int f85075h = 1;

    /* renamed from: i */
    public static final int f85076i = 2;

    /* renamed from: j */
    public static final int f85077j = 5;

    /* renamed from: k */
    public static final int f85078k = 7;

    /* renamed from: l */
    public static final C32667a f85079l = new C32667a(null);

    /* renamed from: a */
    View f85080a;

    /* renamed from: b */
    DmtTextView f85081b;

    /* renamed from: c */
    SmartAvatarImageView f85082c;

    /* renamed from: d */
    DmtTextView f85083d;

    /* renamed from: e */
    FansFollowUserBtn f85084e;

    /* renamed from: f */
    DmtTextView f85085f;

    /* renamed from: g */
    public C52682m<? super Integer, ? super String, C52860x> f85086g;

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendFriendsItemView$a */
    public static final class C32667a {
        private C32667a() {
        }

        /* renamed from: a */
        public static int m75524a() {
            return RecommendFriendsItemView.f85078k;
        }

        public /* synthetic */ C32667a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendFriendsItemView$b */
    static final class C32668b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendsItemView f85087a;

        C32668b(RecommendFriendsItemView recommendFriendsItemView) {
            this.f85087a = recommendFriendsItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52682m<? super Integer, ? super String, C52860x> mVar = this.f85087a.f85086g;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(RecommendFriendsItemView.f85075h), "click_head");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendFriendsItemView$c */
    static final class C32669c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendsItemView f85088a;

        C32669c(RecommendFriendsItemView recommendFriendsItemView) {
            this.f85088a = recommendFriendsItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52682m<? super Integer, ? super String, C52860x> mVar = this.f85088a.f85086g;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(0), "click_name");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.RecommendFriendsItemView$d */
    static final class C32670d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ RecommendFriendsItemView f85089a;

        C32670d(RecommendFriendsItemView recommendFriendsItemView) {
            this.f85089a = recommendFriendsItemView;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52682m<? super Integer, ? super String, C52860x> mVar = this.f85089a.f85086g;
            if (mVar != null) {
                mVar.invoke(Integer.valueOf(RecommendFriendsItemView.f85076i), "");
            }
        }
    }

    public RecommendFriendsItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public RecommendFriendsItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final int getLayoutResId() {
        return R.layout.b4m;
    }

    public final FansFollowUserBtn getMFollowUserBtn() {
        return this.f85084e;
    }

    public final void setActionEventListener(C52682m<? super Integer, ? super String, C52860x> mVar) {
        C52711k.m112240b(mVar, "listener");
        this.f85086g = mVar;
    }

    public final void setMFollowUserBtn(FansFollowUserBtn fansFollowUserBtn) {
        C52711k.m112240b(fansFollowUserBtn, "<set-?>");
        this.f85084e = fansFollowUserBtn;
    }

    public RecommendFriendsItemView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        View inflate = LayoutInflater.from(context).inflate(getLayoutResId(), this);
        C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont…e(getLayoutResId(), this)");
        this.f85080a = inflate;
        View findViewById = this.f85080a.findViewById(R.id.dif);
        C52711k.m112236a((Object) findViewById, "mRootView.findViewById(R.id.tv_username)");
        this.f85081b = (DmtTextView) findViewById;
        View findViewById2 = this.f85080a.findViewById(R.id.erd);
        C52711k.m112236a((Object) findViewById2, "mRootView.findViewById(R.id.recommend_avatar)");
        this.f85082c = (SmartAvatarImageView) findViewById2;
        View findViewById3 = this.f85080a.findViewById(R.id.dcr);
        C52711k.m112236a((Object) findViewById3, "mRootView.findViewById(R.id.tv_nickname)");
        this.f85083d = (DmtTextView) findViewById3;
        View findViewById4 = this.f85080a.findViewById(R.id.nr);
        C52711k.m112236a((Object) findViewById4, "mRootView.findViewById(R.id.btn_follow)");
        this.f85084e = (FansFollowUserBtn) findViewById4;
        View findViewById5 = this.f85080a.findViewById(R.id.c_5);
        C52711k.m112236a((Object) findViewById5, "mRootView.findViewById(R.id.recommend_reason)");
        this.f85085f = (DmtTextView) findViewById5;
    }

    public /* synthetic */ RecommendFriendsItemView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
