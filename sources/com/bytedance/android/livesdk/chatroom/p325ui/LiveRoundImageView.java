package com.bytedance.android.livesdk.chatroom.p325ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.LiveRoundImageView */
public class LiveRoundImageView extends AppCompatImageView {

    /* renamed from: a */
    private int f15535a;

    /* renamed from: b */
    private int f15536b;

    /* renamed from: c */
    private int f15537c;

    /* renamed from: d */
    private int f15538d;

    public LiveRoundImageView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(this.f15535a, this.f15536b) + Math.max(this.f15537c, this.f15538d);
        if (width >= Math.max(this.f15535a, this.f15537c) + Math.max(this.f15536b, this.f15538d) && height > max) {
            Path path = new Path();
            path.moveTo((float) this.f15535a, 0.0f);
            path.lineTo((float) (width - this.f15536b), 0.0f);
            float f = (float) width;
            path.quadTo(f, 0.0f, f, (float) this.f15536b);
            path.lineTo(f, (float) (height - this.f15538d));
            float f2 = (float) height;
            path.quadTo(f, f2, (float) (width - this.f15538d), f2);
            path.lineTo((float) this.f15537c, f2);
            path.quadTo(0.0f, f2, 0.0f, (float) (height - this.f15537c));
            path.lineTo(0.0f, (float) this.f15535a);
            path.quadTo(0.0f, 0.0f, (float) this.f15535a, 0.0f);
            canvas.clipPath(path);
        }
        super.onDraw(canvas);
    }

    public LiveRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a87, R.attr.a88, R.attr.a89, R.attr.a8_, R.attr.a8a});
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
            this.f15535a = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.f15536b = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
            this.f15537c = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
            this.f15538d = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
            if (this.f15535a == 0) {
                this.f15535a = dimensionPixelOffset;
            }
            if (this.f15536b == 0) {
                this.f15536b = dimensionPixelOffset;
            }
            if (this.f15537c == 0) {
                this.f15537c = dimensionPixelOffset;
            }
            if (this.f15538d == 0) {
                this.f15538d = dimensionPixelOffset;
            }
            obtainStyledAttributes.recycle();
        }
    }
}
