package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _RoomUserAttr_ProtoDecoder implements C2888b<C8724x> {
    public final C8724x decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8724x decodeStatic(C2895g gVar) throws Exception {
        C8724x xVar = new C8724x();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        xVar.f23966a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        xVar.f23967b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        xVar.f23968c = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        xVar.f23969d = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        xVar.f23970e = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return xVar;
            }
        }
    }
}
