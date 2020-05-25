package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ChatRecyclerView */
public class ChatRecyclerView extends RecyclerView {

    /* renamed from: N */
    int f90736N;

    /* renamed from: O */
    LinearLayoutManager f90737O;

    public ChatRecyclerView(Context context) {
        this(context, null);
    }

    public ChatRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChatRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f90737O == null) {
            C1332i layoutManager = getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                this.f90737O = (LinearLayoutManager) layoutManager;
            }
        }
        if (this.f90737O != null && !this.f90737O.f4556m) {
            int l = this.f90737O.mo4751l();
            if (l >= 0) {
                View c = this.f90737O.mo4736c(l);
                if (c != null) {
                    int i5 = ((LayoutParams) c.getLayoutParams()).topMargin;
                    int top = c.getTop();
                    if (top > i5 && this.f90736N == 0) {
                        this.f90736N = i5 - top;
                        this.f90737O.mo5054i(this.f90736N);
                        this.f90737O.mo4683a(true);
                    }
                }
            }
        }
    }
}
