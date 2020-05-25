package com.bytedance.android.livesdk.user;

import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.depend.p434b.C8615a;
import com.bytedance.android.livesdkapi.depend.p440h.C8636a;

/* renamed from: com.bytedance.android.livesdk.user.r */
final /* synthetic */ class C8358r implements C8636a {

    /* renamed from: a */
    private final C8348m f22741a;

    C8358r(C8348m mVar) {
        this.f22741a = mVar;
    }

    /* renamed from: a */
    public final void mo14560a(C8686a aVar) {
        this.f22741a.f22715e.onNext(aVar);
        C4495a.m10823a().mo10301a((Object) new C8615a(aVar));
    }
}
