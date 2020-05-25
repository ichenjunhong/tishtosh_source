package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27375i;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27378k;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.g */
public final class C27443g implements C27419al {

    /* renamed from: a */
    private C27375i f72215a = new C27375i();

    /* renamed from: b */
    private WeakReference<C27424ao> f72216b = null;

    /* renamed from: c */
    private C27378k f72217c = new C27378k();

    public final boolean cannotLoadLatest() {
        return false;
    }

    public final boolean cannotLoadMore() {
        return false;
    }

    public final int getPageType(int i) {
        return 7000;
    }

    public final Object getViewModel() {
        return this.f72215a;
    }

    public final boolean init(Fragment fragment) {
        return true;
    }

    public final boolean isDataEmpty() {
        return true;
    }

    public final boolean isLoading() {
        return this.f72217c.mo54804o();
    }

    public final void unInit() {
        this.f72216b = null;
        this.f72217c.mo46991S_();
        this.f72217c.aq_();
    }

    public final void bindView(C27424ao aoVar) {
        this.f72216b = new WeakReference<>(aoVar);
        this.f72217c.mo54800a(aoVar);
        this.f72217c.mo54799a(this.f72215a);
    }

    public final boolean deleteItem(String str) {
        if (!(this.f72216b == null || this.f72216b.get() == null)) {
            ((C27424ao) this.f72216b.get()).mo55800c();
        }
        return false;
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        this.f72217c.mo44934a_(bVar.getAid(), bVar.getEventType());
    }
}
