package com.bytedance.android.livesdk.chatroom.interact.p318g;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.g.e */
public final class C5385e implements C2888b<C5382c> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m12188a(gVar);
    }

    /* renamed from: a */
    public static C5382c m12188a(C2895g gVar) throws Exception {
        C5382c cVar = new C5382c();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cVar.f14331a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        cVar.f14332b = C2896h.m8231b(gVar);
                        break;
                    case 3:
                        cVar.f14333c = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        cVar.f14334d = C2896h.m8231b(gVar);
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
