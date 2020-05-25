package com.bytedance.android.livesdk.p426x;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.service.C8860c;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.x.g */
final /* synthetic */ class C8572g implements C1710e {

    /* renamed from: a */
    private final C8860c f23508a;

    C8572g(C8860c cVar) {
        this.f23508a = cVar;
    }

    public final void accept(Object obj) {
        C8860c cVar = this.f23508a;
        C4177d dVar = (C4177d) obj;
        if (dVar.data != null) {
            cVar.mo15859a((Room) dVar.data);
        }
    }
}
