package com.p683ss.android.ugc.aweme.base.utils;

import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0183j;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0200t;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.ies.ugc.p694a.C11010c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.utils.KeyboardUtils */
public final class KeyboardUtils {

    /* renamed from: a */
    public static List<ClearCursorDecorator> f63228a = new ArrayList(2);

    /* renamed from: b */
    public static List<AndroidBug5497Workaround> f63229b = new ArrayList(2);

    /* renamed from: c */
    private static final int f63230c = C23728o.m58241a(73.0d);

    /* renamed from: com.ss.android.ugc.aweme.base.utils.KeyboardUtils$AndroidBug5497Workaround */
    static class AndroidBug5497Workaround implements C0183j {

        /* renamed from: a */
        View f63231a;

        /* renamed from: b */
        C23709a f63232b;

        /* renamed from: c */
        private OnGlobalLayoutListener f63233c;

        @C0200t(mo345a = C0177a.ON_STOP)
        public void onStop() {
            Iterator it = KeyboardUtils.f63229b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AndroidBug5497Workaround androidBug5497Workaround = (AndroidBug5497Workaround) it.next();
                if (androidBug5497Workaround == this) {
                    KeyboardUtils.f63229b.remove(androidBug5497Workaround);
                    break;
                }
            }
            if (!(this.f63231a == null || this.f63231a.getViewTreeObserver() == null || !this.f63231a.getViewTreeObserver().isAlive())) {
                this.f63231a.getViewTreeObserver().removeOnGlobalLayoutListener(this.f63233c);
            }
            this.f63231a = null;
            this.f63233c = null;
            this.f63232b = null;
        }

        private AndroidBug5497Workaround(C0184k kVar, View view, C23709a aVar) {
            kVar.getLifecycle().mo324a(this);
            this.f63232b = aVar;
            this.f63233c = new C23714c(this);
            this.f63231a = view.getRootView();
            this.f63231a.getViewTreeObserver().addOnGlobalLayoutListener(this.f63233c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.utils.KeyboardUtils$ClearCursorDecorator */
    public static class ClearCursorDecorator implements C0183j {

        /* renamed from: a */
        public EditText f63234a;

        @C0200t(mo345a = C0177a.ON_DESTROY)
        public void onDestroy() {
            this.f63234a = null;
            for (ClearCursorDecorator clearCursorDecorator : KeyboardUtils.f63228a) {
                if (clearCursorDecorator == this) {
                    KeyboardUtils.f63228a.remove(this);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.utils.KeyboardUtils$a */
    public interface C23709a {
        /* renamed from: a */
        void mo49145a();

        /* renamed from: b */
        void mo49146b();
    }

    /* renamed from: a */
    public static void m58182a(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) C11010c.m22280a().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 2);
        }
    }

    /* renamed from: b */
    public static void m58183b(View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) C11010c.m22280a().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(view, 1);
        }
    }

    /* renamed from: c */
    public static void m58184c(View view) {
        if (view != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) C11010c.m22280a().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        }
    }

    /* renamed from: a */
    public static void m58181a(C0184k kVar, View view, C23709a aVar) {
        f63229b.add(new AndroidBug5497Workaround(kVar, view, aVar));
    }
}
