package com.bytedance.android.live.base.model.live;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _Ranking_ProtoDecoder implements C2888b<C2984d> {
    public final C2984d decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2984d decodeStatic(C2895g gVar) throws Exception {
        C2984d dVar = new C2984d();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        dVar.f8744d = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        if (dVar.f8743c == null) {
                            dVar.f8743c = new ArrayList();
                        }
                        dVar.f8743c.add(_RankUser_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 3:
                        dVar.f8742b = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        dVar.f8741a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        dVar.f8745e = _ImageModel_ProtoDecoder.decodeStatic(gVar);
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
