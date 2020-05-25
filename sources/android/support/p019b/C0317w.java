package android.support.p019b;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: android.support.b.w */
final class C0317w implements C0318x {

    /* renamed from: a */
    private final ViewGroupOverlay f786a;

    /* renamed from: a */
    public final void mo501a(Drawable drawable) {
        this.f786a.add(drawable);
    }

    /* renamed from: b */
    public final void mo502b(Drawable drawable) {
        this.f786a.remove(drawable);
    }

    C0317w(ViewGroup viewGroup) {
        this.f786a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public final void mo634a(View view) {
        this.f786a.add(view);
    }

    /* renamed from: b */
    public final void mo635b(View view) {
        this.f786a.remove(view);
    }
}
