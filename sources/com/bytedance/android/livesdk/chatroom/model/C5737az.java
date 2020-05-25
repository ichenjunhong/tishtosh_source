package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.az */
public final class C5737az implements C2888b<C5743c> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m12618a(gVar);
    }

    /* renamed from: a */
    public static C5743c m12618a(C2895g gVar) throws Exception {
        C5743c cVar = new C5743c();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f15098b = C5736ay.m12617a(gVar);
                        break;
                    case 2:
                        cVar.f15097a = C5736ay.m12617a(gVar);
                        break;
                    case 3:
                        cVar.f15099c = C5736ay.m12617a(gVar);
                        break;
                    case 4:
                        cVar.f15100d = C5736ay.m12617a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return cVar;
            }
        }
    }
}
