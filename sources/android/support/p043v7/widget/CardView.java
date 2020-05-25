package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.CardView */
public class CardView extends FrameLayout {

    /* renamed from: e */
    private static final int[] f4499e = {16842801};

    /* renamed from: f */
    private static final C1500s f4500f;

    /* renamed from: a */
    int f4501a;

    /* renamed from: b */
    int f4502b;

    /* renamed from: c */
    final Rect f4503c;

    /* renamed from: d */
    final Rect f4504d;

    /* renamed from: g */
    private boolean f4505g;

    /* renamed from: h */
    private boolean f4506h;

    /* renamed from: i */
    private final C1499r f4507i;

    public boolean getPreventCornerOverlap() {
        return this.f4506h;
    }

    public boolean getUseCompatPadding() {
        return this.f4505g;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public int getContentPaddingBottom() {
        return this.f4503c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f4503c.left;
    }

    public int getContentPaddingRight() {
        return this.f4503c.right;
    }

    public int getContentPaddingTop() {
        return this.f4503c.top;
    }

    public ColorStateList getCardBackgroundColor() {
        return f4500f.mo5827h(this.f4507i);
    }

    public float getCardElevation() {
        return f4500f.mo5824e(this.f4507i);
    }

    public float getMaxCardElevation() {
        return f4500f.mo5815a(this.f4507i);
    }

    public float getRadius() {
        return f4500f.mo5823d(this.f4507i);
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f4500f = new C1496p();
        } else if (VERSION.SDK_INT >= 17) {
            f4500f = new C1494o();
        } else {
            f4500f = new C1497q();
        }
        f4500f.mo5814a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f4500f.mo5818a(this.f4507i, colorStateList);
    }

    public void setCardElevation(float f) {
        f4500f.mo5822c(this.f4507i, f);
    }

    public void setMaxCardElevation(float f) {
        f4500f.mo5820b(this.f4507i, f);
    }

    public void setMinimumHeight(int i) {
        this.f4502b = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f4501a = i;
        super.setMinimumWidth(i);
    }

    public void setRadius(float f) {
        f4500f.mo5816a(this.f4507i, f);
    }

    public void setCardBackgroundColor(int i) {
        f4500f.mo5818a(this.f4507i, ColorStateList.valueOf(i));
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f4506h) {
            this.f4506h = z;
            f4500f.mo5826g(this.f4507i);
        }
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f4505g != z) {
            this.f4505g = z;
            f4500f.mo5825f(this.f4507i);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.e9);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(f4500f instanceof C1496p)) {
            int mode = MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f4500f.mo5819b(this.f4507i)), MeasureSpec.getSize(i)), mode);
            }
            int mode2 = MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f4500f.mo5821c(this.f4507i)), MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        int i2;
        ColorStateList valueOf;
        float f;
        super(context, attributeSet, i);
        this.f4503c = new Rect();
        this.f4504d = new Rect();
        this.f4507i = new C1499r() {

            /* renamed from: b */
            private Drawable f4509b;

            /* renamed from: c */
            public final Drawable mo4646c() {
                return this.f4509b;
            }

            /* renamed from: d */
            public final View mo4647d() {
                return CardView.this;
            }

            /* renamed from: b */
            public final boolean mo4645b() {
                return CardView.this.getPreventCornerOverlap();
            }

            /* renamed from: a */
            public final boolean mo4644a() {
                return CardView.this.getUseCompatPadding();
            }

            /* renamed from: a */
            public final void mo4643a(Drawable drawable) {
                this.f4509b = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            /* renamed from: a */
            public final void mo4641a(int i, int i2) {
                if (i > CardView.this.f4501a) {
                    CardView.super.setMinimumWidth(i);
                }
                if (i2 > CardView.this.f4502b) {
                    CardView.super.setMinimumHeight(i2);
                }
            }

            /* renamed from: a */
            public final void mo4642a(int i, int i2, int i3, int i4) {
                CardView.this.f4504d.set(i, i2, i3, i4);
                CardView cardView = CardView.this;
                CardView.super.setPadding(i + cardView.f4503c.left, i2 + CardView.this.f4503c.top, i3 + CardView.this.f4503c.right, i4 + CardView.this.f4503c.bottom);
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843071, 16843072, R.attr.e3, R.attr.e4, R.attr.e5, R.attr.e6, R.attr.e7, R.attr.e8, R.attr.ia, R.attr.ib, R.attr.ic, R.attr.id, R.attr.ie}, i, R.style.g5);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f4499e);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                i2 = getResources().getColor(R.color.el);
            } else {
                i2 = getResources().getColor(R.color.ek);
            }
            valueOf = ColorStateList.valueOf(i2);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f4505g = obtainStyledAttributes.getBoolean(7, false);
        this.f4506h = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f4503c.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        this.f4503c.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        this.f4503c.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        this.f4503c.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        if (dimension2 > dimension3) {
            f = dimension2;
        } else {
            f = dimension3;
        }
        this.f4501a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f4502b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        f4500f.mo5817a(this.f4507i, context, colorStateList, dimension, dimension2, f);
    }
}
