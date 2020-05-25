package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.model.C7827bc.C7828a;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.ex */
public final class C7941ex implements C2888b<C7827bc> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7827bc bcVar = new C7827bc();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bcVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bcVar.f21555b = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                bcVar.f21554a = new C7828a();
                bcVar.f21554a.f21556a = bcVar.f21555b;
                return bcVar;
            }
        }
    }
}
