package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.content.Context;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.WrapGridLayoutManager */
public class WrapGridLayoutManager extends GridLayoutManager {
    public WrapGridLayoutManager(Context context, int i) {
        super(context, 4);
    }

    /* renamed from: c */
    public final void mo4689c(C1343o oVar, C1349s sVar) {
        try {
            super.mo4689c(oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
