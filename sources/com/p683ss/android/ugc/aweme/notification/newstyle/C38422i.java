package com.p683ss.android.ugc.aweme.notification.newstyle;

import android.support.p030v4.widget.SwipeRefreshLayout;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.i */
public final class C38422i {

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.i$a */
    public static final class C38423a extends C1340m {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f97792a;

        /* renamed from: b */
        final /* synthetic */ SwipeRefreshLayout f97793b;

        C38423a(RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
            this.f97792a = recyclerView;
            this.f97793b = swipeRefreshLayout;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C1332i layoutManager = this.f97792a.getLayoutManager();
            if (layoutManager != null) {
                C52711k.m112236a((Object) layoutManager, "layoutManager ?: return");
                Boolean bool = null;
                if (layoutManager instanceof LinearLayoutManager) {
                    if (((LinearLayoutManager) layoutManager).mo4750k() <= 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    bool = Boolean.valueOf(z4);
                } else if (layoutManager instanceof GridLayoutManager) {
                    if (((GridLayoutManager) layoutManager).mo4750k() <= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bool = Boolean.valueOf(z3);
                } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                    int[] b = ((StaggeredGridLayoutManager) layoutManager).mo5241b((int[]) null);
                    C52711k.m112236a((Object) b, "firstVisiblePositions");
                    int i3 = 0;
                    for (int i4 : b) {
                        if (i4 <= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            i3++;
                        }
                    }
                    if (i3 > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                }
                if (bool != null && (this.f97793b.isEnabled() ^ bool.booleanValue())) {
                    if (bool.booleanValue()) {
                        this.f97793b.setEnabled(true);
                    } else if (!this.f97793b.mRefreshing) {
                        this.f97793b.setEnabled(false);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m85735a(RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout) {
        if (recyclerView != null && swipeRefreshLayout != null) {
            recyclerView.setOverScrollMode(0);
            recyclerView.mo4801a((C1340m) new C38423a(recyclerView, swipeRefreshLayout));
        }
    }
}
