package com.p683ss.android.ugc.aweme.miniapp.impl;

import com.bytedance.ies.C10174a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36929k;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.o */
public final class C36907o implements C36929k {
    /* renamed from: b */
    public final boolean mo76162b() {
        try {
            return C32816h.m75716b().getMiniappPreloadEmptyProcessEnbale().booleanValue();
        } catch (C10174a unused) {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo76161a() {
        try {
            if (C32816h.m75716b().getMiniappPreloadEnbale().intValue() == 1) {
                return true;
            }
            return false;
        } catch (C10174a unused) {
            return false;
        }
    }
}
