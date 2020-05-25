package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.base.p185b.C2956c;
import com.bytedance.android.livesdkapi.C8830k;
import com.bytedance.android.livesdkapi.host.IHostUser;

/* renamed from: com.bytedance.android.livesdk.init.c */
final /* synthetic */ class C7702c implements C2956c {

    /* renamed from: a */
    static final C2956c f21197a = new C7702c();

    private C7702c() {
    }

    /* renamed from: a */
    public final long mo7597a() {
        return ((IHostUser) C8830k.m17325a(IHostUser.class)).getCurUserId();
    }
}
