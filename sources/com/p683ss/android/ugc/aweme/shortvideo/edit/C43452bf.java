package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.app.Activity;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.bf */
public final class C43452bf {
    /* renamed from: a */
    public static void m95244a(Activity activity) {
        if (activity != null && activity.getCurrentFocus() != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken(), 0);
            }
        }
    }
}
