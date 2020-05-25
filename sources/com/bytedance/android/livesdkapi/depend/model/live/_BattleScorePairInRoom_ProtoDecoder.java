package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _BattleScorePairInRoom_ProtoDecoder implements C2888b<C8698d> {
    public final C8698d decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8698d decodeStatic(C2895g gVar) throws Exception {
        C8698d dVar = new C8698d();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        dVar.f23824a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        dVar.f23825b = (int) C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return dVar;
            }
        }
    }
}
