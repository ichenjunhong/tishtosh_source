package android.support.p019b;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p030v4.view.C1056u;
import android.util.Property;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: android.support.b.ae */
final class C0244ae {

    /* renamed from: a */
    static final C0250ai f597a;

    /* renamed from: b */
    static final Property<View, Float> f598b = new Property<View, Float>(Float.class, "translationAlpha") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf(C0244ae.m503c((View) obj));
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C0244ae.m499a((View) obj, ((Float) obj2).floatValue());
        }
    };

    /* renamed from: c */
    static final Property<View, Rect> f599c = new Property<View, Rect>(Rect.class, "clipBounds") {
        public final /* synthetic */ Object get(Object obj) {
            return C1056u.m3017A((View) obj);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            C1056u.m3029a((View) obj, (Rect) obj2);
        }
    };

    /* renamed from: d */
    private static Field f600d;

    /* renamed from: e */
    private static boolean f601e;

    static {
        if (VERSION.SDK_INT >= 22) {
            f597a = new C0249ah();
        } else if (VERSION.SDK_INT >= 21) {
            f597a = new C0248ag();
        } else if (VERSION.SDK_INT >= 19) {
            f597a = new C0247af();
        } else {
            f597a = new C0250ai();
        }
    }

    /* renamed from: c */
    static float m503c(View view) {
        return f597a.mo515a(view);
    }

    /* renamed from: a */
    static C0243ad m498a(View view) {
        if (VERSION.SDK_INT >= 18) {
            return new C0242ac(view);
        }
        return C0240ab.m489c(view);
    }

    /* renamed from: b */
    static C0258an m502b(View view) {
        if (VERSION.SDK_INT >= 18) {
            return new C0257am(view);
        }
        return new C0256al(view.getWindowToken());
    }

    /* renamed from: a */
    static void m499a(View view, float f) {
        f597a.mo516a(view, f);
    }

    /* renamed from: a */
    static void m500a(View view, int i) {
        if (!f601e) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f600d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f601e = true;
        }
        if (f600d != null) {
            try {
                f600d.setInt(view, i | (f600d.getInt(view) & -13));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: a */
    static void m501a(View view, int i, int i2, int i3, int i4) {
        f597a.mo521a(view, i, i2, i3, i4);
    }
}
