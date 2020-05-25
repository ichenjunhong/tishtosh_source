package com.p683ss.android.ugc.aweme.utils;

import android.os.Build.VERSION;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.utils.eo */
public final class C47857eo {
    /* renamed from: a */
    public static final void m103505a(TextView textView) {
        int i;
        if (textView != null && VERSION.SDK_INT >= 17) {
            boolean a = C47918gj.m103682a(textView.getContext());
            textView.setTextDirection(2);
            if (a) {
                i = 5;
            } else {
                i = 3;
            }
            textView.setGravity(i);
        }
    }
}
