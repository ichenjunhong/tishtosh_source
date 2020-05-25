package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2894f;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _RoomDecoration_ProtoDecoder implements C2888b<C8721u> {
    public final C8721u decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8721u decodeStatic(C2895g gVar) throws Exception {
        C8721u uVar = new C8721u();
        ArrayList arrayList = new ArrayList();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        uVar.f23947h = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        uVar.f23940a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        uVar.f23946g = (int) C2896h.m8232c(gVar);
                        break;
                    case 4:
                        arrayList.add(Integer.valueOf((int) C2896h.m8232c(gVar)));
                        break;
                    case 5:
                        uVar.f23942c = (int) C2896h.m8232c(gVar);
                        break;
                    case 6:
                        uVar.f23941b = C2896h.m8234e(gVar);
                        break;
                    case 7:
                        uVar.f23943d = C2896h.m8234e(gVar);
                        break;
                    case 8:
                        uVar.f23944e = (int) C2896h.m8232c(gVar);
                        break;
                    case 9:
                        uVar.f23952m = (int) C2896h.m8232c(gVar);
                        break;
                    case 10:
                        uVar.f23951l = (int) C2896h.m8232c(gVar);
                        break;
                    case 11:
                        uVar.f23948i = (int) C2896h.m8232c(gVar);
                        break;
                    case 12:
                        uVar.f23950k = (int) C2896h.m8232c(gVar);
                        break;
                    case 13:
                        uVar.f23949j = (int) C2896h.m8232c(gVar);
                        break;
                    case 14:
                        uVar.f23953n = (int) C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                uVar.f23945f = C2894f.m8215a(arrayList);
                return uVar;
            }
        }
    }
}
