package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.user.t */
final /* synthetic */ class C8360t implements C1711f {

    /* renamed from: a */
    private final long f22745a;

    C8360t(long j) {
        this.f22745a = j;
    }

    public final Object apply(Object obj) {
        long j = this.f22745a;
        int i = ((C8328c) ((C4177d) obj).data).f22676a;
        C8686a aVar = new C8686a();
        if (i == 1) {
            aVar.f23736e = 1;
        } else if (i == 2) {
            aVar.f23736e = 2;
        } else {
            aVar.f23736e = 0;
        }
        aVar.f23732a = j;
        return aVar;
    }
}
