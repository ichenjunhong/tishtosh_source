package com.p683ss.android.ugc.aweme.discover.model;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import p2628d.C52857u;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchStateData */
public final class SearchStateData extends C0209x {
    private C0198r<Integer> searchStateData;

    public final C0198r<Integer> getSearchState() {
        if (this.searchStateData == null) {
            this.searchStateData = new C0198r<>();
        }
        C0198r<Integer> rVar = this.searchStateData;
        if (rVar != null) {
            return rVar;
        }
        throw new C52857u("null cannot be cast to non-null type android.arch.lifecycle.MutableLiveData<kotlin.Int>");
    }
}
