package android.support.p030v4.view.p042b;

import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: android.support.v4.view.b.f */
public final class C1027f {
    /* renamed from: a */
    public static Interpolator m2954a(float f, float f2, float f3, float f4) {
        if (VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new C1026e(f, f2, f3, f4);
    }
}
