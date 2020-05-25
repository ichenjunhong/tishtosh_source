package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.app.Dialog;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.account.base.p1268a.C20917a;
import com.p683ss.android.ugc.aweme.utils.C47700ay;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.av */
public class C21226av extends C21307h {

    /* renamed from: G */
    private Dialog f57659G;

    /* renamed from: H */
    private Dialog f57660H;

    public void onDestroyView() {
        super.onDestroyView();
    }

    /* renamed from: i */
    public final void mo45372i() {
        if (this.f57659G == null) {
            this.f57659G = C20917a.m53263b(getActivity());
        }
        C47700ay.m103235a(this.f57659G);
    }

    /* renamed from: j */
    public final void mo45373j() {
        if (this.f57660H == null) {
            this.f57660H = C20917a.m53262a(getActivity());
        }
        C47700ay.m103235a(this.f57660H);
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        int currentPage = this.f57886o.getCurrentPage();
        if (currentPage == 0) {
            mo45453m();
            return;
        }
        if (currentPage == 1) {
            mo45452l();
        }
    }
}
