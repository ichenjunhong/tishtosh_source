package com.bytedance.android.livesdk.chatroom.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.ba */
public final class C5739ba implements C2888b<C5710ac> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m12619a(gVar);
    }

    /* renamed from: a */
    public static C5710ac m12619a(C2895g gVar) throws Exception {
        C5710ac acVar = new C5710ac();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        acVar.f15009a = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        acVar.f15010b = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return acVar;
            }
        }
    }
}
