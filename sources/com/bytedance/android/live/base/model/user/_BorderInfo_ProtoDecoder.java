package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _BorderInfo_ProtoDecoder implements C2888b<C3006f> {
    public final C3006f decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C3006f decodeStatic(C2895g gVar) throws Exception {
        C3006f fVar = new C3006f();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        fVar.f8838a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        fVar.f8839b = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return fVar;
            }
        }
    }
}
