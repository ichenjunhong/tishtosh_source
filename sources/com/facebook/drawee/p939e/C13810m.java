package com.facebook.drawee.p939e;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.p920d.C13689i;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.e.m */
public final class C13810m extends C13804g implements C13807j {

    /* renamed from: a */
    C13812a f36008a = C13812a.OVERLAY_COLOR;

    /* renamed from: b */
    final float[] f36009b = new float[8];

    /* renamed from: c */
    final Paint f36010c = new Paint(1);

    /* renamed from: d */
    public int f36011d = 0;

    /* renamed from: e */
    private final RectF f36012e = new RectF();

    /* renamed from: f */
    private RectF f36013f;

    /* renamed from: g */
    private Matrix f36014g;

    /* renamed from: h */
    private final float[] f36015h = new float[8];

    /* renamed from: i */
    private boolean f36016i = false;

    /* renamed from: j */
    private float f36017j = 0.0f;

    /* renamed from: k */
    private int f36018k = 0;

    /* renamed from: l */
    private float f36019l = 0.0f;

    /* renamed from: m */
    private boolean f36020m = false;

    /* renamed from: n */
    private final Path f36021n = new Path();

    /* renamed from: o */
    private final Path f36022o = new Path();

    /* renamed from: p */
    private final RectF f36023p = new RectF();

    /* renamed from: com.facebook.drawee.e.m$a */
    public enum C13812a {
        OVERLAY_COLOR,
        CLIPPING
    }

    /* renamed from: a */
    private void m28013a() {
        this.f36021n.reset();
        this.f36022o.reset();
        this.f36023p.set(getBounds());
        this.f36023p.inset(this.f36019l, this.f36019l);
        this.f36021n.addRect(this.f36023p, Direction.CW);
        if (this.f36016i) {
            this.f36021n.addCircle(this.f36023p.centerX(), this.f36023p.centerY(), Math.min(this.f36023p.width(), this.f36023p.height()) / 2.0f, Direction.CW);
        } else {
            this.f36021n.addRoundRect(this.f36023p, this.f36015h, Direction.CW);
        }
        this.f36023p.inset(-this.f36019l, -this.f36019l);
        this.f36023p.inset(this.f36017j / 2.0f, this.f36017j / 2.0f);
        if (this.f36016i) {
            this.f36022o.addCircle(this.f36023p.centerX(), this.f36023p.centerY(), Math.min(this.f36023p.width(), this.f36023p.height()) / 2.0f, Direction.CW);
        } else {
            for (int i = 0; i < this.f36009b.length; i++) {
                this.f36009b[i] = (this.f36015h[i] + this.f36019l) - (this.f36017j / 2.0f);
            }
            this.f36022o.addRoundRect(this.f36023p, this.f36009b, Direction.CW);
        }
        this.f36023p.inset((-this.f36017j) / 2.0f, (-this.f36017j) / 2.0f);
    }

    /* renamed from: a */
    public final void mo25862a(int i) {
        this.f36011d = i;
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m28013a();
    }

    /* renamed from: a */
    public final void mo25844a(float f) {
        Arrays.fill(this.f36015h, 0.0f);
        m28013a();
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo25848b(float f) {
        this.f36019l = f;
        m28013a();
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo25849b(boolean z) {
        this.f36020m = z;
        m28013a();
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo25846a(boolean z) {
        this.f36016i = z;
        m28013a();
        invalidateSelf();
    }

    public C13810m(Drawable drawable) {
        super((Drawable) C13689i.m27652a(drawable));
    }

    /* renamed from: a */
    public final void mo25847a(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.f36015h, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C13689i.m27656a(z, (Object) "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f36015h, 0, 8);
        }
        m28013a();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.f36012e.set(getBounds());
        switch (this.f36008a) {
            case CLIPPING:
                int save = canvas.save();
                this.f36021n.setFillType(FillType.EVEN_ODD);
                canvas.clipPath(this.f36021n);
                super.draw(canvas);
                canvas.restoreToCount(save);
                break;
            case OVERLAY_COLOR:
                if (this.f36020m) {
                    if (this.f36013f == null) {
                        this.f36013f = new RectF(this.f36012e);
                        this.f36014g = new Matrix();
                    } else {
                        this.f36013f.set(this.f36012e);
                    }
                    this.f36013f.inset(this.f36017j, this.f36017j);
                    this.f36014g.setRectToRect(this.f36012e, this.f36013f, ScaleToFit.FILL);
                    int save2 = canvas.save();
                    canvas.clipRect(this.f36012e);
                    canvas.concat(this.f36014g);
                    super.draw(canvas);
                    canvas.restoreToCount(save2);
                } else {
                    super.draw(canvas);
                }
                this.f36010c.setStyle(Style.FILL);
                this.f36010c.setColor(this.f36011d);
                this.f36010c.setStrokeWidth(0.0f);
                this.f36021n.setFillType(FillType.EVEN_ODD);
                canvas.drawPath(this.f36021n, this.f36010c);
                if (this.f36016i) {
                    float width = ((this.f36012e.width() - this.f36012e.height()) + this.f36017j) / 2.0f;
                    float height = ((this.f36012e.height() - this.f36012e.width()) + this.f36017j) / 2.0f;
                    if (width > 0.0f) {
                        Canvas canvas2 = canvas;
                        canvas2.drawRect(this.f36012e.left, this.f36012e.top, this.f36012e.left + width, this.f36012e.bottom, this.f36010c);
                        canvas2.drawRect(this.f36012e.right - width, this.f36012e.top, this.f36012e.right, this.f36012e.bottom, this.f36010c);
                    }
                    if (height > 0.0f) {
                        Canvas canvas3 = canvas;
                        canvas3.drawRect(this.f36012e.left, this.f36012e.top, this.f36012e.right, this.f36012e.top + height, this.f36010c);
                        canvas3.drawRect(this.f36012e.left, this.f36012e.bottom - height, this.f36012e.right, this.f36012e.bottom, this.f36010c);
                        break;
                    }
                }
                break;
        }
        if (this.f36018k != 0) {
            this.f36010c.setStyle(Style.STROKE);
            this.f36010c.setColor(this.f36018k);
            this.f36010c.setStrokeWidth(this.f36017j);
            this.f36021n.setFillType(FillType.EVEN_ODD);
            canvas.drawPath(this.f36022o, this.f36010c);
        }
    }

    /* renamed from: a */
    public final void mo25845a(int i, float f) {
        this.f36018k = i;
        this.f36017j = f;
        m28013a();
        invalidateSelf();
    }
}
