package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.user.C3015n.C3017b;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _XiguaUserParams_UserExtendInfo_ProtoDecoder implements C2888b<C3017b> {
    public final C3017b decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C3017b decodeStatic(C2895g gVar) throws Exception {
        C3017b bVar = new C3017b();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f8891a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        bVar.f8892b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        bVar.f8893c = _XiguaUserParams_RocketSchema_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return bVar;
            }
        }
    }
}
