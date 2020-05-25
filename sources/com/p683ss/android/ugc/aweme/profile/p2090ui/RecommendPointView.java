package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.RecommendPointView */
public class RecommendPointView extends View {

    /* renamed from: a */
    public boolean f102571a;

    /* renamed from: a */
    public final void mo82378a() {
        setVisibility(8);
        this.f102571a = false;
    }

    public RecommendPointView(Context context) {
        super(context);
    }

    public void setShouldHide(boolean z) {
        this.f102571a = z;
    }

    public RecommendPointView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecommendPointView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
