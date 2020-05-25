package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.ek */
public final class C7928ek implements C2888b<C7812aq> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7812aq aqVar = new C7812aq();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aqVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        aqVar.f21508a = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        aqVar.f21509b = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        if (aqVar.f21510c == null) {
                            aqVar.f21510c = new ArrayList();
                        }
                        aqVar.f21510c.add(C7929el.m15894a(gVar));
                        break;
                    case 5:
                        aqVar.f21511d = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return aqVar;
            }
        }
    }
}
