package com.p683ss.android.ugc.aweme.detail.p1626h;

import android.support.p030v4.view.ViewPager.C0998f;
import android.view.View;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

/* renamed from: com.ss.android.ugc.aweme.detail.h.j */
public final class C27364j implements C0998f {

    /* renamed from: a */
    private C27363i f72143a;

    /* renamed from: b */
    private Boolean f72144b = Boolean.valueOf(true);

    /* renamed from: c */
    private Boolean f72145c = Boolean.valueOf(true);

    public C27364j(C27363i iVar) {
        this.f72143a = iVar;
    }

    /* renamed from: b */
    private static void m65964b(View view, float f) {
        int width = view.getWidth();
        int height = view.getHeight();
        float max = Math.max(0.85f, 1.0f - Math.abs(f));
        float f2 = 1.0f - max;
        float f3 = (((float) height) * f2) / 2.0f;
        float f4 = (((float) width) * f2) / 2.0f;
        if (f < 0.0f) {
            view.setTranslationX(f4 - (f3 / 2.0f));
        } else {
            view.setTranslationX((-f4) + (f3 / 2.0f));
        }
        view.setScaleX(max);
        view.setScaleY(max);
        view.setAlpha((((max - 0.85f) / 0.14999998f) * 0.5f) + 0.5f);
    }

    /* renamed from: a */
    public final void mo3111a(View view, float f) {
        if (f < -1.0f || f > 1.0f) {
            view.setAlpha(0.0f);
        } else if (this.f72143a != null) {
            if (((double) f) == ProfileUiInitOptimizeEnterThreshold.DEFAULT || f == -1.0f || f == 1.0f) {
                this.f72144b = Boolean.valueOf(true);
                this.f72145c = Boolean.valueOf(true);
                m65964b(view, 0.0f);
            } else if (this.f72145c.booleanValue()) {
                if (this.f72144b.booleanValue()) {
                    this.f72144b = Boolean.valueOf(false);
                    if ((f >= 0.0f || f <= -0.5f) && (f <= 0.5f || f >= 1.0f)) {
                        this.f72145c = Boolean.valueOf(this.f72143a.mo55840a());
                    } else {
                        this.f72145c = Boolean.valueOf(this.f72143a.mo55841b());
                    }
                }
                if (this.f72145c.booleanValue()) {
                    m65964b(view, f);
                }
            }
        }
    }
}
