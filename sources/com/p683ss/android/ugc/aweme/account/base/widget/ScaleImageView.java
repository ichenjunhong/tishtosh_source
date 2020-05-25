package com.p683ss.android.ugc.aweme.account.base.widget;

import android.content.Context;
import android.support.p043v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.p2396w.C48222b;

/* renamed from: com.ss.android.ugc.aweme.account.base.widget.ScaleImageView */
public final class ScaleImageView extends AppCompatImageView {
    /* renamed from: a */
    private void m53277a() {
        setOnTouchListener(new C48222b(1.2f, 100, null));
    }

    public ScaleImageView(Context context) {
        super(context);
        m53277a();
    }

    public ScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m53277a();
    }

    public ScaleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m53277a();
    }
}
