package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.fs */
public final class C7963fs implements C2888b<C7849br> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7849br brVar = new C7849br();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return brVar;
            } else if (b == 1) {
                brVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
            } else if (b != 3) {
                switch (b) {
                    case 5:
                        brVar.f21687c = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        brVar.f21685a = C2896h.m8234e(gVar);
                        break;
                    case 7:
                        brVar.f21686b = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                brVar.f21688d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
            }
        }
    }
}
