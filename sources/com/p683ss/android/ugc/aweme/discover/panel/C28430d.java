package com.p683ss.android.ugc.aweme.discover.panel;

import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.C23600b;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.panel.d */
public final class C28430d implements C23600b {

    /* renamed from: a */
    private final C23600b f74710a;

    public final int getProgressViewEndOffset() {
        C23600b bVar = this.f74710a;
        if (bVar != null) {
            return bVar.getProgressViewEndOffset();
        }
        return 0;
    }

    public final int getProgressViewStartOffset() {
        C23600b bVar = this.f74710a;
        if (bVar != null) {
            return bVar.getProgressViewStartOffset();
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo48780a() {
        C23600b bVar = this.f74710a;
        if (bVar != null) {
            return bVar.mo48780a();
        }
        return false;
    }

    public C28430d(C23600b bVar) {
        this.f74710a = bVar;
    }

    public final void setOnRefreshListener(C23596b bVar) {
        C52711k.m112240b(bVar, "listener");
        C23600b bVar2 = this.f74710a;
        if (bVar2 != null) {
            bVar2.setOnRefreshListener(bVar);
        }
    }

    public final void setRefreshing(boolean z) {
        C23600b bVar = this.f74710a;
        if (bVar != null) {
            bVar.setRefreshing(z);
        }
    }

    /* renamed from: a */
    public final void mo48779a(boolean z, int i, int i2) {
        C23600b bVar = this.f74710a;
        if (bVar != null) {
            bVar.mo48779a(z, i, i2);
        }
    }
}
