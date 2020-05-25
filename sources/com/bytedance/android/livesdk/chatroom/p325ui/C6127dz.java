package com.bytedance.android.livesdk.chatroom.p325ui;

import com.bytedance.android.livesdk.message.model.C7833bh;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.dz */
final /* synthetic */ class C6127dz implements C1710e {

    /* renamed from: a */
    private final C6118ds f16433a;

    /* renamed from: b */
    private final C7833bh f16434b;

    C6127dz(C6118ds dsVar, C7833bh bhVar) {
        this.f16433a = dsVar;
        this.f16434b = bhVar;
    }

    public final void accept(Object obj) {
        C6118ds dsVar = this.f16433a;
        C8686a aVar = (C8686a) obj;
        this.f16434b.f21606a.setFollowStatus(aVar.mo15140a());
        dsVar.f16403e.setVisibility(aVar.mo15140a() == 0 ? 0 : 8);
    }
}
