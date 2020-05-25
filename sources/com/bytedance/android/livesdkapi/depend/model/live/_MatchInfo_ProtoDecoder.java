package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _MatchInfo_ProtoDecoder implements C2888b<C8713p> {
    public final C8713p decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8713p decodeStatic(C2895g gVar) throws Exception {
        C8713p pVar = new C8713p();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return pVar;
            } else if (b != 1) {
                C2896h.m8236g(gVar);
            } else {
                pVar.f23903a = _MatchInfo_MatchSkinInfo_ProtoDecoder.decodeStatic(gVar);
            }
        }
    }
}
