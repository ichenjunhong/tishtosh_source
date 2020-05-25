package com.bytedance.android.live.base.model.banner;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _FeedBanner_ProtoDecoder implements C2888b<C2965a> {
    public final C2965a decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2965a decodeStatic(C2895g gVar) throws Exception {
        C2965a aVar = new C2965a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f8684l = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        aVar.f8674b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        if (aVar.f8675c == null) {
                            aVar.f8675c = new ArrayList();
                        }
                        aVar.f8675c.add(C2896h.m8234e(gVar));
                        break;
                    case 4:
                        aVar.f8676d = C2896h.m8234e(gVar);
                        break;
                    case 5:
                        aVar.f8677e = (int) C2896h.m8232c(gVar);
                        break;
                    case 6:
                        aVar.f8678f = (int) C2896h.m8232c(gVar);
                        break;
                    case 8:
                        aVar.f8673a = C2896h.m8232c(gVar);
                        break;
                    case 9:
                        aVar.f8679g = C2896h.m8234e(gVar);
                        break;
                    case 11:
                        aVar.f8685m = (int) C2896h.m8232c(gVar);
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
