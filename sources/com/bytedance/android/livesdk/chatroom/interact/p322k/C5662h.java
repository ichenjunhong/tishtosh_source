package com.bytedance.android.livesdk.chatroom.interact.p322k;

import android.widget.FrameLayout.LayoutParams;
import com.bytedance.android.livesdk.chatroom.widget.C6682m;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.k.h */
final /* synthetic */ class C5662h implements Runnable {

    /* renamed from: a */
    private final C5657g f14845a;

    C5662h(C5657g gVar) {
        this.f14845a = gVar;
    }

    public final void run() {
        int i;
        C5657g gVar = this.f14845a;
        int size = gVar.f14819d.size();
        float f = 2.14748365E9f;
        for (int i2 = 0; i2 < size; i2++) {
            C6682m mVar = (C6682m) gVar.f14819d.get(i2);
            if (mVar != null && mVar.getY() < f) {
                f = mVar.getY();
            }
        }
        if (2.14748365E9f == f || f < 10.0f) {
            i = gVar.f14821f;
        } else {
            i = (int) (((gVar.f14817b.getY() + ((float) gVar.f14817b.getHeight())) - f) + ((float) gVar.f14820e));
        }
        LayoutParams layoutParams = (LayoutParams) gVar.f14818c.getLayoutParams();
        layoutParams.bottomMargin = i;
        gVar.f14818c.setLayoutParams(layoutParams);
    }
}
