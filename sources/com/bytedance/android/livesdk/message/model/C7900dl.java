package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.dl */
public final class C7900dl implements C2888b<C8007r> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C8007r rVar = new C8007r();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        rVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        rVar.f21899a = C2896h.m8230a(gVar);
                        break;
                    case 3:
                        rVar.f21900b = C2896h.m8230a(gVar);
                        break;
                    case 4:
                        rVar.f21901c = (int) C2896h.m8232c(gVar);
                        break;
                    case 5:
                        rVar.f21904f = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        rVar.f21902d = C2896h.m8234e(gVar);
                        break;
                    case 7:
                        rVar.f21903e = C2896h.m8234e(gVar);
                        break;
                    case 8:
                        rVar.f21905g = (int) C2896h.m8232c(gVar);
                        break;
                    case 9:
                        rVar.f21906h = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 10:
                        rVar.f21907i = (int) C2896h.m8232c(gVar);
                        break;
                    case 11:
                        rVar.f21908j = (int) C2896h.m8232c(gVar);
                        break;
                    case 12:
                        rVar.f21909k = C2896h.m8230a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return rVar;
            }
        }
    }
}
