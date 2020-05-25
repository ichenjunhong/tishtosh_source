package com.facebook.drawee.p939e;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* renamed from: com.facebook.drawee.e.e */
public final class C13802e {
    /* renamed from: a */
    public static int m27984a(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* renamed from: a */
    public static void m27986a(Drawable drawable, Drawable drawable2) {
        if (drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    /* renamed from: a */
    public static void m27987a(Drawable drawable, C13801d dVar) {
        if (drawable != null && dVar != null) {
            dVar.mo25808a(drawable);
        }
    }

    /* renamed from: a */
    public static void m27985a(Drawable drawable, Callback callback, C13830s sVar) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof C13829r) {
                ((C13829r) drawable).setTransformCallback(sVar);
            }
        }
    }
}
