package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.C4126d;
import com.bytedance.android.live.network.response.C4177d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.l */
final /* synthetic */ class C7487l implements C1710e {

    /* renamed from: a */
    private final C4126d f20502a;

    /* renamed from: b */
    private final long f20503b;

    /* renamed from: c */
    private final User f20504c;

    /* renamed from: d */
    private final long f20505d;

    /* renamed from: e */
    private final long f20506e;

    C7487l(C4126d dVar, long j, User user, long j2, long j3) {
        this.f20502a = dVar;
        this.f20503b = j;
        this.f20504c = user;
        this.f20505d = j2;
        this.f20506e = j3;
    }

    public final void accept(Object obj) {
        GiftManager.lambda$sendGiftInternal$7$GiftManager(this.f20502a, this.f20503b, this.f20504c, this.f20505d, this.f20506e, (C4177d) obj);
    }
}
