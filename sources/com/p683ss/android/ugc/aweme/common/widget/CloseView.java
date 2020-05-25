package com.p683ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.common.widget.CloseView */
public class CloseView extends View {

    /* renamed from: a */
    private Paint f70807a;

    /* renamed from: b */
    private Path f70808b;

    /* renamed from: c */
    private int f70809c;

    /* renamed from: d */
    private int f70810d;

    /* renamed from: e */
    private int f70811e;

    /* renamed from: f */
    private int f70812f;

    /* renamed from: g */
    private int f70813g;

    /* renamed from: h */
    private int f70814h;

    /* renamed from: i */
    private int f70815i;

    /* renamed from: j */
    private int f70816j;

    public CloseView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f70808b.reset();
        if (this.f70811e == 0 || this.f70812f == 0) {
            this.f70811e = getWidth();
            this.f70812f = getHeight();
        }
        this.f70813g = getPaddingLeft();
        this.f70814h = getPaddingRight();
        this.f70815i = getPaddingTop();
        this.f70816j = getPaddingBottom();
        this.f70808b.moveTo((float) this.f70813g, (float) this.f70815i);
        this.f70808b.lineTo((float) (this.f70811e - this.f70814h), (float) (this.f70812f - this.f70816j));
        this.f70808b.moveTo((float) this.f70813g, (float) (this.f70812f - this.f70816j));
        this.f70808b.lineTo((float) (this.f70811e - this.f70814h), (float) this.f70815i);
        canvas.save();
        canvas.drawPath(this.f70808b, this.f70807a);
        canvas.restore();
    }

    public CloseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CloseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.sf, R.attr.sk});
        this.f70809c = obtainStyledAttributes.getColor(0, -16777216);
        this.f70810d = obtainStyledAttributes.getDimensionPixelSize(1, C23728o.m58241a(1.0d));
        obtainStyledAttributes.recycle();
        this.f70807a = new Paint();
        this.f70807a.setColor(this.f70809c);
        this.f70807a.setStrokeWidth((float) this.f70810d);
        this.f70807a.setAntiAlias(true);
        this.f70807a.setStyle(Style.STROKE);
        this.f70807a.setStrokeJoin(Join.ROUND);
        this.f70807a.setStrokeCap(Cap.ROUND);
        this.f70808b = new Path();
    }
}
