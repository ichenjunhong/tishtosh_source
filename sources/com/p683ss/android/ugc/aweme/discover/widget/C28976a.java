package com.p683ss.android.ugc.aweme.discover.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.discover.widget.a */
public final class C28976a extends ImageSpan {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f75863a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28976a.class), "mLeftMarginPx", "getMLeftMarginPx()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C28976a.class), "mRightMarginPx", "getMRightMarginPx()I"))};

    /* renamed from: b */
    public final int f75864b = 4;

    /* renamed from: c */
    public final int f75865c = 0;

    /* renamed from: d */
    private final C52668f f75866d = C52732g.m112285a(new C28977a(this));

    /* renamed from: e */
    private final C52668f f75867e = C52732g.m112285a(new C28978b(this));

    /* renamed from: f */
    private final Drawable f75868f;

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.a$a */
    static final class C28977a extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C28976a f75869a;

        C28977a(C28976a aVar) {
            this.f75869a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            if (this.f75869a.f75864b > 0) {
                i = C23728o.m58241a((double) this.f75869a.f75864b);
            } else {
                i = 0;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.widget.a$b */
    static final class C28978b extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C28976a f75870a;

        C28978b(C28976a aVar) {
            this.f75870a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            int i;
            if (this.f75870a.f75865c > 0) {
                i = C23728o.m58241a((double) this.f75870a.f75865c);
            } else {
                i = 0;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: a */
    private final int m68290a() {
        return ((Number) this.f75866d.getValue()).intValue();
    }

    public C28976a(Drawable drawable, int i, int i2) {
        C52711k.m112240b(drawable, "mDrawable");
        super(drawable);
        this.f75868f = drawable;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        C52711k.m112240b(paint, "paint");
        C52711k.m112240b(charSequence, "text");
        Drawable drawable = getDrawable();
        if (drawable == null) {
            drawable = this.f75868f;
        }
        Rect bounds = drawable.getBounds();
        if (fontMetricsInt != null) {
            FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = (fontMetricsInt2.descent + fontMetricsInt2.ascent) / 2;
            int i4 = (bounds.bottom - bounds.top) / 2;
            int i5 = i3 - i4;
            int i6 = i3 + i4;
            fontMetricsInt.ascent = i5;
            fontMetricsInt.top = i5;
            fontMetricsInt.bottom = i6;
            fontMetricsInt.descent = i6;
        }
        return bounds.right + m68290a() + ((Number) this.f75867e.getValue()).intValue();
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C52711k.m112240b(canvas, "canvas");
        C52711k.m112240b(charSequence, "text");
        C52711k.m112240b(paint, "paint");
        Drawable drawable = getDrawable();
        FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = ((float) i4) + ((fontMetrics.bottom + fontMetrics.top) / 2.0f);
        C52711k.m112236a((Object) drawable, "b");
        float f3 = f2 - ((float) (drawable.getBounds().bottom / 2));
        canvas.save();
        canvas.translate(f + ((float) m68290a()), f3);
        getDrawable().draw(canvas);
        canvas.restore();
    }
}
