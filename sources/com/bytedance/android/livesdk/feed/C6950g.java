package com.bytedance.android.livesdk.feed;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.StaggeredGridLayoutManager;

/* renamed from: com.bytedance.android.livesdk.feed.g */
public final class C6950g extends C1340m {

    /* renamed from: a */
    private int[] f19024a;

    /* renamed from: b */
    private int[] f19025b;

    /* renamed from: c */
    private int f19026c;

    public C6950g(int i) {
        this.f19024a = new int[i];
        this.f19025b = new int[i];
        this.f19026c = i;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        try {
            C1332i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                staggeredGridLayoutManager.mo5240a(this.f19024a);
                if (this.f19024a[0] < this.f19026c) {
                    staggeredGridLayoutManager.mo5245h();
                }
                staggeredGridLayoutManager.mo5242c(this.f19025b);
                if (this.f19025b[0] >= staggeredGridLayoutManager.mo5013A() - this.f19026c) {
                    staggeredGridLayoutManager.mo5245h();
                }
            }
        } catch (Exception unused) {
        }
    }
}
