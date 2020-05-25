package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.utils.C23716e;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.KTVView */
public class KTVView extends View {

    /* renamed from: a */
    private Paint f115177a;

    /* renamed from: b */
    private int f115178b;

    /* renamed from: c */
    private int f115179c;

    /* renamed from: d */
    private int f115180d;

    public KTVView(Context context) {
        this(context, null);
    }

    public void setColor(int i) {
        this.f115177a.setColor(i);
        invalidate();
    }

    public void setLength(int i) {
        this.f115178b = i;
        this.f115180d = C23716e.m58205a(this.f115179c + this.f115178b, this.f115179c, getWidth() - getPaddingRight());
        invalidate();
    }

    public void setStart(int i) {
        this.f115179c = i;
        this.f115180d = C23716e.m58205a(this.f115179c + this.f115178b, this.f115179c, getWidth() - getPaddingRight());
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable background = getBackground();
        if (background != null) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31);
            background.draw(canvas);
            canvas.drawRect((float) this.f115179c, 0.0f, (float) this.f115180d, (float) getHeight(), this.f115177a);
            canvas.restoreToCount(saveLayer);
        }
    }

    public KTVView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KTVView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843173}, i, 0);
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        this.f115177a = new Paint(1);
        this.f115177a.setStyle(Style.FILL);
        this.f115177a.setXfermode(new PorterDuffXfermode(Mode.SRC_ATOP));
        this.f115177a.setColor(color);
    }
}
