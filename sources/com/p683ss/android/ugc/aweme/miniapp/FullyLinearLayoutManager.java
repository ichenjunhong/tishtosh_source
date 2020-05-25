package com.p683ss.android.ugc.aweme.miniapp;

import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView.C1343o;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.miniapp.FullyLinearLayoutManager */
public class FullyLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private int[] f94038a;

    /* renamed from: a */
    public final void mo5021a(C1343o oVar, C1349s sVar, int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < mo5013A(); i5++) {
            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i5, 0);
            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, 0);
            int[] iArr = this.f94038a;
            try {
                View b = oVar.mo5096b(0);
                if (b != null) {
                    LayoutParams layoutParams = (LayoutParams) b.getLayoutParams();
                    b.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, mo5063t() + mo5065v(), layoutParams.width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, mo5064u() + mo5066w(), layoutParams.height));
                    iArr[0] = b.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
                    iArr[1] = b.getMeasuredHeight() + layoutParams.bottomMargin + layoutParams.topMargin;
                    oVar.mo5094a(b);
                }
            } catch (Exception unused) {
            }
            if (this.f4552i == 0) {
                i3 += this.f94038a[0];
                if (i5 == 0) {
                    i4 = this.f94038a[1];
                }
            } else {
                i4 += this.f94038a[1];
                if (i5 == 0) {
                    i3 = this.f94038a[0];
                }
            }
        }
        if (mode != 1073741824) {
            size = i3;
        }
        mo5046d(size, i4);
    }
}
