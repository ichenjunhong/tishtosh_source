package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.os.Build.VERSION;
import android.view.View;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.aq */
public final class C35203aq {
    /* renamed from: a */
    public static void m79582a(View view) {
        m79583a(view, R.drawable.d5w, R.color.q7);
    }

    /* renamed from: a */
    public static void m79583a(View view, int i, int i2) {
        if (VERSION.SDK_INT < 21) {
            C35221bc.m79614a(view);
            view.setBackground(view.getResources().getDrawable(i2));
            return;
        }
        view.setBackground(view.getResources().getDrawable(i));
    }
}
