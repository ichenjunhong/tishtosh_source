package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.dw */
public final class C7913dw implements C2888b<C7798ae> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7798ae aeVar = new C7798ae();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return aeVar;
            } else if (b == 1) {
                aeVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
            } else if (b != 12) {
                switch (b) {
                    case 5:
                        aeVar.f21442a = C2896h.m8231b(gVar);
                        break;
                    case 6:
                        aeVar.f21443b = C2896h.m8231b(gVar);
                        break;
                    case 7:
                        aeVar.f21444c = C2896h.m8231b(gVar);
                        break;
                    case 8:
                        aeVar.f21445d = C2896h.m8231b(gVar);
                        break;
                    case 9:
                        aeVar.f21446e = C2896h.m8231b(gVar);
                        break;
                    case 10:
                        aeVar.f21447f = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                aeVar.f21448g = C2896h.m8232c(gVar);
            }
        }
    }
}
