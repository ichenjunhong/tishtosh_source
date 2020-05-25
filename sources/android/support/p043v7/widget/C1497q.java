package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: android.support.v7.widget.q */
class C1497q implements C1500s {

    /* renamed from: a */
    final RectF f5394a = new RectF();

    /* renamed from: f */
    public final void mo5825f(C1499r rVar) {
    }

    C1497q() {
    }

    /* renamed from: a */
    public void mo5814a() {
        C1432aq.f5140a = new C1433a() {
            /* renamed from: a */
            public final void mo5603a(Canvas canvas, RectF rectF, float f, Paint paint) {
                Canvas canvas2 = canvas;
                RectF rectF2 = rectF;
                float f2 = 2.0f * f;
                float width = (rectF.width() - f2) - 1.0f;
                float height = (rectF.height() - f2) - 1.0f;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    C1497q.this.f5394a.set(f4, f4, f3, f3);
                    int save = canvas.save();
                    canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                    canvas.drawArc(C1497q.this.f5394a, 180.0f, 90.0f, true, paint);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    Paint paint2 = paint;
                    canvas.drawArc(C1497q.this.f5394a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(height, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(C1497q.this.f5394a, 180.0f, 90.0f, true, paint2);
                    canvas2.translate(width, 0.0f);
                    canvas2.rotate(90.0f);
                    canvas.drawArc(C1497q.this.f5394a, 180.0f, 90.0f, true, paint2);
                    canvas2.restoreToCount(save);
                    canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.top, (rectF2.right - f3) + 1.0f, rectF2.top + f3, paint);
                    canvas.drawRect((rectF2.left + f3) - 1.0f, rectF2.bottom - f3, (rectF2.right - f3) + 1.0f, rectF2.bottom, paint);
                }
                canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
            }
        };
    }

    /* renamed from: j */
    private static C1432aq m5303j(C1499r rVar) {
        return (C1432aq) rVar.mo4646c();
    }

    /* renamed from: a */
    public final float mo5815a(C1499r rVar) {
        return m5303j(rVar).f5143c;
    }

    /* renamed from: d */
    public final float mo5823d(C1499r rVar) {
        return m5303j(rVar).f5142b;
    }

    /* renamed from: e */
    public final float mo5824e(C1499r rVar) {
        return m5303j(rVar).f5144d;
    }

    /* renamed from: h */
    public final ColorStateList mo5827h(C1499r rVar) {
        return m5303j(rVar).f5145e;
    }

    /* renamed from: b */
    public final float mo5819b(C1499r rVar) {
        return m5303j(rVar).mo5589a();
    }

    /* renamed from: c */
    public final float mo5821c(C1499r rVar) {
        return m5303j(rVar).mo5594b();
    }

    /* renamed from: g */
    public final void mo5826g(C1499r rVar) {
        m5303j(rVar).mo5593a(rVar.mo4645b());
        m5302i(rVar);
    }

    /* renamed from: i */
    private void m5302i(C1499r rVar) {
        Rect rect = new Rect();
        m5303j(rVar).mo5592a(rect);
        rVar.mo4641a((int) Math.ceil((double) mo5819b(rVar)), (int) Math.ceil((double) mo5821c(rVar)));
        rVar.mo4642a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: b */
    public final void mo5820b(C1499r rVar, float f) {
        C1432aq j = m5303j(rVar);
        j.mo5590a(j.f5144d, f);
        m5302i(rVar);
    }

    /* renamed from: c */
    public final void mo5822c(C1499r rVar, float f) {
        C1432aq j = m5303j(rVar);
        j.mo5590a(f, j.f5143c);
    }

    /* renamed from: a */
    public final void mo5816a(C1499r rVar, float f) {
        C1432aq j = m5303j(rVar);
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (j.f5142b != f2) {
                j.f5142b = f2;
                j.f5146f = true;
                j.invalidateSelf();
            }
            m5302i(rVar);
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid radius ");
        sb.append(f);
        sb.append(". Must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo5818a(C1499r rVar, ColorStateList colorStateList) {
        C1432aq j = m5303j(rVar);
        j.mo5591a(colorStateList);
        j.invalidateSelf();
    }

    /* renamed from: a */
    public final void mo5817a(C1499r rVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C1432aq aqVar = new C1432aq(context.getResources(), colorStateList, f, f2, f3);
        aqVar.mo5593a(rVar.mo4645b());
        rVar.mo4643a(aqVar);
        m5302i(rVar);
    }
}
