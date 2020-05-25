package com.p683ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.RectCornerRelativeLayout */
public final class RectCornerRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private C31252k f81791a;

    public final C31252k getMRectCornerHelper() {
        return this.f81791a;
    }

    public final float getBottomLeftRadius() {
        return this.f81791a.f81853a[4];
    }

    public final float getBottomRightRadius() {
        return this.f81791a.f81853a[6];
    }

    public final int getStrokeColor() {
        return this.f81791a.f81858f;
    }

    public final int getStrokeWidth() {
        return this.f81791a.f81860h;
    }

    public final float getTopLeftRadius() {
        return this.f81791a.f81853a[0];
    }

    public final float getTopRightRadius() {
        return this.f81791a.f81853a[2];
    }

    public final void invalidate() {
        if (this.f81791a != null) {
            this.f81791a.mo64139a(this);
        }
        super.invalidate();
    }

    public final void setClipBackground(boolean z) {
        this.f81791a.f81861i = z;
        invalidate();
    }

    public final void setMRectCornerHelper(C31252k kVar) {
        C52711k.m112240b(kVar, "<set-?>");
        this.f81791a = kVar;
    }

    public final void setRoundAsCircle(boolean z) {
        this.f81791a.f81856d = z;
        invalidate();
    }

    public final void setStrokeColor(int i) {
        this.f81791a.f81858f = i;
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        this.f81791a.f81860h = i;
        invalidate();
    }

    public final void setBottomLeftRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f81791a.f81853a[6] = f;
        this.f81791a.f81853a[7] = f;
        invalidate();
    }

    public final void setBottomRightRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f81791a.f81853a[4] = f;
        this.f81791a.f81853a[5] = f;
        invalidate();
    }

    public final void setRadius(int i) {
        int length = this.f81791a.f81853a.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f81791a.f81853a[i2] = ((float) i) * 1.0f;
        }
        invalidate();
    }

    public final void setTopLeftRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f81791a.f81853a[0] = f;
        this.f81791a.f81853a[1] = f;
        invalidate();
    }

    public final void setTopRightRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f81791a.f81853a[2] = f;
        this.f81791a.f81853a[3] = f;
        invalidate();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "ev");
        int action = motionEvent.getAction();
        if (action == 0) {
            Region region = this.f81791a.f81862j;
            if (region == null) {
                C52711k.m112237a("mAreaRegion");
            }
            if (!region.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        if (action == 0 || action == 1) {
            refreshDrawableState();
        } else if (action == 3) {
            setPressed(false);
            refreshDrawableState();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void draw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        if (this.f81791a.f81861i) {
            canvas.save();
            Path path = this.f81791a.f81854b;
            if (path == null) {
                C52711k.m112237a("mClipPath");
            }
            canvas.clipPath(path);
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        RectF rectF = this.f81791a.f81863k;
        if (rectF == null) {
            C52711k.m112237a("mLayer");
        }
        canvas.saveLayer(rectF, null, 31);
        super.dispatchDraw(canvas);
        C31252k kVar = this.f81791a;
        C52711k.m112240b(canvas, "canvas");
        if (kVar.f81860h > 0) {
            Paint paint = kVar.f81855c;
            if (paint == null) {
                C52711k.m112237a("mPaint");
            }
            paint.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
            Paint paint2 = kVar.f81855c;
            if (paint2 == null) {
                C52711k.m112237a("mPaint");
            }
            paint2.setColor(-1);
            Paint paint3 = kVar.f81855c;
            if (paint3 == null) {
                C52711k.m112237a("mPaint");
            }
            paint3.setStrokeWidth((float) (kVar.f81860h * 2));
            Paint paint4 = kVar.f81855c;
            if (paint4 == null) {
                C52711k.m112237a("mPaint");
            }
            paint4.setStyle(Style.STROKE);
            Path path = kVar.f81854b;
            if (path == null) {
                C52711k.m112237a("mClipPath");
            }
            Paint paint5 = kVar.f81855c;
            if (paint5 == null) {
                C52711k.m112237a("mPaint");
            }
            canvas.drawPath(path, paint5);
            Paint paint6 = kVar.f81855c;
            if (paint6 == null) {
                C52711k.m112237a("mPaint");
            }
            paint6.setXfermode(new PorterDuffXfermode(Mode.SRC_OVER));
            Paint paint7 = kVar.f81855c;
            if (paint7 == null) {
                C52711k.m112237a("mPaint");
            }
            paint7.setColor(kVar.f81858f);
            Paint paint8 = kVar.f81855c;
            if (paint8 == null) {
                C52711k.m112237a("mPaint");
            }
            paint8.setStyle(Style.STROKE);
            Path path2 = kVar.f81854b;
            if (path2 == null) {
                C52711k.m112237a("mClipPath");
            }
            Paint paint9 = kVar.f81855c;
            if (paint9 == null) {
                C52711k.m112237a("mPaint");
            }
            canvas.drawPath(path2, paint9);
        }
        Paint paint10 = kVar.f81855c;
        if (paint10 == null) {
            C52711k.m112237a("mPaint");
        }
        paint10.setColor(-1);
        Paint paint11 = kVar.f81855c;
        if (paint11 == null) {
            C52711k.m112237a("mPaint");
        }
        paint11.setStyle(Style.FILL);
        if (VERSION.SDK_INT <= 27) {
            Paint paint12 = kVar.f81855c;
            if (paint12 == null) {
                C52711k.m112237a("mPaint");
            }
            paint12.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
            Path path3 = kVar.f81854b;
            if (path3 == null) {
                C52711k.m112237a("mClipPath");
            }
            Paint paint13 = kVar.f81855c;
            if (paint13 == null) {
                C52711k.m112237a("mPaint");
            }
            canvas.drawPath(path3, paint13);
        } else {
            Paint paint14 = kVar.f81855c;
            if (paint14 == null) {
                C52711k.m112237a("mPaint");
            }
            paint14.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
            Path path4 = new Path();
            RectF rectF2 = kVar.f81863k;
            if (rectF2 == null) {
                C52711k.m112237a("mLayer");
            }
            float width = rectF2.width();
            RectF rectF3 = kVar.f81863k;
            if (rectF3 == null) {
                C52711k.m112237a("mLayer");
            }
            path4.addRect(0.0f, 0.0f, width, rectF3.height(), Direction.CW);
            Path path5 = kVar.f81854b;
            if (path5 == null) {
                C52711k.m112237a("mClipPath");
            }
            path4.op(path5, Op.DIFFERENCE);
            Paint paint15 = kVar.f81855c;
            if (paint15 == null) {
                C52711k.m112237a("mPaint");
            }
            canvas.drawPath(path4, paint15);
        }
        canvas.restore();
    }

    public RectCornerRelativeLayout(Context context, AttributeSet attributeSet) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        this(context, attributeSet, 0);
    }

    public RectCornerRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        super(context, attributeSet, i);
        this.f81791a = new C31252k();
        this.f81791a = new C31252k();
        C31252k kVar = this.f81791a;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.f8, R.attr.a0_, R.attr.a0b, R.attr.a0c, R.attr.a0d, R.attr.a0e, R.attr.a0f, R.attr.a3n, R.attr.a3o});
        kVar.f81856d = obtainStyledAttributes.getBoolean(1, false);
        kVar.f81859g = obtainStyledAttributes.getColorStateList(7);
        if (kVar.f81859g != null) {
            ColorStateList colorStateList = kVar.f81859g;
            if (colorStateList == null) {
                C52711k.m112234a();
            }
            kVar.f81858f = colorStateList.getDefaultColor();
            ColorStateList colorStateList2 = kVar.f81859g;
            if (colorStateList2 == null) {
                C52711k.m112234a();
            }
            kVar.f81857e = colorStateList2.getDefaultColor();
        } else {
            kVar.f81858f = -1;
            kVar.f81857e = -1;
        }
        kVar.f81860h = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        kVar.f81861i = obtainStyledAttributes.getBoolean(0, false);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        obtainStyledAttributes.recycle();
        float f = (float) dimensionPixelSize2;
        kVar.f81853a[0] = f;
        kVar.f81853a[1] = f;
        float f2 = (float) dimensionPixelSize3;
        kVar.f81853a[2] = f2;
        kVar.f81853a[3] = f2;
        float f3 = (float) dimensionPixelSize5;
        kVar.f81853a[4] = f3;
        kVar.f81853a[5] = f3;
        float f4 = (float) dimensionPixelSize4;
        kVar.f81853a[6] = f4;
        kVar.f81853a[7] = f4;
        kVar.f81863k = new RectF();
        kVar.f81854b = new Path();
        kVar.f81862j = new Region();
        kVar.f81855c = new Paint();
        Paint paint = kVar.f81855c;
        if (paint == null) {
            C52711k.m112237a("mPaint");
        }
        paint.setColor(-1);
        Paint paint2 = kVar.f81855c;
        if (paint2 == null) {
            C52711k.m112237a("mPaint");
        }
        paint2.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C31252k kVar = this.f81791a;
        View view = this;
        C52711k.m112240b(view, "view");
        RectF rectF = kVar.f81863k;
        if (rectF == null) {
            C52711k.m112237a("mLayer");
        }
        rectF.set(0.0f, 0.0f, (float) i, (float) i2);
        kVar.mo64139a(view);
    }
}
