package com.p683ss.android.ugc.tools.utils;

import android.content.Context;
import android.content.res.Resources;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.tools.utils.h */
public final class C50204h {

    /* renamed from: a */
    public static final C50204h f125757a = new C50204h();

    private C50204h() {
    }

    /* renamed from: a */
    public static final float m108364a(Context context, float f) {
        C52711k.m112240b(context, "context");
        Resources resources = context.getResources();
        C52711k.m112236a((Object) resources, "context.resources");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }
}
