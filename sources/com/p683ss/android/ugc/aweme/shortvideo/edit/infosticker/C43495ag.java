package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.BorderLineView;
import com.p683ss.android.vesdk.VESize;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.ag */
final /* synthetic */ class C43495ag implements Runnable {

    /* renamed from: a */
    private final C43535i f109981a;

    /* renamed from: b */
    private final FrameLayout f109982b;

    C43495ag(C43535i iVar, FrameLayout frameLayout) {
        this.f109981a = iVar;
        this.f109982b = frameLayout;
    }

    public final void run() {
        C43535i iVar = this.f109981a;
        FrameLayout frameLayout = this.f109982b;
        VESize b = iVar.f110167j.mo43037b();
        if (b.width != 0 && b.height != 0) {
            int[] a = C43503ao.m95364a(frameLayout, b.width, b.height);
            iVar.f110177t = a[0];
            iVar.f110178u = a[1];
            LayoutParams layoutParams = (LayoutParams) frameLayout.getLayoutParams();
            iVar.f110179v = new Rect(0, layoutParams.topMargin, layoutParams.width, layoutParams.height + layoutParams.topMargin);
            iVar.f110181x = iVar.f110170m.getLiveWaterMarkRect(iVar.f110160c, a);
            iVar.f110180w = BorderLineView.m95791a(iVar.f110160c, layoutParams.width, layoutParams.height, iVar.f110177t, iVar.f110178u);
            frameLayout.addView(iVar.f110180w);
        }
    }
}
