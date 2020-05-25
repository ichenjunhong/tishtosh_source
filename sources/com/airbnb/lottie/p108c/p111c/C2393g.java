package com.airbnb.lottie.p108c.p111c;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C2455g;
import com.airbnb.lottie.C2474j;
import com.airbnb.lottie.p104a.p106b.C2320a;
import com.airbnb.lottie.p104a.p106b.C2336p;
import com.airbnb.lottie.p115g.C2470c;

/* renamed from: com.airbnb.lottie.c.c.g */
public final class C2393g extends C2382a {

    /* renamed from: g */
    private final RectF f7475g = new RectF();

    /* renamed from: h */
    private final Paint f7476h = new Paint();

    /* renamed from: i */
    private final float[] f7477i = new float[8];

    /* renamed from: j */
    private final Path f7478j = new Path();

    /* renamed from: k */
    private final C2388d f7479k;

    /* renamed from: l */
    private C2320a<ColorFilter, ColorFilter> f7480l;

    /* renamed from: a */
    public final void mo6709a(RectF rectF, Matrix matrix) {
        super.mo6709a(rectF, matrix);
        this.f7475g.set(0.0f, 0.0f, (float) this.f7479k.f7460j, (float) this.f7479k.f7461k);
        this.f7416a.mapRect(this.f7475g);
        rectF.set(this.f7475g);
    }

    C2393g(C2455g gVar, C2388d dVar) {
        super(gVar, dVar);
        this.f7479k = dVar;
        this.f7476h.setAlpha(0);
        this.f7476h.setStyle(Style.FILL);
        this.f7476h.setColor(dVar.f7462l);
    }

    /* renamed from: a */
    public final <T> void mo6711a(T t, C2470c<T> cVar) {
        super.mo6711a(t, cVar);
        if (t == C2474j.f7659x) {
            if (cVar == null) {
                this.f7480l = null;
                return;
            }
            this.f7480l = new C2336p(cVar);
        }
    }

    /* renamed from: b */
    public final void mo6754b(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f7479k.f7462l);
        if (alpha != 0) {
            int intValue = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) ((Integer) this.f7421f.f7275e.mo6726d()).intValue())) / 100.0f) * 255.0f);
            this.f7476h.setAlpha(intValue);
            if (this.f7480l != null) {
                this.f7476h.setColorFilter((ColorFilter) this.f7480l.mo6726d());
            }
            if (intValue > 0) {
                this.f7477i[0] = 0.0f;
                this.f7477i[1] = 0.0f;
                this.f7477i[2] = (float) this.f7479k.f7460j;
                this.f7477i[3] = 0.0f;
                this.f7477i[4] = (float) this.f7479k.f7460j;
                this.f7477i[5] = (float) this.f7479k.f7461k;
                this.f7477i[6] = 0.0f;
                this.f7477i[7] = (float) this.f7479k.f7461k;
                matrix.mapPoints(this.f7477i);
                this.f7478j.reset();
                this.f7478j.moveTo(this.f7477i[0], this.f7477i[1]);
                this.f7478j.lineTo(this.f7477i[2], this.f7477i[3]);
                this.f7478j.lineTo(this.f7477i[4], this.f7477i[5]);
                this.f7478j.lineTo(this.f7477i[6], this.f7477i[7]);
                this.f7478j.lineTo(this.f7477i[0], this.f7477i[1]);
                this.f7478j.close();
                canvas.drawPath(this.f7478j, this.f7476h);
            }
        }
    }
}
