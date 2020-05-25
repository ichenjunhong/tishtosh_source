package com.p683ss.android.ugc.aweme.commercialize.utils;

import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p017a.p018a.C0227i;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.cf */
public final class C26502cf {
    /* renamed from: a */
    public static Drawable m64047a(Resources resources, int i) {
        return m64048a(resources, R.drawable.dxy, null);
    }

    /* renamed from: a */
    private static Drawable m64048a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT > 21) {
            return resources.getDrawable(i, null);
        }
        try {
            return C0227i.m462a(resources, i, (Theme) null);
        } catch (NotFoundException unused) {
            return null;
        }
    }
}
