package com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1287ui;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.p683ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1285a.C21142b;
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1285a.C21144c;
import com.p683ss.android.ugc.aweme.account.login.forgetpsw.p1286b.C21145a;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.C21568ah;
import com.p683ss.android.ugc.aweme.account.login.p1291ui.LoginButton;
import com.p683ss.android.ugc.aweme.account.p1260a.p1262b.C20856a;
import com.p683ss.android.ugc.aweme.account.util.C22263e;
import com.p683ss.android.ugc.aweme.account.views.C22311a;
import com.p683ss.android.ugc.aweme.account.views.C22313c;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.main.service.C36703x;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.forgetpsw.ui.FindPswByEmailActivity */
public class FindPswByEmailActivity extends MusAbsActivity implements C21155b {

    /* renamed from: a */
    public static C21568ah f57446a;

    /* renamed from: b */
    public C21144c f57447b;

    /* renamed from: c */
    private Dialog f57448c;

    /* renamed from: d */
    private OnFocusChangeListener f57449d = new OnFocusChangeListener() {
        public final void onFocusChange(View view, boolean z) {
            int i;
            if (view.getId() == R.id.abm) {
                ImageView imageView = FindPswByEmailActivity.this.mClearEmail;
                if (!z || TextUtils.isEmpty(FindPswByEmailActivity.this.mEtEmail.getText())) {
                    i = 8;
                } else {
                    i = 0;
                }
                imageView.setVisibility(i);
            }
        }
    };
    @BindView(2131492931)
    LoginButton mBtnNext;
    @BindView(2131492984)
    ImageView mClearEmail;
    @BindView(2131493109)
    EditText mEtEmail;
    @BindView(2131493110)
    View mEtEmailUnderline;
    @BindString(2132083234)
    String mHelpCenterRegular;
    @BindView(2131493423)
    View mRoot;
    @BindView(2131493596)
    TextView mTvHelperCenter;
    @BindView(2131493673)
    View mWrongEmailContainer;
    @BindView(2131493672)
    TextView mWrongEmailText;

    /* renamed from: a */
    public final Activity mo45287a() {
        return this;
    }

    @OnClick({2131493226})
    public void onBackClick() {
        finish();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.forgetpsw.ui.FindPswByEmailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.forgetpsw.ui.FindPswByEmailActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.forgetpsw.ui.FindPswByEmailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @OnClick({2131492984})
    public void onClearEmailClick() {
        this.mClearEmail.setVisibility(8);
        this.mEtEmail.setText("");
    }

    public void onDestroy() {
        super.onDestroy();
        C21144c cVar = this.f57447b;
        cVar.mo46991S_();
        cVar.aq_();
        f57446a = null;
    }

    @OnClick({2131492931})
    public void onNextClick() {
        Intent intent = new Intent(this, MusLoginActivity.class);
        if (getIntent().getExtras() != null) {
            intent.putExtras(getIntent().getExtras());
        }
        intent.putExtra("email", this.mEtEmail.getText().toString().trim());
        intent.putExtra("init_page", 12);
        intent.putExtra("use_find_email_pass_ticker_wrapper", true);
        startActivityForResult(intent, PreloadTask.BYTE_UNIT_NUMBER);
    }

    /* renamed from: a */
    public final void mo45289a(String str) {
        C10691a.m21545b((Context) this, str).mo19066a();
    }

    public void setContentView(int i) {
        super.setContentView(i);
        ButterKnife.bind((Activity) this);
    }

    /* renamed from: a */
    public final void mo45290a(boolean z) {
        if (z) {
            this.mBtnNext.mo45161c();
        } else {
            this.mBtnNext.mo45160a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void afterPswInput(Editable editable) {
        int i;
        this.mBtnNext.setEnabled(C21145a.m53660a(this.mEtEmail.getText().toString()));
        ImageView imageView = this.mClearEmail;
        if (!this.mEtEmail.hasFocus() || TextUtils.isEmpty(this.mEtEmail.getText())) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        if (TextUtils.isEmpty(this.mEtEmail.getText())) {
            this.mWrongEmailContainer.setVisibility(8);
            this.mEtEmailUnderline.setBackgroundColor(getResources().getColor(R.color.j1));
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.forgetpsw.ui.FindPswByEmailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.azu);
        f57446a = new C21568ah();
        if (getIntent().getBooleanExtra("forget_psw_from_tt_email", false)) {
            C26890h.m65011a("click_forget_password", new C20856a().mo44776a("platform", "email").f56798a);
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.in)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String charSequence = this.mTvHelperCenter.getText().toString();
        spannableStringBuilder.append(charSequence);
        C211494 r4 = new C22313c(getResources().getColor(R.color.j6), getResources().getColor(R.color.up)) {
            public final void onClick(View view) {
                C21144c cVar = FindPswByEmailActivity.this.f57447b;
                if (!C22263e.m55110a(((C21155b) cVar.f70701g).mo45287a(), "https://support.tiktok.com")) {
                    Activity a = ((C21155b) cVar.f70701g).mo45287a();
                    String str = "https://support.tiktok.com";
                    C36703x xVar = (C36703x) C23826bi.m58450a(C36703x.class);
                    if (a == null) {
                        C52711k.m112234a();
                    }
                    xVar.mo47870a((Context) a, str, false);
                }
            }
        };
        int indexOf = charSequence.toLowerCase().indexOf(this.mHelpCenterRegular.toLowerCase());
        if (indexOf != -1) {
            spannableStringBuilder.setSpan(r4, indexOf, this.mHelpCenterRegular.length() + indexOf, 33);
        }
        this.mTvHelperCenter.setHighlightColor(C23723j.m58216a(17170445));
        this.mTvHelperCenter.setText(spannableStringBuilder);
        this.mTvHelperCenter.setMovementMethod(C22311a.m55214a());
        this.mEtEmail.post(new Runnable() {
            public final void run() {
                FindPswByEmailActivity.this.mEtEmail.setFocusable(true);
                FindPswByEmailActivity.this.mEtEmail.setFocusableInTouchMode(true);
                FindPswByEmailActivity.this.mEtEmail.requestFocus();
                ((InputMethodManager) FindPswByEmailActivity.this.mEtEmail.getContext().getSystemService("input_method")).showSoftInput(FindPswByEmailActivity.this.mEtEmail, 0);
            }
        });
        this.mEtEmail.setOnFocusChangeListener(this.f57449d);
        this.mRoot.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                KeyboardUtils.m58184c(FindPswByEmailActivity.this.mRoot);
            }
        });
        this.mBtnNext.setLoginBackgroundRes(R.drawable.cgr);
        this.mBtnNext.setLoadingBackground(R.drawable.ch1);
        this.f57447b = new C21144c();
        C21144c cVar = this.f57447b;
        cVar.mo54800a(this);
        cVar.mo54799a(new C21142b());
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.forgetpsw.ui.FindPswByEmailActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo45288a(int i, int i2) {
        if (this.f57448c != null && this.f57448c.isShowing()) {
            this.f57448c.dismiss();
        }
        this.f57448c = new Builder(this).setTitle(R.string.c9_).setMessage(getResources().getString(R.string.c9a)).setPositiveButton(R.string.c_x, C21154a.f57468a).create();
        this.f57448c.show();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1024) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(-1);
            finish();
        }
    }
}
