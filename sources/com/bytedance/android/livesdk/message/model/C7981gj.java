package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._FlexImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.gj */
public final class C7981gj implements C2888b<C7866cg> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7866cg cgVar = new C7866cg();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cgVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        cgVar.f21768b = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        cgVar.f21771e = C2896h.m8234e(gVar);
                        break;
                    case 7:
                        cgVar.f21772f = String.valueOf(C2896h.m8232c(gVar));
                        break;
                    case 8:
                        cgVar.f21773g = C2896h.m8232c(gVar);
                        break;
                    case 10:
                        cgVar.f21776j = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 11:
                        cgVar.f21775i = _FlexImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 12:
                        cgVar.f21777k = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return cgVar;
            }
        }
    }
}
