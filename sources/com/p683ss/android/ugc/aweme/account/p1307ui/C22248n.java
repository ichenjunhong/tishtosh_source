package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.C13011d;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p846b.C13001b;
import com.bytedance.sdk.account.p844a.p848d.C13013b;
import com.bytedance.sdk.account.p859d.C13081d;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.util.C22281s;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.ui.n */
public final class C22248n extends BaseAccountFragment {

    /* renamed from: a */
    private C13011d f60019a;

    public final void onDestroyView() {
        super.onDestroyView();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final int mo46254w() {
        return 2;
    }

    /* renamed from: t */
    public final void mo46251t() {
        super.mo46251t();
        C23826bi.m58451a(8, 2, (Object) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final boolean mo46253v() {
        if (this.mPasswordEt == null || this.mPasswordEt.getText() == null || this.mPasswordEt.getText().length() < 8) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo44970b() {
        this.f60019a = C13081d.m26312a(getContext());
        this.mTitleHint.setText(R.string.f7f);
        this.mPasswordEt.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.mPasswordEt.setHint(R.string.f7h);
        this.mTxtHint.setText(R.string.cn9);
        this.mBtnLogin.setBackgroundResource(R.drawable.cdt);
        this.mTitleHint.setTextSize(26.0f);
        C26890h.m65005a((Context) getActivity(), "set_psd_in", "psd", C23826bi.m58463d(), 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo46252u() {
        if (this.mPasswordEt != null) {
            int length = this.mPasswordEt.getText().toString().trim().length();
            if (length < 8 || length > 20) {
                C10691a.m21542b((Context) getActivity(), (int) R.string.cn_).mo19066a();
                return;
            }
            final String trim = this.mPasswordEt.getText().toString().trim();
            this.f60019a.mo24609a(trim, (C13001b) new C13001b() {
                public final /* synthetic */ void onSuccess(C12990b bVar) {
                    String str;
                    C13013b bVar2 = (C13013b) bVar;
                    if (C22248n.this.isViewValid() && C22248n.this.getActivity() != null) {
                        User i = C23826bi.m58468i();
                        if (i != null) {
                            str = i.getBindPhone();
                        } else {
                            str = "";
                        }
                        ((BaseAccountActivity) C22248n.this.getActivity()).mo46248a(VerificationCodeFragment.m55047b(1, str, trim, "", ""));
                    }
                }

                public final /* synthetic */ void onError(C12990b bVar, int i) {
                    C13013b bVar2 = (C13013b) bVar;
                    if (C22248n.this.isViewValid() && !TextUtils.isEmpty(bVar2.f34001d)) {
                        C22281s.m55136a(C22248n.this.getContext(), bVar2.f34001d, bVar2.f34000c);
                    }
                }
            });
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }
}
