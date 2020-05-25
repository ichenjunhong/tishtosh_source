package com.p683ss.android.ugc.aweme.account.base.widget.recyclerview.scrollable;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.account.base.widget.recyclerview.scrollable.ScrollableLinearLayoutManager */
public class ScrollableLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public boolean f56959a;

    /* renamed from: e */
    public final boolean mo4742e() {
        if (!this.f56959a || !super.mo4742e()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo4745f() {
        if (!this.f56959a || !super.mo4745f()) {
            return false;
        }
        return true;
    }

    public ScrollableLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
