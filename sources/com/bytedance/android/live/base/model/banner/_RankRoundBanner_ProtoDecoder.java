package com.bytedance.android.live.base.model.banner;

import com.bytedance.android.live.base.model.live._Ranking_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _RankRoundBanner_ProtoDecoder implements C2888b<C2967c> {
    public final C2967c decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2967c decodeStatic(C2895g gVar) throws Exception {
        C2967c cVar = new C2967c();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (cVar.f8694b == null) {
                            cVar.f8694b = new ArrayList();
                        }
                        cVar.f8694b.add(_Ranking_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 2:
                        cVar.f8693a = (int) C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return cVar;
            }
        }
    }
}
