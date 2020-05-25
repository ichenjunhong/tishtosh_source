package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _BattleSettingInRoom_ProtoDecoder implements C2888b<C8700f> {
    public final C8700f decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8700f decodeStatic(C2895g gVar) throws Exception {
        C8700f fVar = new C8700f();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        fVar.f23829a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        fVar.f23830b = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        fVar.f23835g = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        fVar.f23832d = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        fVar.f23831c = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        fVar.f23836h = C2896h.m8232c(gVar);
                        break;
                    case 7:
                        fVar.f23833e = C2896h.m8232c(gVar);
                        break;
                    case 8:
                        fVar.f23834f = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return fVar;
            }
        }
    }
}
