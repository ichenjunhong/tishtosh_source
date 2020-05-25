package com.p683ss.android.ugc.aweme.tools.mvtemplate.p2370d;

import android.os.Build.VERSION;
import android.support.p030v4.view.ViewPager.C0998f;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.d.f */
public final class C47264f implements C0998f {

    /* renamed from: a */
    private float f119346a;

    public C47264f(float f) {
        this.f119346a = f;
    }

    /* renamed from: a */
    public final void mo3111a(View view, float f) {
        m102624b(view, f);
    }

    /* renamed from: b */
    private void m102624b(View view, float f) {
        float f2;
        float f3;
        if (f < -1.0f) {
            f = -1.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        if (f < 0.0f) {
            f2 = f + 1.0f;
        } else {
            f2 = 1.0f - f;
        }
        float f4 = (f2 * 0.100000024f) + 0.9f;
        view.setScaleX(f4);
        view.setScaleY(f4);
        if (f < 0.0f) {
            f3 = f + 1.0f;
        } else {
            f3 = 1.0f - f;
        }
        view.setAlpha(this.f119346a + (f3 * (1.0f - this.f119346a)));
        if (VERSION.SDK_INT < 19) {
            view.getParent().requestLayout();
        }
    }
}
