package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _GradeIcon_ProtoDecoder implements C2888b<C3008h> {
    public final C3008h decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C3008h decodeStatic(C2895g gVar) throws Exception {
        C3008h hVar = new C3008h();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        hVar.f8845c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        hVar.f8844b = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        hVar.f8846d = (int) C2896h.m8232c(gVar);
                        break;
                    case 4:
                        hVar.f8843a = C2896h.m8234e(gVar);
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
