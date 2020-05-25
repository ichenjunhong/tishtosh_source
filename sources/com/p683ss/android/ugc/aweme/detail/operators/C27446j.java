package com.p683ss.android.ugc.aweme.detail.operators;

import android.support.p030v4.app.Fragment;
import com.bytedance.common.utility.p522b.C9380f;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27375i;
import com.p683ss.android.ugc.aweme.detail.p1627i.C27378k;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.j */
public final class C27446j implements C27419al {

    /* renamed from: a */
    private WeakReference<C27424ao> f72218a;

    /* renamed from: b */
    private C27375i f72219b = new C27375i();

    /* renamed from: c */
    private C27378k f72220c = new C27378k();

    public final boolean cannotLoadLatest() {
        return false;
    }

    public final boolean cannotLoadMore() {
        return false;
    }

    public final int getPageType(int i) {
        return i + 3000;
    }

    public final Object getViewModel() {
        return this.f72219b;
    }

    public final boolean init(Fragment fragment) {
        return true;
    }

    public final boolean isDataEmpty() {
        return true;
    }

    public final boolean isLoading() {
        return this.f72220c.mo54804o();
    }

    public final void unInit() {
        this.f72220c.mo46991S_();
        this.f72220c.aq_();
    }

    public final void bindView(C27424ao aoVar) {
        this.f72218a = new C9380f(aoVar);
        this.f72220c.mo54800a(aoVar);
        this.f72220c.mo54799a(this.f72219b);
    }

    public final boolean deleteItem(String str) {
        if (!(this.f72218a == null || this.f72218a.get() == null)) {
            ((C27424ao) this.f72218a.get()).mo55800c();
        }
        return false;
    }

    public final void request(int i, C30669b bVar, int i2, boolean z) {
        this.f72220c.mo44934a_(bVar.getAid(), bVar.getEventType());
    }
}
