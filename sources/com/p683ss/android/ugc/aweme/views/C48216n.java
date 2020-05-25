package com.p683ss.android.ugc.aweme.views;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.ss.android.ugc.aweme.views.n */
public final class C48216n extends ViewOutlineProvider {

    /* renamed from: a */
    private int f121342a;

    public C48216n(int i) {
        this.f121342a = i;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f121342a);
    }
}
