package com.p683ss.android.ugc.aweme.commercialize.search;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.ss.android.ugc.aweme.commercialize.search.h */
public final class C26212h extends ViewOutlineProvider {

    /* renamed from: a */
    private final int f69212a;

    public C26212h(int i) {
        this.f69212a = i;
    }

    public final void getOutline(View view, Outline outline) {
        if (view != null && outline != null) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight() + this.f69212a, (float) this.f69212a);
        }
    }
}
