package com.p683ss.android.ugc.aweme.music.p1978ui;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.music.ui.bu */
public final class C37586bu extends Drawable {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f95868a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37586bu.class), "paint", "getPaint()Landroid/graphics/Paint;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C37586bu.class), "shadowPaint", "getShadowPaint()Landroid/graphics/Paint;"))};

    /* renamed from: b */
    public int f95869b;

    /* renamed from: c */
    public C37557bo f95870c;

    /* renamed from: d */
    private final C52668f f95871d;

    /* renamed from: e */
    private final C52668f f95872e = C52732g.m112285a(new C37588b(this));

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bu$a */
    static final class C37587a extends C52712l implements C52670a<Paint> {

        /* renamed from: a */
        final /* synthetic */ int f95873a;

        C37587a(int i) {
            this.f95873a = i;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Paint paint = new Paint(1);
            paint.setColor(this.f95873a);
            return paint;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.bu$b */
    static final class C37588b extends C52712l implements C52670a<Paint> {

        /* renamed from: a */
        final /* synthetic */ C37586bu f95874a;

        C37588b(C37586bu buVar) {
            this.f95874a = buVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Paint paint = new Paint(1);
            C37557bo boVar = this.f95874a.f95870c;
            if (boVar != null) {
                paint.setColor(boVar.f95815e);
                paint.setMaskFilter(new BlurMaskFilter(boVar.f95811a, boVar.f95812b));
            }
            return paint;
        }
    }

    /* renamed from: a */
    private Paint m84029a() {
        return (Paint) this.f95871d.getValue();
    }

    public final int getOpacity() {
        return m84029a().getAlpha();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        m84029a().setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        if (m84029a().getAlpha() != i) {
            m84029a().setAlpha(i);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0) {
            float f = (float) width;
            float f2 = (float) height;
            float min = Math.min(f, f2) / 2.0f;
            RectF rectF = new RectF(0.0f, 0.0f, f, f2);
            C37557bo boVar = this.f95870c;
            if (boVar != null) {
                Math.abs(boVar.f95813c);
                float abs = Math.abs(boVar.f95814d) + boVar.f95811a;
                rectF.top += abs;
                rectF.bottom -= abs;
                rectF.left += abs;
                rectF.right -= abs;
                canvas.save();
                canvas.translate(boVar.f95813c, boVar.f95814d);
                canvas.drawRoundRect(rectF, min, min, (Paint) this.f95872e.getValue());
                canvas.restore();
            }
            canvas.drawRoundRect(rectF, min, min, m84029a());
        }
    }

    public C37586bu(int i, C37557bo boVar) {
        this.f95869b = i;
        this.f95870c = boVar;
        this.f95871d = C52732g.m112285a(new C37587a(i));
    }
}
