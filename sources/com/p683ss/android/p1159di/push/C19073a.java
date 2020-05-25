package com.p683ss.android.p1159di.push;

import com.p683ss.android.ugc.awemepushapi.IPushApi;
import com.p683ss.android.ugc.awemepushlib.interaction.PushService;

/* renamed from: com.ss.android.di.push.a */
public final class C19073a {
    /* renamed from: a */
    public static IPushApi m46451a() {
        IPushApi iPushApi;
        try {
            iPushApi = PushService.createIPushApibyMonsterPlugin();
        } catch (Exception unused) {
            iPushApi = null;
        }
        if (iPushApi == null) {
            return new PushServiceMock();
        }
        return iPushApi;
    }
}
