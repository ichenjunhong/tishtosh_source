package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.livesdk.feed.C7005j;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.p339g.C6951a;

public class FragmentFeedViewModel extends BaseFeedDataViewModel {

    /* renamed from: D */
    public boolean f19397D;

    /* renamed from: E */
    private boolean f19398E;

    /* renamed from: i */
    private void m14841i() {
        if (this.f19397D && this.f19376a != null) {
            this.f19376a.mo12976d();
        }
    }

    /* renamed from: d */
    public final void mo13265d() {
        if (this.f19398E && !this.f19397D) {
            super.mo13265d();
            this.f19397D = true;
        }
    }

    /* renamed from: a */
    public final void mo13272a(boolean z) {
        this.f19398E = z;
        if (!this.f19398E) {
            m14841i();
        }
        mo13265d();
    }

    public FragmentFeedViewModel(IFeedRepository iFeedRepository, C7005j jVar, C6951a aVar) {
        super(iFeedRepository, jVar, aVar);
    }
}
