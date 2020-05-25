package com.p683ss.android.ugc.gamora.editor;

import android.view.View;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.editor.as */
public final class C49142as {
    /* renamed from: a */
    public static final void m106091a(View view, float f, long j) {
        C52711k.m112240b(view, "layout");
        view.animate().translationY(f).setDuration(j).start();
    }

    /* renamed from: a */
    public static final void m106090a(View view, float f, float f2, float f3) {
        C52711k.m112240b(view, "layout");
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        view.setScaleX(f);
        view.setScaleY(f);
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }
}
