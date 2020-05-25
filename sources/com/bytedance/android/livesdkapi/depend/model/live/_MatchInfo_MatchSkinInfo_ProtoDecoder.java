package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.C8713p.C8715b;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _MatchInfo_MatchSkinInfo_ProtoDecoder implements C2888b<C8715b> {
    public final C8715b decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8715b decodeStatic(C2895g gVar) throws Exception {
        C8715b bVar = new C8715b();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f23907a = _MatchInfo_FollowBtnSkin_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bVar.f23908b = _MatchInfo_FollowBtnSkin_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        bVar.f23909c = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        bVar.f23910d = C2896h.m8234e(gVar);
                        break;
                    case 5:
                        bVar.f23911e = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        bVar.f23912f = C2896h.m8234e(gVar);
                        break;
                    case 7:
                        bVar.f23913g = C2896h.m8234e(gVar);
                        break;
                    case 8:
                        bVar.f23914h = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        bVar.f23915i = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 10:
                        bVar.f23916j = C2896h.m8234e(gVar);
                        break;
                    case 11:
                        bVar.f23917k = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return bVar;
            }
        }
    }
}
