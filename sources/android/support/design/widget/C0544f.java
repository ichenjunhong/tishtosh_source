package android.support.design.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.view.View;

/* renamed from: android.support.design.widget.f */
final class C0544f extends GradientDrawable {

    /* renamed from: a */
    private final Paint f1946a = new Paint(1);

    /* renamed from: b */
    private final RectF f1947b;

    /* renamed from: c */
    private int f1948c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo1710a() {
        if (!this.f1947b.isEmpty()) {
            return true;
        }
        return false;
    }

    C0544f() {
        this.f1946a.setStyle(Style.FILL_AND_STROKE);
        this.f1946a.setColor(-1);
        this.f1946a.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        this.f1947b = new RectF();
    }

    /* renamed from: a */
    private static boolean m1481a(Callback callback) {
        return callback instanceof View;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1709a(RectF rectF) {
        mo1708a(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void draw(Canvas canvas) {
        Callback callback = getCallback();
        if (m1481a(callback)) {
            ((View) callback).setLayerType(2, null);
        } else if (VERSION.SDK_INT >= 21) {
            this.f1948c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
        } else {
            this.f1948c = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
        }
        super.draw(canvas);
        canvas.drawRect(this.f1947b, this.f1946a);
        if (!m1481a(getCallback())) {
            canvas.restoreToCount(this.f1948c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1708a(float f, float f2, float f3, float f4) {
        if (f != this.f1947b.left || f2 != this.f1947b.top || f3 != this.f1947b.right || f4 != this.f1947b.bottom) {
            this.f1947b.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
