package com.p683ss.android.ugc.aweme.setting;

import com.p683ss.android.ugc.aweme.p1439bl.C23858a;

/* renamed from: com.ss.android.ugc.aweme.setting.e */
public class C41594e extends C23858a {

    /* renamed from: b */
    private static C41594e f105326b;

    /* renamed from: a */
    public final void mo49461a() {
        this.f63535a = "ab_test_config";
    }

    /* renamed from: b */
    public static C41594e m91457b() {
        if (f105326b == null) {
            synchronized (C41594e.class) {
                if (f105326b == null) {
                    f105326b = new C41594e();
                }
            }
        }
        return f105326b;
    }
}
