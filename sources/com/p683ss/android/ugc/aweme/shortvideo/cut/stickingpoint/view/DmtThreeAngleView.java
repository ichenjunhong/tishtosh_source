package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.DmtThreeAngleView */
public final class DmtThreeAngleView extends View {

    /* renamed from: a */
    public static final C43067a f108722a = new C43067a(null);

    /* renamed from: b */
    private int f108723b;

    /* renamed from: c */
    private int f108724c;

    /* renamed from: d */
    private int f108725d;

    /* renamed from: e */
    private final Paint f108726e;

    /* renamed from: f */
    private final Path f108727f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.DmtThreeAngleView$a */
    public static final class C43067a {
        private C43067a() {
        }

        public /* synthetic */ C43067a(C52707g gVar) {
            this();
        }
    }

    public DmtThreeAngleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DmtThreeAngleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setOrientation(int i) {
        this.f108725d = i;
    }

    public final void setBgColor(int i) {
        this.f108726e.setColor(i);
    }

    public final void setRoundRadius(int i) {
        this.f108726e.setPathEffect(new CornerPathEffect((float) i));
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        if (this.f108725d == 1) {
            this.f108727f.moveTo(0.0f, (float) this.f108724c);
            this.f108727f.lineTo((float) (this.f108723b / 2), 0.0f);
            this.f108727f.lineTo((float) this.f108723b, (float) this.f108724c);
            this.f108727f.lineTo((float) this.f108723b, (float) this.f108724c);
            this.f108727f.lineTo(0.0f, (float) this.f108724c);
            this.f108727f.lineTo(0.0f, (float) this.f108724c);
        } else if (this.f108725d == 2) {
            this.f108727f.moveTo(0.0f, 0.0f);
            this.f108727f.lineTo((float) (this.f108723b / 2), (float) this.f108724c);
            this.f108727f.lineTo((float) this.f108723b, (float) this.f108724c);
            this.f108727f.lineTo(0.0f, 0.0f);
        } else if (this.f108725d == 3) {
            this.f108727f.moveTo((float) this.f108723b, 0.0f);
            this.f108727f.lineTo((float) this.f108723b, (float) this.f108724c);
            this.f108727f.lineTo(0.0f, (float) (this.f108724c / 2));
            this.f108727f.lineTo((float) this.f108723b, 0.0f);
        } else if (this.f108725d == 4) {
            this.f108727f.moveTo(0.0f, 0.0f);
            this.f108727f.lineTo((float) this.f108723b, (float) (this.f108724c / 2));
            this.f108727f.lineTo(0.0f, (float) this.f108724c);
            this.f108727f.lineTo(0.0f, 0.0f);
        }
        canvas.drawPath(this.f108727f, this.f108726e);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f108723b = MeasureSpec.getSize(i);
        this.f108724c = MeasureSpec.getSize(i2);
    }

    public DmtThreeAngleView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f108725d = 1;
        this.f108726e = new Paint();
        this.f108727f = new Path();
        this.f108726e.setAntiAlias(true);
    }

    public /* synthetic */ DmtThreeAngleView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
