package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _AnchorLevel_ProtoDecoder implements C2888b<C3003c> {
    public final C3003c decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C3003c decodeStatic(C2895g gVar) throws Exception {
        C3003c cVar = new C3003c();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f8816a = (int) C2896h.m8232c(gVar);
                        break;
                    case 2:
                        cVar.f8817b = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        cVar.f8818c = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        cVar.f8819d = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        cVar.f8820e = C2896h.m8232c(gVar);
                        break;
                    case 6:
                        cVar.f8821f = C2896h.m8232c(gVar);
                        break;
                    case 7:
                        cVar.f8822g = C2896h.m8232c(gVar);
                        break;
                    case 8:
                        cVar.f8823h = C2896h.m8232c(gVar);
                        break;
                    case 9:
                        cVar.f8824i = C2896h.m8232c(gVar);
                        break;
                    case 10:
                        cVar.f8825j = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 11:
                        cVar.f8826k = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 12:
                        cVar.f8827l = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 13:
                        cVar.f8828m = _ImageModel_ProtoDecoder.decodeStatic(gVar);
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
