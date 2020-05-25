package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.model.C7878cr.C7879a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.gu */
public final class C7992gu implements C2888b<C7879a> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15914a(gVar);
    }

    /* renamed from: a */
    public static C7879a m15914a(C2895g gVar) throws Exception {
        C7879a aVar = new C7879a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f21832a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        aVar.f21833b = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        aVar.f21834c = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        aVar.f21835d = C2896h.m8234e(gVar);
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
