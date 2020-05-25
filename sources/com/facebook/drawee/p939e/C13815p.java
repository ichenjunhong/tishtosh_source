package com.facebook.drawee.p939e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.p920d.C13685h;
import com.facebook.common.p920d.C13689i;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p939e.C13816q.C13828l;

/* renamed from: com.facebook.drawee.e.p */
public final class C13815p extends C13804g {

    /* renamed from: a */
    public C13818b f36054a;

    /* renamed from: b */
    Object f36055b;

    /* renamed from: c */
    public PointF f36056c = null;

    /* renamed from: d */
    int f36057d = 0;

    /* renamed from: e */
    int f36058e = 0;

    /* renamed from: f */
    Matrix f36059f;

    /* renamed from: g */
    private Matrix f36060g = new Matrix();

    /* renamed from: a */
    private void m28030a() {
        boolean z;
        boolean z2 = true;
        if (this.f36054a instanceof C13828l) {
            Object a = ((C13828l) this.f36054a).mo25884a();
            if (a == null || !a.equals(this.f36055b)) {
                z = true;
            } else {
                z = false;
            }
            this.f36055b = a;
        } else {
            z = false;
        }
        if (this.f36057d == getCurrent().getIntrinsicWidth() && this.f36058e == getCurrent().getIntrinsicHeight()) {
            z2 = false;
        }
        if (z2 || z) {
            m28031b();
        }
    }

    /* renamed from: b */
    private void m28031b() {
        float f;
        float f2;
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f36057d = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f36058e = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f36059f = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f36059f = null;
        } else if (this.f36054a == C13818b.f36061a) {
            current.setBounds(bounds);
            this.f36059f = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            C13818b bVar = this.f36054a;
            Matrix matrix = this.f36060g;
            if (this.f36056c != null) {
                f = this.f36056c.x;
            } else {
                f = 0.5f;
            }
            if (this.f36056c != null) {
                f2 = this.f36056c.y;
            } else {
                f2 = 0.5f;
            }
            bVar.mo25873a(matrix, bounds, intrinsicWidth, intrinsicHeight, f, f2);
            this.f36059f = this.f36060g;
        }
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        m28031b();
    }

    public final Drawable setCurrent(Drawable drawable) {
        Drawable current = super.setCurrent(drawable);
        m28031b();
        return current;
    }

    public final void getTransform(Matrix matrix) {
        getParentTransform(matrix);
        m28030a();
        if (this.f36059f != null) {
            matrix.preConcat(this.f36059f);
        }
    }

    /* renamed from: a */
    public final void mo25871a(PointF pointF) {
        if (!C13685h.m27645a(this.f36056c, pointF)) {
            if (this.f36056c == null) {
                this.f36056c = new PointF();
            }
            this.f36056c.set(pointF);
            m28031b();
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo25872a(C13818b bVar) {
        if (!C13685h.m27645a(this.f36054a, bVar)) {
            this.f36054a = bVar;
            this.f36055b = null;
            m28031b();
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        m28030a();
        if (this.f36059f != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f36059f);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    public C13815p(Drawable drawable, C13818b bVar) {
        super((Drawable) C13689i.m27652a(drawable));
        this.f36054a = bVar;
    }
}
