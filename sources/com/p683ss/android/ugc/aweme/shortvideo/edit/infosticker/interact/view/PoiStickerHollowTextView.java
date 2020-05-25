package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.PoiStickerHollowTextView */
public class PoiStickerHollowTextView extends View {

    /* renamed from: a */
    private String f110396a;

    /* renamed from: b */
    private float f110397b;

    /* renamed from: c */
    private Paint f110398c;

    /* renamed from: d */
    private Paint f110399d;

    /* renamed from: e */
    private Paint f110400e;

    /* renamed from: f */
    private Paint f110401f;

    /* renamed from: g */
    private Paint f110402g;

    /* renamed from: h */
    private float f110403h;

    /* renamed from: i */
    private int f110404i;

    /* renamed from: j */
    private int f110405j;

    /* renamed from: k */
    private RectF f110406k;

    /* renamed from: l */
    private String f110407l;

    /* renamed from: m */
    private float f110408m;

    /* renamed from: n */
    private int f110409n;

    /* renamed from: o */
    private int f110410o;

    /* renamed from: p */
    private int f110411p;

    public String getText() {
        return this.f110396a;
    }

    public int getTextViewWidth() {
        return ((int) this.f110398c.measureText(this.f110396a)) + ((int) this.f110401f.measureText(this.f110407l)) + this.f110410o + getPaddingLeft() + getPaddingRight();
    }

    public void setMaxWidth(int i) {
        this.f110409n = i;
    }

    public PoiStickerHollowTextView(Context context) {
        this(context, null);
    }

    public void setText(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f110396a = str;
            requestLayout();
            invalidate();
        }
    }

    public void setTextSize(float f) {
        this.f110397b = f;
        this.f110398c.setTextSize(this.f110397b);
        this.f110399d.setTextSize(this.f110397b);
        this.f110401f.setTextSize(this.f110397b * this.f110408m);
        this.f110402g.setTextSize(this.f110397b * this.f110408m);
        requestLayout();
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        this.f110406k.set(0.0f, 0.0f, (float) this.f110404i, (float) this.f110405j);
        String a = m95848a(this.f110396a, this.f110409n);
        if (VERSION.SDK_INT >= 21) {
            i = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null);
        } else {
            i = canvas.saveLayer(0.0f, 0.0f, (float) getMeasuredWidth(), (float) getMeasuredHeight(), null, 31);
        }
        this.f110398c.setXfermode(new PorterDuffXfermode(Mode.SRC));
        canvas.drawRoundRect(this.f110406k, this.f110403h, this.f110403h, this.f110400e);
        this.f110398c.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        this.f110401f.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        FontMetrics fontMetrics = this.f110398c.getFontMetrics();
        int measuredHeight = (int) ((((((float) getMeasuredHeight()) - fontMetrics.bottom) + fontMetrics.top) / 2.0f) - fontMetrics.top);
        FontMetrics fontMetrics2 = this.f110401f.getFontMetrics();
        float measuredHeight2 = (float) ((int) ((((((float) getMeasuredHeight()) - fontMetrics2.bottom) + fontMetrics2.top) / 2.0f) - fontMetrics2.top));
        canvas.drawText(this.f110407l, (float) getPaddingLeft(), measuredHeight2, this.f110401f);
        canvas.drawText(this.f110407l, (float) getPaddingLeft(), measuredHeight2, this.f110402g);
        float measureText = this.f110401f.measureText(this.f110407l);
        float f = (float) measuredHeight;
        canvas.drawText(a, ((float) getPaddingLeft()) + measureText + ((float) this.f110410o), f, this.f110398c);
        canvas.drawText(a, ((float) getPaddingLeft()) + measureText + ((float) this.f110410o), f, this.f110399d);
        canvas.restoreToCount(i);
    }

    public PoiStickerHollowTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private String m95848a(String str, int i) {
        int measureText = (int) this.f110398c.measureText("...");
        int measureText2 = (int) ((((((float) i) - this.f110401f.measureText(this.f110407l)) - ((float) getPaddingLeft())) - ((float) getPaddingRight())) - ((float) this.f110410o));
        if (((int) this.f110398c.measureText(str)) <= measureText2) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (((float) measureText2) - this.f110398c.measureText(sb.toString()) < ((float) measureText)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str.substring(0, i2));
                sb2.append("...");
                return sb2.toString();
            }
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        String a = m95848a(this.f110396a, this.f110409n);
        Rect rect = new Rect();
        this.f110398c.getTextBounds(a, 0, a.length(), rect);
        this.f110404i = rect.width() + ((int) this.f110401f.measureText(this.f110407l)) + this.f110410o + getPaddingLeft() + getPaddingRight();
        this.f110405j = rect.height() + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(this.f110404i, this.f110405j);
    }

    public PoiStickerHollowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f110397b = 15.0f;
        this.f110408m = 0.7f;
        this.f110397b = (float) ((int) C9432q.m18687b(context, 28.0f));
        this.f110403h = C9432q.m18687b(context, 5.0f);
        this.f110410o = (int) C9432q.m18687b(context, 10.0f);
        this.f110411p = (int) C9432q.m18687b(context, 6.0f);
        this.f110398c = new Paint();
        this.f110398c.setTextSize(this.f110397b);
        this.f110398c.setAntiAlias(true);
        this.f110398c.setFakeBoldText(true);
        this.f110398c.setColor(-16777216);
        this.f110399d = new Paint(this.f110398c);
        this.f110399d.setColor(1073741824);
        this.f110400e = new Paint(this.f110398c);
        this.f110400e.setColor(-1);
        this.f110401f = new Paint(this.f110398c);
        this.f110401f.setTextSize(this.f110397b * this.f110408m);
        this.f110402g = new Paint(this.f110399d);
        this.f110402g.setTextSize(this.f110397b * this.f110408m);
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "poi_sticker_iconfont.ttf");
            this.f110401f.setTypeface(createFromAsset);
            this.f110402g.setTypeface(createFromAsset);
        } catch (Exception unused) {
        }
        this.f110406k = new RectF();
        this.f110407l = context.getResources().getString(R.string.ct4);
    }
}
