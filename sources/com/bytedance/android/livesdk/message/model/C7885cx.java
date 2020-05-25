package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.cx */
public final class C7885cx implements C2888b<C7917e> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15885a(gVar);
    }

    /* renamed from: a */
    public static C7917e m15885a(C2895g gVar) throws Exception {
        C7917e eVar = new C7917e();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        eVar.f21839a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        eVar.f21840b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        eVar.f21841c = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        eVar.f21842d = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        eVar.f21843e = C2896h.m8230a(gVar);
                        break;
                    case 6:
                        eVar.f21844f = C2896h.m8230a(gVar);
                        break;
                    case 7:
                        eVar.f21845g = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return eVar;
            }
        }
    }
}
