package com.bytedance.p702im.sugar.input;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.bytedance.im.sugar.input.d */
public final class C11509d {
    /* renamed from: a */
    public static void m23576a(Activity activity, View view) {
        if (activity != null && view != null) {
            ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
