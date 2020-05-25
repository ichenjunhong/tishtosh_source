package com.p683ss.android.ugc.aweme.qrcode;

import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;

/* renamed from: com.ss.android.ugc.aweme.qrcode.d */
public final class C41000d {

    /* renamed from: a */
    private Boolean f104256a;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.d$a */
    static class C41002a {

        /* renamed from: a */
        public static C41000d f104257a = new C41000d();
    }

    private C41000d() {
    }

    /* renamed from: a */
    public static C41000d m90627a() {
        return C41002a.f104257a;
    }

    /* renamed from: b */
    public final Boolean mo83501b() {
        if (this.f104256a == null) {
            this.f104256a = Boolean.valueOf(C23859b.m58575b().mo49472b(C11010c.m22280a(), "enable_home_scan_qrcode", false));
        }
        return this.f104256a;
    }
}
