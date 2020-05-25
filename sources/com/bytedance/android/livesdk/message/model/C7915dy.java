package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.model.C7799af.C7800a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.dy */
public final class C7915dy implements C2888b<C7800a> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15890a(gVar);
    }

    /* renamed from: a */
    public static C7800a m15890a(C2895g gVar) throws Exception {
        C7800a aVar = new C7800a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f21453a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        aVar.f21454b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        aVar.f21455c = C2896h.m8231b(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return aVar;
            }
        }
    }
}
