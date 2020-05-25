package com.airbnb.lottie.p108c.p111c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.C2474j;
import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2336p;
import com.airbnb.lottie.p114f.C2454f;
import com.airbnb.lottie.p115g.C2470c;

/* renamed from: com.airbnb.lottie.c.c.c */
public final class C2387c extends C2382a {

    /* renamed from: g */
    private final Paint f7447g = new Paint(3);

    /* renamed from: h */
    private final Rect f7448h = new Rect();

    /* renamed from: i */
    private final Rect f7449i = new Rect();

    /* renamed from: j */
    private C2320a<ColorFilter, ColorFilter> f7450j;

    /* renamed from: c */
    private Bitmap m7025c() {
        return this.f7417b.mo6819a(this.f7418c.f7457g);
    }

    C2387c(C2455g gVar, C2388d dVar) {
        super(gVar, dVar);
    }

    /* renamed from: a */
    public final <T> void mo6711a(T t, C2470c<T> cVar) {
        super.mo6711a(t, cVar);
        if (t == C2474j.f7659x) {
            if (cVar == null) {
                this.f7450j = null;
                return;
            }
            this.f7450j = new C2336p(cVar);
        }
    }

    /* renamed from: a */
    public final void mo6709a(RectF rectF, Matrix matrix) {
        super.mo6709a(rectF, matrix);
        Bitmap c = m7025c();
        if (c != null) {
            rectF.set(rectF.left, rectF.top, Math.min(rectF.right, (float) c.getWidth()), Math.min(rectF.bottom, (float) c.getHeight()));
            this.f7416a.mapRect(rectF);
        }
    }

    /* renamed from: b */
    public final void mo6754b(Canvas canvas, Matrix matrix, int i) {
        Bitmap c = m7025c();
        if (c != null && !c.isRecycled()) {
            float a = C2454f.m7176a();
            this.f7447g.setAlpha(i);
            if (this.f7450j != null) {
                this.f7447g.setColorFilter((ColorFilter) this.f7450j.mo6726d());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f7448h.set(0, 0, c.getWidth(), c.getHeight());
            this.f7449i.set(0, 0, (int) (((float) c.getWidth()) * a), (int) (((float) c.getHeight()) * a));
            canvas.drawBitmap(c, this.f7448h, this.f7449i, this.f7447g);
            canvas.restore();
        }
    }
}
