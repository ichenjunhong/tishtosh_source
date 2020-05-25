package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.gift.model.Prop;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.i */
final /* synthetic */ class C7297i implements C1710e {

    /* renamed from: a */
    private final GiftViewModel f19869a;

    /* renamed from: b */
    private final Prop f19870b;

    /* renamed from: c */
    private final long f19871c;

    /* renamed from: d */
    private final long f19872d;

    C7297i(GiftViewModel giftViewModel, Prop prop, long j, long j2) {
        this.f19869a = giftViewModel;
        this.f19870b = prop;
        this.f19871c = j;
        this.f19872d = j2;
    }

    public final void accept(Object obj) {
        this.f19869a.mo13532a(this.f19870b, this.f19871c, this.f19872d, (C4177d) obj);
    }
}
