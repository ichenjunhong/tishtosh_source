package com.p683ss.android.ugc.asve.p1241e;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.asve.e.j */
public final class C20399j {

    /* renamed from: a */
    public static final C20399j f55929a = new C20399j();

    private C20399j() {
    }

    /* renamed from: b */
    public static final int m50608b(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        C52711k.m112236a((Object) resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.heightPixels;
        }
        return 0;
    }

    /* renamed from: a */
    public static final int m50607a(Context context) {
        if (context == null) {
            return 0;
        }
        Resources resources = context.getResources();
        C52711k.m112236a((Object) resources, "context.resources");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (displayMetrics != null) {
            return displayMetrics.widthPixels;
        }
        return 0;
    }

    /* renamed from: a */
    public static final float m50606a(Context context, float f) {
        C52711k.m112240b(context, "context");
        Resources resources = context.getResources();
        C52711k.m112236a((Object) resources, "context.resources");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }
}
