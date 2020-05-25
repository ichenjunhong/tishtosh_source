package com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.ColorCircleView */
public class ColorCircleView extends View {

    /* renamed from: a */
    Paint f117875a;

    /* renamed from: b */
    int f117876b;

    /* renamed from: c */
    public boolean f117877c;

    /* renamed from: d */
    private Paint f117878d;

    /* renamed from: e */
    private int f117879e;

    public int getColor() {
        return this.f117876b;
    }

    public ColorCircleView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        float f = (float) width;
        canvas.drawCircle(f, f, (float) ((width - this.f117879e) - 4), this.f117878d);
        canvas.drawCircle(f, f, (float) (width - (this.f117879e * 2)), this.f117875a);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
    }

    public ColorCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117879e = 6;
        this.f117876b = -1;
        this.f117878d = new Paint();
        this.f117878d.setColor(-1);
        this.f117878d.setAntiAlias(true);
        this.f117878d.setStyle(Style.STROKE);
        this.f117878d.setStrokeWidth((float) this.f117879e);
        this.f117875a = new Paint();
        this.f117875a.setColor(this.f117876b);
        this.f117875a.setAntiAlias(true);
        this.f117875a.setStyle(Style.FILL);
        this.f117875a.setStrokeWidth((float) this.f117879e);
    }
}
