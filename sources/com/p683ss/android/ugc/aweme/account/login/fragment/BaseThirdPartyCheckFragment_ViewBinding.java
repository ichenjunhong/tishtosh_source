package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.BaseThirdPartyCheckFragment_ViewBinding */
public class BaseThirdPartyCheckFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseThirdPartyCheckFragment f57499a;

    /* renamed from: b */
    private View f57500b;

    /* renamed from: c */
    private View f57501c;

    public void unbind() {
        BaseThirdPartyCheckFragment baseThirdPartyCheckFragment = this.f57499a;
        if (baseThirdPartyCheckFragment != null) {
            this.f57499a = null;
            baseThirdPartyCheckFragment.mIvback = null;
            baseThirdPartyCheckFragment.mTvBindDetail = null;
            baseThirdPartyCheckFragment.mIvPlatForm = null;
            baseThirdPartyCheckFragment.mCountDownFive = null;
            baseThirdPartyCheckFragment.mBtnConfirm = null;
            this.f57500b.setOnClickListener(null);
            this.f57500b = null;
            this.f57501c.setOnClickListener(null);
            this.f57501c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseThirdPartyCheckFragment_ViewBinding(final BaseThirdPartyCheckFragment baseThirdPartyCheckFragment, View view) {
        this.f57499a = baseThirdPartyCheckFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.ay9, "field 'mIvback' and method 'onClick'");
        baseThirdPartyCheckFragment.mIvback = (ImageView) Utils.castView(findRequiredView, R.id.ay9, "field 'mIvback'", ImageView.class);
        this.f57500b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseThirdPartyCheckFragment.onClick(view);
            }
        });
        baseThirdPartyCheckFragment.mTvBindDetail = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.dh6, "field 'mTvBindDetail'", DmtTextView.class);
        baseThirdPartyCheckFragment.mIvPlatForm = (ImageView) Utils.findRequiredViewAsType(view, R.id.b36, "field 'mIvPlatForm'", ImageView.class);
        baseThirdPartyCheckFragment.mCountDownFive = (DmtTextView) Utils.findRequiredViewAsType(view, R.id.d90, "field 'mCountDownFive'", DmtTextView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.nl, "field 'mBtnConfirm' and method 'onClick'");
        baseThirdPartyCheckFragment.mBtnConfirm = (DmtButton) Utils.castView(findRequiredView2, R.id.nl, "field 'mBtnConfirm'", DmtButton.class);
        this.f57501c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseThirdPartyCheckFragment.onClick(view);
            }
        });
    }
}
