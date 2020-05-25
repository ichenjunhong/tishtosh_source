package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _AuthenticationInfo_ProtoDecoder implements C2888b<C3004d> {
    public final C3004d decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C3004d decodeStatic(C2895g gVar) throws Exception {
        C3004d dVar = new C3004d();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        dVar.f8829a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        dVar.f8830b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        dVar.f8831c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return dVar;
            }
        }
    }
}
