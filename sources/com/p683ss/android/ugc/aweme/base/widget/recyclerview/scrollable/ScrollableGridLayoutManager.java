package com.p683ss.android.ugc.aweme.base.widget.recyclerview.scrollable;

import android.content.Context;
import android.support.p043v7.widget.GridLayoutManager;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.base.widget.recyclerview.scrollable.ScrollableGridLayoutManager */
public class ScrollableGridLayoutManager extends GridLayoutManager {

    /* renamed from: K */
    public boolean f63346K;

    /* renamed from: e */
    public final boolean mo4742e() {
        if (!this.f63346K || !super.mo4742e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo4745f() {
        if (!this.f63346K || !super.mo4745f()) {
            return false;
        }
        return true;
    }

    public ScrollableGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
