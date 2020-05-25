package com.p683ss.android.ugc.aweme.setting;

import com.p683ss.android.ugc.aweme.p1439bl.C23858a;

/* renamed from: com.ss.android.ugc.aweme.setting.d */
public class C41592d extends C23858a {

    /* renamed from: b */
    private static C41592d f105325b;

    /* renamed from: a */
    public final void mo49461a() {
        this.f63535a = "ab_test_mock_config";
    }

    /* renamed from: b */
    public static C41592d m91454b() {
        if (f105325b == null) {
            synchronized (C41592d.class) {
                if (f105325b == null) {
                    f105325b = new C41592d();
                }
            }
        }
        return f105325b;
    }
}
