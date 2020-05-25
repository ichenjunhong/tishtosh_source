package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.fa */
public final class C7945fa implements C2888b<C7831bf> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7831bf bfVar = new C7831bf();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bfVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bfVar.f21591a = C2896h.m8231b(gVar);
                        break;
                    case 3:
                        bfVar.f21592b = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        bfVar.f21593c = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        bfVar.f21594d = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        bfVar.f21595e = C2896h.m8234e(gVar);
                        break;
                    case 7:
                        bfVar.f21596f = C2896h.m8232c(gVar);
                        break;
                    case 8:
                        bfVar.f21597g = C2896h.m8232c(gVar);
                        break;
                    case 9:
                        bfVar.f21598h = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return bfVar;
            }
        }
    }
}
