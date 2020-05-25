package android.support.p043v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.b */
final class C1449b extends Drawable {

    /* renamed from: a */
    final ActionBarContainer f5229a;

    public final int getOpacity() {
        return 0;
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C1449b(ActionBarContainer actionBarContainer) {
        this.f5229a = actionBarContainer;
    }

    public final void draw(Canvas canvas) {
        if (!this.f5229a.f4326d) {
            if (this.f5229a.f4323a != null) {
                this.f5229a.f4323a.draw(canvas);
            }
            if (this.f5229a.f4324b != null && this.f5229a.f4327e) {
                this.f5229a.f4324b.draw(canvas);
            }
        } else if (this.f5229a.f4325c != null) {
            this.f5229a.f4325c.draw(canvas);
        }
    }

    public final void getOutline(Outline outline) {
        if (this.f5229a.f4326d) {
            if (this.f5229a.f4325c != null) {
                this.f5229a.f4325c.getOutline(outline);
            }
        } else if (this.f5229a.f4323a != null) {
            this.f5229a.f4323a.getOutline(outline);
        }
    }
}
