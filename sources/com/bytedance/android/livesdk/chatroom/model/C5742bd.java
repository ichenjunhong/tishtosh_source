package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.bd */
public final class C5742bd implements C2888b<C5714ag> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m12622a(gVar);
    }

    /* renamed from: a */
    public static C5714ag m12622a(C2895g gVar) throws Exception {
        C5714ag agVar = new C5714ag();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        agVar.f15017a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        agVar.f15018b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        agVar.f15020d = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        agVar.f15019c = C2896h.m8234e(gVar);
                        break;
                    case 5:
                        agVar.f15021e = C2896h.m8234e(gVar);
                        break;
                    case 6:
                        agVar.f15022f = C2896h.m8234e(gVar);
                        break;
                    case 7:
                        agVar.f15023g = C2896h.m8234e(gVar);
                        break;
                    case 8:
                        agVar.f15024h = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        agVar.f15025i = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return agVar;
            }
        }
    }
}
