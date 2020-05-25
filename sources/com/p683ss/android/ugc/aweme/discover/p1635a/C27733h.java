package com.p683ss.android.ugc.aweme.discover.p1635a;

import android.content.Context;
import android.content.res.Resources;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.a.h */
final class C27733h extends C1340m {

    /* renamed from: a */
    C27734a f72786a;

    /* renamed from: b */
    public boolean f72787b = true;

    /* renamed from: c */
    private int f72788c = 3;

    /* renamed from: d */
    private int f72789d;

    /* renamed from: e */
    private int f72790e;

    /* renamed from: f */
    private int f72791f = -1;

    /* renamed from: com.ss.android.ugc.aweme.discover.a.h$a */
    public interface C27734a {
        /* renamed from: a */
        void mo56155a();
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C52711k.m112240b(recyclerView, "recyclerView");
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        C52711k.m112240b(recyclerView, "recyclerView");
        if (this.f72787b && i2 >= 0 && i >= 0) {
            if (this.f72790e == 0) {
                Context context = recyclerView.getContext();
                C52711k.m112236a((Object) context, "recyclerView.context");
                Resources resources = context.getResources();
                C52711k.m112236a((Object) resources, "recyclerView.context.resources");
                this.f72790e = (int) (resources.getDisplayMetrics().density * 40.0f);
            }
            this.f72789d += i2;
            if (this.f72789d > this.f72790e) {
                C1332i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null) {
                    C52711k.m112236a((Object) layoutManager, "recyclerView.layoutManager ?: return");
                    int i4 = Integer.MAX_VALUE;
                    int A = layoutManager.mo5013A() - 1;
                    if (layoutManager instanceof GridLayoutManager) {
                        GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                        int i5 = this.f72788c * gridLayoutManager.f4521b;
                        int i6 = A - 1;
                        int i7 = 0;
                        while (true) {
                            if (i6 < 0) {
                                break;
                            }
                            i7 += gridLayoutManager.f4526g.mo4690a(i6);
                            if (i7 >= i5) {
                                i4 = i6;
                                break;
                            }
                            i6--;
                        }
                        i3 = gridLayoutManager.mo4751l();
                    } else if (layoutManager instanceof LinearLayoutManager) {
                        i4 = (A - 1) - (this.f72788c * 1);
                        i3 = ((LinearLayoutManager) layoutManager).mo4751l();
                    } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                        int[] iArr = new int[staggeredGridLayoutManager.f4896a];
                        staggeredGridLayoutManager.mo5242c(iArr);
                        int i8 = iArr[0];
                        int i9 = i8;
                        for (int i10 : iArr) {
                            if (i10 > i9) {
                                i9 = i10;
                            }
                        }
                        i4 = A - (staggeredGridLayoutManager.f4896a * this.f72788c);
                        i3 = i9;
                    }
                    if (layoutManager.mo5062s() > 0 && i3 >= i4 && this.f72791f != i4) {
                        this.f72791f = i4;
                        C27734a aVar = this.f72786a;
                        if (aVar != null) {
                            aVar.mo56155a();
                        }
                    }
                }
                this.f72789d = 0;
            }
        }
    }
}
