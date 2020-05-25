package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.arch.lifecycle.C0214z;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Optional;
import com.bytedance.ies.dmt.p664ui.widget.DmtButton;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.mobilelib.present.CommonPresent;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21573e;
import com.p683ss.android.ugc.aweme.account.model.AccountOpeModel;
import com.p683ss.android.ugc.aweme.account.model.C22053a;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.p1279l.C21021e;
import com.p683ss.android.ugc.aweme.account.view.StateButton.C22308a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23698l;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BaseAccountFragment */
public abstract class BaseAccountFragment extends C21573e {

    /* renamed from: a */
    private int f59788a = -111;
    @BindView(2131492911)
    ImageView backBtn;
    @BindView(2131492936)
    View mBtnLogin;
    @BindView(2131492948)
    DmtButton mBtnPreAccount;
    @BindView(2131492996)
    View mCodeDownView;
    @BindView(2131493516)
    DmtStatusView mDmtStatusView;
    @BindView(2131493275)
    View mEditCodeContainer;
    @BindView(2131493066)
    EditText mEditText;
    @BindView(2131493271)
    LinearLayout mLLContainer;
    @BindView(2131493287)
    DmtLoadingLayout mLoadingUI;
    @BindView(2131493346)
    View mPasswordDownView;
    @BindView(2131493065)
    EditText mPasswordEt;
    @BindView(2131493610)
    TextView mPasswordTip;
    @BindView(2131493276)
    View mPhoneContainer;
    @BindView(2131493364)
    View mPhoneDownView;
    @BindView(2131493638)
    TextView mRightText;
    @BindView(2131493421)
    RelativeLayout mRlTitle;
    @BindView(2131493614)
    TextView mSafeCheckHint;
    @BindView(2131493237)
    ImageView mSelectCountryDown;
    @BindView(2131493650)
    DmtTextView mSwitchToEmail;
    @BindView(2131493564)
    protected TextView mTitleHint;
    @BindView(2131493635)
    protected TextView mTxtHint;
    @BindView(2131493640)
    TextView mTxtTimer;

    /* renamed from: q */
    private C23698l f59789q = new C23698l() {
        public final void afterTextChanged(Editable editable) {
            if (BaseAccountFragment.this.mBtnLogin == null || BaseAccountFragment.this.mBtnLogin.getVisibility() != 0) {
                if (BaseAccountFragment.this.mBtnPreAccount != null && BaseAccountFragment.this.mBtnPreAccount.getVisibility() == 0) {
                    BaseAccountFragment.this.mBtnPreAccount.setEnabled(BaseAccountFragment.this.mo46253v());
                }
                return;
            }
            C22308a.m55206a(BaseAccountFragment.this.mBtnLogin, BaseAccountFragment.this.mo46253v());
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo44970b();

    /* renamed from: g */
    public final CommonPresent mo45812g() {
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo46252u();

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract boolean mo46253v();

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract int mo46254w();

    /* renamed from: r */
    public final void mo45827r() {
        if (this.mBtnLogin == null || this.mBtnLogin.getVisibility() != 0) {
            if (this.mBtnPreAccount != null && this.mBtnPreAccount.getVisibility() == 0) {
                this.mDmtStatusView.mo19212f();
            }
            return;
        }
        C22308a.m55207b(this.mBtnLogin);
    }

    /* renamed from: s */
    public final void mo46250s() {
        if (this.mBtnLogin == null || this.mBtnLogin.getVisibility() != 0) {
            if (this.mBtnPreAccount != null && this.mBtnPreAccount.getVisibility() == 0) {
                this.mDmtStatusView.setVisibility(8);
            }
            return;
        }
        C22308a.m55205a(this.mBtnLogin);
    }

    /* renamed from: t */
    public void mo46251t() {
        if (getActivity() != null) {
            ((AccountOpeModel) C0214z.m440a(getActivity()).mo359a(AccountOpeModel.class)).f59551b.postValue(new C22053a(false));
        }
    }

    /* renamed from: a */
    public final void mo45808a(View view) {
        KeyboardUtils.m58184c(view);
    }

    /* renamed from: b */
    public final void mo45809b(View view) {
        KeyboardUtils.m58182a(view);
    }

    /* renamed from: a */
    public final void mo45847a(String str) {
        super.mo45847a(str);
        if (this.mBtnLogin == null || this.mBtnLogin.getVisibility() != 0) {
            if (this.mBtnPreAccount != null && this.mBtnPreAccount.getVisibility() == 0) {
                this.mBtnPreAccount.setEnabled(mo46253v());
            }
            return;
        }
        C22308a.m55206a(this.mBtnLogin, mo46253v());
    }

    @OnClick({2131492911, 2131492936, 2131493638, 2131492948})
    @Optional
    public void onClick(View view) {
        if (isViewValid()) {
            if (view.getId() == R.id.ik) {
                mo46251t();
            } else if (view.getId() == R.id.o9 || view.getId() == R.id.om) {
                mo46252u();
            } else {
                if (view.getId() == R.id.dkt || view.getId() == R.id.cz3) {
                    C26890h.m65011a("phone_bundling_skip", new C20856a().mo44776a("enter_from", "log_in").mo44776a("platform", C21021e.m53410a("")).f56798a);
                    KeyboardUtils.m58184c(this.mEditText);
                    getActivity().finish();
                }
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo44970b();
        this.mEditCodeContainer.setVisibility(8);
        this.mPhoneContainer.setVisibility(8);
        this.mPasswordEt.setVisibility(8);
        if (mo46254w() == 1) {
            mo45809b(this.f58513o);
            this.mPhoneContainer.setVisibility(0);
        } else if (mo46254w() == 2) {
            mo45809b(this.mPasswordEt);
            this.mPasswordEt.setVisibility(0);
            this.mPasswordEt.addTextChangedListener(this.f59789q);
            this.mPasswordTip.setVisibility(0);
        } else if (mo46254w() == 0) {
            mo45809b(this.mEditText);
            this.mEditCodeContainer.setVisibility(0);
            this.mEditText.addTextChangedListener(this.f59789q);
        } else if (mo46254w() == 3) {
            mo45809b(this.mEditText);
            this.mEditCodeContainer.setVisibility(0);
            this.mPasswordEt.setVisibility(0);
            this.mEditText.addTextChangedListener(this.f59789q);
            this.mPasswordEt.addTextChangedListener(this.f59789q);
            this.mPasswordTip.setVisibility(0);
        }
        this.mTitleHint.setTextSize(26.0f);
        if (getArguments() != null) {
            this.f59788a = getArguments().getInt("type");
        }
        if (this.f59788a != 5 && this.f59788a != 9) {
            this.backBtn.setImageResource(R.drawable.cez);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.b0m, viewGroup, false);
        this.f58511m = inflate.findViewById(R.id.bf4);
        this.f58512n = (TextView) inflate.findViewById(R.id.d91);
        this.f58513o = (EditText) inflate.findViewById(R.id.a9k);
        this.f58514p = inflate.findViewById(R.id.bxg);
        return inflate;
    }
}
