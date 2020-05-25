package com.p683ss.android.ugc.aweme.account.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.p683ss.android.ugc.aweme.account.login.p1284d.C21134a;
import com.p683ss.android.ugc.aweme.account.p1307ui.VerificationCodeFragment;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.fragment.VerificationCodeFragmentV2 */
public class VerificationCodeFragmentV2 extends VerificationCodeFragment {
    @BindView(2131493562)
    TextTitleBar mTextTitleBar;

    /* renamed from: b */
    public final void mo44970b() {
        super.mo44970b();
        this.mTextTitleBar.setColorMode(0);
        if (this.f59933s == 5) {
            this.mTitleHint.setText(R.string.s3);
            if (!TextUtils.isEmpty(this.f59934t)) {
                this.mTxtHint.setText(getString(R.string.b3_, C21134a.m53620a(this.f59934t)));
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.az7, viewGroup, false);
    }

    /* renamed from: a */
    public static VerificationCodeFragmentV2 m53331a(int i, String str, String str2, String str3, String str4) {
        Bundle bundle = C47661ab.m103163a().mo94972a("password", str2).mo94972a("ticket", str3).f120139a;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putInt("type", i);
        bundle.putString("mobile", str);
        bundle.putString("enter_from", str4);
        VerificationCodeFragmentV2 verificationCodeFragmentV2 = new VerificationCodeFragmentV2();
        verificationCodeFragmentV2.setArguments(bundle);
        return verificationCodeFragmentV2;
    }
}
