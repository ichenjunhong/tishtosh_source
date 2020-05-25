package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.ax */
public final class C5735ax implements C2888b<C5738b> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m12616a(gVar);
    }

    /* renamed from: a */
    public static C5738b m12616a(C2895g gVar) throws Exception {
        C5738b bVar = new C5738b();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        bVar.f15093a = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        bVar.f15095c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        bVar.f15096d = C2896h.m8230a(gVar);
                        break;
                    case 4:
                        bVar.f15094b = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return bVar;
            }
        }
    }
}
