package com.bytedance.android.live.base.model.user;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _Author_ProtoDecoder implements C2888b<C3005e> {
    public final C3005e decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C3005e decodeStatic(C2895g gVar) throws Exception {
        C3005e eVar = new C3005e();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        eVar.f8832a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        eVar.f8833b = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        eVar.f8835d = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        eVar.f8836e = C2896h.m8232c(gVar);
                        break;
                    case 6:
                        eVar.f8837f = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return eVar;
            }
        }
    }
}
