package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.VerificationCodeFragment_ViewBinding */
public class VerificationCodeFragment_ViewBinding extends BaseAccountFragment_ViewBinding {

    /* renamed from: a */
    private VerificationCodeFragment f59964a;

    /* renamed from: b */
    private View f59965b;

    public void unbind() {
        if (this.f59964a != null) {
            this.f59964a = null;
            this.f59965b.setOnClickListener(null);
            this.f59965b = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public VerificationCodeFragment_ViewBinding(final VerificationCodeFragment verificationCodeFragment, View view) {
        super(verificationCodeFragment, view);
        this.f59964a = verificationCodeFragment;
        View findRequiredView = Utils.findRequiredView(view, R.id.dky, "method 'reSendCode'");
        this.f59965b = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {
            public final void doClick(View view) {
                verificationCodeFragment.reSendCode();
            }
        });
    }
}
