package com.p683ss.android.ugc.aweme.p2108r.p2110b;

import android.os.Build.VERSION;
import android.view.View;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.r.b.b */
public final class C41052b {
    /* renamed from: a */
    public static void m90722a(View view) {
        m90723a(view, R.drawable.cjg, R.color.a2j);
    }

    /* renamed from: a */
    public static void m90723a(View view, int i, int i2) {
        if (VERSION.SDK_INT < 21) {
            C38446k.m85764a(view);
            view.setBackgroundColor(view.getResources().getColor(i2));
            return;
        }
        view.setBackground(view.getResources().getDrawable(i));
    }
}
