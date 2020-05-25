package com.p683ss.android.ugc.aweme.p1361ap;

import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;

/* renamed from: com.ss.android.ugc.aweme.ap.d */
public final class C22816d {
    /* renamed from: a */
    public static void m56188a(boolean z, boolean z2) {
        String str;
        String str2 = "choose_upload_content";
        C23089d a = C23089d.m56640a().mo47829a("content_type", "video");
        String str3 = "upload_type";
        if (z) {
            str = "mutiple_content";
        } else {
            str = "single_content";
        }
        C26890h.m65011a(str2, a.mo47829a(str3, str).f61491a);
    }
}
