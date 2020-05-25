package com.p683ss.android.ugc.aweme.unread;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.unread.UnReadCircleView */
public final class UnReadCircleView extends FrameLayout {

    /* renamed from: a */
    private float f119779a;

    /* renamed from: b */
    private float f119780b;

    /* renamed from: c */
    private float f119781c;

    /* renamed from: d */
    private float f119782d;

    /* renamed from: e */
    private Paint f119783e;

    /* renamed from: f */
    private final LottieAnimationView f119784f;

    public UnReadCircleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public UnReadCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f119784f.mo6660e()) {
            this.f119784f.mo6661f();
            this.f119784f.setVisibility(8);
        }
    }

    public final void setStrokeWidth(float f) {
        this.f119783e.setStrokeWidth(f);
        this.f119779a = f;
    }

    public final void setLoadingAnim(String str) {
        C52711k.m112240b(str, "anim");
        this.f119784f.setAnimation(str);
    }

    public final void setStrokeColor(int i) {
        this.f119783e.setColor(getResources().getColor(i));
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f119784f.getVisibility() != 0) {
            canvas.drawCircle(this.f119780b, this.f119781c, this.f119782d, this.f119783e);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f119780b = ((float) getMeasuredWidth()) / 2.0f;
        this.f119781c = ((float) getMeasuredHeight()) / 2.0f;
        this.f119782d = ((float) (getMeasuredHeight() / 2)) - (this.f119779a / 2.0f);
    }

    public UnReadCircleView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a3l, R.attr.a3m});
        this.f119779a = (float) obtainStyledAttributes.getDimensionPixelSize(1, (int) C9432q.m18687b(context, 2.0f));
        obtainStyledAttributes.recycle();
        setBackgroundColor(getResources().getColor(R.color.a8w));
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(R.color.a36));
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Style.STROKE);
        paint.setStrokeWidth(this.f119779a);
        this.f119783e = paint;
        this.f119784f = new LottieAnimationView(context);
        this.f119784f.setAnimation("story_upload_loading_yellow_lottie.json");
        this.f119784f.mo6656b(true);
        this.f119784f.setRepeatCount(-1);
        this.f119784f.setVisibility(8);
        addView(this.f119784f, new LayoutParams(-1, -1));
    }

    public /* synthetic */ UnReadCircleView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
