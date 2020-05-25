package com.p683ss.android.ugc.aweme.lancet.p1153c;

import android.text.TextUtils;
import com.bytedance.retrofit2.p830a.C12686c;
import com.p683ss.android.ugc.aweme.feed.api.C30146d;

/* renamed from: com.ss.android.ugc.aweme.lancet.c.f */
public final class C18981f {
    /* renamed from: a */
    public static int m46159a(C12686c cVar) {
        if (cVar == null) {
            return -1;
        }
        String c = cVar.mo23860c();
        if (TextUtils.isEmpty(c)) {
            return -1;
        }
        if (C30146d.m70749a(c)) {
            return 1;
        }
        if (C30146d.m70750b(c)) {
            return 2;
        }
        return -1;
    }
}
