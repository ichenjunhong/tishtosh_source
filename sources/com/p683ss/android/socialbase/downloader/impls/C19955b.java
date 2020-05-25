package com.p683ss.android.socialbase.downloader.impls;

import com.p683ss.android.socialbase.downloader.downloader.C19896h;
import com.p683ss.android.socialbase.downloader.p1216f.C19931h;

/* renamed from: com.ss.android.socialbase.downloader.impls.b */
public final class C19955b implements C19896h {
    /* renamed from: a */
    public final int mo41509a(int i, C19931h hVar) {
        if (hVar.ordinal() <= C19931h.MODERATE.ordinal()) {
            return 1;
        }
        if (hVar == C19931h.GOOD) {
            return i - 1;
        }
        return i;
    }
}
