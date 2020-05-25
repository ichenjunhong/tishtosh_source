package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.gk */
public final class C7982gk implements C2888b<C7867ch> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7867ch chVar = new C7867ch();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        chVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (chVar.f21780b == null) {
                            chVar.f21780b = new ArrayList();
                        }
                        chVar.f21780b.add(C7901dm.m15888a(gVar));
                        break;
                    case 3:
                        chVar.f21779a = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        chVar.f21781c = C2896h.m8234e(gVar);
                        break;
                    case 5:
                        if (chVar.f21782d == null) {
                            chVar.f21782d = new ArrayList();
                        }
                        chVar.f21782d.add(C7901dm.m15888a(gVar));
                        break;
                    case 6:
                        chVar.f21783e = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return chVar;
            }
        }
    }
}
