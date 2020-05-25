package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.do */
public final class C7903do implements C2888b<C8009t> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C8009t tVar = new C8009t();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        tVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        tVar.f21914a = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        tVar.f21915b = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        tVar.f21916c = C7902dn.m15889a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return tVar;
            }
        }
    }
}
