package com.p683ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.p2396w.C48222b;

/* renamed from: com.ss.android.ugc.aweme.base.widget.ScaleImageView */
public final class ScaleImageView extends AppCompatImageView {
    /* renamed from: a */
    private void m58283a() {
        setOnTouchListener(new C48222b(1.2f, 100, null));
    }

    public ScaleImageView(Context context) {
        super(context);
        m58283a();
    }

    public ScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m58283a();
    }

    public ScaleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m58283a();
    }
}
