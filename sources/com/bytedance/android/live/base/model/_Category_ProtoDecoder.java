package com.bytedance.android.live.base.model;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _Category_ProtoDecoder implements C2888b<C2968c> {
    public final C2968c decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2968c decodeStatic(C2895g gVar) throws Exception {
        C2968c cVar = new C2968c();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f8695a = (int) C2896h.m8232c(gVar);
                        break;
                    case 2:
                        cVar.f8696b = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        cVar.f8697c = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        cVar.f8698d = C2896h.m8234e(gVar);
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
