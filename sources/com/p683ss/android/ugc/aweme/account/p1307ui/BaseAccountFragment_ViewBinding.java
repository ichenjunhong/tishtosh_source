package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BaseAccountFragment_ViewBinding */
public class BaseAccountFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseAccountFragment f59791a;

    /* renamed from: b */
    private View f59792b;

    /* renamed from: c */
    private View f59793c;

    /* renamed from: d */
    private View f59794d;

    /* renamed from: e */
    private View f59795e;

    public void unbind() {
        BaseAccountFragment baseAccountFragment = this.f59791a;
        if (baseAccountFragment != null) {
            this.f59791a = null;
            baseAccountFragment.mPhoneContainer = null;
            baseAccountFragment.mEditCodeContainer = null;
            baseAccountFragment.mEditText = null;
            baseAccountFragment.backBtn = null;
            baseAccountFragment.mTxtHint = null;
            baseAccountFragment.mTxtTimer = null;
            baseAccountFragment.mBtnLogin = null;
            baseAccountFragment.mRlTitle = null;
            baseAccountFragment.mTitleHint = null;
            baseAccountFragment.mRightText = null;
            baseAccountFragment.mPasswordEt = null;
            baseAccountFragment.mPasswordTip = null;
            baseAccountFragment.mSafeCheckHint = null;
            baseAccountFragment.mBtnPreAccount = null;
            baseAccountFragment.mPhoneDownView = null;
            baseAccountFragment.mCodeDownView = null;
            baseAccountFragment.mPasswordDownView = null;
            baseAccountFragment.mLLContainer = null;
            baseAccountFragment.mLoadingUI = null;
            baseAccountFragment.mDmtStatusView = null;
            baseAccountFragment.mSwitchToEmail = null;
            baseAccountFragment.mSelectCountryDown = null;
            this.f59792b.setOnClickListener(null);
            this.f59792b = null;
            this.f59793c.setOnClickListener(null);
            this.f59793c = null;
            this.f59794d.setOnClickListener(null);
            this.f59794d = null;
            this.f59795e.setOnClickListener(null);
            this.f59795e = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseAccountFragment_ViewBinding(final BaseAccountFragment baseAccountFragment, View view) {
        this.f59791a = baseAccountFragment;
        baseAccountFragment.mPhoneContainer = Utils.findRequiredView(view, R.id.bfc, "field 'mPhoneContainer'");
        baseAccountFragment.mEditCodeContainer = Utils.findRequiredView(view, R.id.bfb, "field 'mEditCodeContainer'");
        baseAccountFragment.mEditText = (EditText) Utils.findRequiredViewAsType(view, R.id.a9a, "field 'mEditText'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.ik, "field 'backBtn'");
        baseAccountFragment.backBtn = (ImageView) Utils.castView(findRequiredView, R.id.ik, "field 'backBtn'", ImageView.class);
        this.f59792b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseAccountFragment.onClick(view);
            }
        });
        baseAccountFragment.mTxtHint = (TextView) Utils.findRequiredViewAsType(view, R.id.dkm, "field 'mTxtHint'", TextView.class);
        baseAccountFragment.mTxtTimer = (TextView) Utils.findRequiredViewAsType(view, R.id.dky, "field 'mTxtTimer'", TextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.o9, "field 'mBtnLogin'");
        baseAccountFragment.mBtnLogin = findRequiredView2;
        this.f59793c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseAccountFragment.onClick(view);
            }
        });
        baseAccountFragment.mRlTitle = (RelativeLayout) Utils.findRequiredViewAsType(view, R.id.ce5, "field 'mRlTitle'", RelativeLayout.class);
        baseAccountFragment.mTitleHint = (TextView) Utils.findRequiredViewAsType(view, R.id.d1a, "field 'mTitleHint'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.dkt, "field 'mRightText'");
        baseAccountFragment.mRightText = (TextView) Utils.castView(findRequiredView3, R.id.dkt, "field 'mRightText'", TextView.class);
        this.f59794d = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseAccountFragment.onClick(view);
            }
        });
        baseAccountFragment.mPasswordEt = (EditText) Utils.findRequiredViewAsType(view, R.id.a96, "field 'mPasswordEt'", EditText.class);
        baseAccountFragment.mPasswordTip = (TextView) Utils.findRequiredViewAsType(view, R.id.dd_, "field 'mPasswordTip'", TextView.class);
        baseAccountFragment.mSafeCheckHint = (TextView) Utils.findRequiredViewAsType(view, R.id.df7, "field 'mSafeCheckHint'", TextView.class);
        View findRequiredView4 = Utils.findRequiredView(view, R.id.om, "field 'mBtnPreAccount'");
        baseAccountFragment.mBtnPreAccount = (DmtButton) Utils.castView(findRequiredView4, R.id.om, "field 'mBtnPreAccount'", DmtButton.class);
        this.f59795e = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseAccountFragment.onClick(view);
            }
        });
        baseAccountFragment.mPhoneDownView = Utils.findRequiredView(view, R.id.bxh, "field 'mPhoneDownView'");
        baseAccountFragment.mCodeDownView = Utils.findRequiredView(view, R.id.uu, "field 'mCodeDownView'");
        baseAccountFragment.mPasswordDownView = Utils.findRequiredView(view, R.id.bwg, "field 'mPasswordDownView'");
        baseAccountFragment.mLLContainer = (LinearLayout) Utils.findRequiredViewAsType(view, R.id.bez, "field 'mLLContainer'", LinearLayout.class);
        baseAccountFragment.mLoadingUI = (DmtLoadingLayout) Utils.findOptionalViewAsType(view, R.id.bhw, "field 'mLoadingUI'", DmtLoadingLayout.class);
        baseAccountFragment.mDmtStatusView = (DmtStatusView) Utils.findRequiredViewAsType(view, R.id.csv, "field 'mDmtStatusView'", DmtStatusView.class);
        baseAccountFragment.mSwitchToEmail = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.f5v, "field 'mSwitchToEmail'", DmtTextView.class);
        baseAccountFragment.mSelectCountryDown = (ImageView) Utils.findRequiredViewAsType(view, R.id.b43, "field 'mSelectCountryDown'", ImageView.class);
    }
}
