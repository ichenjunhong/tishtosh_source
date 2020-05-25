package com.p683ss.android.ugc.aweme.views;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.ss.android.ugc.aweme.views.p */
public final class C48218p extends ViewOutlineProvider {

    /* renamed from: a */
    private float f121346a;

    /* renamed from: b */
    private int f121347b;

    /* renamed from: c */
    private int f121348c;

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(new Rect(0, 0, this.f121347b, this.f121348c), this.f121346a);
    }

    public C48218p(float f, int i, int i2) {
        this.f121346a = f;
        this.f121347b = i;
        this.f121348c = i2;
    }
}
