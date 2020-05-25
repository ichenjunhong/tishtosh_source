package com.p683ss.android.ugc.aweme.tools.mvtemplate.thumbnail;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p664ui.widget.DoubleColorBallAnimationView;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.thumbnail.NoDisappearDoubleColorBallAnimationView */
public final class NoDisappearDoubleColorBallAnimationView extends DoubleColorBallAnimationView {
    public NoDisappearDoubleColorBallAnimationView(Context context) {
        this(context, null, 0, 6, null);
    }

    public NoDisappearDoubleColorBallAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            mo19244a();
        }
    }

    public NoDisappearDoubleColorBallAnimationView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ NoDisappearDoubleColorBallAnimationView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
