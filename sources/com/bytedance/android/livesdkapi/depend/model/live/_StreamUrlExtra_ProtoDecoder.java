package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _StreamUrlExtra_ProtoDecoder implements C2888b<C8725y> {
    public final C8725y decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8725y decodeStatic(C2895g gVar) throws Exception {
        C8725y yVar = new C8725y();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        yVar.f23973c = (int) C2896h.m8232c(gVar);
                        break;
                    case 2:
                        yVar.f23974d = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        yVar.f23981k = (int) C2896h.m8232c(gVar);
                        break;
                    case 4:
                        yVar.f23977g = (int) C2896h.m8232c(gVar);
                        break;
                    case 5:
                        yVar.f23975e = (int) C2896h.m8232c(gVar);
                        break;
                    case 6:
                        yVar.f23976f = (int) C2896h.m8232c(gVar);
                        break;
                    case 7:
                        yVar.f23980j = (int) C2896h.m8232c(gVar);
                        break;
                    case 8:
                        yVar.f23982l = (int) C2896h.m8232c(gVar);
                        break;
                    case 9:
                        yVar.f23983m = (int) C2896h.m8232c(gVar);
                        break;
                    case 10:
                        yVar.f23979i = C2896h.m8230a(gVar);
                        break;
                    case 12:
                        yVar.f23978h = (int) C2896h.m8232c(gVar);
                        break;
                    case 14:
                        yVar.f23984n = _StreamUrlExtra_SrConfig_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 15:
                        yVar.f23985o = C2896h.m8230a(gVar);
                        break;
                    case 16:
                        yVar.f23986p = (float) C2896h.m8232c(gVar);
                        break;
                    case 17:
                        yVar.f23987q = C2896h.m8230a(gVar);
                        break;
                    case 18:
                        yVar.f23988r = C2896h.m8230a(gVar);
                        break;
                    case 19:
                        yVar.f23989s = C2896h.m8230a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return yVar;
            }
        }
    }
}
