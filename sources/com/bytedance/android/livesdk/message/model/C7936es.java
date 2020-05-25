package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.model.C7820ay.C7821a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.es */
public final class C7936es implements C2888b<C7821a> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15895a(gVar);
    }

    /* renamed from: a */
    public static C7821a m15895a(C2895g gVar) throws Exception {
        C7821a aVar = new C7821a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b == -1) {
                gVar.mo7516a(a);
                return aVar;
            } else if (b != 1) {
                C2896h.m8236g(gVar);
            } else {
                if (aVar.f21532a == null) {
                    aVar.f21532a = new ArrayList();
                }
                aVar.f21532a.add(C7937et.m15896a(gVar));
            }
        }
    }
}
