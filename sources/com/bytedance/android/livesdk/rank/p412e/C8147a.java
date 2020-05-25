package com.bytedance.android.livesdk.rank.p412e;

import android.os.Message;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.live.core.p230g.C3914u;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.UserRankExtra;
import com.bytedance.android.livesdk.chatroom.p306bl.C5014i;
import com.bytedance.android.livesdk.p284b.C4645c;
import com.bytedance.android.livesdk.rank.model.C8217d;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.rank.model.C8220g;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.bytedance.android.livesdk.rank.p409b.C8137c.C8138a;
import com.bytedance.android.livesdk.rank.p409b.C8137c.C8139b;
import com.bytedance.android.livesdk.rank.p413f.C8194q;
import com.bytedance.android.livesdk.rank.p413f.C8196r;
import com.bytedance.android.livesdk.rank.p413f.C8202v;
import com.bytedance.android.livesdk.rank.p413f.C8204w;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1715j;

/* renamed from: com.bytedance.android.livesdk.rank.e.a */
public final class C8147a implements C8139b, C9382a {

    /* renamed from: a */
    C4175b<CurrentRankListResponse, UserRankExtra> f22245a;

    /* renamed from: b */
    private C9381g f22246b = new C9381g(this);

    /* renamed from: c */
    private C8138a f22247c;

    /* renamed from: d */
    private long f22248d;

    /* renamed from: e */
    private long f22249e;

    /* renamed from: f */
    private boolean f22250f;

    /* renamed from: g */
    private DataCenter f22251g;

    /* renamed from: h */
    private C4645c f22252h;

    /* renamed from: a */
    public final void mo14341a() {
        C5014i.m11509a(this.f22246b, this.f22248d, this.f22249e, 17);
    }

    public final void handleMsg(Message message) {
        boolean z;
        String str;
        if (message.what == 24) {
            if (message.obj instanceof Exception) {
                this.f22247c.mo14334a();
            } else if (message.obj instanceof C4175b) {
                this.f22245a = (C4175b) message.obj;
                if (this.f22245a == null) {
                    this.f22247c.mo14334a();
                    return;
                }
                if (this.f22245a.data != null && !C9414h.m18630a(((CurrentRankListResponse) this.f22245a.data).ranks)) {
                    C2201v.m6613b((Iterable<? extends T>) ((CurrentRankListResponse) this.f22245a.data).ranks).mo6522a((C1715j<? super T>) new C8148b<Object>(this)).mo6552k().mo6152a((C1710e<? super T>) new C8149c<Object>(this), C8150d.f22255a);
                }
                if (this.f22245a.data == null || (C9376b.m18558a((Collection<T>) ((CurrentRankListResponse) this.f22245a.data).ranks) && C9376b.m18558a((Collection<T>) ((CurrentRankListResponse) this.f22245a.data).seats))) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f22247c.mo14337b();
                    if (!TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
                        this.f22247c.mo14338c();
                    } else {
                        this.f22247c.mo14336a(false, null);
                    }
                } else {
                    CurrentRankListResponse currentRankListResponse = (CurrentRankListResponse) this.f22245a.data;
                    ArrayList arrayList = new ArrayList(currentRankListResponse.ranks.size() + 1);
                    if (this.f22247c.getContext() != null) {
                        if (!C3914u.m9892a(currentRankListResponse.seats)) {
                            arrayList.add(new C8220g(C3922z.m9903a((int) R.string.f2n), this.f22247c.getContext().getResources().getColor(R.color.alt)));
                            for (int i = 0; i < currentRankListResponse.seats.size(); i++) {
                                C8219f fVar = (C8219f) currentRankListResponse.seats.get(i);
                                if (fVar.f22444c <= 3) {
                                    fVar.f22444c -= 3;
                                }
                            }
                            arrayList.addAll(currentRankListResponse.seats);
                            C9376b.m18558a((Collection<T>) currentRankListResponse.ranks);
                        }
                        if (C8607a.f23572a) {
                            str = C3890e.m9836d(currentRankListResponse.total);
                        } else {
                            str = C3890e.m9834b(currentRankListResponse.total);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(currentRankListResponse.musicWave);
                        sb.append(" ");
                        sb.append(str);
                        arrayList.add(sb.toString());
                        arrayList.addAll(currentRankListResponse.ranks);
                        this.f22252h = new C4645c();
                        this.f22252h.mo110580a(C8217d.class, new C8194q());
                        this.f22252h.mo110580a(C8220g.class, new C8204w());
                        this.f22252h.mo110580a(String.class, new C8202v());
                        C8196r rVar = new C8196r(TTLiveSDKContext.getHostService().mo10315h(), this.f22250f, 3, this.f22247c.getFragment(), 17);
                        this.f22252h.mo110580a(C8219f.class, rVar);
                        this.f22252h.mo10432a(arrayList);
                        this.f22247c.mo14335a(this.f22252h);
                        this.f22247c.mo14336a(true ^ this.f22250f, currentRankListResponse.selfInfo);
                    }
                }
            }
        }
    }

    public C8147a(C8138a aVar, DataCenter dataCenter, long j, long j2, boolean z) {
        this.f22247c = aVar;
        this.f22248d = j;
        this.f22249e = j2;
        this.f22250f = z;
        this.f22251g = dataCenter;
    }
}
