package com.p683ss.android.ugc.aweme.shortvideo.cut.model;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.ScrollInterceptedLayoutManager */
public final class ScrollInterceptedLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    public boolean f107901a = true;

    /* renamed from: e */
    public final boolean mo4742e() {
        if (!super.mo4742e() || !this.f107901a) {
            return false;
        }
        return true;
    }

    public ScrollInterceptedLayoutManager(Context context, int i, boolean z) {
        super(context, 0, false);
    }

    public ScrollInterceptedLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
