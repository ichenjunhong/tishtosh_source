package com.bytedance.android.live.base.model;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

public final class _CateCell_ProtoDecoder implements C2888b<C2963b> {
    public final C2963b decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2963b decodeStatic(C2895g gVar) throws Exception {
        C2963b bVar = new C2963b();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return bVar;
            } else if (b != 1) {
                C2896h.m8236g(gVar);
            } else {
                if (bVar.f8672a == null) {
                    bVar.f8672a = new ArrayList();
                }
                bVar.f8672a.add(_Category_ProtoDecoder.decodeStatic(gVar));
            }
        }
    }
}
