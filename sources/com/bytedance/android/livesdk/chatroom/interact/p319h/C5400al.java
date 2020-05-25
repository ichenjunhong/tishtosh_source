package com.bytedance.android.livesdk.chatroom.interact.p319h;

import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5306g.C5307a;
import com.bytedance.android.livesdk.chatroom.interact.p313c.C5306g.C5308b;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.common.utility.C9431p;
import p064c.p065a.C2203w;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.h.al */
public final class C5400al extends C5307a {

    /* renamed from: d */
    private int f14366d = ((Integer) C4525b.f12346aO.mo10345a()).intValue();

    /* renamed from: e */
    private int f14367e = ((Integer) C4525b.f12347aP.mo10345a()).intValue();

    /* renamed from: f */
    private String f14368f;

    /* renamed from: c */
    public final int mo11181c() {
        return this.f14366d;
    }

    /* renamed from: d */
    public final int mo11182d() {
        return this.f14367e;
    }

    /* renamed from: e */
    public final String mo11183e() {
        return this.f14368f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11304a(C4177d dVar) throws Exception {
        ((C5308b) this.f14144b).mo11189h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11305b(C4177d dVar) throws Exception {
        ((C5308b) this.f14144b).mo11184a();
    }

    /* renamed from: a */
    public final void mo11178a(String str) {
        if (!C9431p.m18664a(str)) {
            this.f14368f = str;
        }
    }

    public C5400al(C5308b bVar) {
        super(bVar);
    }

    /* renamed from: b */
    public final void mo11180b(boolean z) {
        int i;
        LinkApi linkApi = (LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class);
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        C4002ac acVar = (C4002ac) linkApi.settings(i).mo6525a((C2203w<T, ? extends R>) mo11148b());
        C5403ao aoVar = new C5403ao(this);
        C5308b bVar = (C5308b) this.f14144b;
        bVar.getClass();
        acVar.mo9406a(aoVar, new C5404ap(bVar));
    }

    /* renamed from: a */
    public final void mo11179a(boolean z) {
        C4002ac acVar = (C4002ac) ((LinkApi) C4514j.m10883j().mo10321b().mo9550a(LinkApi.class)).settings(z ? 1 : 0).mo6525a((C2203w<T, ? extends R>) mo11148b());
        C5401am amVar = new C5401am(this);
        C5308b bVar = (C5308b) this.f14144b;
        bVar.getClass();
        acVar.mo9406a(amVar, new C5402an(bVar));
    }

    /* renamed from: a */
    public final void mo11177a(int i, int i2) {
        this.f14366d = i;
        this.f14367e = i2;
        C4525b.f12346aO.mo10346a(Integer.valueOf(this.f14366d));
        C4525b.f12347aP.mo10346a(Integer.valueOf(i2));
        ((C5308b) this.f14144b).mo11185a(this.f14366d);
    }
}
