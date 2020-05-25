package com.p683ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Canvas;
import android.support.p043v7.widget.RecyclerView;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.views.FpsRecyclerView */
public class FpsRecyclerView extends RecyclerView {

    /* renamed from: P */
    long f121123P = -1;

    /* renamed from: Q */
    long f121124Q = Long.MIN_VALUE;

    /* renamed from: R */
    String f121125R = "unKnown";

    /* renamed from: o */
    private void m104378o() {
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public void setLabel(String str) {
        this.f121125R = str;
    }

    public FpsRecyclerView(Context context) {
        super(context);
        m104378o();
    }

    public FpsRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m104378o();
    }

    public FpsRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m104378o();
    }
}
