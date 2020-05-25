package com.p683ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.widget.util.C10749b;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtBubbleTextView */
public final class DmtBubbleTextView extends View {

    /* renamed from: a */
    private TextPaint f109134a;

    /* renamed from: b */
    private Path f109135b;

    /* renamed from: c */
    private Paint f109136c;

    /* renamed from: d */
    private Paint f109137d;

    /* renamed from: e */
    private String f109138e;

    /* renamed from: f */
    private int f109139f;

    /* renamed from: g */
    private int f109140g;

    /* renamed from: h */
    private int f109141h;

    /* renamed from: i */
    private int f109142i;

    /* renamed from: j */
    private int f109143j;

    /* renamed from: k */
    private int f109144k;

    /* renamed from: l */
    private int f109145l;

    /* renamed from: m */
    private int f109146m;

    /* renamed from: n */
    private int f109147n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtBubbleTextView$a */
    public static final class C43172a {

        /* renamed from: a */
        public int f109148a;

        /* renamed from: b */
        public int f109149b;

        /* renamed from: c */
        public int f109150c;

        /* renamed from: d */
        public int f109151d;

        /* renamed from: e */
        public int f109152e;

        /* renamed from: f */
        public int f109153f;

        /* renamed from: g */
        public int f109154g;

        /* renamed from: h */
        public int f109155h;

        /* renamed from: i */
        public int f109156i;
    }

    public final void setText(String str) {
        this.f109138e = str;
        invalidate();
    }

    public final void setBgColor(int i) {
        Paint paint = this.f109136c;
        if (paint == null) {
            C52711k.m112237a("mBgPaint");
        }
        paint.setColor(i);
        invalidate();
    }

    public final void setTextColor(int i) {
        TextPaint textPaint = this.f109134a;
        if (textPaint == null) {
            C52711k.m112237a("textPaint");
        }
        textPaint.setColor(i);
        invalidate();
    }

    public final void setTextSize(int i) {
        TextPaint textPaint = this.f109134a;
        if (textPaint == null) {
            C52711k.m112237a("textPaint");
        }
        textPaint.setTextSize((float) i);
        invalidate();
    }

    public final void setAttribute(C43172a aVar) {
        C52711k.m112240b(aVar, "attribute");
        this.f109145l = aVar.f109154g;
        this.f109146m = aVar.f109155h;
        this.f109143j = aVar.f109152e;
        this.f109142i = aVar.f109151d;
        this.f109139f = aVar.f109148a;
        this.f109140g = aVar.f109149b;
        this.f109141h = aVar.f109150c;
        this.f109147n = aVar.f109156i;
        Paint paint = this.f109136c;
        if (paint == null) {
            C52711k.m112237a("mBgPaint");
        }
        paint.setColor(this.f109146m);
        Paint paint2 = this.f109137d;
        if (paint2 == null) {
            C52711k.m112237a("anglePaint");
        }
        paint2.setColor(this.f109146m);
        TextPaint textPaint = this.f109134a;
        if (textPaint == null) {
            C52711k.m112237a("textPaint");
        }
        textPaint.setColor(this.f109145l);
        TextPaint textPaint2 = this.f109134a;
        if (textPaint2 == null) {
            C52711k.m112237a("textPaint");
        }
        textPaint2.setTextSize((float) this.f109147n);
        this.f109144k = aVar.f109153f;
        Paint paint3 = this.f109137d;
        if (paint3 == null) {
            C52711k.m112237a("anglePaint");
        }
        paint3.setPathEffect(new CornerPathEffect((float) this.f109144k));
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        if (!TextUtils.isEmpty(this.f109138e)) {
            TextPaint textPaint = this.f109134a;
            if (textPaint == null) {
                C52711k.m112237a("textPaint");
            }
            if (textPaint == null) {
                C52711k.m112234a();
            }
            int measureText = ((int) textPaint.measureText(this.f109138e)) + (this.f109142i * 2);
            Rect rect = new Rect();
            TextPaint textPaint2 = this.f109134a;
            if (textPaint2 == null) {
                C52711k.m112237a("textPaint");
            }
            String str = this.f109138e;
            String str2 = this.f109138e;
            if (str2 == null) {
                C52711k.m112234a();
            }
            textPaint2.getTextBounds(str, 0, str2.length(), rect);
            int height = rect.height() + (this.f109142i * 2);
            float f = (float) height;
            RectF rectF = new RectF((float) this.f109143j, 0.0f, (float) (this.f109143j + measureText), f);
            float f2 = (float) this.f109143j;
            float f3 = (float) this.f109143j;
            Paint paint = this.f109136c;
            if (paint == null) {
                C52711k.m112237a("mBgPaint");
            }
            canvas.drawRoundRect(rectF, f2, f3, paint);
            Path path = this.f109135b;
            if (path == null) {
                C52711k.m112237a("anglePath");
            }
            path.moveTo((float) (this.f109141h + this.f109139f + this.f109143j), f);
            Path path2 = this.f109135b;
            if (path2 == null) {
                C52711k.m112237a("anglePath");
            }
            path2.lineTo((float) (this.f109141h + (this.f109139f / 2) + this.f109143j), (float) (this.f109140g + height));
            Path path3 = this.f109135b;
            if (path3 == null) {
                C52711k.m112237a("anglePath");
            }
            path3.lineTo((float) (this.f109141h + this.f109143j), f);
            Path path4 = this.f109135b;
            if (path4 == null) {
                C52711k.m112237a("anglePath");
            }
            Paint paint2 = this.f109137d;
            if (paint2 == null) {
                C52711k.m112237a("anglePaint");
            }
            canvas.drawPath(path4, paint2);
            String str3 = this.f109138e;
            if (str3 == null) {
                C52711k.m112234a();
            }
            String str4 = this.f109138e;
            if (str4 == null) {
                C52711k.m112234a();
            }
            int length = str4.length();
            float f4 = (float) (this.f109142i + this.f109143j);
            float f5 = (float) ((height - this.f109142i) - 4);
            TextPaint textPaint3 = this.f109134a;
            if (textPaint3 == null) {
                C52711k.m112237a("textPaint");
            }
            if (textPaint3 == null) {
                C52711k.m112234a();
            }
            canvas.drawText(str3, 0, length, f4, f5, textPaint3);
        }
    }

    public DmtBubbleTextView(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet);
        this.f109134a = new TextPaint();
        TextPaint textPaint = this.f109134a;
        if (textPaint == null) {
            C52711k.m112237a("textPaint");
        }
        textPaint.setAntiAlias(true);
        this.f109136c = new Paint();
        this.f109135b = new Path();
        Paint paint = this.f109136c;
        if (paint == null) {
            C52711k.m112237a("mBgPaint");
        }
        paint.setAntiAlias(true);
        this.f109137d = new Paint();
        Paint paint2 = this.f109137d;
        if (paint2 == null) {
            C52711k.m112237a("anglePaint");
        }
        paint2.setAntiAlias(true);
        Typeface a = C10749b.m21787a().mo19435a(C10751d.f28908g);
        if (a != null) {
            try {
                TextPaint textPaint2 = this.f109134a;
                if (textPaint2 == null) {
                    C52711k.m112237a("textPaint");
                }
                textPaint2.setTypeface(a);
            } catch (Exception unused) {
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        if (TextUtils.isEmpty(this.f109138e)) {
            setMeasuredDimension(0, 0);
            return;
        }
        TextPaint textPaint = this.f109134a;
        if (textPaint == null) {
            C52711k.m112237a("textPaint");
        }
        if (textPaint == null) {
            C52711k.m112234a();
        }
        int measureText = ((int) textPaint.measureText(this.f109138e)) + (this.f109142i * 2) + (this.f109143j * 2);
        Rect rect = new Rect();
        TextPaint textPaint2 = this.f109134a;
        if (textPaint2 == null) {
            C52711k.m112237a("textPaint");
        }
        if (textPaint2 == null) {
            C52711k.m112234a();
        }
        String str = this.f109138e;
        String str2 = this.f109138e;
        if (str2 == null) {
            C52711k.m112234a();
        }
        textPaint2.getTextBounds(str, 0, str2.length(), rect);
        setMeasuredDimension(measureText, rect.height() + (this.f109142i * 2) + this.f109140g);
    }

    public /* synthetic */ DmtBubbleTextView(Context context, AttributeSet attributeSet, int i, C52707g gVar) {
        this(context, null);
    }
}
