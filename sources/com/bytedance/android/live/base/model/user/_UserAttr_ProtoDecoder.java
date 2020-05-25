package com.bytedance.android.live.base.model.user;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _UserAttr_ProtoDecoder implements C2888b<C3012k> {
    public final C3012k decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C3012k decodeStatic(C2895g gVar) throws Exception {
        C3012k kVar = new C3012k();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        kVar.f8850a = C2896h.m8230a(gVar);
                        break;
                    case 2:
                        kVar.f8851b = C2896h.m8230a(gVar);
                        break;
                    case 3:
                        kVar.f8852c = C2896h.m8230a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return kVar;
            }
        }
    }
}
