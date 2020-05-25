package com.bytedance.android.livesdk.rank.p412e;

import android.os.Message;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.p306bl.C5022n;
import com.bytedance.android.livesdk.chatroom.p306bl.C5023o;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p279af.C4605o;
import com.bytedance.android.livesdk.p284b.C4645c;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.bytedance.android.livesdk.rank.model.PeriodRankExtra;
import com.bytedance.android.livesdk.rank.p409b.C8137c.C8138a;
import com.bytedance.android.livesdk.rank.p409b.C8137c.C8139b;
import com.bytedance.android.livesdk.rank.p413f.C8196r;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import p064c.p065a.C1673aa;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;

/* renamed from: com.bytedance.android.livesdk.rank.e.n */
public final class C8160n implements C8139b, C9382a {

    /* renamed from: a */
    C4175b<CurrentRankListResponse, PeriodRankExtra> f22283a;

    /* renamed from: b */
    private C9381g f22284b = new C9381g(this);

    /* renamed from: c */
    private C8138a f22285c;

    /* renamed from: d */
    private long f22286d;

    /* renamed from: e */
    private long f22287e;

    /* renamed from: f */
    private boolean f22288f;

    /* renamed from: g */
    private int f22289g;

    /* renamed from: h */
    private DataCenter f22290h;

    /* renamed from: i */
    private C4645c f22291i;

    /* renamed from: a */
    public final void mo14341a() {
        C9381g gVar = this.f22284b;
        long j = this.f22287e;
        int i = this.f22289g;
        ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).getPeriodUserRank(new C4605o().mo10399a("anchor_id", String.valueOf(j)).mo10399a("sec_anchor_id", TTLiveSDKContext.getHostService().mo10315h().mo14522a(j)).mo10399a("rank_type", String.valueOf(i)).mo10399a("room_id", String.valueOf(this.f22286d)).mo10399a("sec_user_id", TTLiveSDKContext.getHostService().mo10315h().mo14521a().getSecUid()).f12568a).mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5022n<Object>(gVar, i), (C1710e<? super Throwable>) new C5023o<Object>(gVar, i));
    }

    public final void handleMsg(Message message) {
        if (message.what == 31) {
            if (message.obj instanceof Exception) {
                this.f22285c.mo14334a();
                C3831a.m9706a(6, "PeriodRankPresent", ((Exception) message.obj).getStackTrace());
            }
            if (message.obj instanceof C4175b) {
                this.f22283a = (C4175b) message.obj;
                if (this.f22283a == null) {
                    this.f22285c.mo14334a();
                    return;
                }
                if (this.f22283a.data != null && !C9414h.m18630a(((CurrentRankListResponse) this.f22283a.data).ranks)) {
                    C2201v.m6613b((Iterable<? extends T>) ((CurrentRankListResponse) this.f22283a.data).ranks).mo6522a((C1715j<? super T>) new C8161o<Object>(this)).mo6552k().mo6152a((C1710e<? super T>) new C8162p<Object>(this), C8163q.f22294a);
                }
                C8219f fVar = null;
                if (this.f22283a.data == null || C9414h.m18630a(((CurrentRankListResponse) this.f22283a.data).ranks)) {
                    this.f22285c.mo14337b();
                    if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                        this.f22285c.mo14338c();
                    } else {
                        this.f22285c.mo14336a(false, null);
                    }
                } else {
                    this.f22291i = new C4645c();
                    C8196r rVar = new C8196r(TTLiveSDKContext.getHostService().mo10315h(), this.f22288f, 10, this.f22285c.getFragment(), this.f22289g);
                    this.f22291i.mo110580a(C8219f.class, rVar);
                    this.f22291i.mo10432a(((CurrentRankListResponse) this.f22283a.data).ranks);
                    this.f22285c.mo14335a(this.f22291i);
                    if (this.f22283a.data != null) {
                        fVar = ((CurrentRankListResponse) this.f22283a.data).selfInfo;
                    }
                    this.f22285c.mo14336a(!this.f22288f, fVar);
                }
            }
        }
    }

    public C8160n(C8138a aVar, DataCenter dataCenter, long j, long j2, boolean z, int i) {
        this.f22285c = aVar;
        this.f22286d = j;
        this.f22287e = j2;
        this.f22288f = z;
        this.f22290h = dataCenter;
        this.f22289g = i;
    }
}
