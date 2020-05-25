package com.p683ss.android.ugc.aweme.filter;

import android.arch.lifecycle.C0199s;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31487c;
import p2628d.C52847n;

/* renamed from: com.ss.android.ugc.aweme.filter.af */
final /* synthetic */ class C31403af implements C0199s {

    /* renamed from: a */
    private final FilterViewImpl f82244a;

    C31403af(FilterViewImpl filterViewImpl) {
        this.f82244a = filterViewImpl;
    }

    public final void onChanged(Object obj) {
        FilterViewImpl filterViewImpl = this.f82244a;
        C52847n nVar = (C52847n) obj;
        String str = null;
        filterViewImpl.f82180g = null;
        C31459g gVar = nVar != null ? (C31459g) nVar.getFirst() : null;
        if (nVar != null) {
            str = (String) nVar.getSecond();
        }
        if (gVar != null && C31487c.m73325a(filterViewImpl.f82186m, gVar)) {
            filterViewImpl.f82180g = gVar;
            if (filterViewImpl.f82183j.booleanValue()) {
                if (filterViewImpl.f82184k.mo64539c(filterViewImpl.f82180g) == 0.0f) {
                    filterViewImpl.f82179f.setVisibility(8);
                } else {
                    filterViewImpl.f82179f.setVisibility(0);
                    filterViewImpl.f82179f.setProgress(filterViewImpl.f82184k.mo64537a(filterViewImpl.f82180g));
                    int b = filterViewImpl.f82184k.mo64538b(filterViewImpl.f82180g);
                    if (b == 0 || b == 100) {
                        filterViewImpl.f82179f.setDefaultDotProgress(-1);
                    } else {
                        filterViewImpl.f82179f.setDefaultDotProgress(filterViewImpl.f82184k.mo64538b(filterViewImpl.f82180g));
                    }
                }
            }
            filterViewImpl.f82182i.mo64276a(gVar, str);
        }
    }
}
