package android.support.design.p022a;

import android.animation.TimeInterpolator;
import android.support.p030v4.view.p042b.C1022a;
import android.support.p030v4.view.p042b.C1023b;
import android.support.p030v4.view.p042b.C1024c;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: android.support.design.a.a */
public final class C0389a {

    /* renamed from: a */
    public static final TimeInterpolator f1267a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f1268b = new C1023b();

    /* renamed from: c */
    public static final TimeInterpolator f1269c = new C1022a();

    /* renamed from: d */
    public static final TimeInterpolator f1270d = new C1024c();

    /* renamed from: e */
    public static final TimeInterpolator f1271e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m963a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: a */
    public static int m964a(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
