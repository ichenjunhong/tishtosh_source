package com.p683ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import com.C2240a;
import com.p683ss.android.socialbase.downloader.downloader.C19902l;
import com.p683ss.android.socialbase.downloader.p1221j.C19994e;

/* renamed from: com.ss.android.socialbase.downloader.impls.i */
public final class C19968i implements C19902l {
    /* renamed from: a */
    public final int mo41565a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String c = C19994e.m49376c(C2240a.m6772a("%s_%s", new Object[]{str, str2}));
        if (TextUtils.isEmpty(c)) {
            return 0;
        }
        return c.hashCode();
    }
}
