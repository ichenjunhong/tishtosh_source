package com.p683ss.android.ugc.aweme.main;

import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.C23600b;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;
import com.p683ss.android.ugc.aweme.main.p1942e.C36621d;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.main.dv */
public final class C36603dv implements C23600b {

    /* renamed from: a */
    private C23600b f93705a;

    public final int getProgressViewEndOffset() {
        return this.f93705a.getProgressViewEndOffset();
    }

    public final int getProgressViewStartOffset() {
        return this.f93705a.getProgressViewStartOffset();
    }

    /* renamed from: a */
    public final boolean mo48780a() {
        return this.f93705a.mo48780a();
    }

    public C36603dv(C23600b bVar) {
        this.f93705a = bVar;
    }

    public final void setOnRefreshListener(C23596b bVar) {
        this.f93705a.setOnRefreshListener(bVar);
    }

    public final void setRefreshing(final boolean z) {
        this.f93705a.setRefreshing(z);
        if (!z) {
            C47718bf.m103288a(new C36621d() {
                /* renamed from: a */
                public final /* synthetic */ void mo48682a(Object obj) {
                    ((SwipeRefreshLayout) obj).setRefreshing(z);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo48779a(boolean z, int i, int i2) {
        this.f93705a.mo48779a(z, i, i2);
    }
}
