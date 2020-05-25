package com.bytedance.android.livesdk.rank.p412e;

import android.os.Message;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.live.network.response.C4177d;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.p306bl.C5024p;
import com.bytedance.android.livesdk.chatroom.p306bl.C5026r;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4605o;
import com.bytedance.android.livesdk.p284b.C4645c;
import com.bytedance.android.livesdk.rank.model.C8218e;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.rank.p409b.C8137c.C8138a;
import com.bytedance.android.livesdk.rank.p409b.C8137c.C8139b;
import com.bytedance.android.livesdk.rank.p413f.C8191o;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import java.util.ArrayList;
import java.util.Collection;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.rank.e.f */
public final class C8152f implements C8139b, C9382a {

    /* renamed from: a */
    C4177d<C8218e> f22261a;

    /* renamed from: b */
    private C9381g f22262b = new C9381g(this);

    /* renamed from: c */
    private C8138a f22263c;

    /* renamed from: d */
    private long f22264d;

    /* renamed from: e */
    private long f22265e;

    /* renamed from: f */
    private boolean f22266f;

    /* renamed from: g */
    private C4645c f22267g;

    /* renamed from: a */
    public final void mo14341a() {
        C9381g gVar = this.f22262b;
        ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).getNobleUserRank(new C4605o().mo10399a("room_id", String.valueOf(this.f22264d)).mo10399a("rank_type", "21").mo10399a("anchor_id", String.valueOf(this.f22265e)).f12568a).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5024p<Object>(gVar), (C1710e<? super Throwable>) new C5026r<Object>(gVar));
    }

    public final void handleMsg(Message message) {
        C8219f fVar;
        if (message.what == 36) {
            if (message.obj instanceof Exception) {
                this.f22263c.mo14334a();
            } else if (message.obj instanceof C4175b) {
                this.f22261a = (C4177d) message.obj;
                if (this.f22261a == null) {
                    this.f22263c.mo14334a();
                    return;
                }
                if (this.f22261a.data != null && !C9414h.m18630a(((C8218e) this.f22261a.data).f22440a)) {
                    C2201v.m6613b((Iterable<? extends T>) ((C8218e) this.f22261a.data).f22440a).mo6522a(C8153g.f22268a).mo6552k().mo6152a((C1710e<? super T>) new C8154h<Object>(this), C8155i.f22270a);
                }
                if (this.f22261a.data == null || C9376b.m18558a((Collection<T>) ((C8218e) this.f22261a.data).f22440a)) {
                    this.f22263c.mo14337b();
                    if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                        this.f22263c.mo14338c();
                    } else {
                        if (this.f22261a.data != null) {
                            fVar = ((C8218e) this.f22261a.data).f22441b;
                        } else {
                            fVar = null;
                        }
                        this.f22263c.mo14336a(true, fVar);
                    }
                } else {
                    C8218e eVar = (C8218e) this.f22261a.data;
                    ArrayList arrayList = new ArrayList(eVar.f22440a.size());
                    if (this.f22263c.getContext() != null) {
                        arrayList.addAll(eVar.f22440a);
                        this.f22267g = new C4645c();
                        this.f22267g.mo110580a(C8219f.class, new C8191o());
                        this.f22267g.mo10432a(arrayList);
                        this.f22263c.mo14335a(this.f22267g);
                        this.f22263c.mo14336a(true ^ this.f22266f, eVar.f22441b);
                    }
                }
            }
        }
    }

    public C8152f(C8138a aVar, long j, long j2, boolean z) {
        this.f22263c = aVar;
        this.f22264d = j;
        this.f22265e = j2;
        this.f22266f = z;
    }
}
