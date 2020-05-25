package com.bytedance.android.live.base.p192sp;

import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.base.sp.c */
final /* synthetic */ class C3020c implements C1710e {

    /* renamed from: a */
    static final C1710e f8896a = new C3020c();

    private C3020c() {
    }

    public final void accept(Object obj) {
        TTLiveSettingUtil.update.onNext((Boolean) obj);
    }
}
