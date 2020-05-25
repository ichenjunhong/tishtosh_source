package com.p683ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.c */
public final class C31244c extends ReplacementSpan {

    /* renamed from: a */
    public float f81805a;

    /* renamed from: b */
    private final Context f81806b;

    /* renamed from: c */
    private final String f81807c;

    /* renamed from: d */
    private final String f81808d;

    /* renamed from: e */
    private final int f81809e;

    /* renamed from: f */
    private final String f81810f;

    /* renamed from: g */
    private final String f81811g;

    /* renamed from: h */
    private final int f81812h;

    /* renamed from: i */
    private final float f81813i;

    /* renamed from: j */
    private float f81814j;

    /* renamed from: k */
    private float f81815k;

    /* renamed from: l */
    private final float f81816l;

    /* renamed from: m */
    private float f81817m;

    /* renamed from: n */
    private Paint f81818n;

    /* renamed from: o */
    private Paint f81819o;

    /* renamed from: p */
    private WeakReference<Drawable> f81820p;

    /* renamed from: b */
    private final Drawable m72954b() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f81820p;
        if (weakReference != null) {
            drawable = (Drawable) weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        Drawable c = m72955c();
        this.f81820p = new WeakReference<>(c);
        return c;
    }

    /* renamed from: c */
    private Drawable m72955c() {
        Drawable drawable = this.f81806b.getResources().getDrawable(this.f81809e);
        C52711k.m112236a((Object) drawable, "mContext.resources.getDrawable(mDrawableRes)");
        return drawable;
    }

    /* renamed from: a */
    private final void m72953a() {
        if (!TextUtils.isEmpty(this.f81807c) && this.f81819o == null) {
            this.f81819o = new TextPaint();
            try {
                if (TextUtils.isEmpty(this.f81808d)) {
                    Paint paint = this.f81819o;
                    if (paint == null) {
                        C52711k.m112234a();
                    }
                    paint.setColor(this.f81812h);
                } else {
                    Paint paint2 = this.f81819o;
                    if (paint2 == null) {
                        C52711k.m112234a();
                    }
                    paint2.setColor(Color.parseColor(this.f81808d));
                }
            } catch (Exception unused) {
                Paint paint3 = this.f81819o;
                if (paint3 == null) {
                    C52711k.m112234a();
                }
                paint3.setColor(this.f81812h);
            }
            Paint paint4 = this.f81819o;
            if (paint4 == null) {
                C52711k.m112234a();
            }
            paint4.setTextSize(this.f81817m);
            Paint paint5 = this.f81819o;
            if (paint5 == null) {
                C52711k.m112234a();
            }
            paint5.setAntiAlias(true);
        }
    }

    /* renamed from: a */
    private final float m72952a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        m72953a();
        Rect rect = new Rect();
        Paint paint = this.f81819o;
        if (paint == null) {
            C52711k.m112234a();
        }
        if (str == null) {
            C52711k.m112234a();
        }
        paint.getTextBounds(str, 0, str.length(), rect);
        return ((float) rect.width()) + (this.f81816l * 4.0f * 3.0f) + ((float) m72954b().getIntrinsicWidth());
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        C52711k.m112240b(paint, "paint");
        return (int) this.f81813i;
    }

    public C31244c(Context context, String str, String str2, int i, String str3) {
        C52711k.m112240b(context, "context");
        this(context, str, str2, R.drawable.cxo, str3, "");
    }

    private C31244c(Context context, String str, String str2, int i, String str3, String str4) {
        Context context2 = context;
        C52711k.m112240b(context, "context");
        this(context2, str, str2, i, str3, str4, 13, 20);
    }

    public C31244c(Context context, String str, String str2, int i, String str3, String str4, int i2, int i3) {
        C52711k.m112240b(context, "context");
        Context applicationContext = context.getApplicationContext();
        C52711k.m112236a((Object) applicationContext, "context.applicationContext");
        this.f81806b = applicationContext;
        this.f81812h = Color.parseColor("#FACE15");
        Resources resources = this.f81806b.getResources();
        C52711k.m112236a((Object) resources, "mContext.resources");
        this.f81816l = TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.f81817m = ((float) i2) * this.f81816l;
        this.f81814j = ((float) i3) * this.f81816l;
        this.f81815k = this.f81816l * 2.0f;
        this.f81807c = str;
        this.f81808d = str2;
        this.f81809e = i;
        this.f81810f = str3;
        this.f81811g = str4;
        this.f81813i = m72952a(str);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        C52711k.m112240b(canvas, "canvas");
        C52711k.m112240b(paint, "paint");
        if (!TextUtils.isEmpty(this.f81811g) && this.f81818n == null) {
            this.f81818n = new Paint();
            try {
                Paint paint2 = this.f81818n;
                if (paint2 == null) {
                    C52711k.m112234a();
                }
                paint2.setColor(Color.parseColor(this.f81811g));
            } catch (Exception unused) {
                Paint paint3 = this.f81818n;
                if (paint3 == null) {
                    C52711k.m112234a();
                }
                paint3.setColor(-1);
            }
            Paint paint4 = this.f81818n;
            if (paint4 == null) {
                C52711k.m112234a();
            }
            paint4.setStyle(Style.FILL);
            Paint paint5 = this.f81818n;
            if (paint5 == null) {
                C52711k.m112234a();
            }
            paint5.setAntiAlias(true);
        }
        m72953a();
        if (!(this.f81819o == null || this.f81818n == null)) {
            Paint paint6 = this.f81819o;
            if (paint6 == null) {
                C52711k.m112234a();
            }
            FontMetrics fontMetrics = paint6.getFontMetrics();
            float f2 = (float) i4;
            float f3 = fontMetrics.ascent + f2;
            float f4 = f2 + fontMetrics.descent;
            float min = Math.min(Math.min(f3, ((float) canvas.getHeight()) - f4), (this.f81814j - (f4 - f3)) * 0.5f);
            canvas.drawRoundRect(new RectF(f, (f3 - min) - (this.f81816l * 1.0f), this.f81813i + f, (f4 + min) - (this.f81816l * 1.0f)), this.f81815k, this.f81815k, this.f81818n);
        }
        float f5 = (float) i4;
        if (this.f81819o != null) {
            canvas.drawText(this.f81807c, (this.f81816l * 6.0f) + f + ((float) m72954b().getIntrinsicWidth()), f5 - (this.f81816l * 1.0f), this.f81819o);
        }
        Drawable b = m72954b();
        if (!(b instanceof BitmapDrawable)) {
            b = null;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) b;
        if (bitmapDrawable != null) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint7 = new Paint();
            try {
                if (TextUtils.isEmpty(this.f81810f)) {
                    i6 = this.f81812h;
                } else {
                    i6 = Color.parseColor(this.f81810f);
                }
            } catch (Exception unused2) {
                i6 = this.f81812h;
            }
            paint7.setColorFilter(new PorterDuffColorFilter(i6, Mode.SRC_ATOP));
            paint7.setAntiAlias(true);
            canvas.drawBitmap(bitmap, f + C9432q.m18687b(this.f81806b, 4.0f), ((float) (i4 - bitmapDrawable.getMinimumHeight())) + C9432q.m18687b(this.f81806b, 1.0f) + this.f81805a, paint7);
        }
    }
}
