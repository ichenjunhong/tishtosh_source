package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _BannerInRoom_ProtoDecoder implements C2888b<C8692a> {
    public final C8692a decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8692a decodeStatic(C2895g gVar) throws Exception {
        C8692a aVar = new C8692a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f23794a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        aVar.f23795b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        aVar.f23796c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        aVar.f23797d = (int) C2896h.m8232c(gVar);
                        break;
                    case 5:
                        aVar.f23798e = (int) C2896h.m8232c(gVar);
                        break;
                    case 6:
                        aVar.f23799f = C2896h.m8234e(gVar);
                        break;
                    case 7:
                        aVar.f23801h = (int) C2896h.m8232c(gVar);
                        break;
                    case 9:
                        aVar.f23802i = (int) C2896h.m8232c(gVar);
                        break;
                    case 10:
                        aVar.f23800g = C2896h.m8234e(gVar);
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
