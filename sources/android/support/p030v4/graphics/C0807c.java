package android.support.p030v4.graphics;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.p030v4.p038f.C0786h;

/* renamed from: android.support.v4.graphics.c */
public final class C0807c {

    /* renamed from: a */
    public static final C0824h f2735a;

    /* renamed from: b */
    public static final C0786h<String, Typeface> f2736b = new C0786h<>(16);

    static {
        boolean z;
        if (VERSION.SDK_INT >= 28) {
            f2735a = new C0823g();
        } else if (VERSION.SDK_INT >= 26) {
            f2735a = new C0822f();
        } else {
            if (VERSION.SDK_INT >= 24) {
                if (C0821e.f2776a != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    f2735a = new C0821e();
                }
            }
            if (VERSION.SDK_INT >= 21) {
                f2735a = new C0808d();
            } else {
                f2735a = new C0824h();
            }
        }
    }

    /* renamed from: a */
    public static String m2314a(Resources resources, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(i));
        sb.append("-");
        sb.append(i);
        sb.append("-");
        sb.append(i2);
        return sb.toString();
    }

    /* renamed from: a */
    public static Typeface m2313a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f2735a.mo2664a(context, resources, i, str, i2);
        if (a != null) {
            f2736b.mo2502a(m2314a(resources, i, i2), a);
        }
        return a;
    }
}
