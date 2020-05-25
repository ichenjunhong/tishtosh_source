package com.p888c.p889a.p890a.p891a.p897e;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

/* renamed from: com.c.a.a.a.e.f */
public final class C13427f {
    /* renamed from: a */
    public static float m27076a(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static String m27078c(View view) {
        if (VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            return visibility != 4 ? visibility != 8 ? "viewNotVisible" : "viewGone" : "viewInvisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m27077b(View view) {
        if ((VERSION.SDK_INT >= 19 && !view.isAttachedToWindow()) || !view.isShown()) {
            return false;
        }
        while (view != null) {
            if (view.getAlpha() == 0.0f) {
                return false;
            }
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return true;
    }
}
