package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.de */
public final class C7893de implements C2888b<C8000l> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C8000l lVar = new C8000l();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        lVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (lVar.f21866a == null) {
                            lVar.f21866a = new ArrayList();
                        }
                        lVar.f21866a.add(C7990gs.m15913a(gVar));
                        break;
                    case 3:
                        lVar.f21867b = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return lVar;
            }
        }
    }
}
