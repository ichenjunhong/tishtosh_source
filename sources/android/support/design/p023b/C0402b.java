package android.support.design.p023b;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.design.p023b.C0405d.C0410d;
import android.widget.FrameLayout;

/* renamed from: android.support.design.b.b */
public class C0402b extends FrameLayout implements C0405d {

    /* renamed from: a */
    private final C0403c f1291a;

    /* renamed from: a */
    public final void mo900a() {
        this.f1291a.mo915a();
    }

    /* renamed from: b */
    public final void mo902b() {
        this.f1291a.mo920b();
    }

    /* renamed from: c */
    public final boolean mo903c() {
        return super.isOpaque();
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f1291a.f1293b;
    }

    public int getCircularRevealScrimColor() {
        return this.f1291a.mo922d();
    }

    public C0410d getRevealInfo() {
        return this.f1291a.mo921c();
    }

    public boolean isOpaque() {
        if (this.f1291a != null) {
            return this.f1291a.mo923e();
        }
        return super.isOpaque();
    }

    /* renamed from: a */
    public final void mo901a(Canvas canvas) {
        super.draw(canvas);
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f1291a.mo918a(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f1291a.mo916a(i);
    }

    public void setRevealInfo(C0410d dVar) {
        this.f1291a.mo919a(dVar);
    }

    public void draw(Canvas canvas) {
        if (this.f1291a != null) {
            this.f1291a.mo917a(canvas);
        } else {
            super.draw(canvas);
        }
    }
}
