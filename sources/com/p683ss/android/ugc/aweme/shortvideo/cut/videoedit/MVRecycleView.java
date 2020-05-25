package com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.MVRecycleView */
public class MVRecycleView extends RecyclerView {

    /* renamed from: N */
    private double f108824N;

    public MVRecycleView(Context context) {
        super(context);
    }

    public void setflingScale(double d) {
        this.f108824N = d;
    }

    public MVRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public final boolean mo4820b(int i, int i2) {
        double d = (double) i;
        double d2 = this.f108824N;
        Double.isNaN(d);
        return super.mo4820b((int) (d * d2), i2);
    }

    public MVRecycleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
