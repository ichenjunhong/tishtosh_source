package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bg */
final /* synthetic */ class C21269bg implements OnFocusChangeListener {

    /* renamed from: a */
    private final C21259bc f57752a;

    C21269bg(C21259bc bcVar) {
        this.f57752a = bcVar;
    }

    public final void onFocusChange(View view, boolean z) {
        C21259bc bcVar = this.f57752a;
        bcVar.f57731p.setVisibility((!z || TextUtils.isEmpty(bcVar.f57730o.getText())) ? 8 : 0);
    }
}
