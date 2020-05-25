package com.squareup.p1094a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.C2240a;
import com.squareup.p1094a.C18396v.C18402d;

/* renamed from: com.squareup.a.af */
public final class C18351af extends C18341a<C18350ae> {
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36781a() {
        if (((C18350ae) mo36784c()) != null && this.f50655g != 0) {
            this.f50649a.f50797d.getResources().getDrawable(this.f50655g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo36782a(Bitmap bitmap, C18402d dVar) {
        if (bitmap != null) {
            C18350ae aeVar = (C18350ae) mo36784c();
            if (aeVar != null) {
                aeVar.mo36796a(bitmap, dVar);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError(C2240a.m6772a("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    public C18351af(C18396v vVar, C18350ae aeVar, C18409y yVar, int i, int i2, Drawable drawable, String str, Object obj, int i3) {
        super(vVar, aeVar, yVar, i, i2, i3, drawable, str, obj, false);
    }
}
