package com.bytedance.sdk.account.bdplatform.impl.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.ss.android.ugc.trill.R;

public class RoundImageView extends ImageView {

    /* renamed from: a */
    private float f34129a;

    /* renamed from: b */
    private float f34130b;

    /* renamed from: c */
    private float f34131c;

    /* renamed from: d */
    private float f34132d;

    /* renamed from: e */
    private Paint f34133e;

    public RoundImageView(Context context) {
        this(context, null);
    }

    public void draw(Canvas canvas) {
        try {
            canvas.saveLayer(new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight()), null, 31);
            super.draw(canvas);
            if (this.f34129a > 0.0f) {
                Path path = new Path();
                path.moveTo(0.0f, this.f34129a);
                path.lineTo(0.0f, 0.0f);
                path.lineTo(this.f34129a, 0.0f);
                path.arcTo(new RectF(0.0f, 0.0f, this.f34129a * 2.0f, this.f34129a * 2.0f), -90.0f, -90.0f);
                path.close();
                canvas.drawPath(path, this.f34133e);
            }
            if (this.f34130b > 0.0f) {
                int width = getWidth();
                Path path2 = new Path();
                float f = (float) width;
                path2.moveTo(f - this.f34130b, 0.0f);
                path2.lineTo(f, 0.0f);
                path2.lineTo(f, this.f34130b);
                path2.arcTo(new RectF(f - (this.f34130b * 2.0f), 0.0f, f, this.f34130b * 2.0f), 0.0f, -90.0f);
                path2.close();
                canvas.drawPath(path2, this.f34133e);
            }
            if (this.f34131c > 0.0f) {
                int height = getHeight();
                Path path3 = new Path();
                float f2 = (float) height;
                path3.moveTo(0.0f, f2 - this.f34131c);
                path3.lineTo(0.0f, f2);
                path3.lineTo(this.f34131c, f2);
                path3.arcTo(new RectF(0.0f, f2 - (this.f34131c * 2.0f), this.f34131c * 2.0f, f2), 90.0f, 90.0f);
                path3.close();
                canvas.drawPath(path3, this.f34133e);
            }
            if (this.f34132d > 0.0f) {
                int height2 = getHeight();
                int width2 = getWidth();
                Path path4 = new Path();
                float f3 = (float) width2;
                float f4 = (float) height2;
                path4.moveTo(f3 - this.f34132d, f4);
                path4.lineTo(f3, f4);
                path4.lineTo(f3, f4 - this.f34132d);
                path4.arcTo(new RectF(f3 - (this.f34132d * 2.0f), f4 - (this.f34132d * 2.0f), f3, f4), 0.0f, 90.0f);
                path4.close();
                canvas.drawPath(path4, this.f34133e);
            }
            canvas.restore();
        } catch (Exception unused) {
        }
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.xq});
            float dimension = obtainStyledAttributes.getDimension(0, 0.0f);
            this.f34129a = dimension;
            this.f34130b = dimension;
            this.f34131c = dimension;
            this.f34132d = dimension;
            obtainStyledAttributes.recycle();
        }
        this.f34133e = new Paint(5);
        this.f34133e.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
    }
}
