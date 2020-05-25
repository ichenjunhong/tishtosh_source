package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _ChannelInfo_ProtoDecoder implements C2888b<C8703i> {
    public final C8703i decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8703i decodeStatic(C2895g gVar) throws Exception {
        C8703i iVar = new C8703i();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        iVar.f23844a = (int) C2896h.m8232c(gVar);
                        break;
                    case 2:
                        iVar.f23845b = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        iVar.f23846c = (int) C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return iVar;
            }
        }
    }
}
