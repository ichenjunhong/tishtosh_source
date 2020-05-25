package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _BattleSetting_ProtoDecoder implements C2888b<C8699e> {
    public final C8699e decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8699e decodeStatic(C2895g gVar) throws Exception {
        C8699e eVar = new C8699e();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 2:
                        eVar.f23833e = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        eVar.f23832d = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        eVar.f23830b = (int) C2896h.m8232c(gVar);
                        break;
                    case 5:
                        eVar.f23831c = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        eVar.f23829a = C2896h.m8232c(gVar);
                        break;
                    case 7:
                        eVar.f23834f = C2896h.m8232c(gVar);
                        break;
                    case 8:
                        eVar.f23837i = C2896h.m8234e(gVar);
                        break;
                    case 9:
                        eVar.f23838j = C2896h.m8232c(gVar);
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
