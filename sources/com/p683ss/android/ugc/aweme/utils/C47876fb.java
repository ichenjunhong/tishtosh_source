package com.p683ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.fb */
public final class C47876fb {

    /* renamed from: a */
    public static TypedValue f120467a = new TypedValue();

    /* renamed from: b */
    public static DisplayMetrics f120468b;

    /* renamed from: c */
    public static final C47877a f120469c = new C47877a(null);

    /* renamed from: com.ss.android.ugc.aweme.utils.fb$a */
    public static final class C47877a {
        private C47877a() {
        }

        public /* synthetic */ C47877a(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        private static void m103572a(Context context) {
            if (C47876fb.f120468b == null) {
                Resources resources = context.getResources();
                C52711k.m112236a((Object) resources, "context.resources");
                C47876fb.f120468b = resources.getDisplayMetrics();
            }
        }

        /* renamed from: a */
        private static float m103571a(int i, float f, DisplayMetrics displayMetrics) {
            switch (i) {
                case 0:
                    if (displayMetrics == null) {
                        C52711k.m112234a();
                    }
                    return f / displayMetrics.density;
                case 1:
                    return f;
                default:
                    return 0.0f;
            }
        }

        /* renamed from: a */
        public final float mo95090a(Context context, int i, float f) {
            if (context == null) {
                return f;
            }
            m103572a(context);
            float a = m103571a(i, f, C47876fb.f120468b);
            DisplayMetrics displayMetrics = C47876fb.f120468b;
            if (displayMetrics == null) {
                C52711k.m112234a();
            }
            float f2 = 3.0f;
            if (displayMetrics.density < 3.0f) {
                f2 = 2.0f;
            }
            return (a * f2) + 0.5f;
        }
    }

    /* renamed from: a */
    public static final float m103570a(Context context, int i, float f) {
        return f120469c.mo95090a(context, 1, f);
    }
}
