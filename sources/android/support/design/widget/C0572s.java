package android.support.design.widget;

import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.design.internal.C0456f;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.design.widget.s */
final class C0572s {

    /* renamed from: a */
    private static final int[] f2069a = {16843848};

    /* renamed from: a */
    static void m1570a(View view, float f) {
        int integer = view.getResources().getInteger(R.integer.c);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = (long) integer;
        stateListAnimator.addState(new int[]{16842766, R.attr.a3f, -2131362948}, ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(j));
        stateListAnimator.addState(new int[]{16842766}, ObjectAnimator.ofFloat(view, "elevation", new float[]{f}).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", new float[]{0.0f}).setDuration(0));
        view.setStateListAnimator(stateListAnimator);
    }

    /* renamed from: a */
    public static void m1571a(View view, AttributeSet attributeSet, int i, int i2) {
        Context context = view.getContext();
        TypedArray a = C0456f.m1107a(context, attributeSet, f2069a, i, i2, new int[0]);
        try {
            if (a.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, a.getResourceId(0, 0)));
            }
        } finally {
            a.recycle();
        }
    }
}
