package com.p683ss.android.ugc.tools.utils;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0200t;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.tools.utils.KeyboardUtils */
public final class KeyboardUtils {

    /* renamed from: a */
    public static List<ClearCursorDecorator> f125750a = new ArrayList(2);

    /* renamed from: b */
    public static List<AndroidBug5497Workaround> f125751b = new ArrayList(2);

    /* renamed from: com.ss.android.ugc.tools.utils.KeyboardUtils$AndroidBug5497Workaround */
    static class AndroidBug5497Workaround implements C0183j {

        /* renamed from: a */
        private OnGlobalLayoutListener f125752a;

        /* renamed from: b */
        private View f125753b;

        /* renamed from: c */
        private C50196a f125754c;

        @C0200t(mo345a = C0177a.ON_STOP)
        public void onStop() {
            Iterator it = KeyboardUtils.f125751b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AndroidBug5497Workaround androidBug5497Workaround = (AndroidBug5497Workaround) it.next();
                if (androidBug5497Workaround == this) {
                    KeyboardUtils.f125751b.remove(androidBug5497Workaround);
                    break;
                }
            }
            if (this.f125753b.getViewTreeObserver() != null && this.f125753b.getViewTreeObserver().isAlive()) {
                this.f125753b.getViewTreeObserver().removeOnGlobalLayoutListener(this.f125752a);
            }
            this.f125753b = null;
            this.f125752a = null;
            this.f125754c = null;
        }
    }

    /* renamed from: com.ss.android.ugc.tools.utils.KeyboardUtils$ClearCursorDecorator */
    public static class ClearCursorDecorator implements C0183j {

        /* renamed from: a */
        public EditText f125755a;

        @C0200t(mo345a = C0177a.ON_DESTROY)
        public void onDestroy() {
            this.f125755a = null;
            for (ClearCursorDecorator clearCursorDecorator : KeyboardUtils.f125750a) {
                if (clearCursorDecorator == this) {
                    KeyboardUtils.f125750a.remove(this);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tools.utils.KeyboardUtils$a */
    public interface C50196a {
    }

    /* renamed from: a */
    public static void m108324a(View view, Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    /* renamed from: b */
    public static void m108325b(View view, Context context) {
        if (view != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }
}
