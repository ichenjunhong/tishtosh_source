package com.p683ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView */
public class LinearGradientDraweeView extends SmartImageView {

    /* renamed from: a */
    private int f81711a;

    /* renamed from: c */
    private int f81712c;

    /* renamed from: d */
    private int f81713d;

    /* renamed from: e */
    private Paint f81714e;

    /* renamed from: f */
    private LinearGradient f81715f;

    public LinearGradientDraweeView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f81711a > 0) {
            int height = getHeight() - this.f81711a;
            if (this.f81715f == null) {
                LinearGradient linearGradient = new LinearGradient(0.0f, (float) height, 0.0f, (float) getHeight(), new int[]{this.f81712c, this.f81713d}, null, TileMode.CLAMP);
                this.f81715f = linearGradient;
                this.f81714e.setShader(this.f81715f);
            }
            canvas.drawRect(0.0f, (float) height, (float) getWidth(), (float) getHeight(), this.f81714e);
        }
    }

    public LinearGradientDraweeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearGradientDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f81714e = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.kr, R.attr.sd, R.attr.a3b});
        this.f81712c = obtainStyledAttributes.getColor(2, 0);
        this.f81713d = obtainStyledAttributes.getColor(0, 0);
        this.f81711a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
    }
}
