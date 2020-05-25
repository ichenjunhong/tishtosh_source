package com.p683ss.android.ugc.aweme.discover.helper;

import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewConfiguration;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.discover.adapter.C27903j.C27904a;
import com.p683ss.android.ugc.aweme.discover.adapter.CategoryViewHolder;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.h */
public final class C28199h extends C1340m {

    /* renamed from: a */
    public C28200a f74029a;

    /* renamed from: b */
    private int f74030b;

    /* renamed from: c */
    private int f74031c = ViewConfiguration.get(C11010c.m22280a()).getScaledTouchSlop();

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.h$a */
    public interface C28200a {
    }

    /* renamed from: a */
    public final boolean mo56614a() {
        if (this.f74030b == 0) {
            return true;
        }
        return false;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (i == 0) {
            m67093a(recyclerView, true);
            this.f74030b = linearLayoutManager.mo4749j();
        }
    }

    /* renamed from: a */
    public static void m67093a(RecyclerView recyclerView, boolean z) {
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1352v b = recyclerView.mo4812b(recyclerView.getChildAt(i));
                if (b != null && b.mItemViewType == C27904a.m66653a()) {
                    if (z) {
                        ((CategoryViewHolder) b).mo56175b();
                    } else {
                        ((CategoryViewHolder) b).mo56176c();
                    }
                }
            }
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (Math.abs(i2) <= this.f74031c) {
            m67093a(recyclerView, true);
        }
    }
}
