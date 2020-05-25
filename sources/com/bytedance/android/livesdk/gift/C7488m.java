package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.gift.C4126d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.m */
final /* synthetic */ class C7488m implements C1710e {

    /* renamed from: a */
    private final C4126d f20507a;

    /* renamed from: b */
    private final long f20508b;

    /* renamed from: c */
    private final long f20509c;

    C7488m(C4126d dVar, long j, long j2) {
        this.f20507a = dVar;
        this.f20508b = j;
        this.f20509c = j2;
    }

    public final void accept(Object obj) {
        GiftManager.lambda$sendGiftInternal$8$GiftManager(this.f20507a, this.f20508b, this.f20509c, (Throwable) obj);
    }
}
