package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5318k.C5319a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5318k.C5320b;
import com.bytedance.android.livesdk.p270ab.C4514j;
import p064c.p065a.C2203w;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.bc */
public final class C5418bc extends C5319a {
    public C5418bc(C5320b bVar) {
        super(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11313a(C4177d dVar) throws Exception {
        ((C5320b) this.f14144b).mo11203h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11314b(C4177d dVar) throws Exception {
        ((C5320b) this.f14144b).mo11200a();
    }

    /* renamed from: a */
    public final void mo11198a(boolean z) {
        C4002ac acVar = (C4002ac) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).settings(z ? 1 : 0).mo6525a((C2203w<T, ? extends R>) mo11148b());
        C5419bd bdVar = new C5419bd(this);
        C5320b bVar = (C5320b) this.f14144b;
        bVar.getClass();
        acVar.mo9406a(bdVar, new C5420be(bVar));
    }

    /* renamed from: b */
    public final void mo11199b(boolean z) {
        int i;
        LinkApi linkApi = (LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class);
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        C4002ac acVar = (C4002ac) linkApi.settings(i).mo6525a((C2203w<T, ? extends R>) mo11148b());
        C5421bf bfVar = new C5421bf(this);
        C5320b bVar = (C5320b) this.f14144b;
        bVar.getClass();
        acVar.mo9406a(bfVar, new C5422bg(bVar));
    }
}
