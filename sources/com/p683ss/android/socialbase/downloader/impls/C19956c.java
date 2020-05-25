package com.p683ss.android.socialbase.downloader.impls;

import com.p683ss.android.socialbase.downloader.downloader.C19897i;

/* renamed from: com.ss.android.socialbase.downloader.impls.c */
public final class C19956c implements C19897i {
    /* renamed from: a */
    public final int mo41510a(long j) {
        if (j < 10485760) {
            return 1;
        }
        if (j < 52428800) {
            return 2;
        }
        return j < 104857600 ? 3 : 4;
    }
}
