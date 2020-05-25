package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.message.model.eh */
public final class C7925eh implements C2888b<C7809an> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15892a(gVar);
    }

    /* renamed from: a */
    public static C7809an m15892a(C2895g gVar) throws Exception {
        C7809an anVar = new C7809an();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (anVar.f21489a == null) {
                            anVar.f21489a = new ArrayList();
                        }
                        anVar.f21489a.add(Long.valueOf(C2896h.m8232c(gVar)));
                        break;
                    case 2:
                        anVar.f21490b = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        anVar.f21491c = (int) C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return anVar;
            }
        }
    }
}
