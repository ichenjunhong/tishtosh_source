package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.views.RoundedRelativeLayout */
public class RoundedRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private Path f121153a;

    /* renamed from: b */
    private int f121154b;

    public RoundedRelativeLayout(Context context) {
        this(context, null);
    }

    public void setBorderRadius(int i) {
        this.f121154b = i;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f121154b == 0 || VERSION.SDK_INT >= 21) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f121153a == null && this.f121154b > 0) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                this.f121153a = new Path();
                this.f121153a.addRoundRect(new RectF(0.0f, 0.0f, (float) width, (float) height), new float[]{(float) this.f121154b, (float) this.f121154b, (float) this.f121154b, (float) this.f121154b, (float) this.f121154b, (float) this.f121154b, (float) this.f121154b, (float) this.f121154b}, Direction.CW);
            }
        }
        if (this.f121153a != null) {
            canvas.clipPath(this.f121153a);
        }
        super.dispatchDraw(canvas);
    }

    public RoundedRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.a0i}, i, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f121154b = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if ((this.f121154b == 0 || VERSION.SDK_INT >= 21) && this.f121154b > 0 && VERSION.SDK_INT >= 21) {
            setClipToOutline(true);
            setOutlineProvider(new C48218p((float) this.f121154b, i, i2));
        }
    }
}
