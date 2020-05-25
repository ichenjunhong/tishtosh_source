package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Region.Op;
import com.p683ss.android.ugc.aweme.base.p1420ui.CircleImageView;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.l */
final class C32765l extends CircleImageView {

    /* renamed from: f */
    private final Path f85344f = new Path();

    /* renamed from: g */
    private final int f85345g;

    /* renamed from: h */
    private final int f85346h;

    /* renamed from: i */
    private final int f85347i;

    /* renamed from: j */
    private final boolean f85348j;

    public final void onDraw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        if (this.f85348j) {
            this.f85344f.reset();
            this.f85344f.addCircle(((float) (-this.f85347i)) + (((float) this.f85345g) / 2.0f), ((float) this.f85345g) / 2.0f, (((float) this.f85345g) / 2.0f) + ((float) this.f85346h), Direction.CW);
            canvas.clipPath(this.f85344f, Op.DIFFERENCE);
            this.f85344f.close();
        }
        super.onDraw(canvas);
    }

    public C32765l(Context context, int i, int i2, int i3, boolean z) {
        C52711k.m112240b(context, "context");
        super(context);
        this.f85345g = i;
        this.f85346h = i2;
        this.f85347i = i3;
        this.f85348j = z;
    }
}
