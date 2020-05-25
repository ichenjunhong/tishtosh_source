package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _TextPieceGift_ProtoDecoder implements C2888b<C8854j> {
    public final C8854j decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8854j decodeStatic(C2895g gVar) throws Exception {
        C8854j jVar = new C8854j();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        jVar.f24169a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        jVar.f24170b = _PatternRef_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return jVar;
            }
        }
    }
}
