package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.dv */
public final class C40355dv extends C1331h {

    /* renamed from: a */
    private int f103015a;

    public C40355dv(int i) {
        this.f103015a = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        if (recyclerView.mo4843e(view) > 1) {
            rect.top = this.f103015a;
        }
    }
}
