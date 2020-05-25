package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _BattleMode_ProtoDecoder implements C2888b<C8695b> {
    public final C8695b decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8695b decodeStatic(C2895g gVar) throws Exception {
        C8695b bVar = new C8695b();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f23812a = C2896h.m8231b(gVar);
                        break;
                    case 2:
                        bVar.f23813b = _BattleMode_StealTowerData_ProtoDecoder.decodeStatic(gVar);
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
