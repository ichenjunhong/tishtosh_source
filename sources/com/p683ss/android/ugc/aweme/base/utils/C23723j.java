package com.p683ss.android.ugc.aweme.base.utils;

import android.content.Context;
import android.content.res.Resources;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.utils.j */
public final class C23723j {
    /* renamed from: b */
    private static Context m58218b() {
        return C11010c.m22280a();
    }

    /* renamed from: a */
    public static Resources m58217a() {
        return m58218b().getResources();
    }

    /* renamed from: a */
    public static int m58216a(int i) {
        return m58217a().getColor(i);
    }

    /* renamed from: b */
    public static String m58219b(int i) {
        return m58217a().getString(i);
    }

    /* renamed from: c */
    public static int m58220c(int i) {
        return m58217a().getDimensionPixelSize(R.dimen.x2);
    }
}
