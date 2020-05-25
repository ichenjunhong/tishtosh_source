package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.gq */
public final class C7988gq implements C2888b<C7874cn> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7874cn cnVar = new C7874cn();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cnVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cnVar.f21816a = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        cnVar.f21817b = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        cnVar.f21819d = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        cnVar.f21818c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return cnVar;
            }
        }
    }
}
