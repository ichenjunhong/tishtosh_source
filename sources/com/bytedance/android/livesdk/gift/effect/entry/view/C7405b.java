package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.live.uikit.p257c.C4206c;

/* renamed from: com.bytedance.android.livesdk.gift.effect.entry.view.b */
final /* synthetic */ class C7405b implements Runnable {

    /* renamed from: a */
    private final C7404a f20282a;

    /* renamed from: b */
    private final int f20283b;

    C7405b(C7404a aVar, int i) {
        this.f20282a = aVar;
        this.f20283b = i;
    }

    public final void run() {
        C7404a aVar = this.f20282a;
        int i = this.f20283b;
        if (aVar.f20277h.getScrollX() != 0 && C4206c.m10426a(aVar.getContext())) {
            i = aVar.f20277h.getScrollX() - i;
        }
        ObjectAnimator duration = ObjectAnimator.ofInt(aVar.f20277h, "scrollX", new int[]{i}).setDuration(1200);
        duration.setInterpolator(new LinearInterpolator());
        duration.start();
    }
}
