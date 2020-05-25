package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.ef */
public final class C7923ef implements C2888b<C7805ak> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7805ak akVar = new C7805ak();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return akVar;
            } else if (b != 8) {
                switch (b) {
                    case 1:
                        akVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        akVar.f21473a = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        akVar.f21474b = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        akVar.f21475c = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        akVar.f21476d = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                akVar.f21478f = C7922ee.m15891a(gVar);
            }
        }
    }
}
