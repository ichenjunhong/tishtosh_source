package com.bytedance.android.live.base.model.user;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _XiguaUserParams_ProtoDecoder implements C2888b<C3015n> {
    public final C3015n decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C3015n decodeStatic(C2895g gVar) throws Exception {
        C3015n nVar = new C3015n();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        nVar.f8881a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        nVar.f8882b = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        nVar.f8883c = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        nVar.f8884d = C2896h.m8234e(gVar);
                        break;
                    case 5:
                        nVar.f8885e = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        nVar.f8886f = C2896h.m8230a(gVar);
                        break;
                    case 7:
                        nVar.f8887g = _XiguaUserParams_UserExtendInfo_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return nVar;
            }
        }
    }
}
