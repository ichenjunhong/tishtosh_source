package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _TextPiecePatternRef_ProtoDecoder implements C2888b<C8856l> {
    public final C8856l decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8856l decodeStatic(C2895g gVar) throws Exception {
        C8856l lVar = new C8856l();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        lVar.f24172a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        lVar.f24173b = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return lVar;
            }
        }
    }
}
