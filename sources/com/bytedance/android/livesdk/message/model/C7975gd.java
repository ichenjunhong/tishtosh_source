package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.gd */
public final class C7975gd implements C2888b<C7862cc> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7862cc ccVar = new C7862cc();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        ccVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        ccVar.f21746a = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        ccVar.f21747b = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        ccVar.f21748c = C2896h.m8234e(gVar);
                        break;
                    case 5:
                        ccVar.f21749d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        ccVar.f21750e = C2896h.m8234e(gVar);
                        break;
                    case 7:
                        ccVar.f21751f = String.valueOf(C2896h.m8232c(gVar));
                        break;
                    case 8:
                        ccVar.f21752g = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return ccVar;
            }
        }
    }
}
