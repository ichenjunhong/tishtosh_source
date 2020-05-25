package android.support.p019b;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: android.support.b.ac */
final class C0242ac implements C0243ad {

    /* renamed from: a */
    private final ViewOverlay f596a;

    /* renamed from: a */
    public final void mo501a(Drawable drawable) {
        this.f596a.add(drawable);
    }

    /* renamed from: b */
    public final void mo502b(Drawable drawable) {
        this.f596a.remove(drawable);
    }

    C0242ac(View view) {
        this.f596a = view.getOverlay();
    }
}
