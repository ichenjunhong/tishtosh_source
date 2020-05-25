package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.fg */
public final class C7951fg implements C2888b<C7835bj> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7835bj bjVar = new C7835bj();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bjVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bjVar.f21634b = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        bjVar.f21633a = (int) C2896h.m8232c(gVar);
                        break;
                    case 4:
                        bjVar.f21638f = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        bjVar.f21639g = C2896h.m8230a(gVar);
                        break;
                    case 6:
                        bjVar.f21635c = C2896h.m8230a(gVar);
                        break;
                    case 7:
                        bjVar.f21640h = (int) C2896h.m8232c(gVar);
                        break;
                    case 8:
                        bjVar.f21637e = (int) C2896h.m8232c(gVar);
                        break;
                    case 9:
                        bjVar.f21641i = (int) C2896h.m8232c(gVar);
                        break;
                    case 10:
                        bjVar.f21636d = (int) C2896h.m8232c(gVar);
                        break;
                    case 11:
                        bjVar.f21642j = C2896h.m8234e(gVar);
                        break;
                    case 12:
                        bjVar.f21644l = C2896h.m8232c(gVar);
                        break;
                    case 14:
                        bjVar.f21645m = C2896h.m8234e(gVar);
                        break;
                    case 15:
                        bjVar.f21643k = C7950ff.m15899a(gVar);
                        break;
                    case 17:
                        bjVar.f21646n = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return bjVar;
            }
        }
    }
}
