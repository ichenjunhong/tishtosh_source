package com.bytedance.ies.dmt.p664ui.common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.ies.dmt.ui.common.c */
public final class C10678c {
    /* renamed from: a */
    public static int m21500a(Context context) {
        int i;
        if (C10675b.m21498b(context)) {
            i = R.color.dj;
        } else {
            i = R.color.ann;
        }
        return m21501a(context, i);
    }

    /* renamed from: b */
    public static int m21502b(Context context) {
        int i;
        if (C10675b.m21498b(context)) {
            i = R.color.aso;
        } else {
            i = R.color.kg;
        }
        return m21501a(context, i);
    }

    /* renamed from: c */
    public static int m21503c(Context context) {
        int i;
        if (C10675b.m21498b(context)) {
            i = R.color.aok;
        } else {
            i = R.color.as1;
        }
        return m21501a(context, i);
    }

    /* renamed from: d */
    public static int m21504d(Context context) {
        int i;
        if (C10675b.m21498b(context)) {
            i = R.color.aoj;
        } else {
            i = R.color.as2;
        }
        return m21501a(context, i);
    }

    /* renamed from: e */
    public static Drawable m21505e(Context context) {
        int i;
        Resources resources = context.getResources();
        if (C10675b.m21498b(context)) {
            i = R.drawable.c9v;
        } else {
            i = R.drawable.c9u;
        }
        return resources.getDrawable(i);
    }

    /* renamed from: a */
    private static int m21501a(Context context, int i) {
        return context.getResources().getColor(i);
    }
}
