package com.bytedance.android.live.base.model.feed;

import com.bytedance.android.live.base.model.feed.C2974a.C2975a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _FeedExtra_LogPb_ProtoDecoder implements C2888b<C2975a> {
    public final C2975a decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2975a decodeStatic(C2895g gVar) throws Exception {
        C2975a aVar = new C2975a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return aVar;
            } else if (b != 1) {
                C2896h.m8236g(gVar);
            } else {
                aVar.f8722a = C2896h.m8234e(gVar);
            }
        }
    }
}
