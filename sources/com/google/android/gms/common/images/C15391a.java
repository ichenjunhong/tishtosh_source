package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.p1042c.C16477d;

/* renamed from: com.google.android.gms.common.images.a */
public abstract class C15391a {

    /* renamed from: a */
    final C15392b f39716a;

    /* renamed from: b */
    protected int f39717b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo28342a(Drawable drawable, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28340a(Context context, Bitmap bitmap, boolean z) {
        if (bitmap != null) {
            mo28342a(new BitmapDrawable(context.getResources(), bitmap), false, false, true);
            return;
        }
        throw new IllegalArgumentException("null reference");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28341a(Context context, C16477d dVar, boolean z) {
        Drawable drawable;
        if (this.f39717b != 0) {
            drawable = context.getResources().getDrawable(this.f39717b);
        } else {
            drawable = null;
        }
        mo28342a(drawable, false, false, false);
    }
}
