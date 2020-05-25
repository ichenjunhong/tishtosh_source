package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.bm */
final /* synthetic */ class C21283bm implements OnFocusChangeListener {

    /* renamed from: a */
    private final C21271bi f57799a;

    C21283bm(C21271bi biVar) {
        this.f57799a = biVar;
    }

    public final void onFocusChange(View view, boolean z) {
        C21271bi biVar = this.f57799a;
        biVar.f57779t.setVisibility((!z || TextUtils.isEmpty(biVar.f57778s.getText())) ? 8 : 0);
    }
}
