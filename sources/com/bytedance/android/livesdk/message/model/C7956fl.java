package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.model.C7841bo.C7842a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.fl */
public final class C7956fl implements C2888b<C7842a> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15900a(gVar);
    }

    /* renamed from: a */
    public static C7842a m15900a(C2895g gVar) throws Exception {
        C7842a aVar = new C7842a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return aVar;
            } else if (b != 1) {
                switch (b) {
                    case 3:
                        aVar.f21668c = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        aVar.f21669d = C2896h.m8231b(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                aVar.f21666a = C2896h.m8231b(gVar);
            }
        }
    }
}
