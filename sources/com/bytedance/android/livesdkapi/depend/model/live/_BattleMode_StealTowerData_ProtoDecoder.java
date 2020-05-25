package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.C8695b.C8696a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _BattleMode_StealTowerData_ProtoDecoder implements C2888b<C8696a> {
    public final C8696a decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8696a decodeStatic(C2895g gVar) throws Exception {
        C8696a aVar = new C8696a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return aVar;
            } else if (b != 1) {
                C2896h.m8236g(gVar);
            } else {
                aVar.f23822i = (int) C2896h.m8232c(gVar);
            }
        }
    }
}
