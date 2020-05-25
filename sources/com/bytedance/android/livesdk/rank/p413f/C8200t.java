package com.bytedance.android.livesdk.rank.p413f;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.rank.f.t */
final /* synthetic */ class C8200t implements C1710e {

    /* renamed from: a */
    private final C8197a f22387a;

    /* renamed from: b */
    private final User f22388b;

    C8200t(C8197a aVar, User user) {
        this.f22387a = aVar;
        this.f22388b = user;
    }

    public final void accept(Object obj) {
        C8197a aVar = this.f22387a;
        User user = this.f22388b;
        C8686a aVar2 = (C8686a) obj;
        if (aVar.f22379k == user && aVar.f22379k.getId() == user.getId()) {
            user.setFollowStatus(aVar2.mo15140a());
            boolean z = aVar.f22382n;
            aVar.f22373e.setVisibility(8);
        }
    }
}
