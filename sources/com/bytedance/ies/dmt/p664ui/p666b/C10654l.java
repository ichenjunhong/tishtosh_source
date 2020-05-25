package com.bytedance.ies.dmt.p664ui.p666b;

import android.animation.ObjectAnimator;
import android.view.View;
import com.bytedance.ies.dmt.p664ui.p667c.C10673c;

/* renamed from: com.bytedance.ies.dmt.ui.b.l */
final /* synthetic */ class C10654l implements Runnable {

    /* renamed from: a */
    private final View f28306a;

    /* renamed from: b */
    private final boolean f28307b;

    C10654l(View view, boolean z) {
        this.f28306a = view;
        this.f28307b = z;
    }

    public final void run() {
        View view = this.f28306a;
        boolean z = this.f28307b;
        int height = (int) (((float) view.getHeight()) * 0.075f);
        long j = z ? 300 : 100;
        String str = "alpha";
        float[] fArr = new float[2];
        float f = 1.0f;
        fArr[0] = z ? 0.0f : 1.0f;
        if (!z) {
            f = 0.0f;
        }
        fArr[1] = f;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
        ofFloat.setDuration(j);
        ofFloat.addUpdateListener(new C10655m(height, view, z));
        ofFloat.setInterpolator(new C10673c());
        ofFloat.start();
    }
}
