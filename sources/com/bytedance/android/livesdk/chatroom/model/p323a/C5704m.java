package com.bytedance.android.livesdk.chatroom.model.p323a;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.a.m */
public final class C5704m implements C2888b<C5693c> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C5693c cVar = new C5693c();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cVar.f14935a = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        cVar.f14936b = C5705n.m12612a(gVar);
                        break;
                    case 4:
                        cVar.f14937c = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return cVar;
            }
        }
    }
}
