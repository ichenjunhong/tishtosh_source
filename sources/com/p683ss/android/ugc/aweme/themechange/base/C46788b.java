package com.p683ss.android.ugc.aweme.themechange.base;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.shortvideo.C42430at;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.themechange.base.b */
public final class C46788b {

    /* renamed from: a */
    static final int f118232a = Color.parseColor("#FFFFFFFF");

    /* renamed from: b */
    static final int f118233b = Color.parseColor("#26FFFFFF");

    /* renamed from: c */
    static final int f118234c = Color.parseColor("#26000000");

    /* renamed from: d */
    public static final C46788b f118235d = new C46788b();

    /* renamed from: e */
    private static final int f118236e = Color.parseColor("#FF161823");

    /* renamed from: f */
    private static final int f118237f = Color.parseColor("#FF0E0F1A");

    /* renamed from: g */
    private static final int f118238g = Color.parseColor("#FF161823");

    /* renamed from: h */
    private static final int f118239h = Color.parseColor("#D8000000");

    /* renamed from: i */
    private static final int f118240i = Color.parseColor("#80000000");

    /* renamed from: j */
    private static final int f118241j = Color.parseColor("#99000000");

    /* renamed from: k */
    private static final int f118242k = Color.parseColor("#99FFFFFF");

    /* renamed from: l */
    private static final int f118243l = Color.parseColor("#FFFFFFFF");

    /* renamed from: m */
    private static final int f118244m = Color.parseColor("#80FFFFFF");

    /* renamed from: n */
    private static final int f118245n = Color.parseColor("#D0FFFFFF");

    /* renamed from: o */
    private static final int f118246o = Color.parseColor("#80FFFFFF");

    /* renamed from: p */
    private static String f118247p;

    private C46788b() {
    }

    /* renamed from: a */
    public static int m101629a(int i) {
        return (i & 16777215) | DynamicTabYellowPointVersion.DEFAULT;
    }

    /* renamed from: a */
    public static int m101628a() {
        return Color.parseColor("#22FFFFFF");
    }

    /* renamed from: b */
    public static int m101634b() {
        return Color.parseColor("#52FFFFFF");
    }

    /* renamed from: a */
    public static int m101630a(boolean z) {
        return f118232a;
    }

    /* renamed from: b */
    public final int mo94011b(boolean z) {
        return (m101630a(z) & 16777215) | DynamicTabYellowPointVersion.DEFAULT;
    }

    /* renamed from: a */
    public static void m101633a(String str) {
        f118247p = str;
    }

    /* renamed from: a */
    public static Drawable m101632a(Drawable drawable, int i) {
        if (drawable == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        C52711k.m112236a((Object) mutate, "wrappedDrawable");
        mutate.setColorFilter(new PorterDuffColorFilter(i, Mode.SRC_IN));
        return mutate;
    }

    /* renamed from: a */
    public final Drawable mo94009a(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ce, R.attr.abh, R.attr.f5, R.attr.k9, R.attr.lt, R.attr.ml, R.attr.ow, R.attr.ox, R.attr.oy, R.attr.acm, R.attr.p2, R.attr.p3, R.attr.p4, R.attr.aco, R.attr.p5, R.attr.p6, R.attr.p7, R.attr.p8, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.pp, R.attr.q4, R.attr.sk, R.attr.t7, R.attr.uk, R.attr.up, R.attr.uy, R.attr.v3, R.attr.vl, R.attr.ad9, R.attr.a04, R.attr.a1b, R.attr.a1d, R.attr.a1x, R.attr.a1y, R.attr.a3t, R.attr.a6c, R.attr.adn, R.attr.a6k, R.attr.a6o, R.attr.a72, R.attr.a_4, R.attr.adp, R.attr.a__});
        boolean z = obtainStyledAttributes.getBoolean(8, false);
        int dimension = (int) obtainStyledAttributes.getDimension(31, 0.0f);
        boolean z2 = obtainStyledAttributes.getBoolean(27, false);
        boolean z3 = obtainStyledAttributes.getBoolean(5, false);
        boolean z4 = obtainStyledAttributes.getBoolean(32, false);
        boolean z5 = obtainStyledAttributes.getBoolean(3, false);
        boolean z6 = obtainStyledAttributes.getBoolean(36, false);
        boolean z7 = obtainStyledAttributes.getBoolean(44, false);
        int a = mo94007a(z3, z4, z5, z2, z6);
        if (z7) {
            a = m101630a(z2);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            a = obtainStyledAttributes.getColor(0, a);
        }
        obtainStyledAttributes.recycle();
        if (z) {
            return C42430at.m93195a(a, a, 0);
        }
        return C42430at.m93196a(a, a, 0, dimension);
    }

    /* renamed from: a */
    public final Drawable mo94010a(Drawable drawable, boolean z) {
        if (drawable == null) {
            return drawable;
        }
        Drawable mutate = drawable.mutate();
        C52711k.m112236a((Object) mutate, "wrappedDrawable");
        mutate.setColorFilter(new PorterDuffColorFilter(m101630a(z), Mode.SRC_IN));
        return mutate;
    }

    /* renamed from: a */
    public final Drawable mo94008a(Context context, int i, boolean z) {
        if (context != null && i > 0) {
            return mo94010a(context.getResources().getDrawable(i), z);
        }
        return null;
    }

    /* renamed from: a */
    private static int m101631a(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z4) {
            return f118233b;
        }
        if (z) {
            if (z2) {
                return f118238g;
            }
            return f118237f;
        } else if (z2) {
            if (z3) {
                return f118234c;
            }
            return f118240i;
        } else if (z3) {
            return f118241j;
        } else {
            return f118239h;
        }
    }

    /* renamed from: a */
    public final int mo94007a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return m101631a(z, z2, z3, z5);
    }
}
