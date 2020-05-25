package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _UserHealthScoreInfo_ProtoDecoder implements C2888b<C8694ab> {
    public final C8694ab decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8694ab decodeStatic(C2895g gVar) throws Exception {
        C8694ab abVar = new C8694ab();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        abVar.f23809a = C2896h.m8233d(gVar);
                        break;
                    case 2:
                        abVar.f23810b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        abVar.f23811c = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return abVar;
            }
        }
    }
}
