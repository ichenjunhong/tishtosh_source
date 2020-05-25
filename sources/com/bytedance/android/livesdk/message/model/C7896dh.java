package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.dh */
public final class C7896dh implements C2888b<C8003o> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C8003o oVar = new C8003o();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        oVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        oVar.f21877a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        oVar.f21878b = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        oVar.f21879c = C2896h.m8234e(gVar);
                        break;
                    case 5:
                        oVar.f21880d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        oVar.f21881e = C2896h.m8232c(gVar);
                        break;
                    case 7:
                        oVar.f21882f = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return oVar;
            }
        }
    }
}
