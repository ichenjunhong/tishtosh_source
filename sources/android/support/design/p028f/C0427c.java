package android.support.design.p028f;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.support.p030v4.graphics.drawable.C0814e;

/* renamed from: android.support.design.f.c */
public final class C0427c extends Drawable implements C0814e {

    /* renamed from: a */
    public C0432e f1383a;

    /* renamed from: b */
    public boolean f1384b;

    /* renamed from: c */
    public float f1385c;

    /* renamed from: d */
    public int f1386d;

    /* renamed from: e */
    public int f1387e;

    /* renamed from: f */
    public float f1388f;

    /* renamed from: g */
    public float f1389g;

    /* renamed from: h */
    public Style f1390h;

    /* renamed from: i */
    public ColorStateList f1391i;

    /* renamed from: j */
    private final Paint f1392j;

    /* renamed from: k */
    private final Matrix[] f1393k;

    /* renamed from: l */
    private final Matrix[] f1394l;

    /* renamed from: m */
    private final C0428d[] f1395m;

    /* renamed from: n */
    private final Matrix f1396n;

    /* renamed from: o */
    private final Path f1397o;

    /* renamed from: p */
    private final PointF f1398p;

    /* renamed from: q */
    private final C0428d f1399q;

    /* renamed from: r */
    private final Region f1400r;

    /* renamed from: s */
    private final Region f1401s;

    /* renamed from: t */
    private final float[] f1402t;

    /* renamed from: u */
    private final float[] f1403u;

    /* renamed from: v */
    private boolean f1404v;

    /* renamed from: w */
    private int f1405w;

    /* renamed from: x */
    private int f1406x;

    /* renamed from: y */
    private PorterDuffColorFilter f1407y;

    /* renamed from: z */
    private Mode f1408z;

    public final int getOpacity() {
        return -3;
    }

    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        this.f1400r.set(bounds);
        m1042b(bounds.width(), bounds.height(), this.f1397o);
        this.f1401s.setPath(this.f1397o, this.f1400r);
        this.f1400r.op(this.f1401s, Op.DIFFERENCE);
        return this.f1400r;
    }

    /* renamed from: a */
    private void m1039a() {
        if (this.f1391i == null || this.f1408z == null) {
            this.f1407y = null;
            return;
        }
        int colorForState = this.f1391i.getColorForState(getState(), 0);
        this.f1407y = new PorterDuffColorFilter(colorForState, this.f1408z);
        if (this.f1404v) {
            this.f1405w = colorForState;
        }
    }

    /* renamed from: a */
    public final void mo1021a(float f) {
        this.f1385c = f;
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.f1406x = i;
        invalidateSelf();
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1392j.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.f1391i = colorStateList;
        m1039a();
        invalidateSelf();
    }

    public final void setTintMode(Mode mode) {
        this.f1408z = mode;
        m1039a();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.f1392j.setColorFilter(this.f1407y);
        int alpha = this.f1392j.getAlpha();
        Paint paint = this.f1392j;
        int i = this.f1406x;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        this.f1392j.setStrokeWidth(this.f1389g);
        this.f1392j.setStyle(this.f1390h);
        if (this.f1386d > 0 && this.f1384b) {
            this.f1392j.setShadowLayer((float) this.f1387e, 0.0f, (float) this.f1386d, this.f1405w);
        }
        if (this.f1383a != null) {
            m1042b(canvas.getWidth(), canvas.getHeight(), this.f1397o);
            canvas.drawPath(this.f1397o, this.f1392j);
        } else {
            canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f1392j);
        }
        this.f1392j.setAlpha(alpha);
    }

    /* renamed from: a */
    private float m1038a(int i, int i2, int i3) {
        int i4 = (i + 1) % 4;
        m1040a(i, i2, i3, this.f1398p);
        float f = this.f1398p.x;
        float f2 = this.f1398p.y;
        m1040a(i4, i2, i3, this.f1398p);
        return (float) Math.atan2((double) (this.f1398p.y - f2), (double) (this.f1398p.x - f));
    }

    /* renamed from: b */
    private void m1042b(int i, int i2, Path path) {
        m1041a(i, i2, path);
        if (this.f1388f != 1.0f) {
            this.f1396n.reset();
            this.f1396n.setScale(this.f1388f, this.f1388f, (float) (i / 2), (float) (i2 / 2));
            path.transform(this.f1396n);
        }
    }

    /* renamed from: a */
    private void m1041a(int i, int i2, Path path) {
        C0426b bVar;
        int i3 = i;
        int i4 = i2;
        Path path2 = path;
        path.rewind();
        if (this.f1383a != null) {
            int i5 = 0;
            while (i5 < 4) {
                m1040a(i5, i3, i4, this.f1398p);
                int i6 = ((i5 - 1) + 4) % 4;
                m1040a(i6, i3, i4, this.f1398p);
                float f = this.f1398p.x;
                float f2 = this.f1398p.y;
                int i7 = i5 + 1;
                m1040a(i7 % 4, i3, i4, this.f1398p);
                float f3 = this.f1398p.x;
                float f4 = this.f1398p.y;
                m1040a(i5, i3, i4, this.f1398p);
                float f5 = this.f1398p.x;
                float f6 = this.f1398p.y;
                float f7 = f4 - f6;
                int i8 = i5;
                int i9 = ((((float) Math.atan2((double) (f2 - f6), (double) (f - f5))) - ((float) Math.atan2((double) f7, (double) (f3 - f5)))) > 0.0f ? 1 : ((((float) Math.atan2((double) (f2 - f6), (double) (f - f5))) - ((float) Math.atan2((double) f7, (double) (f3 - f5)))) == 0.0f ? 0 : -1));
                float a = m1038a(i6, i3, i4) + 1.5707964f;
                this.f1393k[i8].reset();
                this.f1393k[i8].setTranslate(this.f1398p.x, this.f1398p.y);
                this.f1393k[i8].preRotate((float) Math.toDegrees((double) a));
                this.f1402t[0] = this.f1395m[i8].f1411c;
                this.f1402t[1] = this.f1395m[i8].f1412d;
                this.f1393k[i8].mapPoints(this.f1402t);
                int i10 = i8;
                float a2 = m1038a(i10, i3, i4);
                this.f1394l[i10].reset();
                this.f1394l[i10].setTranslate(this.f1402t[0], this.f1402t[1]);
                this.f1394l[i10].preRotate((float) Math.toDegrees((double) a2));
                i5 = i7;
            }
            int i11 = 0;
            while (i11 < 4) {
                this.f1402t[0] = this.f1395m[i11].f1409a;
                this.f1402t[1] = this.f1395m[i11].f1410b;
                this.f1393k[i11].mapPoints(this.f1402t);
                if (i11 == 0) {
                    path2.moveTo(this.f1402t[0], this.f1402t[1]);
                } else {
                    path2.lineTo(this.f1402t[0], this.f1402t[1]);
                }
                this.f1395m[i11].mo1029a(this.f1393k[i11], path2);
                int i12 = i11 + 1;
                int i13 = i12 % 4;
                this.f1402t[0] = this.f1395m[i11].f1411c;
                this.f1402t[1] = this.f1395m[i11].f1412d;
                this.f1393k[i11].mapPoints(this.f1402t);
                this.f1403u[0] = this.f1395m[i13].f1409a;
                this.f1403u[1] = this.f1395m[i13].f1410b;
                this.f1393k[i13].mapPoints(this.f1403u);
                float hypot = (float) Math.hypot((double) (this.f1402t[0] - this.f1403u[0]), (double) (this.f1402t[1] - this.f1403u[1]));
                C0428d dVar = this.f1399q;
                dVar.f1409a = 0.0f;
                dVar.f1410b = 0.0f;
                dVar.f1411c = 0.0f;
                dVar.f1412d = 0.0f;
                dVar.f1413e.clear();
                switch (i11) {
                    case 1:
                        bVar = this.f1383a.f1427b;
                        break;
                    case 2:
                        bVar = this.f1383a.f1428c;
                        break;
                    case 3:
                        bVar = this.f1383a.f1429d;
                        break;
                    default:
                        bVar = this.f1383a.f1426a;
                        break;
                }
                bVar.mo972a(hypot, this.f1385c, this.f1399q);
                this.f1399q.mo1029a(this.f1394l[i11], path2);
                i11 = i12;
            }
            path.close();
        }
    }

    /* renamed from: a */
    private static void m1040a(int i, int i2, int i3, PointF pointF) {
        switch (i) {
            case 1:
                pointF.set((float) i2, 0.0f);
                return;
            case 2:
                pointF.set((float) i2, (float) i3);
                return;
            case 3:
                pointF.set(0.0f, (float) i3);
                return;
            default:
                pointF.set(0.0f, 0.0f);
                return;
        }
    }
}
