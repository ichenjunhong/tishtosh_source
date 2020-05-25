package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5300e.C5301a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5300e.C5302b;
import com.bytedance.android.livesdk.chatroom.interact.p316e.C5362a;
import com.bytedance.android.livesdk.chatroom.interact.p318g.C5381b;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.af */
public final class C5394af extends C5301a {

    /* renamed from: d */
    private C1690c f14356d;

    /* renamed from: e */
    private boolean f14357e;

    /* renamed from: f */
    private Room f14358f;

    /* renamed from: c */
    public final void mo11165c() {
        C5362a.m12170a().mo11283b();
    }

    /* renamed from: d */
    public final void mo11166d() {
        if (this.f14356d != null) {
            this.f14356d.dispose();
            this.f14356d = null;
        }
    }

    /* renamed from: e */
    public final boolean mo11167e() {
        if (this.f14356d == null || this.f14356d.isDisposed()) {
            return false;
        }
        return true;
    }

    public C5394af(C5302b bVar) {
        super(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11303a(Long l) throws Exception {
        ((C5302b) this.f14144b).mo11168a(l.intValue());
    }

    /* renamed from: a */
    public final void mo11162a(int i) {
        this.f14356d = ((C4002ac) C4585b.m11020a(1, TimeUnit.SECONDS).mo6527b(4).mo6541d((C1711f<? super T, ? extends R>) new C5395ag<Object,Object>(3)).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) mo11146a())).mo9406a(new C5396ah(this), C5397ai.f14361a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11163a(long r6) {
        /*
            r5 = this;
            com.bytedance.android.livesdk.ad.c<java.lang.String> r0 = com.bytedance.android.livesdk.p272ad.C4525b.f12438l
            java.lang.Object r0 = r0.mo10345a()
            java.lang.String r0 = (java.lang.String) r0
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = com.bytedance.android.livesdk.p279af.C4574am.m10979b(r1)
            boolean r0 = r0.equals(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0028
            com.bytedance.android.livesdk.ad.c<java.lang.Integer> r0 = com.bytedance.android.livesdk.p272ad.C4525b.f12340aI
            java.lang.Object r0 = r0.mo10345a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 > 0) goto L_0x004a
            r0 = 0
            goto L_0x004b
        L_0x0028:
            com.bytedance.android.livesdk.ad.c<java.lang.Integer> r0 = com.bytedance.android.livesdk.p272ad.C4525b.f12437k
            java.lang.Object r0 = r0.mo10345a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.bytedance.android.livesdk.ad.c<java.lang.Integer> r3 = com.bytedance.android.livesdk.p272ad.C4525b.f12340aI
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.mo10346a(r0)
            com.bytedance.android.livesdk.ad.c<java.lang.String> r0 = com.bytedance.android.livesdk.p272ad.C4525b.f12438l
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = com.bytedance.android.livesdk.p279af.C4574am.m10979b(r3)
            r0.mo10346a(r3)
        L_0x004a:
            r0 = 1
        L_0x004b:
            if (r0 == 0) goto L_0x0055
            com.bytedance.android.livesdk.chatroom.interact.e.a r0 = com.bytedance.android.livesdk.chatroom.interact.p316e.C5362a.m12170a()
            r0.mo11280a(r6)
            return
        L_0x0055:
            com.bytedance.android.livesdk.chatroom.interact.c.c$b r6 = r5.f14144b
            com.bytedance.android.livesdk.chatroom.interact.c.e$b r6 = (com.bytedance.android.livesdk.chatroom.interact.p313c.C5300e.C5302b) r6
            r7 = 2132550680(0x7f1c2418, float:2.0754698E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.bytedance.android.livesdk.ad.c<java.lang.Integer> r2 = com.bytedance.android.livesdk.p272ad.C4525b.f12436j
            java.lang.Object r2 = r2.mo10345a()
            r0[r1] = r2
            java.lang.String r7 = com.bytedance.android.live.core.p230g.C3922z.m9905a(r7, r0)
            r6.mo11170a(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.p319h.C5394af.mo11163a(long):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11301a(int i, C4177d dVar) throws Exception {
        this.f14145c.f12622m = ((C5381b) dVar.data).f14330b;
        this.f14145c.f12612c = ((C5381b) dVar.data).f14329a;
        ((C5302b) this.f14144b).mo11169a(this.f14358f, i);
        this.f14357e = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_BATTLE_SUCCEED");
        hashMap.put("vendor", Integer.valueOf(((C5381b) dVar.data).f14330b));
        hashMap.put("channel_id", Long.valueOf(((C5381b) dVar.data).f14329a));
        C8064d.m16005b().mo9197a("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11302a(Room room, Throwable th) throws Exception {
        mo11147a(th);
        ((C5302b) this.f14144b).mo11171a(th);
        this.f14145c.mo10412c();
        this.f14357e = false;
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "INVITE_BATTLE_FAILED");
        hashMap.put("target_room_id", Long.valueOf(room.getId()));
        C8064d.m16005b().mo9197a("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo11164a(Room room, long j, String str, int i, int i2) {
        Room room2 = room;
        if (!this.f14357e) {
            this.f14357e = true;
            this.f14358f = room2;
            this.f14145c.f12619j = 300;
            String str2 = str;
            this.f14145c.f12620k = str2;
            this.f14145c.f12614e = room.getOwner().getId();
            ((C4002ac) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).inviteWithBattleOn(4, 6, room.getId(), room.getOwner().getId(), j, str2, 300, this.f14145c.f12627r, -1, i2).mo6525a((C2203w<T, ? extends R>) mo11148b())).mo9406a(new C5398aj(this, i2), new C5399ak(this, room2));
        }
    }
}
