package com.bytedance.ies.uikit.textview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.TypedValue;

/* renamed from: com.bytedance.ies.uikit.textview.a */
public final class C11158a extends Drawable {

    /* renamed from: i */
    private static final int[] f30092i = {16842804};

    /* renamed from: j */
    private static final int[] f30093j = {16842901, 16842902, 16842903, 16842904};

    /* renamed from: a */
    public Alignment f30094a = Alignment.ALIGN_NORMAL;

    /* renamed from: b */
    public CharSequence f30095b = "";

    /* renamed from: c */
    private Resources f30096c;

    /* renamed from: d */
    private TextPaint f30097d;

    /* renamed from: e */
    private StaticLayout f30098e;

    /* renamed from: f */
    private Path f30099f;

    /* renamed from: g */
    private ColorStateList f30100g;

    /* renamed from: h */
    private Rect f30101h;

    public final int getOpacity() {
        return this.f30097d.getAlpha();
    }

    public final boolean isStateful() {
        return this.f30100g.isStateful();
    }

    public final int getIntrinsicHeight() {
        if (this.f30101h.isEmpty()) {
            return -1;
        }
        return this.f30101h.bottom - this.f30101h.top;
    }

    public final int getIntrinsicWidth() {
        if (this.f30101h.isEmpty()) {
            return -1;
        }
        return this.f30101h.right - this.f30101h.left;
    }

    /* renamed from: a */
    private void m22556a() {
        if (this.f30099f != null) {
            this.f30098e = null;
            this.f30101h.setEmpty();
        } else {
            StaticLayout staticLayout = new StaticLayout(this.f30095b, this.f30097d, (int) Math.ceil((double) Layout.getDesiredWidth(this.f30095b, this.f30097d)), this.f30094a, 1.0f, 0.0f, true);
            this.f30098e = staticLayout;
            this.f30101h.set(0, 0, this.f30098e.getWidth(), this.f30098e.getHeight());
        }
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo20478a(int i) {
        m22557a(ColorStateList.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        this.f30101h.set(rect);
    }

    /* access modifiers changed from: protected */
    public final boolean onStateChange(int[] iArr) {
        return m22559a(iArr);
    }

    /* renamed from: a */
    private void m22557a(ColorStateList colorStateList) {
        this.f30100g = colorStateList;
        m22559a(getState());
    }

    public final void setAlpha(int i) {
        if (this.f30097d.getAlpha() != i) {
            this.f30097d.setAlpha(i);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f30097d.getColorFilter() != colorFilter) {
            this.f30097d.setColorFilter(colorFilter);
        }
    }

    /* renamed from: a */
    private void m22558a(Typeface typeface) {
        if (this.f30097d.getTypeface() != typeface) {
            this.f30097d.setTypeface(typeface);
            m22556a();
        }
    }

    /* renamed from: b */
    private void m22560b(float f) {
        if (f != this.f30097d.getTextSize()) {
            this.f30097d.setTextSize(f);
            m22556a();
        }
    }

    /* renamed from: a */
    private boolean m22559a(int[] iArr) {
        int colorForState = this.f30100g.getColorForState(iArr, -1);
        if (this.f30097d.getColor() == colorForState) {
            return false;
        }
        this.f30097d.setColor(colorForState);
        return true;
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.translate((float) bounds.left, (float) bounds.top);
        if (this.f30099f == null) {
            this.f30098e.draw(canvas);
        } else {
            canvas.drawTextOnPath(this.f30095b.toString(), this.f30099f, 0.0f, 0.0f, this.f30097d);
        }
        canvas.restoreToCount(save);
    }

    public C11158a(Context context) {
        TypedArray typedArray;
        int i;
        int i2;
        ColorStateList colorStateList;
        Typeface typeface;
        int i3;
        this.f30096c = context.getResources();
        this.f30101h = new Rect();
        boolean z = true;
        this.f30097d = new TextPaint(1);
        this.f30097d.density = this.f30096c.getDisplayMetrics().density;
        this.f30097d.setDither(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(f30092i);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        Typeface typeface2 = null;
        if (resourceId != -1) {
            typedArray = context.obtainStyledAttributes(resourceId, f30093j);
        } else {
            typedArray = null;
        }
        int i4 = 15;
        if (typedArray != null) {
            colorStateList = null;
            int i5 = 15;
            i2 = -1;
            i = -1;
            for (int i6 = 0; i6 < typedArray.getIndexCount(); i6++) {
                int index = typedArray.getIndex(i6);
                switch (index) {
                    case 0:
                        i5 = obtainStyledAttributes.getDimensionPixelSize(index, i5);
                        break;
                    case 1:
                        i2 = obtainStyledAttributes.getInt(index, i2);
                        break;
                    case 2:
                        i = obtainStyledAttributes.getInt(index, i);
                        break;
                    case 3:
                        colorStateList = obtainStyledAttributes.getColorStateList(index);
                        break;
                }
            }
            typedArray.recycle();
            i4 = i5;
        } else {
            colorStateList = null;
            i2 = -1;
            i = -1;
        }
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(-16777216);
        }
        m22557a(colorStateList);
        m22560b((float) i4);
        switch (i2) {
            case 1:
                typeface2 = Typeface.SANS_SERIF;
                break;
            case 2:
                typeface2 = Typeface.SERIF;
                break;
            case 3:
                typeface2 = Typeface.MONOSPACE;
                break;
        }
        float f = 0.0f;
        if (i > 0) {
            if (typeface2 == null) {
                typeface = Typeface.defaultFromStyle(i);
            } else {
                typeface = Typeface.create(typeface2, i);
            }
            m22558a(typeface);
            if (typeface != null) {
                i3 = typeface.getStyle();
            } else {
                i3 = 0;
            }
            int i7 = (i3 ^ -1) & i;
            TextPaint textPaint = this.f30097d;
            if ((i7 & 1) == 0) {
                z = false;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f30097d;
            if ((i7 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f30097d.setFakeBoldText(false);
        this.f30097d.setTextSkewX(0.0f);
        m22558a(typeface2);
    }

    /* renamed from: a */
    public final void mo20477a(float f) {
        m22560b(TypedValue.applyDimension(2, 15.0f, this.f30096c.getDisplayMetrics()));
    }

    /* renamed from: a */
    public final void mo20479a(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        this.f30095b = charSequence;
        m22556a();
    }
}
