package android.support.p043v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.ap */
final class C1431ap extends Drawable {

    /* renamed from: a */
    public float f5129a;

    /* renamed from: b */
    public float f5130b;

    /* renamed from: c */
    public ColorStateList f5131c;

    /* renamed from: d */
    private final Paint f5132d;

    /* renamed from: e */
    private final RectF f5133e;

    /* renamed from: f */
    private final Rect f5134f;

    /* renamed from: g */
    private boolean f5135g;

    /* renamed from: h */
    private boolean f5136h = true;

    /* renamed from: i */
    private PorterDuffColorFilter f5137i;

    /* renamed from: j */
    private ColorStateList f5138j;

    /* renamed from: k */
    private Mode f5139k = Mode.SRC_IN;

    public final int getOpacity() {
        return -3;
    }

    public final boolean isStateful() {
        if ((this.f5138j == null || !this.f5138j.isStateful()) && ((this.f5131c == null || !this.f5131c.isStateful()) && !super.isStateful())) {
            return false;
        }
        return true;
    }

    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f5134f, this.f5129a);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        mo5578a(rect);
    }

    public final void setAlpha(int i) {
        this.f5132d.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f5132d.setColorFilter(colorFilter);
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f5138j = colorStateList;
        this.f5137i = m4962a(this.f5138j, this.f5139k);
        invalidateSelf();
    }

    public final void setTintMode(Mode mode) {
        this.f5139k = mode;
        this.f5137i = m4962a(this.f5138j, this.f5139k);
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f5132d;
        if (this.f5137i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f5137i);
            z = true;
        }
        canvas.drawRoundRect(this.f5133e, this.f5129a, this.f5129a, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        int colorForState = this.f5131c.getColorForState(iArr, this.f5131c.getDefaultColor());
        if (colorForState != this.f5132d.getColor()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f5132d.setColor(colorForState);
        }
        if (this.f5138j == null || this.f5139k == null) {
            return z;
        }
        this.f5137i = m4962a(this.f5138j, this.f5139k);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5577a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f5131c = colorStateList;
        this.f5132d.setColor(this.f5131c.getColorForState(getState(), this.f5131c.getDefaultColor()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5578a(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f5133e.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f5134f.set(rect);
        if (this.f5135g) {
            float a = C1432aq.m4966a(this.f5130b, this.f5129a, this.f5136h);
            this.f5134f.inset((int) Math.ceil((double) C1432aq.m4968b(this.f5130b, this.f5129a, this.f5136h)), (int) Math.ceil((double) a));
            this.f5133e.set(this.f5134f);
        }
    }

    /* renamed from: a */
    private PorterDuffColorFilter m4962a(ColorStateList colorStateList, Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    C1431ap(ColorStateList colorStateList, float f) {
        this.f5129a = f;
        this.f5132d = new Paint(5);
        mo5577a(colorStateList);
        this.f5133e = new RectF();
        this.f5134f = new Rect();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo5576a(float f, boolean z, boolean z2) {
        if (f != this.f5130b || this.f5135g != z || this.f5136h != z2) {
            this.f5130b = f;
            this.f5135g = z;
            this.f5136h = z2;
            mo5578a((Rect) null);
            invalidateSelf();
        }
    }
}
