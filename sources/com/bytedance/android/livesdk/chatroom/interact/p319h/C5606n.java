package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.event.C5200s;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5297d.C5298a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5297d.C5299b;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5698g;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.p402c.C8056g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.n */
public final class C5606n extends C5298a {

    /* renamed from: d */
    private C1690c f14697d;

    /* renamed from: e */
    private DataCenter f14698e;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo11499c(Throwable th) {
        mo11147a(th);
    }

    /* renamed from: c */
    public final void mo11158c() {
        if (this.f14697d != null) {
            this.f14697d.dispose();
        }
    }

    /* renamed from: d */
    public final void mo11159d() {
        ((C4002ac) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).settings(2).mo6525a((C2203w<T, ? extends R>) mo11148b())).mo9406a(new C5614v(this), new C5615w(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11497b(C4177d dVar) throws Exception {
        this.f14145c.mo10412c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11496a(Long l) throws Exception {
        ((C5299b) this.f14144b).mo11160a(l.intValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11498b(Throwable th) throws Exception {
        mo11147a(th);
        this.f14145c.mo10412c();
    }

    /* renamed from: a */
    public final void mo11155a(int i) {
        this.f14697d = ((C4002ac) C4585b.m11017a(0, 1, TimeUnit.SECONDS).mo6527b((long) (i + 1)).mo6541d((C1711f<? super T, ? extends R>) new C5607o<Object,Object>(i)).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) mo11146a())).mo9406a(new C5608p(this), new C5609q(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11495a(C4177d dVar) throws Exception {
        if (dVar.statusCode == 0) {
            ((C5299b) this.f14144b).mo11161a(false);
            C4525b.f12444r.mo10346a(Integer.valueOf(2));
            C4204a.m10421a(((C5299b) this.f14144b).getContext(), (int) R.string.el4);
        }
    }

    public C5606n(C5299b bVar, DataCenter dataCenter) {
        super(bVar);
        this.f14698e = dataCenter;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11494a(int i, long j, C4177d dVar) throws Exception {
        C5698g gVar = (C5698g) dVar.data;
        if (i != 1) {
            this.f14145c.mo10412c();
        } else {
            this.f14145c.f12623n = gVar.f14969a;
            this.f14145c.f12624o = gVar.f14970b;
            this.f14145c.f12625p = gVar.f14972d;
            if (this.f14698e != null) {
                this.f14698e.lambda$put$1$DataCenter("cmd_pk_state_change", new C5200s(4));
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "REPLY_SUCCEED");
        hashMap.put(C42311c.f106865i, gVar);
        hashMap.put("accesskey", gVar.f14969a);
        hashMap.put("link_mic_id", Integer.valueOf(gVar.f14970b));
        hashMap.put("confluence_type", Integer.valueOf(gVar.f14972d));
        hashMap.put("channel_id", Long.valueOf(j));
        C8064d.m16005b().mo9197a("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0091  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11156a(int r12, long r13, long r15, com.bytedance.android.live.base.model.user.User r17) {
        /*
            r11 = this;
            r0 = r11
            r9 = r12
            r1 = 2
            r2 = 1
            if (r9 != r1) goto L_0x006f
            com.bytedance.android.livesdk.ad.c<java.lang.Integer> r3 = com.bytedance.android.livesdk.p272ad.C4525b.f12444r
            java.lang.Object r3 = r3.mo10345a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 == r1) goto L_0x006f
            boolean r1 = r17.isFollowing()
            if (r1 != 0) goto L_0x006f
            long r3 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = com.bytedance.android.livesdk.p279af.C4574am.m10979b(r3)
            com.bytedance.android.livesdk.ad.c<java.lang.String> r3 = com.bytedance.android.livesdk.p272ad.C4525b.f12343aL
            java.lang.Object r3 = r3.mo10345a()
            java.lang.String r3 = (java.lang.String) r3
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x003f
            com.bytedance.android.livesdk.ad.c<java.lang.Integer> r3 = com.bytedance.android.livesdk.p272ad.C4525b.f12342aK
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.mo10346a(r2)
            com.bytedance.android.livesdk.ad.c<java.lang.String> r2 = com.bytedance.android.livesdk.p272ad.C4525b.f12343aL
            r2.mo10346a(r1)
            goto L_0x006f
        L_0x003f:
            com.bytedance.android.livesdk.ad.c<java.lang.Integer> r1 = com.bytedance.android.livesdk.p272ad.C4525b.f12342aK
            java.lang.Object r3 = r1.mo10345a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = r3 + r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.mo10346a(r3)
            com.bytedance.android.livesdk.ad.c<java.lang.Integer> r1 = com.bytedance.android.livesdk.p272ad.C4525b.f12342aK
            java.lang.Object r1 = r1.mo10345a()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3 = 3
            if (r1 <= r3) goto L_0x006f
            com.bytedance.android.livesdk.ad.c<java.lang.Integer> r1 = com.bytedance.android.livesdk.p272ad.C4525b.f12342aK
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.mo10346a(r3)
            r10 = 1
            goto L_0x0071
        L_0x006f:
            r2 = 0
            r10 = 0
        L_0x0071:
            com.bytedance.android.livesdk.ab.f r1 = com.bytedance.android.livesdk.p270ab.C4514j.m10883j()
            com.bytedance.android.live.network.e r1 = r1.mo10321b()
            java.lang.Class<com.bytedance.android.livesdk.chatroom.api.LinkApi> r2 = com.bytedance.android.livesdk.chatroom.api.LinkApi.class
            java.lang.Object r1 = r1.mo9550a(r2)
            com.bytedance.android.livesdk.chatroom.api.LinkApi r1 = (com.bytedance.android.livesdk.chatroom.api.LinkApi) r1
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r2 = r0.f14145c
            long r2 = r2.f12614e
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0091
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r2 = r0.f14145c
            long r2 = r2.f12614e
        L_0x008f:
            r7 = r2
            goto L_0x0096
        L_0x0091:
            long r2 = r17.getId()
            goto L_0x008f
        L_0x0096:
            r2 = r13
            r4 = r15
            r6 = r12
            c.a.v r1 = r1.reply(r2, r4, r6, r7)
            com.bytedance.android.live.core.rxutils.autodispose.m r2 = r11.mo11148b()
            java.lang.Object r1 = r1.mo6525a(r2)
            com.bytedance.android.live.core.rxutils.autodispose.ac r1 = (com.bytedance.android.live.core.rxutils.autodispose.C4002ac) r1
            com.bytedance.android.livesdk.chatroom.interact.h.r r2 = new com.bytedance.android.livesdk.chatroom.interact.h.r
            r3 = r13
            r2.<init>(r11, r12, r13)
            com.bytedance.android.livesdk.chatroom.interact.h.s r3 = new com.bytedance.android.livesdk.chatroom.interact.h.s
            r3.<init>(r11)
            r1.mo9406a(r2, r3)
            com.bytedance.android.livesdk.chatroom.interact.c.c$b r1 = r0.f14144b
            com.bytedance.android.livesdk.chatroom.interact.c.d$b r1 = (com.bytedance.android.livesdk.chatroom.interact.p313c.C5297d.C5299b) r1
            r1.mo11161a(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.p319h.C5606n.mo11156a(int, long, long, com.bytedance.android.live.base.model.user.User):void");
    }

    /* renamed from: a */
    public final void mo11157a(long j, long j2, long j3, long j4) {
        C8056g gVar = new C8056g();
        if (this.f14145c.f12619j > 0) {
            gVar.mo14211c(j3).mo14206a(LinkCrossRoomDataHolder.m11103a().f12616g);
        } else {
            long j5 = j3;
        }
        C8049c.m15979a().mo14203a("match_cancel_click", gVar, LinkCrossRoomDataHolder.m11103a().mo10411b(), Room.class);
        ((C4002ac) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).cancel(j, j2, j4, j3).mo6525a((C2203w<T, ? extends R>) mo11148b())).mo9406a(new C5612t(this), new C5613u(this));
    }
}
