package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.util.AttributeSet;
import com.p683ss.android.ugc.aweme.views.C48201l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.WrapStaggeredGridLayoutManager */
public class WrapStaggeredGridLayoutManager extends StaggeredGridLayoutManager implements C48201l {
    public WrapStaggeredGridLayoutManager(int i, int i2) {
        super(i, i2);
    }

    /* renamed from: c */
    public void mo4689c(C1343o oVar, C1349s sVar) {
        try {
            super.mo4689c(oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
        }
    }

    /* renamed from: b */
    public final int mo4685b(int i, C1343o oVar, C1349s sVar) {
        try {
            return super.mo4685b(i, oVar, sVar);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        }
    }

    public WrapStaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
