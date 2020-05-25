package com.p683ss.android.ugc.aweme.profile.util;

import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1338k;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;

/* renamed from: com.ss.android.ugc.aweme.profile.util.ad */
public final class C40528ad {

    /* renamed from: com.ss.android.ugc.aweme.profile.util.ad$a */
    public static class C40529a extends C1338k {

        /* renamed from: a */
        RecyclerView f103423a;

        /* renamed from: b */
        private C30462o f103424b;

        /* renamed from: c */
        private boolean f103425c = true;

        /* renamed from: d */
        private int[] f103426d;

        /* renamed from: e */
        private int[] f103427e;

        /* renamed from: f */
        private int f103428f = -1;

        /* renamed from: g */
        private int f103429g = 2;

        /* renamed from: a */
        private void m89933a() {
            if (this.f103424b.aW_()) {
                this.f103424b.aU_();
            } else {
                this.f103424b.mo47019a(false);
            }
        }

        public C40529a(RecyclerView recyclerView, C30462o oVar) {
            this.f103423a = recyclerView;
            this.f103424b = oVar;
        }

        /* renamed from: a */
        public final boolean mo5078a(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (!this.f103425c) {
                return false;
            }
            C1332i layoutManager = this.f103423a.getLayoutManager();
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                i4 = gridLayoutManager.mo4749j();
                i3 = gridLayoutManager.mo4751l();
                if (this.f103428f == -1) {
                    this.f103428f = gridLayoutManager.f4521b;
                }
            } else if (layoutManager instanceof LinearLayoutManager) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                i4 = linearLayoutManager.mo4749j();
                i3 = linearLayoutManager.mo4751l();
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                if (this.f103428f == -1) {
                    this.f103428f = staggeredGridLayoutManager.f4896a;
                }
                if (this.f103426d == null) {
                    this.f103426d = new int[staggeredGridLayoutManager.f4896a];
                }
                if (this.f103427e == null) {
                    this.f103427e = new int[staggeredGridLayoutManager.f4896a];
                }
                staggeredGridLayoutManager.mo5240a(this.f103426d);
                staggeredGridLayoutManager.mo5242c(this.f103427e);
                i4 = this.f103426d[0];
                i3 = this.f103427e[this.f103427e.length - 1];
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
                if (this.f103428f == -1) {
                    if (this.f103429g <= 0 || this.f103429g > A) {
                        this.f103429g = 2;
                    }
                    if ((i2 / i5) + i3 >= A - this.f103429g) {
                        m89933a();
                    }
                } else {
                    if ((i2 / i5) + (i3 / this.f103428f) + 18 >= A / this.f103428f) {
                        m89933a();
                    }
                }
            }
            return false;
        }
    }
}
