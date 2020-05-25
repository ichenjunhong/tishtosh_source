package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.gm */
public final class C7984gm implements C2888b<C7869cj> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7869cj cjVar = new C7869cj();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cjVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cjVar.f21788c = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        cjVar.f21789d = (int) C2896h.m8232c(gVar);
                        break;
                    case 4:
                        cjVar.f21787b = C2896h.m8234e(gVar);
                        break;
                    case 5:
                        cjVar.f21790e = (int) C2896h.m8232c(gVar);
                        break;
                    case 8:
                        cjVar.f21791f = C7892dd.m15886a(gVar);
                        break;
                    case 9:
                        cjVar.f21792g = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return cjVar;
            }
        }
    }
}
