package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.livesdkapi.depend.model.live.C8725y.C8726a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _StreamUrlExtra_SrConfig_ProtoDecoder implements C2888b<C8726a> {
    public final C8726a decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8726a decodeStatic(C2895g gVar) throws Exception {
        C8726a aVar = new C8726a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f23992a = C2896h.m8230a(gVar);
                        break;
                    case 2:
                        aVar.f23994c = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        aVar.f23993b = C2896h.m8230a(gVar);
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
