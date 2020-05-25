package com.p683ss.android.ugc.aweme.filter;

/* renamed from: com.ss.android.ugc.aweme.filter.ac */
final /* synthetic */ class C31400ac implements C31375b {

    /* renamed from: a */
    private final FilterViewImpl f82241a;

    C31400ac(FilterViewImpl filterViewImpl) {
        this.f82241a = filterViewImpl;
    }

    /* renamed from: a */
    public final void mo64268a(boolean z) {
        FilterViewImpl filterViewImpl = this.f82241a;
        if (z) {
            filterViewImpl.f82180g = null;
        }
        filterViewImpl.f82179f.setVisibility((z || filterViewImpl.f82180g == null || filterViewImpl.f82184k.mo64539c(filterViewImpl.f82180g) == 0.0f) ? 8 : 0);
    }
}
