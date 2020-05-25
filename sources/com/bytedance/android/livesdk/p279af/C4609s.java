package com.bytedance.android.livesdk.p279af;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: com.bytedance.android.livesdk.af.s */
public final class C4609s {
    /* renamed from: a */
    public static void m11067a(Context context, EditText editText) {
        ((InputMethodManager) context.getSystemService("input_method")).showSoftInput(editText, 1);
    }

    /* renamed from: b */
    public static void m11068b(Context context, EditText editText) {
        if (context != null) {
            ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
        }
    }
}
