package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.model.C7505d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.l */
final /* synthetic */ class C7300l implements C1710e {

    /* renamed from: a */
    private final GiftViewModel f19877a;

    /* renamed from: b */
    private final long f19878b;

    /* renamed from: c */
    private final long f19879c;

    /* renamed from: d */
    private final long f19880d;

    /* renamed from: e */
    private final C7505d f19881e;

    /* renamed from: f */
    private final int f19882f;

    C7300l(GiftViewModel giftViewModel, long j, long j2, long j3, C7505d dVar, int i) {
        this.f19877a = giftViewModel;
        this.f19878b = j;
        this.f19879c = j2;
        this.f19880d = j3;
        this.f19881e = dVar;
        this.f19882f = i;
    }

    public final void accept(Object obj) {
        this.f19877a.mo13528a(this.f19878b, this.f19879c, this.f19880d, this.f19881e, this.f19882f, (C4177d) obj);
    }
}
