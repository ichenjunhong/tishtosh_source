package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5291b.C5292a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5291b.C5293b;
import com.bytedance.android.livesdk.p270ab.C4514j;
import p064c.p065a.C2201v;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.k */
public final class C5603k extends C5292a {
    public C5603k(C5293b bVar) {
        super(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11493a(C4177d dVar) throws Exception {
        ((C5293b) this.f14144b).mo11144a();
    }

    /* renamed from: a */
    public final void mo11143a(long j) {
        C2201v a = ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).checkPermissionV3(j).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
        C5604l lVar = new C5604l(this);
        C5293b bVar = (C5293b) this.f14144b;
        bVar.getClass();
        a.mo6505a((C1710e<? super T>) lVar, (C1710e<? super Throwable>) new C5605m<Object>(bVar));
    }
}
