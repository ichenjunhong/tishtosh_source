package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.MusCountDownView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.BaseMusSecureSendCodeFragment_ViewBinding */
public class BaseMusSecureSendCodeFragment_ViewBinding implements Unbinder {

    /* renamed from: a */
    private BaseMusSecureSendCodeFragment f57486a;

    /* renamed from: b */
    private View f57487b;

    /* renamed from: c */
    private View f57488c;

    public void unbind() {
        BaseMusSecureSendCodeFragment baseMusSecureSendCodeFragment = this.f57486a;
        if (baseMusSecureSendCodeFragment != null) {
            this.f57486a = null;
            baseMusSecureSendCodeFragment.mTvPhoneNumber = null;
            baseMusSecureSendCodeFragment.mTvHint = null;
            baseMusSecureSendCodeFragment.mEdCode = null;
            baseMusSecureSendCodeFragment.mBtnLogin = null;
            baseMusSecureSendCodeFragment.mTvWrongCode = null;
            baseMusSecureSendCodeFragment.mCountDownView = null;
            baseMusSecureSendCodeFragment.mGetVoiceCode = null;
            baseMusSecureSendCodeFragment.mEdCodeUnderline = null;
            baseMusSecureSendCodeFragment.mBtnLoginPhonePassword = null;
            baseMusSecureSendCodeFragment.mWrongCodeContainer = null;
            baseMusSecureSendCodeFragment.tipTitle = null;
            baseMusSecureSendCodeFragment.loginViewText = null;
            this.f57487b.setOnClickListener(null);
            this.f57487b = null;
            this.f57488c.setOnClickListener(null);
            this.f57488c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public BaseMusSecureSendCodeFragment_ViewBinding(final BaseMusSecureSendCodeFragment baseMusSecureSendCodeFragment, View view) {
        this.f57486a = baseMusSecureSendCodeFragment;
        baseMusSecureSendCodeFragment.mTvPhoneNumber = (TextView) Utils.findRequiredViewAsType(view, R.id.bxj, "field 'mTvPhoneNumber'", TextView.class);
        baseMusSecureSendCodeFragment.mTvHint = (TextView) Utils.findRequiredViewAsType(view, R.id.da5, "field 'mTvHint'", TextView.class);
        baseMusSecureSendCodeFragment.mEdCode = (EditText) Utils.findRequiredViewAsType(view, R.id.abz, "field 'mEdCode'", EditText.class);
        View findRequiredView = Utils.findRequiredView(view, R.id.o9, "field 'mBtnLogin' and method 'onClick'");
        baseMusSecureSendCodeFragment.mBtnLogin = (LoginButton) Utils.castView(findRequiredView, R.id.o9, "field 'mBtnLogin'", LoginButton.class);
        this.f57487b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseMusSecureSendCodeFragment.onClick(view);
            }
        });
        baseMusSecureSendCodeFragment.mTvWrongCode = (TextView) Utils.findRequiredViewAsType(view, R.id.dvi, "field 'mTvWrongCode'", TextView.class);
        baseMusSecureSendCodeFragment.mCountDownView = (MusCountDownView) Utils.findRequiredViewAsType(view, R.id.bns, "field 'mCountDownView'", MusCountDownView.class);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.aki, "field 'mGetVoiceCode' and method 'onClick'");
        baseMusSecureSendCodeFragment.mGetVoiceCode = (TextView) Utils.castView(findRequiredView2, R.id.aki, "field 'mGetVoiceCode'", TextView.class);
        this.f57488c = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                baseMusSecureSendCodeFragment.onClick(view);
            }
        });
        baseMusSecureSendCodeFragment.mEdCodeUnderline = Utils.findRequiredView(view, R.id.abl, "field 'mEdCodeUnderline'");
        baseMusSecureSendCodeFragment.mBtnLoginPhonePassword = Utils.findRequiredView(view, R.id.of, "field 'mBtnLoginPhonePassword'");
        baseMusSecureSendCodeFragment.mWrongCodeContainer = Utils.findRequiredView(view, R.id.dvj, "field 'mWrongCodeContainer'");
        baseMusSecureSendCodeFragment.tipTitle = (TextView) Utils.findRequiredViewAsType(view, R.id.d0m, "field 'tipTitle'", TextView.class);
        baseMusSecureSendCodeFragment.loginViewText = Utils.findRequiredView(view, R.id.og, "field 'loginViewText'");
    }
}
