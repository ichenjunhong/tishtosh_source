package com.p683ss.android.ugc.aweme.discover.model;

import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchFragmentReactNativeExperiment;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchIntermediateViewModel$getIntermediateContainer$1 */
final class SearchIntermediateViewModel$getIntermediateContainer$1 extends C52712l implements C52670a<String> {
    public static final SearchIntermediateViewModel$getIntermediateContainer$1 INSTANCE = new SearchIntermediateViewModel$getIntermediateContainer$1();

    SearchIntermediateViewModel$getIntermediateContainer$1() {
        super(0);
    }

    public final String invoke() {
        if (C10181b.m20511a().mo18172a(SearchFragmentReactNativeExperiment.class, true, "search_native_fragment", 31744, false)) {
            return "cross_platform_not_init";
        }
        return "native";
    }
}
