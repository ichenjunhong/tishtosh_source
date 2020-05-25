package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.dj */
public final class C7898dj implements C2888b<C8004p> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C8004p pVar = new C8004p();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        pVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        pVar.f21883a = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        pVar.f21884b = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        if (pVar.f21885c == null) {
                            pVar.f21885c = new ArrayList();
                        }
                        pVar.f21885c.add(C7897di.m15887a(gVar));
                        break;
                    case 5:
                        pVar.f21886d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        pVar.f21887e = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 7:
                        pVar.f21888f = C2896h.m8234e(gVar);
                        break;
                    case 8:
                        pVar.f21889g = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        pVar.f21890h = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return pVar;
            }
        }
    }
}
