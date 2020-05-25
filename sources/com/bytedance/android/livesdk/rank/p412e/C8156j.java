package com.bytedance.android.livesdk.rank.p412e;

import android.os.Message;
import com.bytedance.android.live.core.p230g.C3890e;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.network.response.C4175b;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.model.UserRankExtra;
import com.bytedance.android.livesdk.chatroom.p306bl.C5014i;
import com.bytedance.android.livesdk.p284b.C4645c;
import com.bytedance.android.livesdk.rank.model.C8217d;
import com.bytedance.android.livesdk.rank.model.C8219f;
import com.bytedance.android.livesdk.rank.model.CurrentRankListResponse;
import com.bytedance.android.livesdk.rank.p409b.C8137c.C8138a;
import com.bytedance.android.livesdk.rank.p409b.C8137c.C8139b;
import com.bytedance.android.livesdk.rank.p413f.C8194q;
import com.bytedance.android.livesdk.rank.p413f.C8196r;
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

/* renamed from: com.bytedance.android.livesdk.rank.e.j */
public final class C8156j implements C8139b, C9382a {

    /* renamed from: b */
    private static int f22271b = 100;

    /* renamed from: a */
    C4175b<CurrentRankListResponse, UserRankExtra> f22272a;

    /* renamed from: c */
    private C9381g f22273c = new C9381g(this);

    /* renamed from: d */
    private C8138a f22274d;

    /* renamed from: e */
    private long f22275e;

    /* renamed from: f */
    private long f22276f;

    /* renamed from: g */
    private boolean f22277g;

    /* renamed from: h */
    private DataCenter f22278h;

    /* renamed from: i */
    private C4645c f22279i;

    /* renamed from: a */
    public final void mo14341a() {
        C5014i.m11509a(this.f22273c, this.f22275e, this.f22276f, 22);
    }

    public final void handleMsg(Message message) {
        boolean z;
        int i;
        if (message.what == 24) {
            if (message.obj instanceof Exception) {
                this.f22274d.mo14334a();
            } else if (message.obj instanceof C4175b) {
                this.f22272a = (C4175b) message.obj;
                this.f22274d.mo14336a(false, null);
                if (this.f22272a == null) {
                    this.f22274d.mo14334a();
                    return;
                }
                if (this.f22272a.data != null && !C9414h.m18630a(((CurrentRankListResponse) this.f22272a.data).ranks)) {
                    C2201v.m6613b((Iterable<? extends T>) ((CurrentRankListResponse) this.f22272a.data).ranks).mo6522a(C8157k.f22280a).mo6552k().mo6152a((C1710e<? super T>) new C8158l<Object>(this), C8159m.f22282a);
                }
                if (this.f22272a.data == null || C9376b.m18558a((Collection<T>) ((CurrentRankListResponse) this.f22272a.data).ranks)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f22274d.mo14337b();
                    return;
                }
                CurrentRankListResponse currentRankListResponse = (CurrentRankListResponse) this.f22272a.data;
                int size = currentRankListResponse.ranks.size();
                ArrayList arrayList = new ArrayList(size + 1);
                if (this.f22274d.getContext() != null) {
                    arrayList.addAll(currentRankListResponse.ranks);
                    if (size >= f22271b) {
                        arrayList.add(new C8217d(C3922z.m9903a((int) R.string.exj)));
                    } else {
                        if (this.f22278h != null) {
                            i = ((Integer) this.f22278h.get("data_member_count", Integer.valueOf(-1))).intValue();
                        } else {
                            i = -1;
                        }
                        if (i != -1) {
                            int i2 = i - size;
                            if (i2 > 0) {
                                arrayList.add(new C8217d(C3922z.m9905a((int) R.string.hru, C3890e.m9835c((long) i2))));
                            }
                        }
                    }
                    this.f22279i = new C4645c();
                    this.f22279i.mo110580a(C8217d.class, new C8194q());
                    C8196r rVar = new C8196r(TTLiveSDKContext.getHostService().mo10315h(), this.f22277g, 0, this.f22274d.getFragment(), 22);
                    this.f22279i.mo110580a(C8219f.class, rVar);
                    this.f22279i.mo10432a(arrayList);
                    this.f22274d.mo14335a(this.f22279i);
                }
            }
        }
    }

    public C8156j(C8138a aVar, DataCenter dataCenter, long j, long j2, boolean z) {
        this.f22274d = aVar;
        this.f22275e = j;
        this.f22276f = j2;
        this.f22277g = z;
        this.f22278h = dataCenter;
    }
}
