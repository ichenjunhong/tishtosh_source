package com.bytedance.android.livesdk.config;

import com.bytedance.android.livesdk.p272ad.C4526c;

/* renamed from: com.bytedance.android.livesdk.config.a */
public final class C6717a {

    /* renamed from: a */
    public static C4526c<Boolean> f18302a = new C4526c<>("has_show_mobile_network_when_enter_live", Boolean.valueOf(false));

    /* renamed from: b */
    private static C6717a f18303b;

    /* renamed from: a */
    public static synchronized C6717a m14102a() {
        C6717a aVar;
        synchronized (C6717a.class) {
            if (f18303b == null) {
                f18303b = new C6717a();
            }
            aVar = f18303b;
        }
        return aVar;
    }
}
