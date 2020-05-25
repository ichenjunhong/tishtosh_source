package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.ds */
public final class C7908ds implements C2888b<C8016y> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C8016y yVar = new C8016y();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        yVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        yVar.f21939a = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        yVar.f21940b = (int) C2896h.m8232c(gVar);
                        break;
                    case 4:
                        yVar.f21941c = (int) C2896h.m8232c(gVar);
                        break;
                    case 5:
                        yVar.f21942d = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        yVar.f21943e = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return yVar;
            }
        }
    }
}
