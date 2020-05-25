package com.bytedance.android.livesdk.widget.roundcorner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path.Direction;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

public final class RoundCornerFrameLayout extends FrameLayout implements C8561a {

    /* renamed from: a */
    private final C8562b f23483a;

    public RoundCornerFrameLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public RoundCornerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo15017a(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        super.draw(canvas);
    }

    public final void draw(Canvas canvas) {
        C8563c cVar = this.f23483a.f23484a;
        if (canvas != null) {
            if (cVar.f23485a == 0 && cVar.f23487c == 0 && cVar.f23486b == 0 && cVar.f23488d == 0) {
                cVar.f23494j.mo15017a(canvas);
                return;
            }
            int a = C8563c.m16904a(canvas, cVar.f23489e, cVar.f23492h);
            cVar.f23491g.reset();
            cVar.f23491g.addRoundRect(cVar.f23489e, cVar.f23490f, Direction.CW);
            canvas.drawPath(cVar.f23491g, cVar.f23492h);
            cVar.f23492h.setXfermode(cVar.f23493i);
            C8563c.m16904a(canvas, cVar.f23489e, cVar.f23492h);
            cVar.f23494j.mo15017a(canvas);
            cVar.f23492h.setXfermode(null);
            cVar.f23492h.setColorFilter(null);
            canvas.restoreToCount(a);
        }
    }

    public RoundCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f23483a = new C8562b(this);
        C8562b bVar = this.f23483a;
        C52711k.m112240b(context, "context");
        C8563c cVar = bVar.f23484a;
        C52711k.m112240b(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a7z, R.attr.a84, R.attr.a85, R.attr.a8g, R.attr.a8h}, i, 0);
        if (obtainStyledAttributes != null) {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            cVar.f23485a = obtainStyledAttributes.getDimensionPixelSize(2, dimensionPixelSize);
            cVar.f23486b = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
            cVar.f23487c = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
            cVar.f23488d = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
            cVar.f23490f[0] = (float) cVar.f23485a;
            cVar.f23490f[1] = cVar.f23490f[0];
            cVar.f23490f[2] = (float) cVar.f23487c;
            cVar.f23490f[3] = cVar.f23490f[2];
            cVar.f23490f[4] = (float) cVar.f23488d;
            cVar.f23490f[5] = cVar.f23490f[4];
            cVar.f23490f[6] = (float) cVar.f23486b;
            cVar.f23490f[7] = cVar.f23490f[6];
            obtainStyledAttributes.recycle();
        }
        if (cVar.f23486b > 0 || cVar.f23485a > 0 || cVar.f23487c > 0 || cVar.f23488d > 0) {
            C8561a aVar = cVar.f23494j;
            if (!(aVar instanceof ViewGroup)) {
                aVar = null;
            }
            ViewGroup viewGroup = (ViewGroup) aVar;
            if (viewGroup != null) {
                viewGroup.setWillNotDraw(false);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C8562b bVar = this.f23483a;
        int width = getWidth();
        int height = getHeight();
        C8563c cVar = bVar.f23484a;
        if ((cVar.f23485a != 0 || cVar.f23487c != 0 || cVar.f23488d != 0 || cVar.f23486b != 0) && width != 0 && height != 0) {
            cVar.f23489e.set(0.0f, 0.0f, (float) width, (float) height);
        }
    }

    public /* synthetic */ RoundCornerFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
