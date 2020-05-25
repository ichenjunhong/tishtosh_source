package com.p683ss.android.ugc.aweme.shortvideo.p2261w;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.w.c */
public final class C45556c extends ReplacementSpan {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f115116a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45556c.class), "extraWdp", "getExtraWdp()F")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45556c.class), "oneDp", "getOneDp()F")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45556c.class), "hookTextSizeForMeauredp", "getHookTextSizeForMeauredp()F")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45556c.class), "hookTextSizedp", "getHookTextSizedp()F")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45556c.class), "hookTextmarginLeftdp", "getHookTextmarginLeftdp()F")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45556c.class), "iconHdp", "getIconHdp()F")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C45556c.class), "iconMarginLeftdp", "getIconMarginLeftdp()F"))};

    /* renamed from: b */
    public Bitmap f115117b;

    /* renamed from: c */
    public final Context f115118c;

    /* renamed from: d */
    private int f115119d;

    /* renamed from: e */
    private final C52668f f115120e = C52732g.m112285a(new C45557a(this));

    /* renamed from: f */
    private final C52668f f115121f = C52732g.m112285a(new C45563g(this));

    /* renamed from: g */
    private final C52668f f115122g = C52732g.m112285a(new C45558b(this));

    /* renamed from: h */
    private final C52668f f115123h = C52732g.m112285a(new C45559c(this));

    /* renamed from: i */
    private final C52668f f115124i = C52732g.m112285a(new C45560d(this));

    /* renamed from: j */
    private final C52668f f115125j = C52732g.m112285a(new C45561e(this));

    /* renamed from: k */
    private final C52668f f115126k = C52732g.m112285a(new C45562f(this));

    /* renamed from: l */
    private String f115127l = "";

    /* renamed from: m */
    private final View f115128m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.c$a */
    static final class C45557a extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ C45556c f115129a;

        C45557a(C45556c cVar) {
            this.f115129a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(C9432q.m18687b(this.f115129a.f115118c, 24.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.c$b */
    static final class C45558b extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ C45556c f115130a;

        C45558b(C45556c cVar) {
            this.f115130a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(C9432q.m18687b(this.f115130a.f115118c, 15.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.c$c */
    static final class C45559c extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ C45556c f115131a;

        C45559c(C45556c cVar) {
            this.f115131a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(C9432q.m18687b(this.f115131a.f115118c, 13.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.c$d */
    static final class C45560d extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ C45556c f115132a;

        C45560d(C45556c cVar) {
            this.f115132a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(C9432q.m18687b(this.f115132a.f115118c, 18.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.c$e */
    static final class C45561e extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ C45556c f115133a;

        C45561e(C45556c cVar) {
            this.f115133a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(C9432q.m18687b(this.f115133a.f115118c, 12.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.c$f */
    static final class C45562f extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ C45556c f115134a;

        C45562f(C45556c cVar) {
            this.f115134a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(C9432q.m18687b(this.f115134a.f115118c, 4.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.w.c$g */
    static final class C45563g extends C52712l implements C52670a<Float> {

        /* renamed from: a */
        final /* synthetic */ C45556c f115135a;

        C45563g(C45556c cVar) {
            this.f115135a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Float.valueOf(C9432q.m18687b(this.f115135a.f115118c, 1.0f));
        }
    }

    /* renamed from: a */
    private final float m99212a() {
        return ((Number) this.f115120e.getValue()).floatValue();
    }

    /* renamed from: b */
    private final float m99213b() {
        return ((Number) this.f115121f.getValue()).floatValue();
    }

    /* renamed from: c */
    private final float m99214c() {
        return ((Number) this.f115123h.getValue()).floatValue();
    }

    public C45556c(Context context, View view) {
        C52711k.m112240b(context, "mContext");
        C52711k.m112240b(view, "mView");
        this.f115118c = context;
        this.f115128m = view;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        C52711k.m112240b(paint, "paint");
        C52711k.m112240b(charSequence, "text");
        int i3 = i + 1;
        if (i3 >= i2) {
            return 0;
        }
        paint.setTextSize(m99214c());
        paint.setFakeBoldText(true);
        this.f115119d = (int) (paint.measureText(charSequence, i3, i2) + m99212a());
        this.f115127l = charSequence.subSequence(i3, i2).toString();
        if ((this.f115128m instanceof C45555b) && this.f115119d >= ((C45555b) this.f115128m).getHookAtMaxWidth()) {
            int hookAtMaxWidth = ((C45555b) this.f115128m).getHookAtMaxWidth();
            float a = m99212a();
            C52711k.m112240b(charSequence, "text");
            C52711k.m112240b(paint, "paint");
            String str = "…";
            String obj = charSequence.subSequence(i3, i2).toString();
            int measureText = (int) (paint.measureText(obj) + a);
            if (hookAtMaxWidth == 0 || measureText <= hookAtMaxWidth) {
                str = "";
            } else {
                while (true) {
                    if (obj.length() == 1) {
                        break;
                    }
                    int length = obj.length() - 1;
                    int length2 = obj.length();
                    if (obj != null) {
                        obj = C52830p.m112427a((CharSequence) obj, length, length2).toString();
                        StringBuilder sb = new StringBuilder();
                        sb.append(obj);
                        sb.append(str);
                        if (((int) (paint.measureText(sb.toString()) + a)) <= hookAtMaxWidth && !Character.isHighSurrogate(obj.charAt(obj.length() - 1))) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(obj);
                            sb2.append(str);
                            str = sb2.toString();
                            break;
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
            }
            this.f115127l = str;
            this.f115119d = (int) (paint.measureText(this.f115127l) + m99212a());
        }
        return this.f115119d;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C52711k.m112240b(canvas, "canvas");
        C52711k.m112240b(charSequence, "text");
        C52711k.m112240b(paint, "paint");
        if (i + 1 < i2) {
            if (((float) this.f115119d) + f > ((float) this.f115128m.getWidth())) {
                canvas.drawText("…", f, (float) i4, paint);
            } else if (charSequence.length() <= i || charSequence.charAt(i) != 8230) {
                paint.setAntiAlias(true);
                int color = paint.getColor();
                PathEffect pathEffect = paint.getPathEffect();
                paint.setTextSize(((Number) this.f115122g.getValue()).floatValue());
                paint.setColor(Color.parseColor("#0B222435"));
                paint.setPathEffect(new CornerPathEffect(m99213b() * 2.0f));
                FontMetrics fontMetrics = paint.getFontMetrics();
                float f2 = fontMetrics.top;
                float f3 = fontMetrics.bottom;
                float f4 = (float) i4;
                float f5 = f4 + f2;
                canvas.drawRect(new RectF(f, f5, ((float) this.f115119d) + f, f4 + f3), paint);
                paint.setColor(color);
                float floatValue = ((f3 - f2) - ((Number) this.f115125j.getValue()).floatValue()) / 2.0f;
                if (this.f115117b != null) {
                    Bitmap bitmap = this.f115117b;
                    if (bitmap == null) {
                        C52711k.m112234a();
                    }
                    canvas.drawBitmap(bitmap, ((Number) this.f115126k.getValue()).floatValue() + f, f5 + floatValue, paint);
                }
                paint.setPathEffect(pathEffect);
                paint.setTextSize(m99214c());
                paint.setFakeBoldText(true);
                canvas.drawText(this.f115127l, f + ((Number) this.f115124i.getValue()).floatValue(), f4 - m99213b(), paint);
            } else {
                canvas.drawText("…", f, (float) i4, paint);
            }
        }
    }
}
