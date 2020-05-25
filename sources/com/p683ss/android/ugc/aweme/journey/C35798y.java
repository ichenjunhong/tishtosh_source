package com.p683ss.android.ugc.aweme.journey;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
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

/* renamed from: com.ss.android.ugc.aweme.journey.y */
public final class C35798y extends Drawable {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f91951a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35798y.class), "paint", "getPaint()Landroid/graphics/Paint;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35798y.class), "shadowPaint", "getShadowPaint()Landroid/graphics/Paint;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35798y.class), "strokePaint", "getStrokePaint()Landroid/graphics/Paint;"))};

    /* renamed from: b */
    public int f91952b;

    /* renamed from: c */
    public int f91953c = -1;

    /* renamed from: d */
    public C35792w f91954d;

    /* renamed from: e */
    private final C52668f f91955e;

    /* renamed from: f */
    private final C52668f f91956f;

    /* renamed from: g */
    private final C52668f f91957g;

    /* renamed from: com.ss.android.ugc.aweme.journey.y$a */
    static final class C35799a extends C52712l implements C52670a<Paint> {

        /* renamed from: a */
        final /* synthetic */ int f91958a;

        C35799a(int i) {
            this.f91958a = i;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Paint paint = new Paint(1);
            paint.setColor(this.f91958a);
            return paint;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.y$b */
    static final class C35800b extends C52712l implements C52670a<Paint> {

        /* renamed from: a */
        final /* synthetic */ C35798y f91959a;

        C35800b(C35798y yVar) {
            this.f91959a = yVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Paint paint = new Paint(1);
            C35792w wVar = this.f91959a.f91954d;
            if (wVar != null) {
                paint.setColor(wVar.f91937e);
                paint.setMaskFilter(new BlurMaskFilter(wVar.f91933a, wVar.f91934b));
            }
            return paint;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.y$c */
    static final class C35801c extends C52712l implements C52670a<Paint> {

        /* renamed from: a */
        public static final C35801c f91960a = new C35801c();

        C35801c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Paint paint = new Paint();
            paint.setStyle(Style.STROKE);
            return paint;
        }
    }

    /* renamed from: a */
    private Paint m80927a() {
        return (Paint) this.f91955e.getValue();
    }

    /* renamed from: b */
    private Paint m80928b() {
        return (Paint) this.f91957g.getValue();
    }

    public final int getOpacity() {
        return m80927a().getAlpha();
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        m80927a().setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo74466a(int i) {
        if (this.f91953c != i) {
            this.f91953c = i;
            m80928b().setColor(i);
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (m80927a().getAlpha() != i) {
            m80927a().setAlpha(i);
            invalidateSelf();
        }
    }

    public final void draw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0) {
            C35792w wVar = this.f91954d;
            if (wVar == null) {
                C52711k.m112234a();
            }
            float f = wVar.f91938f;
            RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
            C35792w wVar2 = this.f91954d;
            if (wVar2 != null) {
                float f2 = wVar2.f91933a;
                float f3 = wVar2.f91933a;
                rectF.top += wVar2.f91933a;
                rectF.bottom -= f3;
                rectF.left += f2;
                rectF.right -= f2;
                canvas.save();
                canvas.translate(wVar2.f91935c, wVar2.f91936d);
                canvas.drawRoundRect(rectF, f, f, (Paint) this.f91956f.getValue());
                canvas.restore();
            }
            if (this.f91952b != 0) {
                canvas.drawRoundRect(rectF, f, f, m80927a());
            }
            if (this.f91953c != -1) {
                canvas.drawRoundRect(rectF, f, f, m80928b());
            }
        }
    }

    public C35798y(int i, C35792w wVar) {
        this.f91952b = i;
        this.f91954d = wVar;
        this.f91955e = C52732g.m112285a(new C35799a(i));
        this.f91956f = C52732g.m112285a(new C35800b(this));
        this.f91957g = C52732g.m112285a(C35801c.f91960a);
    }
}
