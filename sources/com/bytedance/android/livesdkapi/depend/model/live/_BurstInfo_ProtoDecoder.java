package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _BurstInfo_ProtoDecoder implements C2888b<C8702h> {
    public final C8702h decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8702h decodeStatic(C2895g gVar) throws Exception {
        C8702h hVar = new C8702h();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        hVar.f23840a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        hVar.f23841b = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        hVar.f23842c = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        hVar.f23843d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return hVar;
            }
        }
    }
}
