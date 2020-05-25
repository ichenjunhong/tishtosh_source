package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.gi */
public final class C7980gi implements C2888b<C7865cf> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7865cf cfVar = new C7865cf();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cfVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cfVar.f21764d = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        cfVar.f21762b = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        cfVar.f21761a = C2896h.m8234e(gVar);
                        break;
                    case 5:
                        cfVar.f21766f = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        cfVar.f21765e = C7979gh.m15910a(gVar);
                        break;
                    case 7:
                        cfVar.f21763c = (int) C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return cfVar;
            }
        }
    }
}
