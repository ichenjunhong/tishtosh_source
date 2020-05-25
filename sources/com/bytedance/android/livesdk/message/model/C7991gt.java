package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.gt */
public final class C7991gt implements C2888b<C7877cq> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7877cq cqVar = new C7877cq();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cqVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cqVar.f21827a = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        cqVar.f21828b = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        cqVar.f21829c = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return cqVar;
            }
        }
    }
}
