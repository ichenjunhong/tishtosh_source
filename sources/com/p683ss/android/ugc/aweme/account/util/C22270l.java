package com.p683ss.android.ugc.aweme.account.util;

import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.ss.android.ugc.aweme.account.util.l */
public final class C22270l {

    /* renamed from: a */
    public static final C22270l f60041a = new C22270l();

    private C22270l() {
    }

    /* renamed from: a */
    public static final void m55122a(View view, int i, int i2) {
        if (view != null) {
            LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i2;
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }
}
