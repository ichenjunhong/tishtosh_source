package com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1287ui;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.forgetpsw.ui.FindPswByEmailActivity_ViewBinding */
public class FindPswByEmailActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private FindPswByEmailActivity f57454a;

    /* renamed from: b */
    private View f57455b;

    /* renamed from: c */
    private TextWatcher f57456c;

    /* renamed from: d */
    private View f57457d;

    /* renamed from: e */
    private View f57458e;

    /* renamed from: f */
    private View f57459f;

    public void unbind() {
        FindPswByEmailActivity findPswByEmailActivity = this.f57454a;
        if (findPswByEmailActivity != null) {
            this.f57454a = null;
            findPswByEmailActivity.mRoot = null;
            findPswByEmailActivity.mEtEmail = null;
            findPswByEmailActivity.mClearEmail = null;
            findPswByEmailActivity.mTvHelperCenter = null;
            findPswByEmailActivity.mBtnNext = null;
            findPswByEmailActivity.mWrongEmailContainer = null;
            findPswByEmailActivity.mWrongEmailText = null;
            findPswByEmailActivity.mEtEmailUnderline = null;
            ((TextView) this.f57455b).removeTextChangedListener(this.f57456c);
            this.f57456c = null;
            this.f57455b = null;
            this.f57457d.setOnClickListener(null);
            this.f57457d = null;
            this.f57458e.setOnClickListener(null);
            this.f57458e = null;
            this.f57459f.setOnClickListener(null);
            this.f57459f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public FindPswByEmailActivity_ViewBinding(final FindPswByEmailActivity findPswByEmailActivity, View view) {
        this.f57454a = findPswByEmailActivity;
        findPswByEmailActivity.mRoot = Utils.findRequiredView(view, R.id.cfc, "field 'mRoot'");
        View findRequiredView = Utils.findRequiredView(view, R.id.abm, "field 'mEtEmail' and method 'afterPswInput'");
        findPswByEmailActivity.mEtEmail = (EditText) Utils.castView(findRequiredView, R.id.abm, "field 'mEtEmail'", EditText.class);
        this.f57455b = findRequiredView;
        this.f57456c = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                findPswByEmailActivity.afterPswInput(editable);
            }
        };
        ((TextView) findRequiredView).addTextChangedListener(this.f57456c);
        View findRequiredView2 = Utils.findRequiredView(view, R.id.tt, "field 'mClearEmail' and method 'onClearEmailClick'");
        findPswByEmailActivity.mClearEmail = (ImageView) Utils.castView(findRequiredView2, R.id.tt, "field 'mClearEmail'", ImageView.class);
        this.f57457d = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                findPswByEmailActivity.onClearEmailClick();
            }
        });
        findPswByEmailActivity.mTvHelperCenter = (TextView) Utils.findRequiredViewAsType(view, R.id.da4, "field 'mTvHelperCenter'", TextView.class);
        View findRequiredView3 = Utils.findRequiredView(view, R.id.nm, "field 'mBtnNext' and method 'onNextClick'");
        findPswByEmailActivity.mBtnNext = (LoginButton) Utils.castView(findRequiredView3, R.id.nm, "field 'mBtnNext'", LoginButton.class);
        this.f57458e = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                findPswByEmailActivity.onNextClick();
            }
        });
        findPswByEmailActivity.mWrongEmailContainer = Utils.findRequiredView(view, R.id.dvl, "field 'mWrongEmailContainer'");
        findPswByEmailActivity.mWrongEmailText = (TextView) Utils.findRequiredViewAsType(view, R.id.dvk, "field 'mWrongEmailText'", TextView.class);
        findPswByEmailActivity.mEtEmailUnderline = Utils.findRequiredView(view, R.id.abn, "field 'mEtEmailUnderline'");
        View findRequiredView4 = Utils.findRequiredView(view, R.id.ay9, "method 'onBackClick'");
        this.f57459f = findRequiredView4;
        findRequiredView4.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                findPswByEmailActivity.onBackClick();
            }
        });
        findPswByEmailActivity.mHelpCenterRegular = view.getContext().getResources().getString(R.string.c_j);
    }
}
