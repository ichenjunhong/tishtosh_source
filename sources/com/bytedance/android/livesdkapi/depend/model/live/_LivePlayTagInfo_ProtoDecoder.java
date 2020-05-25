package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _LivePlayTagInfo_ProtoDecoder implements C2888b<C8711n> {
    public final C8711n decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8711n decodeStatic(C2895g gVar) throws Exception {
        C8711n nVar = new C8711n();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 2:
                        nVar.f23899b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        nVar.f23900c = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        nVar.f23901d = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return nVar;
            }
        }
    }
}
