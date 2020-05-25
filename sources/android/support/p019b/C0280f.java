package android.support.p019b;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: android.support.b.f */
final class C0280f {
    /* renamed from: a */
    static <T> ObjectAnimator m578a(T t, Property<T, PointF> property, Path path) {
        if (VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(t, property, null, path);
        }
        return ObjectAnimator.ofFloat(t, new C0282h(property, path), new float[]{0.0f, 1.0f});
    }
}
