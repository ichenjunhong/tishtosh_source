package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.fj */
public final class C7954fj implements C2888b<C7839bm> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7839bm bmVar = new C7839bm();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bmVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bmVar.f21658a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        bmVar.f21659b = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        bmVar.f21660c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        bmVar.f21661d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        bmVar.f21662e = C2896h.m8231b(gVar);
                        break;
                    case 7:
                        bmVar.f21663f = C7925eh.m15892a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return bmVar;
            }
        }
    }
}
