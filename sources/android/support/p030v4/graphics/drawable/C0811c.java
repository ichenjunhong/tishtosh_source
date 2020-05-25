package android.support.p030v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

/* renamed from: android.support.v4.graphics.drawable.c */
final class C0811c extends C0810b {
    public final void getOutline(Outline outline) {
        mo2608a();
        outline.setRoundRect(this.f2755e, this.f2754d);
    }

    protected C0811c(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2610a(int i, int i2, int i3, Rect rect, Rect rect2) {
        Gravity.apply(i, i2, i3, rect, rect2, 0);
    }
}
