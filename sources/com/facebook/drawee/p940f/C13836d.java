package com.facebook.drawee.p940f;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.p939e.C13804g;
import com.facebook.drawee.p939e.C13831t;
import com.facebook.drawee.p939e.C13832u;

/* renamed from: com.facebook.drawee.f.d */
public final class C13836d extends C13804g implements C13831t {

    /* renamed from: a */
    Drawable f36106a;

    /* renamed from: b */
    private C13832u f36107b;

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public C13836d(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: a */
    public final void mo25885a(C13832u uVar) {
        this.f36107b = uVar;
    }

    public final void draw(Canvas canvas) {
        if (isVisible()) {
            if (this.f36107b != null) {
                this.f36107b.mo25886a();
            }
            super.draw(canvas);
            if (this.f36106a != null) {
                this.f36106a.setBounds(getBounds());
                this.f36106a.draw(canvas);
            }
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f36107b != null) {
            this.f36107b.mo25887a(z);
        }
        return super.setVisible(z, z2);
    }
}
