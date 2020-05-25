package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25719i;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import p2628d.C52857u;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.m */
public final class C26528m {

    /* renamed from: a */
    public static final C26528m f69860a = new C26528m();

    private C26528m() {
    }

    /* renamed from: a */
    public static final void m64180a(Context context) {
        m64182a(context, null, 2, null);
    }

    /* renamed from: b */
    private static InputMethodManager m64184b(Context context) throws Exception {
        Object systemService = context.getSystemService("input_method");
        if (systemService != null) {
            return (InputMethodManager) systemService;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    /* renamed from: a */
    public static final void m64181a(Context context, View view) {
        if (context != null && view != null) {
            try {
                view.requestFocus();
                m64184b(context).showSoftInput(view, 2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static final void m64185b(Context context, View view) {
        if (context != null && view != null) {
            try {
                m64184b(context).hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch (Exception unused) {
            }
            view.clearFocus();
        }
    }

    /* renamed from: a */
    public static final void m64183a(Context context, boolean z) {
        int i;
        C25719i iVar = new C25719i(z);
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            i = activity.hashCode();
        } else {
            i = 0;
        }
        iVar.f68030b = i;
        C47718bf.m103288a(iVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m64182a(Context context, View view, int i, Object obj) {
        Context context2;
        View view2 = null;
        if (!(context instanceof Activity)) {
            context2 = null;
        } else {
            context2 = context;
        }
        Activity activity = (Activity) context2;
        if (activity != null) {
            Window window = activity.getWindow();
            if (window != null) {
                View decorView = window.getDecorView();
                if (decorView != null) {
                    view2 = decorView.findFocus();
                }
            }
        }
        m64185b(context, view2);
    }
}
