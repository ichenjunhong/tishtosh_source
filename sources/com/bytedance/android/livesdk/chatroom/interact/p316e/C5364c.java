package com.bytedance.android.livesdk.chatroom.interact.p316e;

import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.api.LinkPKApi;
import com.bytedance.android.livesdk.p270ab.C4514j;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.e.c */
final /* synthetic */ class C5364c implements C1710e {

    /* renamed from: a */
    private final C5362a f14302a;

    /* renamed from: b */
    private final long f14303b;

    C5364c(C5362a aVar, long j) {
        this.f14302a = aVar;
        this.f14303b = j;
    }

    public final void accept(Object obj) {
        C5362a aVar = this.f14302a;
        long j = this.f14303b;
        long longValue = ((Long) obj).longValue();
        LinkPKApi linkPKApi = (LinkPKApi) C4514j.m10883j().mo10321b().mo9550a(LinkPKApi.class);
        int i = 1;
        int i2 = longValue == ((long) aVar.f14298b) ? 1 : 0;
        int i3 = LinkCrossRoomDataHolder.m11103a().f12627r;
        if (!(LinkCrossRoomDataHolder.m11103a().f12627r == 2 && LinkCrossRoomDataHolder.m11103a().f12628s == 1)) {
            i = 0;
        }
        linkPKApi.autoMatch(j, i2, i3, i).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6505a((C1710e<? super T>) new C5367f<Object>(aVar, longValue), (C1710e<? super Throwable>) new C5368g<Object>(aVar));
    }
}
