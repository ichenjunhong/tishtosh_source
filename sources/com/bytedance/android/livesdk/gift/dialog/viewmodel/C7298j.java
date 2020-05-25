package com.bytedance.android.livesdk.gift.dialog.viewmodel;

import com.bytedance.android.livesdk.gift.C7647s;
import com.bytedance.android.livesdk.gift.model.Prop;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.dialog.viewmodel.j */
final /* synthetic */ class C7298j implements C1710e {

    /* renamed from: a */
    private final GiftViewModel f19873a;

    /* renamed from: b */
    private final Prop f19874b;

    /* renamed from: c */
    private final long f19875c;

    C7298j(GiftViewModel giftViewModel, Prop prop, long j) {
        this.f19873a = giftViewModel;
        this.f19874b = prop;
        this.f19875c = j;
    }

    public final void accept(Object obj) {
        GiftViewModel giftViewModel = this.f19873a;
        Prop prop = this.f19874b;
        long j = this.f19875c;
        Throwable th = (Throwable) obj;
        giftViewModel.f19830g = false;
        if (th instanceof Exception) {
            giftViewModel.mo13534a((Exception) th);
        }
        C7647s.m15654b(prop.f20511id, j, th);
    }
}
