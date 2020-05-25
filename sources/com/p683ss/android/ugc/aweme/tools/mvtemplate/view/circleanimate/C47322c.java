package com.p683ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate;

import android.graphics.drawable.GradientDrawable;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.circleanimate.c */
public final class C47322c {

    /* renamed from: a */
    public int f119458a;

    /* renamed from: b */
    public int f119459b;

    /* renamed from: c */
    public GradientDrawable f119460c;

    public C47322c(GradientDrawable gradientDrawable) {
        this.f119460c = gradientDrawable;
    }

    /* renamed from: a */
    public final void mo94606a(int i) {
        this.f119458a = 0;
        this.f119460c.setStroke(0, this.f119459b);
    }

    /* renamed from: b */
    public final void mo94607b(int i) {
        this.f119459b = i;
        this.f119460c.setStroke(this.f119458a, i);
    }
}
