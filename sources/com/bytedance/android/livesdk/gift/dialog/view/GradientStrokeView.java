package com.bytedance.android.livesdk.gift.dialog.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.ss.android.ugc.trill.R;

public class GradientStrokeView extends View {

    /* renamed from: a */
    private Paint f19672a;

    /* renamed from: b */
    private Paint f19673b;

    /* renamed from: c */
    private int f19674c;

    /* renamed from: d */
    private RectF f19675d;

    /* renamed from: e */
    private RectF f19676e;

    /* renamed from: f */
    private boolean f19677f;

    public GradientStrokeView(Context context) {
        this(context, null);
    }

    public void setShowStroke(boolean z) {
        this.f19677f = z;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(this.f19675d, (float) this.f19674c, (float) this.f19674c, this.f19672a);
        if (this.f19677f) {
            canvas.drawRoundRect(this.f19676e, (float) this.f19674c, (float) this.f19674c, this.f19673b);
        }
    }

    public GradientStrokeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GradientStrokeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int a = (int) C4577ap.m10990a(getContext(), 89.0f);
        int a2 = (int) C4577ap.m10990a(getContext(), 33.0f);
        int a3 = (int) C4577ap.m10990a(getContext(), 1.0f);
        float f = (float) (a3 / 2);
        this.f19674c = (int) C4577ap.m10990a(getContext(), 17.0f);
        float f2 = (float) a;
        float f3 = (float) a2;
        this.f19675d = new RectF(f, f, f2, f3);
        float f4 = 2.0f * f;
        this.f19676e = new RectF(f4, f4, f2 - f, f3 - f);
        this.f19672a = new Paint();
        this.f19672a.setAntiAlias(true);
        this.f19672a.setColor(getResources().getColor(R.color.b3r));
        this.f19673b = new Paint();
        this.f19673b.setAntiAlias(true);
        LinearGradient linearGradient = new LinearGradient(0.0f, f3, f2, 0.0f, getResources().getColor(R.color.b3t), getResources().getColor(R.color.b3s), TileMode.CLAMP);
        this.f19673b.setStyle(Style.STROKE);
        this.f19673b.setShader(linearGradient);
        this.f19673b.setStrokeWidth((float) a3);
    }
}
