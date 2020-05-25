package com.bytedance.android.live.gift;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.gift.a */
public final class C4117a {

    /* renamed from: b */
    private static C4117a f11313b;

    /* renamed from: a */
    public Map<C4121b, C4125c> f11314a = new HashMap();

    private C4117a() {
    }

    /* renamed from: a */
    public static C4117a m10252a() {
        if (f11313b == null) {
            f11313b = new C4117a();
        }
        return f11313b;
    }

    /* renamed from: b */
    public final void mo9489b() {
        for (C4125c a : this.f11314a.values()) {
            a.mo8665a();
        }
    }
}
