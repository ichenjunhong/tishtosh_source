package com.bytedance.android.livesdkapi.message;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _TextFormat_ProtoDecoder implements C2888b<C8852h> {
    public final C8852h decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C8852h decodeStatic(C2895g gVar) throws Exception {
        C8852h hVar = new C8852h();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return hVar;
            } else if (b != 1) {
                switch (b) {
                    case 3:
                        hVar.f24160b = C2896h.m8230a(gVar);
                        break;
                    case 4:
                        hVar.f24161c = C2896h.m8231b(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                hVar.f24159a = C2896h.m8234e(gVar);
            }
        }
    }
}
