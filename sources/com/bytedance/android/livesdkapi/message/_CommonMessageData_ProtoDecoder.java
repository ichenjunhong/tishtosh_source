package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _CommonMessageData_ProtoDecoder implements C2888b<C8845b> {
    public final C8845b decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8845b decodeStatic(C2895g gVar) throws Exception {
        C8845b bVar = new C8845b();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f24134e = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        bVar.f24133d = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        bVar.f24132c = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        bVar.f24130a = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        bVar.f24138i = C2896h.m8231b(gVar);
                        break;
                    case 6:
                        bVar.f24136g = C2896h.m8230a(gVar);
                        break;
                    case 7:
                        bVar.f24135f = C2896h.m8234e(gVar);
                        break;
                    case 8:
                        bVar.f24139j = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        bVar.f24140k = C2896h.m8232c(gVar);
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
