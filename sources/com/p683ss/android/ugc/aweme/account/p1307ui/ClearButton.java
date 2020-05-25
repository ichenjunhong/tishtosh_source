package com.p683ss.android.ugc.aweme.account.p1307ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.support.p030v4.content.C0726c;
import android.util.AttributeSet;
import android.view.View;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.ui.ClearButton */
public final class ClearButton extends View {

    /* renamed from: a */
    public static final C22173a f59818a = new C22173a(null);

    /* renamed from: b */
    private Paint f59819b;

    /* renamed from: c */
    private Paint f59820c;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.ClearButton$a */
    public static final class C22173a {
        private C22173a() {
        }

        public /* synthetic */ C22173a(C52707g gVar) {
            this();
        }
    }

    public final void setButtonBackgroundColor(int i) {
        this.f59819b.setColor(i);
    }

    public final void setCrossLineColor(int i) {
        this.f59820c.setColor(i);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            if (this.f59820c.getStrokeWidth() <= 0.0f) {
                this.f59820c.setStrokeWidth(((float) getHeight()) * 0.1f);
            }
            float height = ((float) getHeight()) / 2.0f;
            float height2 = ((float) getHeight()) / 2.0f;
            float height3 = ((float) getHeight()) * 0.5f;
            float height4 = (float) getHeight();
            float width = ((float) (getWidth() - getPaddingRight())) - ((height4 - height3) / 2.0f);
            float f = width - height3;
            float f2 = height3 / 2.0f;
            float f3 = height - f2;
            float f4 = height + f2;
            canvas.drawCircle(height2, height, height4 / 2.0f, this.f59819b);
            canvas.save();
            canvas.rotate(45.0f, height2, height);
            canvas.drawLine(f, height, width, height, this.f59820c);
            canvas.drawLine(height2, f3, height2, f4, this.f59820c);
            canvas.restore();
        }
    }

    public ClearButton(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f59819b = new Paint();
        this.f59820c = new Paint();
        this.f59819b.setStyle(Style.FILL);
        this.f59819b.setAntiAlias(true);
        this.f59820c.setStyle(Style.STROKE);
        this.f59820c.setStrokeCap(Cap.ROUND);
        this.f59820c.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.abi, R.attr.abz});
        setButtonBackgroundColor(obtainStyledAttributes.getColor(0, C0726c.m2098c(context, R.color.b0z)));
        setCrossLineColor(obtainStyledAttributes.getColor(1, C0726c.m2098c(context, 17170443)));
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ ClearButton(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        this(context, null, 0);
    }
}
