package com.bytedance.android.livesdkapi.depend.model.live;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _RoomTab_ProtoDecoder implements C2888b<C8723w> {
    public final C8723w decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8723w decodeStatic(C2895g gVar) throws Exception {
        C8723w wVar = new C8723w();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        wVar.f23963a = C2896h.m8231b(gVar);
                        break;
                    case 2:
                        wVar.f23964b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        wVar.f23965c = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return wVar;
            }
        }
    }
}
