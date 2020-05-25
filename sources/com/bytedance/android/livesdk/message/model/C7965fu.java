package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.fu */
public final class C7965fu implements C2888b<C7851bt> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15904a(gVar);
    }

    /* renamed from: a */
    public static C7851bt m15904a(C2895g gVar) throws Exception {
        C7851bt btVar = new C7851bt();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return btVar;
            } else if (b != 4) {
                switch (b) {
                    case 1:
                        btVar.f21697a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        btVar.f21698b = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                if (btVar.f21699c == null) {
                    btVar.f21699c = new ArrayList();
                }
                btVar.f21699c.add(C7885cx.m15885a(gVar));
            }
        }
    }
}
