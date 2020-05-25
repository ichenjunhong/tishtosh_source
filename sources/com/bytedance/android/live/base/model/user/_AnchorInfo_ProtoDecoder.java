package com.bytedance.android.live.base.model.user;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _AnchorInfo_ProtoDecoder implements C2888b<C3002b> {
    public final C3002b decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C3002b decodeStatic(C2895g gVar) throws Exception {
        C3002b bVar = new C3002b();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return bVar;
            } else if (b != 1) {
                C2896h.m8236g(gVar);
            } else {
                bVar.f8814a = C2896h.m8232c(gVar);
            }
        }
    }
}
