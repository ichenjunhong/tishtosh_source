package com.p683ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.LineProgressBarView */
public class LineProgressBarView extends View {

    /* renamed from: a */
    private int f81706a;

    /* renamed from: b */
    private int f81707b = 100;

    /* renamed from: c */
    private int f81708c;

    /* renamed from: d */
    private Paint f81709d;

    /* renamed from: e */
    private Rect f81710e;

    public int getProgress() {
        return this.f81706a;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f81709d = new Paint(1);
        this.f81710e = new Rect();
    }

    public LineProgressBarView(Context context) {
        super(context);
    }

    public void setMaxProgress(int i) {
        this.f81707b = i;
        postInvalidate();
    }

    public void setProgress(int i) {
        this.f81706a = i;
        postInvalidate();
    }

    public void setColor(int i) {
        this.f81708c = i;
        this.f81709d.setColor(i);
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f81710e.set(0, 0, (getMeasuredWidth() * this.f81706a) / this.f81707b, getMeasuredHeight());
        canvas.drawRect(this.f81710e, this.f81709d);
    }

    public LineProgressBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LineProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public LineProgressBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
