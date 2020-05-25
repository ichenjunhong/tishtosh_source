package android.support.p043v7.widget;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: android.support.v7.widget.bd */
public final class C1455bd {
    /* renamed from: a */
    public static void m5087a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C1456be.m5089a(view, charSequence);
        }
    }
}
