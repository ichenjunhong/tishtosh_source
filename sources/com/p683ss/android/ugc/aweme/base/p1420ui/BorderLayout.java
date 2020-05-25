package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: com.ss.android.ugc.aweme.base.ui.BorderLayout */
public class BorderLayout extends LinearLayout {

    /* renamed from: a */
    protected float f62908a;

    /* renamed from: b */
    protected float f62909b;

    /* renamed from: c */
    protected int f62910c;

    /* renamed from: d */
    protected int f62911d;

    /* renamed from: e */
    private boolean f62912e;

    /* renamed from: f */
    private Paint f62913f;

    public boolean isSelected() {
        return this.f62912e;
    }

    public BorderLayout(Context context) {
        this(context, null);
    }

    public void setSelected(boolean z) {
        if (this.f62912e != z) {
            this.f62912e = z;
            if (this.f62912e) {
                this.f62913f.setColor(this.f62910c);
            } else {
                this.f62913f.setColor(this.f62911d);
            }
            postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect rect = new Rect();
        getDrawingRect(rect);
        RectF rectF = new RectF();
        rectF.left = ((float) rect.left) + this.f62908a;
        rectF.right = ((float) rect.right) - this.f62908a;
        rectF.top = ((float) rect.top) + this.f62908a;
        rectF.bottom = ((float) rect.bottom) - this.f62908a;
        canvas.drawRoundRect(rectF, this.f62909b, this.f62909b, this.f62913f);
    }

    public BorderLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo48980a(int i, int i2) {
        this.f62910c = i;
        this.f62911d = i2;
        this.f62913f.setColor(this.f62911d);
    }

    public BorderLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f62908a = 3.0f;
        this.f62909b = 6.0f;
        this.f62910c = -256;
        this.f62911d = -1;
        setWillNotDraw(false);
        if (this.f62913f == null) {
            this.f62913f = new Paint(1);
            this.f62913f.setColor(this.f62911d);
        }
        this.f62913f.setStyle(Style.STROKE);
        this.f62913f.setStrokeWidth(this.f62908a);
    }
}
