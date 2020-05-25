package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.livesdk.p406q.C8120a;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.user.u */
final /* synthetic */ class C8361u implements C1710e {

    /* renamed from: a */
    private final C8348m f22746a;

    /* renamed from: b */
    private final int f22747b;

    /* renamed from: c */
    private final long f22748c;

    /* renamed from: d */
    private final long f22749d;

    C8361u(C8348m mVar, int i, long j, long j2) {
        this.f22746a = mVar;
        this.f22747b = i;
        this.f22748c = j;
        this.f22749d = j2;
    }

    public final void accept(Object obj) {
        C8348m mVar = this.f22746a;
        int i = this.f22747b;
        long j = this.f22748c;
        long j2 = this.f22749d;
        C8686a aVar = (C8686a) obj;
        mVar.f22712b.onFollowStatusChanged(aVar.f23736e, aVar.f23732a);
        mVar.f22715e.onNext(aVar);
        if (mVar.f22711a != null) {
            long id = mVar.f22711a.getId();
            String str = i == 1 ? "ttlive_follow" : "ttlive_unfollow";
            HashMap hashMap = new HashMap();
            hashMap.put("proponent_id", Long.valueOf(id));
            hashMap.put("adopter_id", Long.valueOf(j));
            hashMap.put("room_id", Long.valueOf(j2));
            C3837e.m9743a(C8120a.m16193a(str), 0, (Map<String, Object>) hashMap);
        }
    }
}
