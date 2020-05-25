package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.C8713p.C8714a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _MatchInfo_FollowBtnSkin_ProtoDecoder implements C2888b<C8714a> {
    public final C8714a decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8714a decodeStatic(C2895g gVar) throws Exception {
        C8714a aVar = new C8714a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f23904a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        aVar.f23905b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        aVar.f23906c = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return aVar;
            }
        }
    }
}
