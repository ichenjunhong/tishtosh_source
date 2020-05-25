package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.ga */
public final class C7972ga implements C2888b<C7857bz> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15907a(gVar);
    }

    /* renamed from: a */
    public static C7857bz m15907a(C2895g gVar) throws Exception {
        C7857bz bzVar = new C7857bz();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bzVar.f21717a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        bzVar.f21718b = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        bzVar.f21719c = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        bzVar.f21720d = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        bzVar.f21721e = C2896h.m8232c(gVar);
                        break;
                    case 6:
                        bzVar.f21722f = C2896h.m8232c(gVar);
                        break;
                    case 7:
                        bzVar.f21723g = C2896h.m8234e(gVar);
                        break;
                    case 8:
                        bzVar.f21724h = C2896h.m8232c(gVar);
                        break;
                    case 9:
                        bzVar.f21725i = C7973gb.m15908a(gVar);
                        break;
                    case 10:
                        bzVar.f21726j = C2896h.m8232c(gVar);
                        break;
                    case 11:
                        bzVar.f21727k = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return bzVar;
            }
        }
    }
}
