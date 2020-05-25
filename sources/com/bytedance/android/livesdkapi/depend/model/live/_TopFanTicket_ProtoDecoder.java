package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _TopFanTicket_ProtoDecoder implements C2888b<C8727z> {
    public final C8727z decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8727z decodeStatic(C2895g gVar) throws Exception {
        C8727z zVar = new C8727z();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        zVar.f23995a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        zVar.f23996b = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return zVar;
            }
        }
    }
}
