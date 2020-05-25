package com.p683ss.android.ugc.aweme.shortvideo;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dg */
public final class C43213dg {
    /* renamed from: a */
    public static C42437ay m94816a(SynthetiseResult synthetiseResult) {
        if (synthetiseResult == null) {
            return new C42437ay();
        }
        return new C42437ay().mo86517a("is_fast_import", Boolean.valueOf(synthetiseResult.isFastImport)).mo86521a("support_max_resolution", synthetiseResult.fastImportResolution).mo86517a("is_new_framework", Boolean.valueOf(synthetiseResult.isNewFramework)).mo86517a("has_subtitle", Boolean.valueOf(synthetiseResult.hasSubtitle)).mo86519a("segment_count", Integer.valueOf(synthetiseResult.segmentCount));
    }
}
