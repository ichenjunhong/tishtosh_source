package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.bb */
public final class C5740bb implements C2888b<C5712ae> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m12620a(gVar);
    }

    /* renamed from: a */
    public static C5712ae m12620a(C2895g gVar) throws Exception {
        C5712ae aeVar = new C5712ae();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aeVar.f15013a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        aeVar.f15014b = C2896h.m8230a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return aeVar;
            }
        }
    }
}
