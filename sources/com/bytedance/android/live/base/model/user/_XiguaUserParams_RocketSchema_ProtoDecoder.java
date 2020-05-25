package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.user.C3015n.C3016a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _XiguaUserParams_RocketSchema_ProtoDecoder implements C2888b<C3016a> {
    public final C3016a decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C3016a decodeStatic(C2895g gVar) throws Exception {
        C3016a aVar = new C3016a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f8888a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        aVar.f8889b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        aVar.f8890c = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return aVar;
            }
        }
    }
}
