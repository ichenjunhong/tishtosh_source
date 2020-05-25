package android.support.design.p023b.p024a;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.design.p023b.C0403c;
import android.support.design.p023b.C0405d;
import android.support.design.p023b.C0405d.C0410d;
import android.support.p043v7.widget.CardView;

/* renamed from: android.support.design.b.a.a */
public class C0401a extends CardView implements C0405d {

    /* renamed from: e */
    private final C0403c f1290e;

    /* renamed from: a */
    public final void mo900a() {
        this.f1290e.mo915a();
    }

    /* renamed from: b */
    public final void mo902b() {
        this.f1290e.mo920b();
    }

    /* renamed from: c */
    public final boolean mo903c() {
        return super.isOpaque();
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return this.f1290e.f1293b;
    }

    public int getCircularRevealScrimColor() {
        return this.f1290e.mo922d();
    }

    public C0410d getRevealInfo() {
        return this.f1290e.mo921c();
    }

    public boolean isOpaque() {
        if (this.f1290e != null) {
            return this.f1290e.mo923e();
        }
        return super.isOpaque();
    }

    /* renamed from: a */
    public final void mo901a(Canvas canvas) {
        super.draw(canvas);
    }

    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.f1290e.mo918a(drawable);
    }

    public void setCircularRevealScrimColor(int i) {
        this.f1290e.mo916a(i);
    }

    public void setRevealInfo(C0410d dVar) {
        this.f1290e.mo919a(dVar);
    }

    public void draw(Canvas canvas) {
        if (this.f1290e != null) {
            this.f1290e.mo917a(canvas);
        } else {
            super.draw(canvas);
        }
    }
}
