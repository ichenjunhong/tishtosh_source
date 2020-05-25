package com.bytedance.android.livesdk.chatroom.interact.p321j;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.livesdk.chatroom.api.C4994d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.ies.sdk.widgets.KVData;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.j.b */
final /* synthetic */ class C5633b implements C0199s {

    /* renamed from: a */
    private final C5630a f14767a;

    C5633b(C5630a aVar) {
        this.f14767a = aVar;
    }

    public final void onChanged(Object obj) {
        C5630a aVar = this.f14767a;
        KVData kVData = (KVData) obj;
        if (kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            C5202u uVar = (C5202u) kVData.getData();
            if (aVar.f14757e && 6 == uVar.f13919a && !aVar.f14755c && uVar.f13921c > 0 && uVar.f13922d != null) {
                aVar.f14755c = true;
                long j = uVar.f13921c;
                aVar.f14759g.mo6181a(((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).contributorRank(aVar.f14756d.getId(), j, uVar.f13922d, 0).mo6157b(C4994d.f13377a).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6152a((C1710e<? super T>) new C5634c<Object>(aVar, j), (C1710e<? super Throwable>) new C5638g<Object>(aVar)));
            }
        }
    }
}
