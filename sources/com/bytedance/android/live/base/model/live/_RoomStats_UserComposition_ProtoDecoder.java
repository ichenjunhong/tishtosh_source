package com.bytedance.android.live.base.model.live;

import com.bytedance.android.live.base.model.live.RoomStats.C2980a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _RoomStats_UserComposition_ProtoDecoder implements C2888b<C2980a> {
    public final C2980a decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2980a decodeStatic(C2895g gVar) throws Exception {
        C2980a aVar = new C2980a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f8733a = C2896h.m8233d(gVar);
                        break;
                    case 2:
                        aVar.f8734b = C2896h.m8233d(gVar);
                        break;
                    case 3:
                        aVar.f8735c = C2896h.m8233d(gVar);
                        break;
                    case 4:
                        aVar.f8736d = C2896h.m8233d(gVar);
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
