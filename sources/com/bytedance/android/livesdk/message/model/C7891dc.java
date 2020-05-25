package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.dc */
public final class C7891dc implements C2888b<C7998j> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7998j jVar = new C7998j();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        jVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        jVar.f21859c = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        jVar.f21860d = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        jVar.f21861e = C2896h.m8234e(gVar);
                        break;
                    case 5:
                        jVar.f21862f = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        jVar.f21863g = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return jVar;
            }
        }
    }
}
