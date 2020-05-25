package com.p683ss.android.ugc.aweme.account.fragment;

import android.view.View;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.p683ss.android.ugc.aweme.account.p1307ui.VerificationCodeFragment_ViewBinding;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.fragment.VerificationCodeFragmentV2_ViewBinding */
public class VerificationCodeFragmentV2_ViewBinding extends VerificationCodeFragment_ViewBinding {

    /* renamed from: a */
    private VerificationCodeFragmentV2 f57081a;

    public void unbind() {
        VerificationCodeFragmentV2 verificationCodeFragmentV2 = this.f57081a;
        if (verificationCodeFragmentV2 != null) {
            this.f57081a = null;
            verificationCodeFragmentV2.mTextTitleBar = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VerificationCodeFragmentV2_ViewBinding(VerificationCodeFragmentV2 verificationCodeFragmentV2, View view) {
        super(verificationCodeFragmentV2, view);
        this.f57081a = verificationCodeFragmentV2;
        verificationCodeFragmentV2.mTextTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, R.id.d10, "field 'mTextTitleBar'", TextTitleBar.class);
    }
}
