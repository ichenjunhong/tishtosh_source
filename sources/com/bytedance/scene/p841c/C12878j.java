package com.bytedance.scene.p841c;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: com.bytedance.scene.c.j */
public final class C12878j {
    /* renamed from: a */
    public static boolean m25798a(View view) {
        if (view == null || !((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0)) {
            return false;
        }
        return true;
    }
}
