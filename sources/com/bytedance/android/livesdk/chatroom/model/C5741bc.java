package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.bc */
public final class C5741bc implements C2888b<C5713af> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m12621a(gVar);
    }

    /* renamed from: a */
    public static C5713af m12621a(C2895g gVar) throws Exception {
        C5713af afVar = new C5713af();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        if (afVar.f15016b == null) {
                            afVar.f15016b = new ArrayList();
                        }
                        afVar.f15016b.add(C5740bb.m12620a(gVar));
                        break;
                    case 2:
                        afVar.f15015a = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return afVar;
            }
        }
    }
}
