package com.bytedance.android.livesdk.chatroom.model.p323a;

import com.bytedance.android.livesdk.chatroom.model.p323a.C5693c.C5694a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.a.n */
public final class C5705n implements C2888b<C5694a> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m12612a(gVar);
    }

    /* renamed from: a */
    public static C5694a m12612a(C2895g gVar) throws Exception {
        C5694a aVar = new C5694a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f14938a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        aVar.f14939b = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        aVar.f14940c = (int) C2896h.m8232c(gVar);
                        break;
                    case 4:
                        aVar.f14942e = (int) C2896h.m8232c(gVar);
                        break;
                    case 5:
                        aVar.f14943f = C2896h.m8232c(gVar);
                        break;
                    case 6:
                        aVar.f14944g = C2896h.m8230a(gVar);
                        break;
                    case 7:
                        aVar.f14945h = (int) C2896h.m8232c(gVar);
                        break;
                    case 8:
                        aVar.f14941d = (int) C2896h.m8232c(gVar);
                        break;
                    case 9:
                        aVar.f14947j = (int) C2896h.m8232c(gVar);
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
