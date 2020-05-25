package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.C7505d;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.m */
final /* synthetic */ class C7301m implements C1710e {

    /* renamed from: a */
    private final GiftViewModel f19883a;

    /* renamed from: b */
    private final long f19884b;

    /* renamed from: c */
    private final long f19885c;

    /* renamed from: d */
    private final C7505d f19886d;

    /* renamed from: e */
    private final int f19887e;

    C7301m(GiftViewModel giftViewModel, long j, long j2, C7505d dVar, int i) {
        this.f19883a = giftViewModel;
        this.f19884b = j;
        this.f19885c = j2;
        this.f19886d = dVar;
        this.f19887e = i;
    }

    public final void accept(Object obj) {
        GiftViewModel giftViewModel = this.f19883a;
        long j = this.f19884b;
        long j2 = this.f19885c;
        C7505d dVar = this.f19886d;
        int i = this.f19887e;
        Throwable th = (Throwable) obj;
        giftViewModel.mo13534a((Exception) th);
        C7647s.m15649a(j, j2, th);
        if (dVar != null && dVar.f20539H) {
            C7647s.m15647a(j, j2, i, "gift_panel", th);
        }
        giftViewModel.f19830g = false;
    }
}
