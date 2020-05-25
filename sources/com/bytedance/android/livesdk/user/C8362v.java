package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.core.p225d.C3836d;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.p180b.p181a.C2944a;
import com.bytedance.android.livesdk.p406q.C8120a;
import java.util.HashMap;
import java.util.Map;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.livesdk.user.v */
final /* synthetic */ class C8362v implements C1710e {

    /* renamed from: a */
    private final C8348m f22750a;

    /* renamed from: b */
    private final int f22751b;

    /* renamed from: c */
    private final long f22752c;

    /* renamed from: d */
    private final long f22753d;

    C8362v(C8348m mVar, int i, long j, long j2) {
        this.f22750a = mVar;
        this.f22751b = i;
        this.f22752c = j;
        this.f22753d = j2;
    }

    public final void accept(Object obj) {
        C8348m mVar = this.f22750a;
        int i = this.f22751b;
        long j = this.f22752c;
        long j2 = this.f22753d;
        Throwable th = (Throwable) obj;
        if (mVar.f22711a != null) {
            long id = mVar.f22711a.getId();
            String str = i == 1 ? "ttlive_follow" : "ttlive_unfollow";
            HashMap hashMap = new HashMap();
            hashMap.put("proponent_id", Long.valueOf(id));
            hashMap.put("adopter_id", Long.valueOf(j));
            hashMap.put("room_id", Long.valueOf(j2));
            String str2 = "";
            if (th != null) {
                str2 = th.getMessage();
                if (th instanceof C2944a) {
                    hashMap.put("error_code", Integer.valueOf(((C2944a) th).getErrorCode()));
                }
            }
            hashMap.put("error_msg", str2);
            C3837e.m9743a(C8120a.m16193a(str), 1, (Map<String, Object>) hashMap);
            C3837e.m9743a(C3836d.m9735b(str), 1, (Map<String, Object>) hashMap);
        }
    }
}
