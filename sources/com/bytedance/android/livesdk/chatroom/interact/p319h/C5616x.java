package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.event.C5200s;
import com.bytedance.android.livesdk.chatroom.interact.C5646k;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5303f.C5304a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5303f.C5305b;
import com.bytedance.android.livesdk.chatroom.model.p323a.C5698g;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1711f;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.x */
public final class C5616x extends C5304a {

    /* renamed from: d */
    private C1690c f14710d;

    /* renamed from: e */
    private DataCenter f14711e;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo11504c(Throwable th) {
        mo11147a(th);
    }

    /* renamed from: c */
    public final void mo11175c() {
        if (this.f14710d != null) {
            this.f14710d.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11501a(C4177d dVar) throws Exception {
        this.f14145c.mo10412c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11502a(Long l) throws Exception {
        ((C5305b) this.f14144b).mo11176a(l.intValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11503b(Throwable th) throws Exception {
        mo11147a(th);
        this.f14145c.mo10412c();
    }

    /* renamed from: a */
    public final void mo11172a(int i) {
        this.f14710d = ((C4002ac) C4585b.m11017a(0, 1, TimeUnit.SECONDS).mo6527b((long) (i + 1)).mo6541d((C1711f<? super T, ? extends R>) new C5617y<Object,Object>(i)).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) mo11146a())).mo9406a(new C5618z(this), new C5389aa(this));
    }

    public C5616x(C5305b bVar, DataCenter dataCenter) {
        super(bVar);
        this.f14711e = dataCenter;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11500a(int i, long j, C4177d dVar) throws Exception {
        C5698g gVar = (C5698g) dVar.data;
        if (i != 1) {
            this.f14145c.mo10412c();
        } else {
            this.f14145c.f12623n = gVar.f14969a;
            this.f14145c.f12624o = gVar.f14970b;
            this.f14145c.f12625p = gVar.f14972d;
            if (this.f14711e != null) {
                if (this.f14145c.f12627r == 2) {
                    this.f14711e.lambda$put$1$DataCenter("cmd_inroompk_state_change", new C5646k(1));
                } else {
                    this.f14711e.lambda$put$1$DataCenter("cmd_pk_state_change", new C5200s(4));
                }
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "REPLY_SUCCEED");
        hashMap.put(C42311c.f106865i, gVar);
        hashMap.put("accesskey", gVar.f14969a);
        hashMap.put("link_mic_id", Integer.valueOf(gVar.f14970b));
        hashMap.put("confluence_type", Integer.valueOf(((C5698g) dVar.data).f14972d));
        hashMap.put("channel_id", Long.valueOf(j));
        C8064d.m16005b().mo9197a("ttlive_pk", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo11173a(int i, long j, long j2, long j3) {
        long j4;
        LinkApi linkApi = (LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class);
        if (this.f14145c.f12614e != 0) {
            j4 = this.f14145c.f12614e;
        } else {
            j4 = j3;
        }
        int i2 = i;
        long j5 = j;
        ((C4002ac) linkApi.reply(j, j2, i, j4).mo6525a((C2203w<T, ? extends R>) mo11148b())).mo9406a(new C5390ab(this, i, j), new C5391ac(this));
    }

    /* renamed from: a */
    public final void mo11174a(long j, long j2, long j3, long j4) {
        ((C4002ac) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).cancel(j, j2, j4, j3).mo6525a((C2203w<T, ? extends R>) mo11148b())).mo9406a(new C5392ad(this), new C5393ae(this));
    }
}
