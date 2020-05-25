package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _ActivityRewardInfo_ProtoDecoder implements C2888b<C2999a> {
    public final C2999a decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static C2999a decodeStatic(C2895g gVar) throws Exception {
        C2999a aVar = new C2999a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f8812a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        aVar.f8813b = _ImageModel_ProtoDecoder.decodeStatic(gVar);
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
