package android.support.design.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.p019b.C0296m;
import android.support.p019b.C0312s;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* renamed from: android.support.design.internal.e */
public final class C0454e extends C0296m {
    /* renamed from: a */
    public final void mo524a(C0312s sVar) {
        m1103d(sVar);
    }

    /* renamed from: b */
    public final void mo528b(C0312s sVar) {
        m1103d(sVar);
    }

    /* renamed from: d */
    private static void m1103d(C0312s sVar) {
        if (sVar.f771b instanceof TextView) {
            sVar.f770a.put("android:textscale:scale", Float.valueOf(((TextView) sVar.f771b).getScaleX()));
        }
    }

    /* renamed from: a */
    public final Animator mo522a(ViewGroup viewGroup, C0312s sVar, C0312s sVar2) {
        float f;
        if (sVar == null || sVar2 == null || !(sVar.f771b instanceof TextView) || !(sVar2.f771b instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) sVar2.f771b;
        Map<String, Object> map = sVar.f770a;
        Map<String, Object> map2 = sVar2.f770a;
        float f2 = 1.0f;
        if (map.get("android:textscale:scale") != null) {
            f = ((Float) map.get("android:textscale:scale")).floatValue();
        } else {
            f = 1.0f;
        }
        if (map2.get("android:textscale:scale") != null) {
            f2 = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (f == f2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue);
                textView.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }
}
