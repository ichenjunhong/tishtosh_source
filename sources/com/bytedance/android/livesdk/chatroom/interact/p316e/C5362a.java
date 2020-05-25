package com.bytedance.android.livesdk.chatroom.interact.p316e;

import com.bytedance.android.livesdk.chatroom.api.LinkPKApi;
import com.bytedance.android.livesdk.chatroom.interact.p316e.C5369h.C5370a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.p281b.C4585b;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.e.a */
public final class C5362a implements C5369h {

    /* renamed from: e */
    private static C5362a f14296e;

    /* renamed from: a */
    public final List<C5370a> f14297a = new LinkedList();

    /* renamed from: b */
    final int f14298b = ((((Integer) LiveConfigSettingKeys.PK_AUTO_MATCH_TIME.mo9431a()).intValue() / 3) + 1);

    /* renamed from: c */
    C1690c f14299c;

    /* renamed from: d */
    boolean f14300d;

    /* renamed from: c */
    public final boolean mo11284c() {
        return this.f14300d;
    }

    private C5362a() {
    }

    /* renamed from: a */
    public static synchronized C5362a m12170a() {
        C5362a aVar;
        synchronized (C5362a.class) {
            if (f14296e == null) {
                f14296e = new C5362a();
            }
            aVar = f14296e;
        }
        return aVar;
    }

    /* renamed from: b */
    public final void mo11283b() {
        if (this.f14300d) {
            this.f14300d = false;
            if (this.f14299c != null) {
                this.f14299c.dispose();
                this.f14299c = null;
            }
            ((LinkPKApi) C4514j.m10883j().mo10321b().mo9550a(LinkPKApi.class)).cancleMatch().mo6529b(C2168a.m6521b()).mo6505a(C5365d.f14304a, C5366e.f14305a);
            for (C5370a c : this.f14297a) {
                c.mo11246c();
            }
        }
    }

    /* renamed from: a */
    public final void mo11281a(C5370a aVar) {
        if (aVar != null && this.f14297a.contains(aVar)) {
            this.f14297a.remove(aVar);
        }
    }

    /* renamed from: a */
    public final void mo11280a(long j) {
        this.f14300d = true;
        for (C5370a a : this.f14297a) {
            a.mo11241a();
        }
        if (this.f14299c != null) {
            this.f14299c.dispose();
            this.f14299c = null;
        }
        this.f14299c = C4585b.m11017a(0, 3, TimeUnit.SECONDS).mo6527b((long) (this.f14298b + 1)).mo6541d((C1711f<? super T, ? extends R>) new C5363b<Object,Object>(this)).mo6514a(C1667a.m5940a()).mo6545f((C1710e<? super T>) new C5364c<Object>(this, j));
    }

    /* renamed from: a */
    public final void mo11282a(C5370a aVar, int i) {
        if (aVar != null) {
            if (this.f14297a.size() < i) {
                i = this.f14297a.size();
            }
            this.f14297a.add(i, aVar);
        }
    }
}
