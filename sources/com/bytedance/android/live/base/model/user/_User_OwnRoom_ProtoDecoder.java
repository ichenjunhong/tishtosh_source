package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.user.User.C2998a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _User_OwnRoom_ProtoDecoder implements C2888b<C2998a> {
    public final C2998a decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2998a decodeStatic(C2895g gVar) throws Exception {
        C2998a aVar = new C2998a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return aVar;
            } else if (b != 1) {
                C2896h.m8236g(gVar);
            } else {
                if (aVar.f8811a == null) {
                    aVar.f8811a = new ArrayList();
                }
                aVar.f8811a.add(Long.valueOf(C2896h.m8232c(gVar)));
            }
        }
    }
}
