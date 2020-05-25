package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class LiveEndTriangleView extends View {

    /* renamed from: a */
    private Paint f23019a;

    /* renamed from: b */
    private Path f23020b;

    public LiveEndTriangleView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f23020b.moveTo(0.0f, (float) getMeasuredHeight());
        this.f23020b.lineTo((float) getMeasuredWidth(), (float) getMeasuredHeight());
        this.f23020b.lineTo((float) (getMeasuredWidth() / 2), 0.0f);
        this.f23020b.close();
        canvas.drawPath(this.f23020b, this.f23019a);
    }

    public LiveEndTriangleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LiveEndTriangleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23019a = new Paint();
        this.f23019a.setAntiAlias(true);
        this.f23019a.setStyle(Style.FILL);
        this.f23019a.setColor(Color.parseColor("#14ffffff"));
        this.f23020b = new Path();
    }
}
