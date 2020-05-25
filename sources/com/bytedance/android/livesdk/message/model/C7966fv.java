package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.fv */
public final class C7966fv implements C2888b<C7852bu> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7852bu buVar = new C7852bu();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        buVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        if (buVar.f21700a == null) {
                            buVar.f21700a = new ArrayList();
                        }
                        buVar.f21700a.add(C7965fu.m15904a(gVar));
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return buVar;
            }
        }
    }
}
