package com.p683ss.android.ugc.aweme.p1308ad.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.ad.view.AdRatingView */
public final class AdRatingView extends View {

    /* renamed from: a */
    private Drawable f60442a;

    /* renamed from: b */
    private Drawable f60443b;

    /* renamed from: c */
    private float f60444c;

    /* renamed from: d */
    private int f60445d;

    /* renamed from: e */
    private int f60446e;

    public AdRatingView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final int getRatingDivide() {
        return this.f60446e;
    }

    public final Drawable getRatingImage() {
        return this.f60443b;
    }

    public final float getRatingProgress() {
        return this.f60444c;
    }

    public final int getRatingStarNumber() {
        return this.f60445d;
    }

    public final Drawable getRatingUnImage() {
        return this.f60442a;
    }

    public final void setRatingDivide(int i) {
        this.f60446e = i;
        invalidate();
    }

    public final void setRatingProgress(float f) {
        this.f60444c = f;
        invalidate();
    }

    public final void setRatingStarNumber(int i) {
        this.f60445d = i;
        invalidate();
    }

    public final void setRatingImage(Drawable drawable) {
        C52711k.m112240b(drawable, "value");
        this.f60443b = drawable;
        invalidate();
    }

    public final void setRatingUnImage(Drawable drawable) {
        C52711k.m112240b(drawable, "value");
        this.f60442a = drawable;
        invalidate();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (canvas != null) {
            float intrinsicHeight = ((float) ((((int) this.f60444c) * this.f60442a.getIntrinsicHeight()) + (((int) this.f60444c) * this.f60446e))) + ((this.f60444c - ((float) ((int) this.f60444c))) * ((float) this.f60442a.getIntrinsicWidth()));
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, intrinsicHeight, (float) this.f60443b.getIntrinsicHeight());
            int i = this.f60445d;
            for (int i2 = 0; i2 < i; i2++) {
                int intrinsicWidth = (this.f60443b.getIntrinsicWidth() * i2) + (this.f60446e * i2);
                this.f60443b.setBounds(intrinsicWidth, 0, this.f60443b.getIntrinsicWidth() + intrinsicWidth, this.f60443b.getIntrinsicHeight());
                this.f60443b.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            canvas.clipRect(intrinsicHeight, 0.0f, (float) getWidth(), (float) this.f60442a.getIntrinsicHeight());
            int i3 = this.f60445d;
            for (int i4 = 0; i4 < i3; i4++) {
                int intrinsicWidth2 = (this.f60442a.getIntrinsicWidth() * i4) + (this.f60446e * i4);
                this.f60442a.setBounds(intrinsicWidth2, 0, this.f60442a.getIntrinsicWidth() + intrinsicWidth2, this.f60442a.getIntrinsicHeight());
                this.f60442a.draw(canvas);
            }
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        int mode = MeasureSpec.getMode(i);
        int i4 = 0;
        if (mode == Integer.MIN_VALUE) {
            i3 = (this.f60442a.getIntrinsicWidth() * this.f60445d) + ((this.f60445d - 1) * this.f60446e);
        } else if (mode == 0) {
            i3 = MeasureSpec.getSize(i);
        } else if (mode != 1073741824) {
            i3 = 0;
        } else {
            i3 = MeasureSpec.getSize(i);
        }
        int mode2 = MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            i4 = this.f60442a.getIntrinsicHeight();
        } else if (mode2 == 0) {
            i4 = MeasureSpec.getSize(i2);
        } else if (mode2 == 1073741824) {
            i4 = MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(i3, i4);
    }

    public AdRatingView(Context context, AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        if (VERSION.SDK_INT >= 21) {
            drawable = context.getResources().getDrawable(R.drawable.bcf, null);
            C52711k.m112236a((Object) drawable, "context.resources.getDra…le.star_un_shining, null)");
        } else {
            drawable = context.getResources().getDrawable(R.drawable.bcf);
            C52711k.m112236a((Object) drawable, "context.resources.getDra…drawable.star_un_shining)");
        }
        this.f60442a = drawable;
        if (VERSION.SDK_INT >= 21) {
            drawable2 = context.getResources().getDrawable(R.drawable.bce, null);
            C52711k.m112236a((Object) drawable2, "context.resources.getDra…wable.star_shining, null)");
        } else {
            drawable2 = context.getResources().getDrawable(R.drawable.bce);
            C52711k.m112236a((Object) drawable2, "context.resources.getDra…(R.drawable.star_shining)");
        }
        this.f60443b = drawable2;
        this.f60445d = 5;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.xv, R.attr.xz, R.attr.y0, R.attr.y1, R.attr.y2, R.attr.y3});
            Drawable drawable3 = obtainStyledAttributes.getDrawable(2);
            if (drawable3 != null) {
                setRatingImage(drawable3);
            }
            Drawable drawable4 = obtainStyledAttributes.getDrawable(5);
            if (drawable4 != null) {
                setRatingUnImage(drawable4);
            }
            setRatingProgress(obtainStyledAttributes.getFloat(3, this.f60444c));
            setRatingStarNumber(obtainStyledAttributes.getInt(4, this.f60445d));
            setRatingDivide(obtainStyledAttributes.getDimensionPixelSize(1, this.f60446e));
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ AdRatingView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
