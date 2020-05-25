package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _BattleScorePair_ProtoDecoder implements C2888b<C8697c> {
    public final C8697c decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8697c decodeStatic(C2895g gVar) throws Exception {
        C8697c cVar = new C8697c();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f23825b = (int) C2896h.m8232c(gVar);
                        break;
                    case 2:
                        cVar.f23824a = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        cVar.f23827d = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return cVar;
            }
        }
    }
}
