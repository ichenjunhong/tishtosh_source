package com.p683ss.android.socialbase.downloader.impls;

import com.p683ss.android.socialbase.downloader.downloader.C19908r;

/* renamed from: com.ss.android.socialbase.downloader.impls.j */
public final class C19969j implements C19908r {
    /* renamed from: a */
    public final long mo41627a(int i, int i2) {
        if (i == 1) {
            return 3000;
        }
        if (i == 2) {
            return 15000;
        }
        if (i == 3) {
            return 30000;
        }
        return i > 3 ? 300000 : 0;
    }
}
