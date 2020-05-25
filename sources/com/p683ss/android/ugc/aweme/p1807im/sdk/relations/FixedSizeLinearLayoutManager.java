package com.p683ss.android.ugc.aweme.p1807im.sdk.relations;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.FixedSizeLinearLayoutManager */
public final class FixedSizeLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public int f89568a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f89569b = Integer.MAX_VALUE;

    /* renamed from: d */
    public final void mo5046d(int i, int i2) {
        if (i > this.f89568a && i2 > this.f89569b) {
            super.mo5046d(this.f89568a, this.f89569b);
        } else if (i > this.f89568a && i2 <= this.f89569b) {
            super.mo5046d(this.f89568a, i2);
        } else if (i > this.f89568a || i2 <= this.f89569b) {
            super.mo5046d(i, i2);
        } else {
            super.mo5046d(i, this.f89569b);
        }
    }

    public FixedSizeLinearLayoutManager(Context context, int i, boolean z) {
        C52711k.m112240b(context, "context");
        super(context, 0, true);
    }
}
