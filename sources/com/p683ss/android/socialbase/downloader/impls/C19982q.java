package com.p683ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import com.p683ss.android.socialbase.downloader.downloader.C19908r;

/* renamed from: com.ss.android.socialbase.downloader.impls.q */
public final class C19982q implements C19908r {

    /* renamed from: a */
    private final long[] f54926a;

    public C19982q(String str) {
        this.f54926a = m49304a(str);
    }

    /* renamed from: a */
    private static long[] m49304a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split.length == 0) {
                return null;
            }
            long[] jArr = new long[split.length];
            for (int i = 0; i < split.length; i++) {
                jArr[i] = Long.parseLong(split[i]);
            }
            return jArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final long mo41627a(int i, int i2) {
        if (this.f54926a == null || this.f54926a.length <= 0) {
            return 0;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 > this.f54926a.length - 1) {
            i3 = this.f54926a.length - 1;
        }
        return this.f54926a[i3];
    }
}
