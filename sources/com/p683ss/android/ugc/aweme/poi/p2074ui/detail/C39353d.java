package com.p683ss.android.ugc.aweme.poi.p2074ui.detail;

import android.support.p043v7.widget.C1415af;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView.C1346r;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.d */
final /* synthetic */ class C39353d implements Runnable {

    /* renamed from: a */
    private final PoiDetailWithoutMapFragment f100596a;

    /* renamed from: b */
    private final boolean f100597b;

    /* renamed from: c */
    private final int f100598c;

    C39353d(PoiDetailWithoutMapFragment poiDetailWithoutMapFragment, boolean z, int i) {
        this.f100596a = poiDetailWithoutMapFragment;
        this.f100597b = z;
        this.f100598c = i;
    }

    public final void run() {
        PoiDetailWithoutMapFragment poiDetailWithoutMapFragment = this.f100596a;
        boolean z = this.f100597b;
        int i = this.f100598c;
        if (z) {
            C393183 r1 = new C1415af(poiDetailWithoutMapFragment.mRecyclerView.getContext()) {
                /* renamed from: a */
                public final int mo5492a(int i, int i2, int i3, int i4, int i5) {
                    return super.mo5492a(i, i2, i3, i4, -1);
                }
            };
            r1.f4778g = i;
            poiDetailWithoutMapFragment.mRecyclerView.getLayoutManager().mo5022a((C1346r) r1);
            return;
        }
        ((LinearLayoutManager) poiDetailWithoutMapFragment.mRecyclerView.getLayoutManager()).mo4721a(i, 0);
    }
}
