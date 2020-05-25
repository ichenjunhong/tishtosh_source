package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.User;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.user.z */
final /* synthetic */ class C8366z implements C1710e {

    /* renamed from: a */
    private final C8348m f22757a;

    C8366z(C8348m mVar) {
        this.f22757a = mVar;
    }

    public final void accept(Object obj) {
        C8348m mVar = this.f22757a;
        User user = (User) obj;
        mVar.f22714d.onNext(user);
        mVar.mo14524a((C3009i) user);
    }
}
