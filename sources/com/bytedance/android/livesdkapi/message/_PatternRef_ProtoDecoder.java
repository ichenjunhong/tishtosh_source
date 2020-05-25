package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _PatternRef_ProtoDecoder implements C2888b<C8847d> {
    public final C8847d decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8847d decodeStatic(C2895g gVar) throws Exception {
        C8847d dVar = new C8847d();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        dVar.f24143a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        dVar.f24144b = C2896h.m8234e(gVar);
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
