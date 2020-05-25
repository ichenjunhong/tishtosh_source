package com.p683ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.support.p043v7.widget.C1422ak;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnClickListener;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.ax */
public final class C27836ax {

    /* renamed from: a */
    public static final C27836ax f73122a = new C27836ax();

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.ax$a */
    public static final class C27837a implements OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f73123a;

        /* renamed from: b */
        final /* synthetic */ Context f73124b;

        /* renamed from: c */
        final /* synthetic */ OnClickListener f73125c;

        /* renamed from: d */
        final /* synthetic */ List f73126d;

        public final void onViewAttachedToWindow(View view) {
            int[] iArr = new int[2];
            RecyclerView recyclerView = this.f73123a;
            if (recyclerView != null) {
                C1322a adapter = recyclerView.getAdapter();
                if (adapter != null && (adapter instanceof C27835aw)) {
                    iArr = ((C27835aw) adapter).f73119b;
                }
            }
            RecyclerView recyclerView2 = this.f73123a;
            if (recyclerView2 != null) {
                C1332i layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager != null && (layoutManager instanceof LinearLayoutManager)) {
                    ((LinearLayoutManager) layoutManager).mo4721a(iArr[0], iArr[1]);
                }
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            Integer num;
            int i;
            View view2;
            RecyclerView recyclerView = this.f73123a;
            if (recyclerView != null) {
                C1322a adapter = recyclerView.getAdapter();
                if (adapter != null && (adapter instanceof C27835aw)) {
                    C27835aw awVar = (C27835aw) adapter;
                    int[] iArr = new int[2];
                    C1332i layoutManager = awVar.f73120c.getLayoutManager();
                    if (layoutManager != null) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        if (linearLayoutManager != null) {
                            num = Integer.valueOf(linearLayoutManager.mo4750k());
                        } else {
                            num = null;
                        }
                        int i2 = 0;
                        iArr[0] = num.intValue();
                        C1422ak a = C1422ak.m4898a(linearLayoutManager, 0);
                        int size = awVar.f73118a.size();
                        int b = a.mo5518b();
                        int c = a.mo5520c();
                        if (size > 0) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        while (true) {
                            if (i2 == size) {
                                break;
                            }
                            RecyclerView recyclerView2 = awVar.f73120c;
                            if (recyclerView2 != null) {
                                view2 = recyclerView2.getChildAt(i2);
                            } else {
                                view2 = null;
                            }
                            if (view2 == null) {
                                break;
                            }
                            int a2 = a.mo5516a(view2);
                            int b2 = a.mo5519b(view2);
                            if (a2 < c && b2 > b && a2 >= b && b2 <= c) {
                                iArr[1] = a2;
                                break;
                            }
                            i2 += i;
                        }
                        C52711k.m112240b(iArr, "<set-?>");
                        awVar.f73119b = iArr;
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                    }
                }
            }
        }

        public C27837a(RecyclerView recyclerView, Context context, OnClickListener onClickListener, List list) {
            this.f73123a = recyclerView;
            this.f73124b = context;
            this.f73125c = onClickListener;
            this.f73126d = list;
        }
    }

    private C27836ax() {
    }
}
