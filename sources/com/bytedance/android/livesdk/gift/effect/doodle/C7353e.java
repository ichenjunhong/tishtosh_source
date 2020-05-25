package com.bytedance.android.livesdk.gift.effect.doodle;

import com.bytedance.android.live.base.model.user.User;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.gift.effect.doodle.e */
final /* synthetic */ class C7353e implements C1710e {

    /* renamed from: a */
    private final C7330a f20061a;

    C7353e(C7330a aVar) {
        this.f20061a = aVar;
    }

    public final void accept(Object obj) {
        C7330a aVar = this.f20061a;
        User user = (User) obj;
        if (aVar.f20010q != null && user != null) {
            aVar.f20003i = user;
            aVar.mo13598a(aVar.mo13600b());
            aVar.mo13601b(aVar.f19999e);
        }
    }
}
