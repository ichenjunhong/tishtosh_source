package com.p683ss.android.ugc.aweme.commercialize.search;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.ss.android.ugc.aweme.commercialize.search.a */
public final class C26204a extends ViewOutlineProvider {

    /* renamed from: a */
    private final int f69194a;

    public C26204a(int i) {
        this.f69194a = i;
    }

    public final void getOutline(View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, -this.f69194a, view.getWidth(), view.getHeight(), (float) this.f69194a);
        }
    }
}
