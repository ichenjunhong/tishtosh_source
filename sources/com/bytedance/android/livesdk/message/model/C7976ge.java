package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.ge */
public final class C7976ge implements C2888b<C7863cd> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7863cd cdVar = new C7863cd();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cdVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cdVar.f21759c = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        cdVar.f21757a = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        cdVar.f21758b = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return cdVar;
            }
        }
    }
}
