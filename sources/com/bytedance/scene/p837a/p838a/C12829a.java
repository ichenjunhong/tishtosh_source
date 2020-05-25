package com.bytedance.scene.p837a.p838a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.support.p030v4.view.p042b.C1023b;
import android.support.p030v4.view.p042b.C1024c;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.scene.p837a.C12828a;
import com.bytedance.scene.p837a.C12847d;
import com.bytedance.scene.p837a.C12852e;

/* renamed from: com.bytedance.scene.a.a.a */
public final class C12829a extends C12847d {

    /* renamed from: b */
    private C12830b f33608b = new C12830b();

    /* renamed from: a */
    public final boolean mo24300a() {
        return true;
    }

    /* renamed from: a */
    public final Animator mo24299a(C12828a aVar, C12828a aVar2) {
        if (aVar2.f33607d) {
            return this.f33608b.mo24299a(aVar, aVar2);
        }
        View view = aVar.f33605b;
        View view2 = aVar2.f33605b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{1.0f, 1.0f});
        ofFloat.setInterpolator(new C1023b());
        ofFloat.setDuration(120);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(new DecelerateInterpolator(2.0f));
        ofFloat2.setDuration(120);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{((float) view2.getHeight()) * 0.08f, 0.0f});
        ofFloat3.setInterpolator(new DecelerateInterpolator(2.5f));
        ofFloat3.setDuration(200);
        return C12852e.m25763a(ofFloat, ofFloat2, ofFloat3);
    }

    /* renamed from: b */
    public final Animator mo24301b(C12828a aVar, C12828a aVar2) {
        if (aVar.f33607d) {
            return this.f33608b.mo24301b(aVar, aVar2);
        }
        View view = aVar2.f33605b;
        View view2 = aVar.f33605b;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, View.ALPHA, new float[]{1.0f, 0.0f});
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(150);
        ofFloat.setStartDelay(50);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{0.0f, ((float) view.getHeight()) * 0.08f});
        ofFloat2.setInterpolator(new AccelerateInterpolator(2.0f));
        ofFloat2.setDuration(200);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{0.7f, 1.0f});
        ofFloat3.setInterpolator(new C1024c());
        ofFloat3.setDuration(200);
        return C12852e.m25763a(ofFloat, ofFloat2, ofFloat3);
    }
}
