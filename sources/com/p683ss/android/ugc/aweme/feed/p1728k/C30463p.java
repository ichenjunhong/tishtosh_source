package com.p683ss.android.ugc.aweme.feed.p1728k;

import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1338k;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.feed.k.p */
public final class C30463p extends C1338k {

    /* renamed from: a */
    RecyclerView f79594a;

    /* renamed from: b */
    public int f79595b;

    /* renamed from: c */
    private C30462o f79596c;

    /* renamed from: d */
    private boolean f79597d = true;

    /* renamed from: e */
    private int[] f79598e;

    /* renamed from: f */
    private int[] f79599f;

    /* renamed from: g */
    private int f79600g = -1;

    /* renamed from: a */
    private void m71394a() {
        if (this.f79596c.aW_()) {
            this.f79596c.aU_();
        } else {
            this.f79596c.mo47019a(false);
        }
    }

    public C30463p(RecyclerView recyclerView, C30462o oVar) {
        this.f79594a = recyclerView;
        this.f79596c = oVar;
    }

    /* renamed from: a */
    public final boolean mo5078a(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (!this.f79597d) {
            return false;
        }
        C1332i layoutManager = this.f79594a.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            i4 = gridLayoutManager.mo4749j();
            i3 = gridLayoutManager.mo4751l();
            if (this.f79600g == -1) {
                this.f79600g = gridLayoutManager.f4521b;
            }
        } else if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            i4 = linearLayoutManager.mo4749j();
            i3 = linearLayoutManager.mo4751l();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            if (this.f79600g == -1) {
                this.f79600g = staggeredGridLayoutManager.f4896a;
            }
            if (this.f79598e == null) {
                this.f79598e = new int[staggeredGridLayoutManager.f4896a];
            }
            if (this.f79599f == null) {
                this.f79599f = new int[staggeredGridLayoutManager.f4896a];
            }
            staggeredGridLayoutManager.mo5240a(this.f79598e);
            staggeredGridLayoutManager.mo5242c(this.f79599f);
            i4 = this.f79598e[0];
            i3 = this.f79599f[this.f79599f.length - 1];
        } else {
            throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager and StaggeredGridLayoutManager");
        }
        int s = layoutManager.mo5062s();
        int A = layoutManager.mo5013A();
        if (s > 0) {
            View c = layoutManager.mo4736c(i4);
            if (c != null) {
                i5 = c.getHeight();
            } else {
                i5 = 0;
            }
            if (i5 == 0) {
                return false;
            }
            if (this.f79600g == -1) {
                if (this.f79595b <= 0 || this.f79595b > A) {
                    this.f79595b = 2;
                }
                if ((i2 / i5) + i3 >= A - this.f79595b) {
                    m71394a();
                }
            } else {
                if ((i2 / i5) + (i3 / this.f79600g) + 3 >= A / this.f79600g) {
                    m71394a();
                }
            }
        }
        return false;
    }
}
