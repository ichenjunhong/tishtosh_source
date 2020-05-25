package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _OfficialRoomInfo_ProtoDecoder implements C2888b<C8718r> {
    public final C8718r decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8718r decodeStatic(C2895g gVar) throws Exception {
        C8718r rVar = new C8718r();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        rVar.f23926a = C2896h.m8230a(gVar);
                        break;
                    case 2:
                        rVar.f23927b = C2896h.m8230a(gVar);
                        break;
                    case 3:
                        rVar.f23928c = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return rVar;
            }
        }
    }
}
