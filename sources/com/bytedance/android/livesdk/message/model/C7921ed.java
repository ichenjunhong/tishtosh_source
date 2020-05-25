package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdk.gift.relay.p381a.C7633d;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.ed */
public final class C7921ed implements C2888b<C7804aj> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7804aj ajVar = new C7804aj();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        ajVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        ajVar.f21464a = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        ajVar.f21465b = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        ajVar.f21466c = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        ajVar.f21467d = C2896h.m8232c(gVar);
                        break;
                    case 6:
                        ajVar.f21468e = C2896h.m8232c(gVar);
                        break;
                    case 7:
                        ajVar.f21469f = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 8:
                        ajVar.f21470g = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        ajVar.f21471h = C7633d.m15626a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return ajVar;
            }
        }
    }
}
