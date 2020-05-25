package com.p683ss.android.ugc.aweme.common.p1596h;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.ss.android.ugc.aweme.common.h.c */
public final class C26894c {
    /* renamed from: a */
    public static int m65020a(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: a */
    public static void m65022a(View view) {
        if (view != null && VERSION.SDK_INT >= 19) {
            view.getLayoutParams().height = m65020a(view.getContext());
        }
    }

    /* renamed from: a */
    public static void m65021a(Activity activity, View view) {
        if (activity != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
