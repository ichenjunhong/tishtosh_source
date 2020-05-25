package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

public final class _FraternityInfo_ProtoDecoder implements C2888b<FraternityInfo> {
    public final FraternityInfo decode(C2895g gVar) throws Exception {
        return decodeStatic(gVar);
    }

    public static FraternityInfo decodeStatic(C2895g gVar) throws Exception {
        FraternityInfo fraternityInfo = new FraternityInfo();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        fraternityInfo.name = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        fraternityInfo.level = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        fraternityInfo.background = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        fraternityInfo.fontColor = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return fraternityInfo;
            }
        }
    }
}
