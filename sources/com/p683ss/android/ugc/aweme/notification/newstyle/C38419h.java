package com.p683ss.android.ugc.aweme.notification.newstyle;

import android.graphics.Rect;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.View;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.h */
public final class C38419h {

    /* renamed from: a */
    RecyclerView f97783a;

    /* renamed from: b */
    LinearLayoutManager f97784b;

    /* renamed from: c */
    int f97785c;

    /* renamed from: d */
    int f97786d = 6;

    /* renamed from: e */
    final Rect f97787e = new Rect();

    /* renamed from: f */
    final Rect f97788f = new Rect();

    /* renamed from: g */
    C38420a f97789g;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.h$a */
    public interface C38420a {
        /* renamed from: a */
        void mo78264a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.h$b */
    public static final class C38421b extends C1340m {

        /* renamed from: a */
        public boolean f97790a = true;

        /* renamed from: b */
        final /* synthetic */ C38419h f97791b;

        C38421b(C38419h hVar) {
            this.f97791b = hVar;
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            C52711k.m112240b(recyclerView, "recyclerView");
            if (i2 < 0) {
                z = true;
            } else {
                z = false;
            }
            this.f97790a = z;
            C38419h hVar = this.f97791b;
            boolean z2 = this.f97790a;
            LinearLayoutManager linearLayoutManager = hVar.f97784b;
            if (linearLayoutManager == null) {
                C52711k.m112237a("mLinearLayoutManager");
            }
            int j = linearLayoutManager.mo4749j();
            LinearLayoutManager linearLayoutManager2 = hVar.f97784b;
            if (linearLayoutManager2 == null) {
                C52711k.m112237a("mLinearLayoutManager");
            }
            int l = linearLayoutManager2.mo4751l();
            if (j != -1 && l != -1) {
                LinearLayoutManager linearLayoutManager3 = hVar.f97784b;
                if (linearLayoutManager3 == null) {
                    C52711k.m112237a("mLinearLayoutManager");
                }
                View c = linearLayoutManager3.mo4736c(j);
                LinearLayoutManager linearLayoutManager4 = hVar.f97784b;
                if (linearLayoutManager4 == null) {
                    C52711k.m112237a("mLinearLayoutManager");
                }
                View c2 = linearLayoutManager4.mo4736c(l);
                if (c != null && c2 != null) {
                    c.getLocalVisibleRect(hVar.f97787e);
                    c2.getGlobalVisibleRect(hVar.f97788f);
                    if (z2) {
                        if (hVar.f97785c > j) {
                            int i3 = hVar.f97785c;
                            for (int i4 = j; i4 < i3; i4++) {
                                C38420a aVar = hVar.f97789g;
                                if (aVar != null) {
                                    aVar.mo78264a(i4);
                                }
                            }
                            hVar.f97785c = j;
                        }
                        if (hVar.f97786d != l) {
                            hVar.f97786d = l;
                            return;
                        }
                    } else {
                        if (hVar.f97786d < l) {
                            int i5 = l + 1;
                            for (int i6 = hVar.f97786d + 1; i6 < i5; i6++) {
                                C38420a aVar2 = hVar.f97789g;
                                if (aVar2 != null) {
                                    aVar2.mo78264a(i6);
                                }
                            }
                            hVar.f97786d = l;
                        }
                        if (hVar.f97785c == j) {
                            hVar.f97786d = l;
                            return;
                        }
                    }
                    hVar.f97785c = j;
                }
            }
        }
    }
}
