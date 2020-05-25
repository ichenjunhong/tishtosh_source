package com.p683ss.android.ugc.aweme.p1308ad.search;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.ad.search.AdTextProgressButton */
public final class AdTextProgressButton extends View {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f60385a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdTextProgressButton.class), "idleColor", "getIdleColor()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdTextProgressButton.class), "loadingColor", "getLoadingColor()I")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdTextProgressButton.class), "rectPaint", "getRectPaint()Landroid/graphics/Paint;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(AdTextProgressButton.class), "textPaint", "getTextPaint()Landroid/graphics/Paint;"))};

    /* renamed from: b */
    public final float f60386b;

    /* renamed from: c */
    private final float f60387c;

    /* renamed from: d */
    private ValueAnimator f60388d;

    /* renamed from: e */
    private final C52668f f60389e;

    /* renamed from: f */
    private final C52668f f60390f;

    /* renamed from: g */
    private int f60391g;

    /* renamed from: h */
    private int f60392h;

    /* renamed from: i */
    private String f60393i;

    /* renamed from: j */
    private String f60394j;

    /* renamed from: k */
    private final C52668f f60395k;

    /* renamed from: l */
    private final C52668f f60396l;

    /* renamed from: com.ss.android.ugc.aweme.ad.search.AdTextProgressButton$a */
    static final class C22416a extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ Context f60397a;

        C22416a(Context context) {
            this.f60397a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.f60397a.getResources().getColor(R.color.a3c));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.search.AdTextProgressButton$b */
    static final class C22417b extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ Context f60398a;

        C22417b(Context context) {
            this.f60398a = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.f60398a.getResources().getColor(R.color.a1v));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.search.AdTextProgressButton$c */
    static final class C22418c extends C52712l implements C52670a<Paint> {

        /* renamed from: a */
        public static final C22418c f60399a = new C22418c();

        C22418c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new Paint();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.search.AdTextProgressButton$d */
    static final class C22419d extends C52712l implements C52670a<Paint> {

        /* renamed from: a */
        final /* synthetic */ AdTextProgressButton f60400a;

        C22419d(AdTextProgressButton adTextProgressButton) {
            this.f60400a = adTextProgressButton;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            Paint paint = new Paint();
            paint.setColor(-1);
            paint.setTextSize(this.f60400a.f60386b * 13.0f);
            paint.setTextAlign(Align.CENTER);
            paint.setTypeface(Typeface.DEFAULT_BOLD);
            return paint;
        }
    }

    public AdTextProgressButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdTextProgressButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final int getIdleColor() {
        return ((Number) this.f60389e.getValue()).intValue();
    }

    private final int getLoadingColor() {
        return ((Number) this.f60390f.getValue()).intValue();
    }

    private final Paint getRectPaint() {
        return (Paint) this.f60395k.getValue();
    }

    private final Paint getTextPaint() {
        return (Paint) this.f60396l.getValue();
    }

    public final int getBgColor() {
        return this.f60391g;
    }

    public final String getIdleText() {
        return this.f60394j;
    }

    public final int getPercent() {
        return this.f60392h;
    }

    public final String getText() {
        return this.f60393i;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f60388d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final void setBgColor(int i) {
        this.f60391g = i;
    }

    public final void setPercent(int i) {
        this.f60392h = i;
    }

    public final void setIdleText(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f60394j = str;
    }

    public final void setText(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f60393i = str;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (canvas != null) {
            getRectPaint().setColor(this.f60391g);
            RectF rectF = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            canvas.drawRoundRect(rectF, this.f60387c, this.f60387c, getRectPaint());
            if (this.f60392h > 0) {
                canvas.save();
                canvas.clipRect(new RectF(0.0f, 0.0f, (((float) this.f60392h) / 100.0f) * ((float) getWidth()), (float) getHeight()));
                canvas.drawRoundRect(rectF, this.f60387c, this.f60387c, getRectPaint());
                canvas.restore();
            }
            canvas.drawText(this.f60393i, ((float) getWidth()) / 2.0f, ((((float) getHeight()) - getTextPaint().getFontMetrics().top) - getTextPaint().getFontMetrics().bottom) / 2.0f, getTextPaint());
        }
    }

    public AdTextProgressButton(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        C52711k.m112236a((Object) resources, "context.resources");
        this.f60386b = TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.f60387c = this.f60386b * 2.0f;
        this.f60389e = C52732g.m112285a(new C22416a(context));
        this.f60390f = C52732g.m112285a(new C22417b(context));
        this.f60391g = getLoadingColor();
        this.f60393i = "";
        String string = context.getResources().getString(R.string.bqq);
        C52711k.m112236a((Object) string, "context.resources.getStr…ing.immediately_download)");
        this.f60394j = string;
        this.f60395k = C52732g.m112285a(C22418c.f60399a);
        this.f60396l = C52732g.m112285a(new C22419d(this));
    }

    public /* synthetic */ AdTextProgressButton(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
