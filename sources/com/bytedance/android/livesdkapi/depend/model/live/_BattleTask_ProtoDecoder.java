package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _BattleTask_ProtoDecoder implements C2888b<C8701g> {
    public final C8701g decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8701g decodeStatic(C2895g gVar) throws Exception {
        C8701g gVar2 = new C8701g();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return gVar2;
            } else if (b != 1) {
                C2896h.m8236g(gVar);
            } else {
                gVar2.f23839a = C2896h.m8230a(gVar);
            }
        }
    }
}
