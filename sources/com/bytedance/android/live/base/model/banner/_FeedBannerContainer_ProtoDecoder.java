package com.bytedance.android.live.base.model.banner;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _FeedBannerContainer_ProtoDecoder implements C2888b<C2966b> {
    public final C2966b decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2966b decodeStatic(C2895g gVar) throws Exception {
        C2966b bVar = new C2966b();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (bVar.f8687a == null) {
                            bVar.f8687a = new ArrayList();
                        }
                        bVar.f8687a.add(_FeedBanner_ProtoDecoder.decodeStatic(gVar));
                        break;
                    case 2:
                        bVar.f8688b = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        bVar.f8689c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        bVar.f8690d = C2896h.m8234e(gVar);
                        break;
                    case 5:
                        bVar.f8691e = (int) C2896h.m8232c(gVar);
                        break;
                    case 6:
                        bVar.f8692f = (int) C2896h.m8232c(gVar);
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
