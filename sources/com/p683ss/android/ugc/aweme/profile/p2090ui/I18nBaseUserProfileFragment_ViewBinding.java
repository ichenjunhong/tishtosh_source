package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.I18nBaseUserProfileFragment_ViewBinding */
public class I18nBaseUserProfileFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private I18nBaseUserProfileFragment f102251a;

    /* renamed from: b */
    private View f102252b;

    /* renamed from: c */
    private View f102253c;

    /* renamed from: d */
    private View f102254d;

    /* renamed from: e */
    private View f102255e;

    /* renamed from: f */
    private View f102256f;

    /* renamed from: g */
    private View f102257g;

    /* renamed from: h */
    private View f102258h;

    /* renamed from: i */
    private View f102259i;

    /* renamed from: j */
    private View f102260j;

    /* renamed from: k */
    private View f102261k;

    public void unbind() {
        I18nBaseUserProfileFragment i18nBaseUserProfileFragment = this.f102251a;
        if (i18nBaseUserProfileFragment != null) {
            this.f102251a = null;
            i18nBaseUserProfileFragment.followIv = null;
            i18nBaseUserProfileFragment.followIv16 = null;
            i18nBaseUserProfileFragment.sendMsgBtn = null;
            i18nBaseUserProfileFragment.followBn = null;
            i18nBaseUserProfileFragment.mIvMutual = null;
            i18nBaseUserProfileFragment.mTvFollow = null;
            i18nBaseUserProfileFragment.mFlHead = null;
            i18nBaseUserProfileFragment.requestedBtn = null;
            i18nBaseUserProfileFragment.adBottomMoreBtn = null;
            i18nBaseUserProfileFragment.mLiveStatusView = null;
            i18nBaseUserProfileFragment.txtAdBottomDes = null;
            i18nBaseUserProfileFragment.recommededUsersIv = null;
            i18nBaseUserProfileFragment.viewUserInfo = null;
            i18nBaseUserProfileFragment.mRecommendCommonUserView = null;
            i18nBaseUserProfileFragment.mTitleBar = null;
            this.f102252b.setOnClickListener(null);
            this.f102252b = null;
            this.f102253c.setOnClickListener(null);
            this.f102253c = null;
            this.f102254d.setOnClickListener(null);
            this.f102254d = null;
            this.f102255e.setOnClickListener(null);
            this.f102255e = null;
            this.f102256f.setOnClickListener(null);
            this.f102256f = null;
            this.f102257g.setOnClickListener(null);
            this.f102257g = null;
            this.f102258h.setOnClickListener(null);
            this.f102258h = null;
            this.f102259i.setOnClickListener(null);
            this.f102259i = null;
            this.f102260j.setOnClickListener(null);
            this.f102260j = null;
            this.f102261k.setOnClickListener(null);
            this.f102261k = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public I18nBaseUserProfileFragment_ViewBinding(final I18nBaseUserProfileFragment i18nBaseUserProfileFragment, View view) {
        this.f102251a = i18nBaseUserProfileFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.ai7, "field 'followIv' and method 'onImClick'");
        i18nBaseUserProfileFragment.followIv = findRequiredView;
        this.f102252b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                i18nBaseUserProfileFragment.onImClick(view);
            }
        });
        View findRequiredView2 = Utils.findRequiredView(view, R.id.e9p, "method 'onImClick' and method 'onFriendButtonClick'");
        i18nBaseUserProfileFragment.followIv16 = findRequiredView2;
        this.f102253c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                i18nBaseUserProfileFragment.onImClick(view);
                i18nBaseUserProfileFragment.onFriendButtonClick(view);
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, R.id.clc, "field 'sendMsgBtn' and method 'onImClick'");
        i18nBaseUserProfileFragment.sendMsgBtn = (Button) Utils.castView(findRequiredView3, R.id.clc, "field 'sendMsgBtn'", Button.class);
        this.f102254d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                i18nBaseUserProfileFragment.onImClick(view);
            }
        });
        View findRequiredView4 = Utils.findRequiredView(view, R.id.c5e, "field 'followBn' and method 'follow'");
        i18nBaseUserProfileFragment.followBn = (TextView) Utils.castView(findRequiredView4, R.id.c5e, "field 'followBn'", TextView.class);
        this.f102255e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                i18nBaseUserProfileFragment.follow(view);
            }
        });
        i18nBaseUserProfileFragment.mIvMutual = view.findViewById(R.id.ef9);
        i18nBaseUserProfileFragment.mTvFollow = (TextView) Utils.findOptionalViewAsType(view, R.id.d_h, "field 'mTvFollow'", TextView.class);
        i18nBaseUserProfileFragment.mFlHead = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.ah0, "field 'mFlHead'", FrameLayout.class);
        View findRequiredView5 = Utils.findRequiredView(view, R.id.cbq, "field 'requestedBtn' and method 'onImClick'");
        i18nBaseUserProfileFragment.requestedBtn = (TextView) Utils.castView(findRequiredView5, R.id.cbq, "field 'requestedBtn'", TextView.class);
        this.f102256f = findRequiredView5;
        findRequiredView5.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                i18nBaseUserProfileFragment.onImClick(view);
            }
        });
        i18nBaseUserProfileFragment.adBottomMoreBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.bb, "field 'adBottomMoreBtn'", TextView.class);
        i18nBaseUserProfileFragment.mLiveStatusView = (AnimationImageView) Utils.findRequiredViewAsType(view, R.id.e4, "field 'mLiveStatusView'", AnimationImageView.class);
        i18nBaseUserProfileFragment.txtAdBottomDes = (TextView) Utils.findRequiredViewAsType(view, R.id.dk6, "field 'txtAdBottomDes'", TextView.class);
        View findRequiredView6 = Utils.findRequiredView(view, R.id.c_8, "field 'recommededUsersIv' and method 'recommendUsersClick'");
        i18nBaseUserProfileFragment.recommededUsersIv = (ImageView) Utils.castView(findRequiredView6, R.id.c_8, "field 'recommededUsersIv'", ImageView.class);
        this.f102257g = findRequiredView6;
        findRequiredView6.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                i18nBaseUserProfileFragment.recommendUsersClick(view);
            }
        });
        i18nBaseUserProfileFragment.viewUserInfo = Utils.findRequiredView(view, R.id.dms, "field 'viewUserInfo'");
        i18nBaseUserProfileFragment.mRecommendCommonUserView = (RecommendCommonUserViewMus) Utils.findRequiredViewAsType(view, R.id.c9v, "field 'mRecommendCommonUserView'", RecommendCommonUserViewMus.class);
        i18nBaseUserProfileFragment.mTitleBar = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTitleBar'", RelativeLayout.class);
        View findRequiredView7 = Utils.findRequiredView(view, R.id.ik, "method 'onBack'");
        this.f102258h = findRequiredView7;
        findRequiredView7.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                i18nBaseUserProfileFragment.onBack(view);
            }
        });
        View findRequiredView8 = Utils.findRequiredView(view, R.id.c5f, "method 'onReport'");
        this.f102259i = findRequiredView8;
        findRequiredView8.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                i18nBaseUserProfileFragment.onReport(view);
            }
        });
        View findRequiredView9 = Utils.findRequiredView(view, R.id.b9, "method 'onAdBottomClick'");
        this.f102260j = findRequiredView9;
        findRequiredView9.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                i18nBaseUserProfileFragment.onAdBottomClick(view);
            }
        });
        View findRequiredView10 = Utils.findRequiredView(view, R.id.ba, "method 'onAdBottomClick'");
        this.f102261k = findRequiredView10;
        findRequiredView10.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                i18nBaseUserProfileFragment.onAdBottomClick(view);
            }
        });
    }
}
