package com.bytedance.ies.dmt.p664ui.widget;

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

/* renamed from: com.bytedance.ies.dmt.ui.widget.RectCornerRelativeLayout */
public final class RectCornerRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private C10727g f28689a;

    public final C10727g getMRectCornerHelper() {
        return this.f28689a;
    }

    public final float getBottomLeftRadius() {
        return this.f28689a.f28713a[4];
    }

    public final float getBottomRightRadius() {
        return this.f28689a.f28713a[6];
    }

    public final int getStrokeColor() {
        return this.f28689a.f28718f;
    }

    public final int getStrokeWidth() {
        return this.f28689a.f28720h;
    }

    public final float getTopLeftRadius() {
        return this.f28689a.f28713a[0];
    }

    public final float getTopRightRadius() {
        return this.f28689a.f28713a[2];
    }

    public final void invalidate() {
        if (this.f28689a != null) {
            this.f28689a.mo19284a(this);
        }
        super.invalidate();
    }

    public final void setClipBackground(boolean z) {
        this.f28689a.f28721i = z;
        invalidate();
    }

    public final void setMRectCornerHelper(C10727g gVar) {
        C52711k.m112240b(gVar, "<set-?>");
        this.f28689a = gVar;
    }

    public final void setRoundAsCircle(boolean z) {
        this.f28689a.f28716d = z;
        invalidate();
    }

    public final void setStrokeColor(int i) {
        this.f28689a.f28718f = i;
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        this.f28689a.f28720h = i;
        invalidate();
    }

    public final void setBottomLeftRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f28689a.f28713a[6] = f;
        this.f28689a.f28713a[7] = f;
        invalidate();
    }

    public final void setBottomRightRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f28689a.f28713a[4] = f;
        this.f28689a.f28713a[5] = f;
        invalidate();
    }

    public final void setRadius(int i) {
        int length = this.f28689a.f28713a.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f28689a.f28713a[i2] = ((float) i) * 1.0f;
        }
        invalidate();
    }

    public final void setTopLeftRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f28689a.f28713a[0] = f;
        this.f28689a.f28713a[1] = f;
        invalidate();
    }

    public final void setTopRightRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f28689a.f28713a[2] = f;
        this.f28689a.f28713a[3] = f;
        invalidate();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C52711k.m112240b(motionEvent, "ev");
        int action = motionEvent.getAction();
        if (action == 0) {
            Region region = this.f28689a.f28722j;
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
        if (this.f28689a.f28721i) {
            canvas.save();
            Path path = this.f28689a.f28714b;
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
        RectF rectF = this.f28689a.f28723k;
        if (rectF == null) {
            C52711k.m112237a("mLayer");
        }
        canvas.saveLayer(rectF, null, 31);
        super.dispatchDraw(canvas);
        C10727g gVar = this.f28689a;
        C52711k.m112240b(canvas, "canvas");
        if (gVar.f28720h > 0) {
            Paint paint = gVar.f28715c;
            if (paint == null) {
                C52711k.m112237a("mPaint");
            }
            paint.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
            Paint paint2 = gVar.f28715c;
            if (paint2 == null) {
                C52711k.m112237a("mPaint");
            }
            paint2.setColor(-1);
            Paint paint3 = gVar.f28715c;
            if (paint3 == null) {
                C52711k.m112237a("mPaint");
            }
            paint3.setStrokeWidth((float) (gVar.f28720h * 2));
            Paint paint4 = gVar.f28715c;
            if (paint4 == null) {
                C52711k.m112237a("mPaint");
            }
            paint4.setStyle(Style.STROKE);
            Path path = gVar.f28714b;
            if (path == null) {
                C52711k.m112237a("mClipPath");
            }
            Paint paint5 = gVar.f28715c;
            if (paint5 == null) {
                C52711k.m112237a("mPaint");
            }
            canvas.drawPath(path, paint5);
            Paint paint6 = gVar.f28715c;
            if (paint6 == null) {
                C52711k.m112237a("mPaint");
            }
            paint6.setXfermode(new PorterDuffXfermode(Mode.SRC_OVER));
            Paint paint7 = gVar.f28715c;
            if (paint7 == null) {
                C52711k.m112237a("mPaint");
            }
            paint7.setColor(gVar.f28718f);
            Paint paint8 = gVar.f28715c;
            if (paint8 == null) {
                C52711k.m112237a("mPaint");
            }
            paint8.setStyle(Style.STROKE);
            Path path2 = gVar.f28714b;
            if (path2 == null) {
                C52711k.m112237a("mClipPath");
            }
            Paint paint9 = gVar.f28715c;
            if (paint9 == null) {
                C52711k.m112237a("mPaint");
            }
            canvas.drawPath(path2, paint9);
        }
        Paint paint10 = gVar.f28715c;
        if (paint10 == null) {
            C52711k.m112237a("mPaint");
        }
        paint10.setColor(-1);
        Paint paint11 = gVar.f28715c;
        if (paint11 == null) {
            C52711k.m112237a("mPaint");
        }
        paint11.setStyle(Style.FILL);
        if (VERSION.SDK_INT <= 27) {
            Paint paint12 = gVar.f28715c;
            if (paint12 == null) {
                C52711k.m112237a("mPaint");
            }
            paint12.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
            Path path3 = gVar.f28714b;
            if (path3 == null) {
                C52711k.m112237a("mClipPath");
            }
            Paint paint13 = gVar.f28715c;
            if (paint13 == null) {
                C52711k.m112237a("mPaint");
            }
            canvas.drawPath(path3, paint13);
        } else {
            Paint paint14 = gVar.f28715c;
            if (paint14 == null) {
                C52711k.m112237a("mPaint");
            }
            paint14.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
            Path path4 = new Path();
            RectF rectF2 = gVar.f28723k;
            if (rectF2 == null) {
                C52711k.m112237a("mLayer");
            }
            float width = rectF2.width();
            RectF rectF3 = gVar.f28723k;
            if (rectF3 == null) {
                C52711k.m112237a("mLayer");
            }
            path4.addRect(0.0f, 0.0f, width, rectF3.height(), Direction.CW);
            Path path5 = gVar.f28714b;
            if (path5 == null) {
                C52711k.m112237a("mClipPath");
            }
            path4.op(path5, Op.DIFFERENCE);
            Paint paint15 = gVar.f28715c;
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
        this.f28689a = new C10727g();
        this.f28689a = new C10727g();
        C10727g gVar = this.f28689a;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(attributeSet, "attrs");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.f8, R.attr.a0_, R.attr.a0b, R.attr.a0c, R.attr.a0d, R.attr.a0e, R.attr.a0f, R.attr.a3n, R.attr.a3o});
        gVar.f28716d = obtainStyledAttributes.getBoolean(1, false);
        gVar.f28719g = obtainStyledAttributes.getColorStateList(7);
        if (gVar.f28719g != null) {
            ColorStateList colorStateList = gVar.f28719g;
            if (colorStateList == null) {
                C52711k.m112234a();
            }
            gVar.f28718f = colorStateList.getDefaultColor();
            ColorStateList colorStateList2 = gVar.f28719g;
            if (colorStateList2 == null) {
                C52711k.m112234a();
            }
            gVar.f28717e = colorStateList2.getDefaultColor();
        } else {
            gVar.f28718f = -1;
            gVar.f28717e = -1;
        }
        gVar.f28720h = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        gVar.f28721i = obtainStyledAttributes.getBoolean(0, false);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        obtainStyledAttributes.recycle();
        float f = (float) dimensionPixelSize2;
        gVar.f28713a[0] = f;
        gVar.f28713a[1] = f;
        float f2 = (float) dimensionPixelSize3;
        gVar.f28713a[2] = f2;
        gVar.f28713a[3] = f2;
        float f3 = (float) dimensionPixelSize5;
        gVar.f28713a[4] = f3;
        gVar.f28713a[5] = f3;
        float f4 = (float) dimensionPixelSize4;
        gVar.f28713a[6] = f4;
        gVar.f28713a[7] = f4;
        gVar.f28723k = new RectF();
        gVar.f28714b = new Path();
        gVar.f28722j = new Region();
        gVar.f28715c = new Paint();
        Paint paint = gVar.f28715c;
        if (paint == null) {
            C52711k.m112237a("mPaint");
        }
        paint.setColor(-1);
        Paint paint2 = gVar.f28715c;
        if (paint2 == null) {
            C52711k.m112237a("mPaint");
        }
        paint2.setAntiAlias(true);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C10727g gVar = this.f28689a;
        View view = this;
        C52711k.m112240b(view, "view");
        RectF rectF = gVar.f28723k;
        if (rectF == null) {
            C52711k.m112237a("mLayer");
        }
        rectF.set(0.0f, 0.0f, (float) i, (float) i2);
        gVar.mo19284a(view);
    }
}
