package com.bytedance.android.livesdk.p426x;

import com.bytedance.android.live.network.response.C4176c;
import com.bytedance.android.livesdk.live.model.C7759c;
import com.bytedance.android.livesdkapi.service.C8859b;
import com.bytedance.common.utility.C9414h;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.x.e */
final /* synthetic */ class C8570e implements C1710e {

    /* renamed from: a */
    private final C8859b f23506a;

    C8570e(C8859b bVar) {
        this.f23506a = bVar;
    }

    public final void accept(Object obj) {
        C8859b bVar = this.f23506a;
        C4176c cVar = (C4176c) obj;
        if (!C9414h.m18630a(cVar.f11365b)) {
            C7759c cVar2 = (C7759c) cVar.f11365b.get(0);
            if (cVar2 != null) {
                bVar.mo15858a(cVar2.f21333b);
            }
        }
    }
}
