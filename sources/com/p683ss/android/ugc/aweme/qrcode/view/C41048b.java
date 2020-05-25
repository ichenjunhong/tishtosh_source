package com.p683ss.android.ugc.aweme.qrcode.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.b */
public final class C41048b extends View {

    /* renamed from: a */
    private final float f104375a;

    /* renamed from: b */
    private final float f104376b;

    /* renamed from: c */
    private final float f104377c;

    /* renamed from: d */
    private final float f104378d;

    /* renamed from: e */
    private Paint f104379e = new Paint();

    /* renamed from: f */
    private float f104380f;

    /* renamed from: a */
    public final void mo83569a(float f) {
        this.f104380f = ((this.f104376b - this.f104375a) * (f - 1.0f)) / 2.0f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        this.f104379e.setColor(getResources().getColor(R.color.jd));
        this.f104379e.setAntiAlias(true);
        int b = C23724k.m58224b(getContext());
        int a = C23724k.m58221a(getContext());
        float f = this.f104375a - this.f104380f;
        float f2 = this.f104376b + this.f104380f;
        float f3 = this.f104377c - this.f104380f;
        float f4 = this.f104378d + this.f104380f;
        float f5 = (float) b;
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, f5, f, this.f104379e);
        float f6 = f2 + 1.0f;
        float f7 = f;
        float f8 = f6;
        canvas2.drawRect(0.0f, f7, f3, f8, this.f104379e);
        float f9 = f5;
        canvas2.drawRect(f4 + 1.0f, f7, f9, f8, this.f104379e);
        canvas2.drawRect(0.0f, f6, f9, (float) a, this.f104379e);
    }

    public C41048b(Context context, float f, float f2, float f3, float f4) {
        C52711k.m112240b(context, "context");
        super(context);
        this.f104375a = f2;
        this.f104376b = f4;
        this.f104377c = f;
        this.f104378d = f3;
    }
}
