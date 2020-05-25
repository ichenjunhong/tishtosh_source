package com.squareup.p1094a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.C2240a;
import com.squareup.p1094a.C18396v.C18402d;

/* renamed from: com.squareup.a.n */
final class C18386n extends C18341a<ImageView> {

    /* renamed from: m */
    C18371e f50766m;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo36783b() {
        super.mo36783b();
        if (this.f50766m != null) {
            this.f50766m = null;
        }
    }

    /* renamed from: a */
    public final void mo36781a() {
        ImageView imageView = (ImageView) this.f50651c.get();
        if (imageView != null) {
            if (this.f50655g != 0) {
                imageView.setImageResource(this.f50655g);
            } else if (this.f50656h != null) {
                imageView.setImageDrawable(this.f50656h);
            }
            if (this.f50766m != null) {
                this.f50766m.mo36820b();
            }
        }
    }

    /* renamed from: a */
    public final void mo36782a(Bitmap bitmap, C18402d dVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f50651c.get();
            if (imageView != null) {
                Bitmap bitmap2 = bitmap;
                C18402d dVar2 = dVar;
                C18406w.m44687a(imageView, this.f50649a.f50797d, bitmap2, dVar2, this.f50652d, this.f50649a.f50805l);
                if (this.f50766m != null) {
                    this.f50766m.mo36819a();
                }
                return;
            }
            return;
        }
        throw new AssertionError(C2240a.m6772a("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    C18386n(C18396v vVar, ImageView imageView, C18409y yVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, C18371e eVar, boolean z) {
        super(vVar, imageView, yVar, i, i2, i3, drawable, str, obj, z);
        this.f50766m = eVar;
    }
}
