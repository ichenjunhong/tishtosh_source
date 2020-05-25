package com.p683ss.android.ugc.aweme.discover.adapter;

import com.p683ss.android.ugc.aweme.discover.adapter.C27872bj.C27874b;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.bi */
final /* synthetic */ class C27871bi implements C27874b {

    /* renamed from: a */
    private final C27869bh f73226a;

    C27871bi(C27869bh bhVar) {
        this.f73226a = bhVar;
    }

    /* renamed from: a */
    public final void mo56295a(int i) {
        C27869bh bhVar = this.f73226a;
        if (i >= 0 && i < bhVar.getItemCount()) {
            bhVar.f73219a.remove(i);
            bhVar.notifyItemRemoved(i);
        }
    }
}
