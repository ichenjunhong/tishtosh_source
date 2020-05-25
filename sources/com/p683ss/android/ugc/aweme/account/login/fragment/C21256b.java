package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.b */
final /* synthetic */ class C21256b implements OnClickListener {

    /* renamed from: a */
    private final View f57726a;

    C21256b(View view) {
        this.f57726a = view;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        KeyboardUtils.m58184c(this.f57726a);
    }
}
