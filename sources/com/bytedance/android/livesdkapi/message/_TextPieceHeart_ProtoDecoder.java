package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _TextPieceHeart_ProtoDecoder implements C2888b<C8855k> {
    public final C8855k decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8855k decodeStatic(C2895g gVar) throws Exception {
        C8855k kVar = new C8855k();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return kVar;
            } else if (b != 1) {
                C2896h.m8236g(gVar);
            } else {
                kVar.f24171a = C2896h.m8234e(gVar);
            }
        }
    }
}
