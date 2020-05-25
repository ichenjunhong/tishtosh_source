package com.p683ss.android.ugc.aweme.p1308ad.utils;

import android.os.Build.VERSION;
import android.widget.TextView;

/* renamed from: com.ss.android.ugc.aweme.ad.utils.i */
public final class C22442i {
    /* renamed from: a */
    public static final void m55472a(TextView textView) {
        int i;
        if (textView != null && VERSION.SDK_INT >= 17) {
            boolean a = C22443j.m55473a(textView.getContext());
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
