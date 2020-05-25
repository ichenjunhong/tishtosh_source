package com.facebook.drawee.p939e;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.e.d */
public final class C13801d {

    /* renamed from: a */
    public int f35967a = -1;

    /* renamed from: b */
    private boolean f35968b;

    /* renamed from: c */
    private ColorFilter f35969c;

    /* renamed from: d */
    private int f35970d = -1;

    /* renamed from: e */
    private int f35971e = -1;

    /* renamed from: a */
    public final void mo25809a(boolean z) {
        this.f35970d = z ? 1 : 0;
    }

    /* renamed from: b */
    public final void mo25810b(boolean z) {
        this.f35971e = z ? 1 : 0;
    }

    /* renamed from: a */
    public final void mo25807a(ColorFilter colorFilter) {
        this.f35969c = colorFilter;
        this.f35968b = true;
    }

    /* renamed from: a */
    public final void mo25808a(Drawable drawable) {
        boolean z;
        if (drawable != null) {
            if (this.f35967a != -1) {
                drawable.setAlpha(this.f35967a);
            }
            if (this.f35968b) {
                drawable.setColorFilter(this.f35969c);
            }
            boolean z2 = false;
            if (this.f35970d != -1) {
                if (this.f35970d != 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable.setDither(z);
            }
            if (this.f35971e != -1) {
                if (this.f35971e != 0) {
                    z2 = true;
                }
                drawable.setFilterBitmap(z2);
            }
        }
    }
}
