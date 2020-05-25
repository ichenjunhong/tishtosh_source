package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.ea */
public final class C7918ea implements C2888b<FansclubStatisticMessage> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        FansclubStatisticMessage fansclubStatisticMessage = new FansclubStatisticMessage();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        fansclubStatisticMessage.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        fansclubStatisticMessage.name = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        fansclubStatisticMessage.fansCount = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return fansclubStatisticMessage;
            }
        }
    }
}
