package com.p683ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.util.AttributeSet;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AutoPollRecyclerView */
public final class AutoPollRecyclerView extends RecyclerView {

    /* renamed from: O */
    public static final C43136a f108976O = new C43136a(null);

    /* renamed from: N */
    public boolean f108977N;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.AutoPollRecyclerView$a */
    public static final class C43136a {
        private C43136a() {
        }

        public /* synthetic */ C43136a(C52707g gVar) {
            this();
        }
    }

    public AutoPollRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AutoPollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: o */
    public final void mo49162o() {
        if (this.f108977N) {
            this.f108977N = false;
            mo4848f();
        }
    }

    public final void setRunning(boolean z) {
        this.f108977N = z;
    }

    /* renamed from: g */
    public final void mo87670g(int i) {
        C1322a adapter = getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            this.f108977N = true;
            if (i == -1) {
                mo4833d(0);
            } else {
                mo4833d(itemCount - 1);
            }
        }
    }

    /* renamed from: g */
    public final void mo87671g(int i, int i2) {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            C1332i layoutManager = getLayoutManager();
            if (layoutManager != null) {
                ((LinearLayoutManager) layoutManager).mo4721a(i, i2);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
        throw new IllegalArgumentException("layoutManager must be a subclass of LinearLayoutManager");
    }

    public AutoPollRecyclerView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ AutoPollRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
