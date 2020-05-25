package com.p683ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p017a.p018a.C0227i;
import android.support.p030v4.content.p035a.C0720f;
import android.support.p030v4.graphics.drawable.C0809a;
import android.widget.ImageView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dv */
public final class C43300dv {
    /* renamed from: a */
    private static Drawable m94959a(Context context, int i, int i2) {
        try {
            C0227i a = C0227i.m462a(context.getResources(), i, context.getTheme());
            if (a != null) {
                a.setTint(context.getResources().getColor(i2));
            }
            return a;
        } catch (Exception unused) {
            Drawable a2 = C0720f.m2075a(context.getResources(), i, context.getTheme());
            if (a2 != null) {
                C0809a.m2325a(a2, context.getResources().getColor(i2));
            }
            return a2;
        }
    }

    /* renamed from: a */
    public static void m94960a(Context context, ImageView imageView, int i, int i2) {
        Drawable a = m94959a(context, i, i2);
        if (a != null) {
            imageView.setImageDrawable(a);
        }
    }
}
