package com.bytedance.android.live.base.model.live;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _RankUser_ProtoDecoder implements C2888b<C2983c> {
    public final C2983c decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2983c decodeStatic(C2895g gVar) throws Exception {
        C2983c cVar = new C2983c();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f8738b = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cVar.f8740d = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        cVar.f8737a = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        cVar.f8739c = (int) C2896h.m8232c(gVar);
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
