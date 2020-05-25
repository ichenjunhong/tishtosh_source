package com.p683ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.ss.android.ugc.trill.R;
import java.math.BigDecimal;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.RatingBar */
public class RatingBar extends LinearLayout {

    /* renamed from: a */
    boolean f100944a;

    /* renamed from: b */
    float f100945b;

    /* renamed from: c */
    Drawable f100946c;

    /* renamed from: d */
    C39475c f100947d;

    /* renamed from: e */
    private int f100948e;

    /* renamed from: f */
    private C39473a f100949f;

    /* renamed from: g */
    private C39474b f100950g;

    /* renamed from: h */
    private float f100951h;

    /* renamed from: i */
    private float f100952i;

    /* renamed from: j */
    private Drawable f100953j;

    /* renamed from: k */
    private Drawable f100954k;

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.RatingBar$a */
    public interface C39473a {
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.RatingBar$b */
    public interface C39474b {
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.widget.RatingBar$c */
    public enum C39475c {
        Half(0),
        Full(1);
        

        /* renamed from: a */
        int f100956a;

        public static C39475c fromStep(int i) {
            C39475c[] values;
            for (C39475c cVar : values()) {
                if (cVar.f100956a == i) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException();
        }

        private C39475c(int i) {
            this.f100956a = i;
        }
    }

    private ImageView getStarImageView() {
        ImageView imageView = new ImageView(getContext());
        LayoutParams layoutParams = new LayoutParams(Math.round(this.f100951h), Math.round(this.f100951h));
        layoutParams.setMargins(0, 0, Math.round(this.f100952i), 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ScaleType.FIT_CENTER);
        imageView.setImageDrawable(this.f100953j);
        imageView.setMinimumWidth(10);
        imageView.setMaxHeight(10);
        return imageView;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        for (int i = 0; i < this.f100948e; i++) {
            ImageView starImageView = getStarImageView();
            starImageView.setImageDrawable(this.f100953j);
            starImageView.setOnClickListener(new C39493g(this, starImageView));
            addView(starImageView);
        }
        setStar(this.f100945b);
    }

    public void setClickable(boolean z) {
        this.f100944a = z;
    }

    public void setOnRatingChangeListener(C39473a aVar) {
        this.f100949f = aVar;
    }

    public void setStarCount(int i) {
        this.f100948e = i;
    }

    public void setStarEmptyDrawable(Drawable drawable) {
        this.f100953j = drawable;
    }

    public void setStarFillDrawable(Drawable drawable) {
        this.f100954k = drawable;
    }

    public void setStarHalfDrawable(Drawable drawable) {
        this.f100946c = drawable;
    }

    public void setStarImageSize(float f) {
        this.f100951h = f;
    }

    public void setStarPadding(float f) {
        this.f100952i = f;
    }

    public void setStarStep(float f) {
        this.f100945b = f;
    }

    public void setUnClickableClickListener(C39474b bVar) {
        this.f100950g = bVar;
    }

    public RatingBar(Context context) {
        this(context, null);
    }

    public void setStepSize(int i) {
        this.f100947d = C39475c.fromStep(i);
    }

    public void setStar(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 5.0f) {
            f = 5.0f;
        }
        this.f100945b = f;
        int i = (int) f;
        float floatValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Integer.toString(i))).floatValue();
        for (int i2 = 0; i2 < i; i2++) {
            ((ImageView) getChildAt(i2)).setImageDrawable(this.f100954k);
        }
        for (int i3 = i; i3 < this.f100948e; i3++) {
            ((ImageView) getChildAt(i3)).setImageDrawable(this.f100953j);
        }
        if (floatValue > 0.0f) {
            ((ImageView) getChildAt(i)).setImageDrawable(this.f100946c);
        }
    }

    public RatingBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.f6, R.attr.a2y, R.attr.a2z, R.attr.a30, R.attr.a31, R.attr.a32, R.attr.a33, R.attr.a34, R.attr.a3k});
            this.f100951h = obtainStyledAttributes.getDimension(5, 20.0f);
            this.f100952i = obtainStyledAttributes.getDimension(6, 10.0f);
            this.f100945b = obtainStyledAttributes.getFloat(7, 1.0f);
            this.f100947d = C39475c.fromStep(obtainStyledAttributes.getInt(8, 1));
            this.f100948e = obtainStyledAttributes.getInteger(1, 5);
            this.f100953j = obtainStyledAttributes.getDrawable(2);
            this.f100954k = obtainStyledAttributes.getDrawable(3);
            this.f100946c = obtainStyledAttributes.getDrawable(4);
            this.f100944a = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
    }
}
