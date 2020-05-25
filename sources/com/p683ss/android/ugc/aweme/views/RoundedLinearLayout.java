package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.views.RoundedLinearLayout */
public class RoundedLinearLayout extends LinearLayout {

    /* renamed from: a */
    private Path f121151a;

    /* renamed from: b */
    private int f121152b;

    public RoundedLinearLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f121152b == 0 || VERSION.SDK_INT >= 21) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f121151a == null && this.f121152b > 0) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                this.f121151a = new Path();
                this.f121151a.addRoundRect(new RectF(0.0f, 0.0f, (float) width, (float) height), new float[]{(float) this.f121152b, (float) this.f121152b, (float) this.f121152b, (float) this.f121152b, (float) this.f121152b, (float) this.f121152b, (float) this.f121152b, (float) this.f121152b}, Direction.CW);
            }
        }
        if (this.f121151a != null) {
            canvas.clipPath(this.f121151a);
        }
        super.dispatchDraw(canvas);
    }

    public RoundedLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.a0i}, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f121152b = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if ((this.f121152b == 0 || VERSION.SDK_INT >= 21) && this.f121152b > 0 && VERSION.SDK_INT >= 21) {
            setClipToOutline(true);
            setOutlineProvider(new C48218p((float) this.f121152b, i, i2));
        }
    }
}
